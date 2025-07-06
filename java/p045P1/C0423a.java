package p045P1;

import android.support.v4.media.session.AbstractC0580g;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: P1.a */
/* loaded from: classes.dex */
public final class C0423a extends AbstractC0580g {

    /* renamed from: e */
    public final InterfaceC0426d f1097e;

    public C0423a(InterfaceC0426d trustRootIndex) {
        AbstractC2492i.m4915e(trustRootIndex, "trustRootIndex");
        this.f1097e = trustRootIndex;
    }

    /* renamed from: B */
    public static boolean m1157B(X509Certificate x509Certificate, X509Certificate x509Certificate2, int r4) {
        if (!AbstractC2492i.m4911a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < r4) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0423a) && AbstractC2492i.m4911a(((C0423a) obj).f1097e, this.f1097e);
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: h */
    public final List mo1145h(List chain, String hostname) {
        AbstractC2492i.m4915e(chain, "chain");
        AbstractC2492i.m4915e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        AbstractC2492i.m4914d(removeFirst, "removeFirst(...)");
        arrayList.add(removeFirst);
        boolean z2 = false;
        for (int r02 = 0; r02 < 9; r02++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC2492i.m4913c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate mo1064a = this.f1097e.mo1064a(x509Certificate);
            if (mo1064a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC2492i.m4914d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC2492i.m4913c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m1157B(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(mo1064a)) {
                arrayList.add(mo1064a);
            }
            if (m1157B(mo1064a, mo1064a, arrayList.size() - 2)) {
                return arrayList;
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f1097e.hashCode();
    }
}
