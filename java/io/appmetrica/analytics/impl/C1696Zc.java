package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.Zc */
/* loaded from: classes.dex */
public final class C1696Zc extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: a */
    public final /* synthetic */ C1769cb f5804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1696Zc(C1769cb c1769cb) {
        super(1);
        this.f5804a = c1769cb;
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        C1348Lc c1348Lc = (C1348Lc) ((Map.Entry) obj).getValue();
        return c1348Lc.f5000b.parse(this.f5804a);
    }
}
