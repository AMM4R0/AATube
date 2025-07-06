package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Yb */
/* loaded from: classes.dex */
public final class C1671Yb implements InterfaceC1773cf {

    /* renamed from: a */
    public volatile String f5768a;

    /* renamed from: a */
    public static String m3540a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public final String m3542b() {
        try {
            FutureTask futureTask = new FutureTask(new CallableC1646Xb(this));
            C2112q4 c2112q4 = C2312y4.m4633h().f7478c;
            if (c2112q4.f6965e == null) {
                synchronized (c2112q4) {
                    try {
                        if (c2112q4.f6965e == null) {
                            c2112q4.f6961a.getClass();
                            c2112q4.f6965e = new Handler(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c2112q4.f6965e.post(futureTask);
            return (String) futureTask.get(5L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String m3543c() {
        if (this.f5768a != null) {
            return this.f5768a;
        }
        synchronized (this) {
            try {
                if (this.f5768a == null) {
                    this.f5768a = m3540a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f5768a;
    }

    /* renamed from: d */
    public final boolean m3544d() {
        try {
            if (TextUtils.isEmpty(m3543c())) {
                return false;
            }
            return !m3543c().contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m3541a(String str) {
        try {
            if (TextUtils.isEmpty(m3543c())) {
                return false;
            }
            String m3543c = m3543c();
            StringBuilder sb = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return m3543c.endsWith(sb.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
