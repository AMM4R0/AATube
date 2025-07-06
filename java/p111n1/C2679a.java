package p111n1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C2679a implements ListIterator {

    /* renamed from: a */
    public final C2680b f8626a;

    /* renamed from: b */
    public int f8627b;

    /* renamed from: c */
    public int f8628c;

    /* renamed from: d */
    public int f8629d;

    public C2679a(C2680b list, int r3) {
        int r2;
        AbstractC2492i.m4915e(list, "list");
        this.f8626a = list;
        this.f8627b = r3;
        this.f8628c = -1;
        r2 = ((AbstractList) list).modCount;
        this.f8629d = r2;
    }

    /* renamed from: a */
    public final void m5135a() {
        int r02;
        r02 = ((AbstractList) this.f8626a).modCount;
        if (r02 != this.f8629d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int r3;
        m5135a();
        int r02 = this.f8627b;
        this.f8627b = r02 + 1;
        C2680b c2680b = this.f8626a;
        c2680b.add(r02, obj);
        this.f8628c = -1;
        r3 = ((AbstractList) c2680b).modCount;
        this.f8629d = r3;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8627b < this.f8626a.f8633c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8627b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m5135a();
        int r02 = this.f8627b;
        C2680b c2680b = this.f8626a;
        if (r02 >= c2680b.f8633c) {
            throw new NoSuchElementException();
        }
        this.f8627b = r02 + 1;
        this.f8628c = r02;
        return c2680b.f8631a[c2680b.f8632b + r02];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8627b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m5135a();
        int r02 = this.f8627b;
        if (r02 <= 0) {
            throw new NoSuchElementException();
        }
        int r03 = r02 - 1;
        this.f8627b = r03;
        this.f8628c = r03;
        C2680b c2680b = this.f8626a;
        return c2680b.f8631a[c2680b.f8632b + r03];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8627b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int r02;
        m5135a();
        int r03 = this.f8628c;
        if (r03 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        C2680b c2680b = this.f8626a;
        c2680b.mo5096b(r03);
        this.f8627b = this.f8628c;
        this.f8628c = -1;
        r02 = ((AbstractList) c2680b).modCount;
        this.f8629d = r02;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m5135a();
        int r02 = this.f8628c;
        if (r02 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f8626a.set(r02, obj);
    }
}
