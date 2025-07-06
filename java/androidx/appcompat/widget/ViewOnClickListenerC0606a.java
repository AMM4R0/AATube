package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0606a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f1964a;

    public ViewOnClickListenerC0606a(SearchView searchView) {
        this.f1964a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f1964a;
        ImageView imageView = searchView.f1861t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1857p;
        if (view == imageView) {
            searchView.m1530y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f1839L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f1863v) {
            searchView.m1520o();
            return;
        }
        if (view == searchView.f1862u) {
            searchView.m1524s();
            return;
        }
        if (view != searchView.f1864w) {
            if (view == searchAutoComplete) {
                searchView.m1519n();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f1852b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m1518m(searchView.f1836I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f1835H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
