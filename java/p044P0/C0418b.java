package p044P0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p080e0.C0859k;
import p081e1.C0880f;
import p081e1.C0881g;

/* renamed from: P0.b */
/* loaded from: classes.dex */
public final class C0418b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f1082a;

    /* renamed from: b */
    public final /* synthetic */ Object f1083b;

    public /* synthetic */ C0418b(int r12, Object obj) {
        this.f1082a = r12;
        this.f1083b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1082a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0881g c0881g = ((BottomSheetBehavior) this.f1083b).f2787i;
                if (c0881g != null) {
                    C0880f c0880f = c0881g.f3659a;
                    if (c0880f.f3650i != floatValue) {
                        c0880f.f3650i = floatValue;
                        c0881g.f3663e = true;
                        c0881g.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0859k c0859k = (C0859k) this.f1083b;
                c0859k.f3540c.setAlpha(floatValue2);
                c0859k.f3541d.setAlpha(floatValue2);
                c0859k.f3556s.invalidate();
                break;
            default:
                ((TextInputLayout) this.f1083b).f3061v0.m1401k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
