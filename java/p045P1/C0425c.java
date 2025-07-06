package p045P1;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p108m1.C2668r;

/* renamed from: P1.c */
/* loaded from: classes.dex */
public final class C0425c implements HostnameVerifier {

    /* renamed from: a */
    public static final C0425c f1099a = new C0425c();

    /* renamed from: a */
    public static List m1158a(X509Certificate x509Certificate, int r6) {
        Object obj;
        C2668r c2668r = C2668r.f8607a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c2668r;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC2492i.m4911a(list.get(0), Integer.valueOf(r6)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c2668r;
        }
    }

    /* renamed from: b */
    public static boolean m1159b(String str) {
        int r6;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m13h("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int r5 = 0;
        while (r5 < length2) {
            char charAt = str.charAt(r5);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    r6 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    r6 = 3;
                } else {
                    int r10 = r5 + 1;
                    char charAt2 = r10 < length2 ? str.charAt(r10) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        r5 = r10;
                    } else {
                        j2 += 4;
                        r5 += 2;
                    }
                }
                j2 += r6;
            }
            r5++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x006e->B:54:?, LOOP_END, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1160c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p045P1.C0425c.m1160c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        AbstractC2492i.m4915e(host, "host");
        AbstractC2492i.m4915e(session, "session");
        if (!m1159b(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC2492i.m4913c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m1160c(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
