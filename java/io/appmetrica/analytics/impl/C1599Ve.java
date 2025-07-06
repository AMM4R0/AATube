package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Ve */
/* loaded from: classes.dex */
public final class C1599Ve {

    /* renamed from: a */
    public final C1499Re f5578a;

    public C1599Ve(PreloadInfo preloadInfo, C2123qf c2123qf, boolean z2) {
        if (preloadInfo != null) {
            if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                this.f5578a = new C1499Re(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z2, EnumC1517S7.f5405c);
            } else if (c2123qf.m3367b()) {
                c2123qf.m3360a("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
            }
        }
    }
}
