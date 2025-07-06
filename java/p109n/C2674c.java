package p109n;

import java.util.Map;

/* renamed from: n.c */
/* loaded from: classes.dex */
public final class C2674c implements Map.Entry {

    /* renamed from: a */
    public final Object f8614a;

    /* renamed from: b */
    public final Object f8615b;

    /* renamed from: c */
    public C2674c f8616c;

    /* renamed from: d */
    public C2674c f8617d;

    public C2674c(Object obj, Object obj2) {
        this.f8614a = obj;
        this.f8615b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2674c)) {
            return false;
        }
        C2674c c2674c = (C2674c) obj;
        return this.f8614a.equals(c2674c.f8614a) && this.f8615b.equals(c2674c.f8615b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8614a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8615b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8614a.hashCode() ^ this.f8615b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8614a + "=" + this.f8615b;
    }
}
