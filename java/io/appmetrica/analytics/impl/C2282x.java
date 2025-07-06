package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.x */
/* loaded from: classes.dex */
public final class C2282x extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: a */
    public final /* synthetic */ C2207u f7407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2282x(C2207u c2207u) {
        super(1);
        this.f7407a = c2207u;
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        this.f7407a.f7206i = (byte[]) obj;
        return C2636g.f8557a;
    }
}
