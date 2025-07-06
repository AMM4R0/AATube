package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.u4 */
/* loaded from: classes.dex */
public final class C2212u4 extends AbstractC2345zc {

    /* renamed from: a */
    public final C2272we f7211a;

    public C2212u4(Context context) {
        this(new C2272we(C1765c7.m3695a(context).m3698b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2345zc
    /* renamed from: a */
    public final void mo3026a(int r4) {
        this.f7211a.m4549c(r4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2345zc
    /* renamed from: b */
    public final int mo3027b() {
        return (int) this.f7211a.m4539a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2345zc
    /* renamed from: c */
    public final SparseArray<C1355Lj> mo3028c() {
        return new SparseArray<>();
    }

    public C2212u4(C2272we c2272we) {
        this.f7211a = c2272we;
    }
}
