package p010D0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import p008C1.C0091w;
import p023I0.C0203a;
import p036M1.AbstractC0387m;
import p127t0.InterfaceC2766c;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;
import p130u0.C2787k;
import p133v0.C2855j;
import p139x0.C2888c;

/* renamed from: D0.h */
/* loaded from: classes.dex */
public final class C0110h extends AbstractC0387m {

    /* renamed from: e */
    public final /* synthetic */ int f340e;

    @Override // p036M1.AbstractC0387m
    /* renamed from: b */
    public InterfaceC2766c mo375b(Context context, Looper looper, C0091w c0091w, Object obj, InterfaceC2770g interfaceC2770g, InterfaceC2771h interfaceC2771h) {
        switch (this.f340e) {
            case 1:
                c0091w.getClass();
                Integer num = (Integer) c0091w.f299g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C0203a(context, looper, c0091w, bundle, interfaceC2770g, interfaceC2771h);
            case 2:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.mo375b(context, looper, c0091w, obj, interfaceC2770g, interfaceC2771h);
        }
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: c */
    public InterfaceC2766c mo376c(Context context, Looper looper, C0091w c0091w, Object obj, C2787k c2787k, C2787k c2787k2) {
        switch (this.f340e) {
            case 0:
                return new C0104b(context, looper, 300, c0091w, c2787k, c2787k2);
            case 3:
                return new C2888c(context, looper, c0091w, (C2855j) obj, c2787k, c2787k2);
            default:
                return super.mo376c(context, looper, c0091w, obj, c2787k, c2787k2);
        }
    }
}
