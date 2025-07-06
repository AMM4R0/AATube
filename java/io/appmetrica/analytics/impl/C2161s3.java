package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.s3 */
/* loaded from: classes.dex */
public final class C2161s3 implements InterfaceC1182El {

    /* renamed from: a */
    public BillingMonitor f7100a;

    /* renamed from: b */
    public final Context f7101b;

    /* renamed from: c */
    public final Executor f7102c;

    /* renamed from: d */
    public final Executor f7103d;

    /* renamed from: e */
    public final BillingType f7104e;

    /* renamed from: f */
    public final BillingInfoStorage f7105f;

    /* renamed from: g */
    public final BillingInfoSender f7106g;

    /* renamed from: h */
    public final ApplicationStateProvider f7107h;

    /* renamed from: i */
    public final C2111q3 f7108i;

    public C2161s3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, C2018ma.m4192h().m4197c(), new C2111q3());
    }

    /* renamed from: a */
    public final void m4409a(C2354zl c2354zl, Boolean bool) {
        BillingMonitor billingLibraryMonitor;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C2111q3 c2111q3 = this.f7108i;
                    Context context = this.f7101b;
                    Executor executor = this.f7102c;
                    Executor executor2 = this.f7103d;
                    BillingType billingType = this.f7104e;
                    BillingInfoStorage billingInfoStorage = this.f7105f;
                    BillingInfoSender billingInfoSender = this.f7106g;
                    c2111q3.getClass();
                    billingLibraryMonitor = AbstractC2086p3.f6882a[billingType.ordinal()] == 1 ? new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null) : new C1592V7();
                    this.f7100a = billingLibraryMonitor;
                } catch (Throwable th) {
                    throw th;
                }
            }
            billingLibraryMonitor.onBillingConfigChanged(c2354zl.f7562x);
            if (this.f7107h.registerStickyObserver(new C2136r3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f7100a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C2161s3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, ApplicationStateProvider applicationStateProvider, C2111q3 c2111q3) {
        this.f7101b = context;
        this.f7102c = executor;
        this.f7103d = executor2;
        this.f7104e = billingType;
        this.f7105f = billingInfoStorage;
        this.f7106g = billingInfoSender;
        this.f7107h = applicationStateProvider;
        this.f7108i = c2111q3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final synchronized void mo2780a(C2354zl c2354zl) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f7100a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c2354zl.f7562x);
        }
    }
}
