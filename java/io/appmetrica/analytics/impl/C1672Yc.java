package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import p105l1.C2632c;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.Yc */
/* loaded from: classes.dex */
public final class C1672Yc implements Converter {

    /* renamed from: a */
    public final C1405Nj f5769a = C2018ma.m4192h().m4206m();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1407Nl[] fromModel(Map<String, ? extends Object> map) {
        C1407Nl c1407Nl;
        Map<String, C1348Lc> mo2832b = this.f5769a.mo2832b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C1348Lc c1348Lc = mo2832b.get(key);
            if (c1348Lc == null || value == null) {
                c1407Nl = null;
            } else {
                c1407Nl = new C1407Nl();
                c1407Nl.f5139a = key;
                c1407Nl.f5140b = (byte[]) c1348Lc.f5001c.fromModel(value);
            }
            if (c1407Nl != null) {
                arrayList.add(c1407Nl);
            }
        }
        Object[] array = arrayList.toArray(new C1407Nl[0]);
        if (array != null) {
            return (C1407Nl[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C1407Nl[] c1407NlArr) {
        Map<String, C1348Lc> mo2832b = this.f5769a.mo2832b();
        ArrayList arrayList = new ArrayList();
        for (C1407Nl c1407Nl : c1407NlArr) {
            C1348Lc c1348Lc = mo2832b.get(c1407Nl.f5139a);
            C2632c c2632c = c1348Lc != null ? new C2632c(c1407Nl.f5139a, c1348Lc.f5001c.toModel(c1407Nl.f5140b)) : null;
            if (c2632c != null) {
                arrayList.add(c2632c);
            }
        }
        return AbstractC2671u.m5129f0(arrayList);
    }
}
