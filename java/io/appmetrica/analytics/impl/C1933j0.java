package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.Log;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.impl.j0 */
/* loaded from: classes.dex */
public final class C1933j0 {

    /* renamed from: a */
    public final C2031mn f6506a;

    /* renamed from: b */
    public Boolean f6507b;

    /* renamed from: c */
    public InterfaceC1071Aa f6508c;

    /* renamed from: d */
    public InterfaceC1096Ba f6509d;

    public C1933j0() {
        this(new C2031mn());
    }

    /* renamed from: a */
    public final synchronized InterfaceC1071Aa m4021a(Context context, C2112q4 c2112q4) {
        try {
            if (this.f6508c == null) {
                if (m4022a(context)) {
                    this.f6508c = new C1983l0(c2112q4);
                } else {
                    this.f6508c = new C1908i0(context.getApplicationContext(), c2112q4.m4339b(), c2112q4.m4338a());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6508c;
    }

    public C1933j0(C2031mn c2031mn) {
        this.f6506a = c2031mn;
    }

    /* renamed from: a */
    public final synchronized boolean m4022a(Context context) {
        try {
            if (this.f6507b == null) {
                this.f6506a.getClass();
                boolean m4229a = C2031mn.m4229a(context);
                this.f6507b = Boolean.valueOf(!m4229a);
                if (!m4229a) {
                    Pattern pattern = AbstractC1329Ki.f4968a;
                    Log.i("AppMetrica", "User is locked. So use stubs. Events will not be sent.");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6507b.booleanValue();
    }
}
