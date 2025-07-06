package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Nm */
/* loaded from: classes.dex */
public final class C1408Nm implements ProtobufConverter {

    /* renamed from: a */
    public final C1580Uk f5141a;

    public C1408Nm() {
        this(new C1580Uk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1889h6 fromModel(C1383Mm c1383Mm) {
        C1889h6 c1889h6 = new C1889h6();
        Integer num = c1383Mm.f5096e;
        c1889h6.f6363e = num == null ? -1 : num.intValue();
        c1889h6.f6362d = c1383Mm.f5095d;
        c1889h6.f6360b = c1383Mm.f5093b;
        c1889h6.f6359a = c1383Mm.f5092a;
        c1889h6.f6361c = c1383Mm.f5094c;
        C1580Uk c1580Uk = this.f5141a;
        List list = c1383Mm.f5097f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1630Wk((StackTraceElement) it.next()));
        }
        c1889h6.f6364f = c1580Uk.fromModel(arrayList);
        return c1889h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1408Nm(C1580Uk c1580Uk) {
        this.f5141a = c1580Uk;
    }

    /* renamed from: a */
    public final C1383Mm m3132a(C1889h6 c1889h6) {
        throw new UnsupportedOperationException();
    }
}
