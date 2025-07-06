package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.An */
/* loaded from: classes.dex */
public final class C1084An implements InterfaceC1296Ja {
    @Override // io.appmetrica.analytics.impl.InterfaceC1296Ja
    /* renamed from: a */
    public final String mo2738a(Context context) {
        IdentifiersResult m4576p = new C2272we(C1765c7.m3695a(context.getApplicationContext()).m3697a()).m4576p();
        if (TextUtils.isEmpty(m4576p.f7574id)) {
            return null;
        }
        return m4576p.f7574id;
    }
}
