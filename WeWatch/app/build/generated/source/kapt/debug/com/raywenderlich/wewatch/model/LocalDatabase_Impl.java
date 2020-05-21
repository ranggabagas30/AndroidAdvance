package com.raywenderlich.wewatch.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class LocalDatabase_Impl extends LocalDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_table` (`voteCount` INTEGER, `id` INTEGER, `video` INTEGER, `voteAverage` REAL, `title` TEXT, `popularity` REAL, `posterPath` TEXT, `originalLanguage` TEXT, `originalTitle` TEXT, `genreIds` TEXT, `backdropPath` TEXT, `adult` INTEGER, `overview` TEXT, `releaseDate` TEXT, `watched` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"5af59be7c5c91ad99b7183db1e758ecf\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieTable = new HashMap<String, TableInfo.Column>(15);
        _columnsMovieTable.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", false, 0));
        _columnsMovieTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsMovieTable.put("video", new TableInfo.Column("video", "INTEGER", false, 0));
        _columnsMovieTable.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0));
        _columnsMovieTable.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsMovieTable.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0));
        _columnsMovieTable.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0));
        _columnsMovieTable.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", false, 0));
        _columnsMovieTable.put("originalTitle", new TableInfo.Column("originalTitle", "TEXT", false, 0));
        _columnsMovieTable.put("genreIds", new TableInfo.Column("genreIds", "TEXT", false, 0));
        _columnsMovieTable.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0));
        _columnsMovieTable.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0));
        _columnsMovieTable.put("overview", new TableInfo.Column("overview", "TEXT", false, 0));
        _columnsMovieTable.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0));
        _columnsMovieTable.put("watched", new TableInfo.Column("watched", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieTable = new TableInfo("movie_table", _columnsMovieTable, _foreignKeysMovieTable, _indicesMovieTable);
        final TableInfo _existingMovieTable = TableInfo.read(_db, "movie_table");
        if (! _infoMovieTable.equals(_existingMovieTable)) {
          throw new IllegalStateException("Migration didn't properly handle movie_table(com.raywenderlich.wewatch.model.Movie).\n"
                  + " Expected:\n" + _infoMovieTable + "\n"
                  + " Found:\n" + _existingMovieTable);
        }
      }
    }, "5af59be7c5c91ad99b7183db1e758ecf", "54fa8e990d7d9160b1f83a5d79ad89b5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
