package p145z1;

import java.util.Iterator;

/* renamed from: z1.g */
/* loaded from: classes.dex */
public final class C2924g implements Iterator {

    /* renamed from: a */
    public final Iterator f9573a;

    /* renamed from: b */
    public final /* synthetic */ C2925h f9574b;

    public C2924g(C2925h c2925h) {
        this.f9574b = c2925h;
        this.f9573a = c2925h.f9575a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9573a.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.j, u1.l] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f9574b.f9576b.invoke(this.f9573a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
