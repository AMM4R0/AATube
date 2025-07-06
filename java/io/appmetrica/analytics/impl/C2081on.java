package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.on */
/* loaded from: classes.dex */
public final class C2081on extends AbstractC2249vg {
    public C2081on(C2013m5 c2013m5) {
        super(c2013m5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        String m4624i = this.f7308a.f6688c.m4624i();
        String str = c1615w5.f5628h;
        this.f7308a.f6688c.m4625j(str).m4658b();
        if (TextUtils.equals(m4624i, str)) {
            return false;
        }
        this.f7308a.mo3169a(C1987l4.m4084o());
        return false;
    }
}
