package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.k */
/* loaded from: classes.dex */
public final class C1027k extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4303a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f4304b;

    /* renamed from: c */
    public final /* synthetic */ int f4305c;

    /* renamed from: d */
    public final /* synthetic */ int f4306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1027k(Context context, ComponentName componentName, int r3, int r4) {
        super(0);
        this.f4303a = context;
        this.f4304b = componentName;
        this.f4305c = r3;
        this.f4306d = r4;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        this.f4303a.getPackageManager().setComponentEnabledSetting(this.f4304b, this.f4305c, this.f4306d);
        return C2636g.f8557a;
    }
}
