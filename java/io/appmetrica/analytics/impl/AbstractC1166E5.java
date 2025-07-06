package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.E5 */
/* loaded from: classes.dex */
public abstract class AbstractC1166E5 {

    /* renamed from: a */
    public static final Map f4694a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("google", AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f4694a = Collections.unmodifiableMap(hashMap);
    }
}
