package p006C;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p003B.C0033g;
import p003B.C0034h;
import p019H.C0179i;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;

/* renamed from: C.i */
/* loaded from: classes.dex */
public class C0057i extends AbstractC0379e {

    /* renamed from: f */
    public static Class f110f = null;

    /* renamed from: g */
    public static Constructor f111g = null;

    /* renamed from: h */
    public static Method f112h = null;

    /* renamed from: i */
    public static Method f113i = null;

    /* renamed from: j */
    public static boolean f114j = false;

    /* renamed from: F */
    public static boolean m228F(Object obj, String str, int r5, boolean z2) {
        m229G();
        try {
            return ((Boolean) f112h.invoke(obj, str, Integer.valueOf(r5), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: G */
    public static void m229G() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f114j) {
            return;
        }
        f114j = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f111g = constructor;
        f110f = cls;
        f112h = method2;
        f113i = method;
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: i */
    public Typeface mo230i(Context context, C0033g c0033g, Resources resources, int r13) {
        m229G();
        try {
            Object newInstance = f111g.newInstance(null);
            for (C0034h c0034h : c0033g.f50a) {
                File m1126y = AbstractC0387m.m1126y(context);
                if (m1126y == null) {
                    return null;
                }
                try {
                    if (!AbstractC0387m.m1114l(m1126y, resources, c0034h.f56f)) {
                        return null;
                    }
                    if (!m228F(newInstance, m1126y.getPath(), c0034h.f52b, c0034h.f53c)) {
                        return null;
                    }
                    m1126y.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m1126y.delete();
                }
            }
            m229G();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f110f, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f113i.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: j */
    public Typeface mo231j(Context context, C0179i[] c0179iArr, int r6) {
        File file;
        String readlink;
        if (c0179iArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo246m(r6, c0179iArr).f561a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface mo245k = mo245k(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo245k;
                }
                Typeface mo245k2 = mo245k(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return mo245k2;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
