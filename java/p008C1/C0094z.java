package p008C1;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import p011D1.AbstractC0119f;
import p018G1.C0155f;
import p131u1.InterfaceC2799a;

/* renamed from: C1.z */
/* loaded from: classes.dex */
public final class C0094z implements Closeable {

    /* renamed from: a */
    public final C0091w f315a;

    /* renamed from: b */
    public final EnumC0089u f316b;

    /* renamed from: c */
    public final String f317c;

    /* renamed from: d */
    public final int f318d;

    /* renamed from: e */
    public final C0082n f319e;

    /* renamed from: f */
    public final C0083o f320f;

    /* renamed from: g */
    public final AbstractC0066A f321g;

    /* renamed from: h */
    public final C0094z f322h;

    /* renamed from: i */
    public final C0094z f323i;

    /* renamed from: j */
    public final C0094z f324j;

    /* renamed from: k */
    public final long f325k;

    /* renamed from: l */
    public final long f326l;

    /* renamed from: m */
    public final C0155f f327m;

    /* renamed from: n */
    public final AbstractC2493j f328n;

    /* JADX WARN: Multi-variable type inference failed */
    public C0094z(C0091w request, EnumC0089u protocol, String message, int r11, C0082n c0082n, C0083o c0083o, AbstractC0066A body, C0094z c0094z, C0094z c0094z2, C0094z c0094z3, long j2, long j3, C0155f c0155f, InterfaceC2799a trailersFn) {
        AbstractC2492i.m4915e(request, "request");
        AbstractC2492i.m4915e(protocol, "protocol");
        AbstractC2492i.m4915e(message, "message");
        AbstractC2492i.m4915e(body, "body");
        AbstractC2492i.m4915e(trailersFn, "trailersFn");
        this.f315a = request;
        this.f316b = protocol;
        this.f317c = message;
        this.f318d = r11;
        this.f319e = c0082n;
        this.f320f = c0083o;
        this.f321g = body;
        this.f322h = c0094z;
        this.f323i = c0094z2;
        this.f324j = c0094z3;
        this.f325k = j2;
        this.f326l = j3;
        this.f327m = c0155f;
        this.f328n = (AbstractC2493j) trailersFn;
    }

    /* renamed from: b */
    public final C0093y m311b() {
        C0093y c0093y = new C0093y();
        c0093y.f303c = -1;
        c0093y.f307g = AbstractC0119f.f364c;
        c0093y.f314n = C0092x.f300e;
        c0093y.f301a = this.f315a;
        c0093y.f302b = this.f316b;
        c0093y.f303c = this.f318d;
        c0093y.f304d = this.f317c;
        c0093y.f305e = this.f319e;
        c0093y.f306f = this.f320f.m276c();
        c0093y.f307g = this.f321g;
        c0093y.f308h = this.f322h;
        c0093y.f309i = this.f323i;
        c0093y.f310j = this.f324j;
        c0093y.f311k = this.f325k;
        c0093y.f312l = this.f326l;
        c0093y.f313m = this.f327m;
        c0093y.f314n = this.f328n;
        return c0093y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f321g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f316b + ", code=" + this.f318d + ", message=" + this.f317c + ", url=" + ((C0085q) this.f315a.f294b) + '}';
    }
}
