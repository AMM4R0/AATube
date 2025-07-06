package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rm */
/* loaded from: classes.dex */
public final class C2155rm extends AbstractC1811e3 {
    public C2155rm(int r2, String str) {
        this(r2, str, C2123qf.m4356c());
    }

    /* renamed from: b */
    public final int m4405b() {
        return this.f6117a;
    }

    public C2155rm(int r12, String str, C2123qf c2123qf) {
        super(r12, str, c2123qf);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1706Zm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String mo2687a(String str) {
        if (str != null) {
            int length = str.length();
            int r2 = this.f6117a;
            if (length > r2) {
                String substring = str.substring(0, r2);
                if (this.f6119c.f5471b) {
                    this.f6119c.m3359a(5, "\"%s\" %s size exceeded limit of %d characters", this.f6118b, str, Integer.valueOf(this.f6117a));
                }
                return substring;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String m4403a() {
        return this.f6118b;
    }
}
