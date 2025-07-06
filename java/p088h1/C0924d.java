package p088h1;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0756l;
import com.google.android.material.internal.CheckableImageButton;
import p032L0.AbstractC0367a;
import p050R0.RunnableC0458b;
import p103k0.AbstractC2480a;

/* renamed from: h1.d */
/* loaded from: classes.dex */
public final class C0924d extends AbstractC0934n {

    /* renamed from: e */
    public final int f3846e;

    /* renamed from: f */
    public final int f3847f;

    /* renamed from: g */
    public final TimeInterpolator f3848g;

    /* renamed from: h */
    public final TimeInterpolator f3849h;

    /* renamed from: i */
    public EditText f3850i;

    /* renamed from: j */
    public final ViewOnClickListenerC0756l f3851j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0921a f3852k;

    /* renamed from: l */
    public AnimatorSet f3853l;

    /* renamed from: m */
    public ValueAnimator f3854m;

    public C0924d(C0933m c0933m) {
        super(c0933m);
        this.f3851j = new ViewOnClickListenerC0756l(1, this);
        this.f3852k = new ViewOnFocusChangeListenerC0921a(this, 0);
        this.f3846e = AbstractC2480a.m4876Q(c0933m.getContext(), R.attr.motionDurationShort3, 100);
        this.f3847f = AbstractC2480a.m4876Q(c0933m.getContext(), R.attr.motionDurationShort3, 150);
        this.f3848g = AbstractC2480a.m4877R(c0933m.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0367a.f1001a);
        this.f3849h = AbstractC2480a.m4877R(c0933m.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0367a.f1004d);
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: a */
    public final void mo2469a() {
        if (this.f3900b.f3892p != null) {
            return;
        }
        m2479t(m2480u());
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: c */
    public final int mo2470c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: d */
    public final int mo2471d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: e */
    public final View.OnFocusChangeListener mo2472e() {
        return this.f3852k;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: f */
    public final View.OnClickListener mo2473f() {
        return this.f3851j;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: g */
    public final View.OnFocusChangeListener mo2474g() {
        return this.f3852k;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: m */
    public final void mo2475m(EditText editText) {
        this.f3850i = editText;
        this.f3899a.setEndIconVisible(m2480u());
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: p */
    public final void mo2476p(boolean z2) {
        if (this.f3900b.f3892p == null) {
            return;
        }
        m2479t(z2);
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: r */
    public final void mo2477r() {
        final int r02 = 1;
        final int r12 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f3849h);
        ofFloat.setDuration(this.f3847f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h1.b

            /* renamed from: b */
            public final /* synthetic */ C0924d f3843b;

            {
                this.f3843b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r02) {
                    case 0:
                        C0924d c0924d = this.f3843b;
                        c0924d.getClass();
                        c0924d.f3902d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0924d c0924d2 = this.f3843b;
                        c0924d2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0924d2.f3902d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3848g;
        ofFloat2.setInterpolator(timeInterpolator);
        int r6 = this.f3846e;
        ofFloat2.setDuration(r6);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h1.b

            /* renamed from: b */
            public final /* synthetic */ C0924d f3843b;

            {
                this.f3843b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r12) {
                    case 0:
                        C0924d c0924d = this.f3843b;
                        c0924d.getClass();
                        c0924d.f3902d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0924d c0924d2 = this.f3843b;
                        c0924d2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0924d2.f3902d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3853l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f3853l.addListener(new C0923c(this, r12));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(r6);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h1.b

            /* renamed from: b */
            public final /* synthetic */ C0924d f3843b;

            {
                this.f3843b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r12) {
                    case 0:
                        C0924d c0924d = this.f3843b;
                        c0924d.getClass();
                        c0924d.f3902d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0924d c0924d2 = this.f3843b;
                        c0924d2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0924d2.f3902d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f3854m = ofFloat3;
        ofFloat3.addListener(new C0923c(this, r02));
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: s */
    public final void mo2478s() {
        EditText editText = this.f3850i;
        if (editText != null) {
            editText.post(new RunnableC0458b(9, this));
        }
    }

    /* renamed from: t */
    public final void m2479t(boolean z2) {
        boolean z3 = this.f3900b.m2494d() == z2;
        if (z2 && !this.f3853l.isRunning()) {
            this.f3854m.cancel();
            this.f3853l.start();
            if (z3) {
                this.f3853l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f3853l.cancel();
        this.f3854m.start();
        if (z3) {
            this.f3854m.end();
        }
    }

    /* renamed from: u */
    public final boolean m2480u() {
        EditText editText = this.f3850i;
        return editText != null && (editText.hasFocus() || this.f3902d.hasFocus()) && this.f3850i.getText().length() > 0;
    }
}
