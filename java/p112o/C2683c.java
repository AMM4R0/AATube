package p112o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.c */
/* loaded from: classes.dex */
public final class C2683c implements Collection, Set {

    /* renamed from: e */
    public static final int[] f8643e = new int[0];

    /* renamed from: f */
    public static final Object[] f8644f = new Object[0];

    /* renamed from: g */
    public static Object[] f8645g;

    /* renamed from: h */
    public static int f8646h;

    /* renamed from: i */
    public static Object[] f8647i;

    /* renamed from: j */
    public static int f8648j;

    /* renamed from: a */
    public int[] f8649a;

    /* renamed from: b */
    public Object[] f8650b;

    /* renamed from: c */
    public int f8651c;

    /* renamed from: d */
    public C2681a f8652d;

    public C2683c(int r12) {
        if (r12 == 0) {
            this.f8649a = f8643e;
            this.f8650b = f8644f;
        } else {
            m5155a(r12);
        }
        this.f8651c = 0;
    }

    /* renamed from: b */
    public static void m5154b(int[] r7, Object[] objArr, int r9) {
        if (r7.length == 8) {
            synchronized (C2683c.class) {
                try {
                    if (f8648j < 10) {
                        objArr[0] = f8647i;
                        objArr[1] = r7;
                        for (int r92 = r9 - 1; r92 >= 2; r92--) {
                            objArr[r92] = null;
                        }
                        f8647i = objArr;
                        f8648j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (r7.length == 4) {
            synchronized (C2683c.class) {
                try {
                    if (f8646h < 10) {
                        objArr[0] = f8645g;
                        objArr[1] = r7;
                        for (int r93 = r9 - 1; r93 >= 2; r93--) {
                            objArr[r93] = null;
                        }
                        f8645g = objArr;
                        f8646h++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5155a(int r6) {
        if (r6 == 8) {
            synchronized (C2683c.class) {
                try {
                    Object[] objArr = f8647i;
                    if (objArr != null) {
                        this.f8650b = objArr;
                        f8647i = (Object[]) objArr[0];
                        this.f8649a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8648j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (r6 == 4) {
            synchronized (C2683c.class) {
                try {
                    Object[] objArr2 = f8645g;
                    if (objArr2 != null) {
                        this.f8650b = objArr2;
                        f8645g = (Object[]) objArr2[0];
                        this.f8649a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8646h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8649a = new int[r6];
        this.f8650b = new Object[r6];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int r2;
        int m5156c;
        if (obj == null) {
            m5156c = m5157d();
            r2 = 0;
        } else {
            int hashCode = obj.hashCode();
            r2 = hashCode;
            m5156c = m5156c(hashCode, obj);
        }
        if (m5156c >= 0) {
            return false;
        }
        int r12 = ~m5156c;
        int r3 = this.f8651c;
        int[] r4 = this.f8649a;
        if (r3 >= r4.length) {
            int r5 = 8;
            if (r3 >= 8) {
                r5 = (r3 >> 1) + r3;
            } else if (r3 < 4) {
                r5 = 4;
            }
            Object[] objArr = this.f8650b;
            m5155a(r5);
            int[] r52 = this.f8649a;
            if (r52.length > 0) {
                System.arraycopy(r4, 0, r52, 0, r4.length);
                System.arraycopy(objArr, 0, this.f8650b, 0, objArr.length);
            }
            m5154b(r4, objArr, this.f8651c);
        }
        int r02 = this.f8651c;
        if (r12 < r02) {
            int[] r32 = this.f8649a;
            int r42 = r12 + 1;
            System.arraycopy(r32, r12, r32, r42, r02 - r12);
            Object[] objArr2 = this.f8650b;
            System.arraycopy(objArr2, r12, objArr2, r42, this.f8651c - r12);
        }
        this.f8649a[r12] = r2;
        this.f8650b[r12] = obj;
        this.f8651c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f8651c;
        int[] r02 = this.f8649a;
        boolean z2 = false;
        if (r02.length < size) {
            Object[] objArr = this.f8650b;
            m5155a(size);
            int r12 = this.f8651c;
            if (r12 > 0) {
                System.arraycopy(r02, 0, this.f8649a, 0, r12);
                System.arraycopy(objArr, 0, this.f8650b, 0, this.f8651c);
            }
            m5154b(r02, objArr, this.f8651c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    /* renamed from: c */
    public final int m5156c(int r5, Object obj) {
        int r02 = this.f8651c;
        if (r02 == 0) {
            return -1;
        }
        int m5159a = AbstractC2684d.m5159a(r02, r5, this.f8649a);
        if (m5159a < 0) {
            return m5159a;
        }
        if (obj.equals(this.f8650b[m5159a])) {
            return m5159a;
        }
        int r2 = m5159a + 1;
        while (r2 < r02 && this.f8649a[r2] == r5) {
            if (obj.equals(this.f8650b[r2])) {
                return r2;
            }
            r2++;
        }
        for (int r12 = m5159a - 1; r12 >= 0 && this.f8649a[r12] == r5; r12--) {
            if (obj.equals(this.f8650b[r12])) {
                return r12;
            }
        }
        return ~r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int r02 = this.f8651c;
        if (r02 != 0) {
            m5154b(this.f8649a, this.f8650b, r02);
            this.f8649a = f8643e;
            this.f8650b = f8644f;
            this.f8651c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m5157d() {
        int r02 = this.f8651c;
        if (r02 == 0) {
            return -1;
        }
        int m5159a = AbstractC2684d.m5159a(r02, 0, this.f8649a);
        if (m5159a < 0) {
            return m5159a;
        }
        if (this.f8650b[m5159a] == null) {
            return m5159a;
        }
        int r2 = m5159a + 1;
        while (r2 < r02 && this.f8649a[r2] == 0) {
            if (this.f8650b[r2] == null) {
                return r2;
            }
            r2++;
        }
        for (int r12 = m5159a - 1; r12 >= 0 && this.f8649a[r12] == 0; r12--) {
            if (this.f8650b[r12] == null) {
                return r12;
            }
        }
        return ~r2;
    }

    /* renamed from: e */
    public final void m5158e(int r8) {
        Object[] objArr = this.f8650b;
        Object obj = objArr[r8];
        int r12 = this.f8651c;
        if (r12 <= 1) {
            m5154b(this.f8649a, objArr, r12);
            this.f8649a = f8643e;
            this.f8650b = f8644f;
            this.f8651c = 0;
            return;
        }
        int[] r4 = this.f8649a;
        if (r4.length <= 8 || r12 >= r4.length / 3) {
            int r13 = r12 - 1;
            this.f8651c = r13;
            if (r8 < r13) {
                int r02 = r8 + 1;
                System.arraycopy(r4, r02, r4, r8, r13 - r8);
                Object[] objArr2 = this.f8650b;
                System.arraycopy(objArr2, r02, objArr2, r8, this.f8651c - r8);
            }
            this.f8650b[this.f8651c] = null;
            return;
        }
        m5155a(r12 > 8 ? r12 + (r12 >> 1) : 8);
        this.f8651c--;
        if (r8 > 0) {
            System.arraycopy(r4, 0, this.f8649a, 0, r8);
            System.arraycopy(objArr, 0, this.f8650b, 0, r8);
        }
        int r14 = this.f8651c;
        if (r8 < r14) {
            int r2 = r8 + 1;
            System.arraycopy(r4, r2, this.f8649a, r8, r14 - r8);
            System.arraycopy(objArr, r2, this.f8650b, r8, this.f8651c - r8);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f8651c != set.size()) {
                return false;
            }
            for (int r12 = 0; r12 < this.f8651c; r12++) {
                try {
                    if (!set.contains(this.f8650b[r12])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] r02 = this.f8649a;
        int r12 = this.f8651c;
        int r3 = 0;
        for (int r2 = 0; r2 < r12; r2++) {
            r3 += r02[r2];
        }
        return r3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m5157d() : m5156c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8651c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f8652d == null) {
            this.f8652d = new C2681a(1, this);
        }
        C2681a c2681a = this.f8652d;
        if (c2681a.f8638b == null) {
            c2681a.f8638b = new C2688h(c2681a, 1);
        }
        return c2681a.f8638b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m5158e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int r02 = this.f8651c - 1; r02 >= 0; r02--) {
            if (!collection.contains(this.f8650b[r02])) {
                m5158e(r02);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8651c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int r02 = this.f8651c;
        Object[] objArr = new Object[r02];
        System.arraycopy(this.f8650b, 0, objArr, 0, r02);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8651c * 14);
        sb.append('{');
        for (int r12 = 0; r12 < this.f8651c; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8650b[r12];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f8651c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f8651c);
        }
        System.arraycopy(this.f8650b, 0, objArr, 0, this.f8651c);
        int length = objArr.length;
        int r12 = this.f8651c;
        if (length > r12) {
            objArr[r12] = null;
        }
        return objArr;
    }
}
