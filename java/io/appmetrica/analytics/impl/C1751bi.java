package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.bi */
/* loaded from: classes.dex */
public final class C1751bi implements InterfaceC1130Cj {

    /* renamed from: a */
    public final C1883h0 f5946a;

    /* renamed from: b */
    public final C2352zj f5947b;

    /* renamed from: c */
    public final ICommonExecutor f5948c;

    public C1751bi(C1883h0 c1883h0, C2352zj c2352zj) {
        this(c1883h0, c2352zj, C2312y4.m4633h().m4639e().m4340c());
    }

    /* renamed from: a */
    public final void m3672a(C1775ch c1775ch) {
        Callable c2199tg;
        ICommonExecutor iCommonExecutor = this.f5948c;
        if (c1775ch.f6051b) {
            C2352zj c2352zj = this.f5947b;
            c2199tg = new C1939j6(c2352zj.f7532a, c2352zj.f7533b, c2352zj.f7534c, c1775ch);
        } else {
            C2352zj c2352zj2 = this.f5947b;
            c2199tg = new C2199tg(c2352zj2.f7533b, c2352zj2.f7534c, c1775ch);
        }
        iCommonExecutor.submit(c2199tg);
    }

    /* renamed from: b */
    public final void m3674b(C1775ch c1775ch) {
        C2352zj c2352zj = this.f5947b;
        C1939j6 c1939j6 = new C1939j6(c2352zj.f7532a, c2352zj.f7533b, c2352zj.f7534c, c1775ch);
        if (this.f5946a.m3903a()) {
            try {
                this.f5948c.submit(c1939j6).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c1939j6.f6158c) {
            return;
        }
        try {
            c1939j6.mo3791a();
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1130Cj
    public final void reportData(int r5, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f5948c;
        C2352zj c2352zj = this.f5947b;
        iCommonExecutor.submit(new C1756bn(c2352zj.f7533b, c2352zj.f7534c, r5, bundle));
    }

    public C1751bi(C1883h0 c1883h0, C2352zj c2352zj, ICommonExecutor iCommonExecutor) {
        this.f5948c = iCommonExecutor;
        this.f5947b = c2352zj;
        this.f5946a = c1883h0;
    }

    /* renamed from: b */
    public final void m3673b(C1748bf c1748bf) {
        ICommonExecutor iCommonExecutor = this.f5948c;
        C2352zj c2352zj = this.f5947b;
        iCommonExecutor.submit(new C1901hi(c2352zj.f7533b, c2352zj.f7534c, c1748bf));
    }

    /* renamed from: a */
    public final void m3671a(C1748bf c1748bf) {
        ICommonExecutor iCommonExecutor = this.f5948c;
        C2352zj c2352zj = this.f5947b;
        iCommonExecutor.submit(new C1523Sd(c2352zj.f7533b, c2352zj.f7534c, c1748bf));
    }
}
