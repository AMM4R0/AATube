package p008C1;

import java.io.Closeable;
import p011D1.AbstractC0119f;
import p051R1.InterfaceC0479i;

/* renamed from: C1.A */
/* loaded from: classes.dex */
public abstract class AbstractC0066A implements Closeable {
    /* renamed from: b */
    public abstract long mo248b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC0119f.m396b(mo250h());
    }

    /* renamed from: g */
    public abstract C0087s mo249g();

    /* renamed from: h */
    public abstract InterfaceC0479i mo250h();
}
