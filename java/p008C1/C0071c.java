package p008C1;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: C1.c */
/* loaded from: classes.dex */
public final class C0071c {

    /* renamed from: n */
    public static final /* synthetic */ int f154n = 0;

    /* renamed from: a */
    public final boolean f155a;

    /* renamed from: b */
    public final boolean f156b;

    /* renamed from: c */
    public final int f157c;

    /* renamed from: d */
    public final int f158d;

    /* renamed from: e */
    public final boolean f159e;

    /* renamed from: f */
    public final boolean f160f;

    /* renamed from: g */
    public final boolean f161g;

    /* renamed from: h */
    public final int f162h;

    /* renamed from: i */
    public final int f163i;

    /* renamed from: j */
    public final boolean f164j;

    /* renamed from: k */
    public final boolean f165k;

    /* renamed from: l */
    public final boolean f166l;

    /* renamed from: m */
    public String f167m;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (r0 > 4611686018427387903L) goto L28;
     */
    static {
        /*
            int r0 = p005B1.AbstractC0046a.f89c
            B1.c r0 = p005B1.EnumC0048c.SECONDS
            java.lang.String r1 = "unit"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r0, r1)
            int r1 = r0.compareTo(r0)
            r2 = 0
            r4 = 1
            java.util.concurrent.TimeUnit r5 = r0.f95a
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 > 0) goto L23
            long r6 = (long) r6
            B1.c r1 = p005B1.EnumC0048c.NANOSECONDS
            long r0 = p103k0.AbstractC2480a.m4884f(r6, r0, r1)
            long r0 = r0 << r4
            int r6 = p005B1.AbstractC0047b.f90a
            goto L88
        L23:
            long r6 = (long) r6
            B1.c r1 = p005B1.EnumC0048c.NANOSECONDS
            r8 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r8 = p103k0.AbstractC2480a.m4884f(r8, r1, r0)
            long r10 = -r8
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r13 = 1
            if (r12 < 0) goto L37
            goto L52
        L37:
            long r15 = r8 % r13
            int r12 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r12 < 0) goto L3e
            goto L3f
        L3e:
            long r15 = r15 + r13
        L3f:
            long r17 = r10 % r13
            int r12 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r12 < 0) goto L46
            goto L48
        L46:
            long r17 = r17 + r13
        L48:
            long r15 = r15 - r17
            long r15 = r15 % r13
            int r12 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r12 < 0) goto L50
            goto L51
        L50:
            long r15 = r15 + r13
        L51:
            long r8 = r8 - r15
        L52:
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 > 0) goto L62
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 > 0) goto L62
            long r0 = p103k0.AbstractC2480a.m4884f(r6, r0, r1)
            long r0 = r0 << r4
            int r6 = p005B1.AbstractC0047b.f90a
            goto L88
        L62:
            B1.c r0 = p005B1.EnumC0048c.MILLISECONDS
            java.lang.String r1 = "targetUnit"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r0, r1)
            java.util.concurrent.TimeUnit r0 = r0.f95a
            long r0 = r0.convert(r6, r5)
            r6 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L7a
        L78:
            r0 = r6
            goto L84
        L7a:
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L84
            goto L78
        L84:
            long r0 = r0 << r4
            long r0 = r0 + r13
            int r6 = p005B1.AbstractC0047b.f90a
        L88:
            long r6 = p005B1.AbstractC0046a.f87a
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L94
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lb3
        L94:
            long r6 = p005B1.AbstractC0046a.f88b
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L9d
            r0 = -9223372036854775808
            goto Lb3
        L9d:
            long r6 = r0 >> r4
            int r0 = (int) r0
            r0 = r0 & r4
            if (r0 != 0) goto La6
            B1.c r0 = p005B1.EnumC0048c.NANOSECONDS
            goto La8
        La6:
            B1.c r0 = p005B1.EnumC0048c.MILLISECONDS
        La8:
            java.lang.String r1 = "sourceUnit"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r0, r1)
            java.util.concurrent.TimeUnit r0 = r0.f95a
            long r0 = r5.convert(r6, r0)
        Lb3:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb8
            return
        Lb8:
            java.lang.String r2 = "maxStale < 0: "
            java.lang.String r0 = p000A.AbstractC0002c.m14i(r2, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p008C1.C0071c.<clinit>():void");
    }

    public C0071c(boolean z2, boolean z3, int r3, int r4, boolean z4, boolean z5, boolean z6, int r8, int r9, boolean z7, boolean z8, boolean z9, String str) {
        this.f155a = z2;
        this.f156b = z3;
        this.f157c = r3;
        this.f158d = r4;
        this.f159e = z4;
        this.f160f = z5;
        this.f161g = z6;
        this.f162h = r8;
        this.f163i = r9;
        this.f164j = z7;
        this.f165k = z8;
        this.f166l = z9;
        this.f167m = str;
    }

    public final String toString() {
        String str = this.f167m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f155a) {
            sb.append("no-cache, ");
        }
        if (this.f156b) {
            sb.append("no-store, ");
        }
        int r3 = this.f157c;
        if (r3 != -1) {
            sb.append("max-age=");
            sb.append(r3);
            sb.append(", ");
        }
        int r32 = this.f158d;
        if (r32 != -1) {
            sb.append("s-maxage=");
            sb.append(r32);
            sb.append(", ");
        }
        if (this.f159e) {
            sb.append("private, ");
        }
        if (this.f160f) {
            sb.append("public, ");
        }
        if (this.f161g) {
            sb.append("must-revalidate, ");
        }
        int r33 = this.f162h;
        if (r33 != -1) {
            sb.append("max-stale=");
            sb.append(r33);
            sb.append(", ");
        }
        int r34 = this.f163i;
        if (r34 != -1) {
            sb.append("min-fresh=");
            sb.append(r34);
            sb.append(", ");
        }
        if (this.f164j) {
            sb.append("only-if-cached, ");
        }
        if (this.f165k) {
            sb.append("no-transform, ");
        }
        if (this.f166l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        AbstractC2492i.m4914d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        this.f167m = sb2;
        return sb2;
    }
}
