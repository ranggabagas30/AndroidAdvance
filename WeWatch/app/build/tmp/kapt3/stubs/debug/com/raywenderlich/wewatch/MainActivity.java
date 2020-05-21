package com.raywenderlich.wewatch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004J\u0016\u0010\u001e\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\b\u0010 \u001a\u00020\u001cH\u0002J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\"\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001cH\u0014J\b\u00105\u001a\u00020\u001cH\u0014J\b\u00106\u001a\u00020\u001cH\u0002J\u000e\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006:"}, d2 = {"Lcom/raywenderlich/wewatch/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "adapter", "Lcom/raywenderlich/wewatch/MainAdapter;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dataSource", "Lcom/raywenderlich/wewatch/model/LocalDataSource;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "moviesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "myMoviesObservable", "Lio/reactivex/Observable;", "", "Lcom/raywenderlich/wewatch/model/Movie;", "getMyMoviesObservable", "()Lio/reactivex/Observable;", "noMoviesLayout", "Landroid/widget/LinearLayout;", "observer", "Lio/reactivex/observers/DisposableObserver;", "getObserver", "()Lio/reactivex/observers/DisposableObserver;", "displayError", "", "e", "displayMovies", "movieList", "getMyMoviesList", "goToAddMovieActivity", "v", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "setupViews", "showToast", "str", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView moviesRecyclerView;
    private com.raywenderlich.wewatch.MainAdapter adapter;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    private android.widget.LinearLayout noMoviesLayout;
    private com.raywenderlich.wewatch.model.LocalDataSource dataSource;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final java.lang.String TAG = "MainActivity";
    public static final int ADD_MOVIE_ACTIVITY_REQUEST_CODE = 1;
    public static final com.raywenderlich.wewatch.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void setupViews() {
    }
    
    private final void getMyMoviesList() {
    }
    
    private final io.reactivex.Observable<java.util.List<com.raywenderlich.wewatch.model.Movie>> getMyMoviesObservable() {
        return null;
    }
    
    private final io.reactivex.observers.DisposableObserver<java.util.List<com.raywenderlich.wewatch.model.Movie>> getObserver() {
        return null;
    }
    
    public final void displayMovies(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.wewatch.model.Movie> movieList) {
    }
    
    public final void goToAddMovieActivity(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void displayError(@org.jetbrains.annotations.NotNull()
    java.lang.String e) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/wewatch/MainActivity$Companion;", "", "()V", "ADD_MOVIE_ACTIVITY_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}