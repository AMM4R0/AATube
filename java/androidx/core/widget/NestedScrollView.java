package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import p006C.C0055g;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0307h;
import p028K.C0317m;
import p028K.C0323p;
import p028K.InterfaceC0321o;
import p046Q.AbstractC0431e;
import p046Q.AbstractC0435i;
import p046Q.C0434h;
import p046Q.C0437k;
import p046Q.InterfaceC0436j;
import p103k0.AbstractC2480a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0321o {

    /* renamed from: B */
    public static final float f2027B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C */
    public static final C0434h f2028C = new C0434h(0);

    /* renamed from: D */
    public static final int[] f2029D = {R.attr.fillViewport};

    /* renamed from: A */
    public final C0307h f2030A;

    /* renamed from: a */
    public final float f2031a;

    /* renamed from: b */
    public long f2032b;

    /* renamed from: c */
    public final Rect f2033c;

    /* renamed from: d */
    public final OverScroller f2034d;

    /* renamed from: e */
    public final EdgeEffect f2035e;

    /* renamed from: f */
    public final EdgeEffect f2036f;

    /* renamed from: g */
    public int f2037g;

    /* renamed from: h */
    public boolean f2038h;

    /* renamed from: i */
    public boolean f2039i;

    /* renamed from: j */
    public View f2040j;

    /* renamed from: k */
    public boolean f2041k;

    /* renamed from: l */
    public VelocityTracker f2042l;

    /* renamed from: m */
    public boolean f2043m;

    /* renamed from: n */
    public boolean f2044n;

    /* renamed from: o */
    public final int f2045o;

    /* renamed from: p */
    public final int f2046p;

    /* renamed from: q */
    public final int f2047q;

    /* renamed from: r */
    public int f2048r;

    /* renamed from: s */
    public final int[] f2049s;

    /* renamed from: t */
    public final int[] f2050t;

    /* renamed from: u */
    public int f2051u;

    /* renamed from: v */
    public int f2052v;

    /* renamed from: w */
    public C0437k f2053w;

    /* renamed from: x */
    public final C0323p f2054x;

    /* renamed from: y */
    public final C0317m f2055y;

    /* renamed from: z */
    public float f2056z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.carwizard.p075li.youtube.R.attr.nestedScrollViewStyle);
        this.f2033c = new Rect();
        this.f2038h = true;
        this.f2039i = false;
        this.f2040j = null;
        this.f2041k = false;
        this.f2044n = true;
        this.f2048r = -1;
        this.f2049s = new int[2];
        this.f2050t = new int[2];
        this.f2030A = new C0307h(getContext(), new C0055g(12, this));
        int r3 = Build.VERSION.SDK_INT;
        this.f2035e = r3 >= 31 ? AbstractC0431e.m1168a(context, attributeSet) : new EdgeEffect(context);
        this.f2036f = r3 >= 31 ? AbstractC0431e.m1168a(context, attributeSet) : new EdgeEffect(context);
        this.f2031a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2034d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2045o = viewConfiguration.getScaledTouchSlop();
        this.f2046p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2047q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2029D, com.carwizard.p075li.youtube.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2054x = new C0323p();
        this.f2055y = new C0317m(this);
        setNestedScrollingEnabled(true);
        AbstractC0283P.m779l(this, f2028C);
    }

    /* renamed from: l */
    public static boolean m1590l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1590l((View) parent, nestedScrollView);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: a */
    public final void mo933a(View view, View view2, int r3, int r4) {
        C0323p c0323p = this.f2054x;
        if (r4 == 1) {
            c0323p.f914b = r3;
        } else {
            c0323p.f913a = r3;
        }
        this.f2055y.m901g(2, r4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: b */
    public final void mo934b(View view, int r4) {
        C0323p c0323p = this.f2054x;
        if (r4 == 1) {
            c0323p.f914b = 0;
        } else {
            c0323p.f913a = 0;
        }
        m1606w(r4);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: c */
    public final void mo935c(View view, int r8, int r9, int[] r10, int r11) {
        this.f2055y.m897c(r8, r9, r10, null, r11);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // p028K.InterfaceC0321o
    /* renamed from: d */
    public final void mo941d(View view, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        m1597n(r5, r6, r7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1593i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.f2055y.m895a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2055y.m896b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return this.f2055y.m897c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return this.f2055y.m898d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int r7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2035e;
        int r3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AbstractC0435i.m1180a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                r7 = getPaddingLeft();
            } else {
                r7 = 0;
            }
            if (AbstractC0435i.m1180a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(r7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2036f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0435i.m1180a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            r3 = getPaddingLeft();
        }
        if (AbstractC0435i.m1180a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(r3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: e */
    public final void mo936e(View view, int r2, int r3, int r4, int r5, int r6) {
        m1597n(r5, r6, null);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: f */
    public final boolean mo937f(View view, View view2, int r3, int r4) {
        return (r3 & 2) != 0;
    }

    /* renamed from: g */
    public final boolean m1591g(int r9) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, r9);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1596m(findNextFocus, maxScrollAmount, getHeight())) {
            if (r9 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (r9 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (r9 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1602s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f2033c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m1602s(m1592h(rect), 0, 1, true);
            findNextFocus.requestFocus(r9);
        }
        if (findFocus != null && findFocus.isFocused() && !m1596m(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0323p c0323p = this.f2054x;
        return c0323p.f914b | c0323p.f913a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2056z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2056z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2056z;
    }

    /* renamed from: h */
    public final int m1592h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int r3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int r4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? r3 - verticalFadingEdgeLength : r3;
        int r7 = rect.bottom;
        if (r7 > r4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - r4, (childAt.getBottom() + layoutParams.bottomMargin) - r3);
        }
        if (rect.top >= scrollY || r7 >= r4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (r4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2055y.m900f(0);
    }

    /* renamed from: i */
    public final boolean m1593i(KeyEvent keyEvent) {
        this.f2033c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m1595k(33) : m1591g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m1595k(130) : m1591g(130);
                }
                if (keyCode == 62) {
                    m1600q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m1595k(33);
                }
                if (keyCode == 93) {
                    return m1595k(130);
                }
                if (keyCode == 122) {
                    m1600q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                m1600q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2055y.f910d;
    }

    /* renamed from: j */
    public final void m1594j(int r13) {
        if (getChildCount() > 0) {
            this.f2034d.fling(getScrollX(), getScrollY(), 0, r13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2055y.m901g(2, 1);
            this.f2052v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: k */
    public final boolean m1595k(int r6) {
        int childCount;
        boolean z2 = r6 == 130;
        int height = getHeight();
        Rect rect = this.f2033c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1601r(r6, rect.top, rect.bottom);
    }

    /* renamed from: m */
    public final boolean m1596m(View view, int r4, int r5) {
        Rect rect = this.f2033c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + r4 >= getScrollY() && rect.top - r4 <= getScrollY() + r5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int r4, int r5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(r4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int r3, int r4, int r5, int r6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(r3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m1597n(int r11, int r12, int[] r13) {
        int scrollY = getScrollY();
        scrollBy(0, r11);
        int scrollY2 = getScrollY() - scrollY;
        if (r13 != null) {
            r13[1] = r13[1] + scrollY2;
        }
        this.f2055y.m898d(0, scrollY2, 0, r11 - scrollY2, null, r12, r13);
    }

    /* renamed from: o */
    public final void m1598o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2048r) {
            int r02 = actionIndex == 0 ? 1 : 0;
            this.f2037g = (int) motionEvent.getY(r02);
            this.f2048r = motionEvent.getPointerId(r02);
            VelocityTracker velocityTracker = this.f2042l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2039i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f2041k) {
            return true;
        }
        int r02 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (r02 != 0) {
            if (r02 != 1) {
                if (r02 == 2) {
                    int r03 = this.f2048r;
                    if (r03 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(r03);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + r03 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f2037g) > this.f2045o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2041k = true;
                                this.f2037g = y2;
                                if (this.f2042l == null) {
                                    this.f2042l = VelocityTracker.obtain();
                                }
                                this.f2042l.addMovement(motionEvent);
                                this.f2051u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (r02 != 3) {
                    if (r02 == 6) {
                        m1598o(motionEvent);
                    }
                }
            }
            this.f2041k = false;
            this.f2048r = -1;
            VelocityTracker velocityTracker = this.f2042l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2042l = null;
            }
            if (this.f2034d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m1606w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f2037g = y3;
                    this.f2048r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2042l;
                    if (velocityTracker2 == null) {
                        this.f2042l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2042l.addMovement(motionEvent);
                    this.f2034d.computeScrollOffset();
                    if (!m1605v(motionEvent) && this.f2034d.isFinished()) {
                        z2 = false;
                    }
                    this.f2041k = z2;
                    this.f2055y.m901g(2, 0);
                }
            }
            if (!m1605v(motionEvent) && this.f2034d.isFinished()) {
                z2 = false;
            }
            this.f2041k = z2;
            VelocityTracker velocityTracker3 = this.f2042l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2042l = null;
            }
        }
        return this.f2041k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r3, int r4, int r5, int r6) {
        int r32;
        super.onLayout(z2, r3, r4, r5, r6);
        int r2 = 0;
        this.f2038h = false;
        View view = this.f2040j;
        if (view != null && m1590l(view, this)) {
            View view2 = this.f2040j;
            Rect rect = this.f2033c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1592h = m1592h(rect);
            if (m1592h != 0) {
                scrollBy(0, m1592h);
            }
        }
        this.f2040j = null;
        if (!this.f2039i) {
            if (this.f2053w != null) {
                scrollTo(getScrollX(), this.f2053w.f1128a);
                this.f2053w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                r32 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                r32 = 0;
            }
            int paddingTop = ((r6 - r4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < r32 && scrollY >= 0) {
                r2 = paddingTop + scrollY > r32 ? r32 - paddingTop : scrollY;
            }
            if (r2 != scrollY) {
                scrollTo(getScrollX(), r2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2039i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        if (this.f2043m && View.MeasureSpec.getMode(r6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(r5, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1594j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f2055y.m896b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int r8, int r9, int[] r10) {
        this.f2055y.m897c(r8, r9, r10, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int r2, int r3, int r4, int r5) {
        m1597n(r5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int r4) {
        mo933a(view, view2, r4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int r12, int r2, boolean z2, boolean z3) {
        super.scrollTo(r12, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, Rect rect) {
        if (r4 == 2) {
            r4 = 130;
        } else if (r4 == 1) {
            r4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, r4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, r4);
        if (findNextFocus != null && m1596m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(r4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0437k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0437k c0437k = (C0437k) parcelable;
        super.onRestoreInstanceState(c0437k.getSuperState());
        this.f2053w = c0437k;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0437k c0437k = new C0437k(super.onSaveInstanceState());
        c0437k.f1128a = getScrollY();
        return c0437k;
    }

    @Override // android.view.View
    public final void onScrollChanged(int r12, int r2, int r3, int r4) {
        super.onScrollChanged(r12, r2, r3, r4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r2, int r3, int r4) {
        super.onSizeChanged(r12, r2, r3, r4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1596m(findFocus, 0, r4)) {
            return;
        }
        Rect rect = this.f2033c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int m1592h = m1592h(rect);
        if (m1592h != 0) {
            if (this.f2044n) {
                m1604u(0, m1592h, false);
            } else {
                scrollBy(0, m1592h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int r4) {
        return mo937f(view, view2, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo934b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f2042l == null) {
            this.f2042l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2051u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.f2051u);
        C0317m c0317m = this.f2055y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f2036f;
            EdgeEffect edgeEffect2 = this.f2035e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2042l;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f2047q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2048r);
                if (Math.abs(yVelocity) >= this.f2046p) {
                    if (AbstractC2480a.m4891m(edgeEffect2) != 0.0f) {
                        if (m1603t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1594j(-yVelocity);
                        }
                    } else if (AbstractC2480a.m4891m(edgeEffect) != 0.0f) {
                        int r12 = -yVelocity;
                        if (m1603t(edgeEffect, r12)) {
                            edgeEffect.onAbsorb(r12);
                        } else {
                            m1594j(r12);
                        }
                    } else {
                        int r13 = -yVelocity;
                        float f2 = r13;
                        if (!c0317m.m896b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m1594j(r13);
                        }
                    }
                } else if (this.f2034d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2048r = -1;
                this.f2041k = false;
                VelocityTracker velocityTracker2 = this.f2042l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2042l = null;
                }
                m1606w(0);
                this.f2035e.onRelease();
                this.f2036f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2048r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2048r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int r8 = this.f2037g - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = r8 / getHeight();
                    if (AbstractC2480a.m4891m(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC2480a.m4869J(edgeEffect2, -height, x2);
                        if (AbstractC2480a.m4891m(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC2480a.m4891m(edgeEffect) != 0.0f) {
                        float m4869J = AbstractC2480a.m4869J(edgeEffect, height, 1.0f - x2);
                        if (AbstractC2480a.m4891m(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = m4869J;
                    }
                    int round = Math.round(f * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int r82 = r8 - round;
                    if (!this.f2041k && Math.abs(r82) > this.f2045o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2041k = true;
                        r82 = r82 > 0 ? r82 - this.f2045o : r82 + this.f2045o;
                    }
                    if (this.f2041k) {
                        int m1602s = m1602s(r82, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f2037g = y2 - m1602s;
                        this.f2051u += m1602s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2041k && getChildCount() > 0 && this.f2034d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2048r = -1;
                this.f2041k = false;
                VelocityTracker velocityTracker3 = this.f2042l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2042l = null;
                }
                m1606w(0);
                this.f2035e.onRelease();
                this.f2036f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2037g = (int) motionEvent.getY(actionIndex);
                this.f2048r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1598o(motionEvent);
                this.f2037g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2048r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2041k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2034d.isFinished()) {
                this.f2034d.abortAnimation();
                m1606w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2037g = y3;
            this.f2048r = pointerId;
            c0317m.m901g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2042l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m1599p(int r10, int r11, int r12, int r13) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int r122 = r12 + r10;
        if (r11 <= 0 && r11 >= 0) {
            z2 = false;
        } else {
            r11 = 0;
            z2 = true;
        }
        if (r122 <= r13) {
            if (r122 >= 0) {
                r13 = r122;
                z3 = false;
                if (z3 && !this.f2055y.m900f(1)) {
                    this.f2034d.springBack(r11, r13, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(r11, r13);
                return z2 || z3;
            }
            r13 = 0;
        }
        z3 = true;
        if (z3) {
            this.f2034d.springBack(r11, r13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(r11, r13);
        if (z2) {
            return true;
        }
    }

    /* renamed from: q */
    public final void m1600q(int r6) {
        boolean z2 = r6 == 130;
        int height = getHeight();
        Rect rect = this.f2033c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int r02 = rect.top;
        int r3 = height + r02;
        rect.bottom = r3;
        m1601r(r6, r02, r3);
    }

    /* renamed from: r */
    public final boolean m1601r(int r18, int r19, int r20) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int r4 = height + scrollY;
        boolean z3 = r18 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int r12 = 0; r12 < size; r12++) {
            View view2 = focusables.get(r12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (r19 < bottom && top < r20) {
                boolean z5 = r19 < top && bottom < r20;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (r19 < scrollY || r20 > r4) {
            m1602s(z3 ? r19 - scrollY : r20 - r4, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(r18);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2038h) {
            this.f2040j = view2;
        } else {
            Rect rect = this.f2033c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1592h = m1592h(rect);
            if (m1592h != 0) {
                scrollBy(0, m1592h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m1592h = m1592h(rect);
        boolean z3 = m1592h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, m1592h);
            } else {
                m1604u(0, m1592h, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f2042l) != null) {
            velocityTracker.recycle();
            this.f2042l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2038h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final int m1602s(int r21, int r22, int r23, boolean z2) {
        int r15;
        int r16;
        boolean z3;
        VelocityTracker velocityTracker;
        C0317m c0317m = this.f2055y;
        if (r23 == 1) {
            c0317m.m901g(2, r23);
        }
        boolean m897c = this.f2055y.m897c(0, r21, this.f2050t, this.f2049s, r23);
        int[] r13 = this.f2050t;
        int[] r14 = this.f2049s;
        if (m897c) {
            r15 = r21 - r13[1];
            r16 = r14[1];
        } else {
            r15 = r21;
            r16 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1599p(r15, 0, scrollY, scrollRange) && !c0317m.m900f(r23);
        int scrollY2 = getScrollY() - scrollY;
        r13[1] = 0;
        this.f2055y.m898d(0, scrollY2, 0, r15 - scrollY2, this.f2049s, r23, r13);
        int r162 = r16 + r14[1];
        int r152 = r15 - r13[1];
        int r9 = scrollY + r152;
        EdgeEffect edgeEffect = this.f2036f;
        EdgeEffect edgeEffect2 = this.f2035e;
        if (r9 < 0) {
            if (z4) {
                AbstractC2480a.m4869J(edgeEffect2, (-r152) / getHeight(), r22 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (r9 > scrollRange && z4) {
            AbstractC2480a.m4869J(edgeEffect, r152 / getHeight(), 1.0f - (r22 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && r23 == 0 && (velocityTracker = this.f2042l) != null) {
            velocityTracker.clear();
        }
        if (r23 == 1) {
            m1606w(r23);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return r162;
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || r8 < 0) {
                r8 = 0;
            } else if (width + r8 > width2) {
                r8 = width2 - width;
            }
            if (height >= height2 || r9 < 0) {
                r9 = 0;
            } else if (height + r9 > height2) {
                r9 = height2 - height;
            }
            if (r8 == getScrollX() && r9 == getScrollY()) {
                return;
            }
            super.scrollTo(r8, r9);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f2043m) {
            this.f2043m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0317m c0317m = this.f2055y;
        if (c0317m.f910d) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            AbstractC0272E.m722z(c0317m.f909c);
        }
        c0317m.f910d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f2044n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return this.f2055y.m901g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1606w(0);
    }

    /* renamed from: t */
    public final boolean m1603t(EdgeEffect edgeEffect, int r12) {
        if (r12 > 0) {
            return true;
        }
        float m4891m = AbstractC2480a.m4891m(edgeEffect) * getHeight();
        float abs = Math.abs(-r12) * 0.35f;
        float f = this.f2031a * 0.015f;
        double log = Math.log(abs / f);
        double d2 = f2027B;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f))) < m4891m;
    }

    /* renamed from: u */
    public final void m1604u(int r10, int r11, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2032b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2034d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(r11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f2055y.m901g(2, 1);
            } else {
                m1606w(1);
            }
            this.f2052v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2034d.isFinished()) {
                this.f2034d.abortAnimation();
                m1606w(1);
            }
            scrollBy(r10, r11);
        }
        this.f2032b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m1605v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2035e;
        if (AbstractC2480a.m4891m(edgeEffect) != 0.0f) {
            AbstractC2480a.m4869J(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f2036f;
        if (AbstractC2480a.m4891m(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC2480a.m4869J(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m1606w(int r2) {
        this.f2055y.m902h(r2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r3) {
        if (getChildCount() <= 0) {
            super.addView(view, r3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, r3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC0436j interfaceC0436j) {
    }
}
