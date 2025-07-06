package p051R1;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0008a;
import p036M1.AbstractC0379e;
import p054S1.AbstractC0502a;

/* renamed from: R1.x */
/* loaded from: classes.dex */
public final class C0494x implements InterfaceC0479i {

    /* renamed from: a */
    public final InterfaceC0467D f1249a;

    /* renamed from: b */
    public final C0477g f1250b;

    /* renamed from: c */
    public boolean f1251c;

    public C0494x(InterfaceC0467D source) {
        AbstractC2492i.m4915e(source, "source");
        this.f1249a = source;
        this.f1250b = new C0477g();
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        AbstractC2492i.m4915e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
        }
        if (this.f1251c) {
            throw new IllegalStateException("closed");
        }
        C0477g c0477g = this.f1250b;
        if (c0477g.f1217b == 0 && this.f1249a.mo390a(c0477g, 8192L) == -1) {
            return -1L;
        }
        return c0477g.mo390a(sink, Math.min(j2, c0477g.f1217b));
    }

    /* renamed from: b */
    public final boolean m1290b() {
        if (this.f1251c) {
            throw new IllegalStateException("closed");
        }
        C0477g c0477g = this.f1250b;
        return c0477g.m1252b() && this.f1249a.mo390a(c0477g, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f1251c) {
            return;
        }
        this.f1251c = true;
        this.f1249a.close();
        C0477g c0477g = this.f1250b;
        c0477g.m1268t(c0477g.f1217b);
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f1249a.mo391d();
    }

    @Override // p051R1.InterfaceC0479i
    /* renamed from: f */
    public final InputStream mo1254f() {
        return new C0476f(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f1217b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m1291g(byte r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051R1.C0494x.m1291g(byte, long, long):long");
    }

    /* renamed from: h */
    public final byte m1292h() {
        m1302r(1L);
        return this.f1250b.m1259k();
    }

    /* renamed from: i */
    public final C0480j m1293i(long j2) {
        m1302r(j2);
        return this.f1250b.m1261m(j2);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1251c;
    }

    /* renamed from: j */
    public final int m1294j() {
        m1302r(4L);
        return this.f1250b.m1263o();
    }

    /* renamed from: k */
    public final int m1295k() {
        m1302r(4L);
        int m1263o = this.f1250b.m1263o();
        return ((m1263o & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & m1263o) >>> 24) | ((16711680 & m1263o) >>> 8) | ((65280 & m1263o) << 8);
    }

    /* renamed from: l */
    public final long m1296l() {
        long j2;
        m1302r(8L);
        C0477g c0477g = this.f1250b;
        if (c0477g.f1217b < 8) {
            throw new EOFException();
        }
        C0495y c0495y = c0477g.f1216a;
        AbstractC2492i.m4912b(c0495y);
        int r3 = c0495y.f1253b;
        int r6 = c0495y.f1254c;
        if (r6 - r3 < 8) {
            j2 = ((c0477g.m1263o() & 4294967295L) << 32) | (4294967295L & c0477g.m1263o());
        } else {
            byte[] bArr = c0495y.f1252a;
            int r7 = r3 + 7;
            long j3 = ((bArr[r3] & 255) << 56) | ((bArr[r3 + 1] & 255) << 48) | ((bArr[r3 + 2] & 255) << 40) | ((bArr[r3 + 3] & 255) << 32) | ((bArr[r3 + 4] & 255) << 24) | ((bArr[r3 + 5] & 255) << 16) | ((bArr[r3 + 6] & 255) << 8);
            int r32 = r3 + 8;
            long j4 = j3 | (bArr[r7] & 255);
            c0477g.f1217b -= 8;
            if (r32 == r6) {
                c0477g.f1216a = c0495y.m1304a();
                AbstractC0496z.m1308a(c0495y);
            } else {
                c0495y.f1253b = r32;
            }
            j2 = j4;
        }
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    /* renamed from: m */
    public final short m1297m() {
        m1302r(2L);
        return this.f1250b.m1264p();
    }

    /* renamed from: n */
    public final short m1298n() {
        m1302r(2L);
        return this.f1250b.m1265q();
    }

    /* renamed from: o */
    public final String m1299o(long j2) {
        m1302r(j2);
        C0477g c0477g = this.f1250b;
        c0477g.getClass();
        return c0477g.m1266r(j2, AbstractC0008a.f6a);
    }

    /* renamed from: p */
    public final String m1300p(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("limit < 0: ", j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long m1291g = m1291g((byte) 10, 0L, j3);
        C0477g c0477g = this.f1250b;
        if (m1291g != -1) {
            return AbstractC0502a.m1311a(c0477g, m1291g);
        }
        if (j3 < Long.MAX_VALUE && m1301q(j3) && c0477g.m1255g(j3 - 1) == 13 && m1301q(1 + j3) && c0477g.m1255g(j3) == 10) {
            return AbstractC0502a.m1311a(c0477g, j3);
        }
        C0477g out = new C0477g();
        long min = Math.min(32, c0477g.f1217b);
        long j4 = 0;
        c0477g.getClass();
        AbstractC2492i.m4915e(out, "out");
        AbstractC0379e.m1074e(c0477g.f1217b, 0L, min);
        if (min != 0) {
            out.f1217b += min;
            C0495y c0495y = c0477g.f1216a;
            while (true) {
                AbstractC2492i.m4912b(c0495y);
                long j5 = c0495y.f1254c - c0495y.f1253b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                c0495y = c0495y.f1257f;
            }
            while (min > 0) {
                AbstractC2492i.m4912b(c0495y);
                C0495y m1306c = c0495y.m1306c();
                int r13 = m1306c.f1253b + ((int) j4);
                m1306c.f1253b = r13;
                m1306c.f1254c = Math.min(r13 + ((int) min), m1306c.f1254c);
                C0495y c0495y2 = out.f1216a;
                if (c0495y2 == null) {
                    m1306c.f1258g = m1306c;
                    m1306c.f1257f = m1306c;
                    out.f1216a = m1306c;
                } else {
                    C0495y c0495y3 = c0495y2.f1258g;
                    AbstractC2492i.m4912b(c0495y3);
                    c0495y3.m1305b(m1306c);
                }
                min -= m1306c.f1254c - m1306c.f1253b;
                c0495y = c0495y.f1257f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0477g.f1217b, j2) + " content=" + out.m1261m(out.f1217b).mo1221c() + (char) 8230);
    }

    /* renamed from: q */
    public final boolean m1301q(long j2) {
        C0477g c0477g;
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
        }
        if (this.f1251c) {
            throw new IllegalStateException("closed");
        }
        do {
            c0477g = this.f1250b;
            if (c0477g.f1217b >= j2) {
                return true;
            }
        } while (this.f1249a.mo390a(c0477g, 8192L) != -1);
        return false;
    }

    /* renamed from: r */
    public final void m1302r(long j2) {
        if (!m1301q(j2)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC2492i.m4915e(sink, "sink");
        C0477g c0477g = this.f1250b;
        if (c0477g.f1217b == 0 && this.f1249a.mo390a(c0477g, 8192L) == -1) {
            return -1;
        }
        return c0477g.read(sink);
    }

    /* renamed from: s */
    public final void m1303s(long j2) {
        if (this.f1251c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            C0477g c0477g = this.f1250b;
            if (c0477g.f1217b == 0 && this.f1249a.mo390a(c0477g, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, c0477g.f1217b);
            c0477g.m1268t(min);
            j2 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f1249a + ')';
    }
}
