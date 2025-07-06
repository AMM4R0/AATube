package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p008C1.C0077i;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;

/* renamed from: l.p */
/* loaded from: classes.dex */
public final class C2597p {

    /* renamed from: a */
    public final View f8438a;

    /* renamed from: d */
    public C0077i f8441d;

    /* renamed from: e */
    public C0077i f8442e;

    /* renamed from: f */
    public C0077i f8443f;

    /* renamed from: c */
    public int f8440c = -1;

    /* renamed from: b */
    public final C2609t f8439b = C2609t.m5069a();

    public C2597p(View view) {
        this.f8438a = view;
    }

    /* renamed from: a */
    public final void m5055a() {
        View view = this.f8438a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f8441d != null) {
                if (this.f8443f == null) {
                    this.f8443f = new C0077i();
                }
                C0077i c0077i = this.f8443f;
                c0077i.f197c = null;
                c0077i.f196b = false;
                c0077i.f198d = null;
                c0077i.f195a = false;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                ColorStateList m703g = AbstractC0272E.m703g(view);
                if (m703g != null) {
                    c0077i.f196b = true;
                    c0077i.f197c = m703g;
                }
                PorterDuff.Mode m704h = AbstractC0272E.m704h(view);
                if (m704h != null) {
                    c0077i.f195a = true;
                    c0077i.f198d = m704h;
                }
                if (c0077i.f196b || c0077i.f195a) {
                    C2609t.m5072e(background, c0077i, view.getDrawableState());
                    return;
                }
            }
            C0077i c0077i2 = this.f8442e;
            if (c0077i2 != null) {
                C2609t.m5072e(background, c0077i2, view.getDrawableState());
                return;
            }
            C0077i c0077i3 = this.f8441d;
            if (c0077i3 != null) {
                C2609t.m5072e(background, c0077i3, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList m5056b() {
        C0077i c0077i = this.f8442e;
        if (c0077i != null) {
            return (ColorStateList) c0077i.f197c;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode m5057c() {
        C0077i c0077i = this.f8442e;
        if (c0077i != null) {
            return (PorterDuff.Mode) c0077i.f198d;
        }
        return null;
    }

    /* renamed from: d */
    public final void m5058d(AttributeSet attributeSet, int r11) {
        ColorStateList m4982i;
        View view = this.f8438a;
        Context context = view.getContext();
        int[] r4 = AbstractC0780a.f3112A;
        C0015h m100A = C0015h.m100A(context, attributeSet, r4, r11);
        TypedArray typedArray = (TypedArray) m100A.f26c;
        View view2 = this.f8438a;
        AbstractC0283P.m778k(view2, view2.getContext(), r4, attributeSet, (TypedArray) m100A.f26c, r11);
        try {
            if (typedArray.hasValue(0)) {
                this.f8440c = typedArray.getResourceId(0, -1);
                C2609t c2609t = this.f8439b;
                Context context2 = view.getContext();
                int r3 = this.f8440c;
                synchronized (c2609t) {
                    m4982i = c2609t.f8472a.m4982i(context2, r3);
                }
                if (m4982i != null) {
                    m5061g(m4982i);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0272E.m713q(view, m100A.m120o(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0272E.m714r(view, AbstractC2604r0.m5067c(typedArray.getInt(2, -1), null));
            }
        } finally {
            m100A.m102C();
        }
    }

    /* renamed from: e */
    public final void m5059e() {
        this.f8440c = -1;
        m5061g(null);
        m5055a();
    }

    /* renamed from: f */
    public final void m5060f(int r4) {
        ColorStateList colorStateList;
        this.f8440c = r4;
        C2609t c2609t = this.f8439b;
        if (c2609t != null) {
            Context context = this.f8438a.getContext();
            synchronized (c2609t) {
                colorStateList = c2609t.f8472a.m4982i(context, r4);
            }
        } else {
            colorStateList = null;
        }
        m5061g(colorStateList);
        m5055a();
    }

    /* renamed from: g */
    public final void m5061g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8441d == null) {
                this.f8441d = new C0077i();
            }
            C0077i c0077i = this.f8441d;
            c0077i.f197c = colorStateList;
            c0077i.f196b = true;
        } else {
            this.f8441d = null;
        }
        m5055a();
    }

    /* renamed from: h */
    public final void m5062h(ColorStateList colorStateList) {
        if (this.f8442e == null) {
            this.f8442e = new C0077i();
        }
        C0077i c0077i = this.f8442e;
        c0077i.f197c = colorStateList;
        c0077i.f196b = true;
        m5055a();
    }

    /* renamed from: i */
    public final void m5063i(PorterDuff.Mode mode) {
        if (this.f8442e == null) {
            this.f8442e = new C0077i();
        }
        C0077i c0077i = this.f8442e;
        c0077i.f198d = mode;
        c0077i.f195a = true;
        m5055a();
    }
}
