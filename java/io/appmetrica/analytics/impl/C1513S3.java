package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.S3 */
/* loaded from: classes.dex */
public final class C1513S3 implements InterfaceC1542T7 {

    /* renamed from: a */
    public final Map f5401a;

    /* renamed from: b */
    public final EnumC1517S7 f5402b;

    public C1513S3(Map<String, String> map, EnumC1517S7 enumC1517S7) {
        this.f5401a = map;
        this.f5402b = enumC1517S7;
    }

    /* renamed from: a */
    public final C1513S3 m3309a(Map<String, String> map, EnumC1517S7 enumC1517S7) {
        return new C1513S3(map, enumC1517S7);
    }

    /* renamed from: b */
    public final Map<String, String> m3310b() {
        return this.f5401a;
    }

    /* renamed from: c */
    public final EnumC1517S7 m3311c() {
        return this.f5402b;
    }

    /* renamed from: d */
    public final Map<String, String> m3312d() {
        return this.f5401a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1513S3)) {
            return false;
        }
        C1513S3 c1513s3 = (C1513S3) obj;
        return AbstractC2492i.m4911a(this.f5401a, c1513s3.f5401a) && this.f5402b == c1513s3.f5402b;
    }

    public final int hashCode() {
        Map map = this.f5401a;
        return this.f5402b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f5401a + ", source=" + this.f5402b + ')';
    }

    /* renamed from: a */
    public static C1513S3 m3308a(C1513S3 c1513s3, Map map, EnumC1517S7 enumC1517S7, int r3, Object obj) {
        if ((r3 & 1) != 0) {
            map = c1513s3.f5401a;
        }
        if ((r3 & 2) != 0) {
            enumC1517S7 = c1513s3.f5402b;
        }
        c1513s3.getClass();
        return new C1513S3(map, enumC1517S7);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1542T7
    /* renamed from: a */
    public final EnumC1517S7 mo3259a() {
        return this.f5402b;
    }
}
