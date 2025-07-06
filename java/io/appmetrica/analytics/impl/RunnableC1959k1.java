package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.k1 */
/* loaded from: classes.dex */
public final class RunnableC1959k1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6553a;

    /* renamed from: b */
    public final /* synthetic */ List f6554b;

    /* renamed from: c */
    public final /* synthetic */ C2009m1 f6555c;

    public RunnableC1959k1(C2009m1 c2009m1, String str, List list) {
        this.f6555c = c2009m1;
        this.f6553a = str;
        this.f6554b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f6555c).reportEvent(this.f6553a, CollectionUtils.getMapFromList(this.f6554b));
    }
}
