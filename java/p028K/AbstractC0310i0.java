package p028K;

import android.view.animation.Interpolator;

/* renamed from: K.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0310i0 {

    /* renamed from: a */
    public final int f891a;

    /* renamed from: b */
    public float f892b;

    /* renamed from: c */
    public final Interpolator f893c;

    /* renamed from: d */
    public final long f894d;

    public AbstractC0310i0(int r12, Interpolator interpolator, long j2) {
        this.f891a = r12;
        this.f893c = interpolator;
        this.f894d = j2;
    }

    /* renamed from: a */
    public long mo867a() {
        return this.f894d;
    }

    /* renamed from: b */
    public float mo868b() {
        Interpolator interpolator = this.f893c;
        return interpolator != null ? interpolator.getInterpolation(this.f892b) : this.f892b;
    }

    /* renamed from: c */
    public int mo869c() {
        return this.f891a;
    }

    /* renamed from: d */
    public void mo870d(float f) {
        this.f892b = f;
    }
}
