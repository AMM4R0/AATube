package p144z;

import android.app.Notification;
import android.app.Person;

/* renamed from: z.m */
/* loaded from: classes.dex */
public abstract class AbstractC2915m {
    /* renamed from: a */
    public static Notification.Builder m5527a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    /* renamed from: b */
    public static Notification.Action.Builder m5528b(Notification.Action.Builder builder, int r12) {
        return builder.setSemanticAction(r12);
    }
}
