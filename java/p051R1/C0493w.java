package p051R1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: R1.w */
/* loaded from: classes.dex */
public final class C0493w implements InterfaceC0478h {

    /* renamed from: a */
    public final InterfaceC0465B f1246a;

    /* renamed from: b */
    public final C0477g f1247b;

    /* renamed from: c */
    public boolean f1248c;

    public C0493w(InterfaceC0465B sink) {
        AbstractC2492i.m4915e(sink, "sink");
        this.f1246a = sink;
        this.f1247b = new C0477g();
    }

    /* renamed from: b */
    public final InterfaceC0478h m1287b() {
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        C0477g c0477g = this.f1247b;
        long j2 = c0477g.f1217b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            C0495y c0495y = c0477g.f1216a;
            AbstractC2492i.m4912b(c0495y);
            C0495y c0495y2 = c0495y.f1258g;
            AbstractC2492i.m4912b(c0495y2);
            if (c0495y2.f1254c < 8192 && c0495y2.f1256e) {
                j2 -= r6 - c0495y2.f1253b;
            }
        }
        if (j2 > 0) {
            this.f1246a.mo497e(c0477g, j2);
        }
        return this;
    }

    @Override // p051R1.InterfaceC0478h
    /* renamed from: c */
    public final InterfaceC0478h mo1253c(String string) {
        AbstractC2492i.m4915e(string, "string");
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        this.f1247b.m1249D(string);
        m1287b();
        return this;
    }

    @Override // p051R1.InterfaceC0465B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0465B interfaceC0465B = this.f1246a;
        if (this.f1248c) {
            return;
        }
        try {
            C0477g c0477g = this.f1247b;
            long j2 = c0477g.f1217b;
            if (j2 > 0) {
                interfaceC0465B.mo497e(c0477g, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC0465B.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f1248c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: d */
    public final C0469F mo496d() {
        return this.f1246a.mo496d();
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g source, long j2) {
        AbstractC2492i.m4915e(source, "source");
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        this.f1247b.mo497e(source, j2);
        m1287b();
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final void flush() {
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        C0477g c0477g = this.f1247b;
        long j2 = c0477g.f1217b;
        InterfaceC0465B interfaceC0465B = this.f1246a;
        if (j2 > 0) {
            interfaceC0465B.mo497e(c0477g, j2);
        }
        interfaceC0465B.flush();
    }

    /* renamed from: g */
    public final InterfaceC0478h m1288g(int r2) {
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        this.f1247b.m1274z(r2);
        m1287b();
        return this;
    }

    /* renamed from: h */
    public final InterfaceC0478h m1289h(int r2) {
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        this.f1247b.m1248C(r2);
        m1287b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1248c;
    }

    public final String toString() {
        return "buffer(" + this.f1246a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC2492i.m4915e(source, "source");
        if (this.f1248c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f1247b.write(source);
        m1287b();
        return write;
    }
}
