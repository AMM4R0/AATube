package p104l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.carwizard.p075li.youtube.R;
import java.lang.reflect.InvocationTargetException;
import p010D0.RunnableC0107e;
import p046Q.ViewOnTouchListenerC0433g;

/* renamed from: l.x0 */
/* loaded from: classes.dex */
public class C2622x0 extends ListView {

    /* renamed from: a */
    public final Rect f8521a;

    /* renamed from: b */
    public int f8522b;

    /* renamed from: c */
    public int f8523c;

    /* renamed from: d */
    public int f8524d;

    /* renamed from: e */
    public int f8525e;

    /* renamed from: f */
    public int f8526f;

    /* renamed from: g */
    public C2616v0 f8527g;

    /* renamed from: h */
    public boolean f8528h;

    /* renamed from: i */
    public final boolean f8529i;

    /* renamed from: j */
    public boolean f8530j;

    /* renamed from: k */
    public ViewOnTouchListenerC0433g f8531k;

    /* renamed from: l */
    public RunnableC0107e f8532l;

    public C2622x0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f8521a = new Rect();
        this.f8522b = 0;
        this.f8523c = 0;
        this.f8524d = 0;
        this.f8525e = 0;
        this.f8529i = z2;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m5091a(int r12, int r13) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int r02 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int r7 = 0;
        View view = null;
        for (int r6 = 0; r6 < count; r6++) {
            int itemViewType = adapter.getItemViewType(r6);
            if (itemViewType != r7) {
                view = null;
                r7 = itemViewType;
            }
            view = adapter.getView(r6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int r9 = layoutParams.height;
            view.measure(r12, r9 > 0 ? View.MeasureSpec.makeMeasureSpec(r9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (r6 > 0) {
                r02 += dividerHeight;
            }
            r02 += view.getMeasuredHeight();
            if (r02 >= r13) {
                return r13;
            }
        }
        return r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0147 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5092b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.C2622x0.m5092b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f8521a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f8532l != null) {
            return;
        }
        super.drawableStateChanged();
        C2616v0 c2616v0 = this.f8527g;
        if (c2616v0 != null) {
            c2616v0.f8500b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f8530j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f8529i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f8529i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f8529i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f8529i && this.f8528h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f8532l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int r2 = Build.VERSION.SDK_INT;
        if (r2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8532l == null) {
            RunnableC0107e runnableC0107e = new RunnableC0107e(15, this);
            this.f8532l = runnableC0107e;
            post(runnableC0107e);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (r2 < 30 || !AbstractC2610t0.f8476d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC2610t0.f8473a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC2610t0.f8474b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC2610t0.f8475c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f8530j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8526f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0107e runnableC0107e = this.f8532l;
        if (runnableC0107e != null) {
            C2622x0 c2622x0 = (C2622x0) runnableC0107e.f335b;
            c2622x0.f8532l = null;
            c2622x0.removeCallbacks(runnableC0107e);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f8528h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C2616v0 c2616v0 = null;
        if (drawable != null) {
            C2616v0 c2616v02 = new C2616v0();
            Drawable drawable2 = c2616v02.f8499a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c2616v02.f8499a = drawable;
            drawable.setCallback(c2616v02);
            c2616v02.f8500b = true;
            c2616v0 = c2616v02;
        }
        this.f8527g = c2616v0;
        super.setSelector(c2616v0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8522b = rect.left;
        this.f8523c = rect.top;
        this.f8524d = rect.right;
        this.f8525e = rect.bottom;
    }
}
