package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.C0570e;
import android.util.Log;
import java.util.List;
import p000A.AbstractC0003d;
import p008C1.C0091w;
import p068a0.AbstractC0564a;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static ComponentName m1808a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String message;
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName m1808a = m1808a(context, "android.intent.action.MEDIA_BUTTON");
        if (m1808a == null) {
            ComponentName m1808a2 = m1808a(context, "android.media.browse.MediaBrowserService");
            if (m1808a2 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0091w c0091w = new C0091w(applicationContext, intent, goAsync);
            C0570e c0570e = new C0570e(applicationContext, m1808a2, c0091w);
            c0091w.f299g = c0570e;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            c0570e.f1601a.f1593b.connect();
            return;
        }
        intent.setComponent(m1808a);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0003d.m22b(context, intent);
            } else {
                context.startService(intent);
            }
        } catch (IllegalStateException e2) {
            if (Build.VERSION.SDK_INT < 31 || !AbstractC0564a.m1417b(e2)) {
                throw e2;
            }
            ForegroundServiceStartNotAllowedException m1416a = AbstractC0564a.m1416a(e2);
            StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
            message = m1416a.getMessage();
            sb.append(message);
            Log.e("MediaButtonReceiver", sb.toString());
        }
    }
}
