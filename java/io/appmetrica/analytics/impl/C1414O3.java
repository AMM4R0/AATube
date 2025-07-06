package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2659i;

/* renamed from: io.appmetrica.analytics.impl.O3 */
/* loaded from: classes.dex */
public final class C1414O3 implements InterfaceC2106pn {
    @Override // io.appmetrica.analytics.impl.InterfaceC2106pn, p131u1.InterfaceC2814p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1513S3> invoke(List<C1513S3> list, C1513S3 c1513s3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC1517S7 enumC1517S7 = ((C1513S3) it.next()).f5402b;
                EnumC1517S7 enumC1517S72 = c1513s3.f5402b;
                if (enumC1517S7 == enumC1517S72) {
                    if (enumC1517S72 != EnumC1517S7.f5405c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C1513S3) obj).f5402b != EnumC1517S7.f5405c) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC2659i.m5116f0(arrayList, c1513s3);
                }
            }
        }
        return AbstractC2659i.m5116f0(list, c1513s3);
    }
}
