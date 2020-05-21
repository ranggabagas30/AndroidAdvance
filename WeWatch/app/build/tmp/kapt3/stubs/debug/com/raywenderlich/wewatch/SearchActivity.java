package com.raywenderlich.wewatch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0015J\u000e\u0010\'\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0004J\u0012\u0010(\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020#H\u0014J\b\u0010,\u001a\u00020#H\u0014J\b\u0010-\u001a\u00020#H\u0002J\u000e\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001d0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/raywenderlich/wewatch/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "adapter", "Lcom/raywenderlich/wewatch/SearchAdapter;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dataSource", "Lcom/raywenderlich/wewatch/model/RemoteDataSource;", "itemListener", "Lcom/raywenderlich/wewatch/SearchActivity$RecyclerItemListener;", "getItemListener$app_debug", "()Lcom/raywenderlich/wewatch/SearchActivity$RecyclerItemListener;", "setItemListener$app_debug", "(Lcom/raywenderlich/wewatch/SearchActivity$RecyclerItemListener;)V", "noMoviesTextView", "Landroid/widget/TextView;", "observer", "Lio/reactivex/observers/DisposableObserver;", "Lcom/raywenderlich/wewatch/model/TmdbResponse;", "getObserver", "()Lio/reactivex/observers/DisposableObserver;", "progressBar", "Landroid/widget/ProgressBar;", "query", "searchResultsObservable", "Lkotlin/Function1;", "Lio/reactivex/Observable;", "getSearchResultsObservable", "()Lkotlin/jvm/functions/Function1;", "searchResultsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "displayError", "", "string", "displayResult", "tmdbResponse", "getSearchResults", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setupViews", "showToast", "Companion", "RecyclerItemListener", "app_debug"})
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String TAG = "SearchActivity";
    private androidx.recyclerview.widget.RecyclerView searchResultsRecyclerView;
    private com.raywenderlich.wewatch.SearchAdapter adapter;
    private android.widget.TextView noMoviesTextView;
    private android.widget.ProgressBar progressBar;
    private java.lang.String query;
    private com.raywenderlich.wewatch.model.RemoteDataSource dataSource;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Observable<com.raywenderlich.wewatch.model.TmdbResponse>> searchResultsObservable = null;
    
    /**
     * * Listener for clicks on tasks in the ListView.
     */
    @org.jetbrains.annotations.NotNull()
    private com.raywenderlich.wewatch.SearchActivity.RecyclerItemListener itemListener;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SEARCH_QUERY = "searchQuery";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_TITLE = "SearchActivity.TITLE_REPLY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_RELEASE_DATE = "SearchActivity.RELEASE_DATE_REPLY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_POSTER_PATH = "SearchActivity.POSTER_PATH_REPLY";
    public static final com.raywenderlich.wewatch.SearchActivity.Companion Companion = null;
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
    
    public final void getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Observable<com.raywenderlich.wewatch.model.TmdbResponse>> getSearchResultsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.observers.DisposableObserver<com.raywenderlich.wewatch.model.TmdbResponse> getObserver() {
        return null;
    }
    
    public final void displayResult(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.model.TmdbResponse tmdbResponse) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    public final void displayError(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.wewatch.SearchActivity.RecyclerItemListener getItemListener$app_debug() {
        return null;
    }
    
    public final void setItemListener$app_debug(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.SearchActivity.RecyclerItemListener p0) {
    }
    
    public SearchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/wewatch/SearchActivity$RecyclerItemListener;", "", "onItemClick", "", "v", "Landroid/view/View;", "position", "", "app_debug"})
    public static abstract interface RecyclerItemListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View v, int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/wewatch/SearchActivity$Companion;", "", "()V", "EXTRA_POSTER_PATH", "", "getEXTRA_POSTER_PATH", "()Ljava/lang/String;", "EXTRA_RELEASE_DATE", "getEXTRA_RELEASE_DATE", "EXTRA_TITLE", "getEXTRA_TITLE", "SEARCH_QUERY", "getSEARCH_QUERY", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSEARCH_QUERY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_TITLE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_RELEASE_DATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_POSTER_PATH() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}