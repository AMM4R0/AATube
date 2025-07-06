package p042O1;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p103k0.AbstractC2480a;

/* renamed from: O1.a */
/* loaded from: classes.dex */
public final class C0408a extends ProxySelector {

    /* renamed from: a */
    public static final C0408a f1072a = new C0408a();

    @Override // java.net.ProxySelector
    public final List select(URI r2) {
        if (r2 != null) {
            return AbstractC2480a.m4863D(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI r12, SocketAddress socketAddress, IOException iOException) {
    }
}
