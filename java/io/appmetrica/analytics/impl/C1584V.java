package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.V */
/* loaded from: classes.dex */
public final class C1584V implements ProtobufConverter {

    /* renamed from: a */
    public final C1408Nm f5553a;

    public C1584V(C1408Nm c1408Nm) {
        this.f5553a = c1408Nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1665Y5 fromModel(C1559U c1559u) {
        C1665Y5 c1665y5 = new C1665Y5();
        C1383Mm c1383Mm = c1559u.f5508a;
        if (c1383Mm != null) {
            c1665y5.f5719a = this.f5553a.fromModel(c1383Mm);
        }
        c1665y5.f5720b = new C1889h6[c1559u.f5509b.size()];
        Iterator it = c1559u.f5509b.iterator();
        int r2 = 0;
        while (it.hasNext()) {
            c1665y5.f5720b[r2] = this.f5553a.fromModel((C1383Mm) it.next());
            r2++;
        }
        String str = c1559u.f5510c;
        if (str != null) {
            c1665y5.f5721c = str;
        }
        return c1665y5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C1559U m3400a(C1665Y5 c1665y5) {
        throw new UnsupportedOperationException();
    }
}
