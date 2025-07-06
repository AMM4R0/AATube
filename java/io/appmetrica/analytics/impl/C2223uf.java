package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uf */
/* loaded from: classes.dex */
public final class C2223uf implements InterfaceC1234Gn {
    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a */
    public final C1184En mo2706a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C1184En(this, true, "");
        }
        return new C1184En(this, false, "Invalid quantity value " + num);
    }
}
