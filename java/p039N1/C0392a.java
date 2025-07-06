package p039N1;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import p036M1.AbstractC0387m;
import p036M1.C0389o;

/* renamed from: N1.a */
/* loaded from: classes.dex */
public final class C0392a implements InterfaceC0404m {
    @Override // p039N1.InterfaceC0404m
    /* renamed from: a */
    public final boolean mo1141a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: b */
    public final String mo1142b(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: c */
    public final boolean mo1143c() {
        C0389o c0389o = C0389o.f1050a;
        return AbstractC0387m.m1127z() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: d */
    public final void mo1144d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C0389o c0389o = C0389o.f1050a;
            sSLParameters.setApplicationProtocols((String[]) AbstractC0387m.m1108a(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
