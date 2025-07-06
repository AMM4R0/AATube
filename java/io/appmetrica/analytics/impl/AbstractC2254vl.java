package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashSet;
import java.util.Set;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.vl */
/* loaded from: classes.dex */
public abstract class AbstractC2254vl {

    /* renamed from: a */
    public static final Set f7314a;

    /* renamed from: b */
    public static final SystemTimeProvider f7315b;

    /* renamed from: c */
    public static final C1787d4 f7316c;

    static {
        String[] strArr = {"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2671u.m5125b0(6));
        AbstractC2658h.m5111I(strArr, linkedHashSet);
        f7314a = linkedHashSet;
        f7315b = new SystemTimeProvider();
        f7316c = new C1787d4();
    }

    /* renamed from: a */
    public static final boolean m4526a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0017 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m4525a(io.appmetrica.analytics.impl.C2354zl r5, java.util.Collection r6, java.util.Map r7, p131u1.InterfaceC2799a r8) {
        /*
            r0 = 1
            if (r6 == 0) goto Lad
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lb
            goto Lad
        Lb:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L13
            goto Lad
        L13:
            java.util.Iterator r6 = r6.iterator()
        L17:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            switch(r2) {
                case -1367801046: goto L85;
                case 155670667: goto L75;
                case 299713912: goto L65;
                case 530949152: goto L4c;
                case 703740463: goto L3c;
                case 1117383061: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L8d
        L2b:
            java.lang.String r2 = "appmetrica_device_id"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            goto L8d
        L34:
            java.lang.String r1 = r5.f7539a
            boolean r1 = m4526a(r1)
            goto Laa
        L3c:
            java.lang.String r2 = "appmetrica_report_ad_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L45
            goto L8d
        L45:
            java.lang.String r1 = r5.f7548j
            boolean r1 = m4526a(r1)
            goto Laa
        L4c:
            java.lang.String r2 = "appmetrica_clids"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L55
            goto L8d
        L55:
            io.appmetrica.analytics.impl.d4 r1 = io.appmetrica.analytics.impl.AbstractC2254vl.f7316c
            java.lang.Object r2 = r8.invoke()
            io.appmetrica.analytics.impl.a4 r2 = (io.appmetrica.analytics.impl.C1712a4) r2
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C1787d4.m3723a(r7, r5, r2)
            goto Laa
        L65:
            java.lang.String r2 = "appmetrica_device_id_hash"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            goto L8d
        L6e:
            java.lang.String r1 = r5.f7540b
            boolean r1 = m4526a(r1)
            goto Laa
        L75:
            java.lang.String r2 = "appmetrica_get_ad_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7e
            goto L8d
        L7e:
            java.lang.String r1 = r5.f7547i
            boolean r1 = m4526a(r1)
            goto Laa
        L85:
            java.lang.String r2 = "appmetrica_uuid"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto La4
        L8d:
            boolean r1 = r5.f7561w
            if (r1 != 0) goto Lac
            long r1 = r5.f7553o
            io.appmetrica.analytics.impl.Xl r3 = r5.f7536A
            int r3 = r3.f5697a
            long r3 = (long) r3
            long r1 = r1 + r3
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r3 = io.appmetrica.analytics.impl.AbstractC2254vl.f7315b
            long r3 = r3.currentTimeSeconds()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L17
            goto Lac
        La4:
            java.lang.String r1 = r5.f7542d
            boolean r1 = m4526a(r1)
        Laa:
            if (r1 != 0) goto L17
        Lac:
            r0 = 0
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.AbstractC2254vl.m4525a(io.appmetrica.analytics.impl.zl, java.util.Collection, java.util.Map, u1.a):boolean");
    }
}
