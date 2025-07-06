package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* renamed from: io.appmetrica.analytics.impl.jd */
/* loaded from: classes.dex */
public final class C1946jd {

    /* renamed from: a */
    public final C1748bf f6540a;

    /* renamed from: b */
    public final NativeCrashClientModule f6541b;

    /* renamed from: c */
    public final C2283x0 f6542c;

    /* renamed from: d */
    public C2258w0 f6543d;

    public C1946jd(C1748bf c1748bf) {
        this.f6540a = c1748bf;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f6541b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f6542c = new C2283x0();
    }
}
