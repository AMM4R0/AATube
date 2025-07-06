package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.impl.Un */
/* loaded from: classes.dex */
public final class C1583Un implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f5552a;

    public C1583Un(String str) {
        this.f5552a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C2123qf c2123qf = (C2123qf) obj;
        if (c2123qf.f5471b) {
            c2123qf.m3358a(5, this.f5552a);
        }
    }
}
