package p108m1;

import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p036M1.AbstractC0387m;

/* renamed from: m1.c */
/* loaded from: classes.dex */
public final class C2653c extends AbstractC2654d implements RandomAccess {

    /* renamed from: a */
    public final AbstractC2654d f8595a;

    /* renamed from: b */
    public final int f8596b;

    /* renamed from: c */
    public final int f8597c;

    public C2653c(AbstractC2654d list, int r3, int r4) {
        AbstractC2492i.m4915e(list, "list");
        this.f8595a = list;
        this.f8596b = r3;
        AbstractC0387m.m1110h(r3, r4, list.mo98a());
        this.f8597c = r4 - r3;
    }

    @Override // p108m1.AbstractC2651a
    /* renamed from: a */
    public final int mo98a() {
        return this.f8597c;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r02 = this.f8597c;
        if (r5 < 0 || r5 >= r02) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r5, r02, ", size: "));
        }
        return this.f8595a.get(this.f8596b + r5);
    }
}
