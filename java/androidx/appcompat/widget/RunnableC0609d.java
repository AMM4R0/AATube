package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public final class RunnableC0609d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SearchView.SearchAutoComplete f1966a;

    public RunnableC0609d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1966a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1966a;
        if (searchAutoComplete.f1870g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1870g = false;
        }
    }
}
