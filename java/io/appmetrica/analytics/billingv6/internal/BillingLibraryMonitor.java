package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.C0997d;
import io.appmetrica.analytics.billingv6.impl.C1000g;
import io.appmetrica.analytics.billingv6.impl.C1012s;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor {

    /* renamed from: a */
    private final Context f4231a;

    /* renamed from: b */
    private final Executor f4232b;

    /* renamed from: c */
    private final Executor f4233c;

    /* renamed from: d */
    private final BillingInfoSender f4234d;

    /* renamed from: e */
    private final BillingInfoManager f4235e;

    /* renamed from: f */
    private final UpdatePolicy f4236f;

    /* renamed from: g */
    private BillingConfig f4237g;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f4231a = context;
        this.f4232b = executor;
        this.f4233c = executor2;
        this.f4234d = billingInfoSender;
        this.f4235e = billingInfoManager;
        this.f4236f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        this.f4237g = billingConfig;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        final BillingConfig billingConfig = this.f4237g;
        if (billingConfig == null) {
            return;
        }
        this.f4233c.execute(new SafeRunnable() { // from class: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$onSessionResumed$1
            /* JADX WARN: Type inference failed for: r3v0, types: [io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$onSessionResumed$1$runSafety$1] */
            @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
            public void runSafety() {
                Context context;
                context = BillingLibraryMonitor.this.f4231a;
                BillingClient build = BillingClient.newBuilder(context).setListener(new C1012s()).enablePendingPurchases().build();
                BillingConfig billingConfig2 = billingConfig;
                final BillingLibraryMonitor billingLibraryMonitor = BillingLibraryMonitor.this;
                ?? r3 = new UtilsProvider() { // from class: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$onSessionResumed$1$runSafety$1
                    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
                    public BillingInfoManager getBillingInfoManager() {
                        BillingInfoManager billingInfoManager;
                        billingInfoManager = BillingLibraryMonitor.this.f4235e;
                        return billingInfoManager;
                    }

                    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
                    public BillingInfoSender getBillingInfoSender() {
                        BillingInfoSender billingInfoSender;
                        billingInfoSender = BillingLibraryMonitor.this.f4234d;
                        return billingInfoSender;
                    }

                    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
                    public Executor getUiExecutor() {
                        Executor executor;
                        executor = BillingLibraryMonitor.this.f4233c;
                        return executor;
                    }

                    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
                    public UpdatePolicy getUpdatePolicy() {
                        UpdatePolicy updatePolicy;
                        updatePolicy = BillingLibraryMonitor.this.f4236f;
                        return updatePolicy;
                    }

                    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
                    public Executor getWorkerExecutor() {
                        Executor executor;
                        executor = BillingLibraryMonitor.this.f4232b;
                        return executor;
                    }
                };
                build.startConnection(new C0997d(billingConfig2, build, r3, new C1000g(build, r3)));
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ BillingLibraryMonitor(android.content.Context r10, java.util.concurrent.Executor r11, java.util.concurrent.Executor r12, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage r13, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender r14, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager r15, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy r16, int r17, kotlin.jvm.internal.AbstractC2489f r18) {
        /*
            r9 = this;
            r0 = r17 & 32
            if (r0 == 0) goto Lc
            io.appmetrica.analytics.billingv6.impl.e r0 = new io.appmetrica.analytics.billingv6.impl.e
            r5 = r13
            r0.<init>(r13)
            r7 = r0
            goto Le
        Lc:
            r5 = r13
            r7 = r15
        Le:
            r0 = r17 & 64
            if (r0 == 0) goto L1b
            io.appmetrica.analytics.billingv6.impl.u r0 = new io.appmetrica.analytics.billingv6.impl.u
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
            r8 = r0
            goto L1d
        L1b:
            r8 = r16
        L1d:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor.<init>(android.content.Context, java.util.concurrent.Executor, java.util.concurrent.Executor, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy, int, kotlin.jvm.internal.f):void");
    }
}
