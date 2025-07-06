package p006C;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: C.l */
/* loaded from: classes.dex */
public final class C0060l extends C0059k {
    @Override // p006C.C0059k
    /* renamed from: J */
    public final Typeface mo237J(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f119k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f125q.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p006C.C0059k
    /* renamed from: O */
    public final Method mo241O(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
