package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.T3 */
/* loaded from: classes.dex */
public final class C1538T3 implements InterfaceC1468Q7 {

    /* renamed from: a */
    public final C1513S3 f5460a;

    /* renamed from: b */
    public final List f5461b;

    public C1538T3(C1513S3 c1513s3, List<C1513S3> list) {
        this.f5460a = c1513s3;
        this.f5461b = list;
    }

    /* renamed from: a */
    public final C1538T3 m3344a(C1513S3 c1513s3, List<C1513S3> list) {
        return new C1538T3(c1513s3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1468Q7
    /* renamed from: b */
    public final Object mo2858b() {
        return this.f5460a;
    }

    /* renamed from: c */
    public final C1513S3 m3345c() {
        return this.f5460a;
    }

    /* renamed from: d */
    public final List<C1513S3> m3346d() {
        return this.f5461b;
    }

    /* renamed from: e */
    public final C1513S3 m3347e() {
        return this.f5460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1538T3)) {
            return false;
        }
        C1538T3 c1538t3 = (C1538T3) obj;
        return AbstractC2492i.m4911a(this.f5460a, c1538t3.f5460a) && AbstractC2492i.m4911a(this.f5461b, c1538t3.f5461b);
    }

    public final int hashCode() {
        return this.f5461b.hashCode() + (this.f5460a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f5460a + ", candidates=" + this.f5461b + ')';
    }

    /* renamed from: a */
    public static C1538T3 m3343a(C1538T3 c1538t3, C1513S3 c1513s3, List list, int r3, Object obj) {
        if ((r3 & 1) != 0) {
            c1513s3 = c1538t3.f5460a;
        }
        if ((r3 & 2) != 0) {
            list = c1538t3.f5461b;
        }
        c1538t3.getClass();
        return new C1538T3(c1513s3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1468Q7
    /* renamed from: a */
    public final List<C1513S3> mo2857a() {
        return this.f5461b;
    }
}
