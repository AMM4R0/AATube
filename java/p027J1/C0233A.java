package p027J1;

import java.net.SocketTimeoutException;
import p000A.AbstractC0002c;
import p008C1.C0081m;
import p016F1.C0135c;
import p051R1.C0475e;

/* renamed from: J1.A */
/* loaded from: classes.dex */
public final class C0233A extends C0475e {

    /* renamed from: m */
    public final /* synthetic */ C0234B f675m;

    public C0233A(C0234B c0234b) {
        this.f675m = c0234b;
    }

    @Override // p051R1.C0475e
    /* renamed from: j */
    public final void mo508j() {
        this.f675m.m634e(EnumC0242b.CANCEL);
        C0259s c0259s = this.f675m.f677b;
        synchronized (c0259s) {
            long j2 = c0259s.f785o;
            long j3 = c0259s.f784n;
            if (j2 < j3) {
                return;
            }
            c0259s.f784n = j3 + 1;
            c0259s.f786p = System.nanoTime() + 1000000000;
            C0135c.m427c(c0259s.f778h, AbstractC0002c.m17l(new StringBuilder(), c0259s.f773c, " ping"), new C0081m(4, c0259s));
        }
    }

    /* renamed from: k */
    public final void m629k() {
        if (m1244i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
