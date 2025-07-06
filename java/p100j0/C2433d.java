package p100j0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C2433d extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f7901a;

    public C2433d(Drawable.ConstantState constantState) {
        this.f7901a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f7901a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7901a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2434e c2434e = new C2434e(null);
        Drawable newDrawable = this.f7901a.newDrawable();
        c2434e.f7910a = newDrawable;
        newDrawable.setCallback(c2434e.f7907f);
        return c2434e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2434e c2434e = new C2434e(null);
        Drawable newDrawable = this.f7901a.newDrawable(resources);
        c2434e.f7910a = newDrawable;
        newDrawable.setCallback(c2434e.f7907f);
        return c2434e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2434e c2434e = new C2434e(null);
        Drawable newDrawable = this.f7901a.newDrawable(resources, theme);
        c2434e.f7910a = newDrawable;
        newDrawable.setCallback(c2434e.f7907f);
        return c2434e;
    }
}
