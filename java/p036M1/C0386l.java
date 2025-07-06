package p036M1;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.EnumC0089u;
import p108m1.AbstractC2661k;

/* renamed from: M1.l */
/* loaded from: classes.dex */
public final class C0386l extends C0389o {

    /* renamed from: c */
    public static final boolean f1042c;

    /* renamed from: d */
    public static final Integer f1043d;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Integer r0 = p002A1.AbstractC0024q.m150C(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            p036M1.C0386l.f1043d = r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L27
        L1d:
            r2 = r3
            goto L27
        L1f:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L1d
        L27:
            p036M1.C0386l.f1042c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036M1.C0386l.<clinit>():void");
    }

    @Override // p036M1.C0389o
    /* renamed from: d */
    public final void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((EnumC0089u) obj) != EnumC0089u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2661k.m5122Z(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0089u) it.next()).f286a);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p036M1.C0389o
    /* renamed from: f */
    public final String mo1060f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: k */
    public final SSLContext mo1093k() {
        SSLContext sSLContext;
        Integer num = f1043d;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            AbstractC2492i.m4914d(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        AbstractC2492i.m4912b(sSLContext);
        return sSLContext;
    }
}
