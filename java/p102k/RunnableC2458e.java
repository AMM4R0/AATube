package p102k;

import p006C.C0055g;

/* renamed from: k.e */
/* loaded from: classes.dex */
public final class RunnableC2458e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2459f f8018a;

    /* renamed from: b */
    public final /* synthetic */ C2468o f8019b;

    /* renamed from: c */
    public final /* synthetic */ MenuC2466m f8020c;

    /* renamed from: d */
    public final /* synthetic */ C0055g f8021d;

    public RunnableC2458e(C0055g c0055g, C2459f c2459f, C2468o c2468o, MenuC2466m menuC2466m) {
        this.f8021d = c0055g;
        this.f8018a = c2459f;
        this.f8019b = c2468o;
        this.f8020c = menuC2466m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2459f c2459f = this.f8018a;
        if (c2459f != null) {
            C0055g c0055g = this.f8021d;
            ((ViewOnKeyListenerC2460g) c0055g.f107b).f8049z = true;
            c2459f.f8023b.m4836c(false);
            ((ViewOnKeyListenerC2460g) c0055g.f107b).f8049z = false;
        }
        C2468o c2468o = this.f8019b;
        if (c2468o.isEnabled() && c2468o.hasSubMenu()) {
            this.f8020c.m4842q(c2468o, null, 4);
        }
    }
}
