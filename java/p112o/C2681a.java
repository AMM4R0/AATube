package p112o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C2681a {

    /* renamed from: a */
    public C2688h f8637a;

    /* renamed from: b */
    public C2688h f8638b;

    /* renamed from: c */
    public C2690j f8639c;

    /* renamed from: d */
    public final /* synthetic */ int f8640d;

    /* renamed from: e */
    public final /* synthetic */ Object f8641e;

    public /* synthetic */ C2681a(int r12, Object obj) {
        this.f8640d = r12;
        this.f8641e = obj;
    }

    /* renamed from: h */
    public static boolean m5145h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m5146a() {
        switch (this.f8640d) {
            case 0:
                ((C2682b) this.f8641e).clear();
                break;
            default:
                ((C2683c) this.f8641e).clear();
                break;
        }
    }

    /* renamed from: b */
    public final Object m5147b(int r2, int r3) {
        switch (this.f8640d) {
            case 0:
                return ((C2682b) this.f8641e).f8682b[(r2 << 1) + r3];
            default:
                return ((C2683c) this.f8641e).f8650b[r2];
        }
    }

    /* renamed from: c */
    public final Map m5148c() {
        switch (this.f8640d) {
            case 0:
                return (C2682b) this.f8641e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* renamed from: d */
    public final int m5149d() {
        switch (this.f8640d) {
            case 0:
                return ((C2682b) this.f8641e).f8683c;
            default:
                return ((C2683c) this.f8641e).f8651c;
        }
    }

    /* renamed from: e */
    public final int m5150e(Object obj) {
        switch (this.f8640d) {
            case 0:
                return ((C2682b) this.f8641e).m5176e(obj);
            default:
                return ((C2683c) this.f8641e).indexOf(obj);
        }
    }

    /* renamed from: f */
    public final int m5151f(Object obj) {
        switch (this.f8640d) {
            case 0:
                return ((C2682b) this.f8641e).m5178g(obj);
            default:
                return ((C2683c) this.f8641e).indexOf(obj);
        }
    }

    /* renamed from: g */
    public final void m5152g(int r2) {
        switch (this.f8640d) {
            case 0:
                ((C2682b) this.f8641e).m5180i(r2);
                break;
            default:
                ((C2683c) this.f8641e).m5158e(r2);
                break;
        }
    }

    /* renamed from: i */
    public final Object[] m5153i(Object[] objArr, int r5) {
        int m5149d = m5149d();
        if (objArr.length < m5149d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m5149d);
        }
        for (int r12 = 0; r12 < m5149d; r12++) {
            objArr[r12] = m5147b(r12, r5);
        }
        if (objArr.length > m5149d) {
            objArr[m5149d] = null;
        }
        return objArr;
    }
}
