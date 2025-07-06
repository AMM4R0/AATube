package p006C;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* renamed from: C.a */
/* loaded from: classes.dex */
public abstract class AbstractC0049a {

    /* renamed from: a */
    public static final ThreadLocal f96a = new ThreadLocal();

    /* renamed from: a */
    public static int m191a(double d2, double d3, double d4) {
        double d5 = (((-0.4986d) * d4) + (((-1.5372d) * d3) + (3.2406d * d2))) / 100.0d;
        double d6 = ((0.0415d * d4) + ((1.8758d * d3) + ((-0.9689d) * d2))) / 100.0d;
        double d7 = ((1.057d * d4) + (((-0.204d) * d3) + (0.0557d * d2))) / 100.0d;
        double pow = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow2 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double pow3 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, KotlinVersion.MAX_COMPONENT_VALUE);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, KotlinVersion.MAX_COMPONENT_VALUE);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, KotlinVersion.MAX_COMPONENT_VALUE) : 0);
    }

    /* renamed from: b */
    public static int m192b(int r6, int r7) {
        int alpha = Color.alpha(r7);
        int alpha2 = Color.alpha(r6);
        int r2 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(r2, m193c(Color.red(r6), alpha2, Color.red(r7), alpha, r2), m193c(Color.green(r6), alpha2, Color.green(r7), alpha, r2), m193c(Color.blue(r6), alpha2, Color.blue(r7), alpha, r2));
    }

    /* renamed from: c */
    public static int m193c(int r02, int r12, int r2, int r3, int r4) {
        if (r4 == 0) {
            return 0;
        }
        return (((255 - r12) * (r2 * r3)) + ((r02 * KotlinVersion.MAX_COMPONENT_VALUE) * r12)) / (r4 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: d */
    public static int m194d(int r12, int r2) {
        if (r2 < 0 || r2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (r12 & 16777215) | (r2 << 24);
    }
}
