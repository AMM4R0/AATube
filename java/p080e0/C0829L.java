package p080e0;

import android.util.SparseArray;

/* renamed from: e0.L */
/* loaded from: classes.dex */
public final class C0829L {

    /* renamed from: a */
    public SparseArray f3384a;

    /* renamed from: b */
    public int f3385b;

    /* renamed from: a */
    public final C0828K m2307a(int r3) {
        SparseArray sparseArray = this.f3384a;
        C0828K c0828k = (C0828K) sparseArray.get(r3);
        if (c0828k != null) {
            return c0828k;
        }
        C0828K c0828k2 = new C0828K();
        sparseArray.put(r3, c0828k2);
        return c0828k2;
    }
}
