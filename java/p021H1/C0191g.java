package p021H1;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0085q;
import p008C1.C0091w;
import p008C1.C0094z;
import p008C1.InterfaceC0086r;
import p018G1.C0155f;
import p018G1.C0162m;

/* renamed from: H1.g */
/* loaded from: classes.dex */
public final class C0191g {

    /* renamed from: a */
    public final C0162m f577a;

    /* renamed from: b */
    public final ArrayList f578b;

    /* renamed from: c */
    public final int f579c;

    /* renamed from: d */
    public final C0155f f580d;

    /* renamed from: e */
    public final C0091w f581e;

    /* renamed from: f */
    public final int f582f;

    /* renamed from: g */
    public final int f583g;

    /* renamed from: h */
    public final int f584h;

    /* renamed from: i */
    public int f585i;

    public C0191g(C0162m call, ArrayList arrayList, int r4, C0155f c0155f, C0091w c0091w, int r7, int r8, int r9) {
        AbstractC2492i.m4915e(call, "call");
        this.f577a = call;
        this.f578b = arrayList;
        this.f579c = r4;
        this.f580d = c0155f;
        this.f581e = c0091w;
        this.f582f = r7;
        this.f583g = r8;
        this.f584h = r9;
    }

    /* renamed from: a */
    public static C0191g m553a(C0191g c0191g, int r10, C0155f c0155f, C0091w c0091w, int r13) {
        if ((r13 & 1) != 0) {
            r10 = c0191g.f579c;
        }
        int r3 = r10;
        if ((r13 & 2) != 0) {
            c0155f = c0191g.f580d;
        }
        C0155f c0155f2 = c0155f;
        if ((r13 & 4) != 0) {
            c0091w = c0191g.f581e;
        }
        C0091w request = c0091w;
        int r6 = c0191g.f582f;
        int r7 = c0191g.f583g;
        int r8 = c0191g.f584h;
        c0191g.getClass();
        AbstractC2492i.m4915e(request, "request");
        return new C0191g(c0191g.f577a, c0191g.f578b, r3, c0155f2, request, r6, r7, r8);
    }

    /* renamed from: b */
    public final C0094z m554b(C0091w request) {
        AbstractC2492i.m4915e(request, "request");
        ArrayList arrayList = this.f578b;
        int size = arrayList.size();
        int r2 = this.f579c;
        if (r2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f585i++;
        C0155f c0155f = this.f580d;
        if (c0155f != null) {
            if (!c0155f.f456b.mo215m().m532i((C0085q) request.f294b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(r2 - 1) + " must retain the same host and port").toString());
            }
            if (this.f585i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(r2 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int r6 = r2 + 1;
        C0191g m553a = m553a(this, r6, null, request, 58);
        InterfaceC0086r interfaceC0086r = (InterfaceC0086r) arrayList.get(r2);
        C0094z mo289a = interfaceC0086r.mo289a(m553a);
        if (mo289a == null) {
            throw new NullPointerException("interceptor " + interfaceC0086r + " returned null");
        }
        if (c0155f == null || r6 >= arrayList.size() || m553a.f585i == 1) {
            return mo289a;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC0086r + " must call proceed() exactly once").toString());
    }
}
