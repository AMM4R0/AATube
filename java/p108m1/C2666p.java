package p108m1;

import java.util.Iterator;
import p145z1.InterfaceC2920c;

/* renamed from: m1.p */
/* loaded from: classes.dex */
public final class C2666p implements InterfaceC2920c {

    /* renamed from: a */
    public final /* synthetic */ int f8604a;

    /* renamed from: b */
    public final /* synthetic */ Object f8605b;

    public /* synthetic */ C2666p(int r12, Object obj) {
        this.f8604a = r12;
        this.f8605b = obj;
    }

    @Override // p145z1.InterfaceC2920c
    public final Iterator iterator() {
        switch (this.f8604a) {
            case 0:
                return ((Iterable) this.f8605b).iterator();
            default:
                return (Iterator) this.f8605b;
        }
    }
}
