package p003B;

/* renamed from: B.r */
/* loaded from: classes.dex */
public final class C0044r {

    /* renamed from: k */
    public static final C0044r f75k;

    /* renamed from: a */
    public final float f76a;

    /* renamed from: b */
    public final float f77b;

    /* renamed from: c */
    public final float f78c;

    /* renamed from: d */
    public final float f79d;

    /* renamed from: e */
    public final float f80e;

    /* renamed from: f */
    public final float f81f;

    /* renamed from: g */
    public final float[] f82g;

    /* renamed from: h */
    public final float f83h;

    /* renamed from: i */
    public final float f84i;

    /* renamed from: j */
    public final float f85j;

    static {
        float[] fArr = AbstractC0028b.f40c;
        float m172p = (float) ((AbstractC0028b.m172p() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0028b.f38a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-m172p) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * m172p) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(m172p * 5.0d))) + (f11 * m172p);
        float m172p2 = AbstractC0028b.m172p() / fArr[1];
        double d3 = m172p2;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f75k = new C0044r(m172p2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f9, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C0044r(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f81f = f;
        this.f76a = f2;
        this.f77b = f3;
        this.f78c = f4;
        this.f79d = f5;
        this.f80e = f6;
        this.f82g = fArr;
        this.f83h = f7;
        this.f84i = f8;
        this.f85j = f9;
    }
}
