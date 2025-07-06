package p145z1;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2810l;

/* renamed from: z1.h */
/* loaded from: classes.dex */
public final class C2925h implements InterfaceC2920c {

    /* renamed from: a */
    public final InterfaceC2920c f9575a;

    /* renamed from: b */
    public final AbstractC2493j f9576b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2925h(InterfaceC2920c interfaceC2920c, InterfaceC2810l interfaceC2810l) {
        this.f9575a = interfaceC2920c;
        this.f9576b = (AbstractC2493j) interfaceC2810l;
    }

    @Override // p145z1.InterfaceC2920c
    public final Iterator iterator() {
        return new C2924g(this);
    }
}
