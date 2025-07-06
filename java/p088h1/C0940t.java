package p088h1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0387m;
import p065Y0.AbstractC0556k;
import p081e1.C0881g;
import p101j1.AbstractC2447a;
import p104l.C2520J0;
import p104l.C2594o;

/* renamed from: h1.t */
/* loaded from: classes.dex */
public final class C0940t extends C2594o {

    /* renamed from: e */
    public final C2520J0 f3942e;

    /* renamed from: f */
    public final AccessibilityManager f3943f;

    /* renamed from: g */
    public final Rect f3944g;

    /* renamed from: h */
    public final int f3945h;

    /* renamed from: i */
    public final float f3946i;

    /* renamed from: j */
    public ColorStateList f3947j;

    /* renamed from: k */
    public int f3948k;

    /* renamed from: l */
    public ColorStateList f3949l;

    public C0940t(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f3944g = new Rect();
        Context context2 = getContext();
        TypedArray m1412f = AbstractC0556k.m1412f(context2, attributeSet, AbstractC0345a.f957i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (m1412f.hasValue(0) && m1412f.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3945h = m1412f.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f3946i = m1412f.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (m1412f.hasValue(2)) {
            this.f3947j = ColorStateList.valueOf(m1412f.getColor(2, 0));
        }
        this.f3948k = m1412f.getColor(4, 0);
        this.f3949l = AbstractC0387m.m1121s(context2, m1412f, 5);
        this.f3943f = (AccessibilityManager) context2.getSystemService("accessibility");
        C2520J0 c2520j0 = new C2520J0(context2, null, R.attr.listPopupWindowStyle);
        this.f3942e = c2520j0;
        c2520j0.f8253y = true;
        c2520j0.f8254z.setFocusable(true);
        c2520j0.f8243o = this;
        c2520j0.f8254z.setInputMethodMode(2);
        c2520j0.mo4951n(getAdapter());
        c2520j0.f8244p = new C0938r(0, this);
        if (m1412f.hasValue(6)) {
            setSimpleItems(m1412f.getResourceId(6, 0));
        }
        m1412f.recycle();
    }

    /* renamed from: a */
    public static void m2518a(C0940t c0940t, Object obj) {
        c0940t.setText(c0940t.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m2519b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m2520c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f3943f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m2520c()) {
            this.f3942e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f3947j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m2519b = m2519b();
        return (m2519b == null || !m2519b.f2999E) ? super.getHint() : m2519b.getHint();
    }

    public float getPopupElevation() {
        return this.f3946i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f3948k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3949l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m2519b = m2519b();
        if (m2519b != null && m2519b.f2999E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3942e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r14, int r15) {
        super.onMeasure(r14, r15);
        if (View.MeasureSpec.getMode(r14) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m2519b = m2519b();
            int r2 = 0;
            if (adapter != null && m2519b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C2520J0 c2520j0 = this.f3942e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c2520j0.f8254z.isShowing() ? -1 : c2520j0.f8231c.getSelectedItemPosition()) + 15);
                View view = null;
                int r7 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != r2) {
                        view = null;
                        r2 = itemViewType;
                    }
                    view = adapter.getView(max, view, m2519b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    r7 = Math.max(r7, view.getMeasuredWidth());
                }
                Drawable background = c2520j0.f8254z.getBackground();
                if (background != null) {
                    Rect rect = this.f3944g;
                    background.getPadding(rect);
                    r7 += rect.left + rect.right;
                }
                r2 = m2519b.getEndIconView().getMeasuredWidth() + r7;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, r2), View.MeasureSpec.getSize(r14)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (m2520c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f3942e.mo4951n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C2520J0 c2520j0 = this.f3942e;
        if (c2520j0 != null) {
            c2520j0.m4949l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int r12) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(r12));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f3947j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0881g) {
            ((C0881g) dropDownBackground).m2407j(this.f3947j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3942e.f8245q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r12) {
        super.setRawInputType(r12);
        TextInputLayout m2519b = m2519b();
        if (m2519b != null) {
            m2519b.m2149s();
        }
    }

    public void setSimpleItemSelectedColor(int r12) {
        this.f3948k = r12;
        if (getAdapter() instanceof C0939s) {
            ((C0939s) getAdapter()).m2517a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f3949l = colorStateList;
        if (getAdapter() instanceof C0939s) {
            ((C0939s) getAdapter()).m2517a();
        }
    }

    public void setSimpleItems(int r2) {
        setSimpleItems(getResources().getStringArray(r2));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m2520c()) {
            this.f3942e.mo4799f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0939s(this, getContext(), this.f3945h, strArr));
    }
}
