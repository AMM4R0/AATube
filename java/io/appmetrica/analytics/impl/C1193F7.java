package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2660j;
import p108m1.AbstractC2661k;
import p108m1.AbstractC2665o;

/* renamed from: io.appmetrica.analytics.impl.F7 */
/* loaded from: classes.dex */
public final class C1193F7 implements ClientComponentsInitializer {

    /* renamed from: a */
    public final List f4732a = AbstractC2660j.m5120X("io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C2312y4.m4633h().f7476a.m3544d()) {
            C1198Fc c1198Fc = C2312y4.m4633h().f7487l;
            List list = this.f4732a;
            ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2338z5((String) it.next()));
            }
            Object[] array = arrayList.toArray(new C2338z5[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            C2338z5[] c2338z5Arr = (C2338z5[]) array;
            InterfaceC1173Ec[] interfaceC1173EcArr = (InterfaceC1173Ec[]) Arrays.copyOf(c2338z5Arr, c2338z5Arr.length);
            synchronized (c1198Fc) {
                AbstractC2665o.m5124b0(c1198Fc.f4733a, interfaceC1173EcArr);
            }
        }
    }
}
