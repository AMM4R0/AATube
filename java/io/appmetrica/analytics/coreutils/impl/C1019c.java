package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.c */
/* loaded from: classes.dex */
public final class C1019c extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4282a;

    /* renamed from: b */
    public final /* synthetic */ String f4283b;

    /* renamed from: c */
    public final /* synthetic */ int f4284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019c(Context context, String str, int r3) {
        super(0);
        this.f4282a = context;
        this.f4283b = str;
        this.f4284c = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f4282a.getPackageManager().getApplicationInfo(this.f4283b, this.f4284c);
    }
}
