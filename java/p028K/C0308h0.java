package p028K;

import android.view.WindowInsetsAnimation;

/* renamed from: K.h0 */
/* loaded from: classes.dex */
public final class C0308h0 extends AbstractC0310i0 {

    /* renamed from: e */
    public final WindowInsetsAnimation f890e;

    public C0308h0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f890e = windowInsetsAnimation;
    }

    @Override // p028K.AbstractC0310i0
    /* renamed from: a */
    public final long mo867a() {
        long durationMillis;
        durationMillis = this.f890e.getDurationMillis();
        return durationMillis;
    }

    @Override // p028K.AbstractC0310i0
    /* renamed from: b */
    public final float mo868b() {
        float interpolatedFraction;
        interpolatedFraction = this.f890e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // p028K.AbstractC0310i0
    /* renamed from: c */
    public final int mo869c() {
        int typeMask;
        typeMask = this.f890e.getTypeMask();
        return typeMask;
    }

    @Override // p028K.AbstractC0310i0
    /* renamed from: d */
    public final void mo870d(float f) {
        this.f890e.setFraction(f);
    }
}
