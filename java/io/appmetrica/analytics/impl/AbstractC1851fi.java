package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.fi */
/* loaded from: classes.dex */
public abstract class AbstractC1851fi {

    /* renamed from: a */
    protected final Context f6273a;

    /* renamed from: b */
    public final String f6274b;

    /* renamed from: c */
    public final String f6275c;

    public AbstractC1851fi(Context context, String str, String str2) {
        this.f6273a = context;
        this.f6274b = str;
        this.f6275c = str2;
    }

    /* renamed from: a */
    public final Object m3832a() {
        int identifier = this.f6273a.getResources().getIdentifier(this.f6274b, this.f6275c, this.f6273a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo3833a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public abstract Object mo3833a(int r12);
}
