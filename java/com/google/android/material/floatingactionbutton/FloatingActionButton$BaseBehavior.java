package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p029K0.AbstractC0345a;
import p138x.AbstractC2879a;
import p138x.C2882d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC2879a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: a */
    public final boolean mo2125a(View view) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: c */
    public final void mo2068c(C2882d c2882d) {
        if (c2882d.f9497h == 0) {
            c2882d.f9497h = 80;
        }
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: d */
    public final boolean mo2053d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public final boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r3) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f955g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
