package p104l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;

/* renamed from: l.A1 */
/* loaded from: classes.dex */
public abstract class AbstractC2502A1 {

    /* renamed from: a */
    public static final Method f8185a;

    /* renamed from: b */
    public static final boolean f8186b;

    static {
        f8186b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f8185a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static boolean m4922a(View view) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return view.getLayoutDirection() == 1;
    }
}
