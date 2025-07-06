package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;
import p104l.AbstractC2543V0;
import p104l.C2555b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f1747a;

    /* renamed from: b */
    public View f1748b;

    /* renamed from: c */
    public View f1749c;

    /* renamed from: d */
    public Drawable f1750d;

    /* renamed from: e */
    public Drawable f1751e;

    /* renamed from: f */
    public Drawable f1752f;

    /* renamed from: g */
    public final boolean f1753g;

    /* renamed from: h */
    public boolean f1754h;

    /* renamed from: i */
    public final int f1755i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2555b c2555b = new C2555b(this);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setBackground(c2555b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3114a);
        boolean z2 = false;
        this.f1750d = obtainStyledAttributes.getDrawable(0);
        this.f1751e = obtainStyledAttributes.getDrawable(2);
        this.f1755i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1753g = true;
            this.f1752f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1753g ? !(this.f1750d != null || this.f1751e != null) : this.f1752f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1750d;
        if (drawable != null && drawable.isStateful()) {
            this.f1750d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1751e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1751e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1752f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1752f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1750d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1751e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1752f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1748b = findViewById(R.id.action_bar);
        this.f1749c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1747a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r4, int r5, int r6, int r7) {
        super.onLayout(z2, r4, r5, r6, r7);
        boolean z3 = true;
        if (this.f1753g) {
            Drawable drawable = this.f1752f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1750d == null) {
                z3 = false;
            } else if (this.f1748b.getVisibility() == 0) {
                this.f1750d.setBounds(this.f1748b.getLeft(), this.f1748b.getTop(), this.f1748b.getRight(), this.f1748b.getBottom());
            } else {
                View view = this.f1749c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1750d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1750d.setBounds(this.f1749c.getLeft(), this.f1749c.getTop(), this.f1749c.getRight(), this.f1749c.getBottom());
                }
            }
            this.f1754h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        int r02;
        if (this.f1748b == null && View.MeasureSpec.getMode(r4) == Integer.MIN_VALUE && (r02 = this.f1755i) >= 0) {
            r4 = View.MeasureSpec.makeMeasureSpec(Math.min(r02, View.MeasureSpec.getSize(r4)), Integer.MIN_VALUE);
        }
        super.onMeasure(r3, r4);
        if (this.f1748b == null) {
            return;
        }
        View.MeasureSpec.getMode(r4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1750d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1750d);
        }
        this.f1750d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1748b;
            if (view != null) {
                this.f1750d.setBounds(view.getLeft(), this.f1748b.getTop(), this.f1748b.getRight(), this.f1748b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1753g ? !(this.f1750d != null || this.f1751e != null) : this.f1752f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1752f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1752f);
        }
        this.f1752f = drawable;
        boolean z2 = this.f1753g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1752f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1750d != null || this.f1751e != null) : this.f1752f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1751e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1751e);
        }
        this.f1751e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1754h && this.f1751e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1753g ? !(this.f1750d != null || this.f1751e != null) : this.f1752f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1747a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        boolean z2 = r3 == 0;
        Drawable drawable = this.f1750d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1751e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1752f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1750d;
        boolean z2 = this.f1753g;
        return (drawable == drawable2 && !z2) || (drawable == this.f1751e && this.f1754h) || ((drawable == this.f1752f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int r3) {
        if (r3 != 0) {
            return super.startActionModeForChild(view, callback, r3);
        }
        return null;
    }

    public void setTabContainer(AbstractC2543V0 abstractC2543V0) {
    }
}
