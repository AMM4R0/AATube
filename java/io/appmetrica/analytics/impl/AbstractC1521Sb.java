package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Sb */
/* loaded from: classes.dex */
public abstract class AbstractC1521Sb {

    /* renamed from: a */
    public static final HashMap f5412a = new HashMap();

    /* renamed from: b */
    public static final Object f5413b = new Object();

    /* renamed from: a */
    public static C2123qf m3315a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C2123qf.f6997e;
        }
        HashMap hashMap = f5412a;
        C2123qf c2123qf = (C2123qf) hashMap.get(str);
        if (c2123qf == null) {
            synchronized (f5413b) {
                try {
                    c2123qf = (C2123qf) hashMap.get(str);
                    if (c2123qf == null) {
                        c2123qf = new C2123qf(str);
                        hashMap.put(str, c2123qf);
                    }
                } finally {
                }
            }
        }
        return c2123qf;
    }

    /* renamed from: a */
    public static C2123qf m3314a() {
        return C2123qf.f6997e;
    }
}
