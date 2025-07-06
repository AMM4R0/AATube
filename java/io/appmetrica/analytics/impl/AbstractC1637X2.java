package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.X2 */
/* loaded from: classes.dex */
public abstract class AbstractC1637X2 {

    /* renamed from: a */
    public final AbstractC1798df f5685a;

    /* renamed from: b */
    public final InterfaceC1146Da f5686b;

    public AbstractC1637X2(AbstractC1798df abstractC1798df, InterfaceC1146Da interfaceC1146Da) {
        this.f5685a = abstractC1798df;
        this.f5686b = interfaceC1146Da;
    }

    /* renamed from: a */
    public final boolean m3505a(C1615W5 c1615w5, InterfaceC1612W2 interfaceC1612W2) {
        Iterator it = ((C1618W8) this.f5685a.mo3455a(c1615w5.f5624d)).f5637a.iterator();
        while (it.hasNext()) {
            if (interfaceC1612W2.mo3449a(it.next(), c1615w5)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final AbstractC1798df m3506b() {
        return this.f5685a;
    }

    /* renamed from: a */
    public final InterfaceC1146Da m3504a() {
        return this.f5686b;
    }
}
