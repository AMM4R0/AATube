package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0706p {

    /* renamed from: a */
    public final InterfaceC0694d f2374a;

    /* renamed from: b */
    public final InterfaceC0706p f2375b;

    public DefaultLifecycleObserverAdapter(InterfaceC0694d interfaceC0694d, InterfaceC0706p interfaceC0706p) {
        this.f2374a = interfaceC0694d;
        this.f2375b = interfaceC0706p;
    }

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        int r02 = AbstractC0695e.f2403a[enumC0702l.ordinal()];
        InterfaceC0694d interfaceC0694d = this.f2374a;
        if (r02 == 3) {
            interfaceC0694d.mo1610a();
        } else if (r02 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0706p interfaceC0706p = this.f2375b;
        if (interfaceC0706p != null) {
            interfaceC0706p.mo1460b(interfaceC0708r, enumC0702l);
        }
    }
}
