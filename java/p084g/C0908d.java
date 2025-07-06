package p084g;

import android.animation.TimeInterpolator;

/* renamed from: g.d */
/* loaded from: classes.dex */
public final class C0908d implements TimeInterpolator {

    /* renamed from: a */
    public int[] f3796a;

    /* renamed from: b */
    public int f3797b;

    /* renamed from: c */
    public int f3798c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int r5 = (int) ((f * this.f3798c) + 0.5f);
        int r02 = this.f3797b;
        int[] r12 = this.f3796a;
        int r2 = 0;
        while (r2 < r02) {
            int r3 = r12[r2];
            if (r5 < r3) {
                break;
            }
            r5 -= r3;
            r2++;
        }
        return (r2 / r02) + (r2 < r02 ? r5 / this.f3798c : 0.0f);
    }
}
