package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0008a;
import p002A1.AbstractC0025r;

/* renamed from: io.appmetrica.analytics.impl.N7 */
/* loaded from: classes.dex */
public final class C1393N7 {

    /* renamed from: a */
    public final Context f5115a;

    /* renamed from: b */
    public final C1534T f5116b;

    /* renamed from: c */
    public final C1835f2 f5117c;

    public C1393N7(Context context, C1534T c1534t, C1835f2 c1835f2) {
        this.f5115a = context;
        this.f5116b = c1534t;
        this.f5117c = c1835f2;
    }

    /* renamed from: a */
    public final String m3110a() {
        byte[] bArr;
        AdTrackingInfoResult yandex = this.f5116b.mo3334a(this.f5115a, new C1657Xm(5, 500)).getYandex();
        if (!yandex.isValid()) {
            String id = this.f5117c.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return AbstractC0025r.m154G(id, "-", "");
                    }
                } catch (Throwable unused) {
                }
            }
            return AbstractC0025r.m154G(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        AbstractC2492i.m4912b(adTrackingInfo);
        String str = adTrackingInfo.advId;
        AbstractC2492i.m4912b(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(AbstractC0008a.f6a));
        } catch (NoSuchAlgorithmException unused2) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public C1393N7(Context context) {
        this(context, C2018ma.m4192h().m4215v(), C2018ma.m4192h().m4196b());
    }
}
