package p115p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C2698a {

    /* renamed from: b */
    public static final C2698a f8703b;

    /* renamed from: c */
    public static final C2698a f8704c;

    /* renamed from: a */
    public final CancellationException f8705a;

    static {
        if (AbstractFutureC2704g.f8716d) {
            f8704c = null;
            f8703b = null;
        } else {
            f8704c = new C2698a(false, null);
            f8703b = new C2698a(true, null);
        }
    }

    public C2698a(boolean z2, CancellationException cancellationException) {
        this.f8705a = cancellationException;
    }
}
