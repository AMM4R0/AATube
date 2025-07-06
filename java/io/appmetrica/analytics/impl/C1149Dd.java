package io.appmetrica.analytics.impl;

import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Dd */
/* loaded from: classes.dex */
public final class C1149Dd implements InterfaceC1234Gn {

    /* renamed from: a */
    public final String f4639a;

    public C1149Dd(String str) {
        this.f4639a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a */
    public final C1184En mo2706a(Object obj) {
        return obj == null ? new C1184En(this, false, AbstractC0002c.m17l(new StringBuilder(), this.f4639a, " is null.")) : new C1184En(this, true, "");
    }

    /* renamed from: a */
    public final String m2838a() {
        return this.f4639a;
    }
}
