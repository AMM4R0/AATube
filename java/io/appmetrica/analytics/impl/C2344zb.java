package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import p103k0.AbstractC2480a;

/* renamed from: io.appmetrica.analytics.impl.zb */
/* loaded from: classes.dex */
public final class C2344zb {
    /* renamed from: a */
    public static List m4682a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC1072Ab.m2705a(configuration) : AbstractC2480a.m4863D(AbstractC1872ge.m3893a(configuration.locale));
    }
}
