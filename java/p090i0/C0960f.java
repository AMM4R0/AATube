package p090i0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p001A0.AbstractC0005b;
import p124s0.C2738i;

/* renamed from: i0.f */
/* loaded from: classes.dex */
public final class C0960f extends AbstractC0967m {

    /* renamed from: A */
    public static final String[] f4006A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B */
    public static final C0956b f4007B = new C0956b(PointF.class, "topLeft", 0);

    /* renamed from: C */
    public static final C0956b f4008C = new C0956b(PointF.class, "bottomRight", 1);

    /* renamed from: D */
    public static final C0956b f4009D = new C0956b(PointF.class, "bottomRight", 2);

    /* renamed from: E */
    public static final C0956b f4010E = new C0956b(PointF.class, "topLeft", 3);

    /* renamed from: F */
    public static final C0956b f4011F = new C0956b(PointF.class, "position", 4);

    /* renamed from: I */
    public static void m2558I(C0975u c0975u) {
        View view = c0975u.f4064b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c0975u.f4063a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", c0975u.f4064b.getParent());
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: d */
    public final void mo2549d(C0975u c0975u) {
        m2558I(c0975u);
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: g */
    public final void mo2551g(C0975u c0975u) {
        m2558I(c0975u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p090i0.AbstractC0967m
    /* renamed from: k */
    public final Animator mo2559k(ViewGroup viewGroup, C0975u c0975u, C0975u c0975u2) {
        int r7;
        ObjectAnimator m2566a;
        if (c0975u == null || c0975u2 == null) {
            return null;
        }
        HashMap hashMap = c0975u.f4063a;
        HashMap hashMap2 = c0975u2.f4063a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int r10 = rect.left;
        int r11 = rect2.left;
        int r12 = rect.top;
        int r13 = rect2.top;
        int r14 = rect.right;
        int r15 = rect2.right;
        int r9 = rect.bottom;
        int r8 = rect2.bottom;
        int r6 = r14 - r10;
        int r4 = r9 - r12;
        int r3 = r15 - r11;
        int r5 = r8 - r13;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((r6 == 0 || r4 == 0) && (r3 == 0 || r5 == 0)) {
            r7 = 0;
        } else {
            r7 = (r10 == r11 && r12 == r13) ? 0 : 1;
            if (r14 != r15 || r9 != r8) {
                r7++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            r7++;
        }
        if (r7 <= 0) {
            return null;
        }
        View view = c0975u2.f4064b;
        AbstractC0977w.m2586a(view, r10, r12, r14, r9);
        if (r7 == 2) {
            if (r6 == r3 && r4 == r5) {
                this.f4052v.getClass();
                m2566a = AbstractC0963i.m2566a(view, f4011F, C2738i.m5335j(r10, r12, r11, r13));
            } else {
                C0959e c0959e = new C0959e(view);
                this.f4052v.getClass();
                ObjectAnimator m2566a2 = AbstractC0963i.m2566a(c0959e, f4007B, C2738i.m5335j(r10, r12, r11, r13));
                this.f4052v.getClass();
                ObjectAnimator m2566a3 = AbstractC0963i.m2566a(c0959e, f4008C, C2738i.m5335j(r14, r9, r15, r8));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(m2566a2, m2566a3);
                animatorSet.addListener(new C0957c(c0959e));
                m2566a = animatorSet;
            }
        } else if (r10 == r11 && r12 == r13) {
            this.f4052v.getClass();
            m2566a = AbstractC0963i.m2566a(view, f4009D, C2738i.m5335j(r14, r9, r15, r8));
        } else {
            this.f4052v.getClass();
            m2566a = AbstractC0963i.m2566a(view, f4010E, C2738i.m5335j(r10, r12, r11, r13));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC0005b.m52Q(viewGroup4, true);
            m2577o().m2571a(new C0958d(viewGroup4));
        }
        return m2566a;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: q */
    public final String[] mo2560q() {
        return f4006A;
    }
}
