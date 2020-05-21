package com.raywenderlich.wewatch.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\'\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\tH\'J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\'J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\'R \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/wewatch/model/MovieDao;", "", "all", "Lio/reactivex/Observable;", "", "Lcom/raywenderlich/wewatch/model/Movie;", "getAll", "()Lio/reactivex/Observable;", "delete", "", "id", "", "(Ljava/lang/Integer;)V", "deleteAll", "insert", "movie", "update", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table")
    public abstract io.reactivex.Observable<java.util.List<com.raywenderlich.wewatch.model.Movie>> getAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.model.Movie movie);
    
    @androidx.room.Query(value = "DELETE FROM movie_table WHERE id = :id")
    public abstract void delete(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id);
    
    @androidx.room.Query(value = "DELETE FROM movie_table")
    public abstract void deleteAll();
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.model.Movie movie);
}