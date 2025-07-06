package p019H;

import android.content.Context;
import java.util.concurrent.Callable;
import p008C1.C0090v;

/* renamed from: H.e */
/* loaded from: classes.dex */
public final class CallableC0175e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f548a;

    /* renamed from: b */
    public final /* synthetic */ String f549b;

    /* renamed from: c */
    public final /* synthetic */ Context f550c;

    /* renamed from: d */
    public final /* synthetic */ C0090v f551d;

    /* renamed from: e */
    public final /* synthetic */ int f552e;

    public /* synthetic */ CallableC0175e(String str, Context context, C0090v c0090v, int r4, int r5) {
        this.f548a = r5;
        this.f549b = str;
        this.f550c = context;
        this.f551d = c0090v;
        this.f552e = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f548a) {
            case 0:
                return AbstractC0178h.m538a(this.f549b, this.f550c, this.f551d, this.f552e);
            default:
                try {
                    return AbstractC0178h.m538a(this.f549b, this.f550c, this.f551d, this.f552e);
                } catch (Throwable unused) {
                    return new C0177g(-3);
                }
        }
    }
}
