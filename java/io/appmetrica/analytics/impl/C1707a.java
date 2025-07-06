package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a */
/* loaded from: classes.dex */
public final class C1707a {

    /* renamed from: a */
    public final Context f5817a;

    public C1707a(Context context) {
        this.f5817a = context;
    }

    /* renamed from: a */
    public final byte[] m3579a() {
        try {
            return AbstractC1354Li.m3058a(new StringBuilder(this.f5817a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public final byte[] m3580b() {
        try {
            return AbstractC1354Li.m3058a(this.f5817a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
