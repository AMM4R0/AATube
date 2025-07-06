package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.K3 */
/* loaded from: classes.dex */
public final class C1314K3 implements Converter {

    /* renamed from: a */
    public final C1823ef f4940a;

    /* renamed from: b */
    public final C2340z7 f4941b;

    /* renamed from: c */
    public final C1649Xe f4942c;

    /* renamed from: d */
    public final C1276If f4943d;

    public C1314K3() {
        this(new C1823ef(), new C2340z7(), new C1649Xe(), new C1276If());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(C1339L3 c1339l3) {
        C1876gi c1876gi;
        C1841f8 c1841f8 = new C1841f8();
        C1876gi fromModel = this.f4940a.fromModel(c1339l3.f4988a);
        c1841f8.f6200a = (C2066o8) fromModel.f6330a;
        c1841f8.f6202c = this.f4941b.fromModel(c1339l3.f4989b);
        C1876gi fromModel2 = this.f4942c.fromModel(c1339l3.f4990c);
        c1841f8.f6203d = (C2041n8) fromModel2.f6330a;
        C1749bg c1749bg = c1339l3.f4991d;
        if (c1749bg != null) {
            c1876gi = this.f4943d.fromModel(c1749bg);
            c1841f8.f6201b = (C2116q8) c1876gi.f6330a;
        } else {
            c1876gi = null;
        }
        return new C1876gi(c1841f8, new C1089B3(C1089B3.m2745b(fromModel, fromModel2, c1876gi)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1314K3(C1823ef c1823ef, C2340z7 c2340z7, C1649Xe c1649Xe, C1276If c1276If) {
        this.f4940a = c1823ef;
        this.f4941b = c2340z7;
        this.f4942c = c1649Xe;
        this.f4943d = c1276If;
    }

    /* renamed from: a */
    public final C1339L3 m3002a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
