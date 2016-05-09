package org.fermat.fermat_dap_plugin.layer.wallet.asset.user.developer.version_1.structure.database;

import com.bitdubai.fermat_api.FermatException;
import com.bitdubai.fermat_api.layer.osa_android.database_system.Database;
import com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseDataType;
import com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseFactory;
import com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableFactory;
import com.bitdubai.fermat_api.layer.osa_android.database_system.PluginDatabaseSystem;
import com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantCreateDatabaseException;
import com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantCreateTableException;
import com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.InvalidOwnerIdException;

import java.util.UUID;

/**
 * Created by franklin on 05/10/15.
 */
public class AssetUserWalletDatabaseFactory {
    /**
     * DealsWithPluginDatabaseSystem Interface member variables.
     */
    private PluginDatabaseSystem pluginDatabaseSystem;

    public AssetUserWalletDatabaseFactory(PluginDatabaseSystem pluginDatabaseSystem) {
        this.pluginDatabaseSystem = pluginDatabaseSystem;
    }

    public Database createDatabase(UUID ownerId, UUID walletId) throws CantCreateDatabaseException {
        Database database = null;
        try {
            database = this.pluginDatabaseSystem.createDatabase(ownerId, walletId.toString());
            createAssetUserWalletTable(ownerId, database.getDatabaseFactory());
            createAssetUserWalletBalancesTable(ownerId, database.getDatabaseFactory());
            createMetadataLockTable(ownerId, database.getDatabaseFactory());
            createAddressesTable(ownerId, database.getDatabaseFactory());
            //insertInitialBalancesRecord(database);

            return database;
        } catch (CantCreateTableException exception) {
            //catch(CantCreateTableException | CantInsertRecordException exception){
            throw new CantCreateDatabaseException(CantCreateDatabaseException.DEFAULT_MESSAGE, exception, null, "Check the cause");
        } catch (CantCreateDatabaseException exception) {
            throw exception;
        } catch (Exception exception) {
            throw new CantCreateDatabaseException(CantCreateDatabaseException.DEFAULT_MESSAGE, FermatException.wrapException(exception), null, null);
        }
    }

    private void createAssetUserWalletTable(final UUID ownerId, final DatabaseFactory databaseFactory) throws CantCreateTableException {
        try {
            DatabaseTableFactory tableFactory = createAssetUserWalletTableFactory(ownerId, databaseFactory);
            databaseFactory.createTable(tableFactory);
        } catch (InvalidOwnerIdException exception) {
            throw new CantCreateTableException(CantCreateTableException.DEFAULT_MESSAGE, exception, null, "The ownerId of the database factory didn't match with the given owner id");
        }
    }

    private void createAssetUserWalletBalancesTable(final UUID ownerId, final DatabaseFactory databaseFactory) throws CantCreateTableException {
        try {
            DatabaseTableFactory tableFactory = createAssetUserWalletBalanceTableFactory(ownerId, databaseFactory);
            databaseFactory.createTable(tableFactory);
        } catch (InvalidOwnerIdException exception) {
            throw new CantCreateTableException(CantCreateTableException.DEFAULT_MESSAGE, exception, null, "The ownerId of the database factory didn't match with the given owner id");
        }
    }

    private void createMetadataLockTable(final UUID ownerId, final DatabaseFactory databaseFactory) throws CantCreateTableException {
        try {
            DatabaseTableFactory tableFactory = createMetadataLockTableFactory(ownerId, databaseFactory);
            databaseFactory.createTable(tableFactory);
        } catch (InvalidOwnerIdException exception) {
            throw new CantCreateTableException(CantCreateTableException.DEFAULT_MESSAGE, exception, null, "The ownerId of the database factory didn't match with the given owner id");
        }
    }

    private void createAddressesTable(final UUID ownerId, final DatabaseFactory databaseFactory) throws CantCreateTableException {
        try {
            DatabaseTableFactory tableFactory = createAddressesTableFactory(ownerId, databaseFactory);
            databaseFactory.createTable(tableFactory);
        } catch (InvalidOwnerIdException exception) {
            throw new CantCreateTableException(CantCreateTableException.DEFAULT_MESSAGE, exception, null, "The ownerId of the database factory didn't match with the given owner id");
        }
    }

    private DatabaseTableFactory createAssetUserWalletTableFactory(final UUID ownerId, final DatabaseFactory databaseFactory) throws InvalidOwnerIdException {
        DatabaseTableFactory table = databaseFactory.newTableFactory(ownerId, AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_TABLE_NAME);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_TABLE_ID_COLUMN_NAME, DatabaseDataType.STRING, 36, true);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ASSET_PUBLIC_KEY_COLUMN_NAME, DatabaseDataType.STRING, 255, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ASSET_CRYPTO_ADDRESS_COLUMN_NAME, DatabaseDataType.STRING, 255, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_AMOUNT_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_VERIFICATION_ID_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESS_FROM_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESS_TO_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ACTOR_FROM_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ACTOR_TO_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ACTOR_FROM_TYPE_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ACTOR_TO_TYPE_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_TYPE_COLUMN_NAME, DatabaseDataType.STRING, 20, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TYPE_COLUMN_NAME, DatabaseDataType.STRING, 20, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_TIME_STAMP_COLUMN_NAME, DatabaseDataType.STRING, 30, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_MEMO_COLUMN_NAME, DatabaseDataType.STRING, 200, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_TRANSACTION_HASH_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_RUNNING_BOOK_BALANCE_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_RUNNING_AVAILABLE_BALANCE_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);


        return table;
    }

    private DatabaseTableFactory createAssetUserWalletBalanceTableFactory(final UUID ownerId, final DatabaseFactory databaseFactory) throws InvalidOwnerIdException {
        DatabaseTableFactory table = databaseFactory.newTableFactory(ownerId, AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_NAME);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_ASSET_PUBLIC_KEY_COLUMN_NAME, DatabaseDataType.STRING, 255, true);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_NAME_COLUMN_NAME, DatabaseDataType.STRING, 100, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_DESCRIPTION_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_AVAILABLE_BALANCE_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_BOOK_BALANCE_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_QUANTITY_AVAILABLE_BALANCE_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_BALANCE_TABLE_QUANTITY_BOOK_BALANCE_COLUMN_NAME, DatabaseDataType.LONG_INTEGER, 0, false);
        return table;
    }

    private DatabaseTableFactory createMetadataLockTableFactory(final UUID ownerId, final DatabaseFactory databaseFactory) throws InvalidOwnerIdException {
        DatabaseTableFactory table = databaseFactory.newTableFactory(ownerId, AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_METADATA_LOCK_TABLE_NAME);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_METADATA_LOCK_METADATA_ID_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_METADATA_LOCK_GENESIS_TX_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_METADATA_LOCK_STATUS_COLUMN_NAME, DatabaseDataType.STRING, 15, false);
        return table;
    }

    private DatabaseTableFactory createAddressesTableFactory(final UUID ownerId, final DatabaseFactory databaseFactory) throws InvalidOwnerIdException {
        DatabaseTableFactory table = databaseFactory.newTableFactory(ownerId, AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESSES_TABLE_NAME);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESSES_ID_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESSES_ASSET_PUBLICKEY_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESSES_CRYPTO_ADDRESS_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESSES_CRYPTO_CURRENCY_COLUMN_NAME, DatabaseDataType.STRING, 150, false);
        table.addColumn(AssetUserWalletDatabaseConstant.ASSET_WALLET_USER_ADDRESSES_AVAILABLE_COLUMN_NAME, DatabaseDataType.STRING, 15, false);
        return table;
    }

}
