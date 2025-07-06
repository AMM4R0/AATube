package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Tb */
/* loaded from: classes.dex */
public abstract class AbstractC1546Tb {

    /* renamed from: c */
    public static volatile String f5469c = "";

    /* renamed from: a */
    public final String f5470a;

    /* renamed from: b */
    public volatile boolean f5471b = false;

    public AbstractC1546Tb(String str) {
        this.f5470a = "[" + AbstractC2356zn.m4696a(str) + "] ";
    }

    /* renamed from: a */
    public final String m3357a() {
        return AbstractC0002c.m15j(StringUtils.ifIsNullToDef(f5469c, ""), StringUtils.ifIsNullToDef(this.f5470a, ""));
    }

    /* renamed from: b */
    public final boolean m3367b() {
        return this.f5471b;
    }

    /* renamed from: c */
    public final void m3368c(String str) {
        m3358a(5, str);
    }

    /* renamed from: b */
    public final void m3365b(String str) {
        m3358a(4, str);
    }

    /* renamed from: c */
    public final void m3369c(String str, Object... objArr) {
        m3359a(5, str, objArr);
    }

    /* renamed from: b */
    public final void m3366b(String str, Object... objArr) {
        m3359a(4, str, objArr);
    }

    /* renamed from: a */
    public static void m3356a(Context context) {
        f5469c = "[" + context.getPackageName() + "] : ";
    }

    /* renamed from: a */
    public final void m3364a(boolean z2) {
        this.f5471b = z2;
    }

    /* renamed from: a */
    public final void m3360a(String str) {
        m3358a(6, str);
    }

    /* renamed from: a */
    public final void m3361a(String str, Object... objArr) {
        m3359a(6, str, objArr);
    }

    /* renamed from: a */
    public final void m3358a(int r3, String str) {
        if (this.f5471b) {
            StringBuilder sb = new StringBuilder();
            sb.append(m3357a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.println(r3, "AppMetrica", sb.toString());
        }
    }

    /* renamed from: a */
    public final void m3359a(int r3, String str, Object... objArr) {
        if (this.f5471b) {
            StringBuilder sb = new StringBuilder();
            sb.append(m3357a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            Log.println(r3, "AppMetrica", sb.toString());
        }
    }

    /* renamed from: a */
    public final void m3363a(Throwable th, String str, Object... objArr) {
        if (this.f5471b) {
            StringBuilder sb = new StringBuilder();
            sb.append(m3357a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Log.println(6, "AppMetrica", sb.toString());
        }
    }

    /* renamed from: a */
    public final void m3362a(Throwable th, String str) {
        if (this.f5471b) {
            StringBuilder sb = new StringBuilder();
            sb.append(m3357a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Log.println(6, "AppMetrica", sb.toString());
        }
    }
}
