package p023I0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC0744a;
import p008C1.C0091w;
import p127t0.InterfaceC2766c;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;

/* renamed from: I0.a */
/* loaded from: classes.dex */
public final class C0203a extends AbstractC0744a implements InterfaceC2766c {

    /* renamed from: A */
    public final Bundle f608A;

    /* renamed from: B */
    public final Integer f609B;

    /* renamed from: y */
    public final boolean f610y;

    /* renamed from: z */
    public final C0091w f611z;

    public C0203a(Context context, Looper looper, C0091w c0091w, Bundle bundle, InterfaceC2770g interfaceC2770g, InterfaceC2771h interfaceC2771h) {
        super(context, looper, 44, c0091w, interfaceC2770g, interfaceC2771h);
        this.f610y = true;
        this.f611z = c0091w;
        this.f608A = bundle;
        this.f609B = (Integer) c0091w.f299g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a, p127t0.InterfaceC2766c
    /* renamed from: k */
    public final boolean mo594k() {
        return this.f610y;
    }

    @Override // p127t0.InterfaceC2766c
    /* renamed from: m */
    public final int mo334m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: n */
    public final IInterface mo335n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0206d ? (C0206d) queryLocalInterface : new C0206d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: p */
    public final Bundle mo595p() {
        C0091w c0091w = this.f611z;
        boolean equals = this.f2701c.getPackageName().equals((String) c0091w.f295c);
        Bundle bundle = this.f608A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0091w.f295c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: r */
    public final String mo337r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: s */
    public final String mo338s() {
        return "com.google.android.gms.signin.service.START";
    }
}
