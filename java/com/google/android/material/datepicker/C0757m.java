package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p006C.AbstractC0049a;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.AbstractC0294a0;
import p028K.C0268A0;
import p028K.C0342y0;
import p028K.C0344z0;
import p029K0.AbstractC0345a;
import p035M0.C0374b;
import p036M1.AbstractC0379e;
import p059V0.ViewOnTouchListenerC0535a;
import p081e1.C0881g;
import p124s0.C2738i;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0757m<S> extends DialogInterfaceOnCancelListenerC0662l {

    /* renamed from: A0 */
    public boolean f2897A0;

    /* renamed from: B0 */
    public CharSequence f2898B0;

    /* renamed from: C0 */
    public CharSequence f2899C0;

    /* renamed from: f0 */
    public final LinkedHashSet f2900f0;

    /* renamed from: g0 */
    public final LinkedHashSet f2901g0;

    /* renamed from: h0 */
    public int f2902h0;

    /* renamed from: i0 */
    public AbstractC0764t f2903i0;

    /* renamed from: j0 */
    public C0746b f2904j0;

    /* renamed from: k0 */
    public C0755k f2905k0;

    /* renamed from: l0 */
    public int f2906l0;

    /* renamed from: m0 */
    public CharSequence f2907m0;

    /* renamed from: n0 */
    public boolean f2908n0;

    /* renamed from: o0 */
    public int f2909o0;

    /* renamed from: p0 */
    public int f2910p0;

    /* renamed from: q0 */
    public CharSequence f2911q0;

    /* renamed from: r0 */
    public int f2912r0;

    /* renamed from: s0 */
    public CharSequence f2913s0;

    /* renamed from: t0 */
    public int f2914t0;

    /* renamed from: u0 */
    public CharSequence f2915u0;

    /* renamed from: v0 */
    public int f2916v0;

    /* renamed from: w0 */
    public CharSequence f2917w0;

    /* renamed from: x0 */
    public TextView f2918x0;

    /* renamed from: y0 */
    public CheckableImageButton f2919y0;

    /* renamed from: z0 */
    public C0881g f2920z0;

    public C0757m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2900f0 = new LinkedHashSet();
        this.f2901g0 = new LinkedHashSet();
    }

    /* renamed from: C */
    public static int m2108C(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar m2123b = AbstractC0767w.m2123b();
        m2123b.set(5, 1);
        Calendar m2122a = AbstractC0767w.m2122a(m2123b);
        m2122a.get(2);
        m2122a.get(1);
        int maximum = m2122a.getMaximum(7);
        m2122a.getActualMaximum(5);
        m2122a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: D */
    public static boolean m2109D(Context context, int r3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0379e.m1088z(context, C0755k.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{r3});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l
    /* renamed from: A */
    public final Dialog mo1751A() {
        Context m1770w = m1770w();
        m1770w();
        int r2 = this.f2902h0;
        if (r2 == 0) {
            m2110B();
            throw null;
        }
        Dialog dialog = new Dialog(m1770w, r2);
        Context context = dialog.getContext();
        this.f2908n0 = m2109D(context, android.R.attr.windowFullscreen);
        this.f2920z0 = new C0881g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0345a.f960l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f2920z0.m2405h(context);
        this.f2920z0.m2407j(ColorStateList.valueOf(color));
        C0881g c0881g = this.f2920z0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        c0881g.m2406i(AbstractC0272E.m705i(decorView));
        return dialog;
    }

    /* renamed from: B */
    public final void m2110B() {
        if (this.f2317f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: m */
    public final void mo1754m(Bundle bundle) {
        super.mo1754m(bundle);
        if (bundle == null) {
            bundle = this.f2317f;
        }
        this.f2902h0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2904j0 = (C0746b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2906l0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2907m0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2909o0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2910p0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2911q0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2912r0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2913s0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2914t0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2915u0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2916v0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2917w0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f2907m0;
        if (charSequence == null) {
            charSequence = m1770w().getResources().getText(this.f2906l0);
        }
        this.f2898B0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f2899C0 = charSequence;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: n */
    public final View mo1769n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f2908n0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f2908n0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2108C(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m2108C(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        textView.setAccessibilityLiveRegion(1);
        this.f2919y0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2918x0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2919y0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2919y0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0580g.m1449n(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0580g.m1449n(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2919y0.setChecked(this.f2909o0 != 0);
        AbstractC0283P.m779l(this.f2919y0, null);
        CheckableImageButton checkableImageButton2 = this.f2919y0;
        this.f2919y0.setContentDescription(this.f2909o0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2919y0.setOnClickListener(new ViewOnClickListenerC0756l(0, this));
        m2110B();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2900f0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2901g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2300E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: r */
    public final void mo1758r(Bundle bundle) {
        super.mo1758r(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2902h0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0746b c0746b = this.f2904j0;
        C0745a c0745a = new C0745a();
        int r5 = C0745a.f2857b;
        int r52 = C0745a.f2857b;
        long j2 = c0746b.f2859a.f2928f;
        long j3 = c0746b.f2860b.f2928f;
        c0745a.f2858a = Long.valueOf(c0746b.f2862d.f2928f);
        C0755k c0755k = this.f2905k0;
        C0759o c0759o = c0755k == null ? null : c0755k.f2886U;
        if (c0759o != null) {
            c0745a.f2858a = Long.valueOf(c0759o.f2928f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0746b.f2861c);
        C0759o m2112b = C0759o.m2112b(j2);
        C0759o m2112b2 = C0759o.m2112b(j3);
        C0748d c0748d = (C0748d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = c0745a.f2858a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0746b(m2112b, m2112b2, c0748d, l2 == null ? null : C0759o.m2112b(l2.longValue()), c0746b.f2863e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2906l0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2907m0);
        bundle.putInt("INPUT_MODE_KEY", this.f2909o0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2910p0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2911q0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2912r0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2913s0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2914t0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2915u0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2916v0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2917w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: s */
    public final void mo1759s() {
        C0342y0 c0342y0;
        C0342y0 c0342y02;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.mo1759s();
        Dialog dialog = this.f2278a0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f2908n0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2920z0);
            if (!this.f2897A0) {
                View findViewById = m1771x().findViewById(R.id.fullscreen_header);
                ColorStateList m1448m = AbstractC0580g.m1448m(findViewById.getBackground());
                Integer valueOf = m1448m != null ? Integer.valueOf(m1448m.getDefaultColor()) : null;
                int r3 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int m1079o = AbstractC0379e.m1079o(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(m1079o);
                }
                if (r3 >= 30) {
                    AbstractC0294a0.m803a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                int m194d = r3 < 27 ? AbstractC0049a.m194d(AbstractC0379e.m1079o(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(m194d);
                boolean z4 = AbstractC0379e.m1081s(0) || AbstractC0379e.m1081s(valueOf.intValue());
                C2738i c2738i = new C2738i(window.getDecorView());
                int r9 = Build.VERSION.SDK_INT;
                if (r9 >= 30) {
                    insetsController2 = window.getInsetsController();
                    C0268A0 c0268a0 = new C0268A0(insetsController2, c2738i);
                    c0268a0.f829e = window;
                    c0342y0 = c0268a0;
                } else {
                    c0342y0 = r9 >= 26 ? new C0344z0(window, c2738i) : new C0342y0(window, c2738i);
                }
                c0342y0.mo84J(z4);
                boolean m1081s = AbstractC0379e.m1081s(m1079o);
                if (AbstractC0379e.m1081s(m194d) || (m194d == 0 && m1081s)) {
                    z2 = true;
                }
                C2738i c2738i2 = new C2738i(window.getDecorView());
                int r2 = Build.VERSION.SDK_INT;
                if (r2 >= 30) {
                    insetsController = window.getInsetsController();
                    C0268A0 c0268a02 = new C0268A0(insetsController, c2738i2);
                    c0268a02.f829e = window;
                    c0342y02 = c0268a02;
                } else {
                    c0342y02 = r2 >= 26 ? new C0344z0(window, c2738i2) : new C0342y0(window, c2738i2);
                }
                c0342y02.mo83I(z2);
                C0374b c0374b = new C0374b(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                AbstractC0272E.m717u(findViewById, c0374b);
                this.f2897A0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1770w().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2920z0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f2278a0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC0535a(dialog2, rect));
        }
        m1770w();
        int r02 = this.f2902h0;
        if (r02 == 0) {
            m2110B();
            throw null;
        }
        m2110B();
        C0746b c0746b = this.f2904j0;
        C0755k c0755k = new C0755k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", r02);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0746b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0746b.f2862d);
        c0755k.m1773z(bundle);
        this.f2905k0 = c0755k;
        AbstractC0764t abstractC0764t = c0755k;
        if (this.f2909o0 == 1) {
            m2110B();
            C0746b c0746b2 = this.f2904j0;
            AbstractC0764t c0758n = new C0758n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", r02);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0746b2);
            c0758n.m1773z(bundle2);
            abstractC0764t = c0758n;
        }
        this.f2903i0 = abstractC0764t;
        this.f2918x0.setText((this.f2909o0 == 1 && m1770w().getResources().getConfiguration().orientation == 2) ? this.f2899C0 : this.f2898B0);
        m2110B();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l, androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: t */
    public final void mo1760t() {
        this.f2903i0.f2942R.clear();
        super.mo1760t();
    }
}
