package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f1816a;

    /* renamed from: b */
    public boolean f1817b;

    /* renamed from: c */
    public int f1818c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1818c = -1;
        int[] r3 = AbstractC0780a.f3124k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r3);
        AbstractC0283P.m778k(this, context, r3, attributeSet, obtainStyledAttributes, 0);
        this.f1816a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1816a);
        }
    }

    private void setStacked(boolean z2) {
        if (this.f1817b != z2) {
            if (!z2 || this.f1816a) {
                this.f1817b = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r7, int r8) {
        int r12;
        boolean z2;
        int r4;
        int size = View.MeasureSpec.getSize(r7);
        int r3 = 0;
        if (this.f1816a) {
            if (size > this.f1818c && this.f1817b) {
                setStacked(false);
            }
            this.f1818c = size;
        }
        if (this.f1817b || View.MeasureSpec.getMode(r7) != 1073741824) {
            r12 = r7;
            z2 = false;
        } else {
            r12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(r12, r8);
        if (this.f1816a && !this.f1817b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(r7, r8);
        }
        int childCount = getChildCount();
        int r2 = 0;
        while (true) {
            r4 = -1;
            if (r2 >= childCount) {
                r2 = -1;
                break;
            } else if (getChildAt(r2).getVisibility() == 0) {
                break;
            } else {
                r2++;
            }
        }
        if (r2 >= 0) {
            View childAt = getChildAt(r2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1817b) {
                int r22 = r2 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (r22 >= childCount2) {
                        break;
                    }
                    if (getChildAt(r22).getVisibility() == 0) {
                        r4 = r22;
                        break;
                    }
                    r22++;
                }
                r3 = r4 >= 0 ? getChildAt(r4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
            if (r8 == 0) {
                super.onMeasure(r7, r8);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f1816a != z2) {
            this.f1816a = z2;
            if (!z2 && this.f1817b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
