package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.T4 */
/* loaded from: classes.dex */
public final class C1539T4 {

    /* renamed from: a */
    public final C2294xb f5462a;

    public C1539T4() {
        this(C2018ma.m4192h().m4202i());
    }

    /* renamed from: a */
    public static C1664Y4 m3348a(C1489R4 c1489r4) {
        return new C1664Y4(new C1614W4(c1489r4), c1489r4);
    }

    public C1539T4(C2294xb c2294xb) {
        this.f5462a = c2294xb;
    }

    /* renamed from: a */
    public final C1158Dm m3349a(C1489R4 c1489r4, C1606Vl c1606Vl) {
        C1158Dm c1158Dm = new C1158Dm(c1489r4, new C2024mg(c1606Vl));
        C2294xb c2294xb = this.f5462a;
        synchronized (c2294xb) {
            c2294xb.f7429c.add(c1158Dm);
        }
        return c1158Dm;
    }
}
