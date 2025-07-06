package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.W */
/* loaded from: classes.dex */
public final class C1609W implements Converter {

    /* renamed from: a */
    public final C2340z7 f5613a;

    /* renamed from: b */
    public final C2143ra f5614b;

    public C1609W() {
        this(new C2340z7(), new C2143ra(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(C1634X c1634x) {
        C1791d8 c1791d8 = new C1791d8();
        c1791d8.f6082b = this.f5613a.fromModel(c1634x.f5676a);
        C1731an mo3342a = this.f5614b.mo3342a(c1634x.f5677b);
        c1791d8.f6081a = StringUtils.getUTF8Bytes((String) mo3342a.f5895a);
        return new C1876gi(c1791d8, new C1089B3(C1089B3.m2745b(mo3342a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1609W(C2340z7 c2340z7, C2143ra c2143ra) {
        this.f5613a = c2340z7;
        this.f5614b = c2143ra;
    }

    /* renamed from: a */
    public final C1634X m3447a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
