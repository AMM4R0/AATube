package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.si */
/* loaded from: classes.dex */
public final class C2176si implements InterfaceC1598Vd {

    /* renamed from: a */
    public final Context f7130a;

    /* renamed from: b */
    public final SafePackageManager f7131b;

    public C2176si(Context context, SafePackageManager safePackageManager) {
        this.f7130a = context;
        this.f7131b = safePackageManager;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1598Vd
    /* renamed from: a */
    public final List mo3418a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f7131b;
        Context context = this.f7130a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), Base64Utils.IO_BUFFER_SIZE);
        if (packageInfo == null) {
            return arrayList;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] r12 = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int r4 = 0; r4 < strArr.length; r4++) {
            String str = strArr[r4];
            if (r12 == null || r12.length <= r4 || (r12[r4] & 2) == 0) {
                arrayList.add(new PermissionState(str, false));
            } else {
                arrayList.add(new PermissionState(str, true));
            }
        }
        return arrayList;
    }
}
