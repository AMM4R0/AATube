package p000A;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p036M1.AbstractC0379e;

/* renamed from: A.d */
/* loaded from: classes.dex */
public abstract class AbstractC0003d {
    /* renamed from: a */
    public static Intent m21a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int r11) {
        if ((r11 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, r11 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC0379e.m1075f(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(AbstractC0002c.m16k("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* renamed from: b */
    public static ComponentName m22b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
