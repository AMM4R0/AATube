package p008C1;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p105l1.C2634e;
import p108m1.AbstractC2661k;
import p131u1.InterfaceC2799a;

/* renamed from: C1.n */
/* loaded from: classes.dex */
public final class C0082n {

    /* renamed from: a */
    public final EnumC0068C f225a;

    /* renamed from: b */
    public final C0075g f226b;

    /* renamed from: c */
    public final List f227c;

    /* renamed from: d */
    public final C2634e f228d;

    public C0082n(EnumC0068C enumC0068C, C0075g c0075g, List list, InterfaceC2799a interfaceC2799a) {
        this.f225a = enumC0068C;
        this.f226b = c0075g;
        this.f227c = list;
        this.f228d = new C2634e(new C0081m(interfaceC2799a));
    }

    /* renamed from: a */
    public final List m273a() {
        return (List) this.f228d.m5093a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0082n) {
            C0082n c0082n = (C0082n) obj;
            if (c0082n.f225a == this.f225a && AbstractC2492i.m4911a(c0082n.f226b, this.f226b) && AbstractC2492i.m4911a(c0082n.m273a(), m273a()) && AbstractC2492i.m4911a(c0082n.f227c, this.f227c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f227c.hashCode() + ((m273a().hashCode() + ((this.f226b.hashCode() + ((this.f225a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> m273a = m273a();
        ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(m273a));
        for (Certificate certificate : m273a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC2492i.m4914d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f225a);
        sb.append(" cipherSuite=");
        sb.append(this.f226b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f227c;
        ArrayList arrayList2 = new ArrayList(AbstractC2661k.m5122Z(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC2492i.m4914d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
