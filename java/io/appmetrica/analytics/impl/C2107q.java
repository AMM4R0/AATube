package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.q */
/* loaded from: classes.dex */
public final class C2107q extends AbstractC1143D7 {

    /* renamed from: a */
    public Application f6951a;

    /* renamed from: b */
    public volatile EnumC2082p f6952b = EnumC2082p.f6877d;

    /* renamed from: c */
    public final C2068oa f6953c = new C2068oa(true);

    /* renamed from: a */
    public final synchronized void m4309a(Context context) {
        if (this.f6951a == null) {
            try {
                this.f6951a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        m4311b();
    }

    /* renamed from: b */
    public final synchronized void m4311b() {
        EnumC2082p enumC2082p = this.f6952b;
        EnumC2082p enumC2082p2 = EnumC2082p.f6875b;
        if (enumC2082p != enumC2082p2 && !this.f6953c.f6854a.isEmpty()) {
            if (this.f6951a == null) {
                this.f6952b = EnumC2082p.f6876c;
            } else {
                this.f6952b = enumC2082p2;
                this.f6951a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m4313c() {
        if (this.f6952b == EnumC2082p.f6875b && this.f6953c.f6854a.isEmpty()) {
            this.f6952b = EnumC2082p.f6877d;
            this.f6951a.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4307a(activity, EnumC2032n.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m4307a(activity, EnumC2032n.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m4307a(activity, EnumC2032n.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m4307a(activity, EnumC2032n.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m4307a(activity, EnumC2032n.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m4307a(activity, EnumC2032n.STOPPED);
    }

    /* renamed from: a */
    public final synchronized void m4308a(Application application) {
        try {
            if (this.f6951a == null) {
                this.f6951a = application;
            }
            m4311b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final EnumC2082p m4306a() {
        return this.f6952b;
    }

    /* renamed from: a */
    public final void m4307a(Activity activity, EnumC2032n enumC2032n) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f6953c.f6854a.get(enumC2032n);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((InterfaceC2057o) it.next()).mo3040a(activity, enumC2032n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:31:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:14:0x002f, B:15:0x0034, B:17:0x0039, B:21:0x003c, B:3:0x0009), top: B:30:0x0003 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m4312b(io.appmetrica.analytics.impl.InterfaceC2057o r7, io.appmetrica.analytics.impl.EnumC2032n... r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L9
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto Ld
            goto L9
        L7:
            r7 = move-exception
            goto L41
        L9:
            io.appmetrica.analytics.impl.n[] r8 = io.appmetrica.analytics.impl.EnumC2032n.values()     // Catch: java.lang.Throwable -> L7
        Ld:
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7
            r1 = 0
        Lf:
            if (r1 >= r0) goto L3c
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L7
            io.appmetrica.analytics.impl.oa r3 = r6.f6953c     // Catch: java.lang.Throwable -> L7
            java.util.HashMap r4 = r3.f6854a     // Catch: java.lang.Throwable -> L7
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L7
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L7
            if (r4 == 0) goto L39
            boolean r5 = r4.remove(r7)     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L39
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L34
            boolean r5 = r3.f6855b     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L34
            java.util.HashMap r3 = r3.f6854a     // Catch: java.lang.Throwable -> L7
            r3.remove(r2)     // Catch: java.lang.Throwable -> L7
        L34:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L7
        L39:
            int r1 = r1 + 1
            goto Lf
        L3c:
            r6.m4313c()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r6)
            return
        L41:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2107q.m4312b(io.appmetrica.analytics.impl.o, io.appmetrica.analytics.impl.n[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, LOOP:0: B:5:0x000f->B:6:0x0011, LOOP_END, TryCatch #0 {all -> 0x0007, blocks: (B:18:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001b, B:3:0x0009), top: B:17:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m4310a(io.appmetrica.analytics.impl.InterfaceC2057o r5, io.appmetrica.analytics.impl.EnumC2032n... r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L9
            int r0 = r6.length     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto Ld
            goto L9
        L7:
            r5 = move-exception
            goto L20
        L9:
            io.appmetrica.analytics.impl.n[] r6 = io.appmetrica.analytics.impl.EnumC2032n.values()     // Catch: java.lang.Throwable -> L7
        Ld:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L7
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1b
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L7
            io.appmetrica.analytics.impl.oa r3 = r4.f6953c     // Catch: java.lang.Throwable -> L7
            r3.m4264a(r2, r5)     // Catch: java.lang.Throwable -> L7
            int r1 = r1 + 1
            goto Lf
        L1b:
            r4.m4311b()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r4)
            return
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2107q.m4310a(io.appmetrica.analytics.impl.o, io.appmetrica.analytics.impl.n[]):void");
    }
}
