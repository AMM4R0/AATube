package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p138x.AbstractC2879a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC2879a {
    public ExpandableBehavior() {
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: b */
    public abstract void mo2052b(View view);

    @Override // p138x.AbstractC2879a
    /* renamed from: d */
    public final boolean mo2053d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public final boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r6) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (!view.isLaidOut()) {
            ArrayList m1576j = coordinatorLayout.m1576j(view);
            int size = m1576j.size();
            for (int r12 = 0; r12 < size; r12++) {
                mo2052b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
