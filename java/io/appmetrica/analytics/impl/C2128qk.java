package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.qk */
/* loaded from: classes.dex */
public final class C2128qk {

    /* renamed from: a */
    public final C2107q f7002a;

    /* renamed from: b */
    public final C2238v5 f7003b;

    /* renamed from: c */
    public final C2053nk f7004c;

    /* renamed from: d */
    public final C2103pk f7005d;

    /* renamed from: e */
    public final C2157s f7006e;

    /* renamed from: f */
    public final C2007m f7007f;

    public C2128qk(C2107q c2107q, ICommonExecutor iCommonExecutor, C2007m c2007m) {
        this(c2107q, c2007m, new C2238v5(iCommonExecutor), new C2157s());
    }

    public C2128qk(C2107q c2107q, C2007m c2007m, C2238v5 c2238v5, C2157s c2157s) {
        this.f7002a = c2107q;
        this.f7007f = c2007m;
        this.f7003b = c2238v5;
        this.f7006e = c2157s;
        this.f7004c = new C2053nk(this);
        this.f7005d = new C2103pk(this);
    }
}
