package p028K;

import android.view.View;
import android.view.ViewParent;

/* renamed from: K.V */
/* loaded from: classes.dex */
public abstract class AbstractC0288V {
    /* renamed from: a */
    public static boolean m788a(ViewParent viewParent, View view, float f, float f2, boolean z2) {
        return viewParent.onNestedFling(view, f, f2, z2);
    }

    /* renamed from: b */
    public static boolean m789b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* renamed from: c */
    public static void m790c(ViewParent viewParent, View view, int r2, int r3, int[] r4) {
        viewParent.onNestedPreScroll(view, r2, r3, r4);
    }

    /* renamed from: d */
    public static void m791d(ViewParent viewParent, View view, int r2, int r3, int r4, int r5) {
        viewParent.onNestedScroll(view, r2, r3, r4, r5);
    }

    /* renamed from: e */
    public static void m792e(ViewParent viewParent, View view, View view2, int r3) {
        viewParent.onNestedScrollAccepted(view, view2, r3);
    }

    /* renamed from: f */
    public static boolean m793f(ViewParent viewParent, View view, View view2, int r3) {
        return viewParent.onStartNestedScroll(view, view2, r3);
    }

    /* renamed from: g */
    public static void m794g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
