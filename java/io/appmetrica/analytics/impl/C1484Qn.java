package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.Qn */
/* loaded from: classes.dex */
public final class C1484Qn {

    /* renamed from: a */
    public final Context f5264a;

    /* renamed from: b */
    public final LinkedHashMap f5265b = new LinkedHashMap();

    /* renamed from: c */
    public final C1359Ln f5266c;

    /* renamed from: d */
    public final C1359Ln f5267d;

    public C1484Qn(Context context) {
        this.f5264a = context;
        C1743ba c1743ba = new C1743ba(context, "appmetrica_vital.dat");
        this.f5266c = new C1359Ln(C2018ma.m4192h().m4216w(), c1743ba);
        this.f5267d = new C1359Ln(new C1075Ae(C1765c7.m3695a(context).m3702d()), c1743ba);
    }

    /* renamed from: a */
    public final C1359Ln m3244a() {
        return this.f5266c;
    }

    /* renamed from: b */
    public final C1359Ln m3245b() {
        return this.f5267d;
    }
}
