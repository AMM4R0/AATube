package p088h1;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p031L.C0356j;
import p043P.C0412d;

/* renamed from: h1.n */
/* loaded from: classes.dex */
public abstract class AbstractC0934n {

    /* renamed from: a */
    public final TextInputLayout f3899a;

    /* renamed from: b */
    public final C0933m f3900b;

    /* renamed from: c */
    public final Context f3901c;

    /* renamed from: d */
    public final CheckableImageButton f3902d;

    public AbstractC0934n(C0933m c0933m) {
        this.f3899a = c0933m.f3877a;
        this.f3900b = c0933m;
        this.f3901c = c0933m.getContext();
        this.f3902d = c0933m.f3883g;
    }

    /* renamed from: c */
    public int mo2470c() {
        return 0;
    }

    /* renamed from: d */
    public int mo2471d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo2472e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo2473f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo2474g() {
        return null;
    }

    /* renamed from: h */
    public C0412d mo2482h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo2483i(int r12) {
        return true;
    }

    /* renamed from: j */
    public boolean mo2484j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo2506k() {
        return this instanceof C0930j;
    }

    /* renamed from: l */
    public boolean mo2485l() {
        return false;
    }

    /* renamed from: q */
    public final void m2507q() {
        this.f3900b.m2496f(false);
    }

    /* renamed from: a */
    public void mo2469a() {
    }

    /* renamed from: b */
    public void mo2505b() {
    }

    /* renamed from: r */
    public void mo2477r() {
    }

    /* renamed from: s */
    public void mo2478s() {
    }

    /* renamed from: m */
    public void mo2475m(EditText editText) {
    }

    /* renamed from: n */
    public void mo2486n(C0356j c0356j) {
    }

    /* renamed from: o */
    public void mo2487o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo2476p(boolean z2) {
    }
}
