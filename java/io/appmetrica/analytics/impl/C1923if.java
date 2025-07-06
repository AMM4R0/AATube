package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.if */
/* loaded from: classes.dex */
public final class C1923if implements Converter {

    /* renamed from: a */
    public final C2118qa f6490a;

    public C1923if() {
        this(new C2118qa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1876gi fromModel(List<String> list) {
        C1731an mo3342a = this.f6490a.mo3342a((List<Object>) list);
        List list2 = (List) mo3342a.f5895a;
        C2091p8[] c2091p8Arr = new C2091p8[0];
        if (list2 != null) {
            c2091p8Arr = new C2091p8[list2.size()];
            for (int r12 = 0; r12 < list2.size(); r12++) {
                C2091p8 c2091p8 = new C2091p8();
                c2091p8Arr[r12] = c2091p8;
                c2091p8.f6902a = StringUtils.getUTF8Bytes((String) list2.get(r12));
            }
        }
        return new C1876gi(c2091p8Arr, mo3342a.f5896b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1923if(C2118qa c2118qa) {
        this.f6490a = c2118qa;
    }

    /* renamed from: a */
    public final List<String> m4016a(C1876gi c1876gi) {
        throw new UnsupportedOperationException();
    }
}
