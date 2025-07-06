package p030K1;

/* renamed from: K1.a */
/* loaded from: classes.dex */
public final class C0346a {

    /* renamed from: e */
    public static C0346a f975e;

    /* renamed from: a */
    public final /* synthetic */ int f976a = 1;

    /* renamed from: b */
    public long f977b;

    /* renamed from: c */
    public long f978c;

    /* renamed from: d */
    public int f979d;

    public /* synthetic */ C0346a() {
    }

    /* renamed from: c */
    public static void m982c(C0346a c0346a, long j2, long j3, int r8) {
        if ((r8 & 1) != 0) {
            j2 = 0;
        }
        if ((r8 & 2) != 0) {
            j3 = 0;
        }
        synchronized (c0346a) {
            try {
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j3 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j4 = c0346a.f977b + j2;
                c0346a.f977b = j4;
                long j5 = c0346a.f978c + j3;
                c0346a.f978c = j5;
                if (j5 > j4) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m983a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.f979d = 1;
            this.f977b = -1L;
            this.f978c = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f979d = 0;
                this.f977b = -1L;
                this.f978c = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f977b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f978c = round;
            if (round >= j2 || this.f977b <= j2) {
                this.f979d = 1;
            } else {
                this.f979d = 0;
            }
        }
    }

    /* renamed from: b */
    public synchronized long m984b() {
        return this.f977b - this.f978c;
    }

    public String toString() {
        switch (this.f976a) {
            case 0:
                return "WindowCounter(streamId=" + this.f979d + ", total=" + this.f977b + ", acknowledged=" + this.f978c + ", unacknowledged=" + m984b() + ')';
            default:
                return super.toString();
        }
    }

    public C0346a(int r2) {
        this.f979d = r2;
    }
}
