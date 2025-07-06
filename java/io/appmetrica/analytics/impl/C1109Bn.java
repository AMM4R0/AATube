package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.Bn */
/* loaded from: classes.dex */
public final class C1109Bn implements InterfaceC1296Ja {
    @Override // io.appmetrica.analytics.impl.InterfaceC1296Ja
    /* renamed from: a */
    public final String mo2738a(Context context) {
        ProtobufStateStorage<Object> mo3837a;
        C1157Dl c1157Dl;
        try {
            AbstractC2030mm m4116a = C2005lm.m4116a(C1157Dl.class);
            if (m4116a != null && (mo3837a = m4116a.mo3837a(context, m4116a.mo3838c(context))) != null && (c1157Dl = (C1157Dl) mo3837a.read()) != null) {
                return c1157Dl.f4651a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
