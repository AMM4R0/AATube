package p130u0;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0744a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p000A.AbstractC0002c;
import p002A1.C0015h;
import p008C1.C0091w;
import p010D0.C0113k;
import p010D0.RunnableC0107e;
import p013E0.HandlerC0128e;
import p019H.RunnableC0171a;
import p020H0.C0183a;
import p023I0.C0203a;
import p026J0.C0224e;
import p036M1.AbstractC0387m;
import p104l.C2579j;
import p112o.AbstractC2684d;
import p112o.C2682b;
import p112o.C2683c;
import p124s0.C2731b;
import p124s0.C2733d;
import p124s0.C2734e;
import p127t0.AbstractC2769f;
import p127t0.C2774k;
import p127t0.InterfaceC2766c;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;
import p133v0.AbstractC2863r;
import p133v0.C2852g;
import p139x0.C2888c;

/* renamed from: u0.k */
/* loaded from: classes.dex */
public final class C2787k implements InterfaceC2770g, InterfaceC2771h {

    /* renamed from: c */
    public final InterfaceC2766c f9103c;

    /* renamed from: d */
    public final C2777a f9104d;

    /* renamed from: e */
    public final C0113k f9105e;

    /* renamed from: h */
    public final int f9108h;

    /* renamed from: i */
    public final BinderC2796t f9109i;

    /* renamed from: j */
    public boolean f9110j;

    /* renamed from: n */
    public final /* synthetic */ C2779c f9114n;

    /* renamed from: a */
    public final LinkedList f9102a = new LinkedList();

    /* renamed from: f */
    public final HashSet f9106f = new HashSet();

    /* renamed from: g */
    public final HashMap f9107g = new HashMap();

    /* renamed from: k */
    public final ArrayList f9111k = new ArrayList();

    /* renamed from: l */
    public C2731b f9112l = null;

    /* renamed from: m */
    public int f9113m = 0;

    public C2787k(C2779c c2779c, AbstractC2769f abstractC2769f) {
        this.f9114n = c2779c;
        Looper looper = c2779c.f9099m.getLooper();
        C0015h m5386a = abstractC2769f.m5386a();
        C0091w c0091w = new C0091w((C2683c) m5386a.f25b, (String) m5386a.f26c, (String) m5386a.f27d);
        AbstractC0387m abstractC0387m = (AbstractC0387m) abstractC2769f.f9066c.f347b;
        AbstractC2863r.m5474c(abstractC0387m);
        InterfaceC2766c mo375b = abstractC0387m.mo375b(abstractC2769f.f9064a, looper, c0091w, abstractC2769f.f9067d, this, this);
        String str = abstractC2769f.f9065b;
        if (str != null && (mo375b instanceof AbstractC0744a)) {
            ((AbstractC0744a) mo375b).f2716r = str;
        }
        if (str != null && (mo375b instanceof AbstractServiceConnectionC2783g)) {
            if (mo375b != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        this.f9103c = mo375b;
        this.f9104d = abstractC2769f.f9068e;
        this.f9105e = new C0113k(12);
        this.f9108h = abstractC2769f.f9069f;
        if (!mo375b.mo594k()) {
            this.f9109i = null;
            return;
        }
        Context context = c2779c.f9091e;
        HandlerC0128e handlerC0128e = c2779c.f9099m;
        C0015h m5386a2 = abstractC2769f.m5386a();
        this.f9109i = new BinderC2796t(context, handlerC0128e, new C0091w((C2683c) m5386a2.f25b, (String) m5386a2.f26c, (String) m5386a2.f27d));
    }

    @Override // p127t0.InterfaceC2771h
    /* renamed from: a */
    public final void mo5390a(C2731b c2731b) {
        m5412o(c2731b, null);
    }

    @Override // p127t0.InterfaceC2770g
    /* renamed from: b */
    public final void mo5388b(int r4) {
        Looper myLooper = Looper.myLooper();
        C2779c c2779c = this.f9114n;
        if (myLooper == c2779c.f9099m.getLooper()) {
            m5406i(r4);
        } else {
            c2779c.f9099m.post(new RunnableC0171a(r4, 3, this));
        }
    }

    @Override // p127t0.InterfaceC2770g
    /* renamed from: c */
    public final void mo5389c() {
        Looper myLooper = Looper.myLooper();
        C2779c c2779c = this.f9114n;
        if (myLooper == c2779c.f9099m.getLooper()) {
            m5405h();
        } else {
            c2779c.f9099m.post(new RunnableC0107e(18, this));
        }
    }

    /* renamed from: d */
    public final void m5401d(C2731b c2731b) {
        HashSet hashSet = this.f9106f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC2863r.m5476e(c2731b, C2731b.f8970e)) {
                this.f9103c.mo2032d();
            }
            throw null;
        }
    }

    /* renamed from: e */
    public final void m5402e(Status status) {
        AbstractC2863r.m5472a(this.f9114n.f9099m);
        m5403f(status, null, false);
    }

    /* renamed from: f */
    public final void m5403f(Status status, RuntimeException runtimeException, boolean z2) {
        AbstractC2863r.m5472a(this.f9114n.f9099m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f9102a.iterator();
        while (it.hasNext()) {
            AbstractC2792p abstractC2792p = (AbstractC2792p) it.next();
            if (!z2 || abstractC2792p.f9125a == 2) {
                if (status != null) {
                    abstractC2792p.mo5419c(status);
                } else {
                    abstractC2792p.mo5420d(runtimeException);
                }
                it.remove();
            }
        }
    }

    /* renamed from: g */
    public final void m5404g() {
        LinkedList linkedList = this.f9102a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            AbstractC2792p abstractC2792p = (AbstractC2792p) arrayList.get(r3);
            if (!this.f9103c.mo2031c()) {
                return;
            }
            if (m5408k(abstractC2792p)) {
                linkedList.remove(abstractC2792p);
            }
        }
    }

    /* renamed from: h */
    public final void m5405h() {
        C2779c c2779c = this.f9114n;
        AbstractC2863r.m5472a(c2779c.f9099m);
        this.f9112l = null;
        m5401d(C2731b.f8970e);
        if (this.f9110j) {
            HandlerC0128e handlerC0128e = c2779c.f9099m;
            C2777a c2777a = this.f9104d;
            handlerC0128e.removeMessages(11, c2777a);
            c2779c.f9099m.removeMessages(9, c2777a);
            this.f9110j = false;
        }
        Iterator it = this.f9107g.values().iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        m5404g();
        m5407j();
    }

    /* renamed from: i */
    public final void m5406i(int r7) {
        C2779c c2779c = this.f9114n;
        AbstractC2863r.m5472a(c2779c.f9099m);
        this.f9112l = null;
        this.f9110j = true;
        String mo2033e = this.f9103c.mo2033e();
        C0113k c0113k = this.f9105e;
        c0113k.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (r7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (r7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (mo2033e != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(mo2033e);
        }
        c0113k.m389m(true, new Status(20, sb.toString()));
        HandlerC0128e handlerC0128e = c2779c.f9099m;
        C2777a c2777a = this.f9104d;
        handlerC0128e.sendMessageDelayed(Message.obtain(handlerC0128e, 9, c2777a), 5000L);
        HandlerC0128e handlerC0128e2 = c2779c.f9099m;
        handlerC0128e2.sendMessageDelayed(Message.obtain(handlerC0128e2, 11, c2777a), 120000L);
        ((SparseIntArray) c2779c.f9093g.f347b).clear();
        Iterator it = this.f9107g.values().iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
    }

    /* renamed from: j */
    public final void m5407j() {
        C2779c c2779c = this.f9114n;
        HandlerC0128e handlerC0128e = c2779c.f9099m;
        C2777a c2777a = this.f9104d;
        handlerC0128e.removeMessages(12, c2777a);
        HandlerC0128e handlerC0128e2 = c2779c.f9099m;
        handlerC0128e2.sendMessageDelayed(handlerC0128e2.obtainMessage(12, c2777a), c2779c.f9087a);
    }

    /* renamed from: k */
    public final boolean m5408k(AbstractC2792p abstractC2792p) {
        C2733d c2733d;
        if (!(abstractC2792p instanceof AbstractC2792p)) {
            InterfaceC2766c interfaceC2766c = this.f9103c;
            abstractC2792p.mo5422f(this.f9105e, interfaceC2766c.mo594k());
            try {
                abstractC2792p.mo5421e(this);
            } catch (DeadObjectException unused) {
                mo5388b(1);
                interfaceC2766c.mo2037i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        C2733d[] mo5418b = abstractC2792p.mo5418b(this);
        if (mo5418b != null && mo5418b.length != 0) {
            C2733d[] mo2030b = this.f9103c.mo2030b();
            if (mo2030b == null) {
                mo2030b = new C2733d[0];
            }
            int length = mo2030b.length;
            C2682b c2682b = new C2682b();
            if (length == 0) {
                c2682b.f8681a = AbstractC2684d.f8653a;
                c2682b.f8682b = AbstractC2684d.f8654b;
            } else {
                c2682b.m5173a(length);
            }
            c2682b.f8683c = 0;
            for (C2733d c2733d2 : mo2030b) {
                c2682b.put(c2733d2.f8978a, Long.valueOf(c2733d2.m5322a()));
            }
            int length2 = mo5418b.length;
            for (int r6 = 0; r6 < length2; r6++) {
                c2733d = mo5418b[r6];
                Long l2 = (Long) c2682b.getOrDefault(c2733d.f8978a, null);
                if (l2 == null || l2.longValue() < c2733d.m5322a()) {
                    break;
                }
            }
        }
        c2733d = null;
        if (c2733d == null) {
            InterfaceC2766c interfaceC2766c2 = this.f9103c;
            abstractC2792p.mo5422f(this.f9105e, interfaceC2766c2.mo594k());
            try {
                abstractC2792p.mo5421e(this);
            } catch (DeadObjectException unused2) {
                mo5388b(1);
                interfaceC2766c2.mo2037i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f9103c.getClass().getName();
        String str = c2733d.f8978a;
        long m5322a = c2733d.m5322a();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(m5322a);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f9114n.f9100n || !abstractC2792p.mo5417a(this)) {
            abstractC2792p.mo5420d(new C2774k(c2733d));
            return true;
        }
        C2788l c2788l = new C2788l(this.f9104d, c2733d);
        int indexOf = this.f9111k.indexOf(c2788l);
        if (indexOf >= 0) {
            C2788l c2788l2 = (C2788l) this.f9111k.get(indexOf);
            this.f9114n.f9099m.removeMessages(15, c2788l2);
            HandlerC0128e handlerC0128e = this.f9114n.f9099m;
            Message obtain = Message.obtain(handlerC0128e, 15, c2788l2);
            this.f9114n.getClass();
            handlerC0128e.sendMessageDelayed(obtain, 5000L);
        } else {
            this.f9111k.add(c2788l);
            HandlerC0128e handlerC0128e2 = this.f9114n.f9099m;
            Message obtain2 = Message.obtain(handlerC0128e2, 15, c2788l);
            this.f9114n.getClass();
            handlerC0128e2.sendMessageDelayed(obtain2, 5000L);
            HandlerC0128e handlerC0128e3 = this.f9114n.f9099m;
            Message obtain3 = Message.obtain(handlerC0128e3, 16, c2788l);
            this.f9114n.getClass();
            handlerC0128e3.sendMessageDelayed(obtain3, 120000L);
            C2731b c2731b = new C2731b(2, null);
            if (!m5409l(c2731b)) {
                this.f9114n.m5396b(c2731b, this.f9108h);
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m5409l(C2731b c2731b) {
        synchronized (C2779c.f9085q) {
            this.f9114n.getClass();
        }
        return false;
    }

    /* renamed from: m */
    public final void m5410m() {
        C2779c c2779c = this.f9114n;
        AbstractC2863r.m5472a(c2779c.f9099m);
        InterfaceC2766c interfaceC2766c = this.f9103c;
        if (interfaceC2766c.mo2031c() || interfaceC2766c.mo2029a()) {
            return;
        }
        try {
            C0113k c0113k = c2779c.f9093g;
            Context context = c2779c.f9091e;
            c0113k.getClass();
            AbstractC2863r.m5474c(context);
            int mo334m = interfaceC2766c.mo334m();
            SparseIntArray sparseIntArray = (SparseIntArray) c0113k.f347b;
            int r8 = sparseIntArray.get(mo334m, -1);
            if (r8 == -1) {
                r8 = 0;
                int r9 = 0;
                while (true) {
                    if (r9 >= sparseIntArray.size()) {
                        r8 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(r9);
                    if (keyAt > mo334m && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        r9++;
                    }
                }
                if (r8 == -1) {
                    r8 = ((C2734e) c0113k.f348c).m5329b(context, mo334m);
                }
                sparseIntArray.put(mo334m, r8);
            }
            if (r8 != 0) {
                C2731b c2731b = new C2731b(r8, null);
                String name = interfaceC2766c.getClass().getName();
                String c2731b2 = c2731b.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + c2731b2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(c2731b2);
                Log.w("GoogleApiManager", sb.toString());
                m5412o(c2731b, null);
                return;
            }
            C2789m c2789m = new C2789m(c2779c, interfaceC2766c, this.f9104d);
            if (interfaceC2766c.mo594k()) {
                BinderC2796t binderC2796t = this.f9109i;
                AbstractC2863r.m5474c(binderC2796t);
                C0203a c0203a = binderC2796t.f9144h;
                if (c0203a != null) {
                    c0203a.mo2036h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(binderC2796t));
                C0091w c0091w = binderC2796t.f9143g;
                c0091w.f299g = valueOf;
                HandlerC0128e handlerC0128e = binderC2796t.f9140d;
                binderC2796t.f9144h = (C0203a) binderC2796t.f9141e.mo375b(binderC2796t.f9139c, handlerC0128e.getLooper(), c0091w, (C0183a) c0091w.f298f, binderC2796t, binderC2796t);
                binderC2796t.f9145i = c2789m;
                Set set = binderC2796t.f9142f;
                if (set == null || set.isEmpty()) {
                    handlerC0128e.post(new RunnableC0107e(20, binderC2796t));
                } else {
                    C0203a c0203a2 = binderC2796t.f9144h;
                    c0203a2.getClass();
                    c0203a2.mo2038j(new C2852g(c0203a2));
                }
            }
            try {
                interfaceC2766c.mo2038j(c2789m);
            } catch (SecurityException e2) {
                m5412o(new C2731b(10), e2);
            }
        } catch (IllegalStateException e3) {
            m5412o(new C2731b(10), e3);
        }
    }

    /* renamed from: n */
    public final void m5411n(AbstractC2792p abstractC2792p) {
        AbstractC2863r.m5472a(this.f9114n.f9099m);
        boolean mo2031c = this.f9103c.mo2031c();
        LinkedList linkedList = this.f9102a;
        if (mo2031c) {
            if (m5408k(abstractC2792p)) {
                m5407j();
                return;
            } else {
                linkedList.add(abstractC2792p);
                return;
            }
        }
        linkedList.add(abstractC2792p);
        C2731b c2731b = this.f9112l;
        if (c2731b == null || c2731b.f8972b == 0 || c2731b.f8973c == null) {
            m5410m();
        } else {
            m5412o(c2731b, null);
        }
    }

    /* renamed from: o */
    public final void m5412o(C2731b c2731b, RuntimeException runtimeException) {
        C0203a c0203a;
        AbstractC2863r.m5472a(this.f9114n.f9099m);
        BinderC2796t binderC2796t = this.f9109i;
        if (binderC2796t != null && (c0203a = binderC2796t.f9144h) != null) {
            c0203a.mo2036h();
        }
        AbstractC2863r.m5472a(this.f9114n.f9099m);
        this.f9112l = null;
        ((SparseIntArray) this.f9114n.f9093g.f347b).clear();
        m5401d(c2731b);
        if ((this.f9103c instanceof C2888c) && c2731b.f8972b != 24) {
            C2779c c2779c = this.f9114n;
            c2779c.f9088b = true;
            HandlerC0128e handlerC0128e = c2779c.f9099m;
            handlerC0128e.sendMessageDelayed(handlerC0128e.obtainMessage(19), 300000L);
        }
        if (c2731b.f8972b == 4) {
            m5402e(C2779c.f9084p);
            return;
        }
        if (this.f9102a.isEmpty()) {
            this.f9112l = c2731b;
            return;
        }
        if (runtimeException != null) {
            AbstractC2863r.m5472a(this.f9114n.f9099m);
            m5403f(null, runtimeException, false);
            return;
        }
        if (!this.f9114n.f9100n) {
            m5402e(C2779c.m5393c(this.f9104d, c2731b));
            return;
        }
        m5403f(C2779c.m5393c(this.f9104d, c2731b), null, true);
        if (this.f9102a.isEmpty() || m5409l(c2731b) || this.f9114n.m5396b(c2731b, this.f9108h)) {
            return;
        }
        if (c2731b.f8972b == 18) {
            this.f9110j = true;
        }
        if (!this.f9110j) {
            m5402e(C2779c.m5393c(this.f9104d, c2731b));
            return;
        }
        HandlerC0128e handlerC0128e2 = this.f9114n.f9099m;
        Message obtain = Message.obtain(handlerC0128e2, 9, this.f9104d);
        this.f9114n.getClass();
        handlerC0128e2.sendMessageDelayed(obtain, 5000L);
    }

    /* renamed from: p */
    public final void m5413p() {
        AbstractC2863r.m5472a(this.f9114n.f9099m);
        Status status = C2779c.f9083o;
        m5402e(status);
        this.f9105e.m389m(false, status);
        for (AbstractC2782f abstractC2782f : (AbstractC2782f[]) this.f9107g.keySet().toArray(new AbstractC2782f[0])) {
            m5411n(new C2798v(new C0224e()));
        }
        m5401d(new C2731b(4));
        InterfaceC2766c interfaceC2766c = this.f9103c;
        if (interfaceC2766c.mo2031c()) {
            interfaceC2766c.mo2035g(new C2579j(this));
        }
    }
}
