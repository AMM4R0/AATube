package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.t0 */
/* loaded from: classes.dex */
public final class C2183t0 {
    /* renamed from: a */
    public static ResultReceiverC1192F6 m4434a(Handler handler, C2158s0 c2158s0) {
        return new ResultReceiverC1192F6(handler, c2158s0);
    }

    /* renamed from: a */
    public static C1748bf m4438a(Context context, ResultReceiverC1192F6 resultReceiverC1192F6) {
        return new C1748bf(context, resultReceiverC1192F6);
    }

    /* renamed from: a */
    public static C1726ai m4437a(C1748bf c1748bf, Context context, ICommonExecutor iCommonExecutor) {
        C1883h0 c1883h0 = new C1883h0(context, iCommonExecutor, C2312y4.m4633h().m4638d());
        return new C1726ai(c1883h0, new C1881gn(new C1894hb()), new C1688Z4(c1748bf), new C2352zj(context, c1883h0));
    }

    /* renamed from: a */
    public static C1904hl m4439a(Context context, C1726ai c1726ai, C2272we c2272we, Handler handler) {
        return new C1904hl(c1726ai, new C2104pl(context, c2272we), handler);
    }

    /* renamed from: a */
    public static C1401Nf m4435a(C1726ai c1726ai, C2272we c2272we, Handler handler) {
        return new C1401Nf(c1726ai, c2272we, handler, c2272we.m4578r());
    }

    /* renamed from: a */
    public static C1428Oh m4436a(Context context, C1748bf c1748bf, C1726ai c1726ai, Handler handler, C1904hl c1904hl) {
        return new C1428Oh(context, c1748bf, c1726ai, handler, c1904hl);
    }
}
