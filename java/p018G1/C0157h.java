package p018G1;

/* renamed from: G1.h */
/* loaded from: classes.dex */
public final class C0157h implements InterfaceC0168s {

    /* renamed from: a */
    public final C0167r f459a;

    public C0157h(Throwable th) {
        this.f459a = new C0167r(this, th, 2);
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: a */
    public final InterfaceC0168s mo482a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: c */
    public final boolean mo484c() {
        return false;
    }

    @Override // p018G1.InterfaceC0168s, p021H1.InterfaceC0188d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: e */
    public final C0167r mo486e() {
        return this.f459a;
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: f */
    public final C0167r mo487f() {
        return this.f459a;
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: g */
    public final C0163n mo488g() {
        throw new IllegalStateException("unexpected call");
    }
}
