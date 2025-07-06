package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import p008C1.C0091w;

/* renamed from: android.support.v4.media.e */
/* loaded from: classes.dex */
public final class C0570e {

    /* renamed from: b */
    public static final boolean f1600b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final C0568c f1601a;

    public C0570e(Context context, ComponentName componentName, C0091w c0091w) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1601a = new C0569d(context, componentName, c0091w);
        } else {
            this.f1601a = new C0568c(context, componentName, c0091w);
        }
    }
}
