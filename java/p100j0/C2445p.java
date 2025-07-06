package p100j0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: j0.p */
/* loaded from: classes.dex */
public final class C2445p extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f7964a;

    public C2445p(Drawable.ConstantState constantState) {
        this.f7964a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f7964a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7964a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2446q c2446q = new C2446q();
        c2446q.f7910a = (VectorDrawable) this.f7964a.newDrawable();
        return c2446q;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2446q c2446q = new C2446q();
        c2446q.f7910a = (VectorDrawable) this.f7964a.newDrawable(resources);
        return c2446q;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2446q c2446q = new C2446q();
        c2446q.f7910a = (VectorDrawable) this.f7964a.newDrawable(resources, theme);
        return c2446q;
    }
}
