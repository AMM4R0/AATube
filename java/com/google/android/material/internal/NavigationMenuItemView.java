package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p003B.AbstractC0036j;
import p003B.AbstractC0043q;
import p009D.AbstractC0095a;
import p028K.AbstractC0283P;
import p047Q0.C0450e;
import p065Y0.AbstractC0549d;
import p102k.C2468o;
import p102k.InterfaceC2448A;
import p104l.C2504B0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0549d implements InterfaceC2448A {

    /* renamed from: G */
    public static final int[] f2951G = {R.attr.state_checked};

    /* renamed from: A */
    public FrameLayout f2952A;

    /* renamed from: B */
    public C2468o f2953B;

    /* renamed from: C */
    public ColorStateList f2954C;

    /* renamed from: D */
    public boolean f2955D;

    /* renamed from: E */
    public Drawable f2956E;

    /* renamed from: F */
    public final C0450e f2957F;

    /* renamed from: v */
    public int f2958v;

    /* renamed from: w */
    public boolean f2959w;

    /* renamed from: x */
    public boolean f2960x;

    /* renamed from: y */
    public final boolean f2961y;

    /* renamed from: z */
    public final CheckedTextView f2962z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2961y = true;
        C0450e c0450e = new C0450e(2, this);
        this.f2957F = c0450e;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.carwizard.p075li.youtube.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.carwizard.p075li.youtube.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.carwizard.p075li.youtube.R.id.design_menu_item_text);
        this.f2962z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0283P.m779l(checkedTextView, c0450e);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2952A == null) {
                this.f2952A = (FrameLayout) ((ViewStub) findViewById(com.carwizard.p075li.youtube.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2952A.removeAllViews();
            this.f2952A.addView(view);
        }
    }

    @Override // p102k.InterfaceC2448A
    /* renamed from: c */
    public final void mo1488c(C2468o c2468o) {
        StateListDrawable stateListDrawable;
        this.f2953B = c2468o;
        int r02 = c2468o.f8095a;
        if (r02 > 0) {
            setId(r02);
        }
        setVisibility(c2468o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.carwizard.p075li.youtube.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2951G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            setBackground(stateListDrawable);
        }
        setCheckable(c2468o.isCheckable());
        setChecked(c2468o.isChecked());
        setEnabled(c2468o.isEnabled());
        setTitle(c2468o.f8099e);
        setIcon(c2468o.getIcon());
        setActionView(c2468o.getActionView());
        setContentDescription(c2468o.f8111q);
        AbstractC0580g.m1459z(this, c2468o.f8112r);
        C2468o c2468o2 = this.f2953B;
        CharSequence charSequence = c2468o2.f8099e;
        CheckedTextView checkedTextView = this.f2962z;
        if (charSequence == null && c2468o2.getIcon() == null && this.f2953B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2952A;
            if (frameLayout != null) {
                C2504B0 c2504b0 = (C2504B0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c2504b0).width = -1;
                this.f2952A.setLayoutParams(c2504b0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2952A;
        if (frameLayout2 != null) {
            C2504B0 c2504b02 = (C2504B0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c2504b02).width = -2;
            this.f2952A.setLayoutParams(c2504b02);
        }
    }

    @Override // p102k.InterfaceC2448A
    public C2468o getItemData() {
        return this.f2953B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(r2 + 1);
        C2468o c2468o = this.f2953B;
        if (c2468o != null && c2468o.isCheckable() && this.f2953B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2951G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2960x != z2) {
            this.f2960x = z2;
            this.f2957F.mo811h(this.f2962z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2962z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2961y) ? 1 : 0);
    }

    public void setHorizontalPadding(int r3) {
        setPadding(r3, getPaddingTop(), r3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2955D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC0095a.m319h(drawable, this.f2954C);
            }
            int r12 = this.f2958v;
            drawable.setBounds(0, 0, r12, r12);
        } else if (this.f2959w) {
            if (this.f2956E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0043q.f72a;
                Drawable m183a = AbstractC0036j.m183a(resources, com.carwizard.p075li.youtube.R.drawable.navigation_empty_icon, theme);
                this.f2956E = m183a;
                if (m183a != null) {
                    int r13 = this.f2958v;
                    m183a.setBounds(0, 0, r13, r13);
                }
            }
            drawable = this.f2956E;
        }
        this.f2962z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int r2) {
        this.f2962z.setCompoundDrawablePadding(r2);
    }

    public void setIconSize(int r12) {
        this.f2958v = r12;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2954C = colorStateList;
        this.f2955D = colorStateList != null;
        C2468o c2468o = this.f2953B;
        if (c2468o != null) {
            setIcon(c2468o.getIcon());
        }
    }

    public void setMaxLines(int r2) {
        this.f2962z.setMaxLines(r2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2959w = z2;
    }

    public void setTextAppearance(int r2) {
        this.f2962z.setTextAppearance(r2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2962z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2962z.setText(charSequence);
    }
}
