package p018G1;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.AbstractC0483m;
import p051R1.C0477g;
import p051R1.InterfaceC0467D;

/* renamed from: G1.e */
/* loaded from: classes.dex */
public final class C0154e extends AbstractC0483m {

    /* renamed from: b */
    public final long f449b;

    /* renamed from: c */
    public long f450c;

    /* renamed from: d */
    public boolean f451d;

    /* renamed from: e */
    public boolean f452e;

    /* renamed from: f */
    public boolean f453f;

    /* renamed from: g */
    public final /* synthetic */ C0155f f454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154e(C0155f c0155f, InterfaceC0467D delegate, long j2) {
        super(delegate);
        AbstractC2492i.m4915e(delegate, "delegate");
        this.f454g = c0155f;
        this.f449b = j2;
        this.f451d = true;
        if (j2 == 0) {
            m500b(null);
        }
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        AbstractC2492i.m4915e(sink, "sink");
        if (this.f453f) {
            throw new IllegalStateException("closed");
        }
        try {
            long mo390a = this.f1227a.mo390a(sink, j2);
            if (this.f451d) {
                this.f451d = false;
                C0155f c0155f = this.f454g;
                c0155f.getClass();
                C0162m call = c0155f.f455a;
                AbstractC2492i.m4915e(call, "call");
            }
            if (mo390a == -1) {
                m500b(null);
                return -1L;
            }
            long j3 = this.f450c + mo390a;
            long j4 = this.f449b;
            if (j4 == -1 || j3 <= j4) {
                this.f450c = j3;
                if (j3 == j4) {
                    m500b(null);
                }
                return mo390a;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw m500b(e2);
        }
    }

    /* renamed from: b */
    public final IOException m500b(IOException iOException) {
        if (this.f452e) {
            return iOException;
        }
        this.f452e = true;
        C0155f c0155f = this.f454g;
        if (iOException == null && this.f451d) {
            this.f451d = false;
            c0155f.getClass();
            C0162m call = c0155f.f455a;
            AbstractC2492i.m4915e(call, "call");
        }
        return c0155f.m501a(true, false, iOException);
    }

    @Override // p051R1.AbstractC0483m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f453f) {
            return;
        }
        this.f453f = true;
        try {
            super.close();
            m500b(null);
        } catch (IOException e2) {
            throw m500b(e2);
        }
    }
}
