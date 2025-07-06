package p108m1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: m1.o */
/* loaded from: classes.dex */
public abstract class AbstractC2665o extends AbstractC2664n {
    /* renamed from: a0 */
    public static void m5123a0(ArrayList arrayList, Iterable elements) {
        AbstractC2492i.m4915e(elements, "elements");
        if (elements instanceof Collection) {
            arrayList.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    /* renamed from: b0 */
    public static void m5124b0(Collection collection, Object[] elements) {
        AbstractC2492i.m4915e(collection, "<this>");
        AbstractC2492i.m4915e(elements, "elements");
        collection.addAll(AbstractC2658h.m5104B(elements));
    }
}
