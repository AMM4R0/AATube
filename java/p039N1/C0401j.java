package p039N1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import org.conscrypt.Conscrypt;
import p036M1.AbstractC0387m;
import p036M1.C0383i;
import p036M1.C0389o;

/* renamed from: N1.j */
/* loaded from: classes.dex */
public final class C0401j implements InterfaceC0404m {

    /* renamed from: a */
    public static final C0400i f1067a = new C0400i();

    @Override // p039N1.InterfaceC0404m
    /* renamed from: a */
    public final boolean mo1141a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: b */
    public final String mo1142b(SSLSocket sSLSocket) {
        if (mo1141a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: c */
    public final boolean mo1143c() {
        boolean z2 = C0383i.f1032d;
        return C0383i.f1032d;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: d */
    public final void mo1144d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        if (mo1141a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C0389o c0389o = C0389o.f1050a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) AbstractC0387m.m1108a(protocols).toArray(new String[0]));
        }
    }
}
