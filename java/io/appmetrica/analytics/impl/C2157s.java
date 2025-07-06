package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.s */
/* loaded from: classes.dex */
public final class C2157s {

    /* renamed from: a */
    public final WeakHashMap f7089a = new WeakHashMap();

    /* renamed from: a */
    public final boolean m4406a(Activity activity, EnumC2132r enumC2132r) {
        if (activity != null && this.f7089a.get(activity) == enumC2132r) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f7089a.put(activity, enumC2132r);
        return true;
    }
}
