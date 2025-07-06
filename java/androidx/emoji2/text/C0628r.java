package androidx.emoji2.text;

import android.util.SparseArray;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: classes.dex */
public final class C0628r {

    /* renamed from: a */
    public final SparseArray f2103a;

    /* renamed from: b */
    public C0624n f2104b;

    public C0628r(int r2) {
        this.f2103a = new SparseArray(r2);
    }

    /* renamed from: a */
    public final void m1644a(C0624n c0624n, int r6, int r7) {
        int m1635a = c0624n.m1635a(r6);
        SparseArray sparseArray = this.f2103a;
        C0628r c0628r = sparseArray == null ? null : (C0628r) sparseArray.get(m1635a);
        if (c0628r == null) {
            c0628r = new C0628r(1);
            sparseArray.put(c0624n.m1635a(r6), c0628r);
        }
        if (r7 > r6) {
            c0628r.m1644a(c0624n, r6 + 1, r7);
        } else {
            c0628r.f2104b = c0624n;
        }
    }
}
