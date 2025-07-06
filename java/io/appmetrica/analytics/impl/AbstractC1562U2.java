package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.U2 */
/* loaded from: classes.dex */
public abstract class AbstractC1562U2 implements ModulePreferences {

    /* renamed from: a */
    public final InterfaceC1406Nk f5515a;

    public AbstractC1562U2(InterfaceC1406Nk interfaceC1406Nk) {
        this.f5515a = interfaceC1406Nk;
    }

    /* renamed from: a */
    public abstract String mo3021a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z2) {
        return ((AbstractC1871gd) this.f5515a).m3885c(str, z2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int r3) {
        return ((AbstractC1871gd) this.f5515a).m3882c(str, r3);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j2) {
        return ((AbstractC1871gd) this.f5515a).m3883c(mo3021a(str), j2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC1871gd) this.f5515a).m3884c(mo3021a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z2) {
        AbstractC1871gd abstractC1871gd = (AbstractC1871gd) this.f5515a;
        ((AbstractC2322ye) ((InterfaceC1406Nk) abstractC1871gd.m4657b(abstractC1871gd.mo2727f(mo3021a(str)), z2))).m4658b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int r3) {
        AbstractC1871gd abstractC1871gd = (AbstractC1871gd) this.f5515a;
        ((AbstractC2322ye) ((InterfaceC1406Nk) abstractC1871gd.m4654b(abstractC1871gd.mo2727f(str), r3))).m4658b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j2) {
        AbstractC1871gd abstractC1871gd = (AbstractC1871gd) this.f5515a;
        ((AbstractC2322ye) ((InterfaceC1406Nk) abstractC1871gd.m4655b(abstractC1871gd.mo2727f(mo3021a(str)), j2))).m4658b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC1871gd abstractC1871gd = (AbstractC1871gd) this.f5515a;
        ((AbstractC2322ye) ((InterfaceC1406Nk) abstractC1871gd.m4656b(abstractC1871gd.mo2727f(mo3021a(str)), str2))).m4658b();
    }
}
