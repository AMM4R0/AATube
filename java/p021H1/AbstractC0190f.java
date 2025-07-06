package p021H1;

import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0094z;
import p011D1.AbstractC0122i;
import p051R1.C0480j;
import p081e1.C0879e;

/* renamed from: H1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0190f {
    static {
        C0480j c0480j = C0480j.f1218d;
        C0879e.m2396i("\"\\");
        C0879e.m2396i("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m551a(C0094z c0094z) {
        if (AbstractC2492i.m4911a((String) c0094z.f315a.f295c, "HEAD")) {
            return false;
        }
        int r3 = c0094z.f318d;
        if (((r3 >= 100 && r3 < 200) || r3 == 204 || r3 == 304) && AbstractC0122i.m415e(c0094z) == -1) {
            String m274a = c0094z.f320f.m274a("Transfer-Encoding");
            if (m274a == null) {
                m274a = null;
            }
            if (!"chunked".equalsIgnoreCase(m274a)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01fa, code lost:
    
        if (r3.f28a.matcher(r0).matches() == false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x024a  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m552b(p008C1.C0070b r35, p008C1.C0085q r36, p008C1.C0083o r37) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p021H1.AbstractC0190f.m552b(C1.b, C1.q, C1.o):void");
    }
}
