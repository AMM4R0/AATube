package p130u0;

import java.util.Arrays;
import p010D0.C0113k;
import p127t0.InterfaceC2765b;
import p133v0.AbstractC2863r;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C2777a {

    /* renamed from: a */
    public final int f9074a;

    /* renamed from: b */
    public final C0113k f9075b;

    /* renamed from: c */
    public final InterfaceC2765b f9076c;

    /* renamed from: d */
    public final String f9077d;

    public C2777a(C0113k c0113k, InterfaceC2765b interfaceC2765b, String str) {
        this.f9075b = c0113k;
        this.f9076c = interfaceC2765b;
        this.f9077d = str;
        this.f9074a = Arrays.hashCode(new Object[]{c0113k, interfaceC2765b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2777a)) {
            return false;
        }
        C2777a c2777a = (C2777a) obj;
        return AbstractC2863r.m5476e(this.f9075b, c2777a.f9075b) && AbstractC2863r.m5476e(this.f9076c, c2777a.f9076c) && AbstractC2863r.m5476e(this.f9077d, c2777a.f9077d);
    }

    public final int hashCode() {
        return this.f9074a;
    }
}
