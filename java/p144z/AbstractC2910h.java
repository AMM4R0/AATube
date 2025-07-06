package p144z;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* renamed from: z.h */
/* loaded from: classes.dex */
public abstract class AbstractC2910h {
    /* renamed from: a */
    public static Notification.Builder m5496a(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* renamed from: b */
    public static Notification.Action.Builder m5497b(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* renamed from: c */
    public static Notification.Action.Builder m5498c(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* renamed from: d */
    public static Notification.Action m5499d(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* renamed from: e */
    public static Notification.Action.Builder m5500e(int r12, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(r12, charSequence, pendingIntent);
    }

    /* renamed from: f */
    public static String m5501f(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: g */
    public static Notification.Builder m5502g(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* renamed from: h */
    public static Notification.Builder m5503h(Notification.Builder builder, boolean z2) {
        return builder.setGroupSummary(z2);
    }

    /* renamed from: i */
    public static Notification.Builder m5504i(Notification.Builder builder, boolean z2) {
        return builder.setLocalOnly(z2);
    }

    /* renamed from: j */
    public static Notification.Builder m5505j(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
