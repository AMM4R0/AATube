package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.Pj */
/* loaded from: classes.dex */
public abstract class AbstractC1455Pj {

    /* renamed from: a */
    public static final SafePackageManager f5232a = new SafePackageManager();

    /* renamed from: a */
    public static Intent m3212a(Context context) {
        Bundle bundle;
        Intent addFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f5232a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent putExtras = addFlags.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C1748bf.f5920c).build());
        ScreenInfo m2863a = C1179Ei.m2862a(context).m2863a();
        putExtras.putExtra("screen_size", m2863a == null ? null : AbstractC1794db.m3746a(m2863a));
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
