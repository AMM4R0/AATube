package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.r9 */
/* loaded from: classes.dex */
public final class C2142r9 {

    /* renamed from: a */
    public final List f7059a;

    /* renamed from: b */
    public final InterfaceC2217u9 f7060b;

    /* renamed from: c */
    public final AtomicBoolean f7061c = new AtomicBoolean(true);

    public C2142r9(ArrayList arrayList, InterfaceC2217u9 interfaceC2217u9) {
        this.f7059a = arrayList;
        this.f7060b = interfaceC2217u9;
    }

    /* renamed from: a */
    public final void m4397a() {
        C2013m5 c2013m5 = (C2013m5) this.f7060b;
        synchronized (c2013m5) {
            c2013m5.f6690e.m2841b();
        }
    }

    /* renamed from: b */
    public final void m4398b() {
        if (this.f7061c.get()) {
            if (this.f7059a.isEmpty()) {
                C2013m5 c2013m5 = (C2013m5) this.f7060b;
                synchronized (c2013m5) {
                    c2013m5.f6690e.m2841b();
                }
                return;
            }
            Iterator it = this.f7059a.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                z2 |= ((InterfaceC1169E8) it.next()).mo2852a();
            }
            if (z2) {
                m4397a();
            }
        }
    }
}
