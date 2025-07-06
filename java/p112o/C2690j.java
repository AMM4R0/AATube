package p112o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.j */
/* loaded from: classes.dex */
public final class C2690j implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C2681a f8676a;

    public C2690j(C2681a c2681a) {
        this.f8676a = c2681a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8676a.m5146a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8676a.m5151f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8676a.m5149d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2687g(this.f8676a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2681a c2681a = this.f8676a;
        int m5151f = c2681a.m5151f(obj);
        if (m5151f < 0) {
            return false;
        }
        c2681a.m5152g(m5151f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2681a c2681a = this.f8676a;
        int m5149d = c2681a.m5149d();
        int r2 = 0;
        boolean z2 = false;
        while (r2 < m5149d) {
            if (collection.contains(c2681a.m5147b(r2, 1))) {
                c2681a.m5152g(r2);
                r2--;
                m5149d--;
                z2 = true;
            }
            r2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2681a c2681a = this.f8676a;
        int m5149d = c2681a.m5149d();
        int r2 = 0;
        boolean z2 = false;
        while (r2 < m5149d) {
            if (!collection.contains(c2681a.m5147b(r2, 1))) {
                c2681a.m5152g(r2);
                r2--;
                m5149d--;
                z2 = true;
            }
            r2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8676a.m5149d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2681a c2681a = this.f8676a;
        int m5149d = c2681a.m5149d();
        Object[] objArr = new Object[m5149d];
        for (int r3 = 0; r3 < m5149d; r3++) {
            objArr[r3] = c2681a.m5147b(r3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8676a.m5153i(objArr, 1);
    }
}
