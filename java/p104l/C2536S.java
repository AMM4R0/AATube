package p104l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p102k.ViewTreeObserverOnGlobalLayoutListenerC2457d;

/* renamed from: l.S */
/* loaded from: classes.dex */
public final class C2536S extends Spinner {

    /* renamed from: i */
    public static final int[] f8276i = {R.attr.spinnerMode};

    /* renamed from: a */
    public final C2597p f8277a;

    /* renamed from: b */
    public final Context f8278b;

    /* renamed from: c */
    public final C2515H f8279c;

    /* renamed from: d */
    public SpinnerAdapter f8280d;

    /* renamed from: e */
    public final boolean f8281e;

    /* renamed from: f */
    public final InterfaceC2533Q f8282f;

    /* renamed from: g */
    public int f8283g;

    /* renamed from: h */
    public final Rect f8284h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2536S(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130904087(0x7f030417, float:1.741501E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f8284h = r1
            android.content.Context r1 = r12.getContext()
            p104l.AbstractC2578i1.m5030a(r12, r1)
            int[] r1 = p076d.AbstractC0780a.f3135v
            A1.h r2 = p002A1.C0015h.m100A(r13, r14, r1, r0)
            l.p r3 = new l.p
            r3.<init>(r12)
            r12.f8277a = r3
            java.lang.Object r3 = r2.f26c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            j.d r6 = new j.d
            r6.<init>(r13, r4)
            r12.f8278b = r6
            goto L37
        L35:
            r12.f8278b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = p104l.C2536S.f8276i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            l.O r4 = new l.O
            android.content.Context r9 = r12.f8278b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f8278b
            A1.h r1 = p002A1.C0015h.m100A(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f26c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f8283g = r9
            android.graphics.drawable.Drawable r9 = r1.m121p(r8)
            r4.m4949l(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f8263D = r7
            r1.m102C()
            r12.f8282f = r4
            l.H r1 = new l.H
            r1.<init>(r12, r12, r4)
            r12.f8279c = r1
            goto Laa
        L9d:
            l.L r1 = new l.L
            r1.<init>(r12)
            r12.f8282f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f8257c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131492998(0x7f0c0086, float:1.8609464E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.m102C()
            r12.f8281e = r8
            android.widget.SpinnerAdapter r13 = r12.f8280d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f8280d = r6
        Lcf:
            l.p r13 = r12.f8277a
            r13.m5058d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.C2536S.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final int m4972a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int r02 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int r3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != r02) {
                view = null;
                r02 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            r3 = Math.max(r3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return r3;
        }
        Rect rect = this.f8284h;
        drawable.getPadding(rect);
        return r3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        return interfaceC2533Q != null ? interfaceC2533Q.mo4957d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        return interfaceC2533Q != null ? interfaceC2533Q.mo4959g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8282f != null ? this.f8283g : super.getDropDownWidth();
    }

    public final InterfaceC2533Q getInternalPopup() {
        return this.f8282f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        return interfaceC2533Q != null ? interfaceC2533Q.mo4960h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8278b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        return interfaceC2533Q != null ? interfaceC2533Q.mo4961i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q == null || !interfaceC2533Q.mo4956b()) {
            return;
        }
        interfaceC2533Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        if (this.f8282f == null || View.MeasureSpec.getMode(r3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m4972a(getAdapter(), getBackground())), View.MeasureSpec.getSize(r3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C2531P c2531p = (C2531P) parcelable;
        super.onRestoreInstanceState(c2531p.getSuperState());
        if (!c2531p.f8272a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2457d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2531P c2531p = new C2531P(super.onSaveInstanceState());
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        c2531p.f8272a = interfaceC2533Q != null && interfaceC2533Q.mo4956b();
        return c2531p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2515H c2515h = this.f8279c;
        if (c2515h == null || !c2515h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q == null) {
            return super.performClick();
        }
        if (interfaceC2533Q.mo4956b()) {
            return true;
        }
        this.f8282f.mo4958e(AbstractC2519J.m4942b(this), AbstractC2519J.m4941a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q == null) {
            super.setDropDownHorizontalOffset(r2);
        } else {
            interfaceC2533Q.mo4965p(r2);
            interfaceC2533Q.mo4955a(r2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q != null) {
            interfaceC2533Q.mo4964m(r2);
        } else {
            super.setDropDownVerticalOffset(r2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
        if (this.f8282f != null) {
            this.f8283g = r2;
        } else {
            super.setDropDownWidth(r2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q != null) {
            interfaceC2533Q.mo4963l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
        setPopupBackgroundDrawable(AbstractC0580g.m1449n(getPopupContext(), r2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q != null) {
            interfaceC2533Q.mo4962k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8277a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8281e) {
            this.f8280d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC2533Q interfaceC2533Q = this.f8282f;
        if (interfaceC2533Q != null) {
            Context context = this.f8278b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C2525M c2525m = new C2525M();
            c2525m.f8259a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c2525m.f8260b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC2521K.m4954a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC2533Q.mo4951n(c2525m);
        }
    }
}
