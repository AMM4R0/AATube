package p017G;

/* renamed from: G.d */
/* loaded from: classes.dex */
public final class C0140d {

    /* renamed from: a */
    public boolean f406a;

    /* renamed from: b */
    public InterfaceC0139c f407b;

    /* renamed from: c */
    public boolean f408c;

    /* renamed from: a */
    public final void m440a(InterfaceC0139c interfaceC0139c) {
        synchronized (this) {
            while (this.f408c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f407b == interfaceC0139c) {
                return;
            }
            this.f407b = interfaceC0139c;
            if (this.f406a) {
                interfaceC0139c.mo119n();
            }
        }
    }
}
