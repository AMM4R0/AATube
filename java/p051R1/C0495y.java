package p051R1;

import kotlin.jvm.internal.AbstractC2492i;
import p108m1.AbstractC2658h;

/* renamed from: R1.y */
/* loaded from: classes.dex */
public final class C0495y {

    /* renamed from: a */
    public final byte[] f1252a;

    /* renamed from: b */
    public int f1253b;

    /* renamed from: c */
    public int f1254c;

    /* renamed from: d */
    public boolean f1255d;

    /* renamed from: e */
    public final boolean f1256e;

    /* renamed from: f */
    public C0495y f1257f;

    /* renamed from: g */
    public C0495y f1258g;

    public C0495y() {
        this.f1252a = new byte[8192];
        this.f1256e = true;
        this.f1255d = false;
    }

    /* renamed from: a */
    public final C0495y m1304a() {
        C0495y c0495y = this.f1257f;
        if (c0495y == this) {
            c0495y = null;
        }
        C0495y c0495y2 = this.f1258g;
        AbstractC2492i.m4912b(c0495y2);
        c0495y2.f1257f = this.f1257f;
        C0495y c0495y3 = this.f1257f;
        AbstractC2492i.m4912b(c0495y3);
        c0495y3.f1258g = this.f1258g;
        this.f1257f = null;
        this.f1258g = null;
        return c0495y;
    }

    /* renamed from: b */
    public final void m1305b(C0495y segment) {
        AbstractC2492i.m4915e(segment, "segment");
        segment.f1258g = this;
        segment.f1257f = this.f1257f;
        C0495y c0495y = this.f1257f;
        AbstractC2492i.m4912b(c0495y);
        c0495y.f1258g = segment;
        this.f1257f = segment;
    }

    /* renamed from: c */
    public final C0495y m1306c() {
        this.f1255d = true;
        return new C0495y(this.f1252a, this.f1253b, this.f1254c, true);
    }

    /* renamed from: d */
    public final void m1307d(C0495y sink, int r7) {
        AbstractC2492i.m4915e(sink, "sink");
        if (!sink.f1256e) {
            throw new IllegalStateException("only owner can write");
        }
        int r02 = sink.f1254c;
        int r12 = r02 + r7;
        byte[] bArr = sink.f1252a;
        if (r12 > 8192) {
            if (sink.f1255d) {
                throw new IllegalArgumentException();
            }
            int r4 = sink.f1253b;
            if (r12 - r4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC2658h.m5105C(0, r4, r02, bArr, bArr);
            sink.f1254c -= sink.f1253b;
            sink.f1253b = 0;
        }
        int r03 = sink.f1254c;
        int r13 = this.f1253b;
        AbstractC2658h.m5105C(r03, r13, r13 + r7, this.f1252a, bArr);
        sink.f1254c += r7;
        this.f1253b += r7;
    }

    public C0495y(byte[] data, int r3, int r4, boolean z2) {
        AbstractC2492i.m4915e(data, "data");
        this.f1252a = data;
        this.f1253b = r3;
        this.f1254c = r4;
        this.f1255d = z2;
        this.f1256e = false;
    }
}
