package p010D0;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC0744a;
import p116p0.AbstractC2708c;
import p124s0.C2733d;

/* renamed from: D0.b */
/* loaded from: classes.dex */
public final class C0104b extends AbstractC0744a {
    @Override // p127t0.InterfaceC2766c
    /* renamed from: m */
    public final int mo334m() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: n */
    public final /* synthetic */ IInterface mo335n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C0105c ? (C0105c) queryLocalInterface : new C0105c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: o */
    public final C2733d[] mo336o() {
        return AbstractC2708c.f8728b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: r */
    public final String mo337r() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: s */
    public final String mo338s() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0744a
    /* renamed from: t */
    public final boolean mo339t() {
        return true;
    }
}
