package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p104l.AbstractC2506C0;
import p104l.C2504B0;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC2506C0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: l */
    public static int m1514l(View view) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1514l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    @Override // p104l.AbstractC2506C0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            r11 = 1
            int r0 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r10.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.getGravity()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r5
            r5 = 16
            if (r4 == r5) goto L3a
            r5 = 80
            if (r4 == r5) goto L31
            int r13 = r10.getPaddingTop()
            goto L44
        L31:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L44
        L3a:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r15 + r4
        L44:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r1 = 0
            if (r15 != 0) goto L4d
            r15 = r1
            goto L51
        L4d:
            int r15 = r15.getIntrinsicHeight()
        L51:
            if (r1 >= r2) goto Lb1
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto Laf
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto Laf
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            l.B0 r7 = (p104l.C2504B0) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L74
            r8 = r3
        L74:
            java.util.WeakHashMap r9 = p028K.AbstractC0283P.f842a
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r11) goto L8f
            r9 = 5
            if (r8 == r9) goto L89
            int r8 = r7.leftMargin
            int r8 = r8 + r0
            goto L9a
        L89:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
        L8d:
            int r8 = r8 - r9
            goto L9a
        L8f:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L8d
        L9a:
            boolean r9 = r10.m4930k(r1)
            if (r9 == 0) goto La1
            int r13 = r13 + r15
        La1:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r13 + r6
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r6 = r6 + r13
            r13 = r6
        Laf:
            int r1 = r1 + r11
            goto L51
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // p104l.AbstractC2506C0, android.view.View
    public final void onMeasure(int r17, int r18) {
        int r12;
        int r11;
        int r13;
        int r14;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int r5 = 0; r5 < childCount; r5++) {
            View childAt = getChildAt(r5);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(r17, r18);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(r18);
        int size = View.MeasureSpec.getSize(r18);
        int mode2 = View.MeasureSpec.getMode(r17);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(r17, 0);
            paddingBottom += view.getMeasuredHeight();
            r12 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            r12 = 0;
        }
        if (view2 != null) {
            view2.measure(r17, 0);
            r11 = m1514l(view2);
            r13 = view2.getMeasuredHeight() - r11;
            paddingBottom += r11;
            r12 = View.combineMeasuredStates(r12, view2.getMeasuredState());
        } else {
            r11 = 0;
            r13 = 0;
        }
        if (view3 != null) {
            view3.measure(r17, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            r14 = view3.getMeasuredHeight();
            paddingBottom += r14;
            r12 = View.combineMeasuredStates(r12, view3.getMeasuredState());
        } else {
            r14 = 0;
        }
        int r9 = size - paddingBottom;
        if (view2 != null) {
            int r122 = paddingBottom - r11;
            int min = Math.min(r9, r13);
            if (min > 0) {
                r9 -= min;
                r11 += min;
            }
            view2.measure(r17, View.MeasureSpec.makeMeasureSpec(r11, 1073741824));
            paddingBottom = r122 + view2.getMeasuredHeight();
            r12 = View.combineMeasuredStates(r12, view2.getMeasuredState());
        }
        if (view3 != null && r9 > 0) {
            view3.measure(r17, View.MeasureSpec.makeMeasureSpec(r14 + r9, mode));
            paddingBottom = (paddingBottom - r14) + view3.getMeasuredHeight();
            r12 = View.combineMeasuredStates(r12, view3.getMeasuredState());
        }
        int r4 = 0;
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt2 = getChildAt(r3);
            if (childAt2.getVisibility() != 8) {
                r4 = Math.max(r4, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + r4, r17, r12), View.resolveSizeAndState(paddingBottom, r18, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int r112 = 0; r112 < childCount; r112++) {
                View childAt3 = getChildAt(r112);
                if (childAt3.getVisibility() != 8) {
                    C2504B0 c2504b0 = (C2504B0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c2504b0).width == -1) {
                        int r132 = ((LinearLayout.LayoutParams) c2504b0).height;
                        ((LinearLayout.LayoutParams) c2504b0).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, r18, 0);
                        ((LinearLayout.LayoutParams) c2504b0).height = r132;
                    }
                }
            }
        }
    }
}
