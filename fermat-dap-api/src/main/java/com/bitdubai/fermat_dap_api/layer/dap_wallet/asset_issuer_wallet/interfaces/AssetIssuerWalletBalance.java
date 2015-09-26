package com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.interfaces;

import com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantCalculateBalanceException;
import com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantRegisterCreditException;
import com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantRegisterDebitException;

/**
 * Created by franklin on 04/09/15.
 */
public interface AssetIssuerWalletBalance {

    //TODO: Documentar
    long getBalance()  throws CantCalculateBalanceException;

    void debit(AssetIssuerWalletTransactionRecord assetIssuerWalletTransactionRecord) throws CantRegisterDebitException; //TODO: Debemos de definir la estructura de la transaccion

    void credit(AssetIssuerWalletTransactionRecord assetIssuerWalletTransactionRecord)  throws CantRegisterCreditException; //TODO: Debemos de definir la estructura de la transaccion
}
