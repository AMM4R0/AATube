package p024I1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p011D1.AbstractC0122i;
import p051R1.C0477g;

/* renamed from: I1.e */
/* loaded from: classes.dex */
public final class C0213e extends AbstractC0210b {

    /* renamed from: d */
    public long f634d;

    /* renamed from: e */
    public final /* synthetic */ C0217i f635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213e(C0217i c0217i, long j2) {
        super(c0217i);
        this.f635e = c0217i;
        this.f634d = j2;
        if (j2 == 0) {
            m605b();
        }
    }

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
        long j3 = this.f634d;
        if (j3 == 0) {
            return -1L;
        }
        long mo390a = super.mo390a(sink, Math.min(j3, j2));
        if (mo390a == -1) {
            this.f635e.f642b.mo489h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m605b();
            throw protocolException;
        }
        long j4 = this.f634d - mo390a;
        this.f634d = j4;
        if (j4 == 0) {
            m605b();
        }
        return mo390a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f625b) {
            return;
        }
        if (this.f634d != 0 && !AbstractC0122i.m413c(this, TimeUnit.MILLISECONDS)) {
            this.f635e.f642b.mo489h();
            m605b();
        }
        this.f625b = true;
    }
}
