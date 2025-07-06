package p144z;

import android.app.Notification;
import android.widget.RemoteViews;

/* renamed from: z.k */
/* loaded from: classes.dex */
public abstract class AbstractC2913k {
    /* renamed from: a */
    public static Notification.Action.Builder m5515a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAllowGeneratedReplies(z2);
    }

    /* renamed from: b */
    public static Notification.Builder m5516b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* renamed from: c */
    public static Notification.Builder m5517c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* renamed from: d */
    public static Notification.Builder m5518d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    /* renamed from: e */
    public static Notification.Builder m5519e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
