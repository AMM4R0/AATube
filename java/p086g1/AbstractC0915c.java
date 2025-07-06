package p086g1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p009D.AbstractC0095a;
import p028K.AbstractC0270C;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p065Y0.AbstractC0556k;
import p081e1.C0881g;
import p081e1.C0885k;
import p101j1.AbstractC2447a;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0915c extends FrameLayout {

    /* renamed from: i */
    public static final ViewOnTouchListenerC0914b f3826i = new ViewOnTouchListenerC0914b();

    /* renamed from: a */
    public final C0885k f3827a;

    /* renamed from: b */
    public int f3828b;

    /* renamed from: c */
    public final float f3829c;

    /* renamed from: d */
    public final float f3830d;

    /* renamed from: e */
    public final int f3831e;

    /* renamed from: f */
    public final int f3832f;

    /* renamed from: g */
    public ColorStateList f3833g;

    /* renamed from: h */
    public PorterDuff.Mode f3834h;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0915c(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0345a.f972x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            AbstractC0272E.m715s(this, dimensionPixelSize);
        }
        this.f3828b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f3827a = C0885k.m2414b(context2, attributeSet, 0, 0).m2412a();
        }
        this.f3829c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0387m.m1121s(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0556k.m1413g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f3830d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f3831e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3832f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3826i);
        setFocusable(true);
        if (getBackground() == null) {
            int m1085w = AbstractC0379e.m1085w(AbstractC0379e.m1080p(this, R.attr.colorSurface), AbstractC0379e.m1080p(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C0885k c0885k = this.f3827a;
            if (c0885k != null) {
                int r02 = AbstractC0916d.f3835a;
                C0881g c0881g = new C0881g(c0885k);
                c0881g.m2407j(ColorStateList.valueOf(m1085w));
                gradientDrawable = c0881g;
            } else {
                Resources resources = getResources();
                int r12 = AbstractC0916d.f3835a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(m1085w);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f3833g;
            if (colorStateList != null) {
                AbstractC0095a.m319h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f3830d;
    }

    public int getAnimationMode() {
        return this.f3828b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3829c;
    }

    public int getMaxInlineActionWidth() {
        return this.f3832f;
    }

    public int getMaxWidth() {
        return this.f3831e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = this.f3831e;
        if (r22 <= 0 || getMeasuredWidth() <= r22) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r22, 1073741824), r3);
    }

    public void setAnimationMode(int r12) {
        this.f3828b = r12;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3833g != null) {
            drawable = drawable.mutate();
            AbstractC0095a.m319h(drawable, this.f3833g);
            AbstractC0095a.m320i(drawable, this.f3834h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3833g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0095a.m319h(mutate, colorStateList);
            AbstractC0095a.m320i(mutate, this.f3834h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3834h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0095a.m320i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3826i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0916d abstractC0916d) {
    }
}
