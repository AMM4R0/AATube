package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.K1 */
/* loaded from: classes.dex */
public final class C1312K1 {

    /* renamed from: a */
    public final C1718aa f4937a;

    /* renamed from: b */
    public boolean f4938b;

    public C1312K1() {
        this(new C1718aa());
    }

    /* renamed from: a */
    public final synchronized long m3000a(Context context) {
        String m2955a;
        try {
            this.f4937a.getClass();
            m2955a = AbstractC1271Ia.m2955a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(m2955a) ? 0L : new JSONObject(m2955a).optLong("delay");
    }

    /* renamed from: b */
    public final void m3001b(Context context) {
        synchronized (this) {
        }
        if (this.f4938b) {
            return;
        }
        long m3000a = m3000a(context);
        if (m3000a > 0) {
            try {
                Thread.sleep(m3000a);
            } catch (Throwable unused) {
            }
        }
        this.f4938b = true;
    }

    public C1312K1(C1718aa c1718aa) {
        this.f4938b = false;
        this.f4937a = c1718aa;
    }
}
