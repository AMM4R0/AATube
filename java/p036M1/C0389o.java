package p036M1;

import android.support.v4.media.session.AbstractC0580g;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;
import p045P1.C0423a;
import p045P1.C0424b;
import p045P1.InterfaceC0426d;

/* renamed from: M1.o */
/* loaded from: classes.dex */
public class C0389o {

    /* renamed from: a */
    public static volatile C0389o f1050a;

    /* renamed from: b */
    public static final Logger f1051b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
    
        if (java.lang.Integer.parseInt(r4) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    static {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p036M1.C0389o.<clinit>():void");
    }

    /* renamed from: i */
    public static void m1140i(String message, int r2, Throwable th) {
        AbstractC2492i.m4915e(message, "message");
        f1051b.log(r2 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: b */
    public AbstractC0580g mo1058b(X509TrustManager x509TrustManager) {
        return new C0423a(mo1065c(x509TrustManager));
    }

    /* renamed from: c */
    public InterfaceC0426d mo1065c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC2492i.m4914d(acceptedIssuers, "getAcceptedIssuers(...)");
        return new C0424b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
    }

    /* renamed from: e */
    public void mo1066e(Socket socket, InetSocketAddress address, int r4) {
        AbstractC2492i.m4915e(address, "address");
        socket.connect(address, r4);
    }

    /* renamed from: f */
    public String mo1060f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo1061g() {
        if (f1051b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo1062h(String hostname) {
        AbstractC2492i.m4915e(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo1063j(Object obj, String message) {
        AbstractC2492i.m4915e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m1140i(message, 5, (Throwable) obj);
    }

    /* renamed from: k */
    public SSLContext mo1093k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC2492i.m4914d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    /* renamed from: l */
    public SSLSocketFactory mo1097l(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo1093k = mo1093k();
            mo1093k.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = mo1093k.getSocketFactory();
            AbstractC2492i.m4914d(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    /* renamed from: m */
    public X509TrustManager mo1094m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo1098a(SSLSocket sSLSocket) {
    }
}
