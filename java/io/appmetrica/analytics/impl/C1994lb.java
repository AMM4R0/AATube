package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lb */
/* loaded from: classes.dex */
public final class C1994lb implements InterfaceC1234Gn {
    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(String str) {
        return str == null ? new C1184En(this, false, "key is null") : str.startsWith("appmetrica") ? new C1184En(this, false, "key starts with appmetrica") : str.length() > 200 ? new C1184En(this, false, "key length more then 200 characters") : new C1184En(this, true, "");
    }
}
