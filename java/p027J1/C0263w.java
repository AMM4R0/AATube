package p027J1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p011D1.AbstractC0119f;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.C0480j;
import p051R1.C0494x;
import p051R1.InterfaceC0467D;

/* renamed from: J1.w */
/* loaded from: classes.dex */
public final class C0263w implements InterfaceC0467D {

    /* renamed from: a */
    public final C0494x f806a;

    /* renamed from: b */
    public int f807b;

    /* renamed from: c */
    public int f808c;

    /* renamed from: d */
    public int f809d;

    /* renamed from: e */
    public int f810e;

    /* renamed from: f */
    public int f811f;

    public C0263w(C0494x source) {
        AbstractC2492i.m4915e(source, "source");
        this.f806a = source;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        int r02;
        int m1294j;
        AbstractC2492i.m4915e(sink, "sink");
        do {
            int r03 = this.f810e;
            C0494x c0494x = this.f806a;
            if (r03 != 0) {
                long mo390a = c0494x.mo390a(sink, Math.min(j2, r03));
                if (mo390a == -1) {
                    return -1L;
                }
                this.f810e -= (int) mo390a;
                return mo390a;
            }
            c0494x.m1303s(this.f811f);
            this.f811f = 0;
            if ((this.f808c & 4) != 0) {
                return -1L;
            }
            r02 = this.f809d;
            int m407m = AbstractC0119f.m407m(c0494x);
            this.f810e = m407m;
            this.f807b = m407m;
            int m1292h = c0494x.m1292h() & 255;
            this.f808c = c0494x.m1292h() & 255;
            Logger logger = C0264x.f812d;
            if (logger.isLoggable(Level.FINE)) {
                C0480j c0480j = AbstractC0248h.f742a;
                logger.fine(AbstractC0248h.m666b(true, this.f809d, this.f807b, m1292h, this.f808c));
            }
            m1294j = c0494x.m1294j() & Integer.MAX_VALUE;
            this.f809d = m1294j;
            if (m1292h != 9) {
                throw new IOException(m1292h + " != TYPE_CONTINUATION");
            }
        } while (m1294j == r02);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f806a.f1249a.mo391d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
