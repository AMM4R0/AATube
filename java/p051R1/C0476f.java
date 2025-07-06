package p051R1;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2492i;
import p036M1.AbstractC0379e;

/* renamed from: R1.f */
/* loaded from: classes.dex */
public final class C0476f extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ int f1214a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0479i f1215b;

    public /* synthetic */ C0476f(InterfaceC0479i interfaceC0479i, int r2) {
        this.f1214a = r2;
        this.f1215b = interfaceC0479i;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f1214a) {
            case 0:
                return (int) Math.min(((C0477g) this.f1215b).f1217b, Integer.MAX_VALUE);
            default:
                C0494x c0494x = (C0494x) this.f1215b;
                if (c0494x.f1251c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c0494x.f1250b.f1217b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1214a) {
            case 0:
                break;
            default:
                ((C0494x) this.f1215b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f1214a) {
            case 0:
                C0477g c0477g = (C0477g) this.f1215b;
                if (c0477g.f1217b > 0) {
                    return c0477g.m1259k() & 255;
                }
                return -1;
            default:
                C0494x c0494x = (C0494x) this.f1215b;
                if (c0494x.f1251c) {
                    throw new IOException("closed");
                }
                C0477g c0477g2 = c0494x.f1250b;
                if (c0477g2.f1217b == 0 && c0494x.f1249a.mo390a(c0477g2, 8192L) == -1) {
                    return -1;
                }
                return c0477g2.m1259k() & 255;
        }
    }

    public final String toString() {
        switch (this.f1214a) {
            case 0:
                return ((C0477g) this.f1215b) + ".inputStream()";
            default:
                return ((C0494x) this.f1215b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int r10, int r11) {
        switch (this.f1214a) {
            case 0:
                AbstractC2492i.m4915e(sink, "sink");
                return ((C0477g) this.f1215b).m1258j(sink, r10, r11);
            default:
                AbstractC2492i.m4915e(sink, "data");
                C0494x c0494x = (C0494x) this.f1215b;
                if (!c0494x.f1251c) {
                    AbstractC0379e.m1074e(sink.length, r10, r11);
                    C0477g c0477g = c0494x.f1250b;
                    if (c0477g.f1217b == 0 && c0494x.f1249a.mo390a(c0477g, 8192L) == -1) {
                        return -1;
                    }
                    return c0477g.m1258j(sink, r10, r11);
                }
                throw new IOException("closed");
        }
    }

    /* renamed from: b */
    private final void m1245b() {
    }
}
