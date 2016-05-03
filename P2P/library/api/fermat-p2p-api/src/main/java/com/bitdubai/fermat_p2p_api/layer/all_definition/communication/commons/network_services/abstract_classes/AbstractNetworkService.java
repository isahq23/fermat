package com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.network_services.abstract_classes;

import com.bitdubai.fermat_api.CantStartPluginException;
import com.bitdubai.fermat_api.layer.all_definition.common.system.abstract_classes.AbstractPlugin;
import com.bitdubai.fermat_api.layer.all_definition.common.system.annotations.NeededAddonReference;
import com.bitdubai.fermat_api.layer.all_definition.common.system.annotations.NeededLayerReference;
import com.bitdubai.fermat_api.layer.all_definition.common.system.utils.PluginVersionReference;
import com.bitdubai.fermat_api.layer.all_definition.crypto.asymmetric.ECCKeyPair;
import com.bitdubai.fermat_api.layer.all_definition.enums.Addons;
import com.bitdubai.fermat_api.layer.all_definition.enums.Layers;
import com.bitdubai.fermat_api.layer.all_definition.enums.Platforms;
import com.bitdubai.fermat_api.layer.all_definition.events.EventSource;
import com.bitdubai.fermat_api.layer.all_definition.events.interfaces.FermatEventListener;
import com.bitdubai.fermat_api.layer.osa_android.database_system.PluginDatabaseSystem;
import com.bitdubai.fermat_api.layer.osa_android.file_system.FileLifeSpan;
import com.bitdubai.fermat_api.layer.osa_android.file_system.FilePrivacy;
import com.bitdubai.fermat_api.layer.osa_android.file_system.PluginFileSystem;
import com.bitdubai.fermat_api.layer.osa_android.file_system.PluginTextFile;
import com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.CantCreateFileException;
import com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.FileNotFoundException;
import com.bitdubai.fermat_api.layer.osa_android.logger_system.LogManager;
import com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.network_services.exceptions.CantInitializeIdentityException;
import com.bitdubai.fermat_p2p_api.layer.all_definition.communication.interfaces.CommunicationLayerManager;
import com.bitdubai.fermat_p2p_api.layer.all_definition.communication.network_services.data_base.CommunicationNetworkServiceDatabaseConstants;
import com.bitdubai.fermat_p2p_api.layer.all_definition.communication.network_services.interfaces.NetworkService;
import com.bitdubai.fermat_pip_api.layer.platform_service.error_manager.enums.UnexpectedPluginExceptionSeverity;
import com.bitdubai.fermat_pip_api.layer.platform_service.error_manager.interfaces.ErrorManager;
import com.bitdubai.fermat_pip_api.layer.platform_service.event_manager.interfaces.EventManager;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The class <code>com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.network_services.abstract_classes.AbstractNetworkService</code>
 * implements the basic functionality of a network service component and define its behavior.<p/>
 *
 * Created by Leon Acosta - (laion.cj91@gmail.com) on 02/05/2016.
 *
 * @author  lnacosta
 * @version 1.0
 * @since   Java JDK 1.7
 */
public abstract class AbstractNetworkService extends AbstractPlugin implements NetworkService {

    @NeededAddonReference(platform = Platforms.PLUG_INS_PLATFORM   , layer = Layers.PLATFORM_SERVICE, addon = Addons.ERROR_MANAGER)
    protected ErrorManager errorManager;

    @NeededAddonReference(platform = Platforms.PLUG_INS_PLATFORM   , layer = Layers.PLATFORM_SERVICE, addon = Addons.EVENT_MANAGER)
    protected EventManager eventManager;

    @NeededAddonReference(platform = Platforms.OPERATIVE_SYSTEM_API, layer = Layers.SYSTEM          , addon = Addons.PLUGIN_DATABASE_SYSTEM)
    protected PluginDatabaseSystem pluginDatabaseSystem;

    @NeededAddonReference(platform = Platforms.OPERATIVE_SYSTEM_API, layer = Layers.SYSTEM          , addon = Addons.PLUGIN_FILE_SYSTEM)
    protected PluginFileSystem pluginFileSystem;

    @NeededAddonReference(platform = Platforms.OPERATIVE_SYSTEM_API, layer = Layers.SYSTEM          , addon = Addons.LOG_MANAGER)
    protected LogManager logManager;

    @NeededLayerReference(platform = Platforms.COMMUNICATION_PLATFORM, layer = Layers.COMMUNICATION)
    protected CommunicationLayerManager communicationLayerManager;

    /**
     * Represent the EVENT_SOURCE
     */
    public EventSource eventSource;

    /**
     * Represent the identity
     */
    private ECCKeyPair identity;

    /**
     * Hold the listeners references
     */
    private List<FermatEventListener> listenersAdded;

    /**
     * Constructor with parameters
     *
     * @param pluginVersionReference
     * @param eventSource
     */
    public AbstractNetworkService(final PluginVersionReference pluginVersionReference,
                                  final EventSource            eventSource           ) {

        super(pluginVersionReference);

        this.eventSource           = eventSource;
        this.listenersAdded        = new CopyOnWriteArrayList<>();
    }

    /**
     * (non-javadoc)
     * @see AbstractPlugin#start()
     */
    @Override
    public final void start() throws CantStartPluginException {

        /*
         * Validate required resources
         */
        validateInjectedResources();

        try {

            /*
             * Initialize the identity
             */
            initializeIdentity();

        } catch (Exception exception) {

            System.out.println(exception.toString());

            String context = "Plugin ID: " + pluginId + CantStartPluginException.CONTEXT_CONTENT_SEPARATOR
                    + "Database Name: " + CommunicationNetworkServiceDatabaseConstants.DATA_BASE_NAME
                    + "NS Name: " + "COMPLETE"; // TODO COMPLETE WITH NETWORK SERVICE NAME

            String possibleCause = "The Template triggered an unexpected problem that wasn't able to solve by itself - ";
            possibleCause += exception.getMessage();
            CantStartPluginException pluginStartException = new CantStartPluginException(CantStartPluginException.DEFAULT_MESSAGE, exception, context, possibleCause);

            errorManager.reportUnexpectedPluginException(this.getPluginVersionReference(), UnexpectedPluginExceptionSeverity.DISABLES_THIS_PLUGIN, pluginStartException);
            throw pluginStartException;

        }
    }

    /**
     * This method validates if there are injected all the required resources
     * in the network service root.
     */
    private void validateInjectedResources() throws CantStartPluginException {

         /*
         * Ask if the resources are injected.
         */
        if (communicationLayerManager == null ||
                pluginDatabaseSystem == null ||
                errorManager == null ||
                eventManager == null) {

            String context =
                    "Plugin ID: " + pluginId
                    + CantStartPluginException.CONTEXT_CONTENT_SEPARATOR
                    + "communicationLayerManager: " + communicationLayerManager
                    + CantStartPluginException.CONTEXT_CONTENT_SEPARATOR
                    + "pluginDatabaseSystem: " + pluginDatabaseSystem
                    + CantStartPluginException.CONTEXT_CONTENT_SEPARATOR
                    + "errorManager: " + errorManager
                    + CantStartPluginException.CONTEXT_CONTENT_SEPARATOR
                    + "eventManager: " + eventManager;

            String possibleCause = "No all required resource are injected";
            CantStartPluginException pluginStartException = new CantStartPluginException(CantStartPluginException.DEFAULT_MESSAGE, null, context, possibleCause);

            errorManager.reportUnexpectedPluginException(this.getPluginVersionReference(), UnexpectedPluginExceptionSeverity.DISABLES_THIS_PLUGIN, pluginStartException);
            throw pluginStartException;
        }

    }

    private static final String IDENTITY_FILE_DIRECTORY = "private"   ;
    private static final String IDENTITY_FILE_NAME      = "nsIdentity";

    /**
     * Initializes a key pair identity for this network service
     *
     * @throws CantInitializeIdentityException if something goes wrong.
     */
    private void initializeIdentity() throws CantInitializeIdentityException {

        try {

             /*
              * Load the file with the network service identity
              */
            PluginTextFile pluginTextFile = pluginFileSystem.getTextFile(pluginId, IDENTITY_FILE_DIRECTORY, IDENTITY_FILE_NAME, FilePrivacy.PRIVATE, FileLifeSpan.PERMANENT);
            String content = pluginTextFile.getContent();

            identity = new ECCKeyPair(content);

        } catch (FileNotFoundException e) {

            /*
             * The file does not exist, maybe it is the first time that the plugin had been run on this device,
             * We need to create the new network service identity
             */
            try {

                /*
                 * Create the new network service identity
                 */
                identity = new ECCKeyPair();

                /*
                 * save into the file
                 */
                PluginTextFile pluginTextFile = pluginFileSystem.createTextFile(pluginId, IDENTITY_FILE_DIRECTORY, IDENTITY_FILE_NAME, FilePrivacy.PRIVATE, FileLifeSpan.PERMANENT);
                pluginTextFile.setContent(identity.getPrivateKey());
                pluginTextFile.persistToMedia();

            } catch (Exception exception) {
                /*
                 * The file cannot be created. We can not handle this situation.
                 */
                errorManager.reportUnexpectedPluginException(this.getPluginVersionReference(), UnexpectedPluginExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_PLUGIN, exception);
                throw new CantInitializeIdentityException(exception, "", "Unhandled Exception");
            }


        } catch (CantCreateFileException cantCreateFileException) {

            /*
             * The file cannot be load. We can not handle this situation.
             */
            errorManager.reportUnexpectedPluginException(this.getPluginVersionReference(), UnexpectedPluginExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_PLUGIN, cantCreateFileException);
            throw new CantInitializeIdentityException(cantCreateFileException, "", "Error creating the identity file.");

        }

    }

}