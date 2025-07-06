package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.Sm */
/* loaded from: classes.dex */
public class C1532Sm implements InterfaceC1234Gn {

    /* renamed from: a */
    public final InterfaceC1234Gn f5436a;

    public C1532Sm(InterfaceC1234Gn interfaceC1234Gn) {
        this.f5436a = interfaceC1234Gn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a */
    public final C1184En mo2706a(Object obj) {
        C1184En mo2706a = this.f5436a.mo2706a(obj);
        if (mo2706a.f4714a) {
            return mo2706a;
        }
        throw new ValidationException(mo2706a.f4715b);
    }

    /* renamed from: a */
    public final InterfaceC1234Gn m3327a() {
        return this.f5436a;
    }
}
