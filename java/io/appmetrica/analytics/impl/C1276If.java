package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.If */
/* loaded from: classes.dex */
public final class C1276If implements Converter {

    /* renamed from: a */
    public final C1104Bi f4863a;

    /* renamed from: b */
    public final C2143ra f4864b;

    /* renamed from: c */
    public final C2143ra f4865c;

    public C1276If() {
        this(new C1104Bi(), new C2143ra(100), new C2143ra(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(C1749bg c1749bg) {
        C1876gi c1876gi;
        C2116q8 c2116q8 = new C2116q8();
        C1731an mo3342a = this.f4864b.mo3342a(c1749bg.f5923a);
        c2116q8.f6988a = StringUtils.getUTF8Bytes((String) mo3342a.f5895a);
        C1731an mo3342a2 = this.f4865c.mo3342a(c1749bg.f5924b);
        c2116q8.f6989b = StringUtils.getUTF8Bytes((String) mo3342a2.f5895a);
        C1204Fi c1204Fi = c1749bg.f5925c;
        if (c1204Fi != null) {
            c1876gi = this.f4863a.fromModel(c1204Fi);
            c2116q8.f6990c = (C2141r8) c1876gi.f6330a;
        } else {
            c1876gi = null;
        }
        return new C1876gi(c2116q8, new C1089B3(C1089B3.m2745b(mo3342a, mo3342a2, c1876gi)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1276If(C1104Bi c1104Bi, C2143ra c2143ra, C2143ra c2143ra2) {
        this.f4863a = c1104Bi;
        this.f4864b = c2143ra;
        this.f4865c = c2143ra2;
    }

    /* renamed from: a */
    public final C1749bg m2960a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
