package p104l;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: l.Y0 */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC2549Y0 implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f8310a;

    public ViewOnFocusChangeListenerC2549Y0(SearchView searchView) {
        this.f8310a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f8310a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1838K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
