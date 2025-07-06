package p074c1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0739a {

    /* renamed from: a */
    public static final int[] f2656a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b */
    public static final String f2657b = AbstractC0739a.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m2017a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f2656a, 0)) != 0) {
            Log.w(f2657b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m2018b(int[] r8) {
        boolean z2 = false;
        boolean z3 = false;
        for (int r6 : r8) {
            if (r6 == 16842910) {
                z2 = true;
            } else if (r6 == 16842908 || r6 == 16842919 || r6 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
