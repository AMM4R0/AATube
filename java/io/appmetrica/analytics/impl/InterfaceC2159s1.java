package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.s1 */
/* loaded from: classes.dex */
public interface InterfaceC2159s1 {
    /* renamed from: a */
    /* synthetic */ void mo2811a(Intent intent);

    /* renamed from: a */
    /* synthetic */ void mo2812a(Intent intent, int r2);

    /* renamed from: a */
    /* synthetic */ void mo2813a(Intent intent, int r2, int r3);

    /* renamed from: a */
    void mo2814a(InterfaceC2134r1 interfaceC2134r1);

    /* renamed from: b */
    /* synthetic */ void mo2815b(Intent intent);

    /* renamed from: c */
    /* synthetic */ void mo2816c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(Bundle bundle);

    void reportData(int r12, Bundle bundle);

    void resumeUserSession(Bundle bundle);
}
