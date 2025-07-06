package p032L0;

import android.animation.TimeInterpolator;

/* renamed from: L0.c */
/* loaded from: classes.dex */
public final class C0369c {

    /* renamed from: a */
    public long f1007a;

    /* renamed from: b */
    public long f1008b;

    /* renamed from: c */
    public TimeInterpolator f1009c;

    /* renamed from: d */
    public int f1010d;

    /* renamed from: e */
    public int f1011e;

    /* renamed from: a */
    public final TimeInterpolator m1040a() {
        TimeInterpolator timeInterpolator = this.f1009c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0367a.f1002b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0369c)) {
            return false;
        }
        C0369c c0369c = (C0369c) obj;
        if (this.f1007a == c0369c.f1007a && this.f1008b == c0369c.f1008b && this.f1010d == c0369c.f1010d && this.f1011e == c0369c.f1011e) {
            return m1040a().getClass().equals(c0369c.m1040a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f1007a;
        long j3 = this.f1008b;
        return ((((m1040a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f1010d) * 31) + this.f1011e;
    }

    public final String toString() {
        return "\n" + C0369c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1007a + " duration: " + this.f1008b + " interpolator: " + m1040a().getClass() + " repeatCount: " + this.f1010d + " repeatMode: " + this.f1011e + "}\n";
    }
}
