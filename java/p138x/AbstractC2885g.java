package p138x;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.g */
/* loaded from: classes.dex */
public abstract class AbstractC2885g {

    /* renamed from: a */
    public static final ThreadLocal f9507a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f9508b = new ThreadLocal();

    /* renamed from: a */
    public static void m5480a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m5480a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
