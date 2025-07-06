package p051R1;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: R1.m */
/* loaded from: classes.dex */
public abstract class AbstractC0483m implements InterfaceC0467D {

    /* renamed from: a */
    public final InterfaceC0467D f1227a;

    public AbstractC0483m(InterfaceC0467D delegate) {
        AbstractC2492i.m4915e(delegate, "delegate");
        this.f1227a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1227a.close();
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f1227a.mo391d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f1227a + ')';
    }
}
