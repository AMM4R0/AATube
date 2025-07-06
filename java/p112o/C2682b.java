package p112o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C2682b extends C2691k implements Map {

    /* renamed from: h */
    public C2681a f8642h;

    public C2682b(C2691k c2691k) {
        int r02 = c2691k.f8683c;
        m5174b(r02);
        if (this.f8683c != 0) {
            for (int r2 = 0; r2 < r02; r2++) {
                put(c2691k.m5179h(r2), c2691k.m5181j(r2));
            }
        } else if (r02 > 0) {
            System.arraycopy(c2691k.f8681a, 0, this.f8681a, 0, r02);
            System.arraycopy(c2691k.f8682b, 0, this.f8682b, 0, r02 << 1);
            this.f8683c = r02;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f8642h == null) {
            this.f8642h = new C2681a(0, this);
        }
        C2681a c2681a = this.f8642h;
        if (c2681a.f8637a == null) {
            c2681a.f8637a = new C2688h(c2681a, 0);
        }
        return c2681a.f8637a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f8642h == null) {
            this.f8642h = new C2681a(0, this);
        }
        C2681a c2681a = this.f8642h;
        if (c2681a.f8638b == null) {
            c2681a.f8638b = new C2688h(c2681a, 1);
        }
        return c2681a.f8638b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m5174b(map.size() + this.f8683c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f8642h == null) {
            this.f8642h = new C2681a(0, this);
        }
        C2681a c2681a = this.f8642h;
        if (c2681a.f8639c == null) {
            c2681a.f8639c = new C2690j(c2681a);
        }
        return c2681a.f8639c;
    }
}
