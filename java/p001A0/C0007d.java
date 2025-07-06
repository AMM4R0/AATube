package p001A0;

import android.content.Context;

/* renamed from: A0.d */
/* loaded from: classes.dex */
public final class C0007d {

    /* renamed from: b */
    public static final C0007d f4b;

    /* renamed from: a */
    public C0006c f5a;

    static {
        C0007d c0007d = new C0007d();
        c0007d.f5a = null;
        f4b = c0007d;
    }

    /* renamed from: a */
    public static C0006c m96a(Context context) {
        C0006c c0006c;
        C0007d c0007d = f4b;
        synchronized (c0007d) {
            try {
                if (c0007d.f5a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0007d.f5a = new C0006c(context, 0);
                }
                c0006c = c0007d.f5a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0006c;
    }
}
