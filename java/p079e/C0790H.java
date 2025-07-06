package p079e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p008C1.C0080l;
import p010D0.C0113k;
import p099j.AbstractC2416a;
import p099j.C2424i;
import p102k.InterfaceC2464k;
import p102k.MenuC2466m;
import p104l.C2582k;

/* renamed from: e.H */
/* loaded from: classes.dex */
public final class C0790H extends AbstractC2416a implements InterfaceC2464k {

    /* renamed from: c */
    public final Context f3170c;

    /* renamed from: d */
    public final MenuC2466m f3171d;

    /* renamed from: e */
    public C0113k f3172e;

    /* renamed from: f */
    public WeakReference f3173f;

    /* renamed from: g */
    public final /* synthetic */ C0791I f3174g;

    public C0790H(C0791I r12, Context context, C0113k c0113k) {
        this.f3174g = r12;
        this.f3170c = context;
        this.f3172e = c0113k;
        MenuC2466m menuC2466m = new MenuC2466m(context);
        menuC2466m.f8076l = 1;
        this.f3171d = menuC2466m;
        menuC2466m.f8069e = this;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: a */
    public final void mo2170a() {
        C0791I r02 = this.f3174g;
        if (r02.f3188n != this) {
            return;
        }
        if (r02.f3195u) {
            r02.f3189o = this;
            r02.f3190p = this.f3172e;
        } else {
            this.f3172e.m382f(this);
        }
        this.f3172e = null;
        r02.m2186F(false);
        ActionBarContextView actionBarContextView = r02.f3185k;
        if (actionBarContextView.f1766k == null) {
            actionBarContextView.m1499e();
        }
        r02.f3182h.setHideOnContentScrollEnabled(r02.f3200z);
        r02.f3188n = null;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: b */
    public final View mo2171b() {
        WeakReference weakReference = this.f3173f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: c */
    public final MenuC2466m mo2172c() {
        return this.f3171d;
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: d */
    public final boolean mo2173d(MenuC2466m menuC2466m, MenuItem menuItem) {
        C0113k c0113k = this.f3172e;
        if (c0113k != null) {
            return ((C0080l) c0113k.f347b).m269e(this, menuItem);
        }
        return false;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: e */
    public final MenuInflater mo2174e() {
        return new C2424i(this.f3170c);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: f */
    public final CharSequence mo2175f() {
        return this.f3174g.f3185k.getSubtitle();
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: g */
    public final void mo2176g(MenuC2466m menuC2466m) {
        if (this.f3172e == null) {
            return;
        }
        mo2178i();
        C2582k c2582k = this.f3174g.f3185k.f1759d;
        if (c2582k != null) {
            c2582k.m5039l();
        }
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: h */
    public final CharSequence mo2177h() {
        return this.f3174g.f3185k.getTitle();
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: i */
    public final void mo2178i() {
        if (this.f3174g.f3188n != this) {
            return;
        }
        MenuC2466m menuC2466m = this.f3171d;
        menuC2466m.m4848w();
        try {
            this.f3172e.m383g(this, menuC2466m);
        } finally {
            menuC2466m.m4847v();
        }
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: j */
    public final boolean mo2179j() {
        return this.f3174g.f3185k.f1774s;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: k */
    public final void mo2180k(View view) {
        this.f3174g.f3185k.setCustomView(view);
        this.f3173f = new WeakReference(view);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: l */
    public final void mo2181l(int r2) {
        mo2182m(this.f3174g.f3180f.getResources().getString(r2));
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: m */
    public final void mo2182m(CharSequence charSequence) {
        this.f3174g.f3185k.setSubtitle(charSequence);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: n */
    public final void mo2183n(int r2) {
        mo2184o(this.f3174g.f3180f.getResources().getString(r2));
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: o */
    public final void mo2184o(CharSequence charSequence) {
        this.f3174g.f3185k.setTitle(charSequence);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: p */
    public final void mo2185p(boolean z2) {
        this.f7820b = z2;
        this.f3174g.f3185k.setTitleOptional(z2);
    }
}
