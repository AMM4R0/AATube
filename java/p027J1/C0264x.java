package p027J1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p008C1.C0083o;
import p011D1.AbstractC0119f;
import p011D1.AbstractC0122i;
import p016F1.C0135c;
import p051R1.C0477g;
import p051R1.C0480j;
import p051R1.C0494x;

/* renamed from: J1.x */
/* loaded from: classes.dex */
public final class C0264x implements Closeable {

    /* renamed from: d */
    public static final Logger f812d;

    /* renamed from: a */
    public final C0494x f813a;

    /* renamed from: b */
    public final C0263w f814b;

    /* renamed from: c */
    public final C0245e f815c;

    static {
        Logger logger = Logger.getLogger(AbstractC0248h.class.getName());
        AbstractC2492i.m4914d(logger, "getLogger(...)");
        f812d = logger;
    }

    public C0264x(C0494x source) {
        AbstractC2492i.m4915e(source, "source");
        this.f813a = source;
        C0263w c0263w = new C0263w(source);
        this.f814b = c0263w;
        this.f815c = new C0245e(c0263w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x015c, code lost:
    
        throw new java.io.IOException(p000A.AbstractC0002c.m11f(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m681b(boolean r17, p027J1.C0254n r18) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0264x.m681b(boolean, J1.n):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f813a.close();
    }

    /* renamed from: g */
    public final void m682g(C0254n c0254n, int r20, int r21, int r22) {
        int r5;
        int r8;
        C0234B c0234b;
        boolean z2;
        if (r22 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (r21 & 1) != 0;
        if ((r21 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((r21 & 8) != 0) {
            byte m1292h = this.f813a.m1292h();
            byte[] bArr = AbstractC0119f.f362a;
            r8 = m1292h & 255;
            r5 = r20;
        } else {
            r5 = r20;
            r8 = 0;
        }
        int m680a = AbstractC0262v.m680a(r5, r21, r8);
        C0494x source = this.f813a;
        c0254n.getClass();
        AbstractC2492i.m4915e(source, "source");
        c0254n.f756b.getClass();
        if (r22 == 0 || (r22 & 1) != 0) {
            C0234B m672h = c0254n.f756b.m672h(r22);
            if (m672h == null) {
                c0254n.f756b.m678n(r22, EnumC0242b.PROTOCOL_ERROR);
                long j2 = m680a;
                c0254n.f756b.m676l(j2);
                source.m1303s(j2);
            } else {
                C0083o c0083o = AbstractC0122i.f368a;
                C0266z c0266z = m672h.f683h;
                long j3 = m680a;
                c0266z.getClass();
                long j4 = j3;
                while (true) {
                    if (j4 <= 0) {
                        C0083o c0083o2 = AbstractC0122i.f368a;
                        c0266z.f826g.f677b.m676l(j3);
                        c0266z.f826g.f677b.f787q.getClass();
                        break;
                    }
                    C0234B c0234b2 = c0266z.f826g;
                    synchronized (c0234b2) {
                        try {
                            z2 = c0266z.f821b;
                            c0234b = c0234b2;
                        } catch (Throwable th) {
                            th = th;
                            c0234b = c0234b2;
                        }
                        try {
                            boolean z4 = c0266z.f823d.f1217b + j4 > c0266z.f820a;
                            if (z4) {
                                source.m1303s(j4);
                                c0266z.f826g.m634e(EnumC0242b.FLOW_CONTROL_ERROR);
                                break;
                            }
                            if (z2) {
                                source.m1303s(j4);
                                break;
                            }
                            long mo390a = source.mo390a(c0266z.f822c, j4);
                            if (mo390a == -1) {
                                throw new EOFException();
                            }
                            j4 -= mo390a;
                            C0234B c0234b3 = c0266z.f826g;
                            synchronized (c0234b3) {
                                try {
                                    if (c0266z.f825f) {
                                        C0477g c0477g = c0266z.f822c;
                                        c0477g.m1268t(c0477g.f1217b);
                                    } else {
                                        C0477g c0477g2 = c0266z.f823d;
                                        boolean z5 = c0477g2.f1217b == 0;
                                        c0477g2.m1273y(c0266z.f822c);
                                        if (z5) {
                                            c0234b3.notifyAll();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                }
                if (z3) {
                    m672h.m639j(AbstractC0122i.f368a, true);
                }
            }
        } else {
            C0259s c0259s = c0254n.f756b;
            c0259s.getClass();
            C0477g c0477g3 = new C0477g();
            long j5 = m680a;
            source.m1302r(j5);
            source.mo390a(c0477g3, j5);
            C0135c.m427c(c0259s.f779i, c0259s.f773c + '[' + r22 + "] onData", new C0255o(c0259s, r22, c0477g3, m680a, z3));
        }
        this.f813a.m1303s(r8);
    }

    /* renamed from: h */
    public final void m683h(C0254n c0254n, int r9, int r10) {
        EnumC0242b enumC0242b;
        Object[] array;
        if (r9 < 8) {
            throw new IOException(AbstractC0002c.m11f(r9, "TYPE_GOAWAY length < 8: "));
        }
        if (r10 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int m1294j = this.f813a.m1294j();
        int m1294j2 = this.f813a.m1294j();
        int r92 = r9 - 8;
        EnumC0242b.f705b.getClass();
        EnumC0242b[] values = EnumC0242b.values();
        int length = values.length;
        int r4 = 0;
        while (true) {
            if (r4 >= length) {
                enumC0242b = null;
                break;
            }
            enumC0242b = values[r4];
            if (enumC0242b.f713a == m1294j2) {
                break;
            } else {
                r4++;
            }
        }
        if (enumC0242b == null) {
            throw new IOException(AbstractC0002c.m11f(m1294j2, "TYPE_GOAWAY unexpected error code: "));
        }
        C0480j debugData = C0480j.f1218d;
        if (r92 > 0) {
            debugData = this.f813a.m1293i(r92);
        }
        c0254n.getClass();
        AbstractC2492i.m4915e(debugData, "debugData");
        debugData.mo1220b();
        C0259s c0259s = c0254n.f756b;
        synchronized (c0259s) {
            array = c0259s.f772b.values().toArray(new C0234B[0]);
            c0259s.f776f = true;
        }
        for (C0234B c0234b : (C0234B[]) array) {
            if (c0234b.f676a > m1294j && c0234b.m637h()) {
                c0234b.m640k(EnumC0242b.REFUSED_STREAM);
                c0254n.f756b.m674j(c0234b.f676a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f724a);
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m684i(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0264x.m684i(int, int, int, int):java.util.List");
    }

    /* renamed from: j */
    public final void m685j(C0254n c0254n, int r11, int r12, int r13) {
        int r14;
        int r02 = 1;
        if (r13 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (r12 & 1) != 0;
        if ((r12 & 8) != 0) {
            byte m1292h = this.f813a.m1292h();
            byte[] bArr = AbstractC0119f.f362a;
            r14 = m1292h & 255;
        } else {
            r14 = 0;
        }
        if ((r12 & 32) != 0) {
            C0494x c0494x = this.f813a;
            c0494x.m1294j();
            c0494x.m1292h();
            byte[] bArr2 = AbstractC0119f.f362a;
            c0254n.getClass();
            r11 -= 5;
        }
        List m684i = m684i(AbstractC0262v.m680a(r11, r12, r14), r14, r12, r13);
        c0254n.getClass();
        c0254n.f756b.getClass();
        if (r13 != 0 && (r13 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            C0259s c0259s = c0254n.f756b;
            c0259s.getClass();
            C0135c.m427c(c0259s.f779i, c0259s.f773c + '[' + r13 + "] onHeaders", new C0256p(c0259s, r13, m684i, z3));
            return;
        }
        C0259s c0259s2 = c0254n.f756b;
        synchronized (c0259s2) {
            C0234B m672h = c0259s2.m672h(r13);
            if (m672h != null) {
                m672h.m639j(AbstractC0122i.m418h(m684i), z3);
                return;
            }
            if (c0259s2.f776f) {
                return;
            }
            if (r13 <= c0259s2.f774d) {
                return;
            }
            if (r13 % 2 == c0259s2.f775e % 2) {
                return;
            }
            C0234B c0234b = new C0234B(r13, c0259s2, false, z3, AbstractC0122i.m418h(m684i));
            c0259s2.f774d = r13;
            c0259s2.f772b.put(Integer.valueOf(r13), c0234b);
            C0135c.m427c(c0259s2.f777g.m437e(), c0259s2.f773c + '[' + r13 + "] onStream", new C0252l(c0259s2, r02, c0234b));
        }
    }

    /* renamed from: k */
    public final void m686k(C0254n c0254n, int r5, int r6, int r7) {
        if (r5 != 8) {
            throw new IOException(AbstractC0002c.m11f(r5, "TYPE_PING length != 8: "));
        }
        if (r7 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int m1294j = this.f813a.m1294j();
        int m1294j2 = this.f813a.m1294j();
        if ((r6 & 1) == 0) {
            C0135c.m427c(c0254n.f756b.f778h, AbstractC0002c.m17l(new StringBuilder(), c0254n.f756b.f773c, " ping"), new C0253m(c0254n.f756b, m1294j, m1294j2));
            return;
        }
        C0259s c0259s = c0254n.f756b;
        synchronized (c0259s) {
            try {
                if (m1294j == 1) {
                    c0259s.f783m++;
                } else if (m1294j == 2) {
                    c0259s.f785o++;
                } else if (m1294j == 3) {
                    c0259s.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void m687l(C0254n c0254n, int r5, int r6, int r7) {
        int r02;
        if (r7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((r6 & 8) != 0) {
            byte m1292h = this.f813a.m1292h();
            byte[] bArr = AbstractC0119f.f362a;
            r02 = m1292h & 255;
        } else {
            r02 = 0;
        }
        int m1294j = this.f813a.m1294j() & Integer.MAX_VALUE;
        List m684i = m684i(AbstractC0262v.m680a(r5 - 4, r6, r02), r02, r6, r7);
        c0254n.getClass();
        C0259s c0259s = c0254n.f756b;
        c0259s.getClass();
        synchronized (c0259s) {
            if (c0259s.f796z.contains(Integer.valueOf(m1294j))) {
                c0259s.m678n(m1294j, EnumC0242b.PROTOCOL_ERROR);
                return;
            }
            c0259s.f796z.add(Integer.valueOf(m1294j));
            C0135c.m427c(c0259s.f779i, c0259s.f773c + '[' + m1294j + "] onRequest", new C0256p(c0259s, m1294j, m684i, 1));
        }
    }
}
