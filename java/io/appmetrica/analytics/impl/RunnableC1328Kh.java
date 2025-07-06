package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Kh */
/* loaded from: classes.dex */
public final class RunnableC1328Kh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4965a;

    /* renamed from: b */
    public final /* synthetic */ List f4966b;

    /* renamed from: c */
    public final /* synthetic */ C1353Lh f4967c;

    public RunnableC1328Kh(C1353Lh c1353Lh, String str, List list) {
        this.f4967c = c1353Lh;
        this.f4965a = str;
        this.f4966b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4967c;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportEvent(this.f4965a, CollectionUtils.getMapFromList(this.f4966b));
    }
}
