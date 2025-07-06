package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Mc */
/* loaded from: classes.dex */
public final class C1373Mc implements ModuleSelfReporter {

    /* renamed from: a */
    public final C2202tj f5056a = AbstractC2059o1.m4252a();

    /* renamed from: b */
    public final int f5057b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        C2202tj c2202tj = this.f5056a;
        c2202tj.getClass();
        c2202tj.m4458a(new C2177sj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        C2202tj c2202tj = this.f5056a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f5057b).withName(str).build();
        c2202tj.getClass();
        c2202tj.m4458a(new C1927ij(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f5056a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        C2202tj c2202tj = this.f5056a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f5057b).withName(str).withAttributes(map).build();
        c2202tj.getClass();
        c2202tj.m4458a(new C1927ij(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        C2202tj c2202tj = this.f5056a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f5057b).withName(str).withValue(str2).build();
        c2202tj.getClass();
        c2202tj.m4458a(new C1927ij(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int r2, String str, String str2) {
        C2202tj c2202tj = this.f5056a;
        ModuleEvent build = ModuleEvent.newBuilder(r2).withName(str).withValue(str2).build();
        c2202tj.getClass();
        c2202tj.m4458a(new C1927ij(build));
    }
}
