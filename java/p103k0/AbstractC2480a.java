package p103k0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0665o;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p002A1.AbstractC0008a;
import p002A1.AbstractC0017j;
import p005B1.EnumC0048c;
import p006C.C0055g;
import p011D1.AbstractC0119f;
import p034M.AbstractC0372a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p046Q.AbstractC0430d;
import p046Q.AbstractC0431e;
import p051R1.AbstractC0471a;
import p051R1.C0480j;
import p079e.AbstractC0787E;
import p108m1.AbstractC2658h;

/* renamed from: k0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2480a {

    /* renamed from: a */
    public static Field f8144a;

    /* renamed from: b */
    public static boolean f8145b;

    /* renamed from: c */
    public static Class f8146c;

    /* renamed from: d */
    public static boolean f8147d;

    /* renamed from: e */
    public static Field f8148e;

    /* renamed from: f */
    public static boolean f8149f;

    /* renamed from: g */
    public static Field f8150g;

    /* renamed from: h */
    public static boolean f8151h;

    /* renamed from: A */
    public static boolean m4862A(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: D */
    public static List m4863D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC2492i.m4914d(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* renamed from: E */
    public static void m4864E(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    /* renamed from: F */
    public static void m4865F(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    /* renamed from: G */
    public static int m4866G(int r12, Rect rect, Rect rect2) {
        int r13;
        int r2;
        if (r12 == 17) {
            r13 = rect.left;
            r2 = rect2.right;
        } else if (r12 == 33) {
            r13 = rect.top;
            r2 = rect2.bottom;
        } else if (r12 == 66) {
            r13 = rect2.left;
            r2 = rect.right;
        } else {
            if (r12 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            r13 = rect2.top;
            r2 = rect.bottom;
        }
        return Math.max(0, r13 - r2);
    }

    /* renamed from: H */
    public static Typeface m4867H(Configuration configuration, Typeface typeface) {
        int r02;
        int r03;
        int weight;
        int r2;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        r02 = configuration.fontWeightAdjustment;
        if (r02 == Integer.MAX_VALUE) {
            return null;
        }
        r03 = configuration.fontWeightAdjustment;
        if (r03 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        r2 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, AbstractC0387m.m1111i(r2 + weight, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), typeface.isItalic());
        return create;
    }

    /* renamed from: I */
    public static int m4868I(int r12, Rect rect, Rect rect2) {
        if (r12 != 17) {
            if (r12 != 33) {
                if (r12 != 66) {
                    if (r12 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: J */
    public static float m4869J(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0431e.m1170c(edgeEffect, f, f2);
        }
        AbstractC0430d.m1167a(edgeEffect, f, f2);
        return f;
    }

    /* renamed from: K */
    public static final boolean m4870K(String method) {
        AbstractC2492i.m4915e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    /* renamed from: L */
    public static String m4871L(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C0480j c0480j = C0480j.f1218d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC2492i.m4914d(encoded, "getEncoded(...)");
        int length = encoded.length;
        int r4 = 0;
        AbstractC0379e.m1074e(encoded.length, 0, length);
        byte[] m5107E = AbstractC2658h.m5107E(encoded, 0, length);
        C0480j c0480j2 = new C0480j(m5107E);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(m5107E, 0, c0480j2.mo1220b());
        byte[] digest = messageDigest.digest();
        AbstractC2492i.m4912b(digest);
        new C0480j(digest);
        byte[] map = AbstractC0471a.f1199a;
        AbstractC2492i.m4915e(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int r7 = 0;
        while (r4 < length2) {
            byte b2 = digest[r4];
            int r10 = r4 + 2;
            byte b3 = digest[r4 + 1];
            r4 += 3;
            byte b4 = digest[r10];
            bArr[r7] = map[(b2 & 255) >> 2];
            bArr[r7 + 1] = map[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int r9 = r7 + 3;
            bArr[r7 + 2] = map[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            r7 += 4;
            bArr[r9] = map[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[r4];
            bArr[r7] = map[(b5 & 255) >> 2];
            bArr[1 + r7] = map[(b5 & 3) << 4];
            bArr[2 + r7] = 61;
            bArr[r7 + 3] = 61;
        } else if (length3 == 2) {
            int r8 = r4 + 1;
            byte b6 = digest[r4];
            byte b7 = digest[r8];
            bArr[r7] = map[(b6 & 255) >> 2];
            bArr[1 + r7] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr[r7 + 2] = map[(b7 & 15) << 2];
            bArr[r7 + 3] = 61;
        }
        sb.append(new String(bArr, AbstractC0008a.f6a));
        return sb.toString();
    }

    /* renamed from: M */
    public static boolean m4872M(Parcel parcel, int r2) {
        m4880W(parcel, r2, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: N */
    public static final byte[] m4873N(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m4885g(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC2492i.m4914d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* renamed from: O */
    public static int m4874O(Parcel parcel, int r2) {
        m4880W(parcel, r2, 4);
        return parcel.readInt();
    }

    /* renamed from: P */
    public static int m4875P(Parcel parcel, int r3) {
        return (r3 & (-65536)) != -65536 ? (char) (r3 >> 16) : parcel.readInt();
    }

    /* renamed from: Q */
    public static int m4876Q(Context context, int r2, int r3) {
        TypedValue m1086x = AbstractC0379e.m1086x(context, r2);
        return (m1086x == null || m1086x.type != 16) ? r3 : m1086x.data;
    }

    /* renamed from: R */
    public static TimeInterpolator m4877R(Context context, int r6, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(r6, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!m4862A(valueOf, "cubic-bezier") && !m4862A(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m4862A(valueOf, "cubic-bezier")) {
            if (m4862A(valueOf, "path")) {
                return AbstractC0372a.m1046c(AbstractC0005b.m72r(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(StringUtils.COMMA);
        if (split.length == 4) {
            return AbstractC0372a.m1045b(m4892p(split, 0), m4892p(split, 1), m4892p(split, 2), m4892p(split, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    /* renamed from: T */
    public static void m4878T(Parcel parcel, int r2) {
        parcel.setDataPosition(parcel.dataPosition() + m4875P(parcel, r2));
    }

    /* renamed from: V */
    public static int m4879V(Parcel parcel) {
        int readInt = parcel.readInt();
        int m4875P = m4875P(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C0665o(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int r12 = m4875P + dataPosition;
        if (r12 >= dataPosition && r12 <= parcel.dataSize()) {
            return r12;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(r12);
        throw new C0665o(sb.toString(), parcel);
    }

    /* renamed from: W */
    public static void m4880W(Parcel parcel, int r5, int r6) {
        int m4875P = m4875P(parcel, r5);
        if (m4875P == r6) {
            return;
        }
        String hexString = Integer.toHexString(m4875P);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(r6);
        sb.append(" got ");
        sb.append(m4875P);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C0665o(sb.toString(), parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = m4866G(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4881a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m4882b(r9, r10, r11)
            boolean r1 = m4882b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = m4866G(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p103k0.AbstractC2480a.m4881a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m4882b(int r3, Rect rect, Rect rect2) {
        if (r3 != 17) {
            if (r3 != 33) {
                if (r3 != 66) {
                    if (r3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: e */
    public static final void m4883e(C0055g c0055g, String str, String value) {
        AbstractC2492i.m4915e(c0055g, "<this>");
        AbstractC2492i.m4915e(value, "value");
        ArrayList arrayList = (ArrayList) c0055g.f107b;
        arrayList.add(str);
        arrayList.add(AbstractC0017j.m148Z(value).toString());
    }

    /* renamed from: f */
    public static final long m4884f(long j2, EnumC0048c sourceUnit, EnumC0048c targetUnit) {
        AbstractC2492i.m4915e(sourceUnit, "sourceUnit");
        AbstractC2492i.m4915e(targetUnit, "targetUnit");
        return targetUnit.f95a.convert(j2, sourceUnit.f95a);
    }

    /* renamed from: g */
    public static final long m4885g(InputStream inputStream, OutputStream outputStream, int r7) {
        byte[] bArr = new byte[r7];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    /* renamed from: h */
    public static Parcelable m4886h(Parcel parcel, int r2, Parcelable.Creator creator) {
        int m4875P = m4875P(parcel, r2);
        int dataPosition = parcel.dataPosition();
        if (m4875P == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m4875P);
        return parcelable;
    }

    /* renamed from: i */
    public static String m4887i(Parcel parcel, int r3) {
        int m4875P = m4875P(parcel, r3);
        int dataPosition = parcel.dataPosition();
        if (m4875P == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m4875P);
        return readString;
    }

    /* renamed from: j */
    public static Object[] m4888j(Parcel parcel, int r2, Parcelable.Creator creator) {
        int m4875P = m4875P(parcel, r2);
        int dataPosition = parcel.dataPosition();
        if (m4875P == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m4875P);
        return createTypedArray;
    }

    /* renamed from: k */
    public static void m4889k(Parcel parcel, int r4) {
        if (parcel.dataPosition() == r4) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(r4);
        throw new C0665o(sb.toString(), parcel);
    }

    /* renamed from: l */
    public static void m4890l(Object obj) {
        LongSparseArray longSparseArray;
        if (!f8147d) {
            try {
                f8146c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f8147d = true;
        }
        Class cls = f8146c;
        if (cls == null) {
            return;
        }
        if (!f8149f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f8148e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f8149f = true;
        }
        Field field = f8148e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            AbstractC0787E.m2169a(longSparseArray);
        }
    }

    /* renamed from: m */
    public static float m4891m(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0431e.m1169b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: p */
    public static float m4892p(String[] strArr, int r3) {
        float parseFloat = Float.parseFloat(strArr[r3]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: v */
    public static final void m4893v(String name) {
        AbstractC2492i.m4915e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int r12 = 0; r12 < length; r12++) {
            char charAt = name.charAt(r12);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC0387m.m1109g(16);
                String num = Integer.toString(charAt, 16);
                AbstractC2492i.m4914d(num, "toString(...)");
                if (num.length() < 2) {
                    num = CommonUrlParts.Values.FALSE_INTEGER.concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(r12);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: w */
    public static final void m4894w(String value, String str) {
        AbstractC2492i.m4915e(value, "value");
        int length = value.length();
        for (int r12 = 0; r12 < length; r12++) {
            char charAt = value.charAt(r12);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC0387m.m1109g(16);
                String num = Integer.toString(charAt, 16);
                AbstractC2492i.m4914d(num, "toString(...)");
                if (num.length() < 2) {
                    num = CommonUrlParts.Values.FALSE_INTEGER.concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(r12);
                sb.append(" in ");
                sb.append(str);
                sb.append(" value");
                sb.append(AbstractC0119f.m404j(str) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: x */
    public static int m4895x(int r3) {
        if (r3 == 1) {
            return 0;
        }
        if (r3 == 2) {
            return 1;
        }
        if (r3 == 4) {
            return 2;
        }
        if (r3 == 8) {
            return 3;
        }
        if (r3 == 16) {
            return 4;
        }
        if (r3 == 32) {
            return 5;
        }
        if (r3 == 64) {
            return 6;
        }
        if (r3 == 128) {
            return 7;
        }
        if (r3 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* renamed from: y */
    public static boolean m4896y(int r3, Rect rect, Rect rect2) {
        if (r3 == 17) {
            int r32 = rect.right;
            int r02 = rect2.right;
            return (r32 > r02 || rect.left >= r02) && rect.left > rect2.left;
        }
        if (r3 == 33) {
            int r33 = rect.bottom;
            int r03 = rect2.bottom;
            return (r33 > r03 || rect.top >= r03) && rect.top > rect2.top;
        }
        if (r3 == 66) {
            int r34 = rect.left;
            int r04 = rect2.left;
            return (r34 < r04 || rect.right <= r04) && rect.right < rect2.right;
        }
        if (r3 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int r35 = rect.top;
        int r05 = rect2.top;
        return (r35 < r05 || rect.bottom <= r05) && rect.bottom < rect2.bottom;
    }

    /* renamed from: B */
    public abstract boolean mo2432B(View view);

    /* renamed from: C */
    public abstract boolean mo2433C(float f, float f2);

    /* renamed from: S */
    public abstract boolean mo2434S(View view, float f);

    /* renamed from: U */
    public abstract void mo2435U(ViewGroup.MarginLayoutParams marginLayoutParams, int r2, int r3);

    /* renamed from: c */
    public abstract int mo2436c(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: d */
    public abstract float mo2437d(int r12);

    /* renamed from: n */
    public abstract int mo2438n();

    /* renamed from: o */
    public abstract int mo2439o();

    /* renamed from: q */
    public abstract int mo2440q();

    /* renamed from: r */
    public abstract int mo2441r();

    /* renamed from: s */
    public abstract int mo2442s(View view);

    /* renamed from: t */
    public abstract int mo2443t(CoordinatorLayout coordinatorLayout);

    /* renamed from: u */
    public abstract int mo2444u();

    /* renamed from: z */
    public abstract boolean mo2445z(float f);
}
