package p028K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p006C.C0051c;

/* renamed from: K.b0 */
/* loaded from: classes.dex */
public final class C0296b0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0312j0 f858a;

    /* renamed from: b */
    public final /* synthetic */ C0340x0 f859b;

    /* renamed from: c */
    public final /* synthetic */ C0340x0 f860c;

    /* renamed from: d */
    public final /* synthetic */ int f861d;

    /* renamed from: e */
    public final /* synthetic */ View f862e;

    public C0296b0(C0312j0 c0312j0, C0340x0 c0340x0, C0340x0 c0340x02, int r4, View view) {
        this.f858a = c0312j0;
        this.f859b = c0340x0;
        this.f860c = c0340x02;
        this.f861d = r4;
        this.f862e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        C0312j0 c0312j0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0312j0 c0312j02 = this.f858a;
        c0312j02.f896a.mo870d(animatedFraction);
        float mo868b = c0312j02.f896a.mo868b();
        PathInterpolator pathInterpolator = C0302e0.f874e;
        int r4 = Build.VERSION.SDK_INT;
        C0340x0 c0340x0 = this.f859b;
        AbstractC0324p0 c0322o0 = r4 >= 30 ? new C0322o0(c0340x0) : r4 >= 29 ? new C0320n0(c0340x0) : new C0316l0(c0340x0);
        int r6 = 1;
        while (r6 <= 256) {
            int r7 = this.f861d & r6;
            C0336v0 c0336v0 = c0340x0.f944a;
            if (r7 == 0) {
                c0322o0.mo942c(r6, c0336v0.mo950f(r6));
                f = mo868b;
                c0312j0 = c0312j02;
            } else {
                C0051c mo950f = c0336v0.mo950f(r6);
                C0051c mo950f2 = this.f860c.f944a.mo950f(r6);
                int r9 = (int) (((mo950f.f98a - mo950f2.f98a) * r10) + 0.5d);
                int r11 = (int) (((mo950f.f99b - mo950f2.f99b) * r10) + 0.5d);
                f = mo868b;
                int r12 = (int) (((mo950f.f100c - mo950f2.f100c) * r10) + 0.5d);
                float f2 = (mo950f.f101d - mo950f2.f101d) * (1.0f - mo868b);
                c0312j0 = c0312j02;
                c0322o0.mo942c(r6, C0340x0.m974e(mo950f, r9, r11, r12, (int) (f2 + 0.5d)));
            }
            r6 <<= 1;
            mo868b = f;
            c0312j02 = c0312j0;
        }
        C0302e0.m832g(this.f862e, c0322o0.mo892b(), Collections.singletonList(c0312j02));
    }
}
