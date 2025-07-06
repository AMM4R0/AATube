package p011D1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0025r;
import p002A1.C0011d;
import p002A1.C0012e;
import p002A1.C0014g;
import p002A1.C0015h;
import p002A1.C0016i;
import p008C1.C0087s;
import p036M1.AbstractC0379e;

/* renamed from: D1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0116c {

    /* renamed from: a */
    public static final C0016i f352a = new C0016i("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    public static final C0016i f353b = new C0016i(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public static final C0087s m394a(String str) {
        AbstractC2492i.m4915e(str, "<this>");
        C0015h m405k = AbstractC0119f.m405k(f352a, str, 0);
        if (m405k == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((C0012e) m405k.f27d) == null) {
            m405k.f27d = new C0012e(m405k);
        }
        C0012e c0012e = (C0012e) m405k.f27d;
        AbstractC2492i.m4912b(c0012e);
        String str2 = (String) c0012e.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        AbstractC2492i.m4914d(lowerCase, "toLowerCase(...)");
        if (((C0012e) m405k.f27d) == null) {
            m405k.f27d = new C0012e(m405k);
        }
        C0012e c0012e2 = (C0012e) m405k.f27d;
        AbstractC2492i.m4912b(c0012e2);
        String lowerCase2 = ((String) c0012e2.get(2)).toLowerCase(locale);
        AbstractC2492i.m4914d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) m405k.f25b;
        int r02 = AbstractC0379e.m1069E(matcher.start(), matcher.end()).f9520b;
        while (true) {
            int r03 = r02 + 1;
            if (r03 >= str.length()) {
                return new C0087s(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            C0015h m405k2 = AbstractC0119f.m405k(f353b, str, r03);
            if (m405k2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(r03);
                AbstractC2492i.m4914d(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            C0014g c0014g = (C0014g) m405k2.f26c;
            C0011d m99b = c0014g.m99b(1);
            String str3 = m99b != null ? m99b.f17a : null;
            Matcher matcher2 = (Matcher) m405k2.f25b;
            if (str3 == null) {
                r02 = AbstractC0379e.m1069E(matcher2.start(), matcher2.end()).f9520b;
            } else {
                C0011d m99b2 = c0014g.m99b(2);
                String str4 = m99b2 != null ? m99b2.f17a : null;
                if (str4 == null) {
                    C0011d m99b3 = c0014g.m99b(3);
                    AbstractC2492i.m4912b(m99b3);
                    str4 = m99b3.f17a;
                } else if (AbstractC0025r.m156I(str4, "'", false) && AbstractC0025r.m151D(str4, "'", false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    AbstractC2492i.m4914d(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                r02 = AbstractC0379e.m1069E(matcher2.start(), matcher2.end()).f9520b;
            }
        }
    }
}
