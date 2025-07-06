package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.em */
/* loaded from: classes.dex */
public final class C1830em implements InterfaceC1598Vd {

    /* renamed from: a */
    public final Context f6162a;

    /* renamed from: b */
    public final String f6163b;

    /* renamed from: c */
    public final SafePackageManager f6164c;

    public C1830em(Context context) {
        this(context, context.getPackageName(), new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1598Vd
    /* renamed from: a */
    public final List<PermissionState> mo3418a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo packageInfo = this.f6164c.getPackageInfo(this.f6162a, this.f6163b, Base64Utils.IO_BUFFER_SIZE);
        if (packageInfo != null) {
            for (String str : packageInfo.requestedPermissions) {
                arrayList.add(new PermissionState(str, true));
            }
        }
        return arrayList;
    }

    public C1830em(Context context, String str, SafePackageManager safePackageManager) {
        this.f6162a = context;
        this.f6163b = str;
        this.f6164c = safePackageManager;
    }
}
