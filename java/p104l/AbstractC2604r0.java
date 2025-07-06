package p104l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import p009D.AbstractC0102h;
import p009D.InterfaceC0101g;

/* renamed from: l.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC2604r0 {

    /* renamed from: a */
    public static final int[] f8459a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f8460b = new int[0];

    /* renamed from: c */
    public static final Rect f8461c = new Rect();

    /* renamed from: a */
    public static void m5065a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 29 || r12 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f8459a);
        } else {
            drawable.setState(f8460b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static Rect m5066b(Drawable drawable) {
        int r12;
        int r2;
        int r3;
        int r5;
        int r13 = Build.VERSION.SDK_INT;
        if (r13 >= 29) {
            Insets m5064a = AbstractC2601q0.m5064a(drawable);
            r12 = m5064a.left;
            r2 = m5064a.top;
            r3 = m5064a.right;
            r5 = m5064a.bottom;
            return new Rect(r12, r2, r3, r5);
        }
        boolean z2 = drawable instanceof InterfaceC0101g;
        Object obj = drawable;
        if (z2) {
            ((AbstractC0102h) ((InterfaceC0101g) drawable)).getClass();
            obj = null;
        }
        if (r13 >= 29) {
            boolean z3 = AbstractC2598p0.f8444a;
        } else if (AbstractC2598p0.f8444a) {
            try {
                Object invoke = AbstractC2598p0.f8445b.invoke(obj, null);
                if (invoke != null) {
                    return new Rect(AbstractC2598p0.f8446c.getInt(invoke), AbstractC2598p0.f8447d.getInt(invoke), AbstractC2598p0.f8448e.getInt(invoke), AbstractC2598p0.f8449f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f8461c;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m5067c(int r12, PorterDuff.Mode mode) {
        if (r12 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (r12 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (r12 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (r12) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
