package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Pi */
/* loaded from: classes.dex */
public final class C1454Pi {

    /* renamed from: a */
    public final String f5228a;

    /* renamed from: b */
    public final Context f5229b;

    /* renamed from: c */
    public final EnumC1565U5 f5230c;

    /* renamed from: d */
    public final C1528Si f5231d;

    public C1454Pi(String str, Context context, EnumC1565U5 enumC1565U5, C1528Si c1528Si) {
        this.f5228a = str;
        this.f5229b = context;
        int ordinal = enumC1565U5.ordinal();
        if (ordinal == 0) {
            this.f5230c = EnumC1565U5.f5521f;
        } else if (ordinal != 1) {
            this.f5230c = null;
        } else {
            this.f5230c = EnumC1565U5.f5522g;
        }
        this.f5231d = c1528Si;
    }
}
