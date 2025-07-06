package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cb */
/* loaded from: classes.dex */
public final class C1769cb extends JSONObject {
    public C1769cb() {
    }

    /* renamed from: a */
    public final Long m3713a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String m3714b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public C1769cb(String str) {
        super(str);
    }
}
