package p008C1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p011D1.AbstractC0119f;
import p048Q1.AbstractC0452a;

/* renamed from: C1.q */
/* loaded from: classes.dex */
public final class C0085q {

    /* renamed from: a */
    public final String f239a;

    /* renamed from: b */
    public final String f240b;

    /* renamed from: c */
    public final String f241c;

    /* renamed from: d */
    public final String f242d;

    /* renamed from: e */
    public final int f243e;

    /* renamed from: f */
    public final ArrayList f244f;

    /* renamed from: g */
    public final String f245g;

    /* renamed from: h */
    public final String f246h;

    public C0085q(String str, String str2, String str3, String str4, int r5, ArrayList arrayList, String str5, String str6) {
        this.f239a = str;
        this.f240b = str2;
        this.f241c = str3;
        this.f242d = str4;
        this.f243e = r5;
        this.f244f = arrayList;
        this.f245g = str5;
        this.f246h = str6;
    }

    /* renamed from: a */
    public final String m282a() {
        if (this.f241c.length() == 0) {
            return "";
        }
        int length = this.f239a.length() + 3;
        String str = this.f246h;
        String substring = str.substring(AbstractC0017j.m136N(str, ':', length, false, 4) + 1, AbstractC0017j.m136N(str, '@', 0, false, 6));
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: b */
    public final String m283b() {
        int length = this.f239a.length() + 3;
        String str = this.f246h;
        int m136N = AbstractC0017j.m136N(str, '/', length, false, 4);
        String substring = str.substring(m136N, AbstractC0119f.m398d(str, m136N, str.length(), "?#"));
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: c */
    public final ArrayList m284c() {
        int length = this.f239a.length() + 3;
        String str = this.f246h;
        int m136N = AbstractC0017j.m136N(str, '/', length, false, 4);
        int m398d = AbstractC0119f.m398d(str, m136N, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (m136N < m398d) {
            int r02 = m136N + 1;
            int m397c = AbstractC0119f.m397c(str, '/', r02, m398d);
            String substring = str.substring(r02, m397c);
            AbstractC2492i.m4914d(substring, "substring(...)");
            arrayList.add(substring);
            m136N = m397c;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m285d() {
        if (this.f244f == null) {
            return null;
        }
        String str = this.f246h;
        int m136N = AbstractC0017j.m136N(str, '?', 0, false, 6) + 1;
        String substring = str.substring(m136N, AbstractC0119f.m397c(str, '#', m136N, str.length()));
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: e */
    public final String m286e() {
        if (this.f240b.length() == 0) {
            return "";
        }
        int length = this.f239a.length() + 3;
        String str = this.f246h;
        String substring = str.substring(length, AbstractC0119f.m398d(str, length, str.length(), ":@"));
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0085q) && AbstractC2492i.m4911a(((C0085q) obj).f246h, this.f246h);
    }

    /* renamed from: f */
    public final String m287f() {
        C0084p c0084p;
        try {
            c0084p = new C0084p();
            c0084p.m281c(this, "/...");
        } catch (IllegalArgumentException unused) {
            c0084p = null;
        }
        AbstractC2492i.m4912b(c0084p);
        c0084p.f233d = AbstractC0452a.m1205a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        c0084p.f234e = AbstractC0452a.m1205a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        return c0084p.m279a().f246h;
    }

    /* renamed from: g */
    public final URI m288g() {
        String substring;
        String str;
        C0084p c0084p = new C0084p();
        String scheme = this.f239a;
        c0084p.f231b = scheme;
        c0084p.f233d = m286e();
        c0084p.f234e = m282a();
        c0084p.f235f = this.f242d;
        AbstractC2492i.m4915e(scheme, "scheme");
        int r2 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int r3 = this.f243e;
        c0084p.f232c = r3 != r2 ? r3 : -1;
        ArrayList arrayList = (ArrayList) c0084p.f237h;
        arrayList.clear();
        arrayList.addAll(m284c());
        String m285d = m285d();
        c0084p.f238i = m285d != null ? C0084p.m278d(AbstractC0452a.m1205a(m285d, 0, 0, " \"'<>#", true, false, true, false, 83)) : null;
        if (this.f245g == null) {
            substring = null;
        } else {
            String str2 = this.f246h;
            substring = str2.substring(AbstractC0017j.m136N(str2, '#', 0, false, 6) + 1);
            AbstractC2492i.m4914d(substring, "substring(...)");
        }
        c0084p.f236g = substring;
        String str3 = (String) c0084p.f235f;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            AbstractC2492i.m4914d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            AbstractC2492i.m4914d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        c0084p.f235f = str;
        int size = arrayList.size();
        for (int r9 = 0; r9 < size; r9++) {
            arrayList.set(r9, AbstractC0452a.m1205a((String) arrayList.get(r9), 0, 0, "[]", true, true, false, false, 99));
        }
        ArrayList arrayList2 = (ArrayList) c0084p.f238i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int r5 = 0; r5 < size2; r5++) {
                String str4 = (String) arrayList2.get(r5);
                arrayList2.set(r5, str4 != null ? AbstractC0452a.m1205a(str4, 0, 0, "\\^`{|}", true, true, true, false, 67) : null);
            }
        }
        String str5 = (String) c0084p.f236g;
        c0084p.f236g = str5 != null ? AbstractC0452a.m1205a(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35) : null;
        String c0084p2 = c0084p.toString();
        try {
            return new URI(c0084p2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC2492i.m4914d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(c0084p2).replaceAll("");
                AbstractC2492i.m4914d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                AbstractC2492i.m4912b(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f246h.hashCode();
    }

    public final String toString() {
        return this.f246h;
    }
}
