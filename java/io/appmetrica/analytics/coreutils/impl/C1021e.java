package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.e */
/* loaded from: classes.dex */
public final class C1021e extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4287a;

    /* renamed from: b */
    public final /* synthetic */ String f4288b;

    /* renamed from: c */
    public final /* synthetic */ int f4289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021e(Context context, String str, int r3) {
        super(0);
        this.f4287a = context;
        this.f4288b = str;
        this.f4289c = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return this.f4287a.getPackageManager().getPackageInfo(this.f4288b, this.f4289c);
    }
}
