package p108m1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.C2484a;

/* renamed from: m1.d */
/* loaded from: classes.dex */
public abstract class AbstractC2654d extends AbstractC2651a implements List {
    @Override // java.util.List
    public final void add(int r12, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int r12, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        AbstractC2492i.m4915e(other, "other");
        if (size() == other.size()) {
            Iterator it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!AbstractC2492i.m4911a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int r12 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            r12 = (r12 * 31) + (next != null ? next.hashCode() : 0);
        }
        return r12;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int r12 = 0;
        while (it.hasNext()) {
            if (AbstractC2492i.m4911a(it.next(), obj)) {
                return r12;
            }
            r12++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2484a(this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC2492i.m4911a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2652b(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int r12, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int r2, int r3) {
        return new C2653c(this, r2, r3);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        return new C2652b(this, r2);
    }
}
