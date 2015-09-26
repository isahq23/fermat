package com.bitdubai.fermat_android_api.layer.definition.wallet.interfaces;


import com.bitdubai.fermat_api.layer.dmp_middleware.wallet_settings.interfaces.WalletSettings;
import com.bitdubai.fermat_api.layer.dmp_module.wallet_manager.interfaces.InstalledWallet;
import com.bitdubai.fermat_api.layer.dmp_network_service.wallet_resources.WalletResourcesProviderManager;
import com.bitdubai.fermat_api.layer.dmp_wallet_module.crypto_wallet.interfaces.CryptoWalletManager;
import com.bitdubai.fermat_pip_api.layer.pip_platform_service.error_manager.ErrorManager;

/**
 * Created by Matias Furszyfer on 2015.07.20..
 */
public interface WalletSession {

    /**
     *
     * @return
     */
    public InstalledWallet getWalletSessionType();

    /**
     *
     * @param key
     * @param object
     */
    public void setData (String key,Object object);

    /**
     *
     * @param key
     * @return
     */
    public Object getData (String key);

    /**
     *
     * @return
     */
    public ErrorManager getErrorManager();

    /**
     *
     * @return
     */
    public WalletResourcesProviderManager getWalletResourcesProviderManager();

    /**
     *
     */
    public WalletSettings getWalletSettings();


}
