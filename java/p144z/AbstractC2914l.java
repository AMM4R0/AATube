package p144z;

import android.app.Notification;
import android.content.Context;

/* renamed from: z.l */
/* loaded from: classes.dex */
public abstract class AbstractC2914l {
    /* renamed from: a */
    public static Notification.Builder m5520a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: b */
    public static Notification.Builder m5521b(Notification.Builder builder, int r12) {
        return builder.setBadgeIconType(r12);
    }

    /* renamed from: c */
    public static Notification.Builder m5522c(Notification.Builder builder, boolean z2) {
        return builder.setColorized(z2);
    }

    /* renamed from: d */
    public static Notification.Builder m5523d(Notification.Builder builder, int r12) {
        return builder.setGroupAlertBehavior(r12);
    }

    /* renamed from: e */
    public static Notification.Builder m5524e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* renamed from: f */
    public static Notification.Builder m5525f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* renamed from: g */
    public static Notification.Builder m5526g(Notification.Builder builder, long j2) {
        return builder.setTimeoutAfter(j2);
    }
}
