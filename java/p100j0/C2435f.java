package p100j0;

import android.animation.TypeEvaluator;
import p001A0.AbstractC0005b;
import p006C.C0054f;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C2435f implements TypeEvaluator {

    /* renamed from: a */
    public C0054f[] f7908a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C0054f[] c0054fArr = (C0054f[]) obj;
        C0054f[] c0054fArr2 = (C0054f[]) obj2;
        if (!AbstractC0005b.m64g(c0054fArr, c0054fArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC0005b.m64g(this.f7908a, c0054fArr)) {
            this.f7908a = AbstractC0005b.m74t(c0054fArr);
        }
        for (int r12 = 0; r12 < c0054fArr.length; r12++) {
            C0054f c0054f = this.f7908a[r12];
            C0054f c0054f2 = c0054fArr[r12];
            C0054f c0054f3 = c0054fArr2[r12];
            c0054f.getClass();
            c0054f.f103a = c0054f2.f103a;
            int r5 = 0;
            while (true) {
                float[] fArr = c0054f2.f104b;
                if (r5 < fArr.length) {
                    c0054f.f104b[r5] = (c0054f3.f104b[r5] * f) + ((1.0f - f) * fArr[r5]);
                    r5++;
                }
            }
        }
        return this.f7908a;
    }
}
