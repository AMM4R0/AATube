package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.O9 */
/* loaded from: classes.dex */
public final class C1420O9 extends AbstractC1470Q9 {
    @Override // io.appmetrica.analytics.impl.AbstractC1470Q9
    @TargetApi(24)
    /* renamed from: b */
    public final C1494R9 mo3168b(FeatureInfo featureInfo) {
        int r2;
        String str = featureInfo.name;
        r2 = featureInfo.version;
        return new C1494R9(str, r2, (featureInfo.flags & 1) != 0);
    }
}
