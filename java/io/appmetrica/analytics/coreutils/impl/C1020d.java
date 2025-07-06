package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.internal.AbstractC2493j;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.coreutils.impl.d */
/* loaded from: classes.dex */
public final class C1020d extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: a */
    public final /* synthetic */ Context f4285a;

    /* renamed from: b */
    public final /* synthetic */ String f4286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1020d(Context context, String str) {
        super(0);
        this.f4285a = context;
        this.f4286b = str;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        PackageManager packageManager = this.f4285a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f4286b) : packageManager.getInstallerPackageName(this.f4286b);
    }
}
