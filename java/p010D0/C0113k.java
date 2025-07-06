package p010D0;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC0686J;
import androidx.lifecycle.C0687K;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.InterfaceC0708r;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0051c;
import p006C.C0055g;
import p008C1.C0080l;
import p019H.C0177g;
import p019H.RunnableC0171a;
import p026J0.C0224e;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;
import p028K.C0291Y;
import p028K.C0323p;
import p064Y.C0542a;
import p066Z.C0559a;
import p079e.C0805n;
import p079e.LayoutInflaterFactory2C0815x;
import p080e0.AbstractC0838V;
import p080e0.C0846b0;
import p080e0.C0854f0;
import p099j.AbstractC2416a;
import p099j.C2421f;
import p102k.MenuC2450C;
import p102k.MenuC2466m;
import p112o.C2685e;
import p112o.C2691k;
import p112o.C2692l;
import p124s0.C2734e;
import p124s0.C2735f;
import p127t0.C2767d;

/* renamed from: D0.k */
/* loaded from: classes.dex */
public final class C0113k {

    /* renamed from: a */
    public final /* synthetic */ int f346a;

    /* renamed from: b */
    public Object f347b;

    /* renamed from: c */
    public Object f348c;

    public /* synthetic */ C0113k(int r12, boolean z2) {
        this.f346a = r12;
    }

    /* renamed from: a */
    public void m377a(AbstractC0838V abstractC0838V, C0323p c0323p) {
        C2691k c2691k = (C2691k) this.f347b;
        C0854f0 c0854f0 = (C0854f0) c2691k.getOrDefault(abstractC0838V, null);
        if (c0854f0 == null) {
            c0854f0 = C0854f0.m2351a();
            c2691k.put(abstractC0838V, c0854f0);
        }
        c0854f0.f3512c = c0323p;
        c0854f0.f3510a |= 8;
    }

    /* renamed from: b */
    public void m378b(String str, PrintWriter printWriter) {
        C2692l c2692l = ((C0559a) this.f348c).f1566c;
        if (c2692l.f8687c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c2692l.f8687c <= 0) {
                return;
            }
            if (c2692l.f8686b[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c2692l.f8685a[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    /* renamed from: c */
    public void m379c(int r5) {
        int[] r02 = (int[]) this.f347b;
        if (r02 == null) {
            int[] r52 = new int[Math.max(r5, 10) + 1];
            this.f347b = r52;
            Arrays.fill(r52, -1);
        } else if (r5 >= r02.length) {
            int length = r02.length;
            while (length <= r5) {
                length *= 2;
            }
            int[] r53 = new int[length];
            this.f347b = r53;
            System.arraycopy(r02, 0, r53, 0, r02.length);
            int[] r54 = (int[]) this.f347b;
            Arrays.fill(r54, r02.length, r54.length, -1);
        }
    }

    /* renamed from: d */
    public void m380d(int r4, int r5) {
        int[] r02 = (int[]) this.f347b;
        if (r02 == null || r4 >= r02.length) {
            return;
        }
        int r03 = r4 + r5;
        m379c(r03);
        int[] r12 = (int[]) this.f347b;
        System.arraycopy(r12, r4, r12, r03, (r12.length - r4) - r5);
        Arrays.fill((int[]) this.f347b, r4, r03, -1);
        ArrayList arrayList = (ArrayList) this.f348c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0846b0 c0846b0 = (C0846b0) ((ArrayList) this.f348c).get(size);
            int r2 = c0846b0.f3462a;
            if (r2 >= r4) {
                c0846b0.f3462a = r2 + r5;
            }
        }
    }

    /* renamed from: e */
    public void m381e(int r6, int r7) {
        int[] r02 = (int[]) this.f347b;
        if (r02 == null || r6 >= r02.length) {
            return;
        }
        int r03 = r6 + r7;
        m379c(r03);
        int[] r12 = (int[]) this.f347b;
        System.arraycopy(r12, r03, r12, r6, (r12.length - r6) - r7);
        int[] r13 = (int[]) this.f347b;
        Arrays.fill(r13, r13.length - r7, r13.length, -1);
        ArrayList arrayList = (ArrayList) this.f348c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0846b0 c0846b0 = (C0846b0) ((ArrayList) this.f348c).get(size);
            int r3 = c0846b0.f3462a;
            if (r3 >= r6) {
                if (r3 < r03) {
                    ((ArrayList) this.f348c).remove(size);
                } else {
                    c0846b0.f3462a = r3 - r7;
                }
            }
        }
    }

    /* renamed from: f */
    public void m382f(AbstractC2416a abstractC2416a) {
        C0080l c0080l = (C0080l) this.f347b;
        ((ActionMode.Callback) c0080l.f219a).onDestroyActionMode(c0080l.m268d(abstractC2416a));
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) this.f348c;
        if (layoutInflaterFactory2C0815x.f3340w != null) {
            layoutInflaterFactory2C0815x.f3329l.getDecorView().removeCallbacks(layoutInflaterFactory2C0815x.f3341x);
        }
        if (layoutInflaterFactory2C0815x.f3339v != null) {
            C0291Y c0291y = layoutInflaterFactory2C0815x.f3342y;
            if (c0291y != null) {
                c0291y.m796b();
            }
            C0291Y m768a = AbstractC0283P.m768a(layoutInflaterFactory2C0815x.f3339v);
            m768a.m795a(0.0f);
            layoutInflaterFactory2C0815x.f3342y = m768a;
            m768a.m798d(new C0805n(2, this));
        }
        layoutInflaterFactory2C0815x.f3338u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0815x.f3294A;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(viewGroup);
        layoutInflaterFactory2C0815x.m2254J();
    }

    /* renamed from: g */
    public boolean m383g(AbstractC2416a abstractC2416a, MenuC2466m menuC2466m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0815x) this.f348c).f3294A;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(viewGroup);
        C0080l c0080l = (C0080l) this.f347b;
        C2421f m268d = c0080l.m268d(abstractC2416a);
        C2691k c2691k = (C2691k) c0080l.f222d;
        Menu menu = (Menu) c2691k.getOrDefault(menuC2466m, null);
        if (menu == null) {
            menu = new MenuC2450C((Context) c0080l.f220b, menuC2466m);
            c2691k.put(menuC2466m, menu);
        }
        return ((ActionMode.Callback) c0080l.f219a).onPrepareActionMode(m268d, menu);
    }

    /* renamed from: h */
    public void m384h(C0177g c0177g) {
        int r02 = c0177g.f556b;
        Handler handler = (Handler) this.f348c;
        C0055g c0055g = (C0055g) this.f347b;
        if (r02 != 0) {
            handler.post(new RunnableC0171a(r02, 0, c0055g));
        } else {
            handler.post(new RunnableC0106d(c0055g, 1, c0177g.f555a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m385i(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D0.C0113k.m385i(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: j */
    public C0323p m386j(AbstractC0838V abstractC0838V, int r7) {
        C0854f0 c0854f0;
        C0323p c0323p;
        C2691k c2691k = (C2691k) this.f347b;
        int m5176e = c2691k.m5176e(abstractC0838V);
        if (m5176e >= 0 && (c0854f0 = (C0854f0) c2691k.m5181j(m5176e)) != null) {
            int r3 = c0854f0.f3510a;
            if ((r3 & r7) != 0) {
                int r32 = r3 & (~r7);
                c0854f0.f3510a = r32;
                if (r7 == 4) {
                    c0323p = c0854f0.f3511b;
                } else {
                    if (r7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0323p = c0854f0.f3512c;
                }
                if ((r32 & 12) == 0) {
                    c2691k.m5180i(m5176e);
                    c0854f0.f3510a = 0;
                    c0854f0.f3511b = null;
                    c0854f0.f3512c = null;
                    C0854f0.f3509d.mo610c(c0854f0);
                }
                return c0323p;
            }
        }
        return null;
    }

    /* renamed from: k */
    public void m387k(AbstractC0838V abstractC0838V) {
        C0854f0 c0854f0 = (C0854f0) ((C2691k) this.f347b).getOrDefault(abstractC0838V, null);
        if (c0854f0 == null) {
            return;
        }
        c0854f0.f3510a &= -2;
    }

    /* renamed from: l */
    public void m388l(AbstractC0838V abstractC0838V) {
        C2685e c2685e = (C2685e) this.f348c;
        int m5167g = c2685e.m5167g() - 1;
        while (true) {
            if (m5167g < 0) {
                break;
            }
            if (abstractC0838V == c2685e.m5168h(m5167g)) {
                Object[] objArr = c2685e.f8658c;
                Object obj = objArr[m5167g];
                Object obj2 = C2685e.f8655e;
                if (obj != obj2) {
                    objArr[m5167g] = obj2;
                    c2685e.f8656a = true;
                }
            } else {
                m5167g--;
            }
        }
        C0854f0 c0854f0 = (C0854f0) ((C2691k) this.f347b).remove(abstractC0838V);
        if (c0854f0 != null) {
            c0854f0.f3510a = 0;
            c0854f0.f3511b = null;
            c0854f0.f3512c = null;
            C0854f0.f3509d.mo610c(c0854f0);
        }
    }

    /* renamed from: m */
    public void m389m(boolean z2, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f347b)) {
            hashMap = new HashMap((Map) this.f347b);
        }
        synchronized (((Map) this.f348c)) {
            hashMap2 = new HashMap((Map) this.f348c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0224e) entry2.getKey()).m611a(new C2767d(status));
            }
        }
    }

    public String toString() {
        int lastIndexOf;
        switch (this.f346a) {
            case 4:
                return "Bounds{lower=" + ((C0051c) this.f347b) + " upper=" + ((C0051c) this.f348c) + "}";
            case 5:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Object obj = this.f347b;
                String simpleName = obj.getClass().getSimpleName();
                if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
                sb.append(simpleName);
                sb.append('{');
                sb.append(Integer.toHexString(System.identityHashCode(obj)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0113k(Context context) {
        C0109g c0109g;
        this.f346a = 0;
        this.f347b = new C0112j(context, C2735f.f8984b);
        synchronized (C0109g.class) {
            try {
                if (C0109g.f336d == null) {
                    C0109g.f336d = new C0109g(context.getApplicationContext());
                }
                c0109g = C0109g.f336d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f348c = c0109g;
    }

    public /* synthetic */ C0113k(Object obj, int r2, Object obj2) {
        this.f346a = r2;
        this.f347b = obj;
        this.f348c = obj2;
    }

    public /* synthetic */ C0113k(Object obj, Object obj2, Object obj3, int r4) {
        this.f346a = r4;
        this.f348c = obj;
        this.f347b = obj2;
    }

    public C0113k(int r2) {
        this.f346a = r2;
        switch (r2) {
            case 12:
                this.f347b = Collections.synchronizedMap(new WeakHashMap());
                this.f348c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 13:
            default:
                this.f347b = new C2691k();
                this.f348c = new C2685e();
                break;
            case 14:
                C2734e c2734e = C2734e.f8982d;
                this.f347b = new SparseIntArray();
                this.f348c = c2734e;
                break;
        }
    }

    public C0113k(InterfaceC0708r interfaceC0708r, C0688L store) {
        C0559a c0559a;
        this.f346a = 5;
        this.f347b = interfaceC0708r;
        AbstractC2492i.m4915e(store, "store");
        C0542a defaultCreationExtras = C0542a.f1473b;
        AbstractC2492i.m4915e(defaultCreationExtras, "defaultCreationExtras");
        String canonicalName = C0559a.class.getCanonicalName();
        if (canonicalName != null) {
            String key = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC2492i.m4915e(key, "key");
            LinkedHashMap linkedHashMap = store.f2391a;
            AbstractC0686J abstractC0686J = (AbstractC0686J) linkedHashMap.get(key);
            if (C0559a.class.isInstance(abstractC0686J)) {
                AbstractC2492i.m4913c(abstractC0686J, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(defaultCreationExtras.f1474a);
                linkedHashMap2.put(C0687K.f2390b, key);
                try {
                    c0559a = new C0559a();
                } catch (AbstractMethodError unused) {
                    c0559a = new C0559a();
                }
                abstractC0686J = c0559a;
                AbstractC0686J abstractC0686J2 = (AbstractC0686J) linkedHashMap.put(key, abstractC0686J);
                if (abstractC0686J2 != null) {
                    abstractC0686J2.mo1414a();
                }
            }
            this.f348c = (C0559a) abstractC0686J;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0113k(ArrayList arrayList, ArrayList arrayList2) {
        this.f346a = 1;
        int size = arrayList.size();
        this.f347b = new int[size];
        this.f348c = new float[size];
        for (int r12 = 0; r12 < size; r12++) {
            ((int[]) this.f347b)[r12] = ((Integer) arrayList.get(r12)).intValue();
            ((float[]) this.f348c)[r12] = ((Float) arrayList2.get(r12)).floatValue();
        }
    }

    public C0113k(int r2, int r3) {
        this.f346a = 1;
        this.f347b = new int[]{r2, r3};
        this.f348c = new float[]{0.0f, 1.0f};
    }

    public C0113k(int r2, int r3, int r4) {
        this.f346a = 1;
        this.f347b = new int[]{r2, r3, r4};
        this.f348c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0113k(Animation animation) {
        this.f346a = 7;
        this.f347b = animation;
        this.f348c = null;
    }

    public C0113k(Animator animator) {
        this.f346a = 7;
        this.f347b = null;
        this.f348c = animator;
    }

    public C0113k(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x, C0080l c0080l) {
        this.f346a = 8;
        this.f348c = layoutInflaterFactory2C0815x;
        this.f347b = c0080l;
    }
}
