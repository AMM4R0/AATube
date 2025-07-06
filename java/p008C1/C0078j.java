package p008C1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import p011D1.AbstractC0119f;
import p108m1.AbstractC2660j;
import p114o1.C2696a;

/* renamed from: C1.j */
/* loaded from: classes.dex */
public final class C0078j {

    /* renamed from: e */
    public static final C0078j f199e;

    /* renamed from: f */
    public static final C0078j f200f;

    /* renamed from: a */
    public final boolean f201a;

    /* renamed from: b */
    public final boolean f202b;

    /* renamed from: c */
    public final String[] f203c;

    /* renamed from: d */
    public final String[] f204d;

    static {
        C0075g c0075g = C0075g.f191r;
        C0075g c0075g2 = C0075g.f192s;
        C0075g c0075g3 = C0075g.f193t;
        C0075g c0075g4 = C0075g.f185l;
        C0075g c0075g5 = C0075g.f187n;
        C0075g c0075g6 = C0075g.f186m;
        C0075g c0075g7 = C0075g.f188o;
        C0075g c0075g8 = C0075g.f190q;
        C0075g c0075g9 = C0075g.f189p;
        List m5120X = AbstractC2660j.m5120X(c0075g, c0075g2, c0075g3, c0075g4, c0075g5, c0075g6, c0075g7, c0075g8, c0075g9);
        List m5120X2 = AbstractC2660j.m5120X(c0075g, c0075g2, c0075g3, c0075g4, c0075g5, c0075g6, c0075g7, c0075g8, c0075g9, C0075g.f183j, C0075g.f184k, C0075g.f181h, C0075g.f182i, C0075g.f179f, C0075g.f180g, C0075g.f178e);
        C0077i c0077i = new C0077i();
        C0075g[] c0075gArr = (C0075g[]) m5120X.toArray(new C0075g[0]);
        c0077i.m258b((C0075g[]) Arrays.copyOf(c0075gArr, c0075gArr.length));
        EnumC0068C enumC0068C = EnumC0068C.TLS_1_3;
        EnumC0068C enumC0068C2 = EnumC0068C.TLS_1_2;
        c0077i.m260d(enumC0068C, enumC0068C2);
        if (!c0077i.f195a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0077i.f196b = true;
        c0077i.m257a();
        C0077i c0077i2 = new C0077i();
        C0075g[] c0075gArr2 = (C0075g[]) m5120X2.toArray(new C0075g[0]);
        c0077i2.m258b((C0075g[]) Arrays.copyOf(c0075gArr2, c0075gArr2.length));
        c0077i2.m260d(enumC0068C, enumC0068C2);
        if (!c0077i2.f195a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0077i2.f196b = true;
        f199e = c0077i2.m257a();
        C0077i c0077i3 = new C0077i();
        C0075g[] c0075gArr3 = (C0075g[]) m5120X2.toArray(new C0075g[0]);
        c0077i3.m258b((C0075g[]) Arrays.copyOf(c0075gArr3, c0075gArr3.length));
        c0077i3.m260d(enumC0068C, enumC0068C2, EnumC0068C.TLS_1_1, EnumC0068C.TLS_1_0);
        if (!c0077i3.f195a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0077i3.f196b = true;
        c0077i3.m257a();
        f200f = new C0078j(false, false, null, null);
    }

    public C0078j(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f201a = z2;
        this.f202b = z3;
        this.f203c = strArr;
        this.f204d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: a */
    public final void m262a(SSLSocket sSLSocket, boolean z2) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        AbstractC2492i.m4912b(enabledCipherSuites);
        String[] strArr = this.f203c;
        if (strArr != null) {
            enabledCipherSuites = AbstractC0119f.m403i(strArr, enabledCipherSuites, C0075g.f176c);
        }
        ?? r2 = this.f204d;
        if (r2 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC2492i.m4914d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = AbstractC0119f.m403i(enabledProtocols2, r2, C2696a.f8690b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC2492i.m4912b(supportedCipherSuites);
        C0074f c0074f = C0075g.f176c;
        byte[] bArr = AbstractC0119f.f362a;
        int length = supportedCipherSuites.length;
        int r7 = 0;
        while (true) {
            if (r7 >= length) {
                r7 = -1;
                break;
            } else if (c0074f.compare(supportedCipherSuites[r7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                r7++;
            }
        }
        if (z2 && r7 != -1) {
            String str = supportedCipherSuites[r7];
            AbstractC2492i.m4914d(str, "get(...)");
            AbstractC2492i.m4915e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC2492i.m4914d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C0077i c0077i = new C0077i();
        c0077i.f195a = this.f201a;
        c0077i.f197c = strArr;
        c0077i.f198d = r2;
        c0077i.f196b = this.f202b;
        c0077i.m259c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC2492i.m4912b(enabledProtocols);
        c0077i.m261e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C0078j m257a = c0077i.m257a();
        if (m257a.m264c() != null) {
            sSLSocket.setEnabledProtocols(m257a.f204d);
        }
        if (m257a.m263b() != null) {
            sSLSocket.setEnabledCipherSuites(m257a.f203c);
        }
    }

    /* renamed from: b */
    public final ArrayList m263b() {
        String[] strArr = this.f203c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0075g.f175b.m255b(str));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList m264c() {
        String[] strArr = this.f204d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            EnumC0068C.f132b.getClass();
            arrayList.add(C0070b.m253c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0078j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0078j c0078j = (C0078j) obj;
        boolean z2 = c0078j.f201a;
        boolean z3 = this.f201a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f203c, c0078j.f203c) && Arrays.equals(this.f204d, c0078j.f204d) && this.f202b == c0078j.f202b);
    }

    public final int hashCode() {
        if (!this.f201a) {
            return 17;
        }
        String[] strArr = this.f203c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f204d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f202b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f201a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m263b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m264c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f202b + ')';
    }
}
