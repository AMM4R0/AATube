package io.appmetrica.analytics.impl;

import java.util.Map;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Qh */
/* loaded from: classes.dex */
public final class C1478Qh implements InterfaceC1234Gn {

    /* renamed from: a */
    public final Map f5261a;

    public C1478Qh(Map<String, ?> map) {
        this.f5261a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(String str) {
        return this.f5261a.containsKey(str) ? new C1184En(this, false, AbstractC0002c.m16k("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C1184En(this, true, "");
    }
}
