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
 * DAO for table "COUNT_DATA".
*/
public class CountDataDao extends AbstractDao<CountData, Long> {

    public static final String TABLENAME = "COUNT_DATA";

    /**
     * Properties of entity CountData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ad_id = new Property(1, String.class, "ad_id", false, "AD_ID");
        public final static Property Show_num = new Property(2, int.class, "show_num", false, "SHOW_NUM");
        public final static Property Click_num = new Property(3, int.class, "click_num", false, "CLICK_NUM");
        public final static Property Click_user_num = new Property(4, int.class, "click_user_num", false, "CLICK_USER_NUM");
        public final static Property AdShowName = new Property(5, String.class, "adShowName", false, "AD_SHOW_NAME");
        public final static Property Show_position = new Property(6, String.class, "show_position", false, "SHOW_POSITION");
        public final static Property Img_url = new Property(7, String.class, "img_url", false, "IMG_URL");
        public final static Property Type = new Property(8, String.class, "type", false, "TYPE");
        public final static Property Ad_link = new Property(9, String.class, "ad_link", false, "AD_LINK");
    };


    public CountDataDao(DaoConfig config) {
        super(config);
    }
    
    public CountDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COUNT_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AD_ID\" TEXT," + // 1: ad_id
                "\"SHOW_NUM\" INTEGER NOT NULL ," + // 2: show_num
                "\"CLICK_NUM\" INTEGER NOT NULL ," + // 3: click_num
                "\"CLICK_USER_NUM\" INTEGER NOT NULL ," + // 4: click_user_num
                "\"AD_SHOW_NAME\" TEXT," + // 5: adShowName
                "\"SHOW_POSITION\" TEXT," + // 6: show_position
                "\"IMG_URL\" TEXT," + // 7: img_url
                "\"TYPE\" TEXT," + // 8: type
                "\"AD_LINK\" TEXT);"); // 9: ad_link
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COUNT_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CountData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ad_id = entity.getAd_id();
        if (ad_id != null) {
            stmt.bindString(2, ad_id);
        }
        stmt.bindLong(3, entity.getShow_num());
        stmt.bindLong(4, entity.getClick_num());
        stmt.bindLong(5, entity.getClick_user_num());
 
        String adShowName = entity.getAdShowName();
        if (adShowName != null) {
            stmt.bindString(6, adShowName);
        }
 
        String show_position = entity.getShow_position();
        if (show_position != null) {
            stmt.bindString(7, show_position);
        }
 
        String img_url = entity.getImg_url();
        if (img_url != null) {
            stmt.bindString(8, img_url);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(9, type);
        }
 
        String ad_link = entity.getAd_link();
        if (ad_link != null) {
            stmt.bindString(10, ad_link);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CountData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ad_id = entity.getAd_id();
        if (ad_id != null) {
            stmt.bindString(2, ad_id);
        }
        stmt.bindLong(3, entity.getShow_num());
        stmt.bindLong(4, entity.getClick_num());
        stmt.bindLong(5, entity.getClick_user_num());
 
        String adShowName = entity.getAdShowName();
        if (adShowName != null) {
            stmt.bindString(6, adShowName);
        }
 
        String show_position = entity.getShow_position();
        if (show_position != null) {
            stmt.bindString(7, show_position);
        }
 
        String img_url = entity.getImg_url();
        if (img_url != null) {
            stmt.bindString(8, img_url);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(9, type);
        }
 
        String ad_link = entity.getAd_link();
        if (ad_link != null) {
            stmt.bindString(10, ad_link);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CountData readEntity(Cursor cursor, int offset) {
        CountData entity = new CountData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ad_id
            cursor.getInt(offset + 2), // show_num
            cursor.getInt(offset + 3), // click_num
            cursor.getInt(offset + 4), // click_user_num
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // adShowName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // show_position
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // img_url
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // type
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // ad_link
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CountData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAd_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setShow_num(cursor.getInt(offset + 2));
        entity.setClick_num(cursor.getInt(offset + 3));
        entity.setClick_user_num(cursor.getInt(offset + 4));
        entity.setAdShowName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setShow_position(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setImg_url(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setType(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAd_link(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CountData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CountData entity) {
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
