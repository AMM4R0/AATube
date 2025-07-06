package p028K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.C */
/* loaded from: classes.dex */
public abstract class AbstractC0270C {
    /* renamed from: a */
    public static WindowInsets m694a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m695b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m696c(View view) {
        view.requestApplyInsets();
    }
}
