package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.Em */
/* loaded from: classes.dex */
public final class C1183Em {

    /* renamed from: a */
    public final InterfaceC1233Gm f4712a;

    /* renamed from: b */
    public final InterfaceC1233Gm f4713b;

    public C1183Em(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f4712a = new C1786d3(new C1206Fk(context));
            this.f4713b = new C1786d3(new C1098Bc(context));
        } else {
            this.f4712a = new C1691Z7();
            this.f4713b = new C1691Z7();
        }
    }
}
