package p144z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.d */
/* loaded from: classes.dex */
public abstract class AbstractC2906d {
    /* renamed from: a */
    public static int m5491a(AppOpsManager appOpsManager, String str, int r2, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, r2, str2);
    }

    /* renamed from: b */
    public static String m5492b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m5493c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
