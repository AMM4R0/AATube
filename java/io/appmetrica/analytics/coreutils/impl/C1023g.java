package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.g */
/* loaded from: classes.dex */
public final class C1023g extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4293a;

    /* renamed from: b */
    public final /* synthetic */ String f4294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023g(Context context, String str) {
        super(0);
        this.f4293a = context;
        this.f4294b = str;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        return Boolean.valueOf(this.f4293a.getPackageManager().hasSystemFeature(this.f4294b));
    }
}
