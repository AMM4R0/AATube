package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.O4 */
/* loaded from: classes.dex */
public final class C1415O4 implements InterfaceC1065A4 {

    /* renamed from: a */
    public final Context f5148a;

    /* renamed from: b */
    public final C1489R4 f5149b;

    /* renamed from: c */
    public final ResultReceiver f5150c;

    public C1415O4(Context context, C1489R4 c1489r4, C1290J4 c1290j4) {
        this.f5148a = context;
        this.f5149b = c1489r4;
        this.f5150c = c1290j4.f4898c;
        c1489r4.m3250a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1065A4
    /* renamed from: a */
    public final void mo2692a(C1615W5 c1615w5, C1290J4 c1290j4) {
        this.f5149b.mo2828a(c1290j4.f4897b);
        this.f5149b.m3251a(c1615w5, this);
    }

    /* renamed from: b */
    public final C1489R4 m3147b() {
        return this.f5149b;
    }

    /* renamed from: c */
    public final Context m3148c() {
        return this.f5148a;
    }

    /* renamed from: d */
    public final ResultReceiver m3149d() {
        return this.f5150c;
    }

    /* renamed from: a */
    public final void m3146a(C2137r4 c2137r4) {
        ResultReceiverC1192F6.m2870a(this.f5150c, c2137r4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1065A4
    /* renamed from: a */
    public final void mo2691a() {
        this.f5149b.m3253b(this);
    }
}
