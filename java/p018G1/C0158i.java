package p018G1;

import p016F1.AbstractC0133a;

/* renamed from: G1.i */
/* loaded from: classes.dex */
public final class C0158i extends AbstractC0133a {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC0168s f460e;

    /* renamed from: f */
    public final /* synthetic */ C0159j f461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158i(String str, InterfaceC0168s interfaceC0168s, C0159j c0159j) {
        super(str, true);
        this.f460e = interfaceC0168s;
        this.f461f = c0159j;
    }

    @Override // p016F1.AbstractC0133a
    /* renamed from: a */
    public final long mo426a() {
        C0167r c0167r;
        InterfaceC0168s interfaceC0168s = this.f460e;
        try {
            c0167r = interfaceC0168s.mo486e();
        } catch (Throwable th) {
            c0167r = new C0167r(interfaceC0168s, th, 2);
        }
        C0159j c0159j = this.f461f;
        if (!c0159j.f466e.contains(interfaceC0168s)) {
            return -1L;
        }
        c0159j.f467f.put(c0167r);
        return -1L;
    }
}
