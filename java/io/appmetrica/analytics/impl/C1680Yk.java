package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Yk */
/* loaded from: classes.dex */
public final class C1680Yk {

    /* renamed from: a */
    public final /* synthetic */ C1729al f5774a;

    public C1680Yk(C1729al c1729al) {
        this.f5774a = c1729al;
    }

    /* renamed from: a */
    public final void m3553a(String str, EnumC1779cl enumC1779cl, C2354zl c2354zl) {
        ArrayList arrayList;
        synchronized (this.f5774a.f5892b) {
            try {
                Collection collection = (Collection) this.f5774a.f5891a.f6854a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1954jl) it.next()).mo3170a(enumC1779cl, c2354zl);
        }
    }
}
