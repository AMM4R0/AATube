package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi */
/* loaded from: classes.dex */
public final class C1876gi implements InterfaceC1114C3 {

    /* renamed from: a */
    public final Object f6330a;

    /* renamed from: b */
    public final InterfaceC1114C3 f6331b;

    public C1876gi(Object obj, InterfaceC1114C3 interfaceC1114C3) {
        this.f6330a = obj;
        this.f6331b = interfaceC1114C3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1114C3
    public final int getBytesTruncated() {
        return this.f6331b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f6330a + ", metaInfo=" + this.f6331b + '}';
    }
}
