package p036M1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.support.v4.media.session.AbstractC0580g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0088t;
import p039N1.AbstractC0394c;
import p039N1.C0393b;
import p039N1.C0397f;
import p039N1.C0399h;
import p039N1.C0401j;
import p039N1.C0403l;
import p039N1.C0405n;
import p039N1.InterfaceC0404m;
import p045P1.C0423a;
import p045P1.InterfaceC0426d;
import p108m1.AbstractC2658h;

/* renamed from: M1.d */
/* loaded from: classes.dex */
public final class C0378d extends C0389o {

    /* renamed from: d */
    public static final boolean f1022d;

    /* renamed from: c */
    public final ArrayList f1023c;

    static {
        boolean z2 = false;
        if (AbstractC0387m.m1127z() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f1022d = z2;
    }

    public C0378d() {
        C0405n c0405n;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c0405n = new C0405n(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC0394c.f1057a;
            AbstractC0394c.m1146a(C0088t.class.getName(), 5, "unable to load android socket classes", e2);
            c0405n = null;
        }
        ArrayList m5109G = AbstractC2658h.m5109G(new InterfaceC0404m[]{c0405n, new C0403l(C0397f.f1060f), new C0403l(C0401j.f1067a), new C0403l(C0399h.f1066a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = m5109G.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC0404m) next).mo1143c()) {
                arrayList.add(next);
            }
        }
        this.f1023c = arrayList;
    }

    @Override // p036M1.C0389o
    /* renamed from: b */
    public final AbstractC0580g mo1058b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C0393b c0393b = x509TrustManagerExtensions != null ? new C0393b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c0393b != null ? c0393b : new C0423a(mo1065c(x509TrustManager));
    }

    @Override // p036M1.C0389o
    /* renamed from: c */
    public final InterfaceC0426d mo1065c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0377c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo1065c(x509TrustManager);
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: d */
    public final void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        AbstractC2492i.m4915e(protocols, "protocols");
        Iterator it = this.f1023c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC0404m) obj).mo1141a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC0404m interfaceC0404m = (InterfaceC0404m) obj;
        if (interfaceC0404m != null) {
            interfaceC0404m.mo1144d(sSLSocket, str, protocols);
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: e */
    public final void mo1066e(Socket socket, InetSocketAddress address, int r4) {
        AbstractC2492i.m4915e(address, "address");
        try {
            socket.connect(address, r4);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: f */
    public final String mo1060f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f1023c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC0404m) obj).mo1141a(sSLSocket)) {
                break;
            }
        }
        InterfaceC0404m interfaceC0404m = (InterfaceC0404m) obj;
        if (interfaceC0404m != null) {
            return interfaceC0404m.mo1142b(sSLSocket);
        }
        return null;
    }

    @Override // p036M1.C0389o
    /* renamed from: h */
    public final boolean mo1062h(String hostname) {
        boolean isCleartextTrafficPermitted;
        AbstractC2492i.m4915e(hostname, "hostname");
        if (Build.VERSION.SDK_INT < 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }
}
