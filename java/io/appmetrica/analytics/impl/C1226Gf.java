package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2492i;
import p105l1.C2634e;
import p105l1.InterfaceC2631b;

/* renamed from: io.appmetrica.analytics.impl.Gf */
/* loaded from: classes.dex */
public final class C1226Gf {

    /* renamed from: a */
    public final C1451Pf f4787a;

    /* renamed from: b */
    public final C2318ya f4788b;

    /* renamed from: c */
    public final C1724ag f4789c;

    /* renamed from: d */
    public final InterfaceC2631b f4790d = new C2634e(new C1151Df(this));

    /* renamed from: e */
    public final InterfaceC2631b f4791e = new C2634e(new C1101Bf(this));

    /* renamed from: f */
    public final InterfaceC2631b f4792f = new C2634e(new C1201Ff(this));

    /* renamed from: g */
    public final ArrayList f4793g = new ArrayList();

    public C1226Gf(C1451Pf c1451Pf, C1699Zf c1699Zf, C2318ya c2318ya, C1724ag c1724ag) {
        this.f4787a = c1451Pf;
        this.f4788b = c2318ya;
        this.f4789c = c1724ag;
    }

    /* renamed from: a */
    public static final InterfaceC2323yf m2909a(C1226Gf c1226Gf) {
        return (InterfaceC2323yf) ((C2634e) c1226Gf.f4790d).m5093a();
    }

    /* renamed from: a */
    public static final void m2910a(C1226Gf c1226Gf, C1500Rf c1500Rf, InterfaceC2323yf interfaceC2323yf) {
        boolean m4911a;
        c1226Gf.f4793g.add(c1500Rf);
        C1724ag c1724ag = c1226Gf.f4789c;
        if (c1500Rf == null) {
            c1724ag.getClass();
        } else {
            SafePackageManager safePackageManager = c1724ag.f5873b;
            Context context = c1724ag.f5872a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c1500Rf.f5333d.ordinal();
            if (ordinal == 1) {
                m4911a = AbstractC2492i.m4911a(c1724ag.f5877f, installerPackageName);
            } else if (ordinal == 2) {
                m4911a = AbstractC2492i.m4911a(c1724ag.f5878g, installerPackageName);
            }
            if (m4911a) {
                c1226Gf.m2911a(c1500Rf);
                return;
            }
        }
        interfaceC2323yf.mo2732a();
    }

    /* renamed from: a */
    public final void m2911a(C1500Rf c1500Rf) {
        C1451Pf c1451Pf = this.f4787a;
        synchronized (c1451Pf) {
            c1451Pf.f5221b = c1500Rf;
            c1451Pf.f5222c = true;
            c1451Pf.f5223d.m3068a(c1500Rf);
            c1451Pf.f5223d.m3073d();
            c1451Pf.m3207a(c1451Pf.f5221b);
        }
    }
}
