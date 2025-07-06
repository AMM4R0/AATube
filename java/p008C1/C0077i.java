package p008C1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: C1.i */
/* loaded from: classes.dex */
public final class C0077i {

    /* renamed from: a */
    public boolean f195a = true;

    /* renamed from: b */
    public boolean f196b;

    /* renamed from: c */
    public Object f197c;

    /* renamed from: d */
    public Serializable f198d;

    /* renamed from: a */
    public C0078j m257a() {
        return new C0078j(this.f195a, this.f196b, (String[]) this.f197c, (String[]) this.f198d);
    }

    /* renamed from: b */
    public void m258b(C0075g... cipherSuites) {
        AbstractC2492i.m4915e(cipherSuites, "cipherSuites");
        if (!this.f195a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C0075g c0075g : cipherSuites) {
            arrayList.add(c0075g.f194a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m259c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public void m259c(String... cipherSuites) {
        AbstractC2492i.m4915e(cipherSuites, "cipherSuites");
        if (!this.f195a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] copyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        AbstractC2492i.m4914d(copyOf, "copyOf(...)");
        this.f197c = (String[]) copyOf;
    }

    /* renamed from: d */
    public void m260d(EnumC0068C... enumC0068CArr) {
        if (!this.f195a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC0068CArr.length);
        for (EnumC0068C enumC0068C : enumC0068CArr) {
            arrayList.add(enumC0068C.f139a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m261e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: e */
    public void m261e(String... tlsVersions) {
        AbstractC2492i.m4915e(tlsVersions, "tlsVersions");
        if (!this.f195a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] copyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        AbstractC2492i.m4914d(copyOf, "copyOf(...)");
        this.f198d = (String[]) copyOf;
    }
}
