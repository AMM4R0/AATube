package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;
import p028K.C0340x0;
import p060W.AbstractC0536a;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public ArrayList f2161a;

    /* renamed from: b */
    public ArrayList f2162b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f2163c;

    /* renamed from: d */
    public boolean f2164d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f2164d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0536a.f1461b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    /* renamed from: a */
    public final void m1701a(View view) {
        ArrayList arrayList = this.f2162b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2161a == null) {
            this.f2161a = new ArrayList();
        }
        this.f2161a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r4, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0666p ? (AbstractComponentCallbacksC0666p) tag : null) != null) {
            super.addView(view, r4, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int r4, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0666p ? (AbstractComponentCallbacksC0666p) tag : null) != null) {
            return super.addViewInLayout(view, r4, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0340x0 c0340x0;
        C0340x0 m975g = C0340x0.m975g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2163c;
        if (onApplyWindowInsetsListener != null) {
            c0340x0 = C0340x0.m975g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            WindowInsets m980f = m975g.m980f();
            if (m980f != null) {
                WindowInsets m695b = AbstractC0270C.m695b(this, m980f);
                if (!m695b.equals(m980f)) {
                    m975g = C0340x0.m975g(this, m695b);
                }
            }
            c0340x0 = m975g;
        }
        if (!c0340x0.f944a.mo961m()) {
            int childCount = getChildCount();
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = getChildAt(r2);
                WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                WindowInsets m980f2 = c0340x0.m980f();
                if (m980f2 != null) {
                    WindowInsets m694a = AbstractC0270C.m694a(childAt, m980f2);
                    if (!m694a.equals(m980f2)) {
                        C0340x0.m975g(childAt, m694a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f2164d && this.f2161a != null) {
            for (int r02 = 0; r02 < this.f2161a.size(); r02++) {
                super.drawChild(canvas, (View) this.f2161a.get(r02), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.f2164d || (arrayList = this.f2161a) == null || arrayList.size() <= 0 || !this.f2161a.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f2162b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f2161a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2164d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m1701a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        if (z2) {
            m1701a(view);
        }
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m1701a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r2) {
        m1701a(getChildAt(r2));
        super.removeViewAt(r2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m1701a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r3, int r4) {
        for (int r02 = r3; r02 < r3 + r4; r02++) {
            m1701a(getChildAt(r02));
        }
        super.removeViews(r3, r4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r3, int r4) {
        for (int r02 = r3; r02 < r3 + r4; r02++) {
            m1701a(getChildAt(r02));
        }
        super.removeViewsInLayout(r3, r4);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f2164d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2163c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2162b == null) {
                this.f2162b = new ArrayList();
            }
            this.f2162b.add(view);
        }
        super.startViewTransition(view);
    }
}
