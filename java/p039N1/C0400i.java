package p039N1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p036M1.AbstractC0381g;
import p036M1.C0383i;

/* renamed from: N1.i */
/* loaded from: classes.dex */
public final class C0400i implements InterfaceC0402k {
    @Override // p039N1.InterfaceC0402k
    /* renamed from: a */
    public final boolean mo1147a(SSLSocket sSLSocket) {
        boolean z2 = C0383i.f1032d;
        return AbstractC0381g.m1096b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p039N1.InterfaceC0402k
    /* renamed from: b */
    public final InterfaceC0404m mo1148b(SSLSocket sSLSocket) {
        return new C0401j();
    }
}
