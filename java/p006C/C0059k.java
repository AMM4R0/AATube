package p006C;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p003B.C0033g;
import p003B.C0034h;
import p019H.C0179i;
import p036M1.AbstractC0387m;

/* renamed from: C.k */
/* loaded from: classes.dex */
public class C0059k extends C0057i {

    /* renamed from: k */
    public final Class f119k;

    /* renamed from: l */
    public final Constructor f120l;

    /* renamed from: m */
    public final Method f121m;

    /* renamed from: n */
    public final Method f122n;

    /* renamed from: o */
    public final Method f123o;

    /* renamed from: p */
    public final Method f124p;

    /* renamed from: q */
    public final Method f125q;

    public C0059k() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = m234N(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = mo241O(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f119k = cls;
        this.f120l = constructor;
        this.f121m = method2;
        this.f122n = method3;
        this.f123o = method4;
        this.f124p = method5;
        this.f125q = method;
    }

    /* renamed from: N */
    public static Method m234N(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: H */
    public final void m235H(Object obj) {
        try {
            this.f124p.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: I */
    public final boolean m236I(Context context, Object obj, String str, int r8, int r9, int r10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f121m.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(r8), Integer.valueOf(r9), Integer.valueOf(r10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: J */
    public Typeface mo237J(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f119k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f125q.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: K */
    public final boolean m238K(Object obj) {
        try {
            return ((Boolean) this.f123o.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: L */
    public final boolean m239L() {
        Method method = this.f121m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: M */
    public final Object m240M() {
        try {
            return this.f120l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: O */
    public Method mo241O(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p006C.C0057i, p036M1.AbstractC0379e
    /* renamed from: i */
    public final Typeface mo230i(Context context, C0033g c0033g, Resources resources, int r14) {
        if (!m239L()) {
            return super.mo230i(context, c0033g, resources, r14);
        }
        Object m240M = m240M();
        if (m240M == null) {
            return null;
        }
        for (C0034h c0034h : c0033g.f50a) {
            if (!m236I(context, m240M, c0034h.f51a, c0034h.f55e, c0034h.f52b, c0034h.f53c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0034h.f54d))) {
                m235H(m240M);
                return null;
            }
        }
        if (m238K(m240M)) {
            return mo237J(m240M);
        }
        return null;
    }

    @Override // p006C.C0057i, p036M1.AbstractC0379e
    /* renamed from: j */
    public final Typeface mo231j(Context context, C0179i[] c0179iArr, int r15) {
        Typeface mo237J;
        boolean z2;
        if (c0179iArr.length < 1) {
            return null;
        }
        if (!m239L()) {
            C0179i mo246m = mo246m(r15, c0179iArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo246m.f561a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo246m.f563c).setItalic(mo246m.f564d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0179i c0179i : c0179iArr) {
            if (c0179i.f565e == 0) {
                Uri uri = c0179i.f561a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0387m.m1102E(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m240M = m240M();
        if (m240M == null) {
            return null;
        }
        int length = c0179iArr.length;
        int r5 = 0;
        boolean z3 = false;
        while (r5 < length) {
            C0179i c0179i2 = c0179iArr[r5];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0179i2.f561a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f122n.invoke(m240M, byteBuffer, Integer.valueOf(c0179i2.f562b), null, Integer.valueOf(c0179i2.f563c), Integer.valueOf(c0179i2.f564d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    m235H(m240M);
                    return null;
                }
                z3 = true;
            }
            r5++;
            z3 = z3;
        }
        if (!z3) {
            m235H(m240M);
            return null;
        }
        if (m238K(m240M) && (mo237J = mo237J(m240M)) != null) {
            return Typeface.create(mo237J, r15);
        }
        return null;
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: l */
    public final Typeface mo242l(Context context, Resources resources, int r11, String str, int r13) {
        if (!m239L()) {
            return super.mo242l(context, resources, r11, str, r13);
        }
        Object m240M = m240M();
        if (m240M == null) {
            return null;
        }
        if (!m236I(context, m240M, str, 0, -1, -1, null)) {
            m235H(m240M);
            return null;
        }
        if (m238K(m240M)) {
            return mo237J(m240M);
        }
        return null;
    }
}
