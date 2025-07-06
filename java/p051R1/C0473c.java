package p051R1;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC2492i;
import p036M1.AbstractC0379e;

/* renamed from: R1.c */
/* loaded from: classes.dex */
public final class C0473c implements InterfaceC0465B {

    /* renamed from: a */
    public final /* synthetic */ int f1200a = 0;

    /* renamed from: b */
    public final C0466C f1201b;

    /* renamed from: c */
    public final Object f1202c;

    public C0473c(OutputStream outputStream, C0466C c0466c) {
        this.f1202c = outputStream;
        this.f1201b = c0466c;
    }

    @Override // p051R1.InterfaceC0465B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1200a) {
            case 0:
                C0473c c0473c = (C0473c) this.f1202c;
                C0466C c0466c = this.f1201b;
                c0466c.m1243h();
                try {
                    c0473c.close();
                    if (c0466c.m1244i()) {
                        throw c0466c.m1233k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!c0466c.m1244i()) {
                        throw e2;
                    }
                    throw c0466c.m1233k(e2);
                } finally {
                    c0466c.m1244i();
                }
            default:
                ((OutputStream) this.f1202c).close();
                return;
        }
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: d */
    public final C0469F mo496d() {
        switch (this.f1200a) {
        }
        return this.f1201b;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g c0477g, long j2) {
        switch (this.f1200a) {
            case 0:
                AbstractC0379e.m1074e(c0477g.f1217b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    C0495y c0495y = c0477g.f1216a;
                    AbstractC2492i.m4912b(c0495y);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += c0495y.f1254c - c0495y.f1253b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                c0495y = c0495y.f1257f;
                                AbstractC2492i.m4912b(c0495y);
                            }
                        }
                    }
                    C0473c c0473c = (C0473c) this.f1202c;
                    C0466C c0466c = this.f1201b;
                    c0466c.m1243h();
                    try {
                        c0473c.mo497e(c0477g, j3);
                        if (c0466c.m1244i()) {
                            throw c0466c.m1233k(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!c0466c.m1244i()) {
                            throw e2;
                        }
                        throw c0466c.m1233k(e2);
                    } finally {
                        c0466c.m1244i();
                    }
                }
            default:
                AbstractC0379e.m1074e(c0477g.f1217b, 0L, j2);
                while (j2 > 0) {
                    this.f1201b.mo1235f();
                    C0495y c0495y2 = c0477g.f1216a;
                    AbstractC2492i.m4912b(c0495y2);
                    int min = (int) Math.min(j2, c0495y2.f1254c - c0495y2.f1253b);
                    ((OutputStream) this.f1202c).write(c0495y2.f1252a, c0495y2.f1253b, min);
                    int r2 = c0495y2.f1253b + min;
                    c0495y2.f1253b = r2;
                    long j4 = min;
                    j2 -= j4;
                    c0477g.f1217b -= j4;
                    if (r2 == c0495y2.f1254c) {
                        c0477g.f1216a = c0495y2.m1304a();
                        AbstractC0496z.m1308a(c0495y2);
                    }
                }
                return;
        }
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final void flush() {
        switch (this.f1200a) {
            case 0:
                C0473c c0473c = (C0473c) this.f1202c;
                C0466C c0466c = this.f1201b;
                c0466c.m1243h();
                try {
                    c0473c.flush();
                    if (c0466c.m1244i()) {
                        throw c0466c.m1233k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!c0466c.m1244i()) {
                        throw e2;
                    }
                    throw c0466c.m1233k(e2);
                } finally {
                    c0466c.m1244i();
                }
            default:
                ((OutputStream) this.f1202c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f1200a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0473c) this.f1202c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1202c) + ')';
        }
    }

    public C0473c(C0466C c0466c, C0473c c0473c) {
        this.f1201b = c0466c;
        this.f1202c = c0473c;
    }
}
