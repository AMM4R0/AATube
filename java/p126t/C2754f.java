package p126t;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C2754f implements InterfaceC2752d {

    /* renamed from: d */
    public final AbstractC2763o f9028d;

    /* renamed from: f */
    public int f9030f;

    /* renamed from: g */
    public int f9031g;

    /* renamed from: a */
    public AbstractC2763o f9025a = null;

    /* renamed from: b */
    public boolean f9026b = false;

    /* renamed from: c */
    public boolean f9027c = false;

    /* renamed from: e */
    public int f9029e = 1;

    /* renamed from: h */
    public int f9032h = 1;

    /* renamed from: i */
    public C2755g f9033i = null;

    /* renamed from: j */
    public boolean f9034j = false;

    /* renamed from: k */
    public final ArrayList f9035k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f9036l = new ArrayList();

    public C2754f(AbstractC2763o abstractC2763o) {
        this.f9028d = abstractC2763o;
    }

    @Override // p126t.InterfaceC2752d
    /* renamed from: a */
    public final void mo5343a(InterfaceC2752d interfaceC2752d) {
        ArrayList arrayList = this.f9036l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2754f) it.next()).f9034j) {
                return;
            }
        }
        this.f9027c = true;
        AbstractC2763o abstractC2763o = this.f9025a;
        if (abstractC2763o != null) {
            abstractC2763o.mo5343a(this);
        }
        if (this.f9026b) {
            this.f9028d.mo5343a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C2754f c2754f = null;
        int r2 = 0;
        while (it2.hasNext()) {
            C2754f c2754f2 = (C2754f) it2.next();
            if (!(c2754f2 instanceof C2755g)) {
                r2++;
                c2754f = c2754f2;
            }
        }
        if (c2754f != null && r2 == 1 && c2754f.f9034j) {
            C2755g c2755g = this.f9033i;
            if (c2755g != null) {
                if (!c2755g.f9034j) {
                    return;
                } else {
                    this.f9030f = this.f9032h * c2755g.f9031g;
                }
            }
            mo5360d(c2754f.f9031g + this.f9030f);
        }
        AbstractC2763o abstractC2763o2 = this.f9025a;
        if (abstractC2763o2 != null) {
            abstractC2763o2.mo5343a(this);
        }
    }

    /* renamed from: b */
    public final void m5358b(AbstractC2763o abstractC2763o) {
        this.f9035k.add(abstractC2763o);
        if (this.f9034j) {
            abstractC2763o.mo5343a(abstractC2763o);
        }
    }

    /* renamed from: c */
    public final void m5359c() {
        this.f9036l.clear();
        this.f9035k.clear();
        this.f9034j = false;
        this.f9031g = 0;
        this.f9027c = false;
        this.f9026b = false;
    }

    /* renamed from: d */
    public void mo5360d(int r2) {
        if (this.f9034j) {
            return;
        }
        this.f9034j = true;
        this.f9031g = r2;
        Iterator it = this.f9035k.iterator();
        while (it.hasNext()) {
            InterfaceC2752d interfaceC2752d = (InterfaceC2752d) it.next();
            interfaceC2752d.mo5343a(interfaceC2752d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9028d.f9051b.f8856h0);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        switch (this.f9029e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f9034j ? Integer.valueOf(this.f9031g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9036l.size());
        sb.append(":d=");
        sb.append(this.f9035k.size());
        sb.append(">");
        return sb.toString();
    }
}
