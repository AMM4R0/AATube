package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.Kj */
/* loaded from: classes.dex */
public final class C1330Kj extends AbstractC2345zc {

    /* renamed from: a */
    public final C1359Ln f4970a;

    public C1330Kj() {
        this(C2018ma.m4192h().m4193A().m3245b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2345zc
    /* renamed from: a */
    public final void mo3026a(int r5) {
        C1359Ln c1359Ln = this.f4970a;
        synchronized (c1359Ln) {
            C1434On c1434On = c1359Ln.f5018a;
            c1434On.m3194a(c1434On.m3193a().put("last_migration_api_level", r5));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2345zc
    /* renamed from: b */
    public final int mo3027b() {
        int optInt;
        C1359Ln c1359Ln = this.f4970a;
        synchronized (c1359Ln) {
            optInt = c1359Ln.f5018a.m3193a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2345zc
    /* renamed from: c */
    public final SparseArray<C1355Lj> mo3028c() {
        SparseArray<C1355Lj> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C1355Lj(this.f4970a));
        return sparseArray;
    }

    public C1330Kj(C1359Ln c1359Ln) {
        this.f4970a = c1359Ln;
    }
}
