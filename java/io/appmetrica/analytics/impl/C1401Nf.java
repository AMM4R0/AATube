package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.Nf */
/* loaded from: classes.dex */
public final class C1401Nf implements InterfaceC1251Hf {

    /* renamed from: a */
    public final boolean f5127a;

    /* renamed from: b */
    public final C1726ai f5128b;

    /* renamed from: c */
    public final C2272we f5129c;

    /* renamed from: d */
    public final C1368M7 f5130d;

    /* renamed from: e */
    public final C1600Vf f5131e;

    /* renamed from: f */
    public final Handler f5132f;

    public C1401Nf(C1726ai c1726ai, C2272we c2272we, Handler handler) {
        this(c1726ai, c2272we, handler, c2272we.m4578r());
    }

    /* renamed from: a */
    public final void m3119a() {
        if (this.f5127a) {
            return;
        }
        C1726ai c1726ai = this.f5128b;
        ResultReceiverC1650Xf resultReceiverC1650Xf = new ResultReceiverC1650Xf(this.f5132f, this);
        c1726ai.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC1650Xf);
        HashMap hashMap = AbstractC1521Sb.f5412a;
        C2123qf c2123qf = C2123qf.f6997e;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4("", "", 4098, 0, c2123qf);
        c1987l4.f5633m = bundle;
        C1688Z4 c1688z4 = c1726ai.f5882a;
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c1688z4), c1688z4, 1, null);
    }

    public C1401Nf(C1726ai c1726ai, C2272we c2272we, Handler handler, boolean z2) {
        this(c1726ai, c2272we, handler, z2, new C1368M7(z2), new C1600Vf());
    }

    public C1401Nf(C1726ai c1726ai, C2272we c2272we, Handler handler, boolean z2, C1368M7 c1368m7, C1600Vf c1600Vf) {
        this.f5128b = c1726ai;
        this.f5129c = c2272we;
        this.f5127a = z2;
        this.f5130d = c1368m7;
        this.f5131e = c1600Vf;
        this.f5132f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1251Hf
    /* renamed from: a */
    public final void mo2940a(C1500Rf c1500Rf) {
        String str = c1500Rf == null ? null : c1500Rf.f5330a;
        if (this.f5127a) {
            return;
        }
        synchronized (this) {
            C1368M7 c1368m7 = this.f5130d;
            this.f5131e.getClass();
            c1368m7.f5030d = C1600Vf.m3419a(str);
            c1368m7.m3082a();
        }
    }

    /* renamed from: a */
    public final synchronized void m3121a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C1368M7 c1368m7 = this.f5130d;
            c1368m7.f5029c = deferredDeeplinkParametersListener;
            if (c1368m7.f5027a) {
                c1368m7.m3083a(1);
            } else {
                c1368m7.m3082a();
            }
            this.f5129c.m4580t();
        } catch (Throwable th) {
            this.f5129c.m4580t();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m3120a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C1368M7 c1368m7 = this.f5130d;
            c1368m7.f5028b = deferredDeeplinkListener;
            if (c1368m7.f5027a) {
                c1368m7.m3083a(1);
            } else {
                c1368m7.m3082a();
            }
            this.f5129c.m4580t();
        } catch (Throwable th) {
            this.f5129c.m4580t();
            throw th;
        }
    }
}
