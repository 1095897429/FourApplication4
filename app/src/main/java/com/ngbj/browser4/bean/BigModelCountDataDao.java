package com.ngbj.browser4.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BIG_MODEL_COUNT_DATA".
*/
public class BigModelCountDataDao extends AbstractDao<BigModelCountData, Long> {

    public static final String TABLENAME = "BIG_MODEL_COUNT_DATA";

    /**
     * Properties of entity BigModelCountData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Module_id = new Property(1, int.class, "module_id", false, "MODULE_ID");
        public final static Property Click_num = new Property(2, int.class, "click_num", false, "CLICK_NUM");
        public final static Property Click_user_num = new Property(3, int.class, "click_user_num", false, "CLICK_USER_NUM");
        public final static Property BigModelShowName = new Property(4, String.class, "bigModelShowName", false, "BIG_MODEL_SHOW_NAME");
        public final static Property Type = new Property(5, int.class, "type", false, "TYPE");
    };


    public BigModelCountDataDao(DaoConfig config) {
        super(config);
    }
    
    public BigModelCountDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BIG_MODEL_COUNT_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"MODULE_ID\" INTEGER NOT NULL ," + // 1: module_id
                "\"CLICK_NUM\" INTEGER NOT NULL ," + // 2: click_num
                "\"CLICK_USER_NUM\" INTEGER NOT NULL ," + // 3: click_user_num
                "\"BIG_MODEL_SHOW_NAME\" TEXT," + // 4: bigModelShowName
                "\"TYPE\" INTEGER NOT NULL );"); // 5: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BIG_MODEL_COUNT_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BigModelCountData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getModule_id());
        stmt.bindLong(3, entity.getClick_num());
        stmt.bindLong(4, entity.getClick_user_num());
 
        String bigModelShowName = entity.getBigModelShowName();
        if (bigModelShowName != null) {
            stmt.bindString(5, bigModelShowName);
        }
        stmt.bindLong(6, entity.getType());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BigModelCountData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getModule_id());
        stmt.bindLong(3, entity.getClick_num());
        stmt.bindLong(4, entity.getClick_user_num());
 
        String bigModelShowName = entity.getBigModelShowName();
        if (bigModelShowName != null) {
            stmt.bindString(5, bigModelShowName);
        }
        stmt.bindLong(6, entity.getType());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BigModelCountData readEntity(Cursor cursor, int offset) {
        BigModelCountData entity = new BigModelCountData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // module_id
            cursor.getInt(offset + 2), // click_num
            cursor.getInt(offset + 3), // click_user_num
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // bigModelShowName
            cursor.getInt(offset + 5) // type
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BigModelCountData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setModule_id(cursor.getInt(offset + 1));
        entity.setClick_num(cursor.getInt(offset + 2));
        entity.setClick_user_num(cursor.getInt(offset + 3));
        entity.setBigModelShowName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BigModelCountData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BigModelCountData entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
