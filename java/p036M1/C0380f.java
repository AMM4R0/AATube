package p036M1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: M1.f */
/* loaded from: classes.dex */
public final class C0380f extends C0389o {

    /* renamed from: d */
    public static final boolean f1029d;

    /* renamed from: c */
    public final Provider f1030c = new BouncyCastleJsseProvider();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC0379e.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f1029d = z2;
    }

    @Override // p036M1.C0389o
    /* renamed from: d */
    public final void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        super.mo1059d(sSLSocket, str, protocols);
    }

    @Override // p036M1.C0389o
    /* renamed from: f */
    public final String mo1060f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p036M1.C0389o
    /* renamed from: k */
    public final SSLContext mo1093k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1030c);
        AbstractC2492i.m4914d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // p036M1.C0389o
    /* renamed from: m */
    public final X509TrustManager mo1094m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC2492i.m4912b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC2492i.m4913c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC2492i.m4914d(arrays, "toString(...)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
