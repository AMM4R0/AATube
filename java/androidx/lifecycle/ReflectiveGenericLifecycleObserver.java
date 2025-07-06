package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0706p {

    /* renamed from: a */
    public final InterfaceC0707q f2392a;

    /* renamed from: b */
    public final C0691a f2393b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0707q interfaceC0707q) {
        this.f2392a = interfaceC0707q;
        C0693c c0693c = C0693c.f2400c;
        Class<?> cls = interfaceC0707q.getClass();
        C0691a c0691a = (C0691a) c0693c.f2401a.get(cls);
        this.f2393b = c0691a == null ? c0693c.m1787a(cls, null) : c0691a;
    }

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        HashMap hashMap = this.f2393b.f2396a;
        List list = (List) hashMap.get(enumC0702l);
        InterfaceC0707q interfaceC0707q = this.f2392a;
        C0691a.m1785a(list, interfaceC0708r, enumC0702l, interfaceC0707q);
        C0691a.m1785a((List) hashMap.get(EnumC0702l.ON_ANY), interfaceC0708r, enumC0702l, interfaceC0707q);
    }
}
