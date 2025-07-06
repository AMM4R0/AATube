package p100j0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p009D.AbstractC0095a;
import p053S0.C0499a;
import p053S0.C0501c;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C2431b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C0499a f7896a;

    public C2431b(C0499a c0499a) {
        this.f7896a = c0499a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f7896a.f1265b.f1281o;
        if (colorStateList != null) {
            AbstractC0095a.m319h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0501c c0501c = this.f7896a.f1265b;
        ColorStateList colorStateList = c0501c.f1281o;
        if (colorStateList != null) {
            AbstractC0095a.m318g(drawable, colorStateList.getColorForState(c0501c.f1285s, colorStateList.getDefaultColor()));
        }
    }
}
