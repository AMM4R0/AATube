package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2661k;

/* renamed from: io.appmetrica.analytics.impl.hn */
/* loaded from: classes.dex */
public abstract class AbstractC1906hn {
    /* renamed from: a */
    public static final C1831en m3974a(Throwable th, C1559U c1559u, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C1582Um m3446a = th != null ? AbstractC1607Vm.m3446a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC2661k.m5122Z(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1630Wk((StackTraceElement) it.next()));
            }
        }
        return new C1831en(m3446a, c1559u, arrayList, null, null, null, str, bool);
    }
}
