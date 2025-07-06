package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.i */
/* loaded from: classes.dex */
public final class C1025i extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4298a;

    /* renamed from: b */
    public final /* synthetic */ String f4299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025i(Context context, String str) {
        super(0);
        this.f4298a = context;
        this.f4299b = str;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        PackageManager packageManager = this.f4298a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f4299b) : packageManager.resolveContentProvider(this.f4299b, 128);
    }
}
