package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p009D.AbstractC0095a;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0387m;
import p054S1.C0509h;
import p065Y0.AbstractC0556k;
import p081e1.C0881g;
import p101j1.AbstractC2447a;
import p102k.MenuC2466m;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: W */
    public static final ImageView.ScaleType[] f2728W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R */
    public Integer f2729R;

    /* renamed from: S */
    public boolean f2730S;

    /* renamed from: T */
    public boolean f2731T;

    /* renamed from: U */
    public ImageView.ScaleType f2732U;

    /* renamed from: V */
    public Boolean f2733V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray m1412f = AbstractC0556k.m1412f(context2, attributeSet, AbstractC0345a.f967s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (m1412f.hasValue(2)) {
            setNavigationIconTint(m1412f.getColor(2, -1));
        }
        this.f2730S = m1412f.getBoolean(4, false);
        this.f2731T = m1412f.getBoolean(3, false);
        int r02 = m1412f.getInt(1, -1);
        if (r02 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2728W;
            if (r02 < scaleTypeArr.length) {
                this.f2732U = scaleTypeArr[r02];
            }
        }
        if (m1412f.hasValue(0)) {
            this.f2733V = Boolean.valueOf(m1412f.getBoolean(0, false));
        }
        m1412f.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0580g.m1448m(background);
        if (valueOf != null) {
            C0881g c0881g = new C0881g();
            c0881g.m2407j(valueOf);
            c0881g.m2405h(context2);
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            c0881g.m2406i(AbstractC0272E.m705i(this));
            setBackground(c0881g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2732U;
    }

    public Integer getNavigationIconTint() {
        return this.f2729R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: n */
    public final void mo1549n(int r4) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC2466m;
        if (z2) {
            ((MenuC2466m) menu).m4848w();
        }
        super.mo1549n(r4);
        if (z2) {
            ((MenuC2466m) menu).m4847v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0881g) {
            AbstractC0387m.m1105N(this, (C0881g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r8, int r9, int r10, int r11) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, r8, r9, r10, r11);
        int r82 = 0;
        ImageView imageView2 = null;
        if (this.f2730S || this.f2731T) {
            ArrayList m1410d = AbstractC0556k.m1410d(this, getTitle());
            boolean isEmpty = m1410d.isEmpty();
            C0509h c0509h = AbstractC0556k.f1562c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(m1410d, c0509h);
            ArrayList m1410d2 = AbstractC0556k.m1410d(this, getSubtitle());
            TextView textView2 = m1410d2.isEmpty() ? null : (TextView) Collections.max(m1410d2, c0509h);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int r02 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int r2 = 0; r2 < getChildCount(); r2++) {
                    View childAt = getChildAt(r2);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < r02 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > r02 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2730S && textView != null) {
                    m2055w(textView, pair);
                }
                if (this.f2731T && textView2 != null) {
                    m2055w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (r82 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(r82);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                r82++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2733V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2732U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0881g) {
            ((C0881g) background).m2406i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f2733V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f2733V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2732U != scaleType) {
            this.f2732U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2729R != null) {
            drawable = drawable.mutate();
            AbstractC0095a.m318g(drawable, this.f2729R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int r12) {
        this.f2729R = Integer.valueOf(r12);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f2731T != z2) {
            this.f2731T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f2730S != z2) {
            this.f2730S = z2;
            requestLayout();
        }
    }

    /* renamed from: w */
    public final void m2055w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int r02 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int r12 = measuredWidth2 + r02;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - r02, 0), Math.max(r12 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            r02 += max;
            r12 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(r12 - r02, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(r02, textView.getTop(), r12, textView.getBottom());
    }
}
