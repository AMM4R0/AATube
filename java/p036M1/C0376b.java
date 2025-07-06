package p036M1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.support.v4.media.session.AbstractC0580g;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;
import p039N1.C0392a;
import p039N1.C0393b;
import p039N1.C0397f;
import p039N1.C0399h;
import p039N1.C0401j;
import p039N1.C0403l;
import p039N1.InterfaceC0404m;
import p045P1.C0423a;
import p108m1.AbstractC2658h;

/* renamed from: M1.b */
/* loaded from: classes.dex */
public final class C0376b extends C0389o {

    /* renamed from: d */
    public static final boolean f1018d;

    /* renamed from: c */
    public final ArrayList f1019c;

    static {
        f1018d = AbstractC0387m.m1127z() && Build.VERSION.SDK_INT >= 29;
    }

    public C0376b() {
        ArrayList m5109G = AbstractC2658h.m5109G(new InterfaceC0404m[]{(!AbstractC0387m.m1127z() || Build.VERSION.SDK_INT < 29) ? null : new C0392a(), new C0403l(C0397f.f1060f), new C0403l(C0401j.f1067a), new C0403l(C0399h.f1066a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = m5109G.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC0404m) next).mo1143c()) {
                arrayList.add(next);
            }
        }
        this.f1019c = arrayList;
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
    /* renamed from: d */
    public final void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        AbstractC2492i.m4915e(protocols, "protocols");
        Iterator it = this.f1019c.iterator();
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
    /* renamed from: f */
    public final String mo1060f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f1019c.iterator();
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
    /* renamed from: g */
    public final Object mo1061g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo1061g();
        }
        CloseGuard m1050b = AbstractC0375a.m1050b();
        m1050b.open("response.body().close()");
        return m1050b;
    }

    @Override // p036M1.C0389o
    /* renamed from: h */
    public final boolean mo1062h(String hostname) {
        boolean isCleartextTrafficPermitted;
        AbstractC2492i.m4915e(hostname, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }

    @Override // p036M1.C0389o
    /* renamed from: j */
    public final void mo1063j(Object obj, String message) {
        AbstractC2492i.m4915e(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.mo1063j(obj, message);
        } else {
            AbstractC2492i.m4913c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            AbstractC0375a.m1051c(obj).warnIfOpen();
        }
    }
}
