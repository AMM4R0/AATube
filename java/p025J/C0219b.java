package p025J;

/* renamed from: J.b */
/* loaded from: classes.dex */
public final class C0219b extends C0218a {

    /* renamed from: c */
    public final Object f650c;

    public C0219b() {
        super(12);
        this.f650c = new Object();
    }

    @Override // p025J.C0218a
    /* renamed from: a */
    public final Object mo608a() {
        Object mo608a;
        synchronized (this.f650c) {
            mo608a = super.mo608a();
        }
        return mo608a;
    }

    @Override // p025J.C0218a
    /* renamed from: c */
    public final boolean mo610c(Object obj) {
        boolean mo610c;
        synchronized (this.f650c) {
            mo610c = super.mo610c(obj);
        }
        return mo610c;
    }
}
