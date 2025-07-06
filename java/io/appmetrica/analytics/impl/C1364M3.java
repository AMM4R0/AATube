package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.M3 */
/* loaded from: classes.dex */
public final class C1364M3 implements Converter {

    /* renamed from: a */
    public final C2118qa f5022a;

    public C1364M3() {
        this(new C2118qa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(List<String> list) {
        C1731an mo3342a = this.f5022a.mo3342a((List<Object>) list);
        C1866g8 c1866g8 = new C1866g8();
        c1866g8.f6304a = StringUtils.getUTF8Bytes((List<String>) mo3342a.f5895a);
        return new C1876gi(c1866g8, mo3342a.f5896b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1364M3(C2118qa c2118qa) {
        this.f5022a = c2118qa;
    }

    /* renamed from: a */
    public final List<String> m3078a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
