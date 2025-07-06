package p003B;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: B.j */
/* loaded from: classes.dex */
public abstract class AbstractC0036j {
    /* renamed from: a */
    public static Drawable m183a(Resources resources, int r12, Resources.Theme theme) {
        return resources.getDrawable(r12, theme);
    }

    /* renamed from: b */
    public static Drawable m184b(Resources resources, int r12, int r2, Resources.Theme theme) {
        return resources.getDrawableForDensity(r12, r2, theme);
    }
}
