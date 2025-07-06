package p144z;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: z.b */
/* loaded from: classes.dex */
public abstract class AbstractC2904b {

    /* renamed from: a */
    public static final Class f9538a;

    /* renamed from: b */
    public static final Field f9539b;

    /* renamed from: c */
    public static final Field f9540c;

    /* renamed from: d */
    public static final Method f9541d;

    /* renamed from: e */
    public static final Method f9542e;

    /* renamed from: f */
    public static final Method f9543f;

    /* renamed from: g */
    public static final Handler f9544g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|2|3|4|(2:5|6)|7|(2:8|9)|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            r0 = 3
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r2 = 2
            r3 = 0
            r4 = 1
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r6.<init>(r7)
            p144z.AbstractC2904b.f9544g = r6
            r6 = 0
            java.lang.String r7 = "android.app.ActivityThread"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
            r7 = r6
        L1c:
            p144z.AbstractC2904b.f9538a = r7
            java.lang.String r7 = "mMainThread"
            java.lang.reflect.Field r7 = r5.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L28
            r7.setAccessible(r4)     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r7 = r6
        L29:
            p144z.AbstractC2904b.f9539b = r7
            java.lang.String r7 = "mToken"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L35
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r5 = r6
        L36:
            p144z.AbstractC2904b.f9540c = r5
            java.lang.Class r5 = p144z.AbstractC2904b.f9538a
            java.lang.String r7 = "performStopActivity"
            if (r5 != 0) goto L40
        L3e:
            r5 = r6
            goto L53
        L40:
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3e
            r8[r3] = r1     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r8[r4] = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L3e
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L3e
        L53:
            p144z.AbstractC2904b.f9541d = r5
            java.lang.Class r5 = p144z.AbstractC2904b.f9538a
            if (r5 != 0) goto L5b
        L59:
            r5 = r6
            goto L6a
        L5b:
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L59
            r8[r3] = r1     // Catch: java.lang.Throwable -> L59
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r8[r4] = r9     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L59
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L59
        L6a:
            p144z.AbstractC2904b.f9542e = r5
            java.lang.Class r5 = p144z.AbstractC2904b.f9538a
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 == r8) goto L78
            r8 = 27
            if (r7 != r8) goto La9
        L78:
            if (r5 != 0) goto L7b
            goto La9
        L7b:
            java.lang.String r7 = "requestRelaunchActivity"
            r8 = 9
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> La9
            r8[r3] = r1     // Catch: java.lang.Throwable -> La9
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r8[r4] = r1     // Catch: java.lang.Throwable -> La9
            r8[r2] = r1     // Catch: java.lang.Throwable -> La9
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La9
            r8[r0] = r1     // Catch: java.lang.Throwable -> La9
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> La9
            r1 = 4
            r8[r1] = r0     // Catch: java.lang.Throwable -> La9
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r2 = 5
            r8[r2] = r1     // Catch: java.lang.Throwable -> La9
            r2 = 6
            r8[r2] = r1     // Catch: java.lang.Throwable -> La9
            r1 = 7
            r8[r1] = r0     // Catch: java.lang.Throwable -> La9
            r1 = 8
            r8[r1] = r0     // Catch: java.lang.Throwable -> La9
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> La9
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> La9
            r6 = r0
        La9:
            p144z.AbstractC2904b.f9543f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p144z.AbstractC2904b.<clinit>():void");
    }
}
