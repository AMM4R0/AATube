package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0002c;
import p002A1.C0015h;
import p010D0.C0109g;
import p010D0.RunnableC0107e;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;
import p099j.C2424i;
import p102k.C2468o;
import p102k.MenuC2466m;
import p104l.AbstractC2502A1;
import p104l.AbstractC2593n1;
import p104l.C2541U0;
import p104l.C2562d0;
import p104l.C2582k;
import p104l.C2590m1;
import p104l.C2596o1;
import p104l.C2599p1;
import p104l.C2605r1;
import p104l.C2611t1;
import p104l.C2621x;
import p104l.C2624y;
import p104l.InterfaceC2595o0;
import p104l.InterfaceC2602q1;
import p104l.RunnableC2587l1;
import p104l.ViewOnClickListenerC2608s1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f1917A;

    /* renamed from: B */
    public boolean f1918B;

    /* renamed from: C */
    public boolean f1919C;

    /* renamed from: D */
    public final ArrayList f1920D;

    /* renamed from: E */
    public final ArrayList f1921E;

    /* renamed from: F */
    public final int[] f1922F;

    /* renamed from: G */
    public final C0109g f1923G;

    /* renamed from: H */
    public ArrayList f1924H;

    /* renamed from: I */
    public final C2590m1 f1925I;

    /* renamed from: J */
    public C2611t1 f1926J;

    /* renamed from: K */
    public C2582k f1927K;

    /* renamed from: L */
    public C2596o1 f1928L;

    /* renamed from: M */
    public boolean f1929M;

    /* renamed from: N */
    public OnBackInvokedCallback f1930N;

    /* renamed from: O */
    public OnBackInvokedDispatcher f1931O;

    /* renamed from: P */
    public boolean f1932P;

    /* renamed from: Q */
    public final RunnableC0107e f1933Q;

    /* renamed from: a */
    public ActionMenuView f1934a;

    /* renamed from: b */
    public C2562d0 f1935b;

    /* renamed from: c */
    public C2562d0 f1936c;

    /* renamed from: d */
    public C2621x f1937d;

    /* renamed from: e */
    public C2624y f1938e;

    /* renamed from: f */
    public final Drawable f1939f;

    /* renamed from: g */
    public final CharSequence f1940g;

    /* renamed from: h */
    public C2621x f1941h;

    /* renamed from: i */
    public View f1942i;

    /* renamed from: j */
    public Context f1943j;

    /* renamed from: k */
    public int f1944k;

    /* renamed from: l */
    public int f1945l;

    /* renamed from: m */
    public int f1946m;

    /* renamed from: n */
    public final int f1947n;

    /* renamed from: o */
    public final int f1948o;

    /* renamed from: p */
    public int f1949p;

    /* renamed from: q */
    public int f1950q;

    /* renamed from: r */
    public int f1951r;

    /* renamed from: s */
    public int f1952s;

    /* renamed from: t */
    public C2541U0 f1953t;

    /* renamed from: u */
    public int f1954u;

    /* renamed from: v */
    public int f1955v;

    /* renamed from: w */
    public final int f1956w;

    /* renamed from: x */
    public CharSequence f1957x;

    /* renamed from: y */
    public CharSequence f1958y;

    /* renamed from: z */
    public ColorStateList f1959z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int r2 = 0; r2 < menu.size(); r2++) {
            arrayList.add(menu.getItem(r2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C2424i(getContext());
    }

    /* renamed from: h */
    public static C2599p1 m1536h() {
        C2599p1 c2599p1 = new C2599p1(-2, -2);
        c2599p1.f8451b = 0;
        c2599p1.f8450a = 8388627;
        return c2599p1;
    }

    /* renamed from: i */
    public static C2599p1 m1537i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C2599p1;
        if (z2) {
            C2599p1 c2599p1 = (C2599p1) layoutParams;
            C2599p1 c2599p12 = new C2599p1(c2599p1);
            c2599p12.f8451b = 0;
            c2599p12.f8451b = c2599p1.f8451b;
            return c2599p12;
        }
        if (z2) {
            C2599p1 c2599p13 = new C2599p1((C2599p1) layoutParams);
            c2599p13.f8451b = 0;
            return c2599p13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C2599p1 c2599p14 = new C2599p1(layoutParams);
            c2599p14.f8451b = 0;
            return c2599p14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C2599p1 c2599p15 = new C2599p1(marginLayoutParams);
        c2599p15.f8451b = 0;
        ((ViewGroup.MarginLayoutParams) c2599p15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c2599p15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c2599p15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c2599p15).bottomMargin = marginLayoutParams.bottomMargin;
        return c2599p15;
    }

    /* renamed from: l */
    public static int m1538l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: m */
    public static int m1539m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m1540a(ArrayList arrayList, int r8) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(r8, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = getChildAt(r2);
                C2599p1 c2599p1 = (C2599p1) childAt.getLayoutParams();
                if (c2599p1.f8451b == 0 && m1556u(childAt) && m1547j(c2599p1.f8450a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int r3 = childCount - 1; r3 >= 0; r3--) {
            View childAt2 = getChildAt(r3);
            C2599p1 c2599p12 = (C2599p1) childAt2.getLayoutParams();
            if (c2599p12.f8451b == 0 && m1556u(childAt2) && m1547j(c2599p12.f8450a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void m1541b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C2599p1 m1536h = layoutParams == null ? m1536h() : !checkLayoutParams(layoutParams) ? m1537i(layoutParams) : (C2599p1) layoutParams;
        m1536h.f8451b = 1;
        if (!z2 || this.f1942i == null) {
            addView(view, m1536h);
        } else {
            view.setLayoutParams(m1536h);
            this.f1921E.add(view);
        }
    }

    /* renamed from: c */
    public final void m1542c() {
        if (this.f1941h == null) {
            C2621x c2621x = new C2621x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1941h = c2621x;
            c2621x.setImageDrawable(this.f1939f);
            this.f1941h.setContentDescription(this.f1940g);
            C2599p1 m1536h = m1536h();
            m1536h.f8450a = (this.f1947n & 112) | 8388611;
            m1536h.f8451b = 2;
            this.f1941h.setLayoutParams(m1536h);
            this.f1941h.setOnClickListener(new ViewOnClickListenerC0754j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2599p1);
    }

    /* renamed from: d */
    public final void m1543d() {
        if (this.f1953t == null) {
            C2541U0 c2541u0 = new C2541U0();
            c2541u0.f8299a = 0;
            c2541u0.f8300b = 0;
            c2541u0.f8301c = Integer.MIN_VALUE;
            c2541u0.f8302d = Integer.MIN_VALUE;
            c2541u0.f8303e = 0;
            c2541u0.f8304f = 0;
            c2541u0.f8305g = false;
            c2541u0.f8306h = false;
            this.f1953t = c2541u0;
        }
    }

    /* renamed from: e */
    public final void m1544e() {
        m1545f();
        ActionMenuView actionMenuView = this.f1934a;
        if (actionMenuView.f1804p == null) {
            MenuC2466m menuC2466m = (MenuC2466m) actionMenuView.getMenu();
            if (this.f1928L == null) {
                this.f1928L = new C2596o1(this);
            }
            this.f1934a.setExpandedActionViewsExclusive(true);
            menuC2466m.m4835b(this.f1928L, this.f1943j);
            m1557v();
        }
    }

    /* renamed from: f */
    public final void m1545f() {
        if (this.f1934a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1934a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1944k);
            this.f1934a.setOnMenuItemClickListener(this.f1925I);
            ActionMenuView actionMenuView2 = this.f1934a;
            C2590m1 c2590m1 = new C2590m1(this);
            actionMenuView2.getClass();
            actionMenuView2.f1809u = c2590m1;
            C2599p1 m1536h = m1536h();
            m1536h.f8450a = (this.f1947n & 112) | 8388613;
            this.f1934a.setLayoutParams(m1536h);
            m1541b(this.f1934a, false);
        }
    }

    /* renamed from: g */
    public final void m1546g() {
        if (this.f1937d == null) {
            this.f1937d = new C2621x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C2599p1 m1536h = m1536h();
            m1536h.f8450a = (this.f1947n & 112) | 8388611;
            this.f1937d.setLayoutParams(m1536h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1536h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1537i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C2621x c2621x = this.f1941h;
        if (c2621x != null) {
            return c2621x.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C2621x c2621x = this.f1941h;
        if (c2621x != null) {
            return c2621x.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C2541U0 c2541u0 = this.f1953t;
        if (c2541u0 != null) {
            return c2541u0.f8305g ? c2541u0.f8299a : c2541u0.f8300b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int r02 = this.f1955v;
        return r02 != Integer.MIN_VALUE ? r02 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C2541U0 c2541u0 = this.f1953t;
        if (c2541u0 != null) {
            return c2541u0.f8299a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C2541U0 c2541u0 = this.f1953t;
        if (c2541u0 != null) {
            return c2541u0.f8300b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C2541U0 c2541u0 = this.f1953t;
        if (c2541u0 != null) {
            return c2541u0.f8305g ? c2541u0.f8300b : c2541u0.f8299a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int r02 = this.f1954u;
        return r02 != Integer.MIN_VALUE ? r02 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC2466m menuC2466m;
        ActionMenuView actionMenuView = this.f1934a;
        return (actionMenuView == null || (menuC2466m = actionMenuView.f1804p) == null || !menuC2466m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1955v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1954u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C2624y c2624y = this.f1938e;
        if (c2624y != null) {
            return c2624y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C2624y c2624y = this.f1938e;
        if (c2624y != null) {
            return c2624y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1544e();
        return this.f1934a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1937d;
    }

    public CharSequence getNavigationContentDescription() {
        C2621x c2621x = this.f1937d;
        if (c2621x != null) {
            return c2621x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C2621x c2621x = this.f1937d;
        if (c2621x != null) {
            return c2621x.getDrawable();
        }
        return null;
    }

    public C2582k getOuterActionMenuPresenter() {
        return this.f1927K;
    }

    public Drawable getOverflowIcon() {
        m1544e();
        return this.f1934a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1943j;
    }

    public int getPopupTheme() {
        return this.f1944k;
    }

    public CharSequence getSubtitle() {
        return this.f1958y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1936c;
    }

    public CharSequence getTitle() {
        return this.f1957x;
    }

    public int getTitleMarginBottom() {
        return this.f1952s;
    }

    public int getTitleMarginEnd() {
        return this.f1950q;
    }

    public int getTitleMarginStart() {
        return this.f1949p;
    }

    public int getTitleMarginTop() {
        return this.f1951r;
    }

    public final TextView getTitleTextView() {
        return this.f1935b;
    }

    public InterfaceC2595o0 getWrapper() {
        Drawable drawable;
        if (this.f1926J == null) {
            C2611t1 c2611t1 = new C2611t1();
            c2611t1.f8490n = 0;
            c2611t1.f8477a = this;
            c2611t1.f8484h = getTitle();
            c2611t1.f8485i = getSubtitle();
            c2611t1.f8483g = c2611t1.f8484h != null;
            c2611t1.f8482f = getNavigationIcon();
            C0015h m100A = C0015h.m100A(getContext(), null, AbstractC0780a.f3114a, R.attr.actionBarStyle);
            c2611t1.f8491o = m100A.m121p(15);
            TypedArray typedArray = (TypedArray) m100A.f26c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c2611t1.f8483g = true;
                c2611t1.f8484h = text;
                if ((c2611t1.f8478b & 8) != 0) {
                    Toolbar toolbar = c2611t1.f8477a;
                    toolbar.setTitle(text);
                    if (c2611t1.f8483g) {
                        AbstractC0283P.m780m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c2611t1.f8485i = text2;
                if ((c2611t1.f8478b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable m121p = m100A.m121p(20);
            if (m121p != null) {
                c2611t1.f8481e = m121p;
                c2611t1.m5076c();
            }
            Drawable m121p2 = m100A.m121p(17);
            if (m121p2 != null) {
                c2611t1.f8480d = m121p2;
                c2611t1.m5076c();
            }
            if (c2611t1.f8482f == null && (drawable = c2611t1.f8491o) != null) {
                c2611t1.f8482f = drawable;
                int r4 = c2611t1.f8478b & 4;
                Toolbar toolbar2 = c2611t1.f8477a;
                if (r4 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c2611t1.m5074a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c2611t1.f8479c;
                if (view != null && (c2611t1.f8478b & 16) != 0) {
                    removeView(view);
                }
                c2611t1.f8479c = inflate;
                if (inflate != null && (c2611t1.f8478b & 16) != 0) {
                    addView(inflate);
                }
                c2611t1.m5074a(c2611t1.f8478b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                m1543d();
                this.f1953t.m4988a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1945l = resourceId2;
                C2562d0 c2562d0 = this.f1935b;
                if (c2562d0 != null) {
                    c2562d0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1946m = resourceId3;
                C2562d0 c2562d02 = this.f1936c;
                if (c2562d02 != null) {
                    c2562d02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            m100A.m102C();
            if (R.string.abc_action_bar_up_description != c2611t1.f8490n) {
                c2611t1.f8490n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int r12 = c2611t1.f8490n;
                    c2611t1.f8486j = r12 != 0 ? getContext().getString(r12) : null;
                    c2611t1.m5075b();
                }
            }
            c2611t1.f8486j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC2608s1(c2611t1));
            this.f1926J = c2611t1;
        }
        return this.f1926J;
    }

    /* renamed from: j */
    public final int m1547j(int r5) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(r5, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int m1548k(View view, int r8) {
        C2599p1 c2599p1 = (C2599p1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int r82 = r8 > 0 ? (measuredHeight - r8) / 2 : 0;
        int r2 = c2599p1.f8450a & 112;
        if (r2 != 16 && r2 != 48 && r2 != 80) {
            r2 = this.f1956w & 112;
        }
        if (r2 == 48) {
            return getPaddingTop() - r82;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2599p1).bottomMargin) - r82;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int r4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int r5 = ((ViewGroup.MarginLayoutParams) c2599p1).topMargin;
        if (r4 < r5) {
            r4 = r5;
        } else {
            int r3 = (((height - paddingBottom) - measuredHeight) - r4) - paddingTop;
            int r7 = ((ViewGroup.MarginLayoutParams) c2599p1).bottomMargin;
            if (r3 < r7) {
                r4 = Math.max(0, r4 - (r7 - r3));
            }
        }
        return paddingTop + r4;
    }

    /* renamed from: n */
    public void mo1549n(int r3) {
        getMenuInflater().inflate(r3, getMenu());
    }

    /* renamed from: o */
    public final void m1550o() {
        Iterator it = this.f1924H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1923G.f339c).iterator();
        if (it2.hasNext()) {
            throw AbstractC0002c.m10e(it2);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1924H = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1557v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1933Q);
        m1557v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1919C = false;
        }
        if (!this.f1919C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1919C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1919C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int r17, int r18) {
        int r12;
        int r11;
        int r122;
        int r13;
        int r15;
        int r6;
        int r123;
        boolean m4922a = AbstractC2502A1.m4922a(this);
        int r8 = !m4922a ? 1 : 0;
        int r9 = 0;
        if (m1556u(this.f1937d)) {
            m1555t(this.f1937d, r17, 0, r18, this.f1948o);
            r12 = m1538l(this.f1937d) + this.f1937d.getMeasuredWidth();
            r11 = Math.max(0, m1539m(this.f1937d) + this.f1937d.getMeasuredHeight());
            r122 = View.combineMeasuredStates(0, this.f1937d.getMeasuredState());
        } else {
            r12 = 0;
            r11 = 0;
            r122 = 0;
        }
        if (m1556u(this.f1941h)) {
            m1555t(this.f1941h, r17, 0, r18, this.f1948o);
            r12 = m1538l(this.f1941h) + this.f1941h.getMeasuredWidth();
            r11 = Math.max(r11, m1539m(this.f1941h) + this.f1941h.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f1941h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, r12);
        int max2 = Math.max(0, currentContentInsetStart - r12);
        int[] r132 = this.f1922F;
        r132[m4922a ? 1 : 0] = max2;
        if (m1556u(this.f1934a)) {
            m1555t(this.f1934a, r17, max, r18, this.f1948o);
            r13 = m1538l(this.f1934a) + this.f1934a.getMeasuredWidth();
            r11 = Math.max(r11, m1539m(this.f1934a) + this.f1934a.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f1934a.getMeasuredState());
        } else {
            r13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, r13);
        r132[r8] = Math.max(0, currentContentInsetEnd - r13);
        if (m1556u(this.f1942i)) {
            max3 += m1554s(this.f1942i, r17, max3, r18, 0, r132);
            r11 = Math.max(r11, m1539m(this.f1942i) + this.f1942i.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f1942i.getMeasuredState());
        }
        if (m1556u(this.f1938e)) {
            max3 += m1554s(this.f1938e, r17, max3, r18, 0, r132);
            r11 = Math.max(r11, m1539m(this.f1938e) + this.f1938e.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f1938e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int r14 = 0; r14 < childCount; r14++) {
            View childAt = getChildAt(r14);
            if (((C2599p1) childAt.getLayoutParams()).f8451b == 0 && m1556u(childAt)) {
                max3 += m1554s(childAt, r17, max3, r18, 0, r132);
                r11 = Math.max(r11, m1539m(childAt) + childAt.getMeasuredHeight());
                r122 = View.combineMeasuredStates(r122, childAt.getMeasuredState());
            }
        }
        int r82 = this.f1951r + this.f1952s;
        int r142 = this.f1949p + this.f1950q;
        if (m1556u(this.f1935b)) {
            m1554s(this.f1935b, r17, max3 + r142, r18, r82, r132);
            int m1538l = m1538l(this.f1935b) + this.f1935b.getMeasuredWidth();
            r15 = m1539m(this.f1935b) + this.f1935b.getMeasuredHeight();
            r6 = View.combineMeasuredStates(r122, this.f1935b.getMeasuredState());
            r123 = m1538l;
        } else {
            r15 = 0;
            r6 = r122;
            r123 = 0;
        }
        if (m1556u(this.f1936c)) {
            r123 = Math.max(r123, m1554s(this.f1936c, r17, max3 + r142, r18, r15 + r82, r132));
            r15 += m1539m(this.f1936c) + this.f1936c.getMeasuredHeight();
            r6 = View.combineMeasuredStates(r6, this.f1936c.getMeasuredState());
        }
        int max4 = Math.max(r11, r15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + r123, getSuggestedMinimumWidth()), r17, (-16777216) & r6);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), r18, r6 << 16);
        if (this.f1929M) {
            int childCount2 = getChildCount();
            for (int r3 = 0; r3 < childCount2; r3++) {
                View childAt2 = getChildAt(r3);
                if (!m1556u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, r9);
        }
        r9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, r9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C2605r1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2605r1 c2605r1 = (C2605r1) parcelable;
        super.onRestoreInstanceState(c2605r1.f1263a);
        ActionMenuView actionMenuView = this.f1934a;
        MenuC2466m menuC2466m = actionMenuView != null ? actionMenuView.f1804p : null;
        int r12 = c2605r1.f8462c;
        if (r12 != 0 && this.f1928L != null && menuC2466m != null && (findItem = menuC2466m.findItem(r12)) != null) {
            findItem.expandActionView();
        }
        if (c2605r1.f8463d) {
            RunnableC0107e runnableC0107e = this.f1933Q;
            removeCallbacks(runnableC0107e);
            post(runnableC0107e);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
        super.onRtlPropertiesChanged(r3);
        m1543d();
        C2541U0 c2541u0 = this.f1953t;
        boolean z2 = r3 == 1;
        if (z2 == c2541u0.f8305g) {
            return;
        }
        c2541u0.f8305g = z2;
        if (!c2541u0.f8306h) {
            c2541u0.f8299a = c2541u0.f8303e;
            c2541u0.f8300b = c2541u0.f8304f;
            return;
        }
        if (z2) {
            int r12 = c2541u0.f8302d;
            if (r12 == Integer.MIN_VALUE) {
                r12 = c2541u0.f8303e;
            }
            c2541u0.f8299a = r12;
            int r13 = c2541u0.f8301c;
            if (r13 == Integer.MIN_VALUE) {
                r13 = c2541u0.f8304f;
            }
            c2541u0.f8300b = r13;
            return;
        }
        int r14 = c2541u0.f8301c;
        if (r14 == Integer.MIN_VALUE) {
            r14 = c2541u0.f8303e;
        }
        c2541u0.f8299a = r14;
        int r15 = c2541u0.f8302d;
        if (r15 == Integer.MIN_VALUE) {
            r15 = c2541u0.f8304f;
        }
        c2541u0.f8300b = r15;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2582k c2582k;
        C2468o c2468o;
        C2605r1 c2605r1 = new C2605r1(super.onSaveInstanceState());
        C2596o1 c2596o1 = this.f1928L;
        if (c2596o1 != null && (c2468o = c2596o1.f8436b) != null) {
            c2605r1.f8462c = c2468o.f8095a;
        }
        ActionMenuView actionMenuView = this.f1934a;
        c2605r1.f8463d = (actionMenuView == null || (c2582k = actionMenuView.f1808t) == null || !c2582k.m5038j()) ? false : true;
        return c2605r1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1918B = false;
        }
        if (!this.f1918B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1918B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1918B = false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m1551p(View view) {
        return view.getParent() == this || this.f1921E.contains(view);
    }

    /* renamed from: q */
    public final int m1552q(View view, int r6, int r7, int[] r8) {
        C2599p1 c2599p1 = (C2599p1) view.getLayoutParams();
        int r12 = ((ViewGroup.MarginLayoutParams) c2599p1).leftMargin - r8[0];
        int max = Math.max(0, r12) + r6;
        r8[0] = Math.max(0, -r12);
        int m1548k = m1548k(view, r7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1548k, max + measuredWidth, view.getMeasuredHeight() + m1548k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c2599p1).rightMargin + max;
    }

    /* renamed from: r */
    public final int m1553r(View view, int r7, int r8, int[] r9) {
        C2599p1 c2599p1 = (C2599p1) view.getLayoutParams();
        int r12 = ((ViewGroup.MarginLayoutParams) c2599p1).rightMargin - r9[1];
        int max = r7 - Math.max(0, r12);
        r9[1] = Math.max(0, -r12);
        int m1548k = m1548k(view, r8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1548k, max, view.getMeasuredHeight() + m1548k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c2599p1).leftMargin);
    }

    /* renamed from: s */
    public final int m1554s(View view, int r9, int r10, int r11, int r12, int[] r13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int r14 = marginLayoutParams.leftMargin - r13[0];
        int r3 = marginLayoutParams.rightMargin - r13[1];
        int max = Math.max(0, r3) + Math.max(0, r14);
        r13[0] = Math.max(0, -r14);
        r13[1] = Math.max(0, -r3);
        view.measure(ViewGroup.getChildMeasureSpec(r9, getPaddingRight() + getPaddingLeft() + max + r10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(r11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + r12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1932P != z2) {
            this.f1932P = z2;
            m1557v();
        }
    }

    public void setCollapseContentDescription(int r2) {
        setCollapseContentDescription(r2 != 0 ? getContext().getText(r2) : null);
    }

    public void setCollapseIcon(int r2) {
        setCollapseIcon(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setCollapsible(boolean z2) {
        this.f1929M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int r2) {
        if (r2 < 0) {
            r2 = Integer.MIN_VALUE;
        }
        if (r2 != this.f1955v) {
            this.f1955v = r2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int r2) {
        if (r2 < 0) {
            r2 = Integer.MIN_VALUE;
        }
        if (r2 != this.f1954u) {
            this.f1954u = r2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int r2) {
        setLogo(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setLogoDescription(int r2) {
        setLogoDescription(getContext().getText(r2));
    }

    public void setNavigationContentDescription(int r2) {
        setNavigationContentDescription(r2 != 0 ? getContext().getText(r2) : null);
    }

    public void setNavigationIcon(int r2) {
        setNavigationIcon(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1546g();
        this.f1937d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m1544e();
        this.f1934a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int r3) {
        if (this.f1944k != r3) {
            this.f1944k = r3;
            if (r3 == 0) {
                this.f1943j = getContext();
            } else {
                this.f1943j = new ContextThemeWrapper(getContext(), r3);
            }
        }
    }

    public void setSubtitle(int r2) {
        setSubtitle(getContext().getText(r2));
    }

    public void setSubtitleTextColor(int r12) {
        setSubtitleTextColor(ColorStateList.valueOf(r12));
    }

    public void setTitle(int r2) {
        setTitle(getContext().getText(r2));
    }

    public void setTitleMarginBottom(int r12) {
        this.f1952s = r12;
        requestLayout();
    }

    public void setTitleMarginEnd(int r12) {
        this.f1950q = r12;
        requestLayout();
    }

    public void setTitleMarginStart(int r12) {
        this.f1949p = r12;
        requestLayout();
    }

    public void setTitleMarginTop(int r12) {
        this.f1951r = r12;
        requestLayout();
    }

    public void setTitleTextColor(int r12) {
        setTitleTextColor(ColorStateList.valueOf(r12));
    }

    /* renamed from: t */
    public final void m1555t(View view, int r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && r8 >= 0) {
            if (mode != 0) {
                r8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), r8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(r8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: u */
    public final boolean m1556u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: v */
    public final void m1557v() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int r02 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m5051a = AbstractC2593n1.m5051a(this);
            C2596o1 c2596o1 = this.f1928L;
            if (c2596o1 != null && c2596o1.f8436b != null && m5051a != null) {
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                if (isAttachedToWindow() && this.f1932P) {
                    z2 = true;
                    if (!z2 && this.f1931O == null) {
                        if (this.f1930N == null) {
                            this.f1930N = AbstractC2593n1.m5052b(new RunnableC2587l1(this, r02));
                        }
                        AbstractC2593n1.m5053c(m5051a, this.f1930N);
                        this.f1931O = m5051a;
                        return;
                    }
                    if (!z2 || (onBackInvokedDispatcher = this.f1931O) == null) {
                    }
                    AbstractC2593n1.m5054d(onBackInvokedDispatcher, this.f1930N);
                    this.f1931O = null;
                    return;
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (z2) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int r11) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1956w = 8388627;
        this.f1920D = new ArrayList();
        this.f1921E = new ArrayList();
        this.f1922F = new int[2];
        this.f1923G = new C0109g((Runnable) new RunnableC2587l1(this, 1));
        this.f1924H = new ArrayList();
        this.f1925I = new C2590m1(this);
        this.f1933Q = new RunnableC0107e(16, this);
        Context context2 = getContext();
        int[] r2 = AbstractC0780a.f3138y;
        C0015h m100A = C0015h.m100A(context2, attributeSet, r2, R.attr.toolbarStyle);
        AbstractC0283P.m778k(this, context, r2, attributeSet, (TypedArray) m100A.f26c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) m100A.f26c;
        this.f1945l = typedArray.getResourceId(28, 0);
        this.f1946m = typedArray.getResourceId(19, 0);
        this.f1956w = typedArray.getInteger(0, 8388627);
        this.f1947n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1952s = dimensionPixelOffset;
        this.f1951r = dimensionPixelOffset;
        this.f1950q = dimensionPixelOffset;
        this.f1949p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1949p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1950q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1951r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1952s = dimensionPixelOffset5;
        }
        this.f1948o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1543d();
        C2541U0 c2541u0 = this.f1953t;
        c2541u0.f8306h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c2541u0.f8303e = dimensionPixelSize;
            c2541u0.f8299a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c2541u0.f8304f = dimensionPixelSize2;
            c2541u0.f8300b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c2541u0.m4988a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1954u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1955v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1939f = m100A.m121p(4);
        this.f1940g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1943j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable m121p = m100A.m121p(16);
        if (m121p != null) {
            setNavigationIcon(m121p);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable m121p2 = m100A.m121p(11);
        if (m121p2 != null) {
            setLogo(m121p2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(m100A.m120o(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(m100A.m120o(20));
        }
        if (typedArray.hasValue(14)) {
            mo1549n(typedArray.getResourceId(14, 0));
        }
        m100A.m102C();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C2599p1 c2599p1 = new C2599p1(context, attributeSet);
        c2599p1.f8450a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3115b);
        c2599p1.f8450a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        c2599p1.f8451b = 0;
        return c2599p1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1542c();
        }
        C2621x c2621x = this.f1941h;
        if (c2621x != null) {
            c2621x.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1542c();
            this.f1941h.setImageDrawable(drawable);
        } else {
            C2621x c2621x = this.f1941h;
            if (c2621x != null) {
                c2621x.setImageDrawable(this.f1939f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1938e == null) {
                this.f1938e = new C2624y(getContext(), null, 0);
            }
            if (!m1551p(this.f1938e)) {
                m1541b(this.f1938e, true);
            }
        } else {
            C2624y c2624y = this.f1938e;
            if (c2624y != null && m1551p(c2624y)) {
                removeView(this.f1938e);
                this.f1921E.remove(this.f1938e);
            }
        }
        C2624y c2624y2 = this.f1938e;
        if (c2624y2 != null) {
            c2624y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1938e == null) {
            this.f1938e = new C2624y(getContext(), null, 0);
        }
        C2624y c2624y = this.f1938e;
        if (c2624y != null) {
            c2624y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1546g();
        }
        C2621x c2621x = this.f1937d;
        if (c2621x != null) {
            c2621x.setContentDescription(charSequence);
            AbstractC0580g.m1459z(this.f1937d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1546g();
            if (!m1551p(this.f1937d)) {
                m1541b(this.f1937d, true);
            }
        } else {
            C2621x c2621x = this.f1937d;
            if (c2621x != null && m1551p(c2621x)) {
                removeView(this.f1937d);
                this.f1921E.remove(this.f1937d);
            }
        }
        C2621x c2621x2 = this.f1937d;
        if (c2621x2 != null) {
            c2621x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2562d0 c2562d0 = this.f1936c;
            if (c2562d0 != null && m1551p(c2562d0)) {
                removeView(this.f1936c);
                this.f1921E.remove(this.f1936c);
            }
        } else {
            if (this.f1936c == null) {
                Context context = getContext();
                C2562d0 c2562d02 = new C2562d0(context, null);
                this.f1936c = c2562d02;
                c2562d02.setSingleLine();
                this.f1936c.setEllipsize(TextUtils.TruncateAt.END);
                int r12 = this.f1946m;
                if (r12 != 0) {
                    this.f1936c.setTextAppearance(context, r12);
                }
                ColorStateList colorStateList = this.f1917A;
                if (colorStateList != null) {
                    this.f1936c.setTextColor(colorStateList);
                }
            }
            if (!m1551p(this.f1936c)) {
                m1541b(this.f1936c, true);
            }
        }
        C2562d0 c2562d03 = this.f1936c;
        if (c2562d03 != null) {
            c2562d03.setText(charSequence);
        }
        this.f1958y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1917A = colorStateList;
        C2562d0 c2562d0 = this.f1936c;
        if (c2562d0 != null) {
            c2562d0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2562d0 c2562d0 = this.f1935b;
            if (c2562d0 != null && m1551p(c2562d0)) {
                removeView(this.f1935b);
                this.f1921E.remove(this.f1935b);
            }
        } else {
            if (this.f1935b == null) {
                Context context = getContext();
                C2562d0 c2562d02 = new C2562d0(context, null);
                this.f1935b = c2562d02;
                c2562d02.setSingleLine();
                this.f1935b.setEllipsize(TextUtils.TruncateAt.END);
                int r12 = this.f1945l;
                if (r12 != 0) {
                    this.f1935b.setTextAppearance(context, r12);
                }
                ColorStateList colorStateList = this.f1959z;
                if (colorStateList != null) {
                    this.f1935b.setTextColor(colorStateList);
                }
            }
            if (!m1551p(this.f1935b)) {
                m1541b(this.f1935b, true);
            }
        }
        C2562d0 c2562d03 = this.f1935b;
        if (c2562d03 != null) {
            c2562d03.setText(charSequence);
        }
        this.f1957x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1959z = colorStateList;
        C2562d0 c2562d0 = this.f1935b;
        if (c2562d0 != null) {
            c2562d0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC2602q1 interfaceC2602q1) {
    }
}
