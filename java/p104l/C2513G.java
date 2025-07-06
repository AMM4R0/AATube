package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.carwizard.p075li.youtube.R;
import p002A1.C0015h;
import p009D.AbstractC0095a;
import p009D.AbstractC0096b;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;

/* renamed from: l.G */
/* loaded from: classes.dex */
public final class C2513G extends C2503B {

    /* renamed from: e */
    public final C2511F f8214e;

    /* renamed from: f */
    public Drawable f8215f;

    /* renamed from: g */
    public ColorStateList f8216g;

    /* renamed from: h */
    public PorterDuff.Mode f8217h;

    /* renamed from: i */
    public boolean f8218i;

    /* renamed from: j */
    public boolean f8219j;

    public C2513G(C2511F c2511f) {
        super(c2511f);
        this.f8216g = null;
        this.f8217h = null;
        this.f8218i = false;
        this.f8219j = false;
        this.f8214e = c2511f;
    }

    @Override // p104l.C2503B
    /* renamed from: b */
    public final void mo4924b(AttributeSet attributeSet, int r9) {
        super.mo4924b(attributeSet, R.attr.seekBarStyle);
        C2511F c2511f = this.f8214e;
        Context context = c2511f.getContext();
        int[] r2 = AbstractC0780a.f3120g;
        C0015h m100A = C0015h.m100A(context, attributeSet, r2, R.attr.seekBarStyle);
        AbstractC0283P.m778k(c2511f, c2511f.getContext(), r2, attributeSet, (TypedArray) m100A.f26c, R.attr.seekBarStyle);
        Drawable m122q = m100A.m122q(0);
        if (m122q != null) {
            c2511f.setThumb(m122q);
        }
        Drawable m121p = m100A.m121p(1);
        Drawable drawable = this.f8215f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f8215f = m121p;
        if (m121p != null) {
            m121p.setCallback(c2511f);
            AbstractC0096b.m322b(m121p, c2511f.getLayoutDirection());
            if (m121p.isStateful()) {
                m121p.setState(c2511f.getDrawableState());
            }
            m4938f();
        }
        c2511f.invalidate();
        TypedArray typedArray = (TypedArray) m100A.f26c;
        if (typedArray.hasValue(3)) {
            this.f8217h = AbstractC2604r0.m5067c(typedArray.getInt(3, -1), this.f8217h);
            this.f8219j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f8216g = m100A.m120o(2);
            this.f8218i = true;
        }
        m100A.m102C();
        m4938f();
    }

    /* renamed from: f */
    public final void m4938f() {
        Drawable drawable = this.f8215f;
        if (drawable != null) {
            if (this.f8218i || this.f8219j) {
                Drawable mutate = drawable.mutate();
                this.f8215f = mutate;
                if (this.f8218i) {
                    AbstractC0095a.m319h(mutate, this.f8216g);
                }
                if (this.f8219j) {
                    AbstractC0095a.m320i(this.f8215f, this.f8217h);
                }
                if (this.f8215f.isStateful()) {
                    this.f8215f.setState(this.f8214e.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public final void m4939g(Canvas canvas) {
        if (this.f8215f != null) {
            int max = this.f8214e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8215f.getIntrinsicWidth();
                int intrinsicHeight = this.f8215f.getIntrinsicHeight();
                int r3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int r2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8215f.setBounds(-r3, -r2, r3, r2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int r02 = 0; r02 <= max; r02++) {
                    this.f8215f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
