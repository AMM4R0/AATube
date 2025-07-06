package p039N1;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0008a;
import p036M1.AbstractC0387m;
import p036M1.C0378d;
import p036M1.C0389o;

/* renamed from: N1.f */
/* loaded from: classes.dex */
public class C0397f implements InterfaceC0404m {

    /* renamed from: f */
    public static final C0396e f1060f = new C0396e();

    /* renamed from: a */
    public final Class f1061a;

    /* renamed from: b */
    public final Method f1062b;

    /* renamed from: c */
    public final Method f1063c;

    /* renamed from: d */
    public final Method f1064d;

    /* renamed from: e */
    public final Method f1065e;

    public C0397f(Class cls) {
        this.f1061a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC2492i.m4914d(declaredMethod, "getDeclaredMethod(...)");
        this.f1062b = declaredMethod;
        this.f1063c = cls.getMethod("setHostname", String.class);
        this.f1064d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1065e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: a */
    public final boolean mo1141a(SSLSocket sSLSocket) {
        return this.f1061a.isInstance(sSLSocket);
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: b */
    public final String mo1142b(SSLSocket sSLSocket) {
        if (!this.f1061a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1064d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC0008a.f6a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && AbstractC2492i.m4911a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: c */
    public final boolean mo1143c() {
        boolean z2 = C0378d.f1022d;
        return C0378d.f1022d;
    }

    @Override // p039N1.InterfaceC0404m
    /* renamed from: d */
    public final void mo1144d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        if (this.f1061a.isInstance(sSLSocket)) {
            try {
                this.f1062b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.f1063c.invoke(sSLSocket, str);
                }
                Method method = this.f1065e;
                C0389o c0389o = C0389o.f1050a;
                method.invoke(sSLSocket, AbstractC0387m.m1113k(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
