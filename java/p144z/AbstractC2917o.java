package p144z;

import android.app.Notification;

/* renamed from: z.o */
/* loaded from: classes.dex */
public abstract class AbstractC2917o {
    /* renamed from: a */
    public static Notification.Action.Builder m5533a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAuthenticationRequired(z2);
    }

    /* renamed from: b */
    public static Notification.Builder m5534b(Notification.Builder builder, int r12) {
        return builder.setForegroundServiceBehavior(r12);
    }
}
