package p104l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: l.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC2619w0 {

    /* renamed from: a */
    public static final Field f8505a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f8505a = field;
    }
}
