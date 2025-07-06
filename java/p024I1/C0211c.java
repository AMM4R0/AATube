package p024I1;

import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.C0484n;
import p051R1.C0493w;
import p051R1.InterfaceC0465B;

/* renamed from: I1.c */
/* loaded from: classes.dex */
public final class C0211c implements InterfaceC0465B {

    /* renamed from: a */
    public final C0484n f627a;

    /* renamed from: b */
    public boolean f628b;

    /* renamed from: c */
    public final /* synthetic */ C0217i f629c;

    public C0211c(C0217i c0217i) {
        this.f629c = c0217i;
        this.f627a = new C0484n(c0217i.f644d.f1246a.mo496d());
    }

    @Override // p051R1.InterfaceC0465B, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f628b) {
            return;
        }
        this.f628b = true;
        this.f629c.f644d.mo1253c("0\r\n\r\n");
        C0217i c0217i = this.f629c;
        C0484n c0484n = this.f627a;
        c0217i.getClass();
        C0469F c0469f = c0484n.f1228e;
        c0484n.f1228e = C0469F.f1191d;
        c0469f.mo1237a();
        c0469f.mo1238b();
        this.f629c.f645e = 3;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: d */
    public final C0469F mo496d() {
        return this.f627a;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g c0477g, long j2) {
        if (this.f628b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        C0217i c0217i = this.f629c;
        C0493w c0493w = c0217i.f644d;
        if (c0493w.f1248c) {
            throw new IllegalStateException("closed");
        }
        c0493w.f1247b.m1247B(j2);
        c0493w.m1287b();
        C0493w c0493w2 = c0217i.f644d;
        c0493w2.mo1253c("\r\n");
        c0493w2.mo497e(c0477g, j2);
        c0493w2.mo1253c("\r\n");
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final synchronized void flush() {
        if (this.f628b) {
            return;
        }
        this.f629c.f644d.flush();
    }
}
