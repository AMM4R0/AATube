package p028K;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: K.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0314k0 {

    /* renamed from: a */
    public static final Field f897a;

    /* renamed from: b */
    public static final Field f898b;

    /* renamed from: c */
    public static final Field f899c;

    /* renamed from: d */
    public static final boolean f900d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f897a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f898b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f899c = declaredField3;
            declaredField3.setAccessible(true);
            f900d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
