package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.T */
/* loaded from: classes.dex */
public final class C1534T implements InterfaceC2343za {

    /* renamed from: a */
    public final String f5438a;

    /* renamed from: b */
    public final Object f5439b;

    /* renamed from: c */
    public C2354zl f5440c;

    /* renamed from: d */
    public volatile FutureTask f5441d;

    /* renamed from: e */
    public final InterfaceC1435P f5442e;

    /* renamed from: f */
    public final InterfaceC1435P f5443f;

    /* renamed from: g */
    public final InterfaceC1435P f5444g;

    /* renamed from: h */
    public final InterfaceC1160E f5445h;

    /* renamed from: i */
    public final InterfaceC1160E f5446i;

    /* renamed from: j */
    public final InterfaceC1160E f5447j;

    /* renamed from: k */
    public Context f5448k;

    /* renamed from: l */
    public final ICommonExecutor f5449l;

    /* renamed from: m */
    public volatile AdvertisingIdsHolder f5450m;

    public C1534T(InterfaceC1435P interfaceC1435P, InterfaceC1435P interfaceC1435P2, InterfaceC1435P interfaceC1435P3, ICommonExecutor iCommonExecutor, String str) {
        this(interfaceC1435P, interfaceC1435P2, interfaceC1435P3, iCommonExecutor, new C1235H(new C1799dg("google")), new C1235H(new C1799dg("huawei")), new C1235H(new C1799dg("yandex")), str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2343za
    /* renamed from: a */
    public final void mo3335a(Context context, C2354zl c2354zl) {
        this.f5440c = c2354zl;
        mo3337b(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2343za
    /* renamed from: b */
    public final void mo3337b(Context context) {
        this.f5448k = context.getApplicationContext();
        if (this.f5441d == null) {
            synchronized (this.f5439b) {
                try {
                    if (this.f5441d == null) {
                        this.f5441d = new FutureTask(new CallableC1310K(this));
                        this.f5449l.execute(this.f5441d);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public final InterfaceC1435P m3338c() {
        return this.f5443f;
    }

    /* renamed from: d */
    public final String m3339d() {
        return this.f5438a;
    }

    /* renamed from: e */
    public final InterfaceC1435P m3340e() {
        return this.f5444g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final AdvertisingIdsHolder getIdentifiers(Context context) {
        mo3337b(context);
        try {
            this.f5441d.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f5450m;
    }

    public C1534T(InterfaceC1435P interfaceC1435P, InterfaceC1435P interfaceC1435P2, InterfaceC1435P interfaceC1435P3, ICommonExecutor iCommonExecutor, C1235H c1235h, C1235H c1235h2, C1235H c1235h3, String str) {
        this.f5439b = new Object();
        this.f5442e = interfaceC1435P;
        this.f5443f = interfaceC1435P2;
        this.f5444g = interfaceC1435P3;
        this.f5445h = c1235h;
        this.f5446i = c1235h2;
        this.f5447j = c1235h3;
        this.f5449l = iCommonExecutor;
        this.f5450m = new AdvertisingIdsHolder();
        this.f5438a = AbstractC0002c.m16k("[AdvertisingIdGetter", str, "]");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2343za, io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final void mo2780a(C2354zl c2354zl) {
        this.f5440c = c2354zl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2343za
    /* renamed from: a */
    public final AdvertisingIdsHolder mo3333a(Context context) {
        return mo3334a(context, new C2346zd());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2343za
    /* renamed from: a */
    public final AdvertisingIdsHolder mo3334a(Context context, InterfaceC1951ji interfaceC1951ji) {
        FutureTask futureTask = new FutureTask(new CallableC1335L(this, context.getApplicationContext(), interfaceC1951ji));
        this.f5449l.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f5450m;
    }

    /* renamed from: b */
    public static AdTrackingInfoResult m3331b(C1534T c1534t, Context context) {
        if (c1534t.f5443f.mo3074a(c1534t.f5440c)) {
            return c1534t.f5446i.mo2848a(context);
        }
        C2354zl c2354zl = c1534t.f5440c;
        if (c2354zl != null && c2354zl.f7554p) {
            if (!c2354zl.f7552n.f4726e) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m3330a(C1534T c1534t, Context context) {
        if (c1534t.f5442e.mo3074a(c1534t.f5440c)) {
            return c1534t.f5445h.mo2848a(context);
        }
        C2354zl c2354zl = c1534t.f5440c;
        if (c2354zl != null && c2354zl.f7554p) {
            if (!c2354zl.f7552n.f4724c) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: b */
    public final InterfaceC1435P m3336b() {
        return this.f5442e;
    }

    /* renamed from: a */
    public final ICommonExecutor m3332a() {
        return this.f5449l;
    }
}
