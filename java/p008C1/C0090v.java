package p008C1;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0025r;
import p006C.C0055g;
import p011D1.C0117d;
import p025J.C0218a;
import p080e0.C0843a;
import p080e0.C0872x;
import p103k0.AbstractC2480a;
import p108m1.C2669s;

/* renamed from: C1.v */
/* loaded from: classes.dex */
public final class C0090v {

    /* renamed from: a */
    public final /* synthetic */ int f287a;

    /* renamed from: b */
    public Serializable f288b;

    /* renamed from: c */
    public Object f289c;

    /* renamed from: d */
    public Object f290d;

    /* renamed from: e */
    public Object f291e;

    /* renamed from: f */
    public Object f292f;

    public /* synthetic */ C0090v(boolean z2) {
        this.f287a = 0;
    }

    /* renamed from: a */
    public boolean m290a(int r9) {
        ArrayList arrayList = (ArrayList) this.f290d;
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            C0843a c0843a = (C0843a) arrayList.get(r3);
            int r5 = c0843a.f3455a;
            if (r5 == 8) {
                if (m294e(c0843a.f3457c, r3 + 1) == r9) {
                    return true;
                }
            } else if (r5 == 1) {
                int r52 = c0843a.f3456b;
                int r4 = c0843a.f3457c + r52;
                while (r52 < r4) {
                    if (m294e(r52, r3 + 1) == r9) {
                        return true;
                    }
                    r52++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m291b() {
        ArrayList arrayList = (ArrayList) this.f290d;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            ((C0872x) this.f291e).m2383a((C0843a) arrayList.get(r2));
        }
        m300k(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f288b;
        int size2 = arrayList2.size();
        for (int r22 = 0; r22 < size2; r22++) {
            C0843a c0843a = (C0843a) arrayList2.get(r22);
            int r4 = c0843a.f3455a;
            C0872x c0872x = (C0872x) this.f291e;
            if (r4 == 1) {
                c0872x.m2383a(c0843a);
                c0872x.m2386d(c0843a.f3456b, c0843a.f3457c);
            } else if (r4 == 2) {
                c0872x.m2383a(c0843a);
                int r42 = c0843a.f3456b;
                int r3 = c0843a.f3457c;
                RecyclerView recyclerView = c0872x.f3635a;
                recyclerView.m1910O(r42, r3, true);
                recyclerView.f2520f0 = true;
                recyclerView.f2514c0.f3404c += r3;
            } else if (r4 == 4) {
                c0872x.m2383a(c0843a);
                c0872x.m2385c(c0843a.f3456b, c0843a.f3457c);
            } else if (r4 == 8) {
                c0872x.m2383a(c0843a);
                c0872x.m2387e(c0843a.f3456b, c0843a.f3457c);
            }
        }
        m300k(arrayList2);
    }

    /* renamed from: c */
    public void m292c(C0843a c0843a) {
        int r3;
        C0218a c0218a;
        int r02 = c0843a.f3455a;
        if (r02 == 1 || r02 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m301l = m301l(c0843a.f3456b, r02);
        int r2 = c0843a.f3456b;
        int r32 = c0843a.f3455a;
        if (r32 == 2) {
            r3 = 0;
        } else {
            if (r32 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0843a);
            }
            r3 = 1;
        }
        int r6 = 1;
        int r7 = 1;
        while (true) {
            int r8 = c0843a.f3457c;
            c0218a = (C0218a) this.f289c;
            if (r6 >= r8) {
                break;
            }
            int m301l2 = m301l((r3 * r6) + c0843a.f3456b, c0843a.f3455a);
            int r10 = c0843a.f3455a;
            if (r10 == 2 ? m301l2 != m301l : !(r10 == 4 && m301l2 == m301l + 1)) {
                C0843a m298i = m298i(r10, m301l, r7);
                m293d(m298i, r2);
                c0218a.mo610c(m298i);
                if (c0843a.f3455a == 4) {
                    r2 += r7;
                }
                r7 = 1;
                m301l = m301l2;
            } else {
                r7++;
            }
            r6++;
        }
        c0218a.mo610c(c0843a);
        if (r7 > 0) {
            C0843a m298i2 = m298i(c0843a.f3455a, m301l, r7);
            m293d(m298i2, r2);
            c0218a.mo610c(m298i2);
        }
    }

    /* renamed from: d */
    public void m293d(C0843a c0843a, int r5) {
        C0872x c0872x = (C0872x) this.f291e;
        c0872x.m2383a(c0843a);
        int r12 = c0843a.f3455a;
        if (r12 != 2) {
            if (r12 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0872x.m2385c(r5, c0843a.f3457c);
        } else {
            int r4 = c0843a.f3457c;
            RecyclerView recyclerView = c0872x.f3635a;
            recyclerView.m1910O(r5, r4, true);
            recyclerView.f2520f0 = true;
            recyclerView.f2514c0.f3404c += r4;
        }
    }

    /* renamed from: e */
    public int m294e(int r7, int r8) {
        ArrayList arrayList = (ArrayList) this.f290d;
        int size = arrayList.size();
        while (r8 < size) {
            C0843a c0843a = (C0843a) arrayList.get(r8);
            int r3 = c0843a.f3455a;
            if (r3 == 8) {
                int r32 = c0843a.f3456b;
                if (r32 == r7) {
                    r7 = c0843a.f3457c;
                } else {
                    if (r32 < r7) {
                        r7--;
                    }
                    if (c0843a.f3457c <= r7) {
                        r7++;
                    }
                }
            } else {
                int r4 = c0843a.f3456b;
                if (r4 > r7) {
                    continue;
                } else if (r3 == 2) {
                    int r2 = c0843a.f3457c;
                    if (r7 < r4 + r2) {
                        return -1;
                    }
                    r7 -= r2;
                } else if (r3 == 1) {
                    r7 += c0843a.f3457c;
                }
            }
            r8++;
        }
        return r7;
    }

    /* renamed from: f */
    public boolean m295f() {
        return ((ArrayList) this.f288b).size() > 0;
    }

    /* renamed from: g */
    public void m296g(String str, String value) {
        AbstractC2492i.m4915e(value, "value");
        C0055g c0055g = (C0055g) this.f290d;
        c0055g.getClass();
        AbstractC2480a.m4893v(str);
        AbstractC2480a.m4894w(value, str);
        c0055g.m224w(str);
        AbstractC2480a.m4883e(c0055g, str, value);
    }

    /* renamed from: h */
    public void m297h(String method, C0117d c0117d) {
        AbstractC2492i.m4915e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (c0117d == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0002c.m16k("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC2480a.m4870K(method)) {
            throw new IllegalArgumentException(AbstractC0002c.m16k("method ", method, " must not have a request body.").toString());
        }
        this.f288b = method;
        this.f291e = c0117d;
    }

    /* renamed from: i */
    public C0843a m298i(int r2, int r3, int r4) {
        C0843a c0843a = (C0843a) ((C0218a) this.f289c).mo608a();
        if (c0843a != null) {
            c0843a.f3455a = r2;
            c0843a.f3456b = r3;
            c0843a.f3457c = r4;
            return c0843a;
        }
        C0843a c0843a2 = new C0843a();
        c0843a2.f3455a = r2;
        c0843a2.f3456b = r3;
        c0843a2.f3457c = r4;
        return c0843a2;
    }

    /* renamed from: j */
    public void m299j(C0843a c0843a) {
        ((ArrayList) this.f290d).add(c0843a);
        int r02 = c0843a.f3455a;
        C0872x c0872x = (C0872x) this.f291e;
        if (r02 == 1) {
            c0872x.m2386d(c0843a.f3456b, c0843a.f3457c);
            return;
        }
        if (r02 == 2) {
            int r03 = c0843a.f3456b;
            int r5 = c0843a.f3457c;
            RecyclerView recyclerView = c0872x.f3635a;
            recyclerView.m1910O(r03, r5, false);
            recyclerView.f2520f0 = true;
            return;
        }
        if (r02 == 4) {
            c0872x.m2385c(c0843a.f3456b, c0843a.f3457c);
        } else if (r02 == 8) {
            c0872x.m2387e(c0843a.f3456b, c0843a.f3457c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0843a);
        }
    }

    /* renamed from: k */
    public void m300k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
            C0843a c0843a = (C0843a) arrayList.get(r12);
            c0843a.getClass();
            ((C0218a) this.f289c).mo610c(c0843a);
        }
        arrayList.clear();
    }

    /* renamed from: l */
    public int m301l(int r10, int r11) {
        int r8;
        int r7;
        ArrayList arrayList = (ArrayList) this.f290d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0843a c0843a = (C0843a) arrayList.get(size);
            int r5 = c0843a.f3455a;
            if (r5 == 8) {
                int r3 = c0843a.f3456b;
                int r52 = c0843a.f3457c;
                if (r3 < r52) {
                    r7 = r3;
                    r8 = r52;
                } else {
                    r8 = r3;
                    r7 = r52;
                }
                if (r10 < r7 || r10 > r8) {
                    if (r10 < r3) {
                        if (r11 == 1) {
                            c0843a.f3456b = r3 + 1;
                            c0843a.f3457c = r52 + 1;
                        } else if (r11 == 2) {
                            c0843a.f3456b = r3 - 1;
                            c0843a.f3457c = r52 - 1;
                        }
                    }
                } else if (r7 == r3) {
                    if (r11 == 1) {
                        c0843a.f3457c = r52 + 1;
                    } else if (r11 == 2) {
                        c0843a.f3457c = r52 - 1;
                    }
                    r10++;
                } else {
                    if (r11 == 1) {
                        c0843a.f3456b = r3 + 1;
                    } else if (r11 == 2) {
                        c0843a.f3456b = r3 - 1;
                    }
                    r10--;
                }
            } else {
                int r32 = c0843a.f3456b;
                if (r32 <= r10) {
                    if (r5 == 1) {
                        r10 -= c0843a.f3457c;
                    } else if (r5 == 2) {
                        r10 += c0843a.f3457c;
                    }
                } else if (r11 == 1) {
                    c0843a.f3456b = r32 + 1;
                } else if (r11 == 2) {
                    c0843a.f3456b = r32 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0843a c0843a2 = (C0843a) arrayList.get(size2);
            int r2 = c0843a2.f3455a;
            C0218a c0218a = (C0218a) this.f289c;
            if (r2 == 8) {
                int r22 = c0843a2.f3457c;
                if (r22 == c0843a2.f3456b || r22 < 0) {
                    arrayList.remove(size2);
                    c0218a.mo610c(c0843a2);
                }
            } else if (c0843a2.f3457c <= 0) {
                arrayList.remove(size2);
                c0218a.mo610c(c0843a2);
            }
        }
        return r10;
    }

    /* renamed from: m */
    public void m302m(String str) {
        if (AbstractC0025r.m156I(str, "ws:", true)) {
            String substring = str.substring(3);
            AbstractC2492i.m4914d(substring, "substring(...)");
            str = "http:".concat(substring);
        } else if (AbstractC0025r.m156I(str, "wss:", true)) {
            String substring2 = str.substring(4);
            AbstractC2492i.m4914d(substring2, "substring(...)");
            str = "https:".concat(substring2);
        }
        AbstractC2492i.m4915e(str, "<this>");
        C0084p c0084p = new C0084p();
        c0084p.m281c(null, str);
        this.f289c = c0084p.m279a();
    }

    public String toString() {
        switch (this.f287a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f288b) + ", mProviderPackage: " + ((String) this.f289c) + ", mQuery: " + ((String) this.f290d) + ", mCertificates:");
                int r2 = 0;
                while (true) {
                    List list = (List) this.f291e;
                    if (r2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(r2);
                    for (int r4 = 0; r4 < list2.size(); r4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(r4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    r2++;
                }
            default:
                return super.toString();
        }
    }

    public C0090v(String str, String str2, String str3, List list) {
        this.f287a = 1;
        str.getClass();
        this.f288b = str;
        str2.getClass();
        this.f289c = str2;
        this.f290d = str3;
        list.getClass();
        this.f291e = list;
        this.f292f = str + "-" + str2 + "-" + str3;
    }

    public C0090v(C0872x c0872x) {
        this.f287a = 2;
        this.f289c = new C0218a(30);
        this.f288b = new ArrayList();
        this.f290d = new ArrayList();
        this.f291e = c0872x;
        this.f292f = new C0055g(25, this);
    }

    public C0090v() {
        this.f287a = 0;
        this.f292f = C2669s.f8608a;
        this.f288b = "GET";
        this.f290d = new C0055g(2);
    }
}
