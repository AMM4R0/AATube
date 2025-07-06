package p109n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.f */
/* loaded from: classes.dex */
public class C2677f implements Iterable {

    /* renamed from: a */
    public C2674c f8621a;

    /* renamed from: b */
    public C2674c f8622b;

    /* renamed from: c */
    public final WeakHashMap f8623c = new WeakHashMap();

    /* renamed from: d */
    public int f8624d = 0;

    /* renamed from: a */
    public C2674c mo5131a(Object obj) {
        C2674c c2674c = this.f8621a;
        while (c2674c != null && !c2674c.f8614a.equals(obj)) {
            c2674c = c2674c.f8616c;
        }
        return c2674c;
    }

    /* renamed from: b */
    public Object mo5132b(Object obj) {
        C2674c mo5131a = mo5131a(obj);
        if (mo5131a == null) {
            return null;
        }
        this.f8624d--;
        WeakHashMap weakHashMap = this.f8623c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2676e) it.next()).mo5133a(mo5131a);
            }
        }
        C2674c c2674c = mo5131a.f8617d;
        if (c2674c != null) {
            c2674c.f8616c = mo5131a.f8616c;
        } else {
            this.f8621a = mo5131a.f8616c;
        }
        C2674c c2674c2 = mo5131a.f8616c;
        if (c2674c2 != null) {
            c2674c2.f8617d = c2674c;
        } else {
            this.f8622b = c2674c;
        }
        mo5131a.f8616c = null;
        mo5131a.f8617d = null;
        return mo5131a.f8615b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p109n.C2673b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p109n.C2677f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.f r7 = (p109n.C2677f) r7
            int r1 = r6.f8624d
            int r3 = r7.f8624d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.b r3 = (p109n.C2673b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.b r4 = (p109n.C2673b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.b r7 = (p109n.C2673b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p109n.C2677f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int r12 = 0;
        while (true) {
            C2673b c2673b = (C2673b) it;
            if (!c2673b.hasNext()) {
                return r12;
            }
            r12 += ((Map.Entry) c2673b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2673b c2673b = new C2673b(this.f8621a, this.f8622b, 0);
        this.f8623c.put(c2673b, Boolean.FALSE);
        return c2673b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2673b c2673b = (C2673b) it;
            if (!c2673b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2673b.next()).toString());
            if (c2673b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
