package p145z1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2492i;
import p108m1.C2666p;
import p108m1.C2670t;

/* renamed from: z1.d */
/* loaded from: classes.dex */
public abstract class AbstractC2921d extends AbstractC2922e {
    /* renamed from: X */
    public static InterfaceC2920c m5535X(Iterator it) {
        AbstractC2492i.m4915e(it, "<this>");
        return new C2918a(new C2666p(1, it));
    }

    /* renamed from: Y */
    public static Set m5536Y(InterfaceC2920c interfaceC2920c) {
        Iterator it = interfaceC2920c.iterator();
        if (!it.hasNext()) {
            return C2670t.f8609a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            AbstractC2492i.m4914d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
