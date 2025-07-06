package p018G1;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;
import p008C1.C0069a;
import p008C1.C0085q;
import p010D0.C0109g;
import p011D1.AbstractC0122i;
import p108m1.C2668r;

/* renamed from: G1.u */
/* loaded from: classes.dex */
public final class C0170u {

    /* renamed from: a */
    public final C0069a f534a;

    /* renamed from: b */
    public final C0055g f535b;

    /* renamed from: c */
    public final C0109g f536c;

    /* renamed from: d */
    public final boolean f537d;

    /* renamed from: e */
    public final List f538e;

    /* renamed from: f */
    public int f539f;

    /* renamed from: g */
    public Object f540g;

    /* renamed from: h */
    public final ArrayList f541h;

    public C0170u(C0069a c0069a, C0055g routeDatabase, C0109g c0109g, boolean z2) {
        List m416f;
        AbstractC2492i.m4915e(routeDatabase, "routeDatabase");
        this.f534a = c0069a;
        this.f535b = routeDatabase;
        this.f536c = c0109g;
        this.f537d = z2;
        C2668r c2668r = C2668r.f8607a;
        this.f538e = c2668r;
        this.f540g = c2668r;
        this.f541h = new ArrayList();
        C0085q url = c0069a.f147h;
        AbstractC2492i.m4915e(url, "url");
        C0162m c0162m = (C0162m) c0109g.f338b;
        c0162m.getClass();
        URI m288g = url.m288g();
        if (m288g.getHost() == null) {
            m416f = AbstractC0122i.m416f(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0069a.f146g.select(m288g);
            m416f = (select == null || select.isEmpty()) ? AbstractC0122i.m416f(Proxy.NO_PROXY) : AbstractC0122i.m420j(select);
        }
        this.f538e = m416f;
        this.f539f = 0;
        c0162m.getClass();
    }

    /* renamed from: a */
    public final boolean m534a() {
        return this.f539f < this.f538e.size() || !this.f541h.isEmpty();
    }
}
