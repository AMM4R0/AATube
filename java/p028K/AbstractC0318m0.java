package p028K;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;

/* renamed from: K.m0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0318m0 {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m910d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m912f() {
        return new WindowInsets.Builder();
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m913g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m926t(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
