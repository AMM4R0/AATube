package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Z9 */
/* loaded from: classes.dex */
public final class C1693Z9 {

    /* renamed from: c */
    public static volatile C1693Z9 f5798c;

    /* renamed from: a */
    public final Context f5799a;

    /* renamed from: b */
    public final HashMap f5800b = new HashMap();

    public C1693Z9(Context context) {
        this.f5799a = context;
    }

    /* renamed from: a */
    public static C1693Z9 m3573a(Context context) {
        if (f5798c == null) {
            synchronized (C1693Z9.class) {
                try {
                    if (f5798c == null) {
                        f5798c = new C1693Z9(context);
                    }
                } finally {
                }
            }
        }
        return f5798c;
    }

    /* renamed from: a */
    public final C2267w9 m3574a(String str) {
        if (!this.f5800b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f5800b.containsKey(str)) {
                        this.f5800b.put(str, new C2267w9(this.f5799a, str));
                    }
                } finally {
                }
            }
        }
        return (C2267w9) this.f5800b.get(str);
    }
}
