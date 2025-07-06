package p002A1;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2814p;
import p145z1.InterfaceC2920c;

/* renamed from: A1.c */
/* loaded from: classes.dex */
public final class C0010c implements InterfaceC2920c {

    /* renamed from: a */
    public final CharSequence f13a;

    /* renamed from: b */
    public final int f14b;

    /* renamed from: c */
    public final int f15c;

    /* renamed from: d */
    public final AbstractC2493j f16d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0010c(CharSequence input, int r3, int r4, InterfaceC2814p interfaceC2814p) {
        AbstractC2492i.m4915e(input, "input");
        this.f13a = input;
        this.f14b = r3;
        this.f15c = r4;
        this.f16d = (AbstractC2493j) interfaceC2814p;
    }

    @Override // p145z1.InterfaceC2920c
    public final Iterator iterator() {
        return new C0009b(this);
    }
}
