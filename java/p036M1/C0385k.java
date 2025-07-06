package p036M1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.EnumC0089u;
import p108m1.AbstractC2661k;

/* renamed from: M1.k */
/* loaded from: classes.dex */
public final class C0385k extends C0389o {

    /* renamed from: c */
    public final Method f1037c;

    /* renamed from: d */
    public final Method f1038d;

    /* renamed from: e */
    public final Method f1039e;

    /* renamed from: f */
    public final Class f1040f;

    /* renamed from: g */
    public final Class f1041g;

    public C0385k(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f1037c = method;
        this.f1038d = method2;
        this.f1039e = method3;
        this.f1040f = cls;
        this.f1041g = cls2;
    }

    @Override // p036M1.C0389o
    /* renamed from: a */
    public final void mo1098a(SSLSocket sSLSocket) {
        try {
            this.f1039e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: d */
    public final void mo1059d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
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
        try {
            this.f1037c.invoke(null, sSLSocket, Proxy.newProxyInstance(C0389o.class.getClassLoader(), new Class[]{this.f1040f, this.f1041g}, new C0384j(arrayList2)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // p036M1.C0389o
    /* renamed from: f */
    public final String mo1060f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f1038d.invoke(null, sSLSocket));
            AbstractC2492i.m4913c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C0384j c0384j = (C0384j) invocationHandler;
            boolean z2 = c0384j.f1035b;
            if (!z2 && c0384j.f1036c == null) {
                C0389o.m1140i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return c0384j.f1036c;
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
