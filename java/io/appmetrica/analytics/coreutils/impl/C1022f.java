package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.f */
/* loaded from: classes.dex */
public final class C1022f extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4290a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f4291b;

    /* renamed from: c */
    public final /* synthetic */ int f4292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022f(Context context, ComponentName componentName, int r3) {
        super(0);
        this.f4290a = context;
        this.f4291b = componentName;
        this.f4292c = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f4290a.getPackageManager().getServiceInfo(this.f4291b, this.f4292c);
    }
}
