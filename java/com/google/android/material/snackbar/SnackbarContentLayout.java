package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p032L0.AbstractC0367a;
import p103k0.AbstractC2480a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f2987a;

    /* renamed from: b */
    public Button f2988b;

    /* renamed from: c */
    public int f2989c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2480a.m4877R(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0367a.f1002b);
    }

    /* renamed from: a */
    public final boolean m2130a(int r4, int r5, int r6) {
        boolean z2;
        if (r4 != getOrientation()) {
            setOrientation(r4);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2987a.getPaddingTop() == r5 && this.f2987a.getPaddingBottom() == r6) {
            return z2;
        }
        TextView textView = this.f2987a;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), r5, textView.getPaddingEnd(), r6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), r5, textView.getPaddingRight(), r6);
        return true;
    }

    public Button getActionView() {
        return this.f2988b;
    }

    public TextView getMessageView() {
        return this.f2987a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2987a = (TextView) findViewById(R.id.snackbar_text);
        this.f2988b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        super.onMeasure(r8, r9);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2987a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f2989c <= 0 || this.f2988b.getMeasuredWidth() <= this.f2989c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m2130a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m2130a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(r8, r9);
    }

    public void setMaxInlineActionWidth(int r12) {
        this.f2989c = r12;
    }
}
