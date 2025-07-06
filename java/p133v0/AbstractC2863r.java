package p133v0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: v0.r */
/* loaded from: classes.dex */
public abstract class AbstractC2863r {

    /* renamed from: a */
    public static final Object f9457a = new Object();

    /* renamed from: b */
    public static boolean f9458b;

    /* renamed from: c */
    public static int f9459c;

    /* renamed from: a */
    public static void m5472a(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m5473b(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: c */
    public static void m5474c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: d */
    public static void m5475d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: e */
    public static boolean m5476e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
