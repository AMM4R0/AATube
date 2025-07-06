package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.i4 */
/* loaded from: classes.dex */
public class C1912i4 {

    /* renamed from: a */
    public final C1748bf f6457a;

    /* renamed from: b */
    public final CounterConfiguration f6458b;

    public C1912i4(C1748bf c1748bf, CounterConfiguration counterConfiguration) {
        this.f6457a = c1748bf;
        this.f6458b = counterConfiguration;
    }

    /* renamed from: a */
    public static C1912i4 m3976a(Context context, Bundle bundle) {
        C1748bf c1748bf;
        CounterConfiguration fromBundle;
        String str = C1748bf.f5920c;
        if (bundle != null) {
            try {
                c1748bf = (C1748bf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && c1748bf != null && context.getPackageName().equals(c1748bf.f5921a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && c1748bf.f5921a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new C1912i4(c1748bf, fromBundle);
            }
            return null;
        }
        c1748bf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    /* renamed from: b */
    public final CounterConfiguration m3978b() {
        return this.f6458b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f6457a + ", mCounterConfiguration=" + this.f6458b + '}';
    }

    /* renamed from: a */
    public final C1748bf m3977a() {
        return this.f6457a;
    }
}
