package p112o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.i */
/* loaded from: classes.dex */
public final class C2689i implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f8672a;

    /* renamed from: d */
    public final /* synthetic */ C2681a f8675d;

    /* renamed from: c */
    public boolean f8674c = false;

    /* renamed from: b */
    public int f8673b = -1;

    public C2689i(C2681a c2681a) {
        this.f8675d = c2681a;
        this.f8672a = c2681a.m5149d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8674c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int r2 = this.f8673b;
        C2681a c2681a = this.f8675d;
        Object m5147b = c2681a.m5147b(r2, 0);
        if (key != m5147b && (key == null || !key.equals(m5147b))) {
            return false;
        }
        Object value = entry.getValue();
        Object m5147b2 = c2681a.m5147b(this.f8673b, 1);
        return value == m5147b2 || (value != null && value.equals(m5147b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f8674c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8675d.m5147b(this.f8673b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f8674c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8675d.m5147b(this.f8673b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8673b < this.f8672a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8674c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int r02 = this.f8673b;
        C2681a c2681a = this.f8675d;
        Object m5147b = c2681a.m5147b(r02, 0);
        Object m5147b2 = c2681a.m5147b(this.f8673b, 1);
        return (m5147b == null ? 0 : m5147b.hashCode()) ^ (m5147b2 != null ? m5147b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8673b++;
        this.f8674c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8674c) {
            throw new IllegalStateException();
        }
        this.f8675d.m5152g(this.f8673b);
        this.f8673b--;
        this.f8672a--;
        this.f8674c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f8674c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C2681a c2681a = this.f8675d;
        int r12 = this.f8673b;
        switch (c2681a.f8640d) {
            case 0:
                int r13 = (r12 << 1) + 1;
                Object[] objArr = ((C2682b) c2681a.f8641e).f8682b;
                Object obj2 = objArr[r13];
                objArr[r13] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
