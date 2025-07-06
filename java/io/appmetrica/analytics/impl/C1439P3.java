package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.P3 */
/* loaded from: classes.dex */
public final class C1439P3 implements InterfaceC1142D6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1142D6
    /* renamed from: a */
    public final void mo2827a(Context context) {
        CountDownLatch countDownLatch = AbstractC1291J5.f4899a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = AbstractC1291J5.f4900b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            AbstractC1291J5.f4899a = null;
        }
    }
}
