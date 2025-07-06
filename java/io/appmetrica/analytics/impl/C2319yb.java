package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.yb */
/* loaded from: classes.dex */
public final class C2319yb implements InterfaceC2110q2 {

    /* renamed from: a */
    public final C1215G4 f7495a;

    public C2319yb(C1215G4 c1215g4) {
        this.f7495a = c1215g4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2110q2
    /* renamed from: a */
    public final C2206tn mo3301a(C2156rn c2156rn, C2206tn c2206tn) {
        int r02 = c2156rn.f7088b;
        int r12 = this.f7495a.f4766a;
        if (r02 == r12) {
            if (((C2206tn) ((HashMap) c2156rn.f7087a.get(c2206tn.f7185b)).get(new String(c2206tn.f7184a))) != null) {
                ((HashMap) c2156rn.f7087a.get(c2206tn.f7185b)).put(new String(c2206tn.f7184a), c2206tn);
            }
        } else if (r02 < r12) {
            ((HashMap) c2156rn.f7087a.get(c2206tn.f7185b)).put(new String(c2206tn.f7184a), c2206tn);
            c2156rn.f7088b++;
        }
        return c2206tn;
    }
}
