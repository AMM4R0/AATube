package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Tm */
/* loaded from: classes.dex */
public final class C1557Tm implements ProtobufConverter {

    /* renamed from: a */
    public final C1580Uk f5506a;

    public C1557Tm() {
        this(new C1580Uk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1914i6 fromModel(C1582Um c1582Um) {
        C1914i6 c1914i6 = new C1914i6();
        c1914i6.f6462a = (String) WrapUtils.getOrDefault(c1582Um.f5547a, "");
        c1914i6.f6463b = (String) WrapUtils.getOrDefault(c1582Um.f5548b, "");
        c1914i6.f6464c = this.f5506a.fromModel(c1582Um.f5549c);
        C1582Um c1582Um2 = c1582Um.f5550d;
        if (c1582Um2 != null) {
            c1914i6.f6465d = fromModel(c1582Um2);
        }
        List list = c1582Um.f5551e;
        int r12 = 0;
        if (list == null) {
            c1914i6.f6466e = new C1914i6[0];
        } else {
            c1914i6.f6466e = new C1914i6[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c1914i6.f6466e[r12] = fromModel((C1582Um) it.next());
                r12++;
            }
        }
        return c1914i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1557Tm(C1580Uk c1580Uk) {
        this.f5506a = c1580Uk;
    }

    /* renamed from: a */
    public final C1582Um m3382a(C1914i6 c1914i6) {
        throw new UnsupportedOperationException();
    }
}
