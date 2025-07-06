package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p031L.C0351e;
import p038N0.C0391a;
import p055T.C0516e;
import p138x.AbstractC2879a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC2879a {

    /* renamed from: a */
    public C0516e f2742a;

    /* renamed from: b */
    public boolean f2743b;

    /* renamed from: c */
    public boolean f2744c;

    /* renamed from: d */
    public int f2745d = 2;

    /* renamed from: e */
    public float f2746e = 0.0f;

    /* renamed from: f */
    public float f2747f = 0.5f;

    /* renamed from: g */
    public final C0391a f2748g = new C0391a(this);

    @Override // p138x.AbstractC2879a
    /* renamed from: f */
    public boolean mo2042f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2743b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.m1579o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2743b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2743b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2742a == null) {
            this.f2742a = new C0516e(coordinatorLayout.getContext(), coordinatorLayout, this.f2748g);
        }
        return !this.f2744c && this.f2742a.m1347p(motionEvent);
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public final boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r5) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0283P.m776i(view, 1048576);
            AbstractC0283P.m774g(view, 0);
            if (mo2056r(view)) {
                AbstractC0283P.m777j(view, C0351e.f989j, new C0055g(10, this));
            }
        }
        return false;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: q */
    public final boolean mo2050q(View view, MotionEvent motionEvent) {
        if (this.f2742a == null) {
            return false;
        }
        if (this.f2744c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2742a.m1341j(motionEvent);
        return true;
    }

    /* renamed from: r */
    public boolean mo2056r(View view) {
        return true;
    }
}
