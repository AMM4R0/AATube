package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p081e1.C0879e;
import p102k.C2468o;
import p102k.InterfaceC2449B;
import p102k.InterfaceC2465l;
import p102k.MenuC2466m;
import p104l.AbstractC2502A1;
import p104l.AbstractC2506C0;
import p104l.C2504B0;
import p104l.C2567f;
import p104l.C2576i;
import p104l.C2579j;
import p104l.C2582k;
import p104l.C2588m;
import p104l.C2590m1;
import p104l.InterfaceC2585l;
import p104l.InterfaceC2591n;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC2506C0 implements InterfaceC2465l, InterfaceC2449B {

    /* renamed from: p */
    public MenuC2466m f1804p;

    /* renamed from: q */
    public Context f1805q;

    /* renamed from: r */
    public int f1806r;

    /* renamed from: s */
    public boolean f1807s;

    /* renamed from: t */
    public C2582k f1808t;

    /* renamed from: u */
    public C2590m1 f1809u;

    /* renamed from: v */
    public boolean f1810v;

    /* renamed from: w */
    public int f1811w;

    /* renamed from: x */
    public final int f1812x;

    /* renamed from: y */
    public final int f1813y;

    /* renamed from: z */
    public InterfaceC2591n f1814z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1812x = (int) (56.0f * f);
        this.f1813y = (int) (f * 4.0f);
        this.f1805q = context;
        this.f1806r = 0;
    }

    /* renamed from: l */
    public static C2588m m1508l() {
        C2588m c2588m = new C2588m(-2, -2);
        c2588m.f8424a = false;
        ((LinearLayout.LayoutParams) c2588m).gravity = 16;
        return c2588m;
    }

    /* renamed from: m */
    public static C2588m m1509m(ViewGroup.LayoutParams layoutParams) {
        C2588m c2588m;
        if (layoutParams == null) {
            return m1508l();
        }
        if (layoutParams instanceof C2588m) {
            C2588m c2588m2 = (C2588m) layoutParams;
            c2588m = new C2588m(c2588m2);
            c2588m.f8424a = c2588m2.f8424a;
        } else {
            c2588m = new C2588m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2588m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2588m).gravity = 16;
        }
        return c2588m;
    }

    @Override // p102k.InterfaceC2465l
    /* renamed from: a */
    public final boolean mo1491a(C2468o c2468o) {
        return this.f1804p.m4842q(c2468o, null, 0);
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2588m;
    }

    @Override // p102k.InterfaceC2449B
    /* renamed from: d */
    public final void mo1492d(MenuC2466m menuC2466m) {
        this.f1804p = menuC2466m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1508l();
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1509m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1804p == null) {
            Context context = getContext();
            MenuC2466m menuC2466m = new MenuC2466m(context);
            this.f1804p = menuC2466m;
            menuC2466m.f8069e = new C2579j(this);
            C2582k c2582k = new C2582k(context);
            this.f1808t = c2582k;
            c2582k.f8394l = true;
            c2582k.f8395m = true;
            c2582k.f8387e = new C0879e();
            this.f1804p.m4835b(c2582k, this.f1805q);
            C2582k c2582k2 = this.f1808t;
            c2582k2.f8390h = this;
            this.f1804p = c2582k2.f8385c;
        }
        return this.f1804p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C2582k c2582k = this.f1808t;
        C2576i c2576i = c2582k.f8391i;
        if (c2576i != null) {
            return c2576i.getDrawable();
        }
        if (c2582k.f8393k) {
            return c2582k.f8392j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1806r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p104l.AbstractC2506C0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2504B0 generateDefaultLayoutParams() {
        return m1508l();
    }

    @Override // p104l.AbstractC2506C0
    /* renamed from: i */
    public final C2504B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C2588m(getContext(), attributeSet);
    }

    @Override // p104l.AbstractC2506C0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C2504B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1509m(layoutParams);
    }

    /* renamed from: n */
    public final boolean m1513n(int r5) {
        boolean z2 = false;
        if (r5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(r5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(r5);
        if (r5 < getChildCount() && (childAt instanceof InterfaceC2585l)) {
            z2 = ((InterfaceC2585l) childAt).mo1486a();
        }
        return (r5 <= 0 || !(childAt2 instanceof InterfaceC2585l)) ? z2 : z2 | ((InterfaceC2585l) childAt2).mo1487b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2582k c2582k = this.f1808t;
        if (c2582k != null) {
            c2582k.mo4804i();
            if (this.f1808t.m5038j()) {
                this.f1808t.m5037f();
                this.f1808t.m5039l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2582k c2582k = this.f1808t;
        if (c2582k != null) {
            c2582k.m5037f();
            C2567f c2567f = c2582k.f8402t;
            if (c2567f == null || !c2567f.m4859b()) {
                return;
            }
            c2567f.f8141i.dismiss();
        }
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r19, int r20, int r21, int r22) {
        int width;
        int r15;
        if (!this.f1810v) {
            super.onLayout(z2, r19, r20, r21, r22);
            return;
        }
        int childCount = getChildCount();
        int r2 = (r22 - r20) / 2;
        int dividerWidth = getDividerWidth();
        int r4 = r21 - r19;
        int paddingRight = (r4 - getPaddingRight()) - getPaddingLeft();
        boolean m4922a = AbstractC2502A1.m4922a(this);
        int r9 = 0;
        int r10 = 0;
        for (int r8 = 0; r8 < childCount; r8++) {
            View childAt = getChildAt(r8);
            if (childAt.getVisibility() != 8) {
                C2588m c2588m = (C2588m) childAt.getLayoutParams();
                if (c2588m.f8424a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1513n(r8)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m4922a) {
                        r15 = getPaddingLeft() + ((LinearLayout.LayoutParams) c2588m).leftMargin;
                        width = r15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2588m).rightMargin;
                        r15 = width - measuredWidth;
                    }
                    int r7 = r2 - (measuredHeight / 2);
                    childAt.layout(r15, r7, width, measuredHeight + r7);
                    paddingRight -= measuredWidth;
                    r9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2588m).leftMargin) + ((LinearLayout.LayoutParams) c2588m).rightMargin;
                    m1513n(r8);
                    r10++;
                }
            }
        }
        if (childCount == 1 && r9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int r42 = (r4 / 2) - (measuredWidth2 / 2);
            int r23 = r2 - (measuredHeight2 / 2);
            childAt2.layout(r42, r23, measuredWidth2 + r42, measuredHeight2 + r23);
            return;
        }
        int r102 = r10 - (r9 ^ 1);
        int max = Math.max(0, r102 > 0 ? paddingRight / r102 : 0);
        if (m4922a) {
            int width2 = getWidth() - getPaddingRight();
            for (int r72 = 0; r72 < childCount; r72++) {
                View childAt3 = getChildAt(r72);
                C2588m c2588m2 = (C2588m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2588m2.f8424a) {
                    int r5 = width2 - ((LinearLayout.LayoutParams) c2588m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int r103 = r2 - (measuredHeight3 / 2);
                    childAt3.layout(r5 - measuredWidth3, r103, r5, measuredHeight3 + r103);
                    width2 = r5 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2588m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int r73 = 0; r73 < childCount; r73++) {
            View childAt4 = getChildAt(r73);
            C2588m c2588m3 = (C2588m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2588m3.f8424a) {
                int r52 = paddingLeft + ((LinearLayout.LayoutParams) c2588m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int r104 = r2 - (measuredHeight4 / 2);
                childAt4.layout(r52, r104, r52 + measuredWidth4, measuredHeight4 + r104);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c2588m3).rightMargin + max + r52;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p104l.AbstractC2506C0, android.view.View
    public final void onMeasure(int r32, int r33) {
        int r5;
        boolean z2;
        int r3;
        boolean z3;
        int r6;
        int r2;
        int r62;
        ?? r4;
        int r23;
        int r21;
        int r9;
        MenuC2466m menuC2466m;
        boolean z4 = this.f1810v;
        boolean z5 = View.MeasureSpec.getMode(r32) == 1073741824;
        this.f1810v = z5;
        if (z4 != z5) {
            this.f1811w = 0;
        }
        int size = View.MeasureSpec.getSize(r32);
        if (this.f1810v && (menuC2466m = this.f1804p) != null && size != this.f1811w) {
            this.f1811w = size;
            menuC2466m.m4841p(true);
        }
        int childCount = getChildCount();
        if (!this.f1810v || childCount <= 0) {
            for (int r63 = 0; r63 < childCount; r63++) {
                C2588m c2588m = (C2588m) getChildAt(r63).getLayoutParams();
                ((LinearLayout.LayoutParams) c2588m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2588m).leftMargin = 0;
            }
            super.onMeasure(r32, r33);
            return;
        }
        int mode = View.MeasureSpec.getMode(r33);
        int size2 = View.MeasureSpec.getSize(r32);
        int size3 = View.MeasureSpec.getSize(r33);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r33, paddingBottom, -2);
        int r22 = size2 - paddingRight;
        int r8 = this.f1812x;
        int r10 = r22 / r8;
        int r11 = r22 % r8;
        if (r10 == 0) {
            setMeasuredDimension(r22, 0);
            return;
        }
        int r112 = (r11 / r10) + r8;
        int childCount2 = getChildCount();
        int r42 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        boolean z6 = false;
        int r18 = 0;
        long j2 = 0;
        while (true) {
            r5 = this.f1813y;
            if (r14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(r14);
            int r19 = size3;
            int r20 = r22;
            if (childAt.getVisibility() == 8) {
                r23 = mode;
                r21 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int r122 = r12 + 1;
                if (z7) {
                    childAt.setPadding(r5, 0, r5, 0);
                }
                C2588m c2588m2 = (C2588m) childAt.getLayoutParams();
                c2588m2.f8429f = false;
                c2588m2.f8426c = 0;
                c2588m2.f8425b = 0;
                c2588m2.f8427d = false;
                ((LinearLayout.LayoutParams) c2588m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c2588m2).rightMargin = 0;
                c2588m2.f8428e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int r64 = c2588m2.f8424a ? 1 : r10;
                C2588m c2588m3 = (C2588m) childAt.getLayoutParams();
                r23 = mode;
                r21 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (r64 <= 0 || (z8 && r64 < 2)) {
                    r9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(r64 * r112, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    r9 = measuredWidth / r112;
                    if (measuredWidth % r112 != 0) {
                        r9++;
                    }
                    if (z8 && r9 < 2) {
                        r9 = 2;
                    }
                }
                c2588m3.f8427d = !c2588m3.f8424a && z8;
                c2588m3.f8425b = r9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(r9 * r112, 1073741824), makeMeasureSpec);
                r13 = Math.max(r13, r9);
                if (c2588m2.f8427d) {
                    r18++;
                }
                if (c2588m2.f8424a) {
                    z6 = true;
                }
                r10 -= r9;
                r42 = Math.max(r42, childAt.getMeasuredHeight());
                if (r9 == 1) {
                    j2 |= 1 << r14;
                }
                r12 = r122;
            }
            r14++;
            size3 = r19;
            r22 = r20;
            paddingBottom = r21;
            mode = r23;
        }
        int r232 = mode;
        int r202 = r22;
        int r192 = size3;
        boolean z9 = z6 && r12 == 2;
        boolean z10 = false;
        while (r18 > 0 && r10 > 0) {
            int r34 = Integer.MAX_VALUE;
            int r65 = 0;
            int r92 = 0;
            long j3 = 0;
            while (r92 < childCount2) {
                C2588m c2588m4 = (C2588m) getChildAt(r92).getLayoutParams();
                boolean z11 = z10;
                if (c2588m4.f8427d) {
                    int r24 = c2588m4.f8425b;
                    if (r24 < r34) {
                        j3 = 1 << r92;
                        r34 = r24;
                        r65 = 1;
                    } else if (r24 == r34) {
                        j3 |= 1 << r92;
                        r65++;
                    }
                }
                r92++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (r65 > r10) {
                break;
            }
            int r35 = r34 + 1;
            int r25 = 0;
            while (r25 < childCount2) {
                View childAt2 = getChildAt(r25);
                C2588m c2588m5 = (C2588m) childAt2.getLayoutParams();
                int r27 = r42;
                int r142 = childMeasureSpec;
                int r28 = childCount2;
                long j4 = 1 << r25;
                if ((j3 & j4) != 0) {
                    if (z9 && c2588m5.f8428e) {
                        r4 = 1;
                        r4 = 1;
                        if (r10 == 1) {
                            childAt2.setPadding(r5 + r112, 0, r5, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c2588m5.f8425b += r4;
                    c2588m5.f8429f = r4;
                    r10--;
                } else if (c2588m5.f8425b == r35) {
                    j2 |= j4;
                }
                r25++;
                childMeasureSpec = r142;
                r42 = r27;
                childCount2 = r28;
            }
            z10 = true;
        }
        z2 = z10;
        int r272 = r42;
        int r143 = childMeasureSpec;
        int r282 = childCount2;
        boolean z12 = !z6 && r12 == 1;
        if (r10 <= 0 || j2 == 0 || (r10 >= r12 - 1 && !z12 && r13 <= 1)) {
            r3 = r282;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C2588m) getChildAt(0).getLayoutParams()).f8428e) {
                    bitCount -= 0.5f;
                }
                int r82 = r282 - 1;
                if ((j2 & (1 << r82)) != 0 && !((C2588m) getChildAt(r82).getLayoutParams()).f8428e) {
                    bitCount -= 0.5f;
                }
            }
            int r66 = bitCount > 0.0f ? (int) ((r10 * r112) / bitCount) : 0;
            boolean z13 = z2;
            r3 = r282;
            for (int r26 = 0; r26 < r3; r26++) {
                if ((j2 & (1 << r26)) != 0) {
                    View childAt3 = getChildAt(r26);
                    C2588m c2588m6 = (C2588m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2588m6.f8426c = r66;
                        c2588m6.f8429f = true;
                        if (r26 == 0 && !c2588m6.f8428e) {
                            ((LinearLayout.LayoutParams) c2588m6).leftMargin = (-r66) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c2588m6.f8424a) {
                            c2588m6.f8426c = r66;
                            c2588m6.f8429f = true;
                            ((LinearLayout.LayoutParams) c2588m6).rightMargin = (-r66) / 2;
                            z13 = true;
                        } else {
                            if (r26 != 0) {
                                ((LinearLayout.LayoutParams) c2588m6).leftMargin = r66 / 2;
                            }
                            if (r26 != r3 - 1) {
                                ((LinearLayout.LayoutParams) c2588m6).rightMargin = r66 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int r15 = 0;
            while (r15 < r3) {
                View childAt4 = getChildAt(r15);
                C2588m c2588m7 = (C2588m) childAt4.getLayoutParams();
                if (c2588m7.f8429f) {
                    r62 = r143;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2588m7.f8425b * r112) + c2588m7.f8426c, 1073741824), r62);
                } else {
                    r62 = r143;
                }
                r15++;
                r143 = r62;
            }
        }
        if (r232 != 1073741824) {
            r2 = r202;
            r6 = r272;
        } else {
            r6 = r192;
            r2 = r202;
        }
        setMeasuredDimension(r2, r6);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1808t.f8399q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC2591n interfaceC2591n) {
        this.f1814z = interfaceC2591n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C2582k c2582k = this.f1808t;
        C2576i c2576i = c2582k.f8391i;
        if (c2576i != null) {
            c2576i.setImageDrawable(drawable);
        } else {
            c2582k.f8393k = true;
            c2582k.f8392j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1807s = z2;
    }

    public void setPopupTheme(int r3) {
        if (this.f1806r != r3) {
            this.f1806r = r3;
            if (r3 == 0) {
                this.f1805q = getContext();
            } else {
                this.f1805q = new ContextThemeWrapper(getContext(), r3);
            }
        }
    }

    public void setPresenter(C2582k c2582k) {
        this.f1808t = c2582k;
        c2582k.f8390h = this;
        this.f1804p = c2582k.f8385c;
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2588m(getContext(), attributeSet);
    }
}
