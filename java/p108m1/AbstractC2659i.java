package p108m1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.C0013f;
import p103k0.AbstractC2480a;
import p131u1.InterfaceC2810l;

/* renamed from: m1.i */
/* loaded from: classes.dex */
public abstract class AbstractC2659i extends AbstractC2665o {
    /* renamed from: c0 */
    public static final void m5113c0(Iterable iterable, StringBuilder sb, CharSequence separator, CharSequence prefix, CharSequence postfix, int r7, CharSequence truncated, InterfaceC2810l interfaceC2810l) {
        AbstractC2492i.m4915e(iterable, "<this>");
        AbstractC2492i.m4915e(separator, "separator");
        AbstractC2492i.m4915e(prefix, "prefix");
        AbstractC2492i.m4915e(postfix, "postfix");
        AbstractC2492i.m4915e(truncated, "truncated");
        sb.append(prefix);
        int r5 = 0;
        for (Object obj : iterable) {
            r5++;
            if (r5 > 1) {
                sb.append(separator);
            }
            if (r7 >= 0 && r5 > r7) {
                break;
            } else {
                AbstractC0580g.m1441e(sb, obj, interfaceC2810l);
            }
        }
        if (r7 >= 0 && r5 > r7) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    /* renamed from: d0 */
    public static String m5114d0(Iterable iterable, String str, String str2, String str3, C0013f c0013f, int r15) {
        String prefix = (r15 & 2) != 0 ? "" : str2;
        String postfix = (r15 & 4) != 0 ? "" : str3;
        if ((r15 & 32) != 0) {
            c0013f = null;
        }
        AbstractC2492i.m4915e(iterable, "<this>");
        AbstractC2492i.m4915e(prefix, "prefix");
        AbstractC2492i.m4915e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        m5113c0(iterable, sb, str, prefix, postfix, -1, "...", c0013f);
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: e0 */
    public static ArrayList m5115e0(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    /* renamed from: f0 */
    public static ArrayList m5116f0(List list, Object obj) {
        AbstractC2492i.m4915e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: g0 */
    public static final void m5117g0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC2492i.m4915e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: h0 */
    public static List m5118h0(Iterable iterable) {
        ArrayList arrayList;
        AbstractC2492i.m4915e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        C2668r c2668r = C2668r.f8607a;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                m5117g0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : AbstractC2480a.m4863D(arrayList.get(0)) : c2668r;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c2668r;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return AbstractC2480a.m4863D(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: i0 */
    public static Set m5119i0(ArrayList arrayList) {
        C2670t c2670t = C2670t.f8609a;
        int size = arrayList.size();
        if (size == 0) {
            return c2670t;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2671u.m5125b0(arrayList.size()));
            m5117g0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        AbstractC2492i.m4914d(singleton, "singleton(...)");
        return singleton;
    }
}
