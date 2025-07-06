package p002A1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p140x1.C2893e;

/* renamed from: A1.b */
/* loaded from: classes.dex */
public final class C0009b implements Iterator {

    /* renamed from: a */
    public int f7a = -1;

    /* renamed from: b */
    public int f8b;

    /* renamed from: c */
    public int f9c;

    /* renamed from: d */
    public C2893e f10d;

    /* renamed from: e */
    public int f11e;

    /* renamed from: f */
    public final /* synthetic */ C0010c f12f;

    public C0009b(C0010c c0010c) {
        this.f12f = c0010c;
        int r02 = c0010c.f14b;
        int length = c0010c.f13a.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m13h("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        if (r02 < 0) {
            r02 = 0;
        } else if (r02 > length) {
            r02 = length;
        }
        this.f8b = r02;
        this.f9c = r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.j, u1.p] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m97a() {
        /*
            r8 = this;
            int r0 = r8.f9c
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.f7a = r1
            r0 = 0
            r8.f10d = r0
            goto L75
        Lb:
            A1.c r2 = r8.f12f
            int r3 = r2.f15c
            java.lang.CharSequence r4 = r2.f13a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.f11e
            int r7 = r7 + r6
            r8.f11e = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            x1.e r0 = new x1.e
            int r1 = r8.f8b
            int r2 = p002A1.AbstractC0017j.m134L(r4)
            r0.<init>(r1, r2, r6)
            r8.f10d = r0
            r8.f9c = r5
            goto L73
        L32:
            kotlin.jvm.internal.j r0 = r2.f16d
            int r2 = r8.f9c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r4, r2)
            l1.c r0 = (p105l1.C2632c) r0
            if (r0 != 0) goto L52
            x1.e r0 = new x1.e
            int r1 = r8.f8b
            int r2 = p002A1.AbstractC0017j.m134L(r4)
            r0.<init>(r1, r2, r6)
            r8.f10d = r0
            r8.f9c = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.f8550a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f8551b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f8b
            x1.e r3 = p036M1.AbstractC0379e.m1069E(r3, r2)
            r8.f10d = r3
            int r2 = r2 + r0
            r8.f8b = r2
            if (r0 != 0) goto L70
            r1 = r6
        L70:
            int r2 = r2 + r1
            r8.f9c = r2
        L73:
            r8.f7a = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0009b.m97a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7a == -1) {
            m97a();
        }
        return this.f7a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7a == -1) {
            m97a();
        }
        if (this.f7a == 0) {
            throw new NoSuchElementException();
        }
        C2893e c2893e = this.f10d;
        AbstractC2492i.m4913c(c2893e, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f10d = null;
        this.f7a = -1;
        return c2893e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
