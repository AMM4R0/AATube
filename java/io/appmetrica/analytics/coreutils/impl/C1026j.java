package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.j */
/* loaded from: classes.dex */
public final class C1026j extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4300a;

    /* renamed from: b */
    public final /* synthetic */ Intent f4301b;

    /* renamed from: c */
    public final /* synthetic */ int f4302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026j(Context context, Intent intent, int r3) {
        super(0);
        this.f4300a = context;
        this.f4301b = intent;
        this.f4302c = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f4300a.getPackageManager().resolveService(this.f4301b, this.f4302c);
    }
}
