package p045P1;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: P1.b */
/* loaded from: classes.dex */
public final class C0424b implements InterfaceC0426d {

    /* renamed from: a */
    public final LinkedHashMap f1098a;

    public C0424b(X509Certificate... caCerts) {
        AbstractC2492i.m4915e(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            AbstractC2492i.m4914d(subjectX500Principal, "getSubjectX500Principal(...)");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f1098a = linkedHashMap;
    }

    @Override // p045P1.InterfaceC0426d
    /* renamed from: a */
    public final X509Certificate mo1064a(X509Certificate x509Certificate) {
        Set set = (Set) this.f1098a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0424b) && AbstractC2492i.m4911a(((C0424b) obj).f1098a, this.f1098a));
    }

    public final int hashCode() {
        return this.f1098a.hashCode();
    }
}
