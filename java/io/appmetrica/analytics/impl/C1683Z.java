package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Z */
/* loaded from: classes.dex */
public final class C1683Z implements ProtobufConverter {

    /* renamed from: a */
    public final C1584V f5778a;

    /* renamed from: b */
    public final C2039n6 f5779b;

    public C1683Z() {
        this(new C1584V(new C1408Nm()), new C2039n6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1689Z5 fromModel(C1659Y c1659y) {
        C1689Z5 c1689z5 = new C1689Z5();
        c1689z5.f5784a = this.f5778a.fromModel(c1659y.f5703a);
        String str = c1659y.f5704b;
        if (str != null) {
            c1689z5.f5785b = str;
        }
        c1689z5.f5786c = this.f5779b.m3172a(c1659y.f5705c);
        return c1689z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1683Z(C1584V c1584v, C2039n6 c2039n6) {
        this.f5778a = c1584v;
        this.f5779b = c2039n6;
    }

    /* renamed from: a */
    public final C1659Y m3556a(C1689Z5 c1689z5) {
        throw new UnsupportedOperationException();
    }
}
