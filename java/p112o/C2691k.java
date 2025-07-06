package p112o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.k */
/* loaded from: classes.dex */
public class C2691k {

    /* renamed from: d */
    public static Object[] f8677d;

    /* renamed from: e */
    public static int f8678e;

    /* renamed from: f */
    public static Object[] f8679f;

    /* renamed from: g */
    public static int f8680g;

    /* renamed from: a */
    public int[] f8681a = AbstractC2684d.f8653a;

    /* renamed from: b */
    public Object[] f8682b = AbstractC2684d.f8654b;

    /* renamed from: c */
    public int f8683c = 0;

    /* renamed from: c */
    public static void m5172c(int[] r7, Object[] objArr, int r9) {
        if (r7.length == 8) {
            synchronized (C2691k.class) {
                try {
                    if (f8680g < 10) {
                        objArr[0] = f8679f;
                        objArr[1] = r7;
                        for (int r72 = (r9 << 1) - 1; r72 >= 2; r72--) {
                            objArr[r72] = null;
                        }
                        f8679f = objArr;
                        f8680g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (r7.length == 4) {
            synchronized (C2691k.class) {
                try {
                    if (f8678e < 10) {
                        objArr[0] = f8677d;
                        objArr[1] = r7;
                        for (int r73 = (r9 << 1) - 1; r73 >= 2; r73--) {
                            objArr[r73] = null;
                        }
                        f8677d = objArr;
                        f8678e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5173a(int r6) {
        if (r6 == 8) {
            synchronized (C2691k.class) {
                try {
                    Object[] objArr = f8679f;
                    if (objArr != null) {
                        this.f8682b = objArr;
                        f8679f = (Object[]) objArr[0];
                        this.f8681a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8680g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (r6 == 4) {
            synchronized (C2691k.class) {
                try {
                    Object[] objArr2 = f8677d;
                    if (objArr2 != null) {
                        this.f8682b = objArr2;
                        f8677d = (Object[]) objArr2[0];
                        this.f8681a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8678e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8681a = new int[r6];
        this.f8682b = new Object[r6 << 1];
    }

    /* renamed from: b */
    public final void m5174b(int r6) {
        int r02 = this.f8683c;
        int[] r12 = this.f8681a;
        if (r12.length < r6) {
            Object[] objArr = this.f8682b;
            m5173a(r6);
            if (this.f8683c > 0) {
                System.arraycopy(r12, 0, this.f8681a, 0, r02);
                System.arraycopy(objArr, 0, this.f8682b, 0, r02 << 1);
            }
            m5172c(r12, objArr, r02);
        }
        if (this.f8683c != r02) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int r02 = this.f8683c;
        if (r02 > 0) {
            int[] r12 = this.f8681a;
            Object[] objArr = this.f8682b;
            this.f8681a = AbstractC2684d.f8653a;
            this.f8682b = AbstractC2684d.f8654b;
            this.f8683c = 0;
            m5172c(r12, objArr, r02);
        }
        if (this.f8683c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m5176e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m5178g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m5175d(int r6, Object obj) {
        int r02 = this.f8683c;
        if (r02 == 0) {
            return -1;
        }
        try {
            int m5159a = AbstractC2684d.m5159a(r02, r6, this.f8681a);
            if (m5159a < 0) {
                return m5159a;
            }
            if (obj.equals(this.f8682b[m5159a << 1])) {
                return m5159a;
            }
            int r2 = m5159a + 1;
            while (r2 < r02 && this.f8681a[r2] == r6) {
                if (obj.equals(this.f8682b[r2 << 1])) {
                    return r2;
                }
                r2++;
            }
            for (int r12 = m5159a - 1; r12 >= 0 && this.f8681a[r12] == r6; r12--) {
                if (obj.equals(this.f8682b[r12 << 1])) {
                    return r12;
                }
            }
            return ~r2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m5176e(Object obj) {
        return obj == null ? m5177f() : m5175d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2691k) {
            C2691k c2691k = (C2691k) obj;
            if (this.f8683c != c2691k.f8683c) {
                return false;
            }
            for (int r12 = 0; r12 < this.f8683c; r12++) {
                try {
                    Object m5179h = m5179h(r12);
                    Object m5181j = m5181j(r12);
                    Object orDefault = c2691k.getOrDefault(m5179h, null);
                    if (m5181j == null) {
                        if (orDefault != null || !c2691k.containsKey(m5179h)) {
                            return false;
                        }
                    } else if (!m5181j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f8683c != map.size()) {
                return false;
            }
            for (int r13 = 0; r13 < this.f8683c; r13++) {
                try {
                    Object m5179h2 = m5179h(r13);
                    Object m5181j2 = m5181j(r13);
                    Object obj2 = map.get(m5179h2);
                    if (m5181j2 == null) {
                        if (obj2 != null || !map.containsKey(m5179h2)) {
                            return false;
                        }
                    } else if (!m5181j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m5177f() {
        int r02 = this.f8683c;
        if (r02 == 0) {
            return -1;
        }
        try {
            int m5159a = AbstractC2684d.m5159a(r02, 0, this.f8681a);
            if (m5159a < 0) {
                return m5159a;
            }
            if (this.f8682b[m5159a << 1] == null) {
                return m5159a;
            }
            int r2 = m5159a + 1;
            while (r2 < r02 && this.f8681a[r2] == 0) {
                if (this.f8682b[r2 << 1] == null) {
                    return r2;
                }
                r2++;
            }
            for (int r12 = m5159a - 1; r12 >= 0 && this.f8681a[r12] == 0; r12--) {
                if (this.f8682b[r12 << 1] == null) {
                    return r12;
                }
            }
            return ~r2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m5178g(Object obj) {
        int r02 = this.f8683c * 2;
        Object[] objArr = this.f8682b;
        if (obj == null) {
            for (int r6 = 1; r6 < r02; r6 += 2) {
                if (objArr[r6] == null) {
                    return r6 >> 1;
                }
            }
            return -1;
        }
        for (int r3 = 1; r3 < r02; r3 += 2) {
            if (obj.equals(objArr[r3])) {
                return r3 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int m5176e = m5176e(obj);
        return m5176e >= 0 ? this.f8682b[(m5176e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final Object m5179h(int r2) {
        return this.f8682b[r2 << 1];
    }

    public final int hashCode() {
        int[] r02 = this.f8681a;
        Object[] objArr = this.f8682b;
        int r2 = this.f8683c;
        int r4 = 1;
        int r5 = 0;
        int r6 = 0;
        while (r5 < r2) {
            Object obj = objArr[r4];
            r6 += (obj == null ? 0 : obj.hashCode()) ^ r02[r5];
            r5++;
            r4 += 2;
        }
        return r6;
    }

    /* renamed from: i */
    public final Object m5180i(int r11) {
        Object[] objArr = this.f8682b;
        int r12 = r11 << 1;
        Object obj = objArr[r12 + 1];
        int r3 = this.f8683c;
        int r4 = 0;
        if (r3 <= 1) {
            m5172c(this.f8681a, objArr, r3);
            this.f8681a = AbstractC2684d.f8653a;
            this.f8682b = AbstractC2684d.f8654b;
        } else {
            int r6 = r3 - 1;
            int[] r7 = this.f8681a;
            if (r7.length <= 8 || r3 >= r7.length / 3) {
                if (r11 < r6) {
                    int r02 = r11 + 1;
                    int r42 = r6 - r11;
                    System.arraycopy(r7, r02, r7, r11, r42);
                    Object[] objArr2 = this.f8682b;
                    System.arraycopy(objArr2, r02 << 1, objArr2, r12, r42 << 1);
                }
                Object[] objArr3 = this.f8682b;
                int r03 = r6 << 1;
                objArr3[r03] = null;
                objArr3[r03 + 1] = null;
            } else {
                m5173a(r3 > 8 ? r3 + (r3 >> 1) : 8);
                if (r3 != this.f8683c) {
                    throw new ConcurrentModificationException();
                }
                if (r11 > 0) {
                    System.arraycopy(r7, 0, this.f8681a, 0, r11);
                    System.arraycopy(objArr, 0, this.f8682b, 0, r12);
                }
                if (r11 < r6) {
                    int r43 = r11 + 1;
                    int r9 = r6 - r11;
                    System.arraycopy(r7, r43, this.f8681a, r11, r9);
                    System.arraycopy(objArr, r43 << 1, this.f8682b, r12, r9 << 1);
                }
            }
            r4 = r6;
        }
        if (r3 != this.f8683c) {
            throw new ConcurrentModificationException();
        }
        this.f8683c = r4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f8683c <= 0;
    }

    /* renamed from: j */
    public final Object m5181j(int r2) {
        return this.f8682b[(r2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int r3;
        int m5175d;
        int r02 = this.f8683c;
        if (obj == null) {
            m5175d = m5177f();
            r3 = 0;
        } else {
            int hashCode = obj.hashCode();
            r3 = hashCode;
            m5175d = m5175d(hashCode, obj);
        }
        if (m5175d >= 0) {
            int r10 = (m5175d << 1) + 1;
            Object[] objArr = this.f8682b;
            Object obj3 = objArr[r10];
            objArr[r10] = obj2;
            return obj3;
        }
        int r2 = ~m5175d;
        int[] r4 = this.f8681a;
        if (r02 >= r4.length) {
            int r5 = 8;
            if (r02 >= 8) {
                r5 = (r02 >> 1) + r02;
            } else if (r02 < 4) {
                r5 = 4;
            }
            Object[] objArr2 = this.f8682b;
            m5173a(r5);
            if (r02 != this.f8683c) {
                throw new ConcurrentModificationException();
            }
            int[] r52 = this.f8681a;
            if (r52.length > 0) {
                System.arraycopy(r4, 0, r52, 0, r4.length);
                System.arraycopy(objArr2, 0, this.f8682b, 0, objArr2.length);
            }
            m5172c(r4, objArr2, r02);
        }
        if (r2 < r02) {
            int[] r12 = this.f8681a;
            int r42 = r2 + 1;
            System.arraycopy(r12, r2, r12, r42, r02 - r2);
            Object[] objArr3 = this.f8682b;
            System.arraycopy(objArr3, r2 << 1, objArr3, r42 << 1, (this.f8683c - r2) << 1);
        }
        int r13 = this.f8683c;
        if (r02 == r13) {
            int[] r03 = this.f8681a;
            if (r2 < r03.length) {
                r03[r2] = r3;
                Object[] objArr4 = this.f8682b;
                int r22 = r2 << 1;
                objArr4[r22] = obj;
                objArr4[r22 + 1] = obj2;
                this.f8683c = r13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int m5176e = m5176e(obj);
        if (m5176e >= 0) {
            return m5180i(m5176e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int m5176e = m5176e(obj);
        if (m5176e < 0) {
            return null;
        }
        int r3 = (m5176e << 1) + 1;
        Object[] objArr = this.f8682b;
        Object obj3 = objArr[r3];
        objArr[r3] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f8683c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8683c * 28);
        sb.append('{');
        for (int r12 = 0; r12 < this.f8683c; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            Object m5179h = m5179h(r12);
            if (m5179h != this) {
                sb.append(m5179h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m5181j = m5181j(r12);
            if (m5181j != this) {
                sb.append(m5181j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int m5176e = m5176e(obj);
        if (m5176e < 0) {
            return false;
        }
        Object m5181j = m5181j(m5176e);
        if (obj2 != m5181j && (obj2 == null || !obj2.equals(m5181j))) {
            return false;
        }
        m5180i(m5176e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int m5176e = m5176e(obj);
        if (m5176e < 0) {
            return false;
        }
        Object m5181j = m5181j(m5176e);
        if (m5181j != obj2 && (obj2 == null || !obj2.equals(m5181j))) {
            return false;
        }
        int r3 = (m5176e << 1) + 1;
        Object[] objArr = this.f8682b;
        Object obj4 = objArr[r3];
        objArr[r3] = obj3;
        return true;
    }
}
