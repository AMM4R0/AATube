package p032L0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p062X.C0539a;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0367a {

    /* renamed from: a */
    public static final LinearInterpolator f1001a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0539a f1002b = new C0539a(C0539a.f1463d);

    /* renamed from: c */
    public static final C0539a f1003c = new C0539a();

    /* renamed from: d */
    public static final C0539a f1004d = new C0539a(C0539a.f1464e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m1035a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: b */
    public static float m1036b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m1035a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m1037c(int r02, int r12, float f) {
        return Math.round(f * (r12 - r02)) + r02;
    }
}
