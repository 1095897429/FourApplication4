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
 * DAO for table "BOOK_MARK_DATA".
*/
public class BookMarkDataDao extends AbstractDao<BookMarkData, Long> {

    public static final String TABLENAME = "BOOK_MARK_DATA";

    /**
     * Properties of entity BookMarkData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Visit_link = new Property(1, String.class, "visit_link", false, "VISIT_LINK");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Icon = new Property(3, String.class, "icon", false, "ICON");
        public final static Property CurrentTime = new Property(4, String.class, "currentTime", false, "CURRENT_TIME");
    };


    public BookMarkDataDao(DaoConfig config) {
        super(config);
    }
    
    public BookMarkDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_MARK_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"VISIT_LINK\" TEXT," + // 1: visit_link
                "\"TITLE\" TEXT," + // 2: title
                "\"ICON\" TEXT," + // 3: icon
                "\"CURRENT_TIME\" TEXT);"); // 4: currentTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_MARK_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookMarkData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String visit_link = entity.getVisit_link();
        if (visit_link != null) {
            stmt.bindString(2, visit_link);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(4, icon);
        }
 
        String currentTime = entity.getCurrentTime();
        if (currentTime != null) {
            stmt.bindString(5, currentTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookMarkData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String visit_link = entity.getVisit_link();
        if (visit_link != null) {
            stmt.bindString(2, visit_link);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(4, icon);
        }
 
        String currentTime = entity.getCurrentTime();
        if (currentTime != null) {
            stmt.bindString(5, currentTime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BookMarkData readEntity(Cursor cursor, int offset) {
        BookMarkData entity = new BookMarkData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // visit_link
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // icon
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // currentTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookMarkData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVisit_link(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIcon(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCurrentTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BookMarkData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BookMarkData entity) {
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
