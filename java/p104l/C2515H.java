package p104l;

import p102k.InterfaceC2451D;

/* renamed from: l.H */
/* loaded from: classes.dex */
public final class C2515H extends AbstractViewOnTouchListenerC2501A0 {

    /* renamed from: j */
    public final /* synthetic */ C2529O f8222j;

    /* renamed from: k */
    public final /* synthetic */ C2536S f8223k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2515H(C2536S c2536s, C2536S c2536s2, C2529O c2529o) {
        super(c2536s2);
        this.f8223k = c2536s;
        this.f8222j = c2529o;
    }

    @Override // p104l.AbstractViewOnTouchListenerC2501A0
    /* renamed from: b */
    public final InterfaceC2451D mo4823b() {
        return this.f8222j;
    }

    @Override // p104l.AbstractViewOnTouchListenerC2501A0
    /* renamed from: c */
    public final boolean mo4824c() {
        C2536S c2536s = this.f8223k;
        if (c2536s.getInternalPopup().mo4956b()) {
            return true;
        }
        c2536s.f8282f.mo4958e(AbstractC2519J.m4942b(c2536s), AbstractC2519J.m4941a(c2536s));
        return true;
    }
}
