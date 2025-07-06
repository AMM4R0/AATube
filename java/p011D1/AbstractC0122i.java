package p011D1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p002A1.AbstractC0025r;
import p006C.C0055g;
import p008C1.C0083o;
import p008C1.C0085q;
import p008C1.C0088t;
import p008C1.C0094z;
import p027J1.C0244d;
import p051R1.C0477g;
import p051R1.InterfaceC0467D;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2660j;

/* renamed from: D1.i */
/* loaded from: classes.dex */
public abstract class AbstractC0122i {

    /* renamed from: a */
    public static final C0083o f368a = AbstractC0119f.f363b;

    /* renamed from: b */
    public static final TimeZone f369b;

    /* renamed from: c */
    public static final String f370c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC2492i.m4912b(timeZone);
        f369b = timeZone;
        String m142T = AbstractC0017j.m142T(C0088t.class.getName(), "okhttp3.");
        if (AbstractC0025r.m151D(m142T, "Client", false)) {
            m142T = m142T.substring(0, m142T.length() - 6);
            AbstractC2492i.m4914d(m142T, "substring(...)");
        }
        f370c = m142T;
    }

    /* renamed from: a */
    public static final boolean m411a(C0085q c0085q, C0085q other) {
        AbstractC2492i.m4915e(c0085q, "<this>");
        AbstractC2492i.m4915e(other, "other");
        return AbstractC2492i.m4911a(c0085q.f242d, other.f242d) && c0085q.f243e == other.f243e && AbstractC2492i.m4911a(c0085q.f239a, other.f239a);
    }

    /* renamed from: b */
    public static final void m412b(Socket socket) {
        AbstractC2492i.m4915e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!AbstractC2492i.m4911a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static final boolean m413c(InterfaceC0467D interfaceC0467D, TimeUnit timeUnit) {
        AbstractC2492i.m4915e(timeUnit, "timeUnit");
        try {
            return m417g(interfaceC0467D, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static final String m414d(String format, Object... objArr) {
        AbstractC2492i.m4915e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* renamed from: e */
    public static final long m415e(C0094z c0094z) {
        String m274a = c0094z.f320f.m274a("Content-Length");
        if (m274a == null) {
            return -1L;
        }
        byte[] bArr = AbstractC0119f.f362a;
        try {
            return Long.parseLong(m274a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: f */
    public static final List m416f(Object... elements) {
        AbstractC2492i.m4915e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(AbstractC2660j.m5120X(Arrays.copyOf(objArr, objArr.length)));
        AbstractC2492i.m4914d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    /* renamed from: g */
    public static final boolean m417g(InterfaceC0467D interfaceC0467D, int r12, TimeUnit timeUnit) {
        AbstractC2492i.m4915e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long mo1239c = interfaceC0467D.mo391d().mo1240e() ? interfaceC0467D.mo391d().mo1239c() - nanoTime : Long.MAX_VALUE;
        interfaceC0467D.mo391d().mo1234d(Math.min(mo1239c, timeUnit.toNanos(r12)) + nanoTime);
        try {
            C0477g c0477g = new C0477g();
            while (interfaceC0467D.mo390a(c0477g, 8192L) != -1) {
                c0477g.m1268t(c0477g.f1217b);
            }
            if (mo1239c == Long.MAX_VALUE) {
                interfaceC0467D.mo391d().mo1237a();
            } else {
                interfaceC0467D.mo391d().mo1234d(nanoTime + mo1239c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (mo1239c == Long.MAX_VALUE) {
                interfaceC0467D.mo391d().mo1237a();
            } else {
                interfaceC0467D.mo391d().mo1234d(nanoTime + mo1239c);
            }
            return false;
        } catch (Throwable th) {
            if (mo1239c == Long.MAX_VALUE) {
                interfaceC0467D.mo391d().mo1237a();
            } else {
                interfaceC0467D.mo391d().mo1234d(nanoTime + mo1239c);
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static final C0083o m418h(List list) {
        C0055g c0055g = new C0055g(2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0244d c0244d = (C0244d) it.next();
            AbstractC2480a.m4883e(c0055g, c0244d.f721a.m1279o(), c0244d.f722b.m1279o());
        }
        return c0055g.m218q();
    }

    /* renamed from: i */
    public static final String m419i(C0085q c0085q, boolean z2) {
        AbstractC2492i.m4915e(c0085q, "<this>");
        String str = c0085q.f242d;
        if (AbstractC0017j.m133K(str, StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            str = "[" + str + ']';
        }
        int r02 = c0085q.f243e;
        if (!z2) {
            String scheme = c0085q.f239a;
            AbstractC2492i.m4915e(scheme, "scheme");
            if (r02 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + r02;
    }

    /* renamed from: j */
    public static final List m420j(List list) {
        AbstractC2492i.m4915e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        AbstractC2492i.m4914d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
