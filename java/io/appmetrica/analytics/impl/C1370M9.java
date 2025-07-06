package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.M9 */
/* loaded from: classes.dex */
public final class C1370M9 {

    /* renamed from: a */
    public final C2130qm f5051a;

    /* renamed from: b */
    public final C2286x3 f5052b;

    public C1370M9(Context context) {
        this(new C2130qm(context, "io.appmetrica.analytics.build_id"), new C2286x3(context, "io.appmetrica.analytics.is_offline"));
    }

    public C1370M9(C2130qm c2130qm, C2286x3 c2286x3) {
        this.f5051a = c2130qm;
        this.f5052b = c2286x3;
    }
}
