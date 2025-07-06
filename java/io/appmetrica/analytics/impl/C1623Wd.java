package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Wd */
/* loaded from: classes.dex */
public final class C1623Wd {
    /* renamed from: a */
    public static List m3498a(Context context, List list) {
        List mo3418a = new C2176si(context, new SafePackageManager()).mo3418a();
        if (CollectionUtils.areCollectionsEqual(mo3418a, list)) {
            return null;
        }
        return mo3418a;
    }
}
