package p008C1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p021H1.AbstractC0187c;

/* renamed from: C1.k */
/* loaded from: classes.dex */
public final class C0079k {

    /* renamed from: k */
    public static final Pattern f205k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    public static final Pattern f206l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    public static final Pattern f207m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final Pattern f208n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f209a;

    /* renamed from: b */
    public final String f210b;

    /* renamed from: c */
    public final long f211c;

    /* renamed from: d */
    public final String f212d;

    /* renamed from: e */
    public final String f213e;

    /* renamed from: f */
    public final boolean f214f;

    /* renamed from: g */
    public final boolean f215g;

    /* renamed from: h */
    public final boolean f216h;

    /* renamed from: i */
    public final boolean f217i;

    /* renamed from: j */
    public final String f218j;

    public C0079k(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, String str5) {
        this.f209a = str;
        this.f210b = str2;
        this.f211c = j2;
        this.f212d = str3;
        this.f213e = str4;
        this.f214f = z2;
        this.f215g = z3;
        this.f216h = z4;
        this.f217i = z5;
        this.f218j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0079k) {
            C0079k c0079k = (C0079k) obj;
            if (AbstractC2492i.m4911a(c0079k.f209a, this.f209a) && AbstractC2492i.m4911a(c0079k.f210b, this.f210b) && c0079k.f211c == this.f211c && AbstractC2492i.m4911a(c0079k.f212d, this.f212d) && AbstractC2492i.m4911a(c0079k.f213e, this.f213e) && c0079k.f214f == this.f214f && c0079k.f215g == this.f215g && c0079k.f216h == this.f216h && c0079k.f217i == this.f217i && AbstractC2492i.m4911a(c0079k.f218j, this.f218j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m9d = AbstractC0002c.m9d(this.f210b, AbstractC0002c.m9d(this.f209a, 527, 31), 31);
        long j2 = this.f211c;
        int m9d2 = (((((((AbstractC0002c.m9d(this.f213e, AbstractC0002c.m9d(this.f212d, (m9d + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31), 31) + (this.f214f ? 1231 : 1237)) * 31) + (this.f215g ? 1231 : 1237)) * 31) + (this.f216h ? 1231 : 1237)) * 31) + (this.f217i ? 1231 : 1237)) * 31;
        String str = this.f218j;
        return m9d2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f209a);
        sb.append('=');
        sb.append(this.f210b);
        if (this.f216h) {
            long j2 = this.f211c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) AbstractC0187c.f576a.get()).format(new Date(j2));
                AbstractC2492i.m4914d(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.f217i) {
            sb.append("; domain=");
            sb.append(this.f212d);
        }
        sb.append("; path=");
        sb.append(this.f213e);
        if (this.f214f) {
            sb.append("; secure");
        }
        if (this.f215g) {
            sb.append("; httponly");
        }
        String str = this.f218j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }
}
