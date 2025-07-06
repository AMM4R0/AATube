package p028K;

import android.animation.ValueAnimator;
import android.view.View;
import p006C.C0055g;
import p079e.C0791I;
import p088h1.C0930j;

/* renamed from: K.W */
/* loaded from: classes.dex */
public final /* synthetic */ class C0289W implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f849a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f850b;

    public /* synthetic */ C0289W(C0055g c0055g, View view) {
        this.f850b = c0055g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f849a) {
            case 0:
                ((View) ((C0791I) ((C0055g) this.f850b).f107b).f3183i.getParent()).invalidate();
                break;
            default:
                C0930j c0930j = (C0930j) this.f850b;
                c0930j.getClass();
                c0930j.f3902d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0289W(C0930j c0930j) {
        this.f850b = c0930j;
    }
}
