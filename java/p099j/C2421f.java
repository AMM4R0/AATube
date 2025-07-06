package p099j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p102k.MenuC2450C;

/* renamed from: j.f */
/* loaded from: classes.dex */
public final class C2421f extends ActionMode {

    /* renamed from: a */
    public final Context f7833a;

    /* renamed from: b */
    public final AbstractC2416a f7834b;

    public C2421f(Context context, AbstractC2416a abstractC2416a) {
        this.f7833a = context;
        this.f7834b = abstractC2416a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f7834b.mo2170a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f7834b.mo2171b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC2450C(this.f7833a, this.f7834b.mo2172c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f7834b.mo2174e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f7834b.mo2175f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f7834b.f7819a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f7834b.mo2177h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f7834b.f7820b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f7834b.mo2178i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f7834b.mo2179j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f7834b.mo2180k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f7834b.mo2182m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f7834b.f7819a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f7834b.mo2184o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f7834b.mo2185p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r2) {
        this.f7834b.mo2181l(r2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r2) {
        this.f7834b.mo2183n(r2);
    }
}
