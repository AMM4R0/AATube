package p144z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.c */
/* loaded from: classes.dex */
public abstract class AbstractC2905c {
    /* renamed from: a */
    public static <T> T m5487a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m5488b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m5489c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m5490d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
