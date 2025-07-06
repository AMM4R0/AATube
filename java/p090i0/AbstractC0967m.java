package p090i0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p008C1.C0080l;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0290X;
import p028K.C0298c0;
import p103k0.AbstractC2480a;
import p112o.AbstractC2684d;
import p112o.C2682b;
import p112o.C2685e;
import p124s0.C2738i;

/* renamed from: i0.m */
/* loaded from: classes.dex */
public abstract class AbstractC0967m implements Cloneable {

    /* renamed from: w */
    public static final Animator[] f4027w = new Animator[0];

    /* renamed from: x */
    public static final int[] f4028x = {2, 1, 3, 4};

    /* renamed from: y */
    public static final C2738i f4029y = new C2738i();

    /* renamed from: z */
    public static final ThreadLocal f4030z = new ThreadLocal();

    /* renamed from: k */
    public ArrayList f4041k;

    /* renamed from: l */
    public ArrayList f4042l;

    /* renamed from: m */
    public InterfaceC0965k[] f4043m;

    /* renamed from: a */
    public final String f4031a = getClass().getName();

    /* renamed from: b */
    public long f4032b = -1;

    /* renamed from: c */
    public long f4033c = -1;

    /* renamed from: d */
    public TimeInterpolator f4034d = null;

    /* renamed from: e */
    public final ArrayList f4035e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f4036f = new ArrayList();

    /* renamed from: g */
    public C0080l f4037g = new C0080l(2);

    /* renamed from: h */
    public C0080l f4038h = new C0080l(2);

    /* renamed from: i */
    public C0955a f4039i = null;

    /* renamed from: j */
    public final int[] f4040j = f4028x;

    /* renamed from: n */
    public final ArrayList f4044n = new ArrayList();

    /* renamed from: o */
    public Animator[] f4045o = f4027w;

    /* renamed from: p */
    public int f4046p = 0;

    /* renamed from: q */
    public boolean f4047q = false;

    /* renamed from: r */
    public boolean f4048r = false;

    /* renamed from: s */
    public AbstractC0967m f4049s = null;

    /* renamed from: t */
    public ArrayList f4050t = null;

    /* renamed from: u */
    public ArrayList f4051u = new ArrayList();

    /* renamed from: v */
    public C2738i f4052v = f4029y;

    /* renamed from: b */
    public static void m2567b(C0080l c0080l, View view, C0975u c0975u) {
        ((C2682b) c0080l.f219a).put(view, c0975u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0080l.f220b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        String m707k = AbstractC0272E.m707k(view);
        if (m707k != null) {
            C2682b c2682b = (C2682b) c0080l.f222d;
            if (c2682b.containsKey(m707k)) {
                c2682b.put(m707k, null);
            } else {
                c2682b.put(m707k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C2685e c2685e = (C2685e) c0080l.f221c;
                if (c2685e.f8656a) {
                    c2685e.m5164d();
                }
                if (AbstractC2684d.m5160b(c2685e.f8657b, c2685e.f8659d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2685e.m5166f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c2685e.m5165e(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2685e.m5166f(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: p */
    public static C2682b m2568p() {
        ThreadLocal threadLocal = f4030z;
        C2682b c2682b = (C2682b) threadLocal.get();
        if (c2682b != null) {
            return c2682b;
        }
        C2682b c2682b2 = new C2682b();
        threadLocal.set(c2682b2);
        return c2682b2;
    }

    /* renamed from: u */
    public static boolean m2569u(C0975u c0975u, C0975u c0975u2, String str) {
        Object obj = c0975u.f4063a.get(str);
        Object obj2 = c0975u2.f4063a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo2540A(long j2) {
        this.f4033c = j2;
    }

    /* renamed from: C */
    public void mo2542C(TimeInterpolator timeInterpolator) {
        this.f4034d = timeInterpolator;
    }

    /* renamed from: D */
    public void mo2543D(C2738i c2738i) {
        if (c2738i == null) {
            this.f4052v = f4029y;
        } else {
            this.f4052v = c2738i;
        }
    }

    /* renamed from: F */
    public void mo2545F(long j2) {
        this.f4032b = j2;
    }

    /* renamed from: G */
    public final void m2570G() {
        if (this.f4046p == 0) {
            m2580v(this, InterfaceC0966l.f4022a);
            this.f4048r = false;
        }
        this.f4046p++;
    }

    /* renamed from: H */
    public String mo2546H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4033c != -1) {
            sb.append("dur(");
            sb.append(this.f4033c);
            sb.append(") ");
        }
        if (this.f4032b != -1) {
            sb.append("dly(");
            sb.append(this.f4032b);
            sb.append(") ");
        }
        if (this.f4034d != null) {
            sb.append("interp(");
            sb.append(this.f4034d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f4035e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4036f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int r12 = 0; r12 < arrayList.size(); r12++) {
                    if (r12 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(r12));
                }
            }
            if (arrayList2.size() > 0) {
                for (int r4 = 0; r4 < arrayList2.size(); r4++) {
                    if (r4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(r4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m2571a(InterfaceC0965k interfaceC0965k) {
        if (this.f4050t == null) {
            this.f4050t = new ArrayList();
        }
        this.f4050t.add(interfaceC0965k);
    }

    /* renamed from: c */
    public void mo2548c() {
        ArrayList arrayList = this.f4044n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4045o);
        this.f4045o = f4027w;
        for (int r12 = size - 1; r12 >= 0; r12--) {
            Animator animator = animatorArr[r12];
            animatorArr[r12] = null;
            animator.cancel();
        }
        this.f4045o = animatorArr;
        m2580v(this, InterfaceC0966l.f4024c);
    }

    /* renamed from: d */
    public abstract void mo2549d(C0975u c0975u);

    /* renamed from: e */
    public final void m2572e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0975u c0975u = new C0975u(view);
            if (z2) {
                mo2551g(c0975u);
            } else {
                mo2549d(c0975u);
            }
            c0975u.f4065c.add(this);
            mo2550f(c0975u);
            if (z2) {
                m2567b(this.f4037g, view, c0975u);
            } else {
                m2567b(this.f4038h, view, c0975u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int r02 = 0; r02 < viewGroup.getChildCount(); r02++) {
                m2572e(viewGroup.getChildAt(r02), z2);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo2551g(C0975u c0975u);

    /* renamed from: h */
    public final void m2573h(ViewGroup viewGroup, boolean z2) {
        m2574i(z2);
        ArrayList arrayList = this.f4035e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4036f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2572e(viewGroup, z2);
            return;
        }
        for (int r3 = 0; r3 < arrayList.size(); r3++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(r3)).intValue());
            if (findViewById != null) {
                C0975u c0975u = new C0975u(findViewById);
                if (z2) {
                    mo2551g(c0975u);
                } else {
                    mo2549d(c0975u);
                }
                c0975u.f4065c.add(this);
                mo2550f(c0975u);
                if (z2) {
                    m2567b(this.f4037g, findViewById, c0975u);
                } else {
                    m2567b(this.f4038h, findViewById, c0975u);
                }
            }
        }
        for (int r12 = 0; r12 < arrayList2.size(); r12++) {
            View view = (View) arrayList2.get(r12);
            C0975u c0975u2 = new C0975u(view);
            if (z2) {
                mo2551g(c0975u2);
            } else {
                mo2549d(c0975u2);
            }
            c0975u2.f4065c.add(this);
            mo2550f(c0975u2);
            if (z2) {
                m2567b(this.f4037g, view, c0975u2);
            } else {
                m2567b(this.f4038h, view, c0975u2);
            }
        }
    }

    /* renamed from: i */
    public final void m2574i(boolean z2) {
        if (z2) {
            ((C2682b) this.f4037g.f219a).clear();
            ((SparseArray) this.f4037g.f220b).clear();
            ((C2685e) this.f4037g.f221c).m5162b();
        } else {
            ((C2682b) this.f4038h.f219a).clear();
            ((SparseArray) this.f4038h.f220b).clear();
            ((C2685e) this.f4038h.f221c).m5162b();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0967m clone() {
        try {
            AbstractC0967m abstractC0967m = (AbstractC0967m) super.clone();
            abstractC0967m.f4051u = new ArrayList();
            abstractC0967m.f4037g = new C0080l(2);
            abstractC0967m.f4038h = new C0080l(2);
            abstractC0967m.f4041k = null;
            abstractC0967m.f4042l = null;
            abstractC0967m.f4049s = this;
            abstractC0967m.f4050t = null;
            return abstractC0967m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: k */
    public Animator mo2559k(ViewGroup viewGroup, C0975u c0975u, C0975u c0975u2) {
        return null;
    }

    /* renamed from: l */
    public void mo2553l(ViewGroup viewGroup, C0080l c0080l, C0080l c0080l2, ArrayList arrayList, ArrayList arrayList2) {
        int r16;
        View view;
        C0975u c0975u;
        Animator animator;
        C0975u c0975u2;
        C2682b m2568p = m2568p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2577o().getClass();
        int r5 = 0;
        while (r5 < size) {
            C0975u c0975u3 = (C0975u) arrayList.get(r5);
            C0975u c0975u4 = (C0975u) arrayList2.get(r5);
            if (c0975u3 != null && !c0975u3.f4065c.contains(this)) {
                c0975u3 = null;
            }
            if (c0975u4 != null && !c0975u4.f4065c.contains(this)) {
                c0975u4 = null;
            }
            if ((c0975u3 != null || c0975u4 != null) && (c0975u3 == null || c0975u4 == null || mo2565s(c0975u3, c0975u4))) {
                Animator mo2559k = mo2559k(viewGroup, c0975u3, c0975u4);
                if (mo2559k != null) {
                    String str = this.f4031a;
                    if (c0975u4 != null) {
                        String[] mo2560q = mo2560q();
                        view = c0975u4.f4064b;
                        if (mo2560q != null && mo2560q.length > 0) {
                            c0975u2 = new C0975u(view);
                            C0975u c0975u5 = (C0975u) ((C2682b) c0080l2.f219a).getOrDefault(view, null);
                            r16 = size;
                            if (c0975u5 != null) {
                                int r6 = 0;
                                while (r6 < mo2560q.length) {
                                    HashMap hashMap = c0975u2.f4063a;
                                    String str2 = mo2560q[r6];
                                    hashMap.put(str2, c0975u5.f4063a.get(str2));
                                    r6++;
                                    mo2560q = mo2560q;
                                }
                            }
                            int r3 = m2568p.f8683c;
                            int r4 = 0;
                            while (true) {
                                if (r4 >= r3) {
                                    animator = mo2559k;
                                    break;
                                }
                                C0964j c0964j = (C0964j) m2568p.getOrDefault((Animator) m2568p.m5179h(r4), null);
                                if (c0964j.f4018c != null && c0964j.f4016a == view && c0964j.f4017b.equals(str) && c0964j.f4018c.equals(c0975u2)) {
                                    animator = null;
                                    break;
                                }
                                r4++;
                            }
                        } else {
                            r16 = size;
                            animator = mo2559k;
                            c0975u2 = null;
                        }
                        mo2559k = animator;
                        c0975u = c0975u2;
                    } else {
                        r16 = size;
                        view = c0975u3.f4064b;
                        c0975u = null;
                    }
                    if (mo2559k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0964j c0964j2 = new C0964j();
                        c0964j2.f4016a = view;
                        c0964j2.f4017b = str;
                        c0964j2.f4018c = c0975u;
                        c0964j2.f4019d = windowId;
                        c0964j2.f4020e = this;
                        c0964j2.f4021f = mo2559k;
                        m2568p.put(mo2559k, c0964j2);
                        this.f4051u.add(mo2559k);
                    }
                    r5++;
                    size = r16;
                }
            }
            r16 = size;
            r5++;
            size = r16;
        }
        if (sparseIntArray.size() != 0) {
            for (int r42 = 0; r42 < sparseIntArray.size(); r42++) {
                C0964j c0964j3 = (C0964j) m2568p.getOrDefault((Animator) this.f4051u.get(sparseIntArray.keyAt(r42)), null);
                c0964j3.f4021f.setStartDelay(c0964j3.f4021f.getStartDelay() + (sparseIntArray.valueAt(r42) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public final void m2575m() {
        int r02 = this.f4046p - 1;
        this.f4046p = r02;
        if (r02 == 0) {
            m2580v(this, InterfaceC0966l.f4023b);
            for (int r2 = 0; r2 < ((C2685e) this.f4037g.f221c).m5167g(); r2++) {
                View view = (View) ((C2685e) this.f4037g.f221c).m5168h(r2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int r22 = 0; r22 < ((C2685e) this.f4038h.f221c).m5167g(); r22++) {
                View view2 = (View) ((C2685e) this.f4038h.f221c).m5168h(r22);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4048r = true;
        }
    }

    /* renamed from: n */
    public final C0975u m2576n(View view, boolean z2) {
        C0955a c0955a = this.f4039i;
        if (c0955a != null) {
            return c0955a.m2576n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f4041k : this.f4042l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int r3 = 0;
        while (true) {
            if (r3 >= size) {
                r3 = -1;
                break;
            }
            C0975u c0975u = (C0975u) arrayList.get(r3);
            if (c0975u == null) {
                return null;
            }
            if (c0975u.f4064b == view) {
                break;
            }
            r3++;
        }
        if (r3 >= 0) {
            return (C0975u) (z2 ? this.f4042l : this.f4041k).get(r3);
        }
        return null;
    }

    /* renamed from: o */
    public final AbstractC0967m m2577o() {
        C0955a c0955a = this.f4039i;
        return c0955a != null ? c0955a.m2577o() : this;
    }

    /* renamed from: q */
    public String[] mo2560q() {
        return null;
    }

    /* renamed from: r */
    public final C0975u m2578r(View view, boolean z2) {
        C0955a c0955a = this.f4039i;
        if (c0955a != null) {
            return c0955a.m2578r(view, z2);
        }
        return (C0975u) ((C2682b) (z2 ? this.f4037g : this.f4038h).f219a).getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo2565s(C0975u c0975u, C0975u c0975u2) {
        if (c0975u == null || c0975u2 == null) {
            return false;
        }
        String[] mo2560q = mo2560q();
        if (mo2560q == null) {
            Iterator it = c0975u.f4063a.keySet().iterator();
            while (it.hasNext()) {
                if (m2569u(c0975u, c0975u2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : mo2560q) {
            if (!m2569u(c0975u, c0975u2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: t */
    public final boolean m2579t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4035e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4036f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo2546H("");
    }

    /* renamed from: v */
    public final void m2580v(AbstractC0967m abstractC0967m, InterfaceC0966l interfaceC0966l) {
        AbstractC0967m abstractC0967m2 = this.f4049s;
        if (abstractC0967m2 != null) {
            abstractC0967m2.m2580v(abstractC0967m, interfaceC0966l);
        }
        ArrayList arrayList = this.f4050t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f4050t.size();
        InterfaceC0965k[] interfaceC0965kArr = this.f4043m;
        if (interfaceC0965kArr == null) {
            interfaceC0965kArr = new InterfaceC0965k[size];
        }
        this.f4043m = null;
        InterfaceC0965k[] interfaceC0965kArr2 = (InterfaceC0965k[]) this.f4050t.toArray(interfaceC0965kArr);
        for (int r3 = 0; r3 < size; r3++) {
            interfaceC0966l.mo410a(interfaceC0965kArr2[r3], abstractC0967m);
            interfaceC0965kArr2[r3] = null;
        }
        this.f4043m = interfaceC0965kArr2;
    }

    /* renamed from: w */
    public void mo2554w(ViewGroup viewGroup) {
        if (this.f4048r) {
            return;
        }
        ArrayList arrayList = this.f4044n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4045o);
        this.f4045o = f4027w;
        for (int r02 = size - 1; r02 >= 0; r02--) {
            Animator animator = animatorArr[r02];
            animatorArr[r02] = null;
            animator.pause();
        }
        this.f4045o = animatorArr;
        m2580v(this, InterfaceC0966l.f4025d);
        this.f4047q = true;
    }

    /* renamed from: x */
    public AbstractC0967m mo2555x(InterfaceC0965k interfaceC0965k) {
        AbstractC0967m abstractC0967m;
        ArrayList arrayList = this.f4050t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0965k) && (abstractC0967m = this.f4049s) != null) {
            abstractC0967m.mo2555x(interfaceC0965k);
        }
        if (this.f4050t.size() == 0) {
            this.f4050t = null;
        }
        return this;
    }

    /* renamed from: y */
    public void mo2556y(View view) {
        if (this.f4047q) {
            if (!this.f4048r) {
                ArrayList arrayList = this.f4044n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4045o);
                this.f4045o = f4027w;
                for (int r02 = size - 1; r02 >= 0; r02--) {
                    Animator animator = animatorArr[r02];
                    animatorArr[r02] = null;
                    animator.resume();
                }
                this.f4045o = animatorArr;
                m2580v(this, InterfaceC0966l.f4026e);
            }
            this.f4047q = false;
        }
    }

    /* renamed from: z */
    public void mo2557z() {
        m2570G();
        C2682b m2568p = m2568p();
        Iterator it = this.f4051u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m2568p.containsKey(animator)) {
                m2570G();
                if (animator != null) {
                    animator.addListener(new C0298c0(this, m2568p));
                    long j2 = this.f4033c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f4032b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4034d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0290X(3, this));
                    animator.start();
                }
            }
        }
        this.f4051u.clear();
        m2575m();
    }

    /* renamed from: E */
    public void mo2544E() {
    }

    /* renamed from: B */
    public void mo2541B(AbstractC2480a abstractC2480a) {
    }

    /* renamed from: f */
    public void mo2550f(C0975u c0975u) {
    }
}
