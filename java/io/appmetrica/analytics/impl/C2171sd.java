package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2491h;
import p105l1.C2636g;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.sd */
/* loaded from: classes.dex */
public final /* synthetic */ class C2171sd extends AbstractC2491h implements InterfaceC2810l {
    public C2171sd(C2196td c2196td) {
        super(1, c2196td, C2196td.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V");
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        C2196td c2196td = (C2196td) this.receiver;
        c2196td.f7167a.markCrashCompleted((String) obj);
        c2196td.f7167a.deleteCompletedCrashes();
        return C2636g.f8557a;
    }
}
