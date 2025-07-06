package p051R1;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p036M1.AbstractC0387m;

/* renamed from: R1.d */
/* loaded from: classes.dex */
public final class C0474d implements InterfaceC0467D {

    /* renamed from: a */
    public final /* synthetic */ int f1203a;

    /* renamed from: b */
    public final Object f1204b;

    /* renamed from: c */
    public final Object f1205c;

    public /* synthetic */ C0474d(Object obj, int r2, Object obj2) {
        this.f1203a = r2;
        this.f1204b = obj;
        this.f1205c = obj2;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        switch (this.f1203a) {
            case 0:
                AbstractC2492i.m4915e(sink, "sink");
                C0474d c0474d = (C0474d) this.f1205c;
                C0466C c0466c = (C0466C) this.f1204b;
                c0466c.m1243h();
                try {
                    long mo390a = c0474d.mo390a(sink, j2);
                    if (c0466c.m1244i()) {
                        throw c0466c.m1233k(null);
                    }
                    return mo390a;
                } catch (IOException e2) {
                    if (c0466c.m1244i()) {
                        throw c0466c.m1233k(e2);
                    }
                    throw e2;
                } finally {
                    c0466c.m1244i();
                }
            default:
                AbstractC2492i.m4915e(sink, "sink");
                if (j2 == 0) {
                    return 0L;
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
                }
                try {
                    ((C0469F) this.f1205c).mo1235f();
                    C0495y m1270v = sink.m1270v(1);
                    int read = ((InputStream) this.f1204b).read(m1270v.f1252a, m1270v.f1254c, (int) Math.min(j2, 8192 - m1270v.f1254c));
                    if (read == -1) {
                        if (m1270v.f1253b == m1270v.f1254c) {
                            sink.f1216a = m1270v.m1304a();
                            AbstractC0496z.m1308a(m1270v);
                        }
                        return -1L;
                    }
                    m1270v.f1254c += read;
                    long j3 = read;
                    sink.f1217b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (AbstractC0387m.m1099A(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1203a) {
            case 0:
                C0474d c0474d = (C0474d) this.f1205c;
                C0466C c0466c = (C0466C) this.f1204b;
                c0466c.m1243h();
                try {
                    c0474d.close();
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
                ((InputStream) this.f1204b).close();
                return;
        }
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        switch (this.f1203a) {
            case 0:
                return (C0466C) this.f1204b;
            default:
                return (C0469F) this.f1205c;
        }
    }

    public final String toString() {
        switch (this.f1203a) {
            case 0:
                return "AsyncTimeout.source(" + ((C0474d) this.f1205c) + ')';
            default:
                return "source(" + ((InputStream) this.f1204b) + ')';
        }
    }
}
