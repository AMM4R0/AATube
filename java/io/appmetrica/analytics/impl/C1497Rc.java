package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p105l1.C2632c;

/* renamed from: io.appmetrica.analytics.impl.Rc */
/* loaded from: classes.dex */
public final class C1497Rc extends AbstractC2249vg {

    /* renamed from: b */
    public final ArrayList f5320b;

    public C1497Rc(C2013m5 c2013m5) {
        super(c2013m5);
        String m3805a = c2013m5.mo2829b().m3805a();
        m3805a = m3805a == null ? "empty" : m3805a;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{m3805a}, 1));
        LinkedHashMap m2937a = C2018ma.m4192h().m4205l().m2937a(m3805a);
        ArrayList arrayList = new ArrayList(m2937a.size());
        for (Map.Entry entry : m2937a.entrySet()) {
            arrayList.add(new C2632c(entry.getValue(), new C1223Gc(c2013m5, (String) entry.getKey())));
        }
        this.f5320b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        ArrayList arrayList = this.f5320b;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2632c c2632c = (C2632c) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) c2632c.f8550a;
                C1223Gc c1223Gc = (C1223Gc) c2632c.f8551b;
                if (moduleServiceEventHandler.handle(new C1298Jc(c1223Gc.f4782b, c1223Gc.f4781a, new C1273Ic(c1223Gc.f4783c, c1615w5)), c1615w5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
