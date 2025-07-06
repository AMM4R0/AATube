package p090i0;

import android.view.ViewGroup;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p112o.C2682b;

/* renamed from: i0.q */
/* loaded from: classes.dex */
public abstract class AbstractC0971q {

    /* renamed from: a */
    public static final C0955a f4057a;

    /* renamed from: b */
    public static final ThreadLocal f4058b;

    /* renamed from: c */
    public static final ArrayList f4059c;

    static {
        C0955a c0955a = new C0955a();
        c0955a.f3991A = new ArrayList();
        c0955a.f3992B = true;
        c0955a.f3994D = false;
        c0955a.f3995E = 0;
        c0955a.f3992B = false;
        c0955a.m2547I(new C0962h(2));
        c0955a.m2547I(new C0960f());
        c0955a.m2547I(new C0962h(1));
        f4057a = c0955a;
        f4058b = new ThreadLocal();
        f4059c = new ArrayList();
    }

    /* renamed from: a */
    public static void m2581a(ViewGroup viewGroup, AbstractC0967m abstractC0967m) {
        ArrayList arrayList = f4059c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC0967m == null) {
            abstractC0967m = f4057a;
        }
        AbstractC0967m clone = abstractC0967m.clone();
        ArrayList arrayList2 = (ArrayList) m2582b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0967m) it.next()).mo2554w(viewGroup);
            }
        }
        clone.m2573h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0970p viewTreeObserverOnPreDrawListenerC0970p = new ViewTreeObserverOnPreDrawListenerC0970p();
        viewTreeObserverOnPreDrawListenerC0970p.f4055a = clone;
        viewTreeObserverOnPreDrawListenerC0970p.f4056b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0970p);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0970p);
    }

    /* renamed from: b */
    public static C2682b m2582b() {
        C2682b c2682b;
        ThreadLocal threadLocal = f4058b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2682b = (C2682b) weakReference.get()) != null) {
            return c2682b;
        }
        C2682b c2682b2 = new C2682b();
        threadLocal.set(new WeakReference(c2682b2));
        return c2682b2;
    }
}
