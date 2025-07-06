package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ea */
/* loaded from: classes.dex */
public final class C1818ea implements ProtobufConverter {

    /* renamed from: a */
    public final AbstractC1424Od f6145a;

    public C1818ea() {
        this(new C2004ll());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1382Ml fromModel(C1190F4 c1190f4) {
        C1382Ml c1382Ml = new C1382Ml();
        c1382Ml.f5087b = c1190f4.f4723b;
        c1382Ml.f5086a = c1190f4.f4722a;
        c1382Ml.f5088c = c1190f4.f4724c;
        c1382Ml.f5089d = c1190f4.f4725d;
        c1382Ml.f5090e = c1190f4.f4726e;
        c1382Ml.f5091f = this.f6145a.m3172a(c1190f4.f4727f);
        return c1382Ml;
    }

    public C1818ea(C2004ll c2004ll) {
        this.f6145a = c2004ll;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1190F4 toModel(C1382Ml c1382Ml) {
        C1140D4 c1140d4 = new C1140D4();
        c1140d4.f4627d = c1382Ml.f5089d;
        c1140d4.f4626c = c1382Ml.f5088c;
        c1140d4.f4625b = c1382Ml.f5087b;
        c1140d4.f4624a = c1382Ml.f5086a;
        c1140d4.f4628e = c1382Ml.f5090e;
        c1140d4.f4629f = this.f6145a.m3173a(c1382Ml.f5091f);
        return new C1190F4(c1140d4);
    }
}
