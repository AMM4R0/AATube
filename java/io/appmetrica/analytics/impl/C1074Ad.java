package io.appmetrica.analytics.impl;

import java.util.Collection;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Ad */
/* loaded from: classes.dex */
public final class C1074Ad implements InterfaceC1234Gn {

    /* renamed from: a */
    public final String f4464a;

    public C1074Ad(String str) {
        this.f4464a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(Collection<Object> collection) {
        return AbstractC2356zn.m4702a((Collection) collection) ? new C1184En(this, false, AbstractC0002c.m17l(new StringBuilder(), this.f4464a, " is null or empty.")) : new C1184En(this, true, "");
    }
}
