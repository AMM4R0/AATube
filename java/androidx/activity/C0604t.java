package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0638E;
import androidx.fragment.app.C0674x;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0703m;
import androidx.lifecycle.InterfaceC0708r;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2492i;
import p108m1.C2657g;

/* renamed from: androidx.activity.t */
/* loaded from: classes.dex */
public final class C0604t {

    /* renamed from: a */
    public final Runnable f1708a;

    /* renamed from: b */
    public final C2657g f1709b = new C2657g();

    /* renamed from: c */
    public C0674x f1710c;

    /* renamed from: d */
    public final OnBackInvokedCallback f1711d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f1712e;

    /* renamed from: f */
    public boolean f1713f;

    /* renamed from: g */
    public boolean f1714g;

    public C0604t(Runnable runnable) {
        this.f1708a = runnable;
        int r6 = Build.VERSION.SDK_INT;
        if (r6 >= 33) {
            this.f1711d = r6 >= 34 ? C0598q.f1700a.m1481a(new C0593l(this, 0), new C0593l(this, 1), new C0594m(this, 0), new C0594m(this, 1)) : C0596o.f1695a.m1478a(new C0594m(this, 2));
        }
    }

    /* renamed from: a */
    public final void m1482a(InterfaceC0708r interfaceC0708r, C0674x onBackPressedCallback) {
        AbstractC2492i.m4915e(onBackPressedCallback, "onBackPressedCallback");
        C0710t mo1475e = interfaceC0708r.mo1475e();
        if (mo1475e.f2416c == EnumC0703m.f2405a) {
            return;
        }
        onBackPressedCallback.f2358b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, mo1475e, onBackPressedCallback));
        m1485d();
        onBackPressedCallback.f2359c = new C0603s(0, this, C0604t.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    /* renamed from: b */
    public final void m1483b() {
        Object obj;
        C2657g c2657g = this.f1709b;
        ListIterator listIterator = c2657g.listIterator(c2657g.mo5095a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((C0674x) obj).f2357a) {
                    break;
                }
            }
        }
        C0674x c0674x = (C0674x) obj;
        this.f1710c = null;
        if (c0674x == null) {
            this.f1708a.run();
            return;
        }
        C0638E c0638e = c0674x.f2360d;
        c0638e.m1697w(true);
        if (c0638e.f2133h.f2357a) {
            c0638e.m1662I();
        } else {
            c0638e.f2132g.m1483b();
        }
    }

    /* renamed from: c */
    public final void m1484c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1712e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1711d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0596o c0596o = C0596o.f1695a;
        if (z2 && !this.f1713f) {
            c0596o.m1479b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1713f = true;
        } else {
            if (z2 || !this.f1713f) {
                return;
            }
            c0596o.m1480c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1713f = false;
        }
    }

    /* renamed from: d */
    public final void m1485d() {
        boolean z2 = this.f1714g;
        C2657g c2657g = this.f1709b;
        boolean z3 = false;
        if (!(c2657g instanceof Collection) || !c2657g.isEmpty()) {
            Iterator it = c2657g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0674x) it.next()).f2357a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1714g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1484c(z3);
    }
}
