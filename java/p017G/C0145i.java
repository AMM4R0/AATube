package p017G;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import p000A.AbstractC0002c;

/* renamed from: G.i */
/* loaded from: classes.dex */
public final class C0145i implements InterfaceC0146j {

    /* renamed from: c */
    public static final Locale[] f412c = new Locale[0];

    /* renamed from: a */
    public final Locale[] f413a;

    /* renamed from: b */
    public final String f414b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public C0145i(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f413a = f412c;
            this.f414b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int r4 = 0; r4 < localeArr.length; r4++) {
            Locale locale = localeArr[r4];
            if (locale == null) {
                throw new NullPointerException(AbstractC0002c.m13h("list[", r4, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (r4 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f413a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f414b = sb.toString();
    }

    @Override // p017G.InterfaceC0146j
    /* renamed from: a */
    public final Object mo450a() {
        return null;
    }

    @Override // p017G.InterfaceC0146j
    /* renamed from: b */
    public final String mo451b() {
        return this.f414b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0145i)) {
            return false;
        }
        Locale[] localeArr = ((C0145i) obj).f413a;
        Locale[] localeArr2 = this.f413a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int r3 = 0; r3 < localeArr2.length; r3++) {
            if (!localeArr2[r3].equals(localeArr[r3])) {
                return false;
            }
        }
        return true;
    }

    @Override // p017G.InterfaceC0146j
    public final Locale get(int r3) {
        if (r3 >= 0) {
            Locale[] localeArr = this.f413a;
            if (r3 < localeArr.length) {
                return localeArr[r3];
            }
        }
        return null;
    }

    public final int hashCode() {
        int r2 = 1;
        for (Locale locale : this.f413a) {
            r2 = (r2 * 31) + locale.hashCode();
        }
        return r2;
    }

    @Override // p017G.InterfaceC0146j
    public final boolean isEmpty() {
        return this.f413a.length == 0;
    }

    @Override // p017G.InterfaceC0146j
    public final int size() {
        return this.f413a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int r12 = 0;
        while (true) {
            Locale[] localeArr = this.f413a;
            if (r12 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[r12]);
            if (r12 < localeArr.length - 1) {
                sb.append(',');
            }
            r12++;
        }
    }
}
