package p102k;

import android.view.ActionProvider;
import android.view.View;
import p006C.C0055g;

/* renamed from: k.p */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC2469p implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public final ActionProvider f8121a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC2473t f8122b;

    /* renamed from: c */
    public C0055g f8123c;

    public ActionProviderVisibilityListenerC2469p(MenuItemC2473t menuItemC2473t, ActionProvider actionProvider) {
        this.f8122b = menuItemC2473t;
        this.f8121a = actionProvider;
    }

    /* renamed from: a */
    public final View m4854a(C2468o c2468o) {
        return this.f8121a.onCreateActionView(c2468o);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0055g c0055g = this.f8123c;
        if (c0055g != null) {
            MenuC2466m menuC2466m = ((C2468o) c0055g.f107b).f8108n;
            menuC2466m.f8072h = true;
            menuC2466m.m4841p(true);
        }
    }
}
