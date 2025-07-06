package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754j;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p028K.C0291Y;
import p076d.AbstractC0780a;
import p099j.AbstractC2416a;
import p102k.InterfaceC2449B;
import p102k.MenuC2466m;
import p104l.AbstractC2502A1;
import p104l.C2552a;
import p104l.C2567f;
import p104l.C2582k;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a */
    public final C2552a f1756a;

    /* renamed from: b */
    public final Context f1757b;

    /* renamed from: c */
    public ActionMenuView f1758c;

    /* renamed from: d */
    public C2582k f1759d;

    /* renamed from: e */
    public int f1760e;

    /* renamed from: f */
    public C0291Y f1761f;

    /* renamed from: g */
    public boolean f1762g;

    /* renamed from: h */
    public boolean f1763h;

    /* renamed from: i */
    public CharSequence f1764i;

    /* renamed from: j */
    public CharSequence f1765j;

    /* renamed from: k */
    public View f1766k;

    /* renamed from: l */
    public View f1767l;

    /* renamed from: m */
    public View f1768m;

    /* renamed from: n */
    public LinearLayout f1769n;

    /* renamed from: o */
    public TextView f1770o;

    /* renamed from: p */
    public TextView f1771p;

    /* renamed from: q */
    public final int f1772q;

    /* renamed from: r */
    public final int f1773r;

    /* renamed from: s */
    public boolean f1774s;

    /* renamed from: t */
    public final int f1775t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1756a = new C2552a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1757b = context;
        } else {
            this.f1757b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3117d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0580g.m1449n(context, resourceId);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setBackground(drawable);
        this.f1772q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1773r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1760e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1775t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static int m1495f(View view, int r2, int r3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE), r3);
        return Math.max(0, r2 - view.getMeasuredWidth());
    }

    /* renamed from: g */
    public static int m1496g(View view, int r3, int r4, int r5, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int r52 = ((r5 - measuredHeight) / 2) + r4;
        if (z2) {
            view.layout(r3 - measuredWidth, r52, r3, measuredHeight + r52);
        } else {
            view.layout(r3, r52, r3 + measuredWidth, measuredHeight + r52);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m1497c(AbstractC2416a abstractC2416a) {
        View view = this.f1766k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1775t, (ViewGroup) this, false);
            this.f1766k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1766k);
        }
        View findViewById = this.f1766k.findViewById(R.id.action_mode_close_button);
        this.f1767l = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0754j(2, abstractC2416a));
        MenuC2466m mo2172c = abstractC2416a.mo2172c();
        C2582k c2582k = this.f1759d;
        if (c2582k != null) {
            c2582k.m5037f();
            C2567f c2567f = c2582k.f8402t;
            if (c2567f != null && c2567f.m4859b()) {
                c2567f.f8141i.dismiss();
            }
        }
        C2582k c2582k2 = new C2582k(getContext());
        this.f1759d = c2582k2;
        c2582k2.f8394l = true;
        c2582k2.f8395m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mo2172c.m4835b(this.f1759d, this.f1757b);
        C2582k c2582k3 = this.f1759d;
        InterfaceC2449B interfaceC2449B = c2582k3.f8390h;
        if (interfaceC2449B == null) {
            InterfaceC2449B interfaceC2449B2 = (InterfaceC2449B) c2582k3.f8386d.inflate(c2582k3.f8388f, (ViewGroup) this, false);
            c2582k3.f8390h = interfaceC2449B2;
            interfaceC2449B2.mo1492d(c2582k3.f8385c);
            c2582k3.mo4804i();
        }
        InterfaceC2449B interfaceC2449B3 = c2582k3.f8390h;
        if (interfaceC2449B != interfaceC2449B3) {
            ((ActionMenuView) interfaceC2449B3).setPresenter(c2582k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC2449B3;
        this.f1758c = actionMenuView;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        actionMenuView.setBackground(null);
        addView(this.f1758c, layoutParams);
    }

    /* renamed from: d */
    public final void m1498d() {
        if (this.f1769n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1769n = linearLayout;
            this.f1770o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1771p = (TextView) this.f1769n.findViewById(R.id.action_bar_subtitle);
            int r02 = this.f1772q;
            if (r02 != 0) {
                this.f1770o.setTextAppearance(getContext(), r02);
            }
            int r03 = this.f1773r;
            if (r03 != 0) {
                this.f1771p.setTextAppearance(getContext(), r03);
            }
        }
        this.f1770o.setText(this.f1764i);
        this.f1771p.setText(this.f1765j);
        boolean isEmpty = TextUtils.isEmpty(this.f1764i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1765j);
        this.f1771p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1769n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1769n.getParent() == null) {
            addView(this.f1769n);
        }
    }

    /* renamed from: e */
    public final void m1499e() {
        removeAllViews();
        this.f1768m = null;
        this.f1758c = null;
        this.f1759d = null;
        View view = this.f1767l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1761f != null ? this.f1756a.f8313b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1760e;
    }

    public CharSequence getSubtitle() {
        return this.f1765j;
    }

    public CharSequence getTitle() {
        return this.f1764i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int r2) {
        if (r2 != getVisibility()) {
            C0291Y c0291y = this.f1761f;
            if (c0291y != null) {
                c0291y.m796b();
            }
            super.setVisibility(r2);
        }
    }

    /* renamed from: i */
    public final C0291Y m1501i(int r4, long j2) {
        C0291Y c0291y = this.f1761f;
        if (c0291y != null) {
            c0291y.m796b();
        }
        C2552a c2552a = this.f1756a;
        if (r4 != 0) {
            C0291Y m768a = AbstractC0283P.m768a(this);
            m768a.m795a(0.0f);
            m768a.m797c(j2);
            c2552a.f8314c.f1761f = m768a;
            c2552a.f8313b = r4;
            m768a.m798d(c2552a);
            return m768a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0291Y m768a2 = AbstractC0283P.m768a(this);
        m768a2.m795a(1.0f);
        m768a2.m797c(j2);
        c2552a.f8314c.f1761f = m768a2;
        c2552a.f8313b = r4;
        m768a2.m798d(c2552a);
        return m768a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0780a.f3114a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C2582k c2582k = this.f1759d;
        if (c2582k != null) {
            Configuration configuration2 = c2582k.f8384b.getResources().getConfiguration();
            int r12 = configuration2.screenWidthDp;
            int r2 = configuration2.screenHeightDp;
            c2582k.f8398p = (configuration2.smallestScreenWidthDp > 600 || r12 > 600 || (r12 > 960 && r2 > 720) || (r12 > 720 && r2 > 960)) ? 5 : (r12 >= 500 || (r12 > 640 && r2 > 480) || (r12 > 480 && r2 > 640)) ? 4 : r12 >= 360 ? 3 : 2;
            MenuC2466m menuC2466m = c2582k.f8385c;
            if (menuC2466m != null) {
                menuC2466m.m4841p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2582k c2582k = this.f1759d;
        if (c2582k != null) {
            c2582k.m5037f();
            C2567f c2567f = this.f1759d.f8402t;
            if (c2567f == null || !c2567f.m4859b()) {
                return;
            }
            c2567f.f8141i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1763h = false;
        }
        if (!this.f1763h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1763h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1763h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r6, int r7, int r8, int r9) {
        boolean m4922a = AbstractC2502A1.m4922a(this);
        int paddingRight = m4922a ? (r8 - r6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((r9 - r7) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1766k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1766k.getLayoutParams();
            int r3 = m4922a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int r72 = m4922a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int r02 = m4922a ? paddingRight - r3 : paddingRight + r3;
            int m1496g = m1496g(this.f1766k, r02, paddingTop, paddingTop2, m4922a) + r02;
            paddingRight = m4922a ? m1496g - r72 : m1496g + r72;
        }
        LinearLayout linearLayout = this.f1769n;
        if (linearLayout != null && this.f1768m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1496g(this.f1769n, paddingRight, paddingTop, paddingTop2, m4922a);
        }
        View view2 = this.f1768m;
        if (view2 != null) {
            m1496g(view2, paddingRight, paddingTop, paddingTop2, m4922a);
        }
        int paddingLeft = m4922a ? getPaddingLeft() : (r8 - r6) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1758c;
        if (actionMenuView != null) {
            m1496g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m4922a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
        if (View.MeasureSpec.getMode(r11) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(r12) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(r11);
        int r02 = this.f1760e;
        if (r02 <= 0) {
            r02 = View.MeasureSpec.getSize(r12);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int r3 = r02 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE);
        View view = this.f1766k;
        if (view != null) {
            int m1495f = m1495f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1766k.getLayoutParams();
            paddingLeft = m1495f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1758c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1495f(this.f1758c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1769n;
        if (linearLayout != null && this.f1768m == null) {
            if (this.f1774s) {
                this.f1769n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1769n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1769n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m1495f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1768m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int r6 = layoutParams.width;
            int r9 = r6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (r6 >= 0) {
                paddingLeft = Math.min(r6, paddingLeft);
            }
            int r5 = layoutParams.height;
            int r13 = r5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (r5 >= 0) {
                r3 = Math.min(r5, r3);
            }
            this.f1768m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, r9), View.MeasureSpec.makeMeasureSpec(r3, r13));
        }
        if (this.f1760e > 0) {
            setMeasuredDimension(size, r02);
            return;
        }
        int childCount = getChildCount();
        int r03 = 0;
        for (int r7 = 0; r7 < childCount; r7++) {
            int measuredHeight = getChildAt(r7).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > r03) {
                r03 = measuredHeight;
            }
        }
        setMeasuredDimension(size, r03);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1762g = false;
        }
        if (!this.f1762g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1762g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1762g = false;
        }
        return true;
    }

    public void setContentHeight(int r12) {
        this.f1760e = r12;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1768m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1768m = view;
        if (view != null && (linearLayout = this.f1769n) != null) {
            removeView(linearLayout);
            this.f1769n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1765j = charSequence;
        m1498d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1764i = charSequence;
        m1498d();
        AbstractC0283P.m780m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1774s) {
            requestLayout();
        }
        this.f1774s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
