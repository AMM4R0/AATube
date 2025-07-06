package p088h1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0756l;

/* renamed from: h1.u */
/* loaded from: classes.dex */
public final class C0941u extends AbstractC0934n {

    /* renamed from: e */
    public final int f3950e;

    /* renamed from: f */
    public EditText f3951f;

    /* renamed from: g */
    public final ViewOnClickListenerC0756l f3952g;

    public C0941u(C0933m c0933m, int r3) {
        super(c0933m);
        this.f3950e = R.drawable.design_password_eye;
        this.f3952g = new ViewOnClickListenerC0756l(3, this);
        if (r3 != 0) {
            this.f3950e = r3;
        }
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: b */
    public final void mo2505b() {
        m2507q();
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: c */
    public final int mo2470c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: d */
    public final int mo2471d() {
        return this.f3950e;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: f */
    public final View.OnClickListener mo2473f() {
        return this.f3952g;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: k */
    public final boolean mo2506k() {
        return true;
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: l */
    public final boolean mo2485l() {
        EditText editText = this.f3951f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: m */
    public final void mo2475m(EditText editText) {
        this.f3951f = editText;
        m2507q();
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: r */
    public final void mo2477r() {
        EditText editText = this.f3951f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3951f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p088h1.AbstractC0934n
    /* renamed from: s */
    public final void mo2478s() {
        EditText editText = this.f3951f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
