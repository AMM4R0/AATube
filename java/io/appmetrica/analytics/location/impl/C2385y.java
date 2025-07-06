package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* renamed from: io.appmetrica.analytics.location.impl.y */
/* loaded from: classes.dex */
public final class C2385y implements LastKnownLocationExtractorProvider {

    /* renamed from: a */
    public final String f7634a;

    /* renamed from: b */
    public final InterfaceC2381u f7635b;

    /* renamed from: c */
    public final String f7636c;

    public C2385y(String str, InterfaceC2381u interfaceC2381u, String str2) {
        this.f7634a = str;
        this.f7635b = interfaceC2381u;
        this.f7636c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2384x getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new C2384x(context, this.f7635b.mo4722a(permissionExtractor), locationListener, this.f7634a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f7636c;
    }
}
