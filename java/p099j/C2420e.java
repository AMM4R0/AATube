package p099j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p008C1.C0080l;
import p010D0.C0113k;
import p102k.InterfaceC2464k;
import p102k.MenuC2466m;
import p104l.C2582k;

/* renamed from: j.e */
/* loaded from: classes.dex */
public final class C2420e extends AbstractC2416a implements InterfaceC2464k {

    /* renamed from: c */
    public Context f7827c;

    /* renamed from: d */
    public ActionBarContextView f7828d;

    /* renamed from: e */
    public C0113k f7829e;

    /* renamed from: f */
    public WeakReference f7830f;

    /* renamed from: g */
    public boolean f7831g;

    /* renamed from: h */
    public MenuC2466m f7832h;

    @Override // p099j.AbstractC2416a
    /* renamed from: a */
    public final void mo2170a() {
        if (this.f7831g) {
            return;
        }
        this.f7831g = true;
        this.f7829e.m382f(this);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: b */
    public final View mo2171b() {
        WeakReference weakReference = this.f7830f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: c */
    public final MenuC2466m mo2172c() {
        return this.f7832h;
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: d */
    public final boolean mo2173d(MenuC2466m menuC2466m, MenuItem menuItem) {
        return ((C0080l) this.f7829e.f347b).m269e(this, menuItem);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: e */
    public final MenuInflater mo2174e() {
        return new C2424i(this.f7828d.getContext());
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: f */
    public final CharSequence mo2175f() {
        return this.f7828d.getSubtitle();
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: g */
    public final void mo2176g(MenuC2466m menuC2466m) {
        mo2178i();
        C2582k c2582k = this.f7828d.f1759d;
        if (c2582k != null) {
            c2582k.m5039l();
        }
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: h */
    public final CharSequence mo2177h() {
        return this.f7828d.getTitle();
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: i */
    public final void mo2178i() {
        this.f7829e.m383g(this, this.f7832h);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: j */
    public final boolean mo2179j() {
        return this.f7828d.f1774s;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: k */
    public final void mo2180k(View view) {
        this.f7828d.setCustomView(view);
        this.f7830f = view != null ? new WeakReference(view) : null;
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: l */
    public final void mo2181l(int r2) {
        mo2182m(this.f7827c.getString(r2));
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: m */
    public final void mo2182m(CharSequence charSequence) {
        this.f7828d.setSubtitle(charSequence);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: n */
    public final void mo2183n(int r2) {
        mo2184o(this.f7827c.getString(r2));
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: o */
    public final void mo2184o(CharSequence charSequence) {
        this.f7828d.setTitle(charSequence);
    }

    @Override // p099j.AbstractC2416a
    /* renamed from: p */
    public final void mo2185p(boolean z2) {
        this.f7820b = z2;
        this.f7828d.setTitleOptional(z2);
    }
}
