package p088h1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p032L0.AbstractC0367a;
import p036M1.AbstractC0387m;
import p103k0.AbstractC2480a;
import p104l.C2562d0;

/* renamed from: h1.q */
/* loaded from: classes.dex */
public final class C0937q {

    /* renamed from: A */
    public ColorStateList f3909A;

    /* renamed from: B */
    public Typeface f3910B;

    /* renamed from: a */
    public final int f3911a;

    /* renamed from: b */
    public final int f3912b;

    /* renamed from: c */
    public final int f3913c;

    /* renamed from: d */
    public final TimeInterpolator f3914d;

    /* renamed from: e */
    public final TimeInterpolator f3915e;

    /* renamed from: f */
    public final TimeInterpolator f3916f;

    /* renamed from: g */
    public final Context f3917g;

    /* renamed from: h */
    public final TextInputLayout f3918h;

    /* renamed from: i */
    public LinearLayout f3919i;

    /* renamed from: j */
    public int f3920j;

    /* renamed from: k */
    public FrameLayout f3921k;

    /* renamed from: l */
    public AnimatorSet f3922l;

    /* renamed from: m */
    public final float f3923m;

    /* renamed from: n */
    public int f3924n;

    /* renamed from: o */
    public int f3925o;

    /* renamed from: p */
    public CharSequence f3926p;

    /* renamed from: q */
    public boolean f3927q;

    /* renamed from: r */
    public C2562d0 f3928r;

    /* renamed from: s */
    public CharSequence f3929s;

    /* renamed from: t */
    public int f3930t;

    /* renamed from: u */
    public int f3931u;

    /* renamed from: v */
    public ColorStateList f3932v;

    /* renamed from: w */
    public CharSequence f3933w;

    /* renamed from: x */
    public boolean f3934x;

    /* renamed from: y */
    public C2562d0 f3935y;

    /* renamed from: z */
    public int f3936z;

    public C0937q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3917g = context;
        this.f3918h = textInputLayout;
        this.f3923m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3911a = AbstractC2480a.m4876Q(context, R.attr.motionDurationShort4, 217);
        this.f3912b = AbstractC2480a.m4876Q(context, R.attr.motionDurationMedium4, 167);
        this.f3913c = AbstractC2480a.m4876Q(context, R.attr.motionDurationShort4, 167);
        this.f3914d = AbstractC2480a.m4877R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0367a.f1004d);
        LinearInterpolator linearInterpolator = AbstractC0367a.f1001a;
        this.f3915e = AbstractC2480a.m4877R(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3916f = AbstractC2480a.m4877R(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m2508a(C2562d0 c2562d0, int r8) {
        if (this.f3919i == null && this.f3921k == null) {
            Context context = this.f3917g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3919i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3919i;
            TextInputLayout textInputLayout = this.f3918h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3921k = new FrameLayout(context);
            this.f3919i.addView(this.f3921k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m2509b();
            }
        }
        if (r8 == 0 || r8 == 1) {
            this.f3921k.setVisibility(0);
            this.f3921k.addView(c2562d0);
        } else {
            this.f3919i.addView(c2562d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3919i.setVisibility(0);
        this.f3920j++;
    }

    /* renamed from: b */
    public final void m2509b() {
        if (this.f3919i != null) {
            TextInputLayout textInputLayout = this.f3918h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3917g;
                boolean m1101D = AbstractC0387m.m1101D(context);
                LinearLayout linearLayout = this.f3919i;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                int paddingStart = editText.getPaddingStart();
                if (m1101D) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (m1101D) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (m1101D) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m2510c() {
        AnimatorSet animatorSet = this.f3922l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m2511d(ArrayList arrayList, boolean z2, C2562d0 c2562d0, int r11, int r12, int r13) {
        if (c2562d0 == null || !z2) {
            return;
        }
        if (r11 == r13 || r11 == r12) {
            boolean z3 = r13 == r11;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c2562d0, (Property<C2562d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int r4 = this.f3913c;
            ofFloat.setDuration(z3 ? this.f3912b : r4);
            ofFloat.setInterpolator(z3 ? this.f3915e : this.f3916f);
            if (r11 == r13 && r12 != 0) {
                ofFloat.setStartDelay(r4);
            }
            arrayList.add(ofFloat);
            if (r13 != r11 || r12 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c2562d0, (Property<C2562d0, Float>) View.TRANSLATION_Y, -this.f3923m, 0.0f);
            ofFloat2.setDuration(this.f3911a);
            ofFloat2.setInterpolator(this.f3914d);
            ofFloat2.setStartDelay(r4);
            arrayList.add(ofFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m2512e(int r2) {
        if (r2 == 1) {
            return this.f3928r;
        }
        if (r2 != 2) {
            return null;
        }
        return this.f3935y;
    }

    /* renamed from: f */
    public final void m2513f() {
        this.f3926p = null;
        m2510c();
        if (this.f3924n == 1) {
            if (!this.f3934x || TextUtils.isEmpty(this.f3933w)) {
                this.f3925o = 0;
            } else {
                this.f3925o = 2;
            }
        }
        m2516i(this.f3924n, this.f3925o, m2515h(this.f3928r, ""));
    }

    /* renamed from: g */
    public final void m2514g(C2562d0 c2562d0, int r4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3919i;
        if (linearLayout == null) {
            return;
        }
        if ((r4 == 0 || r4 == 1) && (frameLayout = this.f3921k) != null) {
            frameLayout.removeView(c2562d0);
        } else {
            linearLayout.removeView(c2562d0);
        }
        int r3 = this.f3920j - 1;
        this.f3920j = r3;
        LinearLayout linearLayout2 = this.f3919i;
        if (r3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m2515h(C2562d0 c2562d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        TextInputLayout textInputLayout = this.f3918h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f3925o == this.f3924n && c2562d0 != null && TextUtils.equals(c2562d0.getText(), charSequence));
    }

    /* renamed from: i */
    public final void m2516i(int r17, int r18, boolean z2) {
        TextView m2512e;
        TextView m2512e2;
        if (r17 == r18) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3922l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m2511d(arrayList, this.f3934x, this.f3935y, 2, r17, r18);
            m2511d(arrayList, this.f3927q, this.f3928r, 1, r17, r18);
            int size = arrayList.size();
            long j2 = 0;
            for (int r3 = 0; r3 < size; r3++) {
                Animator animator = (Animator) arrayList.get(r3);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C0935o(this, r18, m2512e(r17), r17, m2512e(r18)));
            animatorSet.start();
        } else if (r17 != r18) {
            if (r18 != 0 && (m2512e2 = m2512e(r18)) != null) {
                m2512e2.setVisibility(0);
                m2512e2.setAlpha(1.0f);
            }
            if (r17 != 0 && (m2512e = m2512e(r17)) != null) {
                m2512e.setVisibility(4);
                if (r17 == 1) {
                    m2512e.setText((CharSequence) null);
                }
            }
            this.f3924n = r18;
        }
        TextInputLayout textInputLayout = this.f3918h;
        textInputLayout.m2148r();
        textInputLayout.m2151u(z2, false);
        textInputLayout.m2154x();
    }
}
