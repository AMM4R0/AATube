package p112o;

/* renamed from: o.d */
/* loaded from: classes.dex */
public abstract class AbstractC2684d {

    /* renamed from: a */
    public static final int[] f8653a = new int[0];

    /* renamed from: b */
    public static final Object[] f8654b = new Object[0];

    /* renamed from: a */
    public static int m5159a(int r3, int r4, int[] r5) {
        int r32 = r3 - 1;
        int r02 = 0;
        while (r02 <= r32) {
            int r12 = (r02 + r32) >>> 1;
            int r2 = r5[r12];
            if (r2 < r4) {
                r02 = r12 + 1;
            } else {
                if (r2 <= r4) {
                    return r12;
                }
                r32 = r12 - 1;
            }
        }
        return ~r02;
    }

    /* renamed from: b */
    public static int m5160b(long[] jArr, int r5, long j2) {
        int r52 = r5 - 1;
        int r02 = 0;
        while (r02 <= r52) {
            int r12 = (r02 + r52) >>> 1;
            long j3 = jArr[r12];
            if (j3 < j2) {
                r02 = r12 + 1;
            } else {
                if (j3 <= j2) {
                    return r12;
                }
                r52 = r12 - 1;
            }
        }
        return ~r02;
    }
}
