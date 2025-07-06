package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Cg */
/* loaded from: classes.dex */
public final class C1127Cg extends AbstractC2249vg {

    /* renamed from: b */
    public final SafePackageManager f4581b;

    public C1127Cg(C2013m5 c2013m5) {
        this(c2013m5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2734a(io.appmetrica.analytics.impl.C1615W5 r10) {
        /*
            r9 = this;
            io.appmetrica.analytics.impl.m5 r0 = r9.f7308a
            io.appmetrica.analytics.impl.Nn r1 = r0.f6707v
            boolean r1 = r1.m3143c()
            r2 = 0
            if (r1 == 0) goto Ld0
            boolean r1 = r0.m4184y()
            if (r1 == 0) goto Ld0
            io.appmetrica.analytics.impl.xe r1 = r0.f6688c
            io.appmetrica.analytics.impl.m5 r3 = r9.f7308a
            io.appmetrica.analytics.impl.xe r3 = r3.f6688c
            java.lang.String r3 = r3.m4618e()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L22
            goto L42
        L22:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L42
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L42
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r3 = r2
        L2d:
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L42
            if (r3 >= r6) goto L43
            io.appmetrica.analytics.impl.R9 r6 = new io.appmetrica.analytics.impl.R9     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r7 = r5.getJSONObject(r3)     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            r4.add(r6)     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + 1
            goto L2d
        L42:
            r4 = 0
        L43:
            java.util.ArrayList r3 = r9.m2801b()     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(r4, r3)     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto L5d
            io.appmetrica.analytics.impl.l9 r10 = r0.f6700o     // Catch: java.lang.Throwable -> Ld0
            int r0 = r10.f6646k     // Catch: java.lang.Throwable -> Ld0
            r10.f6648m = r0     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.xe r10 = r10.f6636a     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.xe r10 = r10.m4611a(r0)     // Catch: java.lang.Throwable -> Ld0
            r10.m4658b()     // Catch: java.lang.Throwable -> Ld0
            goto Ld0
        L5d:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld0
        L66:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto L98
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.R9 r5 = (io.appmetrica.analytics.impl.C1494R9) r5     // Catch: java.lang.Throwable -> Ld0
            r5.getClass()     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld0
            r6.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f5312a     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "required"
            boolean r8 = r5.f5314c     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.f5313b     // Catch: java.lang.Throwable -> Ld0
            r7 = -1
            if (r5 == r7) goto L94
            java.lang.String r7 = "version"
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> Ld0
        L94:
            r4.put(r6)     // Catch: java.lang.Throwable -> Ld0
            goto L66
        L98:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "features"
            org.json.JSONObject r3 = r3.put(r5, r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.W5 r10 = io.appmetrica.analytics.impl.C1615W5.m3461a(r10, r3)     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.l9 r0 = r0.f6700o     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.hk r3 = r0.f6638c     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Tj r3 = r3.m3950b(r10)     // Catch: java.lang.Throwable -> Ld0
            long r5 = r10.f5629i     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.jk r3 = io.appmetrica.analytics.impl.C1903hk.m3946a(r3, r5)     // Catch: java.lang.Throwable -> Ld0
            r0.m4100a(r10, r3)     // Catch: java.lang.Throwable -> Ld0
            int r10 = r0.f6646k     // Catch: java.lang.Throwable -> Ld0
            r0.f6648m = r10     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.xe r0 = r0.f6636a     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.xe r10 = r0.m4611a(r10)     // Catch: java.lang.Throwable -> Ld0
            r10.m4658b()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> Ld0
            r1.m4623i(r10)     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1127Cg.mo2734a(io.appmetrica.analytics.impl.W5):boolean");
    }

    /* renamed from: b */
    public final ArrayList m2801b() {
        FeatureInfo[] featureInfoArr;
        try {
            C2013m5 c2013m5 = this.f7308a;
            SafePackageManager safePackageManager = this.f4581b;
            Context context = c2013m5.f6686a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC1470Q9 c1420o9 = AndroidUtils.isApiAchieved(24) ? new C1420O9() : new C1445P9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c1420o9.m3233a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C1127Cg(C2013m5 c2013m5, SafePackageManager safePackageManager) {
        super(c2013m5);
        this.f4581b = safePackageManager;
    }
}
