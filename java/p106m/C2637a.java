package p106m;

import java.util.concurrent.Executors;
import p036M1.AbstractC0379e;

/* renamed from: m.a */
/* loaded from: classes.dex */
public final class C2637a extends AbstractC0379e {

    /* renamed from: g */
    public static volatile C2637a f8558g;

    /* renamed from: f */
    public final Object f8559f;

    public C2637a(int r2) {
        switch (r2) {
            case 1:
                this.f8559f = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC2638b());
                break;
            default:
                this.f8559f = new C2637a(1);
                break;
        }
    }

    /* renamed from: F */
    public static C2637a m5094F() {
        if (f8558g != null) {
            return f8558g;
        }
        synchronized (C2637a.class) {
            try {
                if (f8558g == null) {
                    f8558g = new C2637a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8558g;
    }
}
