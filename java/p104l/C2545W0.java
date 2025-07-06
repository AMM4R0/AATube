package p104l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: l.W0 */
/* loaded from: classes.dex */
public final class C2545W0 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ SearchView f8307a;

    public C2545W0(SearchView searchView) {
        this.f8307a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int r3, int r4, int r5) {
        SearchView searchView = this.f8307a;
        Editable text = searchView.f1857p.getText();
        searchView.f1849V = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.m1529x(!isEmpty);
        int r02 = 8;
        if (searchView.f1848U && !searchView.f1841N && isEmpty) {
            searchView.f1862u.setVisibility(8);
            r02 = 0;
        }
        searchView.f1864w.setVisibility(r02);
        searchView.m1525t();
        searchView.m1528w();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
    }
}
