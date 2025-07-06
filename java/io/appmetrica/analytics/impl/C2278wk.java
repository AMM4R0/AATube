package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wk */
/* loaded from: classes.dex */
public final class C2278wk implements InterfaceC1766c8 {

    /* renamed from: a */
    public final C1823ef f7380a;

    /* renamed from: b */
    public final C1276If f7381b;

    public C2278wk() {
        this(new C1823ef(), new C1276If());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1876gi> fromModel(C2253vk c2253vk) {
        C1876gi c1876gi;
        C2241v8 c2241v8 = new C2241v8();
        c2241v8.f7273a = 3;
        c2241v8.f7276d = new C2191t8();
        C1876gi fromModel = this.f7380a.fromModel(c2253vk.f7311a);
        c2241v8.f7276d.f7153a = (C2066o8) fromModel.f6330a;
        C1749bg c1749bg = c2253vk.f7312b;
        if (c1749bg != null) {
            c1876gi = this.f7381b.fromModel(c1749bg);
            c2241v8.f7276d.f7154b = (C2116q8) c1876gi.f6330a;
        } else {
            c1876gi = null;
        }
        return Collections.singletonList(new C1876gi(c2241v8, new C1089B3(C1089B3.m2745b(fromModel, c1876gi))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2278wk(C1823ef c1823ef, C1276If c1276If) {
        this.f7380a = c1823ef;
        this.f7381b = c1276If;
    }

    /* renamed from: a */
    public final C2253vk m4584a(List<C1876gi> list) {
        throw new UnsupportedOperationException();
    }
}
