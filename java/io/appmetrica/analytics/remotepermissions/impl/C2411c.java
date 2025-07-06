package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p002A1.AbstractC0008a;
import p108m1.AbstractC2659i;
import p108m1.AbstractC2661k;
import p108m1.C2670t;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.c */
/* loaded from: classes.dex */
public final class C2411c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2414f fromModel(C2409a c2409a) {
        C2414f c2414f = new C2414f();
        Set set = c2409a.f7803a;
        ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(AbstractC0008a.f6a));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c2414f.f7811a = (byte[][]) array;
        return c2414f;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2409a toModel(C2414f c2414f) {
        Set set;
        byte[][] bArr = c2414f.f7811a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, AbstractC0008a.f6a));
            }
            set = AbstractC2659i.m5119i0(arrayList);
        } else {
            set = C2670t.f8609a;
        }
        return new C2409a(set);
    }
}
