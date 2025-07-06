package p002A1;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0666p;
import androidx.fragment.app.C0640G;
import androidx.fragment.app.C0644K;
import androidx.fragment.app.C0655e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p003B.AbstractC0043q;
import p017G.InterfaceC0139c;
import p024I1.C0209a;
import p028K.AbstractC0283P;
import p043P.InterfaceC0416h;
import p079e.C0788F;
import p080e0.AbstractC0838V;
import p080e0.C0872x;
import p104l.C2540U;
import p104l.C2609t;
import p123s.C2723d;
import p123s.C2724e;
import p126t.C2750b;
import p132v.C2826f;

/* renamed from: A1.h */
/* loaded from: classes.dex */
public final class C0015h implements InterfaceC0416h, InterfaceC0139c {

    /* renamed from: e */
    public static C0015h f23e;

    /* renamed from: a */
    public final /* synthetic */ int f24a;

    /* renamed from: b */
    public Object f25b;

    /* renamed from: c */
    public Object f26c;

    /* renamed from: d */
    public Object f27d;

    public /* synthetic */ C0015h(int r12) {
        this.f24a = r12;
    }

    /* renamed from: A */
    public static C0015h m100A(Context context, AttributeSet attributeSet, int[] r4, int r5) {
        return new C0015h(context, context.obtainStyledAttributes(attributeSet, r4, r5, 0));
    }

    /* renamed from: B */
    public static void m101B() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* renamed from: C */
    public void m102C() {
        ((TypedArray) this.f26c).recycle();
    }

    /* renamed from: D */
    public void m103D(C2724e c2724e, int r5, int r6, int r7) {
        int r02 = c2724e.f8844b0;
        int r12 = c2724e.f8846c0;
        c2724e.f8844b0 = 0;
        c2724e.f8846c0 = 0;
        c2724e.m5273O(r6);
        c2724e.m5270L(r7);
        if (r02 < 0) {
            c2724e.f8844b0 = 0;
        } else {
            c2724e.f8844b0 = r02;
        }
        if (r12 < 0) {
            c2724e.f8846c0 = 0;
        } else {
            c2724e.f8846c0 = r12;
        }
        C2724e c2724e2 = (C2724e) this.f27d;
        c2724e2.f8898t0 = r5;
        c2724e2.m5302U();
    }

    /* renamed from: E */
    public void m104E(View view) {
        if (((ArrayList) this.f27d).remove(view)) {
            C0872x c0872x = (C0872x) this.f25b;
            AbstractC0838V m1892I = RecyclerView.m1892I(view);
            if (m1892I != null) {
                int r12 = m1892I.f3439p;
                RecyclerView recyclerView = c0872x.f3635a;
                if (recyclerView.m1907L()) {
                    m1892I.f3440q = r12;
                    recyclerView.f2540p0.add(m1892I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    m1892I.f3424a.setImportantForAccessibility(r12);
                }
                m1892I.f3439p = 0;
            }
        }
    }

    /* renamed from: F */
    public void m105F(C2724e c2724e) {
        ArrayList arrayList = (ArrayList) this.f25b;
        arrayList.clear();
        int size = c2724e.f8895q0.size();
        for (int r3 = 0; r3 < size; r3++) {
            C2723d c2723d = (C2723d) c2724e.f8895q0.get(r3);
            int[] r6 = c2723d.f8872p0;
            if (r6[0] == 3 || r6[1] == 3) {
                arrayList.add(c2723d);
            }
        }
        c2724e.f8897s0.f9018b = true;
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: b */
    public Uri mo107b() {
        return (Uri) this.f27d;
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: c */
    public Object mo108c() {
        return null;
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: d */
    public Uri mo109d() {
        return (Uri) this.f25b;
    }

    /* renamed from: e */
    public void m110e(AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p) {
        if (((ArrayList) this.f25b).contains(abstractComponentCallbacksC0666p)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0666p);
        }
        synchronized (((ArrayList) this.f25b)) {
            ((ArrayList) this.f25b).add(abstractComponentCallbacksC0666p);
        }
        abstractComponentCallbacksC0666p.f2322k = true;
    }

    /* renamed from: f */
    public void m111f(View view, int r4, boolean z2) {
        RecyclerView recyclerView = ((C0872x) this.f25b).f3635a;
        int childCount = r4 < 0 ? recyclerView.getChildCount() : m125t(r4);
        ((C0209a) this.f26c).m600e(childCount, z2);
        if (z2) {
            m128w(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1892I(view);
    }

    /* renamed from: g */
    public void m112g(View view, int r4, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0872x) this.f25b).f3635a;
        int childCount = r4 < 0 ? recyclerView.getChildCount() : m125t(r4);
        ((C0209a) this.f26c).m600e(childCount, z2);
        if (z2) {
            m128w(view);
        }
        AbstractC0838V m1892I = RecyclerView.m1892I(view);
        if (m1892I != null) {
            if (!m1892I.m2334k() && !m1892I.m2339p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m1892I + recyclerView.m1943y());
            }
            m1892I.f3433j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // p043P.InterfaceC0416h
    public ClipDescription getDescription() {
        return (ClipDescription) this.f26c;
    }

    /* renamed from: h */
    public void m113h(int r5) {
        AbstractC0838V m1892I;
        int m125t = m125t(r5);
        ((C0209a) this.f26c).m602g(m125t);
        RecyclerView recyclerView = ((C0872x) this.f25b).f3635a;
        View childAt = recyclerView.getChildAt(m125t);
        if (childAt != null && (m1892I = RecyclerView.m1892I(childAt)) != null) {
            if (m1892I.m2334k() && !m1892I.m2339p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + m1892I + recyclerView.m1943y());
            }
            m1892I.m2324a(256);
        }
        recyclerView.detachViewFromParent(m125t);
    }

    /* renamed from: i */
    public AbstractComponentCallbacksC0666p m114i(String str) {
        C0644K c0644k = (C0644K) ((HashMap) this.f26c).get(str);
        if (c0644k != null) {
            return c0644k.f2188c;
        }
        return null;
    }

    /* renamed from: j */
    public AbstractComponentCallbacksC0666p m115j(String str) {
        for (C0644K c0644k : ((HashMap) this.f26c).values()) {
            if (c0644k != null) {
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
                if (!str.equals(abstractComponentCallbacksC0666p.f2316e)) {
                    abstractComponentCallbacksC0666p = abstractComponentCallbacksC0666p.f2331t.f2128c.m115j(str);
                }
                if (abstractComponentCallbacksC0666p != null) {
                    return abstractComponentCallbacksC0666p;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public ArrayList m116k() {
        ArrayList arrayList = new ArrayList();
        for (C0644K c0644k : ((HashMap) this.f26c).values()) {
            if (c0644k != null) {
                arrayList.add(c0644k);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public View m117l(int r2) {
        return ((C0872x) this.f25b).f3635a.getChildAt(m125t(r2));
    }

    /* renamed from: m */
    public int m118m() {
        return ((C0872x) this.f25b).f3635a.getChildCount() - ((ArrayList) this.f27d).size();
    }

    @Override // p017G.InterfaceC0139c
    /* renamed from: n */
    public void mo119n() {
        View view = (View) this.f25b;
        view.clearAnimation();
        ((ViewGroup) this.f26c).endViewTransition(view);
        ((C0655e) this.f27d).m1738d();
    }

    /* renamed from: o */
    public ColorStateList m120o(int r4) {
        int resourceId;
        ColorStateList m75u;
        TypedArray typedArray = (TypedArray) this.f26c;
        return (!typedArray.hasValue(r4) || (resourceId = typedArray.getResourceId(r4, 0)) == 0 || (m75u = AbstractC0005b.m75u((Context) this.f25b, resourceId)) == null) ? typedArray.getColorStateList(r4) : m75u;
    }

    /* renamed from: p */
    public Drawable m121p(int r3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f26c;
        return (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0) ? typedArray.getDrawable(r3) : AbstractC0580g.m1449n((Context) this.f25b, resourceId);
    }

    /* renamed from: q */
    public Drawable m122q(int r5) {
        int resourceId;
        Drawable m4981g;
        if (!((TypedArray) this.f26c).hasValue(r5) || (resourceId = ((TypedArray) this.f26c).getResourceId(r5, 0)) == 0) {
            return null;
        }
        C2609t m5069a = C2609t.m5069a();
        Context context = (Context) this.f25b;
        synchronized (m5069a) {
            m4981g = m5069a.f8472a.m4981g(context, resourceId, true);
        }
        return m4981g;
    }

    /* renamed from: r */
    public Typeface m123r(int r10, int r11, C2540U c2540u) {
        int resourceId = ((TypedArray) this.f26c).getResourceId(r10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f27d) == null) {
            this.f27d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f27d;
        ThreadLocal threadLocal = AbstractC0043q.f72a;
        Context context = (Context) this.f25b;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0043q.m190c(context, resourceId, typedValue, r11, c2540u, true, false);
    }

    /* renamed from: s */
    public List m124s() {
        ArrayList arrayList;
        if (((ArrayList) this.f25b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f25b)) {
            arrayList = new ArrayList((ArrayList) this.f25b);
        }
        return arrayList;
    }

    /* renamed from: t */
    public int m125t(int r6) {
        if (r6 < 0) {
            return -1;
        }
        int childCount = ((C0872x) this.f25b).f3635a.getChildCount();
        int r2 = r6;
        while (r2 < childCount) {
            C0209a c0209a = (C0209a) this.f26c;
            int m597b = r6 - (r2 - c0209a.m597b(r2));
            if (m597b == 0) {
                while (c0209a.m599d(r2)) {
                    r2++;
                }
                return r2;
            }
            r2 += m597b;
        }
        return -1;
    }

    public String toString() {
        switch (this.f24a) {
            case 5:
                return ((C0209a) this.f26c).toString() + ", hidden list:" + ((ArrayList) this.f27d).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public View m126u(int r2) {
        return ((C0872x) this.f25b).f3635a.getChildAt(r2);
    }

    /* renamed from: v */
    public int m127v() {
        return ((C0872x) this.f25b).f3635a.getChildCount();
    }

    /* renamed from: w */
    public void m128w(View view) {
        ((ArrayList) this.f27d).add(view);
        C0872x c0872x = (C0872x) this.f25b;
        AbstractC0838V m1892I = RecyclerView.m1892I(view);
        if (m1892I != null) {
            int r12 = m1892I.f3440q;
            View view2 = m1892I.f3424a;
            if (r12 != -1) {
                m1892I.f3439p = r12;
            } else {
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                m1892I.f3439p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0872x.f3635a;
            if (recyclerView.m1907L()) {
                m1892I.f3440q = 4;
                recyclerView.f2540p0.add(m1892I);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: x */
    public void m129x(C0644K c0644k) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
        String str = abstractComponentCallbacksC0666p.f2316e;
        HashMap hashMap = (HashMap) this.f26c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0666p.f2316e, c0644k);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0666p);
        }
    }

    /* renamed from: y */
    public void m130y(C0644K c0644k) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
        if (abstractComponentCallbacksC0666p.f2296A) {
            ((C0640G) this.f27d).m1702b(abstractComponentCallbacksC0666p);
        }
        if (((C0644K) ((HashMap) this.f26c).put(abstractComponentCallbacksC0666p.f2316e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0666p);
        }
    }

    /* renamed from: z */
    public boolean m131z(int r7, C2723d c2723d, C2826f c2826f) {
        int[] r02 = c2723d.f8872p0;
        int r2 = r02[0];
        C2750b c2750b = (C2750b) this.f26c;
        c2750b.f9005a = r2;
        c2750b.f9006b = r02[1];
        c2750b.f9007c = c2723d.m5288q();
        c2750b.f9008d = c2723d.m5284k();
        c2750b.f9013i = false;
        c2750b.f9014j = r7;
        boolean z2 = c2750b.f9005a == 3;
        boolean z3 = c2750b.f9006b == 3;
        boolean z4 = z2 && c2723d.f8837W > 0.0f;
        boolean z5 = z3 && c2723d.f8837W > 0.0f;
        int[] r4 = c2723d.f8876t;
        if (z4 && r4[0] == 4) {
            c2750b.f9005a = 1;
        }
        if (z5 && r4[1] == 4) {
            c2750b.f9006b = 1;
        }
        c2826f.m5437b(c2723d, c2750b);
        c2723d.m5273O(c2750b.f9009e);
        c2723d.m5270L(c2750b.f9010f);
        c2723d.f8819E = c2750b.f9012h;
        c2723d.m5267I(c2750b.f9011g);
        c2750b.f9014j = 0;
        return c2750b.f9013i;
    }

    public /* synthetic */ C0015h(Object obj, Object obj2, Object obj3, int r4) {
        this.f24a = r4;
        this.f25b = obj;
        this.f26c = obj2;
        this.f27d = obj3;
    }

    public C0015h() {
        this.f24a = 3;
        this.f25b = new ArrayList();
        this.f26c = new HashMap();
    }

    public C0015h(C0872x c0872x) {
        this.f24a = 5;
        this.f25b = c0872x;
        this.f26c = new C0209a();
        this.f27d = new ArrayList();
    }

    public C0015h(Context context, TypedArray typedArray) {
        this.f24a = 7;
        this.f25b = context;
        this.f26c = typedArray;
    }

    public C0015h(Context context, LocationManager locationManager) {
        this.f24a = 4;
        this.f27d = new C0788F();
        this.f25b = context;
        this.f26c = locationManager;
    }

    public C0015h(C2724e c2724e) {
        this.f24a = 9;
        this.f25b = new ArrayList();
        this.f26c = new C2750b();
        this.f27d = c2724e;
    }

    public C0015h(Matcher matcher, String input) {
        this.f24a = 0;
        AbstractC2492i.m4915e(input, "input");
        this.f25b = matcher;
        this.f26c = new C0014g(this);
    }

    @Override // p043P.InterfaceC0416h
    /* renamed from: a */
    public void mo106a() {
    }
}
