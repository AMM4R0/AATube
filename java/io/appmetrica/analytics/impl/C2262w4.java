package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w4 */
/* loaded from: classes.dex */
public final class C2262w4 {

    /* renamed from: a */
    public final String f7335a;

    /* renamed from: b */
    public final Integer f7336b;

    /* renamed from: c */
    public final String f7337c;

    public C2262w4(String str, Integer num, String str2) {
        this.f7335a = str;
        this.f7336b = num;
        this.f7337c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2262w4.class != obj.getClass()) {
            return false;
        }
        C2262w4 c2262w4 = (C2262w4) obj;
        if (!this.f7335a.equals(c2262w4.f7335a)) {
            return false;
        }
        Integer num = this.f7336b;
        if (num == null ? c2262w4.f7336b != null : !num.equals(c2262w4.f7336b)) {
            return false;
        }
        String str = this.f7337c;
        String str2 = c2262w4.f7337c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f7335a.hashCode() * 31;
        Integer num = this.f7336b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f7337c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
