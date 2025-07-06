package p144z;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* renamed from: z.i */
/* loaded from: classes.dex */
public abstract class AbstractC2911i {
    /* renamed from: a */
    public static Notification.Builder m5506a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* renamed from: b */
    public static Notification.Builder m5507b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* renamed from: c */
    public static Notification.Builder m5508c(Notification.Builder builder, int r12) {
        return builder.setColor(r12);
    }

    /* renamed from: d */
    public static Notification.Builder m5509d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* renamed from: e */
    public static Notification.Builder m5510e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    /* renamed from: f */
    public static Notification.Builder m5511f(Notification.Builder builder, int r12) {
        return builder.setVisibility(r12);
    }
}
