package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.location.impl.h */
/* loaded from: classes.dex */
public final class C2368h implements Consumer {

    /* renamed from: a */
    public final C2373m f7590a;

    public C2368h(C2373m c2373m) {
        this.f7590a = c2373m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(Location location) {
        if (location != null) {
            this.f7590a.updateData(location);
        }
    }
}
