package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.g5 */
/* loaded from: classes.dex */
public final class C1863g5 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f6294a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m3850a(InterfaceC1065A4 interfaceC1065A4) {
        this.f6294a.add(interfaceC1065A4);
    }

    /* renamed from: b */
    public final void m3851b(InterfaceC1065A4 interfaceC1065A4) {
        this.f6294a.remove(interfaceC1065A4);
    }

    /* renamed from: a */
    public final List<InterfaceC1065A4> m3849a() {
        return this.f6294a;
    }
}
