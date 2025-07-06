package p018G1;

/* renamed from: G1.q */
/* loaded from: classes.dex */
public final class C0166q implements InterfaceC0168s {

    /* renamed from: a */
    public final C0163n f528a;

    public C0166q(C0163n c0163n) {
        this.f528a = c0163n;
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: a */
    public final InterfaceC0168s mo482a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: c */
    public final boolean mo484c() {
        return true;
    }

    @Override // p018G1.InterfaceC0168s, p021H1.InterfaceC0188d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: e */
    public final C0167r mo486e() {
        throw new IllegalStateException("already connected");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: f */
    public final C0167r mo487f() {
        throw new IllegalStateException("already connected");
    }

    @Override // p018G1.InterfaceC0168s
    /* renamed from: g */
    public final C0163n mo488g() {
        return this.f528a;
    }
}
