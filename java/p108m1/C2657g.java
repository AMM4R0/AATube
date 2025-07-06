package p108m1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: m1.g */
/* loaded from: classes.dex */
public final class C2657g extends AbstractC2655e {

    /* renamed from: d */
    public static final Object[] f8600d = new Object[0];

    /* renamed from: a */
    public int f8601a;

    /* renamed from: b */
    public Object[] f8602b = f8600d;

    /* renamed from: c */
    public int f8603c;

    @Override // p108m1.AbstractC2655e
    /* renamed from: a */
    public final int mo5095a() {
        return this.f8603c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, Object obj) {
        int r82;
        int r02 = this.f8603c;
        if (r8 < 0 || r8 > r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r8, r02, ", size: "));
        }
        if (r8 == r02) {
            m5098d(obj);
            return;
        }
        if (r8 == 0) {
            m5097c(obj);
            return;
        }
        m5100f(r02 + 1);
        int m5102h = m5102h(this.f8601a + r8);
        int r2 = this.f8603c;
        if (r8 < ((r2 + 1) >> 1)) {
            if (m5102h == 0) {
                Object[] objArr = this.f8602b;
                AbstractC2492i.m4915e(objArr, "<this>");
                m5102h = objArr.length;
            }
            int r03 = m5102h - 1;
            int r22 = this.f8601a;
            if (r22 == 0) {
                Object[] objArr2 = this.f8602b;
                AbstractC2492i.m4915e(objArr2, "<this>");
                r82 = objArr2.length - 1;
            } else {
                r82 = r22 - 1;
            }
            int r23 = this.f8601a;
            if (r03 >= r23) {
                Object[] objArr3 = this.f8602b;
                objArr3[r82] = objArr3[r23];
                AbstractC2658h.m5106D(objArr3, objArr3, r23, r23 + 1, r03 + 1);
            } else {
                Object[] objArr4 = this.f8602b;
                AbstractC2658h.m5106D(objArr4, objArr4, r23 - 1, r23, objArr4.length);
                Object[] objArr5 = this.f8602b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC2658h.m5106D(objArr5, objArr5, 0, 1, r03 + 1);
            }
            this.f8602b[r03] = obj;
            this.f8601a = r82;
        } else {
            int m5102h2 = m5102h(r2 + this.f8601a);
            if (m5102h < m5102h2) {
                Object[] objArr6 = this.f8602b;
                AbstractC2658h.m5106D(objArr6, objArr6, m5102h + 1, m5102h, m5102h2);
            } else {
                Object[] objArr7 = this.f8602b;
                AbstractC2658h.m5106D(objArr7, objArr7, 1, 0, m5102h2);
                Object[] objArr8 = this.f8602b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC2658h.m5106D(objArr8, objArr8, m5102h + 1, m5102h, objArr8.length - 1);
            }
            this.f8602b[m5102h] = obj;
        }
        this.f8603c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        int r02 = this.f8603c;
        if (r9 < 0 || r9 > r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r9, r02, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        int r03 = this.f8603c;
        if (r9 == r03) {
            return addAll(elements);
        }
        m5100f(elements.size() + r03);
        int m5102h = m5102h(this.f8603c + this.f8601a);
        int m5102h2 = m5102h(this.f8601a + r9);
        int size = elements.size();
        if (r9 < ((this.f8603c + 1) >> 1)) {
            int r92 = this.f8601a;
            int r04 = r92 - size;
            if (m5102h2 < r92) {
                Object[] objArr = this.f8602b;
                AbstractC2658h.m5106D(objArr, objArr, r04, r92, objArr.length);
                if (size >= m5102h2) {
                    Object[] objArr2 = this.f8602b;
                    AbstractC2658h.m5106D(objArr2, objArr2, objArr2.length - size, 0, m5102h2);
                } else {
                    Object[] objArr3 = this.f8602b;
                    AbstractC2658h.m5106D(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f8602b;
                    AbstractC2658h.m5106D(objArr4, objArr4, 0, size, m5102h2);
                }
            } else if (r04 >= 0) {
                Object[] objArr5 = this.f8602b;
                AbstractC2658h.m5106D(objArr5, objArr5, r04, r92, m5102h2);
            } else {
                Object[] objArr6 = this.f8602b;
                r04 += objArr6.length;
                int r6 = m5102h2 - r92;
                int length = objArr6.length - r04;
                if (length >= r6) {
                    AbstractC2658h.m5106D(objArr6, objArr6, r04, r92, m5102h2);
                } else {
                    AbstractC2658h.m5106D(objArr6, objArr6, r04, r92, r92 + length);
                    Object[] objArr7 = this.f8602b;
                    AbstractC2658h.m5106D(objArr7, objArr7, 0, this.f8601a + length, m5102h2);
                }
            }
            this.f8601a = r04;
            int r2 = m5102h2 - size;
            if (r2 < 0) {
                r2 += this.f8602b.length;
            }
            m5099e(r2, elements);
        } else {
            int r93 = m5102h2 + size;
            if (m5102h2 < m5102h) {
                int r3 = size + m5102h;
                Object[] objArr8 = this.f8602b;
                if (r3 <= objArr8.length) {
                    AbstractC2658h.m5106D(objArr8, objArr8, r93, m5102h2, m5102h);
                } else if (r93 >= objArr8.length) {
                    AbstractC2658h.m5106D(objArr8, objArr8, r93 - objArr8.length, m5102h2, m5102h);
                } else {
                    int length2 = m5102h - (r3 - objArr8.length);
                    AbstractC2658h.m5106D(objArr8, objArr8, 0, length2, m5102h);
                    Object[] objArr9 = this.f8602b;
                    AbstractC2658h.m5106D(objArr9, objArr9, r93, m5102h2, length2);
                }
            } else {
                Object[] objArr10 = this.f8602b;
                AbstractC2658h.m5106D(objArr10, objArr10, size, 0, m5102h);
                Object[] objArr11 = this.f8602b;
                if (r93 >= objArr11.length) {
                    AbstractC2658h.m5106D(objArr11, objArr11, r93 - objArr11.length, m5102h2, objArr11.length);
                } else {
                    AbstractC2658h.m5106D(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f8602b;
                    AbstractC2658h.m5106D(objArr12, objArr12, r93, m5102h2, objArr12.length - size);
                }
            }
            m5099e(m5102h2, elements);
        }
        return true;
    }

    @Override // p108m1.AbstractC2655e
    /* renamed from: b */
    public final Object mo5096b(int r9) {
        int r02 = this.f8603c;
        if (r9 < 0 || r9 >= r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r9, r02, ", size: "));
        }
        if (r9 == size() - 1) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int m5102h = m5102h((size() - 1) + this.f8601a);
            Object[] objArr = this.f8602b;
            Object obj = objArr[m5102h];
            objArr[m5102h] = null;
            this.f8603c--;
            return obj;
        }
        if (r9 == 0) {
            return m5103i();
        }
        int m5102h2 = m5102h(this.f8601a + r9);
        Object[] objArr2 = this.f8602b;
        Object obj2 = objArr2[m5102h2];
        if (r9 < (this.f8603c >> 1)) {
            int r92 = this.f8601a;
            if (m5102h2 >= r92) {
                AbstractC2658h.m5106D(objArr2, objArr2, r92 + 1, r92, m5102h2);
            } else {
                AbstractC2658h.m5106D(objArr2, objArr2, 1, 0, m5102h2);
                Object[] objArr3 = this.f8602b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int r03 = this.f8601a;
                AbstractC2658h.m5106D(objArr3, objArr3, r03 + 1, r03, objArr3.length - 1);
            }
            Object[] objArr4 = this.f8602b;
            int r04 = this.f8601a;
            objArr4[r04] = null;
            this.f8601a = m5101g(r04);
        } else {
            int m5102h3 = m5102h((size() - 1) + this.f8601a);
            if (m5102h2 <= m5102h3) {
                Object[] objArr5 = this.f8602b;
                AbstractC2658h.m5106D(objArr5, objArr5, m5102h2, m5102h2 + 1, m5102h3 + 1);
            } else {
                Object[] objArr6 = this.f8602b;
                AbstractC2658h.m5106D(objArr6, objArr6, m5102h2, m5102h2 + 1, objArr6.length);
                Object[] objArr7 = this.f8602b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC2658h.m5106D(objArr7, objArr7, 0, 1, m5102h3 + 1);
            }
            this.f8602b[m5102h3] = null;
        }
        this.f8603c--;
        return obj2;
    }

    /* renamed from: c */
    public final void m5097c(Object obj) {
        m5100f(this.f8603c + 1);
        int r02 = this.f8601a;
        if (r02 == 0) {
            Object[] objArr = this.f8602b;
            AbstractC2492i.m4915e(objArr, "<this>");
            r02 = objArr.length;
        }
        int r03 = r02 - 1;
        this.f8601a = r03;
        this.f8602b[r03] = obj;
        this.f8603c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int m5102h = m5102h(this.f8603c + this.f8601a);
        int r12 = this.f8601a;
        if (r12 < m5102h) {
            AbstractC2658h.m5108F(this.f8602b, r12, m5102h);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8602b;
            AbstractC2658h.m5108F(objArr, this.f8601a, objArr.length);
            AbstractC2658h.m5108F(this.f8602b, 0, m5102h);
        }
        this.f8601a = 0;
        this.f8603c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m5098d(Object obj) {
        m5100f(mo5095a() + 1);
        this.f8602b[m5102h(mo5095a() + this.f8601a)] = obj;
        this.f8603c = mo5095a() + 1;
    }

    /* renamed from: e */
    public final void m5099e(int r5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f8602b.length;
        while (r5 < length && it.hasNext()) {
            this.f8602b[r5] = it.next();
            r5++;
        }
        int r52 = this.f8601a;
        for (int r12 = 0; r12 < r52 && it.hasNext(); r12++) {
            this.f8602b[r12] = it.next();
        }
        this.f8603c = collection.size() + mo5095a();
    }

    /* renamed from: f */
    public final void m5100f(int r5) {
        if (r5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f8602b;
        if (r5 <= objArr.length) {
            return;
        }
        if (objArr == f8600d) {
            if (r5 < 10) {
                r5 = 10;
            }
            this.f8602b = new Object[r5];
            return;
        }
        int length = objArr.length;
        int r12 = length + (length >> 1);
        if (r12 - r5 < 0) {
            r12 = r5;
        }
        if (r12 - 2147483639 > 0) {
            r12 = r5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[r12];
        AbstractC2658h.m5106D(objArr, objArr2, 0, this.f8601a, objArr.length);
        Object[] objArr3 = this.f8602b;
        int length2 = objArr3.length;
        int r2 = this.f8601a;
        AbstractC2658h.m5106D(objArr3, objArr2, length2 - r2, 0, r2);
        this.f8601a = 0;
        this.f8602b = objArr2;
    }

    /* renamed from: g */
    public final int m5101g(int r3) {
        AbstractC2492i.m4915e(this.f8602b, "<this>");
        if (r3 == r0.length - 1) {
            return 0;
        }
        return r3 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        int mo5095a = mo5095a();
        if (r5 < 0 || r5 >= mo5095a) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r5, mo5095a, ", size: "));
        }
        return this.f8602b[m5102h(this.f8601a + r5)];
    }

    /* renamed from: h */
    public final int m5102h(int r3) {
        Object[] objArr = this.f8602b;
        return r3 >= objArr.length ? r3 - objArr.length : r3;
    }

    /* renamed from: i */
    public final Object m5103i() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f8602b;
        int r12 = this.f8601a;
        Object obj = objArr[r12];
        objArr[r12] = null;
        this.f8601a = m5101g(r12);
        this.f8603c = mo5095a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int r5;
        int m5102h = m5102h(mo5095a() + this.f8601a);
        int r12 = this.f8601a;
        if (r12 < m5102h) {
            while (r12 < m5102h) {
                if (AbstractC2492i.m4911a(obj, this.f8602b[r12])) {
                    r5 = this.f8601a;
                } else {
                    r12++;
                }
            }
            return -1;
        }
        if (r12 < m5102h) {
            return -1;
        }
        int length = this.f8602b.length;
        while (true) {
            if (r12 >= length) {
                for (int r13 = 0; r13 < m5102h; r13++) {
                    if (AbstractC2492i.m4911a(obj, this.f8602b[r13])) {
                        r12 = r13 + this.f8602b.length;
                        r5 = this.f8601a;
                    }
                }
                return -1;
            }
            if (AbstractC2492i.m4911a(obj, this.f8602b[r12])) {
                r5 = this.f8601a;
                break;
            }
            r12++;
        }
        return r12 - r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo5095a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int r5;
        int m5102h = m5102h(this.f8603c + this.f8601a);
        int r12 = this.f8601a;
        if (r12 < m5102h) {
            length = m5102h - 1;
            if (r12 <= length) {
                while (!AbstractC2492i.m4911a(obj, this.f8602b[length])) {
                    if (length != r12) {
                        length--;
                    }
                }
                r5 = this.f8601a;
                return length - r5;
            }
            return -1;
        }
        if (r12 > m5102h) {
            int r02 = m5102h - 1;
            while (true) {
                if (-1 >= r02) {
                    Object[] objArr = this.f8602b;
                    AbstractC2492i.m4915e(objArr, "<this>");
                    length = objArr.length - 1;
                    int r13 = this.f8601a;
                    if (r13 <= length) {
                        while (!AbstractC2492i.m4911a(obj, this.f8602b[length])) {
                            if (length != r13) {
                                length--;
                            }
                        }
                        r5 = this.f8601a;
                    }
                } else {
                    if (AbstractC2492i.m4911a(obj, this.f8602b[r02])) {
                        length = r02 + this.f8602b.length;
                        r5 = this.f8601a;
                        break;
                    }
                    r02--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo5096b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int m5102h;
        AbstractC2492i.m4915e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f8602b.length != 0) {
            int m5102h2 = m5102h(this.f8603c + this.f8601a);
            int r2 = this.f8601a;
            if (r2 < m5102h2) {
                m5102h = r2;
                while (r2 < m5102h2) {
                    Object obj = this.f8602b[r2];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f8602b[m5102h] = obj;
                        m5102h++;
                    }
                    r2++;
                }
                AbstractC2658h.m5108F(this.f8602b, m5102h, m5102h2);
            } else {
                int length = this.f8602b.length;
                boolean z3 = false;
                int r5 = r2;
                while (r2 < length) {
                    Object[] objArr = this.f8602b;
                    Object obj2 = objArr[r2];
                    objArr[r2] = null;
                    if (elements.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f8602b[r5] = obj2;
                        r5++;
                    }
                    r2++;
                }
                m5102h = m5102h(r5);
                for (int r12 = 0; r12 < m5102h2; r12++) {
                    Object[] objArr2 = this.f8602b;
                    Object obj3 = objArr2[r12];
                    objArr2[r12] = null;
                    if (elements.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f8602b[m5102h] = obj3;
                        m5102h = m5101g(m5102h);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int r4 = m5102h - this.f8601a;
                if (r4 < 0) {
                    r4 += this.f8602b.length;
                }
                this.f8603c = r4;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int m5102h;
        AbstractC2492i.m4915e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f8602b.length != 0) {
            int m5102h2 = m5102h(this.f8603c + this.f8601a);
            int r2 = this.f8601a;
            if (r2 < m5102h2) {
                m5102h = r2;
                while (r2 < m5102h2) {
                    Object obj = this.f8602b[r2];
                    if (elements.contains(obj)) {
                        this.f8602b[m5102h] = obj;
                        m5102h++;
                    } else {
                        z2 = true;
                    }
                    r2++;
                }
                AbstractC2658h.m5108F(this.f8602b, m5102h, m5102h2);
            } else {
                int length = this.f8602b.length;
                boolean z3 = false;
                int r5 = r2;
                while (r2 < length) {
                    Object[] objArr = this.f8602b;
                    Object obj2 = objArr[r2];
                    objArr[r2] = null;
                    if (elements.contains(obj2)) {
                        this.f8602b[r5] = obj2;
                        r5++;
                    } else {
                        z3 = true;
                    }
                    r2++;
                }
                m5102h = m5102h(r5);
                for (int r12 = 0; r12 < m5102h2; r12++) {
                    Object[] objArr2 = this.f8602b;
                    Object obj3 = objArr2[r12];
                    objArr2[r12] = null;
                    if (elements.contains(obj3)) {
                        this.f8602b[m5102h] = obj3;
                        m5102h = m5101g(m5102h);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int r4 = m5102h - this.f8601a;
                if (r4 < 0) {
                    r4 += this.f8602b.length;
                }
                this.f8603c = r4;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object obj) {
        int mo5095a = mo5095a();
        if (r4 < 0 || r4 >= mo5095a) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r4, mo5095a, ", size: "));
        }
        int m5102h = m5102h(this.f8601a + r4);
        Object[] objArr = this.f8602b;
        Object obj2 = objArr[m5102h];
        objArr[m5102h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo5095a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC2492i.m4915e(array, "array");
        int length = array.length;
        int r12 = this.f8603c;
        if (length < r12) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), r12);
            AbstractC2492i.m4913c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int m5102h = m5102h(this.f8603c + this.f8601a);
        int r13 = this.f8601a;
        if (r13 < m5102h) {
            Object[] objArr = this.f8602b;
            if ((2 & 4) != 0) {
                r13 = 0;
            }
            if ((2 & 8) != 0) {
                m5102h = objArr.length;
            }
            AbstractC2658h.m5106D(objArr, array, 0, r13, m5102h);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f8602b;
            AbstractC2658h.m5106D(objArr2, array, 0, this.f8601a, objArr2.length);
            Object[] objArr3 = this.f8602b;
            AbstractC2658h.m5106D(objArr3, array, objArr3.length - this.f8601a, 0, m5102h);
        }
        int r02 = this.f8603c;
        if (r02 < array.length) {
            array[r02] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m5098d(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC2492i.m4915e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m5100f(elements.size() + mo5095a());
        m5099e(m5102h(mo5095a() + this.f8601a), elements);
        return true;
    }
}
