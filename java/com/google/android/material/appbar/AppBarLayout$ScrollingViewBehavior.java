package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p035M0.AbstractC0373a;
import p036M1.AbstractC0387m;
import p138x.AbstractC2879a;
import p138x.C2882d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0373a {

    /* renamed from: b */
    public final int f2727b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: s */
    public static void m2051s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
        }
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: d */
    public boolean mo2053d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC2879a abstractC2879a = ((C2882d) view2.getLayoutParams()).f9490a;
        if (abstractC2879a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC2879a).getClass();
            int r4 = this.f2727b;
            int m1111i = bottom - (r4 == 0 ? 0 : AbstractC0387m.m1111i((int) (0.0f * r4), 0, r4));
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            view.offsetTopAndBottom(m1111i);
        }
        return false;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: h */
    public final boolean mo2043h(CoordinatorLayout coordinatorLayout, View view, int r3, int r4, int r5) {
        int r32 = view.getLayoutParams().height;
        if (r32 != -1 && r32 != -2) {
            return false;
        }
        m2051s(coordinatorLayout.m1576j(view));
        return false;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: l */
    public final void mo2054l(CoordinatorLayout coordinatorLayout, View view) {
        m2051s(coordinatorLayout.m1576j(view));
    }

    @Override // p035M0.AbstractC0373a
    /* renamed from: r */
    public final void mo1048r(CoordinatorLayout coordinatorLayout, View view, int r4) {
        m2051s(coordinatorLayout.m1576j(view));
        coordinatorLayout.m1581q(view, r4);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f969u);
        this.f2727b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: b */
    public final void mo2052b(View view) {
    }
}
