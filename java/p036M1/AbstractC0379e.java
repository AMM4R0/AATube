package p036M1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0001b;
import p000A.AbstractC0002c;
import p003B.C0033g;
import p006C.AbstractC0049a;
import p019H.C0179i;
import p054S1.AbstractC0503b;
import p081e1.C0895u;
import p090i0.AbstractC0978x;
import p140x1.C2892d;
import p140x1.C2893e;
import p144z.AbstractC2905c;
import p144z.AbstractC2906d;

/* renamed from: M1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0379e {

    /* renamed from: a */
    public static long f1024a = 0;

    /* renamed from: b */
    public static Method f1025b = null;

    /* renamed from: c */
    public static boolean f1026c = true;

    /* renamed from: d */
    public static Field f1027d;

    /* renamed from: e */
    public static boolean f1028e;

    public AbstractC0379e() {
        new ConcurrentHashMap();
    }

    /* renamed from: C */
    public static C2892d m1067C(C2893e c2893e, int r3) {
        AbstractC2492i.m4915e(c2893e, "<this>");
        boolean z2 = r3 > 0;
        Integer valueOf = Integer.valueOf(r3);
        if (z2) {
            if (c2893e.f9521c <= 0) {
                r3 = -r3;
            }
            return new C2892d(c2893e.f9519a, c2893e.f9520b, r3);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* renamed from: D */
    public static final String m1068D(int r12) {
        int r13 = 0;
        if (r12 == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        char[] cArr = AbstractC0503b.f1292a;
        char[] cArr2 = {cArr[(r12 >> 28) & 15], cArr[(r12 >> 24) & 15], cArr[(r12 >> 20) & 15], cArr[(r12 >> 16) & 15], cArr[(r12 >> 12) & 15], cArr[(r12 >> 8) & 15], cArr[(r12 >> 4) & 15], cArr[r12 & 15]};
        while (r13 < 8 && cArr2[r13] == '0') {
            r13++;
        }
        if (r13 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m13h("startIndex: ", r13, ", endIndex: 8, size: 8"));
        }
        if (r13 <= 8) {
            return new String(cArr2, r13, 8 - r13);
        }
        throw new IllegalArgumentException(AbstractC0002c.m13h("startIndex: ", r13, " > endIndex: 8"));
    }

    /* renamed from: E */
    public static C2893e m1069E(int r2, int r3) {
        if (r3 > Integer.MIN_VALUE) {
            return new C2893e(r2, r3 - 1, 1);
        }
        C2893e c2893e = C2893e.f9522d;
        return C2893e.f9522d;
    }

    /* renamed from: a */
    public static final boolean m1070a(int r4, int r5, int r6, byte[] a2, byte[] b2) {
        AbstractC2492i.m4915e(a2, "a");
        AbstractC2492i.m4915e(b2, "b");
        for (int r12 = 0; r12 < r6; r12++) {
            if (a2[r12 + r4] != b2[r12 + r5]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m1071b(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static void m1072c(int r02) {
        if (r02 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m1073d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: e */
    public static final void m1074e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* renamed from: f */
    public static int m1075f(Context context, String str) {
        int m5489c;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String m5490d = AbstractC2905c.m5490d(str);
        if (m5490d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                m5489c = AbstractC2905c.m5489c((AppOpsManager) AbstractC2905c.m5487a(context, AppOpsManager.class), m5490d, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager m5493c = AbstractC2906d.m5493c(context);
                m5489c = AbstractC2906d.m5491a(m5493c, m5490d, Binder.getCallingUid(), packageName);
                if (m5489c == 0) {
                    m5489c = AbstractC2906d.m5491a(m5493c, m5490d, myUid, AbstractC2906d.m5492b(context));
                }
            } else {
                m5489c = AbstractC2905c.m5489c((AppOpsManager) AbstractC2905c.m5487a(context, AppOpsManager.class), m5490d, packageName);
            }
            if (m5489c != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static int m1076g(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.C0627q m1077h(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            androidx.emoji2.text.c r0 = new androidx.emoji2.text.c
            r0.<init>()
            goto L11
        Lc:
            s0.i r0 = new s0.i
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            m1073d(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r1 = r5
            goto L7a
        L4b:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.mo1612k(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L59:
            if (r3 >= r6) goto L67
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            C1.v r1 = new C1.v     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            androidx.emoji2.text.q r5 = new androidx.emoji2.text.q
            androidx.emoji2.text.p r0 = new androidx.emoji2.text.p
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p036M1.AbstractC0379e.m1077h(android.content.Context):androidx.emoji2.text.q");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p008C1.C0082n m1078n(javax.net.ssl.SSLSession r6) {
        /*
            m1.r r0 = p108m1.C2668r.f8607a
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7f
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L18
        L12:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
        L18:
            if (r2 != 0) goto L73
            C1.b r2 = p008C1.C0075g.f175b
            C1.g r1 = r2.m255b(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L6b
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L63
            C1.b r3 = p008C1.EnumC0068C.f132b
            r3.getClass()
            C1.C r2 = p008C1.C0070b.m253c(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L47
            if (r3 == 0) goto L47
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L47
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L47
            java.util.List r3 = p011D1.AbstractC0122i.m416f(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L47
            goto L48
        L47:
            r3 = r0
        L48:
            C1.n r4 = new C1.n
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L59
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = p011D1.AbstractC0122i.m416f(r6)
        L59:
            C1.m r6 = new C1.m
            r5 = 0
            r6.<init>(r5, r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L63:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L6b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            r6.<init>(r0)
            throw r6
        L73:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L7f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p036M1.AbstractC0379e.m1078n(javax.net.ssl.SSLSession):C1.n");
    }

    /* renamed from: o */
    public static int m1079o(Context context, int r2, int r3) {
        Integer num;
        TypedValue m1086x = m1086x(context, r2);
        if (m1086x != null) {
            int r02 = m1086x.resourceId;
            num = Integer.valueOf(r02 != 0 ? AbstractC0001b.m3a(context, r02) : m1086x.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : r3;
    }

    /* renamed from: p */
    public static int m1080p(View view, int r3) {
        Context context = view.getContext();
        TypedValue m1088z = m1088z(view.getContext(), view.getClass().getCanonicalName(), r3);
        int r32 = m1088z.resourceId;
        return r32 != 0 ? AbstractC0001b.m3a(context, r32) : m1088z.data;
    }

    /* renamed from: s */
    public static boolean m1081s(int r20) {
        boolean z2;
        if (r20 != 0) {
            ThreadLocal threadLocal = AbstractC0049a.f96a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(r20);
            int green = Color.green(r20);
            int blue = Color.blue(r20);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = red / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = blue / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: t */
    public static boolean m1082t() {
        boolean isEnabled;
        try {
            if (f1025b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1025b == null) {
                f1024a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1025b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1025b.invoke(null, Long.valueOf(f1024a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: u */
    public static boolean m1083u(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: v */
    public static boolean m1084v() {
        return C0380f.f1029d;
    }

    /* renamed from: w */
    public static int m1085w(int r12, int r2, float f) {
        return AbstractC0049a.m192b(AbstractC0049a.m194d(r2, Math.round(Color.alpha(r2) * f)), r12);
    }

    /* renamed from: x */
    public static TypedValue m1086x(Context context, int r3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(r3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: y */
    public static boolean m1087y(Context context, int r2, boolean z2) {
        TypedValue m1086x = m1086x(context, r2);
        return (m1086x == null || m1086x.type != 18) ? z2 : m1086x.data != 0;
    }

    /* renamed from: z */
    public static TypedValue m1088z(Context context, String str, int r4) {
        TypedValue m1086x = m1086x(context, r4);
        if (m1086x != null) {
            return m1086x;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(r4)));
    }

    /* renamed from: A */
    public void mo1089A(View view, float f) {
        if (f1026c) {
            try {
                AbstractC0978x.m2589b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f1026c = false;
            }
        }
        view.setAlpha(f);
    }

    /* renamed from: B */
    public void mo1090B(View view, int r5) {
        if (!f1028e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1027d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f1028e = true;
        }
        Field field = f1027d;
        if (field != null) {
            try {
                f1027d.setInt(view, r5 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public abstract Typeface mo230i(Context context, C0033g c0033g, Resources resources, int r4);

    /* renamed from: j */
    public abstract Typeface mo231j(Context context, C0179i[] c0179iArr, int r3);

    /* renamed from: k */
    public Typeface mo245k(Context context, InputStream inputStream) {
        File m1126y = AbstractC0387m.m1126y(context);
        if (m1126y == null) {
            return null;
        }
        try {
            if (AbstractC0387m.m1115m(m1126y, inputStream)) {
                return Typeface.createFromFile(m1126y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1126y.delete();
        }
    }

    /* renamed from: l */
    public Typeface mo242l(Context context, Resources resources, int r3, String str, int r5) {
        File m1126y = AbstractC0387m.m1126y(context);
        if (m1126y == null) {
            return null;
        }
        try {
            if (AbstractC0387m.m1114l(m1126y, resources, r3)) {
                return Typeface.createFromFile(m1126y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1126y.delete();
        }
    }

    /* renamed from: m */
    public C0179i mo246m(int r11, C0179i[] c0179iArr) {
        int r02 = (r11 & 1) == 0 ? 400 : 700;
        boolean z2 = (r11 & 2) != 0;
        C0179i c0179i = null;
        int r5 = Integer.MAX_VALUE;
        for (C0179i c0179i2 : c0179iArr) {
            int abs = (Math.abs(c0179i2.f563c - r02) * 2) + (c0179i2.f564d == z2 ? 0 : 1);
            if (c0179i == null || r5 > abs) {
                c0179i = c0179i2;
                r5 = abs;
            }
        }
        return c0179i;
    }

    /* renamed from: q */
    public abstract void mo1091q(C0895u c0895u, float f, float f2);

    /* renamed from: r */
    public float mo1092r(View view) {
        if (f1026c) {
            try {
                return AbstractC0978x.m2588a(view);
            } catch (NoSuchMethodError unused) {
                f1026c = false;
            }
        }
        return view.getAlpha();
    }
}
