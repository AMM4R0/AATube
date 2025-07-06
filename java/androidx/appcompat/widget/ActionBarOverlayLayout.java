package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p006C.C0051c;
import p028K.AbstractC0270C;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.AbstractC0324p0;
import p028K.C0290X;
import p028K.C0316l0;
import p028K.C0320n0;
import p028K.C0322o0;
import p028K.C0323p;
import p028K.C0336v0;
import p028K.C0340x0;
import p028K.InterfaceC0319n;
import p028K.InterfaceC0321o;
import p079e.C0791I;
import p099j.C2426k;
import p102k.InterfaceC2478y;
import p102k.MenuC2466m;
import p104l.C2564e;
import p104l.C2582k;
import p104l.C2596o1;
import p104l.C2611t1;
import p104l.InterfaceC2561d;
import p104l.InterfaceC2592n0;
import p104l.InterfaceC2595o0;
import p104l.RunnableC2558c;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2592n0, InterfaceC0319n, InterfaceC0321o {

    /* renamed from: B */
    public static final int[] f1776B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A */
    public final C0323p f1777A;

    /* renamed from: a */
    public int f1778a;

    /* renamed from: b */
    public int f1779b;

    /* renamed from: c */
    public ContentFrameLayout f1780c;

    /* renamed from: d */
    public ActionBarContainer f1781d;

    /* renamed from: e */
    public InterfaceC2595o0 f1782e;

    /* renamed from: f */
    public Drawable f1783f;

    /* renamed from: g */
    public boolean f1784g;

    /* renamed from: h */
    public boolean f1785h;

    /* renamed from: i */
    public boolean f1786i;

    /* renamed from: j */
    public boolean f1787j;

    /* renamed from: k */
    public boolean f1788k;

    /* renamed from: l */
    public int f1789l;

    /* renamed from: m */
    public int f1790m;

    /* renamed from: n */
    public final Rect f1791n;

    /* renamed from: o */
    public final Rect f1792o;

    /* renamed from: p */
    public final Rect f1793p;

    /* renamed from: q */
    public C0340x0 f1794q;

    /* renamed from: r */
    public C0340x0 f1795r;

    /* renamed from: s */
    public C0340x0 f1796s;

    /* renamed from: t */
    public C0340x0 f1797t;

    /* renamed from: u */
    public InterfaceC2561d f1798u;

    /* renamed from: v */
    public OverScroller f1799v;

    /* renamed from: w */
    public ViewPropertyAnimator f1800w;

    /* renamed from: x */
    public final C0290X f1801x;

    /* renamed from: y */
    public final RunnableC2558c f1802y;

    /* renamed from: z */
    public final RunnableC2558c f1803z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1779b = 0;
        this.f1791n = new Rect();
        this.f1792o = new Rect();
        this.f1793p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0340x0 c0340x0 = C0340x0.f943b;
        this.f1794q = c0340x0;
        this.f1795r = c0340x0;
        this.f1796s = c0340x0;
        this.f1797t = c0340x0;
        this.f1801x = new C0290X(5, this);
        this.f1802y = new RunnableC2558c(this, 0);
        this.f1803z = new RunnableC2558c(this, 1);
        m1504i(context);
        this.f1777A = new C0323p();
    }

    /* renamed from: g */
    public static boolean m1502g(View view, Rect rect, boolean z2) {
        boolean z3;
        C2564e c2564e = (C2564e) view.getLayoutParams();
        int r02 = ((ViewGroup.MarginLayoutParams) c2564e).leftMargin;
        int r12 = rect.left;
        if (r02 != r12) {
            ((ViewGroup.MarginLayoutParams) c2564e).leftMargin = r12;
            z3 = true;
        } else {
            z3 = false;
        }
        int r13 = ((ViewGroup.MarginLayoutParams) c2564e).topMargin;
        int r3 = rect.top;
        if (r13 != r3) {
            ((ViewGroup.MarginLayoutParams) c2564e).topMargin = r3;
            z3 = true;
        }
        int r14 = ((ViewGroup.MarginLayoutParams) c2564e).rightMargin;
        int r32 = rect.right;
        if (r14 != r32) {
            ((ViewGroup.MarginLayoutParams) c2564e).rightMargin = r32;
            z3 = true;
        }
        if (z2) {
            int r6 = ((ViewGroup.MarginLayoutParams) c2564e).bottomMargin;
            int r5 = rect.bottom;
            if (r6 != r5) {
                ((ViewGroup.MarginLayoutParams) c2564e).bottomMargin = r5;
                return true;
            }
        }
        return z3;
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: a */
    public final void mo933a(View view, View view2, int r3, int r4) {
        if (r4 == 0) {
            onNestedScrollAccepted(view, view2, r3);
        }
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: b */
    public final void mo934b(View view, int r2) {
        if (r2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: c */
    public final void mo935c(View view, int r2, int r3, int[] r4, int r5) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2564e;
    }

    @Override // p028K.InterfaceC0321o
    /* renamed from: d */
    public final void mo941d(View view, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        mo936e(view, r2, r3, r4, r5, r6);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int r02;
        super.draw(canvas);
        if (this.f1783f == null || this.f1784g) {
            return;
        }
        if (this.f1781d.getVisibility() == 0) {
            r02 = (int) (this.f1781d.getTranslationY() + this.f1781d.getBottom() + 0.5f);
        } else {
            r02 = 0;
        }
        this.f1783f.setBounds(0, r02, getWidth(), this.f1783f.getIntrinsicHeight() + r02);
        this.f1783f.draw(canvas);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: e */
    public final void mo936e(View view, int r2, int r3, int r4, int r5, int r6) {
        if (r6 == 0) {
            onNestedScroll(view, r2, r3, r4, r5);
        }
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: f */
    public final boolean mo937f(View view, View view2, int r3, int r4) {
        return r4 == 0 && onStartNestedScroll(view, view2, r3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2564e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2564e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1781d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0323p c0323p = this.f1777A;
        return c0323p.f914b | c0323p.f913a;
    }

    public CharSequence getTitle() {
        m1506k();
        return ((C2611t1) this.f1782e).f8477a.getTitle();
    }

    /* renamed from: h */
    public final void m1503h() {
        removeCallbacks(this.f1802y);
        removeCallbacks(this.f1803z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1800w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m1504i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1776B);
        this.f1778a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1783f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1784g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1799v = new OverScroller(context);
    }

    /* renamed from: j */
    public final void m1505j(int r4) {
        m1506k();
        if (r4 == 2) {
            ((C2611t1) this.f1782e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (r4 == 5) {
            ((C2611t1) this.f1782e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (r4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: k */
    public final void m1506k() {
        InterfaceC2595o0 wrapper;
        if (this.f1780c == null) {
            this.f1780c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1781d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC2595o0) {
                wrapper = (InterfaceC2595o0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1782e = wrapper;
        }
    }

    /* renamed from: l */
    public final void m1507l(MenuC2466m menuC2466m, InterfaceC2478y interfaceC2478y) {
        m1506k();
        C2611t1 c2611t1 = (C2611t1) this.f1782e;
        C2582k c2582k = c2611t1.f8489m;
        Toolbar toolbar = c2611t1.f8477a;
        if (c2582k == null) {
            c2611t1.f8489m = new C2582k(toolbar.getContext());
        }
        C2582k c2582k2 = c2611t1.f8489m;
        c2582k2.f8387e = interfaceC2478y;
        if (menuC2466m == null && toolbar.f1934a == null) {
            return;
        }
        toolbar.m1545f();
        MenuC2466m menuC2466m2 = toolbar.f1934a.f1804p;
        if (menuC2466m2 == menuC2466m) {
            return;
        }
        if (menuC2466m2 != null) {
            menuC2466m2.m4843r(toolbar.f1927K);
            menuC2466m2.m4843r(toolbar.f1928L);
        }
        if (toolbar.f1928L == null) {
            toolbar.f1928L = new C2596o1(toolbar);
        }
        c2582k2.f8399q = true;
        if (menuC2466m != null) {
            menuC2466m.m4835b(c2582k2, toolbar.f1943j);
            menuC2466m.m4835b(toolbar.f1928L, toolbar.f1943j);
        } else {
            c2582k2.mo4831g(toolbar.f1943j, null);
            toolbar.f1928L.mo4831g(toolbar.f1943j, null);
            c2582k2.mo4804i();
            toolbar.f1928L.mo4804i();
        }
        toolbar.f1934a.setPopupTheme(toolbar.f1944k);
        toolbar.f1934a.setPresenter(c2582k2);
        toolbar.f1927K = c2582k2;
        toolbar.m1557v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1506k();
        C0340x0 m975g = C0340x0.m975g(this, windowInsets);
        boolean m1502g = m1502g(this.f1781d, new Rect(m975g.m977b(), m975g.m979d(), m975g.m978c(), m975g.m976a()), false);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        Rect rect = this.f1791n;
        AbstractC0272E.m698b(this, m975g, rect);
        int r2 = rect.left;
        int r3 = rect.top;
        int r4 = rect.right;
        int r5 = rect.bottom;
        C0336v0 c0336v0 = m975g.f944a;
        C0340x0 mo952l = c0336v0.mo952l(r2, r3, r4, r5);
        this.f1794q = mo952l;
        boolean z2 = true;
        if (!this.f1795r.equals(mo952l)) {
            this.f1795r = this.f1794q;
            m1502g = true;
        }
        Rect rect2 = this.f1792o;
        if (rect2.equals(rect)) {
            z2 = m1502g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0336v0.mo964a().f944a.mo959c().f944a.mo958b().m980f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1504i(getContext());
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1503h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r6, int r7, int r8, int r9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int r82 = 0; r82 < childCount; r82++) {
            View childAt = getChildAt(r82);
            if (childAt.getVisibility() != 8) {
                C2564e c2564e = (C2564e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int r3 = ((ViewGroup.MarginLayoutParams) c2564e).leftMargin + paddingLeft;
                int r02 = ((ViewGroup.MarginLayoutParams) c2564e).topMargin + paddingTop;
                childAt.layout(r3, r02, measuredWidth + r3, measuredHeight + r02);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
        int measuredHeight;
        m1506k();
        measureChildWithMargins(this.f1781d, r13, 0, r14, 0);
        C2564e c2564e = (C2564e) this.f1781d.getLayoutParams();
        int max = Math.max(0, this.f1781d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2564e).leftMargin + ((ViewGroup.MarginLayoutParams) c2564e).rightMargin);
        int max2 = Math.max(0, this.f1781d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2564e).topMargin + ((ViewGroup.MarginLayoutParams) c2564e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1781d.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1778a;
            if (this.f1786i && this.f1781d.getTabContainer() != null) {
                measuredHeight += this.f1778a;
            }
        } else {
            measuredHeight = this.f1781d.getVisibility() != 8 ? this.f1781d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1791n;
        Rect rect2 = this.f1793p;
        rect2.set(rect);
        C0340x0 c0340x0 = this.f1794q;
        this.f1796s = c0340x0;
        if (this.f1785h || z2) {
            C0051c m197b = C0051c.m197b(c0340x0.m977b(), this.f1796s.m979d() + measuredHeight, this.f1796s.m978c(), this.f1796s.m976a());
            C0340x0 c0340x02 = this.f1796s;
            int r6 = Build.VERSION.SDK_INT;
            AbstractC0324p0 c0322o0 = r6 >= 30 ? new C0322o0(c0340x02) : r6 >= 29 ? new C0320n0(c0340x02) : new C0316l0(c0340x02);
            c0322o0.mo894g(m197b);
            this.f1796s = c0322o0.mo892b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f1796s = c0340x0.f944a.mo952l(0, measuredHeight, 0, 0);
        }
        m1502g(this.f1780c, rect2, true);
        if (!this.f1797t.equals(this.f1796s)) {
            C0340x0 c0340x03 = this.f1796s;
            this.f1797t = c0340x03;
            ContentFrameLayout contentFrameLayout = this.f1780c;
            WindowInsets m980f = c0340x03.m980f();
            if (m980f != null) {
                WindowInsets m694a = AbstractC0270C.m694a(contentFrameLayout, m980f);
                if (!m694a.equals(m980f)) {
                    C0340x0.m975g(contentFrameLayout, m694a);
                }
            }
        }
        measureChildWithMargins(this.f1780c, r13, 0, r14, 0);
        C2564e c2564e2 = (C2564e) this.f1780c.getLayoutParams();
        int max3 = Math.max(max, this.f1780c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2564e2).leftMargin + ((ViewGroup.MarginLayoutParams) c2564e2).rightMargin);
        int max4 = Math.max(max2, this.f1780c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2564e2).topMargin + ((ViewGroup.MarginLayoutParams) c2564e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1780c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), r13, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), r14, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.f1787j || !z2) {
            return false;
        }
        this.f1799v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1799v.getFinalY() > this.f1781d.getHeight()) {
            m1503h();
            this.f1803z.run();
        } else {
            m1503h();
            this.f1802y.run();
        }
        this.f1788k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int r2, int r3, int[] r4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int r2, int r3, int r4, int r5) {
        int r12 = this.f1789l + r3;
        this.f1789l = r12;
        setActionBarHideOffset(r12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int r3) {
        C0791I r12;
        C2426k c2426k;
        this.f1777A.f913a = r3;
        this.f1789l = getActionBarHideOffset();
        m1503h();
        InterfaceC2561d interfaceC2561d = this.f1798u;
        if (interfaceC2561d == null || (c2426k = (r12 = (C0791I) interfaceC2561d).f3198x) == null) {
            return;
        }
        c2426k.m4782a();
        r12.f3198x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int r3) {
        if ((r3 & 2) == 0 || this.f1781d.getVisibility() != 0) {
            return false;
        }
        return this.f1787j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1787j || this.f1788k) {
            return;
        }
        if (this.f1789l <= this.f1781d.getHeight()) {
            m1503h();
            postDelayed(this.f1802y, 600L);
        } else {
            m1503h();
            postDelayed(this.f1803z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
        super.onWindowSystemUiVisibilityChanged(r7);
        m1506k();
        int r12 = this.f1790m ^ r7;
        this.f1790m = r7;
        boolean z2 = (r7 & 4) == 0;
        boolean z3 = (r7 & 256) != 0;
        InterfaceC2561d interfaceC2561d = this.f1798u;
        if (interfaceC2561d != null) {
            C0791I r4 = (C0791I) interfaceC2561d;
            r4.f3194t = !z3;
            if (z2 || !z3) {
                if (r4.f3195u) {
                    r4.f3195u = false;
                    r4.m2191K(true);
                }
            } else if (!r4.f3195u) {
                r4.f3195u = true;
                r4.m2191K(true);
            }
        }
        if ((r12 & 256) == 0 || this.f1798u == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r2) {
        super.onWindowVisibilityChanged(r2);
        this.f1779b = r2;
        InterfaceC2561d interfaceC2561d = this.f1798u;
        if (interfaceC2561d != null) {
            ((C0791I) interfaceC2561d).f3193s = r2;
        }
    }

    public void setActionBarHideOffset(int r3) {
        m1503h();
        this.f1781d.setTranslationY(-Math.max(0, Math.min(r3, this.f1781d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2561d interfaceC2561d) {
        this.f1798u = interfaceC2561d;
        if (getWindowToken() != null) {
            ((C0791I) this.f1798u).f3193s = this.f1779b;
            int r2 = this.f1790m;
            if (r2 != 0) {
                onWindowSystemUiVisibilityChanged(r2);
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                AbstractC0270C.m696c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1786i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1787j) {
            this.f1787j = z2;
            if (z2) {
                return;
            }
            m1503h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int r3) {
        m1506k();
        C2611t1 c2611t1 = (C2611t1) this.f1782e;
        c2611t1.f8480d = r3 != 0 ? AbstractC0580g.m1449n(c2611t1.f8477a.getContext(), r3) : null;
        c2611t1.m5076c();
    }

    public void setLogo(int r3) {
        m1506k();
        C2611t1 c2611t1 = (C2611t1) this.f1782e;
        c2611t1.f8481e = r3 != 0 ? AbstractC0580g.m1449n(c2611t1.f8477a.getContext(), r3) : null;
        c2611t1.m5076c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1785h = z2;
        this.f1784g = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int r12) {
    }

    @Override // p104l.InterfaceC2592n0
    public void setWindowCallback(Window.Callback callback) {
        m1506k();
        ((C2611t1) this.f1782e).f8487k = callback;
    }

    @Override // p104l.InterfaceC2592n0
    public void setWindowTitle(CharSequence charSequence) {
        m1506k();
        C2611t1 c2611t1 = (C2611t1) this.f1782e;
        if (c2611t1.f8483g) {
            return;
        }
        c2611t1.f8484h = charSequence;
        if ((c2611t1.f8478b & 8) != 0) {
            Toolbar toolbar = c2611t1.f8477a;
            toolbar.setTitle(charSequence);
            if (c2611t1.f8483g) {
                AbstractC0283P.m780m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2564e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1506k();
        C2611t1 c2611t1 = (C2611t1) this.f1782e;
        c2611t1.f8480d = drawable;
        c2611t1.m5076c();
    }
}
