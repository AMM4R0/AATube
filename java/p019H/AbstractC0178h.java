package p019H;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p112o.C2686f;
import p112o.C2691k;

/* renamed from: H.h */
/* loaded from: classes.dex */
public abstract class AbstractC0178h {

    /* renamed from: a */
    public static final C2686f f557a = new C2686f(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f558b;

    /* renamed from: c */
    public static final Object f559c;

    /* renamed from: d */
    public static final C2691k f560d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0181k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f558b = threadPoolExecutor;
        f559c = new Object();
        f560d = new C2691k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p019H.C0177g m538a(java.lang.String r6, android.content.Context r7, p008C1.C0090v r8, int r9) {
        /*
            o.f r0 = p019H.AbstractC0178h.f557a
            java.lang.Object r1 = r0.m5169a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            H.g r6 = new H.g
            r6.<init>(r1)
            return r6
        L10:
            G1.t r8 = p019H.AbstractC0174d.m536a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f533b
            H.i[] r3 = (p019H.C0179i[]) r3
            int r8 = r8.f532a
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = r2
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f565e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            H.g r6 = new H.g
            r6.<init>(r1)
            return r6
        L45:
            M1.e r8 = p006C.AbstractC0056h.f108a
            android.graphics.Typeface r7 = r8.mo231j(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.m5170b(r6, r7)
            H.g r6 = new H.g
            r6.<init>(r7)
            return r6
        L56:
            H.g r6 = new H.g
            r6.<init>(r2)
            return r6
        L5c:
            H.g r6 = new H.g
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p019H.AbstractC0178h.m538a(java.lang.String, android.content.Context, C1.v, int):H.g");
    }
}
