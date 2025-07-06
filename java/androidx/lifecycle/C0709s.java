package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C0709s {

    /* renamed from: a */
    public EnumC0703m f2412a;

    /* renamed from: b */
    public InterfaceC0706p f2413b;

    /* renamed from: a */
    public final void m1790a(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        EnumC0703m m1789a = enumC0702l.m1789a();
        EnumC0703m state1 = this.f2412a;
        AbstractC2492i.m4915e(state1, "state1");
        if (m1789a.compareTo(state1) < 0) {
            state1 = m1789a;
        }
        this.f2412a = state1;
        this.f2413b.mo1460b(interfaceC0708r, enumC0702l);
        this.f2412a = m1789a;
    }
}
