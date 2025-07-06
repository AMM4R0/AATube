package p108m1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.C2484a;

/* renamed from: m1.f */
/* loaded from: classes.dex */
public final class C2656f implements Collection {

    /* renamed from: a */
    public final Object[] f8598a;

    /* renamed from: b */
    public final boolean f8599b;

    public C2656f(Object[] values, boolean z2) {
        AbstractC2492i.m4915e(values, "values");
        this.f8598a = values;
        this.f8599b = z2;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int r2;
        Object[] objArr = this.f8598a;
        AbstractC2492i.m4915e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            r2 = 0;
            while (r2 < length) {
                if (objArr[r2] == null) {
                    break;
                }
                r2++;
            }
            r2 = -1;
        } else {
            int length2 = objArr.length;
            for (int r3 = 0; r3 < length2; r3++) {
                if (obj.equals(objArr[r3])) {
                    r2 = r3;
                    break;
                }
            }
            r2 = -1;
        }
        return r2 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8598a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] array = this.f8598a;
        AbstractC2492i.m4915e(array, "array");
        return new C2484a(array);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8598a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f8598a;
        AbstractC2492i.m4915e(objArr, "<this>");
        if (this.f8599b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC2492i.m4914d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC2492i.m4915e(array, "array");
        return AbstractC2492i.m4920j(this, array);
    }
}
