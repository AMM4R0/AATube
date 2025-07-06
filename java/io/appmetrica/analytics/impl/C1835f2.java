package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.f2 */
/* loaded from: classes.dex */
public final class C1835f2 implements AppSetIdProvider {

    /* renamed from: a */
    public final Context f6184a;

    /* renamed from: b */
    public final IAppSetIdRetriever f6185b;

    /* renamed from: c */
    public volatile AppSetId f6186c;

    /* renamed from: d */
    public CountDownLatch f6187d;

    /* renamed from: e */
    public final long f6188e;

    /* renamed from: f */
    public final C1810e2 f6189f;

    public C1835f2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f6184a = context;
        this.f6185b = iAppSetIdRetriever;
        this.f6187d = new CountDownLatch(1);
        this.f6188e = 20L;
        this.f6189f = new C1810e2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f6186c == null) {
            try {
                this.f6187d = new CountDownLatch(1);
                this.f6185b.retrieveAppSetId(this.f6184a, this.f6189f);
                this.f6187d.await(this.f6188e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f6186c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f6186c = appSetId;
        }
        return appSetId;
    }

    public C1835f2(Context context) {
        this(context, AbstractC1860g2.m3844a());
    }
}
