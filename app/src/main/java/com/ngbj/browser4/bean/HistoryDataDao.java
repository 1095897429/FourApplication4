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
 * DAO for table "HISTORY_DATA".
*/
public class HistoryDataDao extends AbstractDao<HistoryData, Long> {

    public static final String TABLENAME = "HISTORY_DATA";

    /**
     * Properties of entity HistoryData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Visit_link = new Property(1, String.class, "visit_link", false, "VISIT_LINK");
        public final static Property Type = new Property(2, String.class, "type", false, "TYPE");
        public final static Property Keyword = new Property(3, String.class, "keyword", false, "KEYWORD");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property CurrentTime = new Property(5, String.class, "currentTime", false, "CURRENT_TIME");
    };


    public HistoryDataDao(DaoConfig config) {
        super(config);
    }
    
    public HistoryDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HISTORY_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"VISIT_LINK\" TEXT," + // 1: visit_link
                "\"TYPE\" TEXT," + // 2: type
                "\"KEYWORD\" TEXT," + // 3: keyword
                "\"TITLE\" TEXT," + // 4: title
                "\"CURRENT_TIME\" TEXT);"); // 5: currentTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HISTORY_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HistoryData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String visit_link = entity.getVisit_link();
        if (visit_link != null) {
            stmt.bindString(2, visit_link);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
 
        String keyword = entity.getKeyword();
        if (keyword != null) {
            stmt.bindString(4, keyword);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String currentTime = entity.getCurrentTime();
        if (currentTime != null) {
            stmt.bindString(6, currentTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HistoryData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String visit_link = entity.getVisit_link();
        if (visit_link != null) {
            stmt.bindString(2, visit_link);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
 
        String keyword = entity.getKeyword();
        if (keyword != null) {
            stmt.bindString(4, keyword);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String currentTime = entity.getCurrentTime();
        if (currentTime != null) {
            stmt.bindString(6, currentTime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public HistoryData readEntity(Cursor cursor, int offset) {
        HistoryData entity = new HistoryData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // visit_link
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // keyword
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // currentTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, HistoryData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVisit_link(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setKeyword(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCurrentTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(HistoryData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(HistoryData entity) {
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
