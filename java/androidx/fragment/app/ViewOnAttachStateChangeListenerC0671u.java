package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0671u implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0644K f2352a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0672v f2353b;

    public ViewOnAttachStateChangeListenerC0671u(LayoutInflaterFactory2C0672v layoutInflaterFactory2C0672v, C0644K c0644k) {
        this.f2353b = layoutInflaterFactory2C0672v;
        this.f2352a = c0644k;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0644K c0644k = this.f2352a;
        c0644k.m1717k();
        C0658h.m1744f((ViewGroup) c0644k.f2188c.f2300E.getParent(), this.f2353b.f2354a.m1658B()).m1749e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
