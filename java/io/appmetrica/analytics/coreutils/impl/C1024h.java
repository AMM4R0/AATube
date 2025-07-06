package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.h */
/* loaded from: classes.dex */
public final class C1024h extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4295a;

    /* renamed from: b */
    public final /* synthetic */ Intent f4296b;

    /* renamed from: c */
    public final /* synthetic */ int f4297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024h(Context context, Intent intent, int r3) {
        super(0);
        this.f4295a = context;
        this.f4296b = intent;
        this.f4297c = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f4295a.getPackageManager().resolveActivity(this.f4296b, this.f4297c);
    }
}
