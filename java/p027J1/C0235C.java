package p027J1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p011D1.AbstractC0119f;
import p051R1.C0477g;
import p051R1.C0493w;
import p051R1.C0495y;
import p108m1.AbstractC2658h;

/* renamed from: J1.C */
/* loaded from: classes.dex */
public final class C0235C implements Closeable {

    /* renamed from: f */
    public static final Logger f689f = Logger.getLogger(AbstractC0248h.class.getName());

    /* renamed from: a */
    public final C0493w f690a;

    /* renamed from: b */
    public final C0477g f691b;

    /* renamed from: c */
    public int f692c;

    /* renamed from: d */
    public boolean f693d;

    /* renamed from: e */
    public final C0246f f694e;

    public C0235C(C0493w sink) {
        AbstractC2492i.m4915e(sink, "sink");
        this.f690a = sink;
        C0477g c0477g = new C0477g();
        this.f691b = c0477g;
        this.f692c = 16384;
        this.f694e = new C0246f(c0477g);
    }

    /* renamed from: b */
    public final synchronized void m642b(C0239G peerSettings) {
        try {
            AbstractC2492i.m4915e(peerSettings, "peerSettings");
            if (this.f693d) {
                throw new IOException("closed");
            }
            int r02 = this.f692c;
            int r12 = peerSettings.f702a;
            if ((r12 & 32) != 0) {
                r02 = peerSettings.f703b[5];
            }
            this.f692c = r02;
            if (((r12 & 2) != 0 ? peerSettings.f703b[1] : -1) != -1) {
                C0246f c0246f = this.f694e;
                int r2 = (r12 & 2) != 0 ? peerSettings.f703b[1] : -1;
                c0246f.getClass();
                int min = Math.min(r2, 16384);
                int r13 = c0246f.f735e;
                if (r13 != min) {
                    if (min < r13) {
                        c0246f.f733c = Math.min(c0246f.f733c, min);
                    }
                    c0246f.f734d = true;
                    c0246f.f735e = min;
                    int r14 = c0246f.f739i;
                    if (min < r14) {
                        if (min == 0) {
                            C0244d[] c0244dArr = c0246f.f736f;
                            AbstractC2658h.m5108F(c0244dArr, 0, c0244dArr.length);
                            c0246f.f737g = c0246f.f736f.length - 1;
                            c0246f.f738h = 0;
                            c0246f.f739i = 0;
                        } else {
                            c0246f.m659a(r14 - min);
                        }
                    }
                }
            }
            m644h(0, 0, 4, 1);
            this.f690a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f693d = true;
        this.f690a.close();
    }

    public final synchronized void flush() {
        if (this.f693d) {
            throw new IOException("closed");
        }
        this.f690a.flush();
    }

    /* renamed from: g */
    public final synchronized void m643g(boolean z2, int r3, C0477g c0477g, int r5) {
        if (this.f693d) {
            throw new IOException("closed");
        }
        m644h(r3, r5, 0, z2 ? 1 : 0);
        if (r5 > 0) {
            AbstractC2492i.m4912b(c0477g);
            this.f690a.mo497e(c0477g, r5);
        }
    }

    /* renamed from: h */
    public final void m644h(int r4, int r5, int r6, int r7) {
        if (r6 != 8) {
            Level level = Level.FINE;
            Logger logger = f689f;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC0248h.m666b(false, r4, r5, r6, r7));
            }
        }
        if (r5 > this.f692c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f692c + ": " + r5).toString());
        }
        if ((Integer.MIN_VALUE & r4) != 0) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r4, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC0119f.f362a;
        C0493w c0493w = this.f690a;
        AbstractC2492i.m4915e(c0493w, "<this>");
        c0493w.m1288g((r5 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        c0493w.m1288g((r5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        c0493w.m1288g(r5 & KotlinVersion.MAX_COMPONENT_VALUE);
        c0493w.m1288g(r6 & KotlinVersion.MAX_COMPONENT_VALUE);
        c0493w.m1288g(r7 & KotlinVersion.MAX_COMPONENT_VALUE);
        c0493w.m1289h(r4 & Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final synchronized void m645i(int r4, EnumC0242b enumC0242b, byte[] bArr) {
        if (this.f693d) {
            throw new IOException("closed");
        }
        if (enumC0242b.f713a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m644h(0, bArr.length + 8, 7, 0);
        this.f690a.m1289h(r4);
        this.f690a.m1289h(enumC0242b.f713a);
        if (bArr.length != 0) {
            C0493w c0493w = this.f690a;
            if (c0493w.f1248c) {
                throw new IllegalStateException("closed");
            }
            c0493w.f1247b.m1272x(bArr, 0, bArr.length);
            c0493w.m1287b();
        }
        this.f690a.flush();
    }

    /* renamed from: j */
    public final synchronized void m646j(boolean z2, int r10, ArrayList arrayList) {
        if (this.f693d) {
            throw new IOException("closed");
        }
        this.f694e.m662d(arrayList);
        long j2 = this.f691b.f1217b;
        long min = Math.min(this.f692c, j2);
        int r6 = j2 == min ? 4 : 0;
        if (z2) {
            r6 |= 1;
        }
        m644h(r10, (int) min, 1, r6);
        this.f690a.mo497e(this.f691b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f692c, j3);
                j3 -= min2;
                m644h(r10, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f690a.mo497e(this.f691b, min2);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m647k(int r4, int r5, boolean z2) {
        if (this.f693d) {
            throw new IOException("closed");
        }
        m644h(0, 8, 6, z2 ? 1 : 0);
        this.f690a.m1289h(r4);
        this.f690a.m1289h(r5);
        this.f690a.flush();
    }

    /* renamed from: l */
    public final synchronized void m648l(int r4, EnumC0242b enumC0242b) {
        if (this.f693d) {
            throw new IOException("closed");
        }
        if (enumC0242b.f713a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m644h(r4, 4, 3, 0);
        this.f690a.m1289h(enumC0242b.f713a);
        this.f690a.flush();
    }

    /* renamed from: m */
    public final synchronized void m649m(C0239G settings) {
        try {
            AbstractC2492i.m4915e(settings, "settings");
            if (this.f693d) {
                throw new IOException("closed");
            }
            m644h(0, Integer.bitCount(settings.f702a) * 6, 4, 0);
            int r02 = 0;
            while (r02 < 10) {
                boolean z2 = true;
                if (((1 << r02) & settings.f702a) == 0) {
                    z2 = false;
                }
                if (z2) {
                    int r3 = r02 != 4 ? r02 != 7 ? r02 : 4 : 3;
                    C0493w c0493w = this.f690a;
                    if (c0493w.f1248c) {
                        throw new IllegalStateException("closed");
                    }
                    C0477g c0477g = c0493w.f1247b;
                    C0495y m1270v = c0477g.m1270v(2);
                    int r8 = m1270v.f1254c;
                    byte b2 = (byte) ((r3 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    byte[] bArr = m1270v.f1252a;
                    bArr[r8] = b2;
                    bArr[r8 + 1] = (byte) (r3 & KotlinVersion.MAX_COMPONENT_VALUE);
                    m1270v.f1254c = r8 + 2;
                    c0477g.f1217b += 2;
                    c0493w.m1287b();
                    this.f690a.m1289h(settings.f703b[r02]);
                }
                r02++;
            }
            this.f690a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: n */
    public final synchronized void m650n(int r5, long j2) {
        try {
            if (this.f693d) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
            }
            Logger logger = f689f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0248h.m667c(j2, r5, 4, false));
            }
            m644h(r5, 4, 8, 0);
            this.f690a.m1289h((int) j2);
            this.f690a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
