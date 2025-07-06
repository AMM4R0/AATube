package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.X1 */
/* loaded from: classes.dex */
public final class C1636X1 implements InterfaceC2057o {

    /* renamed from: a */
    public final ArrayList f5681a;

    /* renamed from: b */
    public volatile C1118C7 f5682b;

    /* renamed from: c */
    public final C2107q f5683c;

    /* renamed from: d */
    public final ICommonExecutor f5684d;

    public C1636X1(ICommonExecutor iCommonExecutor) {
        this(C2312y4.m4633h().m4636b(), iCommonExecutor);
    }

    /* renamed from: a */
    public final void m3502a(C1118C7 c1118c7) {
        ArrayList m3501a;
        synchronized (this) {
            this.f5682b = c1118c7;
            m3501a = m3501a();
        }
        Iterator it = m3501a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1124Cd) it.next()).consume(c1118c7);
        }
    }

    /* renamed from: b */
    public final void m3503b() {
        this.f5683c.m4310a(this, EnumC2032n.CREATED);
    }

    public C1636X1(C2107q c2107q, ICommonExecutor iCommonExecutor) {
        this.f5681a = new ArrayList();
        this.f5682b = null;
        this.f5684d = iCommonExecutor;
        this.f5683c = c2107q;
    }

    /* renamed from: a */
    public final synchronized ArrayList m3501a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f5681a);
        this.f5681a.clear();
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2057o
    /* renamed from: a */
    public final void mo3040a(Activity activity, EnumC2032n enumC2032n) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C1586V1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        C1611W1 c1611w1 = new C1611W1(dataString);
        synchronized (this) {
            try {
                C1118C7 c1118c7 = this.f5682b;
                if (c1118c7 == null) {
                    this.f5681a.add(c1611w1);
                } else {
                    this.f5684d.execute(new RunnableC1561U1(c1611w1, c1118c7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
