package p104l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p002A1.C0015h;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;

/* renamed from: l.C0 */
/* loaded from: classes.dex */
public abstract class AbstractC2506C0 extends ViewGroup {

    /* renamed from: a */
    public boolean f8195a;

    /* renamed from: b */
    public int f8196b;

    /* renamed from: c */
    public int f8197c;

    /* renamed from: d */
    public int f8198d;

    /* renamed from: e */
    public int f8199e;

    /* renamed from: f */
    public int f8200f;

    /* renamed from: g */
    public float f8201g;

    /* renamed from: h */
    public boolean f8202h;

    /* renamed from: i */
    public int[] f8203i;

    /* renamed from: j */
    public int[] f8204j;

    /* renamed from: k */
    public Drawable f8205k;

    /* renamed from: l */
    public int f8206l;

    /* renamed from: m */
    public int f8207m;

    /* renamed from: n */
    public int f8208n;

    /* renamed from: o */
    public int f8209o;

    public AbstractC2506C0(Context context, AttributeSet attributeSet, int r13) {
        super(context, attributeSet, r13);
        this.f8195a = true;
        this.f8196b = -1;
        this.f8197c = 0;
        this.f8199e = 8388659;
        int[] r6 = AbstractC0780a.f3127n;
        C0015h m100A = C0015h.m100A(context, attributeSet, r6, r13);
        AbstractC0283P.m778k(this, context, r6, attributeSet, (TypedArray) m100A.f26c, r13);
        TypedArray typedArray = (TypedArray) m100A.f26c;
        int r12 = typedArray.getInt(1, -1);
        if (r12 >= 0) {
            setOrientation(r12);
        }
        int r122 = typedArray.getInt(0, -1);
        if (r122 >= 0) {
            setGravity(r122);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f8201g = typedArray.getFloat(4, -1.0f);
        this.f8196b = typedArray.getInt(3, -1);
        this.f8202h = typedArray.getBoolean(7, false);
        setDividerDrawable(m100A.m121p(5));
        this.f8208n = typedArray.getInt(8, 0);
        this.f8209o = typedArray.getDimensionPixelSize(6, 0);
        m100A.m102C();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2504B0;
    }

    /* renamed from: f */
    public final void m4928f(Canvas canvas, int r6) {
        this.f8205k.setBounds(getPaddingLeft() + this.f8209o, r6, (getWidth() - getPaddingRight()) - this.f8209o, this.f8207m + r6);
        this.f8205k.draw(canvas);
    }

    /* renamed from: g */
    public final void m4929g(Canvas canvas, int r7) {
        this.f8205k.setBounds(r7, getPaddingTop() + this.f8209o, this.f8206l + r7, (getHeight() - getPaddingBottom()) - this.f8209o);
        this.f8205k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int r3;
        if (this.f8196b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int r12 = this.f8196b;
        if (childCount <= r12) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(r12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8196b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int r2 = this.f8197c;
        if (this.f8198d == 1 && (r3 = this.f8199e & 112) != 48) {
            if (r3 == 16) {
                r2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8200f) / 2;
            } else if (r3 == 80) {
                r2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8200f;
            }
        }
        return r2 + ((LinearLayout.LayoutParams) ((C2504B0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8196b;
    }

    public Drawable getDividerDrawable() {
        return this.f8205k;
    }

    public int getDividerPadding() {
        return this.f8209o;
    }

    public int getDividerWidth() {
        return this.f8206l;
    }

    public int getGravity() {
        return this.f8199e;
    }

    public int getOrientation() {
        return this.f8198d;
    }

    public int getShowDividers() {
        return this.f8208n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8201g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2504B0 generateDefaultLayoutParams() {
        int r02 = this.f8198d;
        if (r02 == 0) {
            return new C2504B0(-2, -2);
        }
        if (r02 == 1) {
            return new C2504B0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2504B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C2504B0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2504B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2504B0(layoutParams);
    }

    /* renamed from: k */
    public final boolean m4930k(int r5) {
        if (r5 == 0) {
            return (this.f8208n & 1) != 0;
        }
        if (r5 == getChildCount()) {
            return (this.f8208n & 4) != 0;
        }
        if ((this.f8208n & 2) == 0) {
            return false;
        }
        for (int r52 = r5 - 1; r52 >= 0; r52--) {
            if (getChildAt(r52).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int r12;
        if (this.f8205k == null) {
            return;
        }
        int r2 = 0;
        if (this.f8198d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (r2 < virtualChildCount) {
                View childAt = getChildAt(r2);
                if (childAt != null && childAt.getVisibility() != 8 && m4930k(r2)) {
                    m4928f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C2504B0) childAt.getLayoutParams())).topMargin) - this.f8207m);
                }
                r2++;
            }
            if (m4930k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m4928f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f8207m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C2504B0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m4922a = AbstractC2502A1.m4922a(this);
        while (r2 < virtualChildCount2) {
            View childAt3 = getChildAt(r2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m4930k(r2)) {
                C2504B0 c2504b0 = (C2504B0) childAt3.getLayoutParams();
                m4929g(canvas, m4922a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c2504b0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2504b0).leftMargin) - this.f8206l);
            }
            r2++;
        }
        if (m4930k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C2504B0 c2504b02 = (C2504B0) childAt4.getLayoutParams();
                if (m4922a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c2504b02).leftMargin;
                    r12 = this.f8206l;
                    right = left - r12;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c2504b02).rightMargin;
                }
            } else if (m4922a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                r12 = this.f8206l;
                right = left - r12;
            }
            m4929g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.AbstractC2506C0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.AbstractC2506C0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f8195a = z2;
    }

    public void setBaselineAlignedChildIndex(int r3) {
        if (r3 >= 0 && r3 < getChildCount()) {
            this.f8196b = r3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8205k) {
            return;
        }
        this.f8205k = drawable;
        if (drawable != null) {
            this.f8206l = drawable.getIntrinsicWidth();
            this.f8207m = drawable.getIntrinsicHeight();
        } else {
            this.f8206l = 0;
            this.f8207m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int r12) {
        this.f8209o = r12;
    }

    public void setGravity(int r2) {
        if (this.f8199e != r2) {
            if ((8388615 & r2) == 0) {
                r2 |= 8388611;
            }
            if ((r2 & 112) == 0) {
                r2 |= 48;
            }
            this.f8199e = r2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int r3) {
        int r32 = r3 & 8388615;
        int r12 = this.f8199e;
        if ((8388615 & r12) != r32) {
            this.f8199e = r32 | ((-8388616) & r12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f8202h = z2;
    }

    public void setOrientation(int r2) {
        if (this.f8198d != r2) {
            this.f8198d = r2;
            requestLayout();
        }
    }

    public void setShowDividers(int r2) {
        if (r2 != this.f8208n) {
            requestLayout();
        }
        this.f8208n = r2;
    }

    public void setVerticalGravity(int r3) {
        int r32 = r3 & 112;
        int r02 = this.f8199e;
        if ((r02 & 112) != r32) {
            this.f8199e = r32 | (r02 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f8201g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
