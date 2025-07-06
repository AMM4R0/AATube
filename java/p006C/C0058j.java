package p006C;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p019H.C0179i;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p112o.C2691k;

/* renamed from: C.j */
/* loaded from: classes.dex */
public final class C0058j extends AbstractC0379e {

    /* renamed from: f */
    public static final Class f115f;

    /* renamed from: g */
    public static final Constructor f116g;

    /* renamed from: h */
    public static final Method f117h;

    /* renamed from: i */
    public static final Method f118i;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f116g = constructor;
        f115f = cls;
        f117h = method2;
        f118i = method;
    }

    /* renamed from: F */
    public static boolean m232F(Object obj, ByteBuffer byteBuffer, int r5, int r6, boolean z2) {
        try {
            return ((Boolean) f117h.invoke(obj, byteBuffer, Integer.valueOf(r5), null, Integer.valueOf(r6), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: G */
    public static Typeface m233G(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f115f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f118i.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // p036M1.AbstractC0379e
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface mo230i(android.content.Context r17, p003B.C0033g r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = p006C.C0058j.f116g     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r0 = r18
            B.h[] r3 = r0.f50a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f56f
            java.io.File r7 = p036M1.AbstractC0387m.m1126y(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L59
        L24:
            r8 = r19
            boolean r0 = p036M1.AbstractC0387m.m1114l(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r7 = r6.f52b
            boolean r9 = r6.f53c
            int r6 = r6.f55e
            boolean r0 = m232F(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r5 = r5 + 1
            goto L14
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = m233G(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006C.C0058j.mo230i(android.content.Context, B.g, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: j */
    public final Typeface mo231j(Context context, C0179i[] c0179iArr, int r12) {
        Object obj;
        try {
            obj = f116g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C2691k c2691k = new C2691k();
        for (C0179i c0179i : c0179iArr) {
            Uri uri = c0179i.f561a;
            ByteBuffer byteBuffer = (ByteBuffer) c2691k.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = AbstractC0387m.m1102E(context, uri);
                c2691k.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!m232F(obj, byteBuffer, c0179i.f562b, c0179i.f563c, c0179i.f564d)) {
                return null;
            }
        }
        Typeface m233G = m233G(obj);
        if (m233G == null) {
            return null;
        }
        return Typeface.create(m233G, r12);
    }
}
