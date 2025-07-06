package p039N1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p036M1.AbstractC0387m;
import p036M1.C0380f;
import p036M1.C0389o;

/* renamed from: N1.h */
/* loaded from: classes.dex */
public final class C0399h implements InterfaceC0404m {

    /* renamed from: a */
    public static final C0398g f1066a = new C0398g();

    @Override // p039N1.InterfaceC0404m
    /* renamed from: a */
    public final boolean mo1141a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: b */
    public final String mo1142b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC2492i.m4911a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: c */
    public final boolean mo1143c() {
        boolean z2 = C0380f.f1029d;
        return C0380f.f1029d;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: d */
    public final void mo1144d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        if (mo1141a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C0389o c0389o = C0389o.f1050a;
            parameters.setApplicationProtocols((String[]) AbstractC0387m.m1108a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
