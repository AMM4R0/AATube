package p039N1;

import android.net.http.X509TrustManagerExtensions;
import android.support.v4.media.session.AbstractC0580g;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: N1.b */
/* loaded from: classes.dex */
public final class C0393b extends AbstractC0580g {

    /* renamed from: e */
    public final X509TrustManager f1055e;

    /* renamed from: f */
    public final X509TrustManagerExtensions f1056f;

    public C0393b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1055e = x509TrustManager;
        this.f1056f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0393b) && ((C0393b) obj).f1055e == this.f1055e;
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: h */
    public final List mo1145h(List chain, String hostname) {
        AbstractC2492i.m4915e(chain, "chain");
        AbstractC2492i.m4915e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f1056f.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC2492i.m4914d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1055e);
    }
}
