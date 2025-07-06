package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.g3 */
/* loaded from: classes.dex */
public final class C1861g3 implements InterfaceC1305Jj {

    /* renamed from: a */
    public final ArrayList f6290a;

    /* renamed from: b */
    public Intent f6291b;

    /* renamed from: c */
    public final Context f6292c;

    /* renamed from: d */
    public final C1416O5 f6293d;

    public C1861g3(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    /* renamed from: a */
    public final synchronized Intent m3846a(Consumer<Intent> consumer) {
        this.f6290a.add(consumer);
        return this.f6291b;
    }

    /* renamed from: b */
    public final void m3847b() {
        this.f6291b = null;
        C1416O5 c1416o5 = this.f6293d;
        Context context = this.f6292c;
        synchronized (c1416o5) {
            if (c1416o5.f5152b) {
                try {
                    context.unregisterReceiver(c1416o5.f5151a);
                    c1416o5.f5152b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final synchronized void onCreate() {
        Intent m3845a = m3845a();
        this.f6291b = m3845a;
        Iterator it = this.f6290a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(m3845a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final synchronized void onDestroy() {
        this.f6291b = null;
        m3847b();
        Iterator it = this.f6290a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C1861g3(Context context, ICommonExecutor iCommonExecutor, int r3) {
        this.f6290a = new ArrayList();
        this.f6291b = null;
        this.f6292c = context;
        this.f6293d = AbstractC1391N5.m3108a(new C1263I2(new C1836f3(this), iCommonExecutor));
    }

    /* renamed from: a */
    public final Intent m3845a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        C1416O5 c1416o5 = this.f6293d;
        Context context = this.f6292c;
        synchronized (c1416o5) {
            try {
                intent = context.registerReceiver(c1416o5.f5151a, intentFilter);
                try {
                    c1416o5.f5152b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intent = null;
            }
        }
        return intent;
    }
}
