package p038N0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p001A0.AbstractC0005b;
import p028K.AbstractC0283P;

/* renamed from: N0.a */
/* loaded from: classes.dex */
public final class C0391a extends AbstractC0005b {

    /* renamed from: d */
    public int f1052d;

    /* renamed from: e */
    public int f1053e = -1;

    /* renamed from: f */
    public final /* synthetic */ SwipeDismissBehavior f1054f;

    public C0391a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1054f = swipeDismissBehavior;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: A */
    public final void mo77A(View view, int r3) {
        this.f1053e = r3;
        this.f1052d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f1054f;
            swipeDismissBehavior.f2744c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2744c = false;
        }
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: B */
    public final void mo78B(int r12) {
        this.f1054f.getClass();
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: C */
    public final void mo79C(View view, int r6, int r7) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f1054f;
        float f = width * swipeDismissBehavior.f2746e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2747f;
        float abs = Math.abs(r6 - this.f1052d);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // p001A0.AbstractC0005b
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo80D(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f1053e = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f1054f
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = p028K.AbstractC0283P.f842a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f2745d
            r7 = 2
            if (r6 != r7) goto L21
            goto L55
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L2a:
            if (r1 <= 0) goto L69
            goto L55
        L2d:
            if (r6 != r2) goto L69
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L69
            goto L55
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f1052d
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r3.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L69
        L55:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = r9.getLeft()
            int r0 = r8.f1052d
            if (r10 >= r0) goto L62
            goto L64
        L62:
            int r0 = r0 + r11
            goto L6c
        L64:
            int r10 = r8.f1052d
            int r0 = r10 - r11
            goto L6c
        L69:
            int r0 = r8.f1052d
            r2 = r4
        L6c:
            T.e r10 = r3.f2742a
            int r11 = r9.getTop()
            boolean r10 = r10.m1346o(r0, r11)
            if (r10 == 0) goto L82
            D0.d r10 = new D0.d
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = p028K.AbstractC0283P.f842a
            r9.postOnAnimation(r10)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p038N0.C0391a.mo80D(android.view.View, float, float):void");
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: R */
    public final boolean mo87R(View view, int r4) {
        int r02 = this.f1053e;
        return (r02 == -1 || r02 == r4) && this.f1054f.mo2056r(view);
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: j */
    public final int mo89j(View view, int r5) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean z2 = view.getLayoutDirection() == 1;
        int r2 = this.f1054f.f2745d;
        if (r2 == 0) {
            if (z2) {
                width = this.f1052d - view.getWidth();
                width2 = this.f1052d;
            } else {
                width = this.f1052d;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (r2 != 1) {
            width = this.f1052d - view.getWidth();
            width2 = view.getWidth() + this.f1052d;
        } else if (z2) {
            width = this.f1052d;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f1052d - view.getWidth();
            width2 = this.f1052d;
        }
        return Math.min(Math.max(width, r5), width2);
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: k */
    public final int mo90k(View view, int r2) {
        return view.getTop();
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: w */
    public final int mo91w(View view) {
        return view.getWidth();
    }
}
