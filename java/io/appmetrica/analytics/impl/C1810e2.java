package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* renamed from: io.appmetrica.analytics.impl.e2 */
/* loaded from: classes.dex */
public final class C1810e2 implements AppSetIdListener {

    /* renamed from: a */
    public final /* synthetic */ C1835f2 f6116a;

    public C1810e2(C1835f2 c1835f2) {
        this.f6116a = c1835f2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f6116a.f6186c = new AppSetId(str, appSetIdScope);
        this.f6116a.f6187d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f6116a.f6187d.countDown();
    }
}
