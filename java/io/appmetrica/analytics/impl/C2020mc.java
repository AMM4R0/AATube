package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.mc */
/* loaded from: classes.dex */
public final class C2020mc extends C1378Mh implements InterfaceC1246Ha {
    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2927a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: b */
    public final void mo2933b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: c */
    public final void mo2935c() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: e */
    public final List<String> mo2936e() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C1378Mh, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.C1378Mh, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2751a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: b */
    public final void mo2934b(String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2928a(AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: b */
    public final void mo2797b(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2929a(ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: b */
    public final boolean mo2798b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2930a(C1633Wn c1633Wn) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2931a(EnumC2082p enumC2082p) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC1121Ca
    /* renamed from: a */
    public final void mo2796a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2757a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2932a(String str, boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2758a(boolean z2) {
    }
}
