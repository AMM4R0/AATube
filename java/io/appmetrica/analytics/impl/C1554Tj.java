package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.Tj */
/* loaded from: classes.dex */
public final class C1554Tj {

    /* renamed from: a */
    public final C2013m5 f5486a;

    /* renamed from: b */
    public final C1978kk f5487b;

    /* renamed from: c */
    public final C1629Wj f5488c;

    /* renamed from: d */
    public long f5489d;

    /* renamed from: e */
    public long f5490e;

    /* renamed from: f */
    public AtomicLong f5491f;

    /* renamed from: g */
    public boolean f5492g;

    /* renamed from: h */
    public volatile C1928ik f5493h;

    /* renamed from: i */
    public long f5494i;

    /* renamed from: j */
    public long f5495j;

    /* renamed from: k */
    public final SystemTimeProvider f5496k;

    public C1554Tj(C2013m5 c2013m5, C1978kk c1978kk, C1629Wj c1629Wj, SystemTimeProvider systemTimeProvider) {
        this.f5486a = c2013m5;
        this.f5487b = c1978kk;
        this.f5488c = c1629Wj;
        this.f5496k = systemTimeProvider;
        m3379a();
    }

    /* renamed from: a */
    public final void m3379a() {
        C1629Wj c1629Wj = this.f5488c;
        long elapsedRealtime = this.f5496k.elapsedRealtime();
        Long l2 = c1629Wj.f5649c;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        }
        this.f5490e = elapsedRealtime;
        Long l3 = this.f5488c.f5648b;
        this.f5489d = l3 == null ? -1L : l3.longValue();
        Long l4 = this.f5488c.f5651e;
        this.f5491f = new AtomicLong(l4 == null ? 0L : l4.longValue());
        Boolean bool = this.f5488c.f5652f;
        this.f5492g = bool == null ? true : bool.booleanValue();
        Long l5 = this.f5488c.f5653g;
        long longValue = l5 != null ? l5.longValue() : 0L;
        this.f5494i = longValue;
        C1629Wj c1629Wj2 = this.f5488c;
        long j2 = longValue - this.f5490e;
        Long l6 = c1629Wj2.f5654h;
        if (l6 != null) {
            j2 = l6.longValue();
        }
        this.f5495j = j2;
    }

    public final String toString() {
        return "Session{id=" + this.f5489d + ", creationTime=" + this.f5490e + ", currentReportId=" + this.f5491f + ", sessionRequestParams=" + this.f5493h + ", sleepStart=" + this.f5494i + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3380a(long r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1554Tj.m3380a(long):boolean");
    }
}
