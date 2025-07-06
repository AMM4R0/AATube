package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.el */
/* loaded from: classes.dex */
public final class C1829el extends HashMap {
    public C1829el() {
        put(EnumC1779cl.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC1779cl.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC1779cl.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
