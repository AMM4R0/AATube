package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p076d.AbstractC0780a;
import p102k.AbstractC2456c;
import p102k.C2455b;
import p102k.C2468o;
import p102k.InterfaceC2448A;
import p102k.InterfaceC2465l;
import p102k.MenuC2466m;
import p104l.C2562d0;
import p104l.InterfaceC2585l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C2562d0 implements InterfaceC2448A, View.OnClickListener, InterfaceC2585l {

    /* renamed from: h */
    public C2468o f1717h;

    /* renamed from: i */
    public CharSequence f1718i;

    /* renamed from: j */
    public Drawable f1719j;

    /* renamed from: k */
    public InterfaceC2465l f1720k;

    /* renamed from: l */
    public C2455b f1721l;

    /* renamed from: m */
    public AbstractC2456c f1722m;

    /* renamed from: n */
    public boolean f1723n;

    /* renamed from: o */
    public boolean f1724o;

    /* renamed from: p */
    public final int f1725p;

    /* renamed from: q */
    public int f1726q;

    /* renamed from: r */
    public final int f1727r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1723n = m1489g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3116c, 0, 0);
        this.f1725p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1727r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1726q = -1;
        setSaveEnabled(false);
    }

    @Override // p104l.InterfaceC2585l
    /* renamed from: a */
    public final boolean mo1486a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p104l.InterfaceC2585l
    /* renamed from: b */
    public final boolean mo1487b() {
        return !TextUtils.isEmpty(getText()) && this.f1717h.getIcon() == null;
    }

    @Override // p102k.InterfaceC2448A
    /* renamed from: c */
    public final void mo1488c(C2468o c2468o) {
        this.f1717h = c2468o;
        setIcon(c2468o.getIcon());
        setTitle(c2468o.getTitleCondensed());
        setId(c2468o.f8095a);
        setVisibility(c2468o.isVisible() ? 0 : 8);
        setEnabled(c2468o.isEnabled());
        if (c2468o.hasSubMenu() && this.f1721l == null) {
            this.f1721l = new C2455b(this);
        }
    }

    /* renamed from: g */
    public final boolean m1489g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int r12 = configuration.screenWidthDp;
        return r12 >= 480 || (r12 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p102k.InterfaceC2448A
    public C2468o getItemData() {
        return this.f1717h;
    }

    /* renamed from: h */
    public final void m1490h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1718i);
        if (this.f1719j != null && ((this.f1717h.f8119y & 4) != 4 || (!this.f1723n && !this.f1724o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1718i : null);
        CharSequence charSequence = this.f1717h.f8111q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1717h.f8099e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1717h.f8112r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0580g.m1459z(this, z4 ? null : this.f1717h.f8099e);
        } else {
            AbstractC0580g.m1459z(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2465l interfaceC2465l = this.f1720k;
        if (interfaceC2465l != null) {
            interfaceC2465l.mo1491a(this.f1717h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1723n = m1489g();
        m1490h();
    }

    @Override // p104l.C2562d0, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
        int r12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (r12 = this.f1726q) >= 0) {
            super.setPadding(r12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(r6, r7);
        int mode = View.MeasureSpec.getMode(r6);
        int size = View.MeasureSpec.getSize(r6);
        int measuredWidth = getMeasuredWidth();
        int r3 = this.f1725p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, r3) : r3;
        if (mode != 1073741824 && r3 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), r7);
        }
        if (!isEmpty || this.f1719j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1719j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2455b c2455b;
        if (this.f1717h.hasSubMenu() && (c2455b = this.f1721l) != null && c2455b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1724o != z2) {
            this.f1724o = z2;
            C2468o c2468o = this.f1717h;
            if (c2468o != null) {
                MenuC2466m menuC2466m = c2468o.f8108n;
                menuC2466m.f8075k = true;
                menuC2466m.m4841p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1719j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int r2 = this.f1727r;
            if (intrinsicWidth > r2) {
                intrinsicHeight = (int) (intrinsicHeight * (r2 / intrinsicWidth));
                intrinsicWidth = r2;
            }
            if (intrinsicHeight > r2) {
                intrinsicWidth = (int) (intrinsicWidth * (r2 / intrinsicHeight));
            } else {
                r2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, r2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1490h();
    }

    public void setItemInvoker(InterfaceC2465l interfaceC2465l) {
        this.f1720k = interfaceC2465l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r12, int r2, int r3, int r4) {
        this.f1726q = r12;
        super.setPadding(r12, r2, r3, r4);
    }

    public void setPopupCallback(AbstractC2456c abstractC2456c) {
        this.f1722m = abstractC2456c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1718i = charSequence;
        m1490h();
    }
}
