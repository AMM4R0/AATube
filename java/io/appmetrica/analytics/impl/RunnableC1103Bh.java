package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Bh */
/* loaded from: classes.dex */
public final class RunnableC1103Bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4533a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f4534b;

    /* renamed from: c */
    public final /* synthetic */ C1353Lh f4535c;

    public RunnableC1103Bh(C1353Lh c1353Lh, String str, byte[] bArr) {
        this.f4535c = c1353Lh;
        this.f4533a = str;
        this.f4534b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4535c;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).setSessionExtra(this.f4533a, this.f4534b);
    }
}
