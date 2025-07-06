package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.P9 */
/* loaded from: classes.dex */
public final class C1445P9 extends AbstractC1470Q9 {
    @Override // io.appmetrica.analytics.impl.AbstractC1470Q9
    /* renamed from: b */
    public final C1494R9 mo3168b(FeatureInfo featureInfo) {
        return new C1494R9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
