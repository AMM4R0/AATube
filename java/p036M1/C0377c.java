package p036M1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2492i;
import p045P1.InterfaceC0426d;

/* renamed from: M1.c */
/* loaded from: classes.dex */
public final class C0377c implements InterfaceC0426d {

    /* renamed from: a */
    public final X509TrustManager f1020a;

    /* renamed from: b */
    public final Method f1021b;

    public C0377c(X509TrustManager x509TrustManager, Method method) {
        this.f1020a = x509TrustManager;
        this.f1021b = method;
    }

    @Override // p045P1.InterfaceC0426d
    /* renamed from: a */
    public final X509Certificate mo1064a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f1021b.invoke(this.f1020a, x509Certificate);
            AbstractC2492i.m4913c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0377c)) {
            return false;
        }
        C0377c c0377c = (C0377c) obj;
        return AbstractC2492i.m4911a(this.f1020a, c0377c.f1020a) && AbstractC2492i.m4911a(this.f1021b, c0377c.f1021b);
    }

    public final int hashCode() {
        return this.f1021b.hashCode() + (this.f1020a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1020a + ", findByIssuerAndSignatureMethod=" + this.f1021b + ')';
    }
}
