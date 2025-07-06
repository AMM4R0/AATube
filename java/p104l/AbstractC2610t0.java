package p104l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: l.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC2610t0 {

    /* renamed from: a */
    public static final Method f8473a;

    /* renamed from: b */
    public static final Method f8474b;

    /* renamed from: c */
    public static final Method f8475c;

    /* renamed from: d */
    public static final boolean f8476d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f8473a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f8474b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f8475c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f8476d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
