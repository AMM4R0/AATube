package p065Y0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p029K0.AbstractC0345a;
import p104l.AbstractC2506C0;

/* renamed from: Y0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0549d extends AbstractC2506C0 {

    /* renamed from: p */
    public Drawable f1537p;

    /* renamed from: q */
    public final Rect f1538q;

    /* renamed from: r */
    public final Rect f1539r;

    /* renamed from: s */
    public int f1540s;

    /* renamed from: t */
    public final boolean f1541t;

    /* renamed from: u */
    public boolean f1542u;

    public AbstractC0549d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1538q = new Rect();
        this.f1539r = new Rect();
        this.f1540s = 119;
        this.f1541t = true;
        this.f1542u = false;
        int[] r9 = AbstractC0345a.f956h;
        AbstractC0556k.m1407a(context, attributeSet, 0, 0);
        AbstractC0556k.m1408b(context, attributeSet, r9, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9, 0, 0);
        this.f1540s = obtainStyledAttributes.getInt(1, this.f1540s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1541t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1537p;
        if (drawable != null) {
            if (this.f1542u) {
                this.f1542u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f1541t;
                Rect rect = this.f1538q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int r12 = this.f1540s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1539r;
                Gravity.apply(r12, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1537p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1537p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1537p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1537p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1540s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1537p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        this.f1542u = z2 | this.f1542u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r2, int r3, int r4) {
        super.onSizeChanged(r12, r2, r3, r4);
        this.f1542u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1537p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1537p);
            }
            this.f1537p = drawable;
            this.f1542u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1540s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
        if (this.f1540s != r2) {
            if ((8388615 & r2) == 0) {
                r2 |= 8388611;
            }
            if ((r2 & 112) == 0) {
                r2 |= 48;
            }
            this.f1540s = r2;
            if (r2 == 119 && this.f1537p != null) {
                this.f1537p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1537p;
    }
}
