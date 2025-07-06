package p008C1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p016F1.C0136d;
import p027J1.AbstractC0251k;
import p027J1.C0243c;
import p048Q1.AbstractC0452a;
import p108m1.AbstractC2661k;
import p108m1.C2656f;

/* renamed from: C1.p */
/* loaded from: classes.dex */
public final class C0084p {

    /* renamed from: a */
    public final /* synthetic */ int f230a;

    /* renamed from: b */
    public String f231b;

    /* renamed from: c */
    public int f232c;

    /* renamed from: d */
    public Object f233d;

    /* renamed from: e */
    public Object f234e;

    /* renamed from: f */
    public Object f235f;

    /* renamed from: g */
    public Object f236g;

    /* renamed from: h */
    public Object f237h;

    /* renamed from: i */
    public Object f238i;

    public C0084p(C0136d taskRunner) {
        this.f230a = 1;
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        this.f233d = taskRunner;
        this.f237h = AbstractC0251k.f748a;
        this.f238i = C0243c.f714a;
    }

    /* renamed from: d */
    public static ArrayList m278d(String str) {
        ArrayList arrayList = new ArrayList();
        int r2 = 0;
        while (r2 <= str.length()) {
            int m136N = AbstractC0017j.m136N(str, '&', r2, false, 4);
            if (m136N == -1) {
                m136N = str.length();
            }
            int m136N2 = AbstractC0017j.m136N(str, '=', r2, false, 4);
            if (m136N2 == -1 || m136N2 > m136N) {
                String substring = str.substring(r2, m136N);
                AbstractC2492i.m4914d(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(r2, m136N2);
                AbstractC2492i.m4914d(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(m136N2 + 1, m136N);
                AbstractC2492i.m4914d(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            r2 = m136N + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    public C0085q m279a() {
        ArrayList arrayList;
        String str = this.f231b;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String m1207c = AbstractC0452a.m1207c((String) this.f233d, 0, 0, false, 7);
        String m1207c2 = AbstractC0452a.m1207c((String) this.f234e, 0, 0, false, 7);
        String str2 = (String) this.f235f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int m280b = m280b();
        ArrayList arrayList2 = (ArrayList) this.f237h;
        ArrayList arrayList3 = new ArrayList(AbstractC2661k.m5122Z(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC0452a.m1207c((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f238i;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC2661k.m5122Z(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? AbstractC0452a.m1207c(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f236g;
        return new C0085q(str, m1207c, m1207c2, str2, m280b, arrayList, str4 != null ? AbstractC0452a.m1207c(str4, 0, 0, false, 7) : null, toString());
    }

    /* renamed from: b */
    public int m280b() {
        int r02 = this.f232c;
        if (r02 != -1) {
            return r02;
        }
        String str = this.f231b;
        AbstractC2492i.m4912b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x027c, code lost:
    
        if (r9 < 65536) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0079, code lost:
    
        if (r7 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m281c(p008C1.C0085q r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p008C1.C0084p.m281c(C1.q, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p008C1.C0084p.toString():java.lang.String");
    }

    public C0084p() {
        this.f230a = 0;
        this.f233d = "";
        this.f234e = "";
        this.f232c = -1;
        this.f237h = new ArrayList(new C2656f(new String[]{""}, true));
    }
}
