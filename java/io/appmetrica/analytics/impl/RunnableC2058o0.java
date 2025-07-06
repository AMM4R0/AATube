package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.o0 */
/* loaded from: classes.dex */
public final class RunnableC2058o0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC2083p0 f6832a;

    public RunnableC2058o0(RunnableC2083p0 runnableC2083p0) {
        this.f6832a = runnableC2083p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f6832a.f6880a.f6956a;
        C2202tj c2202tj = AbstractC1553Ti.f5485a;
        synchronized (c2202tj) {
            try {
                c2202tj.f7174b = AbstractC1527Sh.f5430a.m3378a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = c2202tj.f7173a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1446Pa) it.next()).mo3202a(c2202tj.f7174b);
                }
                c2202tj.f7173a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
