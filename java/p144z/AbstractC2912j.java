package p144z;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: z.j */
/* loaded from: classes.dex */
public abstract class AbstractC2912j {
    /* renamed from: a */
    public static Notification.Action.Builder m5512a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* renamed from: b */
    public static Notification.Builder m5513b(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }

    /* renamed from: c */
    public static Notification.Builder m5514c(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }
}
