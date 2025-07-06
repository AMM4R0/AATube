package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Kk */
/* loaded from: classes.dex */
public final class C1331Kk {

    /* renamed from: a */
    public final C2195tc f4971a;

    /* renamed from: b */
    public final C2170sc f4972b;

    public C1331Kk(C2123qf c2123qf, String str) {
        this(new C2195tc(str, c2123qf), new C2170sc(str, c2123qf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final synchronized boolean m3029a(C2270wc c2270wc, String str, String str2) {
        try {
            int size = c2270wc.size();
            int r5 = this.f4971a.f7164c.f4766a;
            if (size >= r5 && (r5 != c2270wc.size() || !c2270wc.containsKey(str))) {
                C2195tc c2195tc = this.f4971a;
                if (c2195tc.f7165d.f5471b) {
                    c2195tc.f7165d.m3359a(5, "The %s has reached the limit of %d items. Item with key %s will be ignored", c2195tc.f7166e, Integer.valueOf(c2195tc.f7164c.f4766a), str);
                }
                return false;
            }
            this.f4972b.getClass();
            int r4 = c2270wc.f7348a;
            if (str2 != null) {
                r4 += str2.length();
            }
            if (c2270wc.containsKey(str)) {
                String str3 = (String) c2270wc.get(str);
                if (str3 != null) {
                    r4 -= str3.length();
                }
            } else {
                r4 += str.length();
            }
            if (r4 <= 4500) {
                c2270wc.put(str, str2);
                return true;
            }
            C2170sc c2170sc = this.f4972b;
            if (c2170sc.f7126b.f5471b) {
                c2170sc.f7126b.m3359a(5, "The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c2170sc.f7125a, 4500, str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean m3030b(C2270wc c2270wc, String str, String str2) {
        if (c2270wc == null) {
            return false;
        }
        String mo2687a = this.f4971a.f7162a.mo2687a(str);
        String mo2687a2 = this.f4971a.f7163b.mo2687a(str2);
        if (!c2270wc.containsKey(mo2687a)) {
            if (mo2687a2 != null) {
                return m3029a(c2270wc, mo2687a, mo2687a2);
            }
            return false;
        }
        String str3 = (String) c2270wc.get(mo2687a);
        if (mo2687a2 == null || !mo2687a2.equals(str3)) {
            return m3029a(c2270wc, mo2687a, mo2687a2);
        }
        return false;
    }

    public C1331Kk(C2195tc c2195tc, C2170sc c2170sc) {
        this.f4971a = c2195tc;
        this.f4972b = c2170sc;
    }
}
