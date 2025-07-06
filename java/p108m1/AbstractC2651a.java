package p108m1;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.C0013f;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public abstract class AbstractC2651a implements Collection {
    /* renamed from: a */
    public abstract int mo98a();

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

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC2492i.m4911a(it.next(), obj)) {
                return true;
            }
        }
        return false;
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
    public boolean isEmpty() {
        return mo98a() == 0;
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
    public final /* bridge */ int size() {
        return mo98a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC2492i.m4919i(this);
    }

    public final String toString() {
        return AbstractC2659i.m5114d0(this, ", ", "[", "]", new C0013f(2, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC2492i.m4915e(array, "array");
        return AbstractC2492i.m4920j(this, array);
    }
}
