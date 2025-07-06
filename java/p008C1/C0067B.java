package p008C1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p011D1.AbstractC0115b;

/* renamed from: C1.B */
/* loaded from: classes.dex */
public final class C0067B {

    /* renamed from: a */
    public final C0069a f129a;

    /* renamed from: b */
    public final Proxy f130b;

    /* renamed from: c */
    public final InetSocketAddress f131c;

    public C0067B(C0069a c0069a, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC2492i.m4915e(socketAddress, "socketAddress");
        this.f129a = c0069a;
        this.f130b = proxy;
        this.f131c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0067B) {
            C0067B c0067b = (C0067B) obj;
            if (AbstractC2492i.m4911a(c0067b.f129a, this.f129a) && AbstractC2492i.m4911a(c0067b.f130b, this.f130b) && AbstractC2492i.m4911a(c0067b.f131c, this.f131c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f131c.hashCode() + ((this.f130b.hashCode() + ((this.f129a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C0085q c0085q = this.f129a.f147h;
        String str = c0085q.f242d;
        InetSocketAddress inetSocketAddress = this.f131c;
        InetAddress address = inetSocketAddress.getAddress();
        String m393b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC0115b.m393b(hostAddress);
        if (AbstractC0017j.m132J(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c0085q.f243e != inetSocketAddress.getPort() || str.equals(m393b)) {
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(c0085q.f243e);
        }
        if (!str.equals(m393b)) {
            if (this.f130b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (m393b == null) {
                sb.append("<unresolved>");
            } else if (AbstractC0017j.m132J(m393b, ':')) {
                sb.append("[");
                sb.append(m393b);
                sb.append("]");
            } else {
                sb.append(m393b);
            }
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(inetSocketAddress.getPort());
        }
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }
}
