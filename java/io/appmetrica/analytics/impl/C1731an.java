package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.an */
/* loaded from: classes.dex */
public final class C1731an implements InterfaceC1114C3 {

    /* renamed from: a */
    public final Object f5895a;

    /* renamed from: b */
    public final InterfaceC1114C3 f5896b;

    public C1731an(Object obj, InterfaceC1114C3 interfaceC1114C3) {
        this.f5895a = obj;
        this.f5896b = interfaceC1114C3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1114C3
    public final int getBytesTruncated() {
        return this.f5896b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f5895a + ", metaInfo=" + this.f5896b + '}';
    }
}
