package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zk */
/* loaded from: classes.dex */
public final class C2353zk implements InterfaceC1234Gn {

    /* renamed from: a */
    public final C2133r0 f7535a;

    public C2353zk(C2133r0 c2133r0) {
        this.f7535a = c2133r0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(Void r3) {
        boolean z2;
        this.f7535a.getClass();
        synchronized (C2108q0.class) {
            z2 = C2108q0.f6955g;
        }
        return z2 ? new C1184En(this, true, "") : new C1184En(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public final C1184En m4687a() {
        return mo2706a((Void) null);
    }
}
