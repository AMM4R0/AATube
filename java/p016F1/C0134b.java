package p016F1;

import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p011D1.AbstractC0122i;
import p018G1.C0163n;
import p018G1.C0164o;
import p027J1.C0249i;
import p131u1.InterfaceC2799a;

/* renamed from: F1.b */
/* loaded from: classes.dex */
public final class C0134b extends AbstractC0133a {

    /* renamed from: e */
    public final /* synthetic */ int f385e = 2;

    /* renamed from: f */
    public final /* synthetic */ Object f386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134b(C0164o c0164o, String str) {
        super(str, true);
        this.f386f = c0164o;
    }

    @Override // p016F1.AbstractC0133a
    /* renamed from: a */
    public final long mo426a() {
        long j2;
        switch (this.f385e) {
            case 0:
                ((InterfaceC2799a) this.f386f).invoke();
                return -1L;
            case 1:
                return ((Number) ((C0249i) this.f386f).invoke()).longValue();
            default:
                C0164o c0164o = (C0164o) this.f386f;
                long nanoTime = System.nanoTime();
                Map map = c0164o.f508d;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw AbstractC0002c.m10e(it);
                }
                Iterator it2 = c0164o.f511g.iterator();
                while (it2.hasNext()) {
                    if (map.get(((C0163n) it2.next()).f487d.f129a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j3 = (nanoTime - c0164o.f507c) + 1;
                Iterator it3 = c0164o.f511g.iterator();
                int r9 = 0;
                long j4 = Long.MAX_VALUE;
                C0163n c0163n = null;
                C0163n c0163n2 = null;
                int r10 = 0;
                while (it3.hasNext()) {
                    C0163n c0163n3 = (C0163n) it3.next();
                    AbstractC2492i.m4912b(c0163n3);
                    synchronized (c0163n3) {
                        if (c0164o.m523a(c0163n3, nanoTime) > 0) {
                            r10++;
                        } else {
                            int r17 = r9;
                            long j5 = c0163n3.f504u;
                            if (j5 < j3) {
                                j2 = j5;
                                c0163n = c0163n3;
                            } else {
                                j2 = j3;
                            }
                            if (map.get(c0163n3.f487d.f129a) != null) {
                                throw new ClassCastException();
                            }
                            int r5 = r17 + 1;
                            if (j5 < j4) {
                                j4 = j5;
                                c0163n2 = c0163n3;
                            }
                            r9 = r5;
                            j3 = j2;
                        }
                    }
                }
                int r172 = r9;
                if (c0163n == null) {
                    if (r172 > c0164o.f505a) {
                        j3 = j4;
                        c0163n = c0163n2;
                    } else {
                        j3 = -1;
                        c0163n = null;
                    }
                }
                if (c0163n == null) {
                    if (c0163n2 != null) {
                        return (j4 + c0164o.f507c) - nanoTime;
                    }
                    if (r10 > 0) {
                        return c0164o.f507c;
                    }
                    return -1L;
                }
                synchronized (c0163n) {
                    if (!c0163n.f503t.isEmpty()) {
                        return 0L;
                    }
                    if (c0163n.f504u != j3) {
                        return 0L;
                    }
                    c0163n.f497n = true;
                    c0164o.f511g.remove(c0163n);
                    if (map.get(c0163n.f487d.f129a) != null) {
                        throw new ClassCastException();
                    }
                    Socket socket = c0163n.f489f;
                    AbstractC2492i.m4912b(socket);
                    AbstractC0122i.m412b(socket);
                    if (!c0164o.f511g.isEmpty()) {
                        return 0L;
                    }
                    c0164o.f509e.m428a();
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134b(String str, C0249i c0249i) {
        super(str, true);
        this.f386f = c0249i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134b(String str, boolean z2, InterfaceC2799a interfaceC2799a) {
        super(str, z2);
        this.f386f = interfaceC2799a;
    }
}
