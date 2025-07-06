package p111n1;

import android.support.v4.media.session.AbstractC0580g;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p036M1.AbstractC0387m;
import p108m1.AbstractC2655e;
import p108m1.AbstractC2658h;

/* renamed from: n1.b */
/* loaded from: classes.dex */
public final class C2680b extends AbstractC2655e implements RandomAccess, Serializable {

    /* renamed from: g */
    public static final C2680b f8630g;

    /* renamed from: a */
    public Object[] f8631a;

    /* renamed from: b */
    public final int f8632b;

    /* renamed from: c */
    public int f8633c;

    /* renamed from: d */
    public boolean f8634d;

    /* renamed from: e */
    public final C2680b f8635e;

    /* renamed from: f */
    public final C2680b f8636f;

    static {
        C2680b c2680b = new C2680b(0);
        c2680b.f8634d = true;
        f8630g = c2680b;
    }

    public C2680b(Object[] objArr, int r2, int r3, boolean z2, C2680b c2680b, C2680b c2680b2) {
        this.f8631a = objArr;
        this.f8632b = r2;
        this.f8633c = r3;
        this.f8634d = z2;
        this.f8635e = c2680b;
        this.f8636f = c2680b2;
        if (c2680b != null) {
            ((AbstractList) this).modCount = ((AbstractList) c2680b).modCount;
        }
    }

    @Override // p108m1.AbstractC2655e
    /* renamed from: a */
    public final int mo5095a() {
        m5139f();
        return this.f8633c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m5140g();
        m5139f();
        m5138e(this.f8632b + this.f8633c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        m5140g();
        m5139f();
        int size = elements.size();
        m5137d(this.f8632b + this.f8633c, elements, size);
        return size > 0;
    }

    @Override // p108m1.AbstractC2655e
    /* renamed from: b */
    public final Object mo5096b(int r5) {
        m5140g();
        m5139f();
        int r02 = this.f8633c;
        if (r5 < 0 || r5 >= r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r5, r02, ", size: "));
        }
        return m5142i(this.f8632b + r5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m5140g();
        m5139f();
        m5143j(this.f8632b, this.f8633c);
    }

    /* renamed from: d */
    public final void m5137d(int r5, Collection collection, int r7) {
        ((AbstractList) this).modCount++;
        C2680b c2680b = this.f8635e;
        if (c2680b != null) {
            c2680b.m5137d(r5, collection, r7);
            this.f8631a = c2680b.f8631a;
            this.f8633c += r7;
        } else {
            m5141h(r5, r7);
            Iterator it = collection.iterator();
            for (int r02 = 0; r02 < r7; r02++) {
                this.f8631a[r5 + r02] = it.next();
            }
        }
    }

    /* renamed from: e */
    public final void m5138e(int r3, Object obj) {
        ((AbstractList) this).modCount++;
        C2680b c2680b = this.f8635e;
        if (c2680b == null) {
            m5141h(r3, 1);
            this.f8631a[r3] = obj;
        } else {
            c2680b.m5138e(r3, obj);
            this.f8631a = c2680b.f8631a;
            this.f8633c++;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m5139f();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f8631a;
            int r2 = this.f8633c;
            if (r2 != list.size()) {
                return false;
            }
            for (int r3 = 0; r3 < r2; r3++) {
                if (!AbstractC2492i.m4911a(objArr[this.f8632b + r3], list.get(r3))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m5139f() {
        C2680b c2680b = this.f8636f;
        if (c2680b != null && ((AbstractList) c2680b).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final void m5140g() {
        C2680b c2680b;
        if (this.f8634d || ((c2680b = this.f8636f) != null && c2680b.f8634d)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        m5139f();
        int r02 = this.f8633c;
        if (r5 < 0 || r5 >= r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r5, r02, ", size: "));
        }
        return this.f8631a[this.f8632b + r5];
    }

    /* renamed from: h */
    public final void m5141h(int r6, int r7) {
        int r02 = this.f8633c + r7;
        if (r02 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f8631a;
        if (r02 > objArr.length) {
            int length = objArr.length;
            int r2 = length + (length >> 1);
            if (r2 - r02 < 0) {
                r2 = r02;
            }
            if (r2 - 2147483639 > 0) {
                r2 = r02 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, r2);
            AbstractC2492i.m4914d(copyOf, "copyOf(...)");
            this.f8631a = copyOf;
        }
        Object[] objArr2 = this.f8631a;
        AbstractC2658h.m5106D(objArr2, objArr2, r6 + r7, r6, this.f8632b + this.f8633c);
        this.f8633c += r7;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m5139f();
        Object[] objArr = this.f8631a;
        int r12 = this.f8633c;
        int r2 = 1;
        for (int r4 = 0; r4 < r12; r4++) {
            Object obj = objArr[this.f8632b + r4];
            r2 = (r2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return r2;
    }

    /* renamed from: i */
    public final Object m5142i(int r6) {
        ((AbstractList) this).modCount++;
        C2680b c2680b = this.f8635e;
        if (c2680b != null) {
            this.f8633c--;
            return c2680b.m5142i(r6);
        }
        Object[] objArr = this.f8631a;
        Object obj = objArr[r6];
        int r3 = this.f8633c;
        int r4 = this.f8632b;
        AbstractC2658h.m5106D(objArr, objArr, r6, r6 + 1, r3 + r4);
        Object[] objArr2 = this.f8631a;
        int r42 = (r4 + this.f8633c) - 1;
        AbstractC2492i.m4915e(objArr2, "<this>");
        objArr2[r42] = null;
        this.f8633c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m5139f();
        for (int r02 = 0; r02 < this.f8633c; r02++) {
            if (AbstractC2492i.m4911a(this.f8631a[this.f8632b + r02], obj)) {
                return r02;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m5139f();
        return this.f8633c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final void m5143j(int r4, int r5) {
        if (r5 > 0) {
            ((AbstractList) this).modCount++;
        }
        C2680b c2680b = this.f8635e;
        if (c2680b != null) {
            c2680b.m5143j(r4, r5);
        } else {
            Object[] objArr = this.f8631a;
            AbstractC2658h.m5106D(objArr, objArr, r4, r4 + r5, this.f8633c);
            Object[] objArr2 = this.f8631a;
            int r02 = this.f8633c;
            AbstractC2492i.m4915e(objArr2, "<this>");
            for (int r12 = r02 - r5; r12 < r02; r12++) {
                objArr2[r12] = null;
            }
        }
        this.f8633c -= r5;
    }

    /* renamed from: k */
    public final int m5144k(int r6, int r7, Collection collection, boolean z2) {
        int r62;
        C2680b c2680b = this.f8635e;
        if (c2680b != null) {
            r62 = c2680b.m5144k(r6, r7, collection, z2);
        } else {
            int r02 = 0;
            int r12 = 0;
            while (r02 < r7) {
                int r3 = r6 + r02;
                if (collection.contains(this.f8631a[r3]) == z2) {
                    Object[] objArr = this.f8631a;
                    r02++;
                    objArr[r12 + r6] = objArr[r3];
                    r12++;
                } else {
                    r02++;
                }
            }
            int r8 = r7 - r12;
            Object[] objArr2 = this.f8631a;
            AbstractC2658h.m5106D(objArr2, objArr2, r6 + r12, r7 + r6, this.f8633c);
            Object[] objArr3 = this.f8631a;
            int r72 = this.f8633c;
            AbstractC2492i.m4915e(objArr3, "<this>");
            for (int r9 = r72 - r8; r9 < r72; r9++) {
                objArr3[r9] = null;
            }
            r62 = r8;
        }
        if (r62 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f8633c -= r62;
        return r62;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m5139f();
        for (int r02 = this.f8633c - 1; r02 >= 0; r02--) {
            if (AbstractC2492i.m4911a(this.f8631a[this.f8632b + r02], obj)) {
                return r02;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m5140g();
        m5139f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo5096b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        m5140g();
        m5139f();
        return m5144k(this.f8632b, this.f8633c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        m5140g();
        m5139f();
        return m5144k(this.f8632b, this.f8633c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object obj) {
        m5140g();
        m5139f();
        int r02 = this.f8633c;
        if (r4 < 0 || r4 >= r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r4, r02, ", size: "));
        }
        Object[] objArr = this.f8631a;
        int r12 = this.f8632b;
        Object obj2 = objArr[r12 + r4];
        objArr[r12 + r4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r9, int r10) {
        AbstractC0387m.m1110h(r9, r10, this.f8633c);
        Object[] objArr = this.f8631a;
        int r3 = this.f8632b + r9;
        int r4 = r10 - r9;
        boolean z2 = this.f8634d;
        C2680b c2680b = this.f8636f;
        return new C2680b(objArr, r3, r4, z2, this, c2680b == null ? this : c2680b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] destination) {
        AbstractC2492i.m4915e(destination, "destination");
        m5139f();
        int length = destination.length;
        int r12 = this.f8633c;
        int r2 = this.f8632b;
        if (length < r12) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f8631a, r2, r12 + r2, destination.getClass());
            AbstractC2492i.m4914d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC2658h.m5106D(this.f8631a, destination, 0, r2, r12 + r2);
        int r02 = this.f8633c;
        if (r02 < destination.length) {
            destination[r02] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m5139f();
        Object[] objArr = this.f8631a;
        int r12 = this.f8633c;
        StringBuilder sb = new StringBuilder((r12 * 3) + 2);
        sb.append("[");
        for (int r3 = 0; r3 < r12; r3++) {
            if (r3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f8632b + r3];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r5) {
        m5139f();
        int r02 = this.f8633c;
        if (r5 < 0 || r5 > r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r5, r02, ", size: "));
        }
        return new C2679a(this, r5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r4, Object obj) {
        m5140g();
        m5139f();
        int r02 = this.f8633c;
        if (r4 >= 0 && r4 <= r02) {
            m5138e(this.f8632b + r4, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r4, r02, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r4, Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        m5140g();
        m5139f();
        int r02 = this.f8633c;
        if (r4 >= 0 && r4 <= r02) {
            int size = elements.size();
            m5137d(this.f8632b + r4, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r4, r02, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m5139f();
        Object[] objArr = this.f8631a;
        int r12 = this.f8633c;
        int r2 = this.f8632b;
        int r13 = r12 + r2;
        AbstractC2492i.m4915e(objArr, "<this>");
        AbstractC0580g.m1445j(r13, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, r2, r13);
        AbstractC2492i.m4914d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public C2680b(int r8) {
        this(new Object[r8], 0, 0, false, null, null);
        if (r8 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
