package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.b */
/* loaded from: classes.dex */
public final class C1018b extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4279a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f4280b;

    /* renamed from: c */
    public final /* synthetic */ int f4281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018b(Context context, ComponentName componentName, int r3) {
        super(0);
        this.f4279a = context;
        this.f4280b = componentName;
        this.f4281c = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f4279a.getPackageManager().getActivityInfo(this.f4280b, this.f4281c);
    }
}
