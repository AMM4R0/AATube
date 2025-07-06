package p140x1;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C2891c extends AbstractC2889a {
    static {
        new C2891c((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.AbstractC2492i.m4916f(r2.f9511a, r2.f9512b) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p140x1.C2891c
            if (r0 == 0) goto L28
            char r0 = r4.f9511a
            char r1 = r4.f9512b
            int r2 = kotlin.jvm.internal.AbstractC2492i.m4916f(r0, r1)
            if (r2 <= 0) goto L1c
            r2 = r5
            x1.c r2 = (p140x1.C2891c) r2
            char r3 = r2.f9511a
            char r2 = r2.f9512b
            int r2 = kotlin.jvm.internal.AbstractC2492i.m4916f(r3, r2)
            if (r2 <= 0) goto L1c
            goto L26
        L1c:
            x1.c r5 = (p140x1.C2891c) r5
            char r2 = r5.f9511a
            if (r0 != r2) goto L28
            char r5 = r5.f9512b
            if (r1 != r5) goto L28
        L26:
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p140x1.C2891c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        char c = this.f9511a;
        char c2 = this.f9512b;
        if (AbstractC2492i.m4916f(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.f9511a + ".." + this.f9512b;
    }
}
