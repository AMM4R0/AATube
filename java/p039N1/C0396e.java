package p039N1;

import javax.net.ssl.SSLSocket;
import p002A1.AbstractC0025r;

/* renamed from: N1.e */
/* loaded from: classes.dex */
public final class C0396e implements InterfaceC0402k {
    @Override // p039N1.InterfaceC0402k
    /* renamed from: a */
    public final boolean mo1147a(SSLSocket sSLSocket) {
        return AbstractC0025r.m156I(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p039N1.InterfaceC0402k
    /* renamed from: b */
    public final InterfaceC0404m mo1148b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0397f(cls2);
    }
}
