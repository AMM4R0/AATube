package p024I1;

import p011D1.AbstractC0119f;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.C0484n;
import p051R1.InterfaceC0465B;

/* renamed from: I1.f */
/* loaded from: classes.dex */
public final class C0214f implements InterfaceC0465B {

    /* renamed from: a */
    public final C0484n f636a;

    /* renamed from: b */
    public boolean f637b;

    /* renamed from: c */
    public final /* synthetic */ C0217i f638c;

    public C0214f(C0217i c0217i) {
        this.f638c = c0217i;
        this.f636a = new C0484n(c0217i.f644d.f1246a.mo496d());
    }

    @Override // p051R1.InterfaceC0465B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f637b) {
            return;
        }
        this.f637b = true;
        C0217i c0217i = this.f638c;
        c0217i.getClass();
        C0484n c0484n = this.f636a;
        C0469F c0469f = c0484n.f1228e;
        c0484n.f1228e = C0469F.f1191d;
        c0469f.mo1237a();
        c0469f.mo1238b();
        c0217i.f645e = 3;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: d */
    public final C0469F mo496d() {
        return this.f636a;
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g c0477g, long j2) {
        if (this.f637b) {
            throw new IllegalStateException("closed");
        }
        AbstractC0119f.m395a(c0477g.f1217b, 0L, j2);
        this.f638c.f644d.mo497e(c0477g, j2);
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final void flush() {
        if (this.f637b) {
            return;
        }
        this.f638c.f644d.flush();
    }
}
