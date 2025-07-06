package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.zg */
/* loaded from: classes.dex */
public final class C2349zg implements Consumer {

    /* renamed from: a */
    public final C2258w0 f7526a;

    /* renamed from: b */
    public final Function f7527b;

    /* renamed from: c */
    public final /* synthetic */ C1077Ag f7528c;

    public C2349zg(C1077Ag c1077Ag, C2258w0 c2258w0, Function<String, C1615W5> function) {
        this.f7528c = c1077Ag;
        this.f7526a = c2258w0;
        this.f7527b = function;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        C1077Ag c1077Ag = this.f7528c;
        C2258w0 c2258w0 = this.f7526a;
        String str2 = c2258w0.f7323a;
        String str3 = c2258w0.f7324b;
        int r9 = c2258w0.f7326d;
        Integer valueOf = Integer.valueOf(r9);
        C2258w0 c2258w02 = this.f7526a;
        String str4 = c2258w02.f7327e;
        C2062o4 c2062o4 = new C2062o4(str2, str3, valueOf, str4, c2258w02.f7325c);
        C1615W5 c1615w5 = (C1615W5) this.f7527b.apply(str);
        C1290J4 c1290j4 = new C1290J4(new C2179sl(), new C1265I4(), null);
        c1077Ag.f4483c.m4596a(c2062o4, c1290j4).mo2692a(c1615w5, c1290j4);
        c1077Ag.f4483c.m4597a(r9, str3, str4);
    }
}
