package com.bitdubai.fermat_ccp_api.layer.identity.intra_user.interfaces;

import com.bitdubai.fermat_api.layer.all_definition.identities.ActiveIdentity;
import com.bitdubai.fermat_api.layer.modules.common_classes.ActorIdentityInformation;
import com.bitdubai.fermat_ccp_api.layer.identity.intra_user.exceptions.CantSetNewProfileImageException;

/**
 * The interface <code>IntraWalletUser</code>
 * defines the methods related to the extraction of the information of an intra user
 */
public interface IntraWalletUserIdentity extends ActorIdentityInformation {

    /**
     * The method <code>getAlias</code> returns the alias of the represented intra user
     *
     * @return the alias of the represented intra user
     */
    String getAlias();

    /**
     * The method <code>getPhrase</code> returns the phrase created by the intra user
     * @return string phrase object
     */

    String getPhrase();

    /**
     * The method <code>getPublicKey</code> returns the public key of the represented intra user
     * @return the public key of the represented intra user
     */
    String getPublicKey();

    /**
     * The method <code>getProfileImage</code> gives us the profile image of the represented intra user
     * @return the profile image of the represented intra user
     */
    byte[] getProfileImage();

    /**
     * The method <code>setNewProfileImage</code> let the user set a new profile image
     *
     * @param newProfileImage the new profile image to set
     * @throws CantSetNewProfileImageException
     */
    void setNewProfileImage(byte[] newProfileImage);

    /**
     * This method let an intra user sign a message with his unique private key
     * @param message the message to sign
     * @return the signature
     * @throws com.bitdubai.fermat_ccp_api.layer.identity.intra_user.exceptions.CantSignIntraWalletUserMessageException
     */
    String createMessageSignature(String message);
}
