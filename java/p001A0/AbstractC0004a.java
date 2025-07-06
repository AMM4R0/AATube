package p001A0;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* renamed from: A0.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0004a {
    /* renamed from: d */
    public static /* synthetic */ NotificationChannel m26d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* renamed from: e */
    public static /* synthetic */ AudioFocusRequest.Builder m27e() {
        return new AudioFocusRequest.Builder(3);
    }
}
