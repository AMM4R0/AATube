package androidx.lifecycle;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0706p {

    /* renamed from: a */
    public final C0684H f2394a;

    public SavedStateHandleAttacher(C0684H c0684h) {
        this.f2394a = c0684h;
    }

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        if (enumC0702l != EnumC0702l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0702l).toString());
        }
        interfaceC0708r.mo1475e().m1796f(this);
        C0684H c0684h = this.f2394a;
        if (c0684h.f2383b) {
            return;
        }
        Bundle m2429c = c0684h.f2382a.m2429c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0684h.f2384c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (m2429c != null) {
            bundle.putAll(m2429c);
        }
        c0684h.f2384c = bundle;
        c0684h.f2383b = true;
    }
}
