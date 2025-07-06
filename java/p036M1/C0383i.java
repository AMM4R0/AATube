package p036M1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;
import org.conscrypt.Conscrypt;

/* renamed from: M1.i */
/* loaded from: classes.dex */
public final class C0383i extends C0389o {

    /* renamed from: d */
    public static final boolean f1032d;

    /* renamed from: c */
    public final Provider f1033c;

    static {
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC0381g.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC0381g.m1095a()) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1032d = z2;
    }

    public C0383i() {
        Provider newProvider = Conscrypt.newProvider();
        AbstractC2492i.m4914d(newProvider, "newProvider(...)");
        this.f1033c = newProvider;
    }

    @Override // p036M1.C0389o
    /* renamed from: d */
    public final void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo1059d(sSLSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) AbstractC0387m.m1108a(protocols).toArray(new String[0]));
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: f */
    public final String mo1060f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p036M1.C0389o
    /* renamed from: k */
    public final SSLContext mo1093k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1033c);
        AbstractC2492i.m4914d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // p036M1.C0389o
    /* renamed from: l */
    public final SSLSocketFactory mo1097l(X509TrustManager x509TrustManager) {
        SSLContext mo1093k = mo1093k();
        mo1093k.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = mo1093k.getSocketFactory();
        AbstractC2492i.m4914d(socketFactory, "getSocketFactory(...)");
        return socketFactory;
    }

    @Override // p036M1.C0389o
    /* renamed from: m */
    public final X509TrustManager mo1094m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC2492i.m4912b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC2492i.m4913c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C0382h.f1031a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC2492i.m4914d(arrays, "toString(...)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
