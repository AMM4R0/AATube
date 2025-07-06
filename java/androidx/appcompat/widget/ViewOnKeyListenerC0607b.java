package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0607b implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f1965a;

    public ViewOnKeyListenerC0607b(SearchView searchView) {
        this.f1965a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int r9, KeyEvent keyEvent) {
        SearchView searchView = this.f1965a;
        if (searchView.f1852b0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1857p;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || r9 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.m1517l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f1852b0 == null || searchView.f1842O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (r9 == 66 || r9 == 84 || r9 == 61) {
            searchView.m1521p(searchAutoComplete.getListSelection());
        } else {
            if (r9 != 21 && r9 != 22) {
                if (r9 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(r9 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.m1531a();
        }
        return true;
    }
}
