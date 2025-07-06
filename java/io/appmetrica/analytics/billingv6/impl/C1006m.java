package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.billingv6.impl.m */
/* loaded from: classes.dex */
public final class C1006m extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Map f4209a;

    /* renamed from: b */
    public final /* synthetic */ Map f4210b;

    /* renamed from: c */
    public final /* synthetic */ C1009p f4211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006m(LinkedHashMap linkedHashMap, Map map, C1009p c1009p) {
        super(0);
        this.f4209a = linkedHashMap;
        this.f4210b = map;
        this.f4211c = c1009p;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        Map map = this.f4209a;
        Map map2 = this.f4210b;
        C1009p c1009p = this.f4211c;
        C1013t.m2656a(map, map2, c1009p.f4220d, c1009p.f4219c.getBillingInfoManager());
        return C2636g.f8557a;
    }
}
