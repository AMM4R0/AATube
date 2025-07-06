package p138x;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2883e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f9505a;

    public ViewTreeObserverOnPreDrawListenerC2883e(CoordinatorLayout coordinatorLayout) {
        this.f9505a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f9505a.m1580p(0);
        return true;
    }
}
