package p104l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.carwizard.p075li.youtube.R;
import p088h1.C0938r;
import p102k.ViewTreeObserverOnGlobalLayoutListenerC2457d;

/* renamed from: l.O */
/* loaded from: classes.dex */
public final class C2529O extends C2520J0 implements InterfaceC2533Q {

    /* renamed from: D */
    public CharSequence f8263D;

    /* renamed from: E */
    public C2525M f8264E;

    /* renamed from: F */
    public final Rect f8265F;

    /* renamed from: G */
    public int f8266G;

    /* renamed from: H */
    public final /* synthetic */ C2536S f8267H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2529O(C2536S c2536s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f8267H = c2536s;
        this.f8265F = new Rect();
        this.f8243o = c2536s;
        this.f8253y = true;
        this.f8254z.setFocusable(true);
        this.f8244p = new C0938r(1, this);
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: e */
    public final void mo4958e(int r5, int r6) {
        ViewTreeObserver viewTreeObserver;
        C2500A c2500a = this.f8254z;
        boolean isShowing = c2500a.isShowing();
        m4970s();
        this.f8254z.setInputMethodMode(2);
        mo4799f();
        C2622x0 c2622x0 = this.f8231c;
        c2622x0.setChoiceMode(1);
        AbstractC2519J.m4944d(c2622x0, r5);
        AbstractC2519J.m4943c(c2622x0, r6);
        C2536S c2536s = this.f8267H;
        int selectedItemPosition = c2536s.getSelectedItemPosition();
        C2622x0 c2622x02 = this.f8231c;
        if (c2500a.isShowing() && c2622x02 != null) {
            c2622x02.setListSelectionHidden(false);
            c2622x02.setSelection(selectedItemPosition);
            if (c2622x02.getChoiceMode() != 0) {
                c2622x02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c2536s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2457d viewTreeObserverOnGlobalLayoutListenerC2457d = new ViewTreeObserverOnGlobalLayoutListenerC2457d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2457d);
        this.f8254z.setOnDismissListener(new C2527N(this, viewTreeObserverOnGlobalLayoutListenerC2457d));
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: i */
    public final CharSequence mo4961i() {
        return this.f8263D;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: k */
    public final void mo4962k(CharSequence charSequence) {
        this.f8263D = charSequence;
    }

    @Override // p104l.C2520J0, p104l.InterfaceC2533Q
    /* renamed from: n */
    public final void mo4951n(ListAdapter listAdapter) {
        super.mo4951n(listAdapter);
        this.f8264E = (C2525M) listAdapter;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: p */
    public final void mo4965p(int r12) {
        this.f8266G = r12;
    }

    /* renamed from: s */
    public final void m4970s() {
        int r12;
        C2500A c2500a = this.f8254z;
        Drawable background = c2500a.getBackground();
        C2536S c2536s = this.f8267H;
        if (background != null) {
            background.getPadding(c2536s.f8284h);
            boolean m4922a = AbstractC2502A1.m4922a(c2536s);
            Rect rect = c2536s.f8284h;
            r12 = m4922a ? rect.right : -rect.left;
        } else {
            Rect rect2 = c2536s.f8284h;
            rect2.right = 0;
            rect2.left = 0;
            r12 = 0;
        }
        int paddingLeft = c2536s.getPaddingLeft();
        int paddingRight = c2536s.getPaddingRight();
        int width = c2536s.getWidth();
        int r6 = c2536s.f8283g;
        if (r6 == -2) {
            int m4972a = c2536s.m4972a(this.f8264E, c2500a.getBackground());
            int r62 = c2536s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c2536s.f8284h;
            int r63 = (r62 - rect3.left) - rect3.right;
            if (m4972a > r63) {
                m4972a = r63;
            }
            m4953r(Math.max(m4972a, (width - paddingLeft) - paddingRight));
        } else if (r6 == -1) {
            m4953r((width - paddingLeft) - paddingRight);
        } else {
            m4953r(r6);
        }
        this.f8234f = AbstractC2502A1.m4922a(c2536s) ? (((width - paddingRight) - this.f8233e) - this.f8266G) + r12 : paddingLeft + this.f8266G + r12;
    }
}
