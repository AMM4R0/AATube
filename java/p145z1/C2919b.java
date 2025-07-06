package p145z1;

import java.util.Iterator;
import kotlin.jvm.internal.C2484a;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C2919b implements InterfaceC2920c {

    /* renamed from: a */
    public final InterfaceC2920c f9570a;

    /* renamed from: b */
    public final int f9571b;

    public C2919b(InterfaceC2920c interfaceC2920c, int r3) {
        this.f9570a = interfaceC2920c;
        this.f9571b = r3;
        if (r3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + r3 + '.').toString());
    }

    @Override // p145z1.InterfaceC2920c
    public final Iterator iterator() {
        return new C2484a(this);
    }
}
