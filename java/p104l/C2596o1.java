package p104l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p099j.InterfaceC2417b;
import p102k.C2468o;
import p102k.InterfaceC2479z;
import p102k.MenuC2466m;
import p102k.SubMenuC2453F;

/* renamed from: l.o1 */
/* loaded from: classes.dex */
public final class C2596o1 implements InterfaceC2479z {

    /* renamed from: a */
    public MenuC2466m f8435a;

    /* renamed from: b */
    public C2468o f8436b;

    /* renamed from: c */
    public final /* synthetic */ Toolbar f8437c;

    public C2596o1(Toolbar toolbar) {
        this.f8437c = toolbar;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: c */
    public final boolean mo4829c(C2468o c2468o) {
        Toolbar toolbar = this.f8437c;
        toolbar.m1542c();
        ViewParent parent = toolbar.f1941h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1941h);
            }
            toolbar.addView(toolbar.f1941h);
        }
        View actionView = c2468o.getActionView();
        toolbar.f1942i = actionView;
        this.f8436b = c2468o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1942i);
            }
            C2599p1 m1536h = Toolbar.m1536h();
            m1536h.f8450a = (toolbar.f1947n & 112) | 8388611;
            m1536h.f8451b = 2;
            toolbar.f1942i.setLayoutParams(m1536h);
            toolbar.addView(toolbar.f1942i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C2599p1) childAt.getLayoutParams()).f8451b != 2 && childAt != toolbar.f1934a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1921E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c2468o.f8094C = true;
        c2468o.f8108n.m4841p(false);
        KeyEvent.Callback callback = toolbar.f1942i;
        if (callback instanceof InterfaceC2417b) {
            ((InterfaceC2417b) callback).mo1515b();
        }
        toolbar.m1557v();
        return true;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: d */
    public final boolean mo4802d(SubMenuC2453F subMenuC2453F) {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: e */
    public final boolean mo4830e(C2468o c2468o) {
        Toolbar toolbar = this.f8437c;
        KeyEvent.Callback callback = toolbar.f1942i;
        if (callback instanceof InterfaceC2417b) {
            ((InterfaceC2417b) callback).mo1516e();
        }
        toolbar.removeView(toolbar.f1942i);
        toolbar.removeView(toolbar.f1941h);
        toolbar.f1942i = null;
        ArrayList arrayList = toolbar.f1921E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f8436b = null;
        toolbar.requestLayout();
        c2468o.f8094C = false;
        c2468o.f8108n.m4841p(false);
        toolbar.m1557v();
        return true;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: g */
    public final void mo4831g(Context context, MenuC2466m menuC2466m) {
        C2468o c2468o;
        MenuC2466m menuC2466m2 = this.f8435a;
        if (menuC2466m2 != null && (c2468o = this.f8436b) != null) {
            menuC2466m2.mo4814d(c2468o);
        }
        this.f8435a = menuC2466m;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: h */
    public final boolean mo4803h() {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: i */
    public final void mo4804i() {
        if (this.f8436b != null) {
            MenuC2466m menuC2466m = this.f8435a;
            if (menuC2466m != null) {
                int size = menuC2466m.f8070f.size();
                for (int r12 = 0; r12 < size; r12++) {
                    if (this.f8435a.getItem(r12) == this.f8436b) {
                        return;
                    }
                }
            }
            mo4830e(this.f8436b);
        }
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: a */
    public final void mo4801a(MenuC2466m menuC2466m, boolean z2) {
    }
}
