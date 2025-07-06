package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wc */
/* loaded from: classes.dex */
public final class C2270wc extends HashMap {

    /* renamed from: a */
    public int f7348a;

    public C2270wc() {
        this.f7348a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f7348a = str2.length() + str.length() + this.f7348a;
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            String str3 = (String) get(str);
            this.f7348a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f7348a;
            return (String) super.put(str, str2);
        }
        if (containsKey(str)) {
            String str4 = (String) get(str);
            this.f7348a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (String) super.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            String str = (String) get(obj);
            this.f7348a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public C2270wc(String str) {
        super(AbstractC1794db.m3757d(str));
        this.f7348a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f7348a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f7348a;
        }
    }
}
