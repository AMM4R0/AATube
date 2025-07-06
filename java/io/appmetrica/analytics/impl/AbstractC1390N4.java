package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.N4 */
/* loaded from: classes.dex */
public abstract class AbstractC1390N4 extends AbstractC1921id {

    /* renamed from: f */
    public final Object f5112f;

    public AbstractC1390N4(int r12, String str, Object obj, InterfaceC1234Gn interfaceC1234Gn, AbstractC1736b3 abstractC1736b3) {
        super(r12, str, interfaceC1234Gn, abstractC1736b3);
        this.f5112f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1921id, io.appmetrica.analytics.impl.InterfaceC2181sn
    /* renamed from: a */
    public final void mo3106a(C2156rn c2156rn) {
        if (m4012f()) {
            AbstractC1736b3 abstractC1736b3 = this.f6488d;
            int r12 = this.f6486b;
            C2206tn mo3079a = abstractC1736b3.mo3079a(c2156rn, (C2206tn) ((HashMap) c2156rn.f7087a.get(r12)).get(this.f6485a), this);
            if (mo3079a != null) {
                mo2938a(mo3079a);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2938a(C2206tn c2206tn);

    /* renamed from: g */
    public final Object m3107g() {
        return this.f5112f;
    }
}
