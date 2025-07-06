package p051R1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0017j;
import p036M1.AbstractC0379e;

/* renamed from: R1.o */
/* loaded from: classes.dex */
public final class C0485o implements InterfaceC0467D {

    /* renamed from: a */
    public byte f1229a;

    /* renamed from: b */
    public final C0494x f1230b;

    /* renamed from: c */
    public final Inflater f1231c;

    /* renamed from: d */
    public final C0486p f1232d;

    /* renamed from: e */
    public final CRC32 f1233e;

    public C0485o(InterfaceC0467D source) {
        AbstractC2492i.m4915e(source, "source");
        C0494x c0494x = new C0494x(source);
        this.f1230b = c0494x;
        Inflater inflater = new Inflater(true);
        this.f1231c = inflater;
        this.f1232d = new C0486p(c0494x, inflater);
        this.f1233e = new CRC32();
    }

    /* renamed from: b */
    public static void m1280b(String str, int r3, int r4) {
        if (r4 == r3) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC0017j.m140R(AbstractC0379e.m1068D(r4)) + " != expected 0x" + AbstractC0017j.m140R(AbstractC0379e.m1068D(r3)));
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        C0494x c0494x;
        C0477g c0477g;
        long j3;
        AbstractC2492i.m4915e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        byte b2 = this.f1229a;
        CRC32 crc32 = this.f1233e;
        C0494x c0494x2 = this.f1230b;
        if (b2 == 0) {
            c0494x2.m1302r(10L);
            C0477g c0477g2 = c0494x2.f1250b;
            byte m1255g = c0477g2.m1255g(3L);
            boolean z2 = ((m1255g >> 1) & 1) == 1;
            if (z2) {
                m1281g(c0477g2, 0L, 10L);
            }
            m1280b("ID1ID2", 8075, c0494x2.m1297m());
            c0494x2.m1303s(8L);
            if (((m1255g >> 2) & 1) == 1) {
                c0494x2.m1302r(2L);
                if (z2) {
                    m1281g(c0477g2, 0L, 2L);
                }
                long m1265q = c0477g2.m1265q() & 65535;
                c0494x2.m1302r(m1265q);
                if (z2) {
                    m1281g(c0477g2, 0L, m1265q);
                    j3 = m1265q;
                } else {
                    j3 = m1265q;
                }
                c0494x2.m1303s(j3);
            }
            if (((m1255g >> 3) & 1) == 1) {
                c0477g = c0477g2;
                long m1291g = c0494x2.m1291g((byte) 0, 0L, Long.MAX_VALUE);
                if (m1291g == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    c0494x = c0494x2;
                    m1281g(c0477g, 0L, m1291g + 1);
                } else {
                    c0494x = c0494x2;
                }
                c0494x.m1303s(m1291g + 1);
            } else {
                c0477g = c0477g2;
                c0494x = c0494x2;
            }
            if (((m1255g >> 4) & 1) == 1) {
                long m1291g2 = c0494x.m1291g((byte) 0, 0L, Long.MAX_VALUE);
                if (m1291g2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    m1281g(c0477g, 0L, m1291g2 + 1);
                }
                c0494x.m1303s(m1291g2 + 1);
            }
            if (z2) {
                m1280b("FHCRC", c0494x.m1298n(), (short) crc32.getValue());
                crc32.reset();
            }
            this.f1229a = (byte) 1;
        } else {
            c0494x = c0494x2;
        }
        if (this.f1229a == 1) {
            long j4 = sink.f1217b;
            long mo390a = this.f1232d.mo390a(sink, j2);
            if (mo390a != -1) {
                m1281g(sink, j4, mo390a);
                return mo390a;
            }
            this.f1229a = (byte) 2;
        }
        if (this.f1229a != 2) {
            return -1L;
        }
        m1280b("CRC", c0494x.m1295k(), (int) crc32.getValue());
        m1280b("ISIZE", c0494x.m1295k(), (int) this.f1231c.getBytesWritten());
        this.f1229a = (byte) 3;
        if (c0494x.m1290b()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1232d.close();
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f1230b.f1249a.mo391d();
    }

    /* renamed from: g */
    public final void m1281g(C0477g c0477g, long j2, long j3) {
        C0495y c0495y = c0477g.f1216a;
        AbstractC2492i.m4912b(c0495y);
        while (true) {
            int r02 = c0495y.f1254c;
            int r12 = c0495y.f1253b;
            if (j2 < r02 - r12) {
                break;
            }
            j2 -= r02 - r12;
            c0495y = c0495y.f1257f;
            AbstractC2492i.m4912b(c0495y);
        }
        while (j3 > 0) {
            int min = (int) Math.min(c0495y.f1254c - r6, j3);
            this.f1233e.update(c0495y.f1252a, (int) (c0495y.f1253b + j2), min);
            j3 -= min;
            c0495y = c0495y.f1257f;
            AbstractC2492i.m4912b(c0495y);
            j2 = 0;
        }
    }
}
