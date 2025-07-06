package p090i0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: i0.D */
/* loaded from: classes.dex */
public final class C0951D extends C0950C {
    @Override // p036M1.AbstractC0379e
    /* renamed from: A */
    public final void mo1089A(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p090i0.C0950C, p036M1.AbstractC0379e
    /* renamed from: B */
    public final void mo1090B(View view, int r2) {
        view.setTransitionVisibility(r2);
    }

    @Override // p090i0.C0950C
    /* renamed from: F */
    public final void mo2528F(View view, int r2, int r3, int r4, int r5) {
        view.setLeftTopRightBottom(r2, r3, r4, r5);
    }

    @Override // p090i0.C0950C
    /* renamed from: G */
    public final void mo2529G(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p090i0.C0950C
    /* renamed from: H */
    public final void mo2530H(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: r */
    public final float mo1092r(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
