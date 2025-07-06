package p112o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h */
/* loaded from: classes.dex */
public final class C2688h implements Set {

    /* renamed from: a */
    public final /* synthetic */ int f8670a;

    /* renamed from: b */
    public final /* synthetic */ C2681a f8671b;

    public /* synthetic */ C2688h(C2681a c2681a, int r2) {
        this.f8670a = r2;
        this.f8671b = c2681a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8670a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8670a) {
            case 0:
                C2681a c2681a = this.f8671b;
                int m5149d = c2681a.m5149d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c2681a.f8640d) {
                        case 0:
                            ((C2682b) c2681a.f8641e).put(key, value);
                            break;
                        default:
                            ((C2683c) c2681a.f8641e).add(key);
                            break;
                    }
                }
                return m5149d != c2681a.m5149d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f8670a) {
            case 0:
                this.f8671b.m5146a();
                break;
            default:
                this.f8671b.m5146a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8670a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2681a c2681a = this.f8671b;
                int m5150e = c2681a.m5150e(key);
                if (m5150e < 0) {
                    return false;
                }
                Object m5147b = c2681a.m5147b(m5150e, 1);
                Object value = entry.getValue();
                return m5147b == value || (m5147b != null && m5147b.equals(value));
            default:
                return this.f8671b.m5150e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f8670a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map m5148c = this.f8671b.m5148c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!m5148c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f8670a) {
        }
        return C2681a.m5145h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f8670a) {
            case 0:
                C2681a c2681a = this.f8671b;
                int r4 = 0;
                for (int m5149d = c2681a.m5149d() - 1; m5149d >= 0; m5149d--) {
                    Object m5147b = c2681a.m5147b(m5149d, 0);
                    Object m5147b2 = c2681a.m5147b(m5149d, 1);
                    r4 += (m5147b == null ? 0 : m5147b.hashCode()) ^ (m5147b2 == null ? 0 : m5147b2.hashCode());
                }
                return r4;
            default:
                C2681a c2681a2 = this.f8671b;
                int r3 = 0;
                for (int m5149d2 = c2681a2.m5149d() - 1; m5149d2 >= 0; m5149d2--) {
                    Object m5147b3 = c2681a2.m5147b(m5149d2, 0);
                    r3 += m5147b3 == null ? 0 : m5147b3.hashCode();
                }
                return r3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f8670a) {
            case 0:
                if (this.f8671b.m5149d() == 0) {
                }
                break;
            default:
                if (this.f8671b.m5149d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8670a) {
            case 0:
                return new C2689i(this.f8671b);
            default:
                return new C2687g(this.f8671b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f8670a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C2681a c2681a = this.f8671b;
                int m5150e = c2681a.m5150e(obj);
                if (m5150e < 0) {
                    return false;
                }
                c2681a.m5152g(m5150e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f8670a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map m5148c = this.f8671b.m5148c();
                int size = m5148c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    m5148c.remove(it.next());
                }
                return size != m5148c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f8670a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map m5148c = this.f8671b.m5148c();
                int size = m5148c.size();
                Iterator it = m5148c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != m5148c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f8670a) {
        }
        return this.f8671b.m5149d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f8670a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f8671b.m5153i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f8670a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C2681a c2681a = this.f8671b;
                int m5149d = c2681a.m5149d();
                Object[] objArr = new Object[m5149d];
                for (int r4 = 0; r4 < m5149d; r4++) {
                    objArr[r4] = c2681a.m5147b(r4, 0);
                }
                return objArr;
        }
    }
}
