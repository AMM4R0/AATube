package p090i0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: i0.w */
/* loaded from: classes.dex */
public abstract class AbstractC0977w {

    /* renamed from: a */
    public static final C0950C f4066a;

    /* renamed from: b */
    public static final C0956b f4067b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4066a = new C0951D();
        } else {
            f4066a = new C0950C();
        }
        f4067b = new C0956b(Float.class, "translationAlpha", 5);
        new C0956b(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m2586a(View view, int r7, int r8, int r9, int r10) {
        f4066a.mo2528F(view, r7, r8, r9, r10);
    }

    /* renamed from: b */
    public static void m2587b(View view, int r2) {
        f4066a.mo1090B(view, r2);
    }
}
