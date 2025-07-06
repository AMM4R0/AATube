package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.Q9 */
/* loaded from: classes.dex */
public abstract class AbstractC1470Q9 {
    /* renamed from: a */
    public final C1494R9 m3233a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo3168b(featureInfo);
        }
        int r02 = featureInfo.reqGlEsVersion;
        if (r02 == 0) {
            return mo3168b(featureInfo);
        }
        return new C1494R9("openGlFeature", r02, (featureInfo.flags & 1) != 0);
    }

    /* renamed from: b */
    public abstract C1494R9 mo3168b(FeatureInfo featureInfo);
}
