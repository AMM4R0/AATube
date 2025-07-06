package p104l;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: l.Z0 */
/* loaded from: classes.dex */
public final class C2551Z0 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f8311a;

    public C2551Z0(SearchView searchView) {
        this.f8311a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int r2, KeyEvent keyEvent) {
        this.f8311a.m1524s();
        return true;
    }
}
