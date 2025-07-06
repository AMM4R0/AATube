package p062X;

import android.view.animation.Interpolator;

/* renamed from: X.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0540b implements Interpolator {

    /* renamed from: a */
    public final float[] f1465a;

    /* renamed from: b */
    public final float f1466b;

    public AbstractInterpolatorC0540b(float[] fArr) {
        this.f1465a = fArr;
        this.f1466b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1465a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1466b;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * f3) + f4;
    }
}
