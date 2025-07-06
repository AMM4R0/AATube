package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Zh */
/* loaded from: classes.dex */
public final class C1701Zh extends C1158Dm {

    /* renamed from: e */
    public final RunnableC1677Yh f5810e;

    /* renamed from: f */
    public final ICommonExecutor f5811f;

    public C1701Zh(C2013m5 c2013m5, InterfaceC1804dl interfaceC1804dl, ICommonExecutor iCommonExecutor) {
        super(c2013m5, interfaceC1804dl);
        this.f5810e = new RunnableC1677Yh(this);
        this.f5811f = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C1158Dm
    /* renamed from: a */
    public final void mo2840a() {
        this.f5811f.remove(this.f5810e);
    }

    @Override // io.appmetrica.analytics.impl.C1158Dm
    /* renamed from: f */
    public final void mo2845f() {
        this.f4680d.mo3767a();
        C1501Rg c1501Rg = (C1501Rg) ((C2013m5) this.f4677a).f6697l.m4598a();
        if (c1501Rg.f5342l.mo3122a(c1501Rg.f5341k)) {
            String str = c1501Rg.f5344n;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                NetworkTask m4609a = C2296xd.m4609a((C2013m5) this.f4677a);
                C2018ma.f6725C.getClass();
                NetworkServiceLocator.getInstance().getNetworkCore().startTask(m4609a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public final void m3577g() {
        synchronized (this.f4678b) {
            try {
                if (!this.f4679c) {
                    this.f5811f.remove(this.f5810e);
                    m3578h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m3578h() {
        if (((C1501Rg) ((C2013m5) this.f4677a).f6697l.m4598a()).f5338h > 0) {
            this.f5811f.executeDelayed(this.f5810e, TimeUnit.SECONDS.toMillis(((C1501Rg) ((C2013m5) this.f4677a).f6697l.m4598a()).f5338h));
        }
    }
}
