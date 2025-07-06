package p006C;

import android.graphics.Insets;

/* renamed from: C.c */
/* loaded from: classes.dex */
public final class C0051c {

    /* renamed from: e */
    public static final C0051c f97e = new C0051c(0, 0, 0, 0);

    /* renamed from: a */
    public final int f98a;

    /* renamed from: b */
    public final int f99b;

    /* renamed from: c */
    public final int f100c;

    /* renamed from: d */
    public final int f101d;

    public C0051c(int r12, int r2, int r3, int r4) {
        this.f98a = r12;
        this.f99b = r2;
        this.f100c = r3;
        this.f101d = r4;
    }

    /* renamed from: a */
    public static C0051c m196a(C0051c c0051c, C0051c c0051c2) {
        return m197b(Math.max(c0051c.f98a, c0051c2.f98a), Math.max(c0051c.f99b, c0051c2.f99b), Math.max(c0051c.f100c, c0051c2.f100c), Math.max(c0051c.f101d, c0051c2.f101d));
    }

    /* renamed from: b */
    public static C0051c m197b(int r12, int r2, int r3, int r4) {
        return (r12 == 0 && r2 == 0 && r3 == 0 && r4 == 0) ? f97e : new C0051c(r12, r2, r3, r4);
    }

    /* renamed from: c */
    public static C0051c m198c(Insets insets) {
        int r02;
        int r12;
        int r2;
        int r3;
        r02 = insets.left;
        r12 = insets.top;
        r2 = insets.right;
        r3 = insets.bottom;
        return m197b(r02, r12, r2, r3);
    }

    /* renamed from: d */
    public final Insets m199d() {
        return AbstractC0050b.m195a(this.f98a, this.f99b, this.f100c, this.f101d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0051c.class != obj.getClass()) {
            return false;
        }
        C0051c c0051c = (C0051c) obj;
        return this.f101d == c0051c.f101d && this.f98a == c0051c.f98a && this.f100c == c0051c.f100c && this.f99b == c0051c.f99b;
    }

    public final int hashCode() {
        return (((((this.f98a * 31) + this.f99b) * 31) + this.f100c) * 31) + this.f101d;
    }

    public final String toString() {
        return "Insets{left=" + this.f98a + ", top=" + this.f99b + ", right=" + this.f100c + ", bottom=" + this.f101d + '}';
    }
}
