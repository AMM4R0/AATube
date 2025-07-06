package p006C;

import android.graphics.Path;
import android.util.Log;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import p001A0.AbstractC0005b;

/* renamed from: C.f */
/* loaded from: classes.dex */
public final class C0054f {

    /* renamed from: a */
    public char f103a;

    /* renamed from: b */
    public final float[] f104b;

    public C0054f(char c, float[] fArr) {
        this.f103a = c;
        this.f104b = fArr;
    }

    /* renamed from: a */
    public static void m201a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3) {
        double d2;
        double d3;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = f;
        double d5 = f2;
        double d6 = (d5 * sin) + (d4 * cos);
        double d7 = d4;
        double d8 = f5;
        double d9 = d6 / d8;
        double d10 = f6;
        double d11 = ((d5 * cos) + ((-f) * sin)) / d10;
        double d12 = d5;
        double d13 = f4;
        double d14 = ((d13 * sin) + (f3 * cos)) / d8;
        double d15 = ((d13 * cos) + ((-f3) * sin)) / d10;
        double d16 = d9 - d14;
        double d17 = d11 - d15;
        double d18 = (d9 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m201a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z2 == z3) {
            d2 = d18 - d23;
            d3 = d19 + d22;
        } else {
            d2 = d18 + d23;
            d3 = d19 - d22;
        }
        double atan2 = Math.atan2(d11 - d3, d9 - d2);
        double atan22 = Math.atan2(d15 - d3, d14 - d2) - atan2;
        if (z3 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d2 * d8;
        double d25 = d3 * d10;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d8;
        double d29 = d28 * cos2;
        double d30 = d10 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d10 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = d33;
        double d36 = atan22 / ceil;
        int r3 = 0;
        while (r3 < ceil) {
            double d37 = atan2 + d36;
            double sin4 = Math.sin(d37);
            double cos4 = Math.cos(d37);
            double d38 = d36;
            double d39 = (((d8 * cos2) * cos4) + d26) - (d30 * sin4);
            double d40 = d35;
            double d41 = d26;
            double d42 = (d40 * sin4) + (d8 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d40) + (sin4 * d32);
            double d45 = d37 - atan2;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * sqrt3) + d7), (float) ((d34 * sqrt3) + d12), (float) (d39 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d39, (float) d42);
            r3++;
            atan2 = d37;
            d32 = d32;
            cos2 = cos2;
            ceil = ceil;
            d34 = d44;
            d8 = d8;
            d31 = d43;
            d7 = d39;
            d12 = d42;
            d26 = d41;
            d36 = d38;
            d35 = d40;
        }
    }

    /* renamed from: b */
    public static void m202b(C0054f[] c0054fArr, Path path) {
        int r22;
        int r32;
        char c;
        int r30;
        int r27;
        C0054f c0054f;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        C0054f[] c0054fArr2 = c0054fArr;
        int r12 = 6;
        float[] fArr = new float[6];
        int length = c0054fArr2.length;
        int r10 = 0;
        char c2 = 'm';
        while (r10 < length) {
            C0054f c0054f2 = c0054fArr2[r10];
            char c3 = c0054f2.f103a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    r22 = 7;
                    break;
                case 'C':
                case 'c':
                    r22 = r12;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    r22 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    r22 = 4;
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    r22 = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int r3 = 0;
            while (true) {
                float[] fArr2 = c0054f2.f104b;
                if (r3 < fArr2.length) {
                    if (c3 != 'A') {
                        if (c3 != 'C') {
                            if (c3 == 'H') {
                                r32 = r3;
                                c = c3;
                                r30 = r10;
                                r27 = length;
                                c0054f = c0054f2;
                                path.lineTo(fArr2[r32], f22);
                                f21 = fArr2[r32];
                            } else if (c3 == 'Q') {
                                r32 = r3;
                                c = c3;
                                r30 = r10;
                                r27 = length;
                                c0054f = c0054f2;
                                float f23 = fArr2[r32];
                                int r33 = r32 + 1;
                                float f24 = fArr2[r33];
                                int r2 = r32 + 2;
                                int r5 = r32 + 3;
                                path.quadTo(f23, f24, fArr2[r2], fArr2[r5]);
                                f = fArr2[r32];
                                f2 = fArr2[r33];
                                f21 = fArr2[r2];
                                f22 = fArr2[r5];
                            } else if (c3 == 'V') {
                                r32 = r3;
                                c = c3;
                                r30 = r10;
                                r27 = length;
                                c0054f = c0054f2;
                                path.lineTo(f21, fArr2[r32]);
                                f22 = fArr2[r32];
                            } else if (c3 != 'a') {
                                if (c3 != 'c') {
                                    if (c3 != 'h') {
                                        if (c3 == 'q') {
                                            r32 = r3;
                                            float f25 = f22;
                                            float f26 = f21;
                                            int r34 = r32 + 1;
                                            int r4 = r32 + 2;
                                            int r6 = r32 + 3;
                                            path.rQuadTo(fArr2[r32], fArr2[r34], fArr2[r4], fArr2[r6]);
                                            float f27 = f26 + fArr2[r32];
                                            float f28 = fArr2[r34] + f25;
                                            float f29 = f26 + fArr2[r4];
                                            f22 = f25 + fArr2[r6];
                                            f16 = f28;
                                            f15 = f27;
                                            c = c3;
                                            r30 = r10;
                                            r27 = length;
                                            f21 = f29;
                                        } else if (c3 == 'v') {
                                            r32 = r3;
                                            path.rLineTo(0.0f, fArr2[r32]);
                                            f22 += fArr2[r32];
                                        } else if (c3 == 'L') {
                                            r32 = r3;
                                            int r35 = r32 + 1;
                                            path.lineTo(fArr2[r32], fArr2[r35]);
                                            f21 = fArr2[r32];
                                            f22 = fArr2[r35];
                                        } else if (c3 == 'M') {
                                            r32 = r3;
                                            f21 = fArr2[r32];
                                            f22 = fArr2[r32 + 1];
                                            if (r32 > 0) {
                                                path.lineTo(f21, f22);
                                            } else {
                                                path.moveTo(f21, f22);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c3 == 'S') {
                                            r32 = r3;
                                            float f30 = f22;
                                            float f31 = f21;
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f7 = (f30 * 2.0f) - f16;
                                                f8 = (f31 * 2.0f) - f15;
                                            } else {
                                                f8 = f31;
                                                f7 = f30;
                                            }
                                            int r02 = r32 + 1;
                                            int r122 = r32 + 2;
                                            int r15 = r32 + 3;
                                            path.cubicTo(f8, f7, fArr2[r32], fArr2[r02], fArr2[r122], fArr2[r15]);
                                            float f32 = fArr2[r32];
                                            float f33 = fArr2[r02];
                                            f21 = fArr2[r122];
                                            f22 = fArr2[r15];
                                            f16 = f33;
                                            f15 = f32;
                                        } else if (c3 == 'T') {
                                            r32 = r3;
                                            float f34 = f22;
                                            float f35 = f21;
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f3 = (f35 * 2.0f) - f15;
                                                f4 = (f34 * 2.0f) - f16;
                                            } else {
                                                f3 = f35;
                                                f4 = f34;
                                            }
                                            int r36 = r32 + 1;
                                            path.quadTo(f3, f4, fArr2[r32], fArr2[r36]);
                                            f5 = fArr2[r32];
                                            f6 = fArr2[r36];
                                        } else if (c3 == 'l') {
                                            r32 = r3;
                                            int r37 = r32 + 1;
                                            path.rLineTo(fArr2[r32], fArr2[r37]);
                                            f21 += fArr2[r32];
                                            f22 += fArr2[r37];
                                        } else if (c3 == 'm') {
                                            r32 = r3;
                                            float f36 = fArr2[r32];
                                            f21 += f36;
                                            float f37 = fArr2[r32 + 1];
                                            f22 += f37;
                                            if (r32 > 0) {
                                                path.rLineTo(f36, f37);
                                            } else {
                                                path.rMoveTo(f36, f37);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c3 == 's') {
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                float f38 = f21 - f15;
                                                f9 = f22 - f16;
                                                f10 = f38;
                                            } else {
                                                f9 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int r123 = r3 + 1;
                                            int r26 = r3 + 2;
                                            int r28 = r3 + 3;
                                            r32 = r3;
                                            float f39 = f22;
                                            float f40 = f21;
                                            path.rCubicTo(f10, f9, fArr2[r3], fArr2[r123], fArr2[r26], fArr2[r28]);
                                            f3 = f40 + fArr2[r32];
                                            f4 = f39 + fArr2[r123];
                                            f5 = f40 + fArr2[r26];
                                            f6 = fArr2[r28] + f39;
                                        } else if (c3 != 't') {
                                            r32 = r3;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f11 = f21 - f15;
                                                f12 = f22 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int r52 = r3 + 1;
                                            path.rQuadTo(f11, f12, fArr2[r3], fArr2[r52]);
                                            float f41 = f11 + f21;
                                            float f42 = f12 + f22;
                                            f21 += fArr2[r3];
                                            f22 += fArr2[r52];
                                            f16 = f42;
                                            r32 = r3;
                                            c = c3;
                                            r30 = r10;
                                            r27 = length;
                                            f15 = f41;
                                        }
                                        c0054f = c0054f2;
                                    } else {
                                        r32 = r3;
                                        path.rLineTo(fArr2[r32], 0.0f);
                                        f21 += fArr2[r32];
                                    }
                                    c = c3;
                                    r30 = r10;
                                    r27 = length;
                                    c0054f = c0054f2;
                                } else {
                                    r32 = r3;
                                    float f43 = f22;
                                    float f44 = f21;
                                    int r152 = r32 + 2;
                                    int r25 = r32 + 3;
                                    int r262 = r32 + 4;
                                    int r272 = r32 + 5;
                                    path.rCubicTo(fArr2[r32], fArr2[r32 + 1], fArr2[r152], fArr2[r25], fArr2[r262], fArr2[r272]);
                                    f3 = f44 + fArr2[r152];
                                    f4 = f43 + fArr2[r25];
                                    f5 = f44 + fArr2[r262];
                                    f6 = fArr2[r272] + f43;
                                }
                                f16 = f4;
                                f15 = f3;
                                c = c3;
                                r30 = r10;
                                r27 = length;
                                f21 = f5;
                                f22 = f6;
                                c0054f = c0054f2;
                            } else {
                                r32 = r3;
                                float f45 = f22;
                                float f46 = f21;
                                int r153 = r32 + 5;
                                int r263 = r32 + 6;
                                c = c3;
                                r27 = length;
                                c0054f = c0054f2;
                                r30 = r10;
                                m201a(path, f46, f45, fArr2[r153] + f46, fArr2[r263] + f45, fArr2[r32], fArr2[r32 + 1], fArr2[r32 + 2], fArr2[r32 + 3] != 0.0f, fArr2[r32 + 4] != 0.0f);
                                f21 = f46 + fArr2[r153];
                                f22 = f45 + fArr2[r263];
                            }
                            r3 = r32 + r22;
                            c0054f2 = c0054f;
                            length = r27;
                            c2 = c;
                            c3 = c2;
                            r10 = r30;
                        } else {
                            r32 = r3;
                            c = c3;
                            r30 = r10;
                            r27 = length;
                            c0054f = c0054f2;
                            int r03 = r32 + 2;
                            int r8 = r32 + 3;
                            int r9 = r32 + 4;
                            int r102 = r32 + 5;
                            path.cubicTo(fArr2[r32], fArr2[r32 + 1], fArr2[r03], fArr2[r8], fArr2[r9], fArr2[r102]);
                            f21 = fArr2[r9];
                            f22 = fArr2[r102];
                            f = fArr2[r03];
                            f2 = fArr2[r8];
                        }
                        f15 = f;
                        f16 = f2;
                        r3 = r32 + r22;
                        c0054f2 = c0054f;
                        length = r27;
                        c2 = c;
                        c3 = c2;
                        r10 = r30;
                    } else {
                        r32 = r3;
                        c = c3;
                        r30 = r10;
                        r27 = length;
                        c0054f = c0054f2;
                        int r154 = r32 + 5;
                        int r264 = r32 + 6;
                        m201a(path, f21, f22, fArr2[r154], fArr2[r264], fArr2[r32], fArr2[r32 + 1], fArr2[r32 + 2], fArr2[r32 + 3] != 0.0f, fArr2[r32 + 4] != 0.0f);
                        f21 = fArr2[r154];
                        f22 = fArr2[r264];
                    }
                    f16 = f22;
                    f15 = f21;
                    r3 = r32 + r22;
                    c0054f2 = c0054f;
                    length = r27;
                    c2 = c;
                    c3 = c2;
                    r10 = r30;
                }
            }
            fArr[0] = f21;
            fArr[1] = f22;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c2 = c0054f2.f103a;
            r10++;
            c0054fArr2 = c0054fArr;
            length = length;
            r12 = 6;
        }
    }

    public C0054f(C0054f c0054f) {
        this.f103a = c0054f.f103a;
        float[] fArr = c0054f.f104b;
        this.f104b = AbstractC0005b.m70p(fArr, fArr.length);
    }
}
