package p088h1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0756l;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p028K.C0289W;
import p028K.C0290X;
import p031L.C0356j;
import p032L0.AbstractC0367a;
import p036M1.AbstractC0387m;
import p043P.C0412d;
import p050R0.RunnableC0458b;
import p103k0.AbstractC2480a;

/* renamed from: h1.j */
/* loaded from: classes.dex */
public final class C0930j extends AbstractC0934n {

    /* renamed from: e */
    public final int f3861e;

    /* renamed from: f */
    public final int f3862f;

    /* renamed from: g */
    public final TimeInterpolator f3863g;

    /* renamed from: h */
    public AutoCompleteTextView f3864h;

    /* renamed from: i */
    public final ViewOnClickListenerC0756l f3865i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0921a f3866j;

    /* renamed from: k */
    public final C0412d f3867k;

    /* renamed from: l */
    public boolean f3868l;

    /* renamed from: m */
    public boolean f3869m;

    /* renamed from: n */
    public boolean f3870n;

    /* renamed from: o */
    public long f3871o;

    /* renamed from: p */
    public AccessibilityManager f3872p;

    /* renamed from: q */
    public ValueAnimator f3873q;

    /* renamed from: r */
    public ValueAnimator f3874r;

    public C0930j(C0933m c0933m) {
        super(c0933m);
        this.f3865i = new ViewOnClickListenerC0756l(2, this);
        this.f3866j = new ViewOnFocusChangeListenerC0921a(this, 1);
        this.f3867k = new C0412d(this);
        this.f3871o = Long.MAX_VALUE;
        this.f3862f = AbstractC2480a.m4876Q(c0933m.getContext(), R.attr.motionDurationShort3, 67);
        this.f3861e = AbstractC2480a.m4876Q(c0933m.getContext(), R.attr.motionDurationShort3, 50);
        this.f3863g = AbstractC2480a.m4877R(c0933m.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0367a.f1001a);
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: a */
    public final void mo2469a() {
        if (this.f3872p.isTouchExplorationEnabled() && AbstractC0387m.m1100B(this.f3864h) && !this.f3902d.hasFocus()) {
            this.f3864h.dismissDropDown();
        }
        this.f3864h.post(new RunnableC0458b(10, this));
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: c */
    public final int mo2470c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: d */
    public final int mo2471d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: e */
    public final View.OnFocusChangeListener mo2472e() {
        return this.f3866j;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: f */
    public final View.OnClickListener mo2473f() {
        return this.f3865i;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: h */
    public final C0412d mo2482h() {
        return this.f3867k;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: i */
    public final boolean mo2483i(int r12) {
        return r12 != 0;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: j */
    public final boolean mo2484j() {
        return this.f3868l;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: l */
    public final boolean mo2485l() {
        return this.f3870n;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: m */
    public final void mo2475m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f3864h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: h1.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0930j c0930j = C0930j.this;
                c0930j.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - c0930j.f3871o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        c0930j.f3869m = false;
                    }
                    c0930j.m2489u();
                    c0930j.f3869m = true;
                    c0930j.f3871o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f3864h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: h1.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0930j c0930j = C0930j.this;
                c0930j.f3869m = true;
                c0930j.f3871o = System.currentTimeMillis();
                c0930j.m2488t(false);
            }
        });
        this.f3864h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3899a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC0387m.m1100B(editText) && this.f3872p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            this.f3902d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: n */
    public final void mo2486n(C0356j c0356j) {
        boolean m1100B = AbstractC0387m.m1100B(this.f3864h);
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        if (!m1100B) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfo.isShowingHintText() : c0356j.m1028e(4)) {
            c0356j.m1033j(null);
        }
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: o */
    public final void mo2487o(AccessibilityEvent accessibilityEvent) {
        if (!this.f3872p.isEnabled() || AbstractC0387m.m1100B(this.f3864h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f3870n && !this.f3864h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m2489u();
            this.f3869m = true;
            this.f3871o = System.currentTimeMillis();
        }
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: r */
    public final void mo2477r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3863g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f3862f);
        ofFloat.addUpdateListener(new C0289W(this));
        this.f3874r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f3861e);
        ofFloat2.addUpdateListener(new C0289W(this));
        this.f3873q = ofFloat2;
        ofFloat2.addListener(new C0290X(2, this));
        this.f3872p = (AccessibilityManager) this.f3901c.getSystemService("accessibility");
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: s */
    public final void mo2478s() {
        AutoCompleteTextView autoCompleteTextView = this.f3864h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3864h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m2488t(boolean z2) {
        if (this.f3870n != z2) {
            this.f3870n = z2;
            this.f3874r.cancel();
            this.f3873q.start();
        }
    }

    /* renamed from: u */
    public final void m2489u() {
        if (this.f3864h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3871o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f3869m = false;
        }
        if (this.f3869m) {
            this.f3869m = false;
            return;
        }
        m2488t(!this.f3870n);
        if (!this.f3870n) {
            this.f3864h.dismissDropDown();
        } else {
            this.f3864h.requestFocus();
            this.f3864h.showDropDown();
        }
    }
}
