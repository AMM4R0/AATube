package p100j0;

import android.graphics.Paint;
import p003B.C0030d;

/* renamed from: j0.j */
/* loaded from: classes.dex */
public final class C2439j extends AbstractC2442m {

    /* renamed from: d */
    public C0030d f7911d;

    /* renamed from: e */
    public float f7912e;

    /* renamed from: f */
    public C0030d f7913f;

    /* renamed from: g */
    public float f7914g;

    /* renamed from: h */
    public float f7915h;

    /* renamed from: i */
    public float f7916i;

    /* renamed from: j */
    public float f7917j;

    /* renamed from: k */
    public float f7918k;

    /* renamed from: l */
    public Paint.Cap f7919l;

    /* renamed from: m */
    public Paint.Join f7920m;

    /* renamed from: n */
    public float f7921n;

    @Override // p100j0.AbstractC2441l
    /* renamed from: a */
    public final boolean mo4792a() {
        return this.f7913f.m180c() || this.f7911d.m180c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p100j0.AbstractC2441l
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4793b(int[] r7) {
        /*
            r6 = this;
            B.d r0 = r6.f7913f
            boolean r1 = r0.m180c()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f49d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f47b
            if (r1 == r4) goto L1e
            r0.f47b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            B.d r1 = r6.f7911d
            boolean r4 = r1.m180c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f49d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f47b
            if (r7 == r4) goto L3a
            r1.f47b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p100j0.C2439j.mo4793b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f7915h;
    }

    public int getFillColor() {
        return this.f7913f.f47b;
    }

    public float getStrokeAlpha() {
        return this.f7914g;
    }

    public int getStrokeColor() {
        return this.f7911d.f47b;
    }

    public float getStrokeWidth() {
        return this.f7912e;
    }

    public float getTrimPathEnd() {
        return this.f7917j;
    }

    public float getTrimPathOffset() {
        return this.f7918k;
    }

    public float getTrimPathStart() {
        return this.f7916i;
    }

    public void setFillAlpha(float f) {
        this.f7915h = f;
    }

    public void setFillColor(int r2) {
        this.f7913f.f47b = r2;
    }

    public void setStrokeAlpha(float f) {
        this.f7914g = f;
    }

    public void setStrokeColor(int r2) {
        this.f7911d.f47b = r2;
    }

    public void setStrokeWidth(float f) {
        this.f7912e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f7917j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f7918k = f;
    }

    public void setTrimPathStart(float f) {
        this.f7916i = f;
    }
}
