package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0706p {

    /* renamed from: a */
    public boolean f2395a;

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        if (enumC0702l == EnumC0702l.ON_DESTROY) {
            this.f2395a = false;
            interfaceC0708r.mo1475e().m1796f(this);
        }
    }
}
