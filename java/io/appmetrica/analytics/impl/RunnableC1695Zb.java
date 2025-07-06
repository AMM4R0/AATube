package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.impl.Zb */
/* loaded from: classes.dex */
public final class RunnableC1695Zb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1559U f5802a;

    /* renamed from: b */
    public final /* synthetic */ C1720ac f5803b;

    public RunnableC1695Zb(C1720ac c1720ac, C1559U c1559u) {
        this.f5803b = c1720ac;
        this.f5802a = c1559u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5803b.f5867e.mo3055a(this.f5802a);
        C2269wb c2269wb = this.f5803b.f5864b;
        List list = this.f5802a.f5508a.f5097f;
        Pattern pattern = C2269wb.f7346a;
        c2269wb.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (pattern.matcher(((StackTraceElement) it.next()).getClassName()).find()) {
                this.f5803b.f5865c.mo3496a().mo3055a(this.f5802a);
                break;
            }
        }
        C2269wb c2269wb2 = this.f5803b.f5864b;
        List list2 = this.f5802a.f5508a.f5097f;
        Pattern pattern2 = C2269wb.f7347b;
        c2269wb2.getClass();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (pattern2.matcher(((StackTraceElement) it2.next()).getClassName()).find()) {
                this.f5803b.f5866d.mo3496a().mo3055a(this.f5802a);
                return;
            }
        }
    }
}
