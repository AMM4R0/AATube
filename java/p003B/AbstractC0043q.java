package p003B;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: B.q */
/* loaded from: classes.dex */
public abstract class AbstractC0043q {

    /* renamed from: a */
    public static final ThreadLocal f72a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f73b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f74c = new Object();

    /* renamed from: a */
    public static void m188a(C0039m c0039m, int r4, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f74c) {
            try {
                WeakHashMap weakHashMap = f73b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c0039m);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c0039m, sparseArray);
                }
                sparseArray.append(r4, new C0038l(colorStateList, c0039m.f64a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static Typeface m189b(Context context, int r8) {
        if (context.isRestricted()) {
            return null;
        }
        return m190c(context, r8, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd A[ADDED_TO_REGION] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m190c(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, p003B.AbstractC0028b r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003B.AbstractC0043q.m190c(android.content.Context, int, android.util.TypedValue, int, B.b, boolean, boolean):android.graphics.Typeface");
    }
}
