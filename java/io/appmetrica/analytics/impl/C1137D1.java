package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.D1 */
/* loaded from: classes.dex */
public final class C1137D1 implements InterfaceC2159s1 {

    /* renamed from: a */
    public final ICommonExecutor f4620a;

    /* renamed from: b */
    public final InterfaceC2159s1 f4621b;

    /* renamed from: c */
    public boolean f4622c;

    public C1137D1(InterfaceC2159s1 interfaceC2159s1) {
        this(C2018ma.m4192h().m4214u().m2963b(), interfaceC2159s1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2812a(Intent intent, int r4) {
        this.f4620a.execute(new C2234v1(this, intent, r4));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: b */
    public final void mo2815b(Intent intent) {
        this.f4620a.execute(new C2334z1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: c */
    public final void mo2816c(Intent intent) {
        this.f4620a.execute(new C2309y1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f4620a.execute(new C2184t1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final synchronized void onCreate() {
        this.f4622c = true;
        this.f4620a.execute(new C2209u1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void onDestroy() {
        this.f4620a.removeAll();
        synchronized (this) {
            this.f4622c = false;
        }
        this.f4621b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void pauseUserSession(Bundle bundle) {
        this.f4620a.execute(new C1112C1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void reportData(int r3, Bundle bundle) {
        this.f4620a.execute(new C1062A1(this, r3, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void resumeUserSession(Bundle bundle) {
        this.f4620a.execute(new C1087B1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2813a(Intent intent, int r4, int r5) {
        this.f4620a.execute(new C2259w1(this, intent, r4, r5));
    }

    public C1137D1(IHandlerExecutor iHandlerExecutor, InterfaceC2159s1 interfaceC2159s1) {
        this.f4622c = false;
        this.f4620a = iHandlerExecutor;
        this.f4621b = interfaceC2159s1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2811a(Intent intent) {
        this.f4620a.execute(new C2284x1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2814a(InterfaceC2134r1 interfaceC2134r1) {
        this.f4621b.mo2814a(interfaceC2134r1);
    }
}
