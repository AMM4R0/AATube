package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.network.impl.a */
/* loaded from: classes.dex */
public final class C2391a extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ HttpsURLConnection f7674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2391a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f7674a = httpsURLConnection;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f7674a.getInputStream();
    }
}
