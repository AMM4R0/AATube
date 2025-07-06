package p065Y0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0548c {

    /* renamed from: a */
    public static final ThreadLocal f1535a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f1536b = new ThreadLocal();

    /* renamed from: a */
    public static void m1404a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m1404a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
