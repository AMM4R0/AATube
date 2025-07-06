package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.uk */
/* loaded from: classes.dex */
public final class C2228uk implements InterfaceC1766c8 {

    /* renamed from: a */
    public final C1104Bi f7227a;

    /* renamed from: b */
    public final C1823ef f7228b;

    public C2228uk() {
        this(new C1104Bi(), new C1823ef());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1876gi> fromModel(C2203tk c2203tk) {
        C2241v8 c2241v8 = new C2241v8();
        c2241v8.f7273a = 2;
        c2241v8.f7275c = new C2166s8();
        C1876gi fromModel = this.f7227a.fromModel(c2203tk.f7176b);
        c2241v8.f7275c.f7123b = (C2141r8) fromModel.f6330a;
        C1876gi fromModel2 = this.f7228b.fromModel(c2203tk.f7175a);
        c2241v8.f7275c.f7122a = (C2066o8) fromModel2.f6330a;
        return Collections.singletonList(new C1876gi(c2241v8, new C1089B3(C1089B3.m2745b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2228uk(C1104Bi c1104Bi, C1823ef c1823ef) {
        this.f7227a = c1104Bi;
        this.f7228b = c1823ef;
    }

    /* renamed from: a */
    public final C2203tk m4484a(List<C1876gi> list) {
        throw new UnsupportedOperationException();
    }
}
