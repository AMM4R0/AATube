package androidx.activity;

import androidx.fragment.app.C0674x;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.InterfaceC0706p;
import androidx.lifecycle.InterfaceC0708r;
import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0706p, InterfaceC0584c {

    /* renamed from: a */
    public final C0710t f1651a;

    /* renamed from: b */
    public final C0674x f1652b;

    /* renamed from: c */
    public C0599r f1653c;

    /* renamed from: d */
    public final /* synthetic */ C0604t f1654d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0604t c0604t, C0710t c0710t, C0674x onBackPressedCallback) {
        AbstractC2492i.m4915e(onBackPressedCallback, "onBackPressedCallback");
        this.f1654d = c0604t;
        this.f1651a = c0710t;
        this.f1652b = onBackPressedCallback;
        c0710t.m1791a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        if (enumC0702l != EnumC0702l.ON_START) {
            if (enumC0702l != EnumC0702l.ON_STOP) {
                if (enumC0702l == EnumC0702l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0599r c0599r = this.f1653c;
                if (c0599r != null) {
                    c0599r.cancel();
                    return;
                }
                return;
            }
        }
        C0604t c0604t = this.f1654d;
        c0604t.getClass();
        C0674x onBackPressedCallback = this.f1652b;
        AbstractC2492i.m4915e(onBackPressedCallback, "onBackPressedCallback");
        c0604t.f1709b.m5098d(onBackPressedCallback);
        C0599r c0599r2 = new C0599r(c0604t, onBackPressedCallback);
        onBackPressedCallback.f2358b.add(c0599r2);
        c0604t.m1485d();
        onBackPressedCallback.f2359c = new C0603s(0, c0604t, C0604t.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
        this.f1653c = c0599r2;
    }

    @Override // androidx.activity.InterfaceC0584c
    public final void cancel() {
        this.f1651a.m1796f(this);
        this.f1652b.f2358b.remove(this);
        C0599r c0599r = this.f1653c;
        if (c0599r != null) {
            c0599r.cancel();
        }
        this.f1653c = null;
    }
}
