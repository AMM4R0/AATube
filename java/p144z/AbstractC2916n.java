package p144z;

import android.app.Notification;
import android.content.LocusId;

/* renamed from: z.n */
/* loaded from: classes.dex */
public abstract class AbstractC2916n {
    /* renamed from: a */
    public static Notification.Builder m5529a(Notification.Builder builder, boolean z2) {
        return builder.setAllowSystemGeneratedContextualActions(z2);
    }

    /* renamed from: b */
    public static Notification.Builder m5530b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* renamed from: c */
    public static Notification.Action.Builder m5531c(Notification.Action.Builder builder, boolean z2) {
        return builder.setContextual(z2);
    }

    /* renamed from: d */
    public static Notification.Builder m5532d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
