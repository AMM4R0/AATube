package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;

/* renamed from: io.appmetrica.analytics.impl.Od */
/* loaded from: classes.dex */
public abstract class AbstractC1424Od {

    /* renamed from: a */
    public final int f5167a = -1;

    /* renamed from: b */
    public final int f5168b = 0;

    /* renamed from: c */
    public final int f5169c = 1;

    /* renamed from: a */
    public final int m3172a(Boolean bool) {
        if (bool == null) {
            return this.f5167a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f5168b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f5169c;
        }
        throw new C0665o();
    }

    /* renamed from: a */
    public final Boolean m3173a(int r2) {
        if (r2 == this.f5168b) {
            return Boolean.FALSE;
        }
        if (r2 == this.f5169c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
