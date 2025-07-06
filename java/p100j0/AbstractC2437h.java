package p100j0;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p009D.AbstractC0095a;

/* renamed from: j0.h */
/* loaded from: classes.dex */
public abstract class AbstractC2437h extends Drawable {

    /* renamed from: a */
    public Drawable f7910a;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m312a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.setLevel(r2) : super.onLevelChange(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setChangingConfigurations(r2);
        } else {
            super.setChangingConfigurations(r2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int r2, PorterDuff.Mode mode) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setColorFilter(r2, mode);
        } else {
            super.setColorFilter(r2, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            drawable.setFilterBitmap(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m316e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        Drawable drawable = this.f7910a;
        if (drawable != null) {
            AbstractC0095a.m317f(drawable, r2, r3, r4, r5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        Drawable drawable = this.f7910a;
        return drawable != null ? drawable.setState(r2) : super.setState(r2);
    }
}
