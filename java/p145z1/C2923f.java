package p145z1;

import java.util.Iterator;
import p002A1.C0009b;
import p002A1.C0010c;

/* renamed from: z1.f */
/* loaded from: classes.dex */
public final class C2923f implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ C0010c f9572a;

    public C2923f(C0010c c0010c) {
        this.f9572a = c0010c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0009b(this.f9572a);
    }
}
