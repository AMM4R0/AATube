package p054S1;

import java.util.Comparator;

/* renamed from: S1.h */
/* loaded from: classes.dex */
public final class C0509h implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f1313a;

    public /* synthetic */ C0509h(int r12) {
        this.f1313a = r12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r3 = r6.f1313a
            switch(r3) {
                case 0: goto L6e;
                case 1: goto L60;
                case 2: goto L2c;
                case 3: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = p028K.AbstractC0283P.f842a
            float r7 = p028K.AbstractC0272E.m709m(r7)
            float r8 = p028K.AbstractC0272E.m709m(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L1c
            r0 = r2
            goto L21
        L1c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            q.f r7 = (p118q.C2715f) r7
            q.f r8 = (p118q.C2715f) r8
            int r7 = r7.f8767b
            int r8 = r8.f8767b
            int r7 = r7 - r8
            return r7
        L2c:
            e0.m r7 = (p080e0.C0861m) r7
            e0.m r8 = (p080e0.C0861m) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.f3571d
            if (r3 != 0) goto L36
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3571d
            if (r5 != 0) goto L3d
            r5 = r1
            goto L3e
        L3d:
            r5 = r0
        L3e:
            if (r4 == r5) goto L45
            if (r3 != 0) goto L43
            goto L55
        L43:
            r0 = r2
            goto L5f
        L45:
            boolean r3 = r7.f3568a
            boolean r4 = r8.f3568a
            if (r3 == r4) goto L4e
            if (r3 == 0) goto L55
            goto L43
        L4e:
            int r1 = r8.f3569b
            int r2 = r7.f3569b
            int r1 = r1 - r2
            if (r1 == 0) goto L57
        L55:
            r0 = r1
            goto L5f
        L57:
            int r7 = r7.f3570c
            int r8 = r8.f3570c
            int r7 = r7 - r8
            if (r7 == 0) goto L5f
            r0 = r7
        L5f:
            return r0
        L60:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        L6e:
            S1.g r7 = (p054S1.C0508g) r7
            R1.v r7 = r7.f1307a
            S1.g r8 = (p054S1.C0508g) r8
            R1.v r8 = r8.f1307a
            int r7 = p036M1.AbstractC0379e.m1076g(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p054S1.C0509h.compare(java.lang.Object, java.lang.Object):int");
    }
}
