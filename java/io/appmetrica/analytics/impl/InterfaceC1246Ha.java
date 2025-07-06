package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ha */
/* loaded from: classes.dex */
public interface InterfaceC1246Ha extends InterfaceC1121Ca, InterfaceC2320yc {
    /* renamed from: a */
    void mo2927a(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    /* synthetic */ void mo2751a(Location location);

    /* renamed from: a */
    void mo2928a(AnrListener anrListener);

    /* renamed from: a */
    void mo2929a(ExternalAttribution externalAttribution);

    /* renamed from: a */
    void mo2930a(C1633Wn c1633Wn);

    /* renamed from: a */
    void mo2931a(EnumC2082p enumC2082p);

    @Override // io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: a */
    /* synthetic */ void mo2796a(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    /* synthetic */ void mo2757a(String str, String str2);

    /* renamed from: a */
    void mo2932a(String str, boolean z2);

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    /* synthetic */ void mo2758a(boolean z2);

    /* renamed from: b */
    void mo2933b(Activity activity);

    /* renamed from: b */
    void mo2934b(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: b */
    /* synthetic */ void mo2797b(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: b */
    /* synthetic */ boolean mo2798b();

    /* renamed from: c */
    void mo2935c();

    /* renamed from: e */
    List<String> mo2936e();
}
