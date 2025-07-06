package p002A1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2659i;
import p108m1.AbstractC2660j;
import p108m1.C2668r;
import p145z1.C2925h;

/* renamed from: A1.k */
/* loaded from: classes.dex */
public abstract class AbstractC0018k extends AbstractC0580g {
    /* renamed from: B */
    public static String m149B(String str) {
        List list;
        AbstractC2492i.m4915e(str, "<this>");
        if (AbstractC0025r.m152E("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        AbstractC0017j.m143U(0);
        Iterator it = new C2925h(new C0010c(str, 0, 0, new C0026s(AbstractC2658h.m5104B(new String[]{"\r\n", "\n", "\r"}), false, 1)), new C0013f(1, str)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                list = arrayList;
            } else {
                list = AbstractC2480a.m4863D(next);
            }
        } else {
            list = C2668r.f8607a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int r5 = 0;
        for (Object obj : list) {
            int r7 = r5 + 1;
            String str2 = null;
            if (r5 < 0) {
                AbstractC2660j.m5121Y();
                throw null;
            }
            String str3 = (String) obj;
            if ((r5 != 0 && r5 != size) || !AbstractC0025r.m152E(str3)) {
                int length2 = str3.length();
                int r9 = 0;
                while (true) {
                    if (r9 >= length2) {
                        r9 = -1;
                        break;
                    }
                    char charAt = str3.charAt(r9);
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        break;
                    }
                    r9++;
                }
                if (r9 != -1 && AbstractC0025r.m155H(str3, "|", r9, false)) {
                    str2 = str3.substring("|".length() + r9);
                    AbstractC2492i.m4914d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            r5 = r7;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC2659i.m5113c0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }
}
