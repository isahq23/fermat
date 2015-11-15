package com.bitdubai.fermat_api.layer.all_definition.navigation_structure.enums;

import com.bitdubai.fermat_api.layer.all_definition.enums.FermatFragments;
import com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException;

/**
 * Created by rodrigo on 2015.07.20..
 */
public enum Fragments implements FermatFragments {
    CWP_SHELL_LOGIN("CSL"),
    CWP_WALLET_MANAGER_MAIN("CWMM"),
    CWP_SUB_APP_DEVELOPER("CSAD"),
    CWP_WALLET_MANAGER_SHOP("CWMS"),
    CWP_SHOP_MANAGER_MAIN("CSMM"),
    CWP_SHOP_MANAGER_FREE("CSMF"),
    CWP_SHOP_MANAGER_PAID("CSMP"),
    CWP_SHOP_MANAGER_ACCEPTED_NEARBY("CSMAN"),

    CWP_WALLET_PUBLISHER_MAIN_FRAGMENT("CWPMF"),

    // Wallet Store
    CWP_WALLET_STORE_MAIN_ACTIVITY("CWPWSMA"),
    CWP_WALLET_STORE_DETAIL_ACTIVITY("CWPWSDA"),
    CWP_WALLET_STORE_MORE_DETAIL_ACTIVITY("CWPWSMDA"),

    // usados por la sub app intra user de Matias
    CWP_WALLET_STORE_ACCEPTED_NEARBY_FRAGMENT("CWSANF"),
    CWP_WALLET_STORE_ALL_FRAGMENT("CWSAF"),
    CWP_WALLET_STORE_FREE_FRAGMENT("CWSFF"),
    CWP_WALLET_STORE_PAID_FRAGMENT("CWSPF"),
    CWP_WALLET_STORE_SEARCH_MODE("CWSSM"),

    DAP_SUB_APP_ASSET_FACTORY_MAIN_ACTIVITY("DSAAFMA"),
    DAP_SUB_APP_ASSET_EDITOR_ACTIVITY("DSAAEA"),
    DAP_ASSET_ISSUER_COMMUNITY_ACTIVITY_MAIN("DAPAICAM"),
    DAP_ASSET_USER_COMMUNITY_ACTIVITY_MAIN("DAPAUCAM"),
    DAP_ASSET_REDEEM_POINT_COMMUNITY_ACTIVITY_MAIN("DAPARPCAM"),

    CWP_WALLET_DEVELOPER_TOOL_DATABASE_LIST_FRAGMENT("CWDTDLF"),
    CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_LIST_FRAGMENT("CWDTDTLF"),
    CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_RECORD_LIST_FRAGMENT("CWDTDTRLF"),
    CWP_WALLET_DEVELOPER_TOOL_DATABASE_FRAGMENT("CWDTDF"),
    CWP_WALLET_DEVELOPER_TOOL_LOG_FRAGMENT("CWDTLF"),
    CWP_WALLET_DEVELOPER_TOOL_LOG_LEVEL_1_FRAGMENT("CWDTLL1F"),
    CWP_WALLET_DEVELOPER_TOOL_LOG_LEVEL_2_FRAGMENT("CWDTLL2F"),
    CWP_WALLET_DEVELOPER_TOOL_LOG_LEVEL_3_FRAGMENT("CWDTLL3F"),

    /**
     * REFERENCE WALLET
     */

    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_SEND("CWRWBTCABS"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_BALANCE("CWRWBTCABB"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_RECEIVE("CWRWBTCABR"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_TRANSACTIONS("CWRWBTCABT"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_CONTACTS("CWRWBTCABC"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_DETAIL_CONTACTS("CWRWBABDC"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_CREATE_CONTACTS("CWRWBABCC"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_MONEY_REQUEST("CWRWBTCABMR"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_TRANSACTIONS_BOOK("CWRWBTCABTB"),
    CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_TRANSACTIONS_AVAILABLE("CWRWBTCABTA"),

    CCP_BITCOIN_WALLET_TRANSACTIONS_SENT("CCPBWTS"),
    CCP_BITCOIN_WALLET_TRANSACTIONS_RECEIVED("CCPBWTR"),
    CCP_BITCOIN_WALLET_REQUEST_RECEIVED("CCPBWRR"),
    CCP_BITCOIN_WALLET_REQUEST_SEND("CCPBWRS"),
    CCP_BITCOIN_WALLET_TRANSACTIONS_SENT_HISTORY("CCPBWTSH"),
    CCP_BITCOIN_WALLET_TRANSACTIONS_RECEIVED_HISTORY("CCPBWTRH"),
    CCP_BITCOIN_WALLET_REQUEST_SENT_HISTORY("CCPBWRSH"),
    CCP_BITCOIN_WALLET_REQUEST_RECEIVED_HISTORY("CCPBWRRH"),

    CCP_BITCOIN_WALLET_SEND_FORM_FRAGMENT("CPPBWSFF"),
    CCP_BITCOIN_WALLET_REQUEST_FORM_FRAGMENT("CCPBWRFF"),
    CCP_BITCOIN_WALLET_SETTINGS_FRAGMENT("CCPBWSF"),

    /**
     * END REFERENCE
     */

    CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_PROFILE("CWRWAKABP"),
    CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_DESKTOP("CWRWAKABD"),
    CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_CONTACTS("CWRWAKABC"),
    CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_COMMUNITY("CWRWAKABCT"),

    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_HOME("CWRWAABH"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_BALANCE("CWRWAABB"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SEND("CWRWAABS"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_RECEIVE("CWRWAABR"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOPS("CWRWAABSS"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_REFFIL("CWRWAABRF"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_DISCOUNTS("CWRWAABD"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_SHOP("CWRWAABSHS"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_PRODUCTS("CWRWAABSHP"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_REVIEWS("CWRWAABSHR"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_CHAT("CWRWAABSHC"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_HISTORY("CWRWAABSHH"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_MAP("CWRWAABSHM"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_ACCOUNTS_DEBITS("CWRWAABAD"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_ACCOUNT_CREDITS("CWRWAABAC"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_ACCOUNTS_ALL("CWRWAABAA"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_CHAT("CWRWAABCC"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS("CWRWAABC"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_SEND("CWRWAABCS"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_NEW_SEND("CWRWAABCNS"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_RECEIVE("CWRWAABCR"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_NEW_RECEIVE("CWRWAABCNR"),
    CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CHAT_TRX("CWRWAABCTX"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_AVAILABLE_BALANCE("CWRAAAB"),

    CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED("CWAARR"),
    CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED_HISTORY("CWAARRH"),
    CWP_WALLET_ADULTS_ALL_REQUEST_SEND("CWAARS"),
    CWP_WALLET_ADULTS_ALL_SEND_HISTORY("CWAASH"),
    CWP_WALLET_ADULTS_ALL_DAILY_DISCOUNT("CWAADD"),
    CWP_WALLET_ADULTS_ALL_WEEKLY_DISCOUNT("CWAAWD"),
    CWP_WALLET_ADULTS_ALL_MONTHLY_DISCOUNT("CWAAMD"),

    CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS_DATABASES("CSADDTD"),
    CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS_TABLES("CSADDTT"),
    CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS_RECORDS("CSADDTR"),
    CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS("CSADDT"),
    CWP_SUB_APP_DEVELOPER_LOG_TOOLS("CSADLT"),
    CWP_SUB_APP_DEVELOPER_LOG_LEVEL_1_TOOLS("CSADLL1T"),
    CWP_SUB_APP_DEVELOPER_LOG_LEVEL_2_TOOLS("CSADLL2T"),
    CWP_SUB_APP_DEVELOPER_LOG_LEVEL_3_TOOLS("CSADLL3T"),

    CWP_WALLET_PUBLISHER_MAIN("CWPM"),

    DAP_WALLET_ASSET_ISSUER_MAIN_ACTIVITY("DWAIMA"),
    DAP_WALLET_ASSET_USER_MAIN_ACTIVITY("DWUIMA"),
    DAP_WALLET_REDEEM_POINT_MAIN_ACTIVITY("DWRPMA"),


    /**
     * WAllet factory
     */
    CWP_WALLET_FACTORY_DEVELOPER_PROJECTS("CWFDP"),
    CWP_WALLET_FACTORY_AVAILABLE_PROJECTS("CWFAP"),

    CWP_WALLET_FACTORY_WIZARD_CREATE_STEP_1("CWFWCS1"),
    CWP_WALLET_FACTORY_WIZARD_CREATE_STEP_2("CWFWCS2"),

    // Crypto Broker Wallet
    CBP_CRYPTO_BROKER_WALLET_OPEN_NEGOTIATIONS_TAB("CBPCBWHAONT"),
    CBP_CRYPTO_BROKER_WALLET_OPEN_CONTRACTS_TAB("CBPCBWHAOCT"),
    CBP_CRYPTO_BROKER_WALLET_MARKET_RATE_STATISTICS("CBPCBWMRS"),
    CBP_CRYPTO_BROKER_WALLET_STOCK_STATISTICS("CBPCBWHASS"),
    CBP_CRYPTO_BROKER_WALLET_OPEN_NEGOTIATION_DETAILS("CBPCBWOND"),
    CBP_CRYPTO_BROKER_WALLET_CLOSE_NEGOTIATION_DETAILS("CBPCBWCND"),
    CBP_CRYPTO_BROKER_WALLET_OPEN_CONTRACT_DETAILS("CBPCBWOCD"),
    CBP_CRYPTO_BROKER_WALLET_CLOSE_CONTRACT_DETAILS("CBPCBWCCD"),
    CBP_CRYPTO_BROKER_WALLET_CONTRACTS_HISTORY("CBPCBWCH"),
    CBP_CRYPTO_BROKER_WALLET_EARNINGS("CBPCBWE"),
    CBP_CRYPTO_BROKER_WALLET_SETTINGS("CBPCBWS"),

    // Crypto Customer Wallet
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_NEGOTIATIONS_TAB("CBPCCWHAONT"),
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_CONTRACTS_TAB("CBPCCWHAOCT"),
    CBP_CRYPTO_CUSTOMER_WALLET_MARKET_RATE_STATISTICS("CBPCCWMRS"),
    CBP_CRYPTO_CUSTOMER_WALLET_START_NEGOTIATION("CBPCCWSN"),
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_NEGOTIATION_DETAILS("CBPCCWOND"),
    CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_NEGOTIATION_DETAILS("CBPCCWCND"),
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_CONTRACT_DETAILS("CBPCCWOCD"),
    CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_CONTRACT_DETAILS("CBPCCWCCD"),
    CBP_CRYPTO_CUSTOMER_WALLET_CONTRACTS_HISTORY("CBPCCWCH"),
    CBP_CRYPTO_CUSTOMER_WALLET_BROKER_LIST("CBPCCWBL"),
    CBP_CRYPTO_CUSTOMER_WALLET_SETTINGS("CBPCCWS"),

    // Crypto Broker Identity
    CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_MAIN_FRAGMENT("CBPSACBIMF"),
    CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_CREATE_IDENTITY_FRAGMENT("CBPSACBICIF"),
    CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_EDIT_IDENTITY_FRAGMENT("CBPSACBIEIF"),

    // Crypto Customer Identity
    CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_MAIN_FRAGMENT("CBPSACCIMF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_CREATE_IDENTITY_FRAGMENT("CBPSACCICIF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_EDIT_IDENTITY_FRAGMENT("CBPSACCIEIF"),

    // CCP Identity
    CCP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_MAIN_FRAGMENT("CCPSACCIMF"),
    CCP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_CREATE_IDENTITY_FRAGMENT("CCPSACCICIF"),

    // DAP Issuer Identity
    DAP_SUB_APP_ASSET_ISSUER_IDENTITY_MAIN_FRAGMENT("DSAAIIMF"),
    DAP_SUB_APP_ASSET_ISSUER_IDENTITY_CREATE_IDENTITY_FRAGMENT("DSAAIICIF"),

    // DAP User Identity
    DAP_SUB_APP_ASSET_USER_IDENTITY_MAIN_FRAGMENT("DAPSAAUIMF"),
    DAP_SUB_APP_ASSET_USER_IDENTITY_CREATE_IDENTITY_FRAGMENT("DAPSAAUICIF"),

    // DAP REDEEM POINT IDENTITY
    DAP_SUB_APP_REDEEM_POINT_IDENTITY_MAIN_FRAGMENT("DAPSARPIMF"),
    DAP_SUB_APP_REDEEM_POINT_IDENTITY_CREATE_IDENTITY_FRAGMENT("DAPSARPICIF"),
    // CCP Community
    CCP_SUB_APP_INTRA_USER_COMMUNITY_FRAGMENT("CCPSAIUCF"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTIONS_FRAGMENT("CCPSAIUCCF"),;


    private String code;

    Fragments(String code) {
        this.code = code;
    }

    public static Fragments getValueFromString(String code) throws InvalidParameterException {
        /*for (Fragments fragments : Fragments.values()) {
            if (fragments.key.equals(name)) {
                return fragments;
            }
        }*/
//        switch (code) {
//            case "CSL":
//                return Fragments.CWP_SHELL_LOGIN;
//            case "CWMM":
//                return Fragments.CWP_WALLET_MANAGER_MAIN;
//            case "CSAD":
//                return Fragments.CWP_SUB_APP_DEVELOPER;
//            case "CWMS":
//                return Fragments.CWP_WALLET_MANAGER_SHOP;
//            case "CSMM":
//                return Fragments.CWP_SHOP_MANAGER_MAIN;
//            case "CSMF":
//                return Fragments.CWP_SHOP_MANAGER_FREE;
//            case "CSMP":
//                return Fragments.CWP_SHOP_MANAGER_PAID;
//            case "CSMAN":
//                return Fragments.CWP_SHOP_MANAGER_ACCEPTED_NEARBY;
//            case "CWRWBTCABS":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_SEND;
//            case "CWRWBTCABB":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_BALANCE;
//            case "CWRWBTCABR":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_RECEIVE;
//            case "CWRWBTCABT":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_TRANSACTIONS;
//            case "CWRWBTCABC":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_CONTACTS;
//            case "CWRWAKABP":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_PROFILE;
//            case "CWRWAKABD":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_DESKTOP;
//            case "CWRWAKABC":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_CONTACTS;
//            case "CWRWAKABCT":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_COMMUNITY;
//            case "CWRWAABH":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_HOME;
//            case "CWRWAABB":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_BALANCE;
//            case "CWRWAABS":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SEND;
//            case "CWRWAABR":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_RECEIVE;
//            case "CWRWAABSS":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOPS;
//            case "CWRWAABRF":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_REFFIL;
//            case "CWRWAABD":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_DISCOUNTS;
//            case "CWRWAABSHS":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_SHOP;
//            case "CWRWAABSHP":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_PRODUCTS;
//            case "CWRWAABSHR":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_REVIEWS;
//            case "CWRWAABSHC":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_CHAT;
//            case "CWRWAABSHH":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_HISTORY;
//            case "CWRWAABSHM":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_SHOP_MAP;
//            case "CWRWAABAD":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_ACCOUNTS_DEBITS;
//            case "CWRWAABAC":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_ACCOUNT_CREDITS;
//            case "CWRWAABAA":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_ACCOUNTS_ALL;
//            case "CWRWAABCC":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_CHAT;
//            case "CWRWAABC":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS;
//            case "CWRWAABCS":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_SEND;
//            case "CWRWAABCNS":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_NEW_SEND;
//            case "CWRWAABCR":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_RECEIVE;
//            case "CWRWAABCNR":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CONTACTS_NEW_RECEIVE;
//            case "CWRWAABCTX":
//                return Fragments.CWP_WALLET_RUNTIME_WALLET_ADULTS_ALL_BITDUBAI_CHAT_TRX;
//            case "CWRAAAB":
//                return Fragments.CWP_WALLET_RUNTIME_ADULTS_ALL_AVAILABLE_BALANCE;
//            case "CWAARR":
//                return Fragments.CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED;
//            case "CWAARRH":
//                return Fragments.CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED_HISTORY;
//            case "CWAARS":
//                return Fragments.CWP_WALLET_ADULTS_ALL_REQUEST_SEND;
//            case "CWAASH":
//                return Fragments.CWP_WALLET_ADULTS_ALL_SEND_HISTORY;
//            case "CWAADD":
//                return Fragments.CWP_WALLET_ADULTS_ALL_DAILY_DISCOUNT;
//            case "CWAAWD":
//                return Fragments.CWP_WALLET_ADULTS_ALL_WEEKLY_DISCOUNT;
//            case "CWAAMD":
//                return Fragments.CWP_WALLET_ADULTS_ALL_MONTHLY_DISCOUNT;
//            case "CSADDTD":
//                return Fragments.CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS_DATABASES;
//            case "CSADDTT":
//                return Fragments.CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS_TABLES;
//            case "CSADDTR":
//                return Fragments.CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS_RECORDS;
//            case "CSADDT":
//                return Fragments.CWP_SUB_APP_DEVELOPER_DATABASE_TOOLS;
//            case "CSADLT":
//                return Fragments.CWP_SUB_APP_DEVELOPER_LOG_TOOLS;
//            case "CSADLL1T":
//                return Fragments.CWP_SUB_APP_DEVELOPER_LOG_LEVEL_1_TOOLS;
//            case "CSADLL2T":
//                return Fragments.CWP_SUB_APP_DEVELOPER_LOG_LEVEL_2_TOOLS;
//            case "CSADLL3T":
//                return Fragments.CWP_SUB_APP_DEVELOPER_LOG_LEVEL_3_TOOLS;
//            case "CWSM":
//                return Fragments.CWP_WALLET_STORE_MAIN;
//            case "CWPM":
//                return Fragments.CWP_WALLET_PUBLISHER_MAIN;
//            case "CWDTDLF":
//                return CWP_WALLET_DEVELOPER_TOOL_DATABASE_LIST_FRAGMENT;
//            case "CWDTDTLF":
//                return CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_LIST_FRAGMENT;
//            case "CWDTDTRLF":
//                return CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_RECORD_LIST_FRAGMENT;
//            case "CWDTDF":
//                return CWP_WALLET_DEVELOPER_TOOL_DATABASE_FRAGMENT;
//            case "CWDTLF":
//                return CWP_WALLET_DEVELOPER_TOOL_LOG_FRAGMENT;
//            case "CWDTLL1F":
//                return CWP_WALLET_DEVELOPER_TOOL_LOG_LEVEL_1_FRAGMENT;
//            case "CWDTLL2F":
//                return CWP_WALLET_DEVELOPER_TOOL_LOG_LEVEL_2_FRAGMENT;
//            case "CWDTLL3F":
//                return CWP_WALLET_DEVELOPER_TOOL_LOG_LEVEL_3_FRAGMENT;
//
//            case "CWRWBTCABTB":
//                return CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_TRANSACTIONS_BOOK;
//
//            case "CWRWBTCABTA":
//                return CWP_WALLET_RUNTIME_WALLET_BITCOIN_ALL_BITDUBAI_TRANSACTIONS_AVAILABLE;
//            case "DWAIMA":
//                return DAP_WALLET_ASSET_ISSUER_MAIN_ACTIVITY;
//            case "DSAAFMA":
//                return DAP_SUB_APP_ASSET_FACTORY_MAIN_ACTIVITY;
//            case "CCPBWTS":
//                return CCP_BITCOIN_WALLET_TRANSACTIONS_SENT;
//            case "CCPBWTR":
//                return CCP_BITCOIN_WALLET_TRANSACTIONS_RECEIVED;
//            case "CCPBWRR":
//                return CCP_BITCOIN_WALLET_REQUEST_RECEIVED;
//            case "CCPBWRS":
//                return CCP_BITCOIN_WALLET_REQUEST_SEND;
//            default:
//                throw new InvalidParameterException(InvalidParameterException.DEFAULT_MESSAGE, null, "Code Received: " + code, "This Code Is Not Valid for the Plugins enum");
//        }
        for (Fragments fragments : Fragments.values()) {
            if (fragments.code.equals(code)) {
                return fragments;
            }
        }
        return null;

        // throw an IllegalArgumentException or return null
        // throw new IllegalArgumentException("the given number doesn't match any Status.");
        //return null;
    }

    public String getKey() {
        return this.code;
    }

    public String getStringValue() {
        return this.code;
    }

    public String toString() {
        return code;
    }
}
