package p024I1;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0085q;
import p011D1.AbstractC0122i;

/* renamed from: I1.d */
/* loaded from: classes.dex */
public final class C0212d extends AbstractC0210b {

    /* renamed from: d */
    public final C0085q f630d;

    /* renamed from: e */
    public long f631e;

    /* renamed from: f */
    public boolean f632f;

    /* renamed from: g */
    public final /* synthetic */ C0217i f633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212d(C0217i c0217i, C0085q url) {
        super(c0217i);
        AbstractC2492i.m4915e(url, "url");
        this.f633g = c0217i;
        this.f630d = url;
        this.f631e = -1L;
        this.f632f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (r12 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0075, code lost:
    
        p036M1.AbstractC0387m.m1109g(16);
        r2 = java.lang.Integer.toString(r7, 16);
        kotlin.jvm.internal.AbstractC2492i.m4914d(r2, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    @Override // p024I1.AbstractC0210b, p051R1.InterfaceC0467D
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo390a(p051R1.C0477g r17, long r18) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024I1.C0212d.mo390a(R1.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f625b) {
            return;
        }
        if (this.f632f && !AbstractC0122i.m413c(this, TimeUnit.MILLISECONDS)) {
            this.f633g.f642b.mo489h();
            m605b();
        }
        this.f625b = true;
    }
}
