package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f5 */
/* loaded from: classes.dex */
public class C1838f5 {

    /* renamed from: a */
    public final String f6192a;

    /* renamed from: b */
    public final String f6193b;

    public C1838f5(String str, String str2) {
        this.f6192a = str;
        this.f6193b = str2;
    }

    /* renamed from: a */
    public final String m3805a() {
        return this.f6193b;
    }

    /* renamed from: b */
    public final String m3806b() {
        return this.f6192a;
    }

    /* renamed from: c */
    public boolean mo3807c() {
        return false;
    }

    /* renamed from: d */
    public String mo3808d() {
        return this.f6192a + "_" + AbstractC2356zn.m4696a(this.f6193b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1838f5 c1838f5 = (C1838f5) obj;
        String str = this.f6192a;
        if (str == null ? c1838f5.f6192a != null : !str.equals(c1838f5.f6192a)) {
            return false;
        }
        String str2 = this.f6193b;
        String str3 = c1838f5.f6193b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f6192a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6193b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f6192a + "_" + this.f6193b;
    }
}
