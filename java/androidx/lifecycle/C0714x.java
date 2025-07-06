package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l;
import java.util.Map;
import p000A.AbstractC0002c;
import p006C.C0055g;
import p106m.C2637a;
import p109n.C2674c;
import p109n.C2675d;
import p109n.C2677f;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class C0714x {

    /* renamed from: j */
    public static final Object f2428j = new Object();

    /* renamed from: a */
    public final Object f2429a;

    /* renamed from: b */
    public final C2677f f2430b = new C2677f();

    /* renamed from: c */
    public int f2431c = 0;

    /* renamed from: d */
    public boolean f2432d;

    /* renamed from: e */
    public volatile Object f2433e;

    /* renamed from: f */
    public volatile Object f2434f;

    /* renamed from: g */
    public int f2435g;

    /* renamed from: h */
    public boolean f2436h;

    /* renamed from: i */
    public boolean f2437i;

    public C0714x() {
        Object obj = f2428j;
        this.f2434f = obj;
        this.f2433e = obj;
        this.f2435g = -1;
    }

    /* renamed from: a */
    public static void m1802a(String str) {
        ((C2637a) C2637a.m5094F().f8559f).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0002c.m16k("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1803b(AbstractC0713w abstractC0713w) {
        if (abstractC0713w.f2425b) {
            if (!abstractC0713w.mo1784e()) {
                abstractC0713w.m1801c(false);
                return;
            }
            int r02 = abstractC0713w.f2426c;
            int r12 = this.f2435g;
            if (r02 >= r12) {
                return;
            }
            abstractC0713w.f2426c = r12;
            C0055g c0055g = abstractC0713w.f2424a;
            Object obj = this.f2433e;
            c0055g.getClass();
            if (((InterfaceC0708r) obj) != null) {
                DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l = (DialogInterfaceOnCancelListenerC0662l) c0055g.f107b;
                if (dialogInterfaceOnCancelListenerC0662l.f2274W) {
                    View m1771x = dialogInterfaceOnCancelListenerC0662l.m1771x();
                    if (m1771x.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0662l.f2278a0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + c0055g + " setting the content view on " + dialogInterfaceOnCancelListenerC0662l.f2278a0);
                        }
                        dialogInterfaceOnCancelListenerC0662l.f2278a0.setContentView(m1771x);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1804c(AbstractC0713w abstractC0713w) {
        if (this.f2436h) {
            this.f2437i = true;
            return;
        }
        this.f2436h = true;
        do {
            this.f2437i = false;
            if (abstractC0713w != null) {
                m1803b(abstractC0713w);
                abstractC0713w = null;
            } else {
                C2677f c2677f = this.f2430b;
                c2677f.getClass();
                C2675d c2675d = new C2675d(c2677f);
                c2677f.f8623c.put(c2675d, Boolean.FALSE);
                while (c2675d.hasNext()) {
                    m1803b((AbstractC0713w) ((Map.Entry) c2675d.next()).getValue());
                    if (this.f2437i) {
                        break;
                    }
                }
            }
        } while (this.f2437i);
        this.f2436h = false;
    }

    /* renamed from: d */
    public final void m1805d(C0055g c0055g) {
        Object obj;
        m1802a("observeForever");
        C0712v c0712v = new C0712v(this, c0055g);
        C2677f c2677f = this.f2430b;
        C2674c mo5131a = c2677f.mo5131a(c0055g);
        if (mo5131a != null) {
            obj = mo5131a.f8615b;
        } else {
            C2674c c2674c = new C2674c(c0055g, c0712v);
            c2677f.f8624d++;
            C2674c c2674c2 = c2677f.f8622b;
            if (c2674c2 == null) {
                c2677f.f8621a = c2674c;
                c2677f.f8622b = c2674c;
            } else {
                c2674c2.f8616c = c2674c;
                c2674c.f8617d = c2674c2;
                c2677f.f8622b = c2674c;
            }
            obj = null;
        }
        AbstractC0713w abstractC0713w = (AbstractC0713w) obj;
        if (abstractC0713w instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0713w != null) {
            return;
        }
        c0712v.m1801c(true);
    }

    /* renamed from: e */
    public final void m1806e(Object obj) {
        m1802a("setValue");
        this.f2435g++;
        this.f2433e = obj;
        m1804c(null);
    }
}
