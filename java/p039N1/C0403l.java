package p039N1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: N1.l */
/* loaded from: classes.dex */
public final class C0403l implements InterfaceC0404m {

    /* renamed from: a */
    public final InterfaceC0402k f1068a;

    /* renamed from: b */
    public InterfaceC0404m f1069b;

    public C0403l(InterfaceC0402k interfaceC0402k) {
        this.f1068a = interfaceC0402k;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: a */
    public final boolean mo1141a(SSLSocket sSLSocket) {
        return this.f1068a.mo1147a(sSLSocket);
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: b */
    public final String mo1142b(SSLSocket sSLSocket) {
        InterfaceC0404m m1149e = m1149e(sSLSocket);
        if (m1149e != null) {
            return m1149e.mo1142b(sSLSocket);
        }
        return null;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: c */
    public final boolean mo1143c() {
        return true;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: d */
    public final void mo1144d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        InterfaceC0404m m1149e = m1149e(sSLSocket);
        if (m1149e != null) {
            m1149e.mo1144d(sSLSocket, str, protocols);
        }
    }

    /* renamed from: e */
    public final synchronized InterfaceC0404m m1149e(SSLSocket sSLSocket) {
        try {
            if (this.f1069b == null && this.f1068a.mo1147a(sSLSocket)) {
                this.f1069b = this.f1068a.mo1148b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1069b;
    }
}
