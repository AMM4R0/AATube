package p018G1;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0088t;
import p008C1.C0094z;
import p008C1.InterfaceC0086r;
import p021H1.C0191g;
import p021H1.InterfaceC0189e;
import p024I1.C0217i;
import p027J1.C0259s;
import p027J1.C0261u;
import p051R1.C0493w;
import p051R1.C0494x;

/* renamed from: G1.a */
/* loaded from: classes.dex */
public final class C0150a implements InterfaceC0086r {

    /* renamed from: a */
    public static final C0150a f417a = new C0150a();

    @Override // p008C1.InterfaceC0086r
    /* renamed from: a */
    public final C0094z mo289a(C0191g c0191g) {
        InterfaceC0189e c0217i;
        C0162m c0162m = c0191g.f577a;
        c0162m.getClass();
        synchronized (c0162m) {
            try {
                if (!c0162m.f481l) {
                    throw new IllegalStateException("released");
                }
                if (c0162m.f480k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (c0162m.f479j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC0156g interfaceC0156g = c0162m.f476g;
        AbstractC2492i.m4912b(interfaceC0156g);
        C0163n mo210h = interfaceC0156g.mo210h();
        C0088t c0088t = c0162m.f470a;
        mo210h.getClass();
        Socket socket = mo210h.f489f;
        AbstractC2492i.m4912b(socket);
        C0494x c0494x = mo210h.f492i;
        AbstractC2492i.m4912b(c0494x);
        C0493w c0493w = mo210h.f493j;
        AbstractC2492i.m4912b(c0493w);
        C0259s c0259s = mo210h.f496m;
        if (c0259s != null) {
            c0217i = new C0261u(c0088t, mo210h, c0191g, c0259s);
        } else {
            int r7 = c0191g.f583g;
            socket.setSoTimeout(r7);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c0494x.f1249a.mo391d().mo1236g(r7, timeUnit);
            c0493w.f1246a.mo496d().mo1236g(c0191g.f584h, timeUnit);
            c0217i = new C0217i(c0088t, mo210h, c0494x, c0493w);
        }
        C0155f c0155f = new C0155f(c0162m, interfaceC0156g, c0217i);
        c0162m.f478i = c0155f;
        c0162m.f483n = c0155f;
        synchronized (c0162m) {
            c0162m.f479j = true;
            c0162m.f480k = true;
        }
        if (c0162m.f482m) {
            throw new IOException("Canceled");
        }
        return C0191g.m553a(c0191g, 0, c0155f, null, 61).m554b(c0191g.f581e);
    }
}
