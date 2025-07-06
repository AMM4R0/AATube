package p024I1;

import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p051R1.C0477g;

/* renamed from: I1.g */
/* loaded from: classes.dex */
public final class C0215g extends AbstractC0210b {

    /* renamed from: d */
    public boolean f639d;

    @Override // p024I1.AbstractC0210b, p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        AbstractC2492i.m4915e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m14i("byteCount < 0: ", j2).toString());
        }
        if (this.f625b) {
            throw new IllegalStateException("closed");
        }
        if (this.f639d) {
            return -1L;
        }
        long mo390a = super.mo390a(sink, j2);
        if (mo390a != -1) {
            return mo390a;
        }
        this.f639d = true;
        m605b();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f625b) {
            return;
        }
        if (!this.f639d) {
            m605b();
        }
        this.f625b = true;
    }
}
