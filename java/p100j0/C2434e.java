package p100j0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p009D.AbstractC0095a;
import p028K.C0290X;
import p084g.C0910f;

/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class C2434e extends AbstractC2437h implements Animatable {

    /* renamed from: g */
    public static final /* synthetic */ int f7902g = 0;

    /* renamed from: c */
    public final Context f7904c;

    /* renamed from: d */
    public C0290X f7905d = null;

    /* renamed from: e */
    public ArrayList f7906e = null;

    /* renamed from: f */
    public final C0910f f7907f = new C0910f(this);

    /* renamed from: b */
    public final C2432c f7903b = new C2432c();

    public C2434e(Context context) {
        this.f7904c = context;
    }

    @Override // p100j0.AbstractC2437h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m312a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            return AbstractC0095a.m313b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C2432c c2432c = this.f7903b;
        c2432c.f7897a.draw(canvas);
        if (c2432c.f7898b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getAlpha() : this.f7903b.f7897a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f7903b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7910a;
        return drawable != null ? AbstractC0095a.m314c(drawable) : this.f7903b.f7897a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7910a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C2433d(this.f7910a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f7903b.f7897a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f7903b.f7897a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getOpacity() : this.f7903b.f7897a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x018a, code lost:
    
        if (r8.f7898b != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x018c, code lost:
    
        r8.f7898b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0193, code lost:
    
        r8.f7898b.playTogether(r8.f7899c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x019a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p100j0.C2434e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.isAutoMirrored() : this.f7903b.f7897a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f7910a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f7903b.f7898b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.isStateful() : this.f7903b.f7897a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7903b.f7897a.setBounds(rect);
        }
    }

    @Override // p100j0.AbstractC2437h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.setLevel(r2) : this.f7903b.f7897a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.setState(r2) : this.f7903b.f7897a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setAlpha(r2);
        } else {
            this.f7903b.f7897a.setAlpha(r2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f7903b.f7897a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7903b.f7897a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0580g.m1458y(drawable, r2);
        } else {
            this.f7903b.f7897a.setTint(r2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m319h(drawable, colorStateList);
        } else {
            this.f7903b.f7897a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m320i(drawable, mode);
        } else {
            this.f7903b.f7897a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f7903b.f7897a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C2432c c2432c = this.f7903b;
        if (c2432c.f7898b.isStarted()) {
            return;
        }
        c2432c.f7898b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7903b.f7898b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
