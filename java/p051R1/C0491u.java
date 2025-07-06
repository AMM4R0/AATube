package p051R1;

import java.util.RandomAccess;
import p108m1.AbstractC2654d;

/* renamed from: R1.u */
/* loaded from: classes.dex */
public final class C0491u extends AbstractC2654d implements RandomAccess {

    /* renamed from: a */
    public final C0480j[] f1243a;

    public C0491u(C0480j[] c0480jArr) {
        this.f1243a = c0480jArr;
    }

    @Override // p108m1.AbstractC2651a
    /* renamed from: a */
    public final int mo98a() {
        return this.f1243a.length;
    }

    @Override // p108m1.AbstractC2651a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0480j) {
            return super.contains((C0480j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        return this.f1243a[r2];
    }

    @Override // p108m1.AbstractC2654d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0480j) {
            return super.indexOf((C0480j) obj);
        }
        return -1;
    }

    @Override // p108m1.AbstractC2654d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0480j) {
            return super.lastIndexOf((C0480j) obj);
        }
        return -1;
    }
}
