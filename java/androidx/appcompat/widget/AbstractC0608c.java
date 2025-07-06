package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractC0608c {
    /* renamed from: a */
    public static void m1559a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    /* renamed from: b */
    public static void m1560b(SearchView.SearchAutoComplete searchAutoComplete, int r12) {
        searchAutoComplete.setInputMethodMode(r12);
    }
}
