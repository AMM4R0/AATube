package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Xm */
/* loaded from: classes.dex */
public class C1657Xm implements InterfaceC1951ji {

    /* renamed from: a */
    public final int f5698a;

    /* renamed from: b */
    public final int f5699b;

    /* renamed from: c */
    public int f5700c = 0;

    public C1657Xm(int r2, int r3) {
        this.f5698a = r2;
        this.f5699b = r3;
    }

    /* renamed from: a */
    public final int m3516a() {
        return this.f5699b;
    }

    /* renamed from: b */
    public final boolean m3517b() {
        int r02 = this.f5700c;
        this.f5700c = r02 + 1;
        return r02 < this.f5698a;
    }

    /* renamed from: c */
    public final void m3518c() {
        this.f5700c = 0;
    }
}
