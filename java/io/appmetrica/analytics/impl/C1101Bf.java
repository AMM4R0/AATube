package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.impl.Bf */
/* loaded from: classes.dex */
public final class C1101Bf extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ C1226Gf f4531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101Bf(C1226Gf c1226Gf) {
        super(0);
        this.f4531a = c1226Gf;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return new C1076Af(this.f4531a);
    }
}
