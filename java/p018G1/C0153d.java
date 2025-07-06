package p018G1;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.InterfaceC0465B;

/* renamed from: G1.d */
/* loaded from: classes.dex */
public final class C0153d implements InterfaceC0465B {

    /* renamed from: a */
    public final InterfaceC0465B f443a;

    /* renamed from: b */
    public final long f444b;

    /* renamed from: c */
    public boolean f445c;

    /* renamed from: d */
    public long f446d;

    /* renamed from: e */
    public boolean f447e;

    /* renamed from: f */
    public final /* synthetic */ C0155f f448f;

    public C0153d(C0155f c0155f, InterfaceC0465B delegate, long j2) {
        AbstractC2492i.m4915e(delegate, "delegate");
        this.f448f = c0155f;
        this.f443a = delegate;
        this.f444b = j2;
    }

    /* renamed from: b */
    public final void m495b() {
        this.f443a.close();
    }

    @Override // p051R1.InterfaceC0465B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f447e) {
            return;
        }
        this.f447e = true;
        long j2 = this.f444b;
        if (j2 != -1 && this.f446d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m495b();
            m498g(null);
        } catch (IOException e2) {
            throw m498g(e2);
        }
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: d */
    public final C0469F mo496d() {
        return this.f443a.mo496d();
    }

    @Override // p051R1.InterfaceC0465B
    /* renamed from: e */
    public final void mo497e(C0477g c0477g, long j2) {
        if (this.f447e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f444b;
        if (j3 == -1 || this.f446d + j2 <= j3) {
            try {
                this.f443a.mo497e(c0477g, j2);
                this.f446d += j2;
                return;
            } catch (IOException e2) {
                throw m498g(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.f446d + j2));
    }

    @Override // p051R1.InterfaceC0465B, java.io.Flushable
    public final void flush() {
        try {
            m499h();
        } catch (IOException e2) {
            throw m498g(e2);
        }
    }

    /* renamed from: g */
    public final IOException m498g(IOException iOException) {
        if (this.f445c) {
            return iOException;
        }
        this.f445c = true;
        return this.f448f.m501a(false, true, iOException);
    }

    /* renamed from: h */
    public final void m499h() {
        this.f443a.flush();
    }

    public final String toString() {
        return C0153d.class.getSimpleName() + '(' + this.f443a + ')';
    }
}
