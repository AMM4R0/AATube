package p011D1;

import kotlin.jvm.internal.AbstractC2492i;
import p008C1.AbstractC0066A;
import p008C1.C0087s;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.C0494x;
import p051R1.InterfaceC0467D;
import p051R1.InterfaceC0479i;

/* renamed from: D1.a */
/* loaded from: classes.dex */
public final class C0114a extends AbstractC0066A implements InterfaceC0467D {

    /* renamed from: a */
    public final C0087s f349a;

    /* renamed from: b */
    public final long f350b;

    public C0114a(C0087s c0087s, long j2) {
        this.f349a = c0087s;
        this.f350b = j2;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public final long mo390a(C0477g sink, long j2) {
        AbstractC2492i.m4915e(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p008C1.AbstractC0066A
    /* renamed from: b */
    public final long mo248b() {
        return this.f350b;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return C0469F.f1191d;
    }

    @Override // p008C1.AbstractC0066A
    /* renamed from: g */
    public final C0087s mo249g() {
        return this.f349a;
    }

    @Override // p008C1.AbstractC0066A
    /* renamed from: h */
    public final InterfaceC0479i mo250h() {
        return new C0494x(this);
    }

    @Override // p008C1.AbstractC0066A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
