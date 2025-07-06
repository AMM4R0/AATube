package p139x0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC0744a;
import p008C1.C0091w;
import p013E0.AbstractC0126c;
import p124s0.C2733d;
import p130u0.C2787k;
import p133v0.C2855j;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C2888c extends AbstractC0744a {

    /* renamed from: y */
    public final C2855j f9510y;

    public C2888c(Context context, Looper looper, C0091w c0091w, C2855j c2855j, C2787k c2787k, C2787k c2787k2) {
        super(context, looper, 270, c0091w, c2787k, c2787k2);
        this.f9510y = c2855j;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: m */
    public final int mo334m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: n */
    public final IInterface mo335n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C2886a ? (C2886a) queryLocalInterface : new C2886a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: o */
    public final C2733d[] mo336o() {
        return AbstractC0126c.f375b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: p */
    public final Bundle mo595p() {
        this.f9510y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: r */
    public final String mo337r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: s */
    public final String mo338s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: t */
    public final boolean mo339t() {
        return true;
    }
}
