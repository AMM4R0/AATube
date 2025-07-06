package p090i0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.carwizard.p075li.youtube.R;
import java.util.HashMap;

/* renamed from: i0.h */
/* loaded from: classes.dex */
public final class C0962h extends AbstractC0967m {

    /* renamed from: B */
    public static final String[] f4014B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A */
    public final int f4015A;

    public C0962h(int r12) {
        this();
        this.f4015A = r12;
    }

    /* renamed from: I */
    public static void m2561I(C0975u c0975u) {
        int visibility = c0975u.f4064b.getVisibility();
        HashMap hashMap = c0975u.f4063a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0975u.f4064b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] r02 = new int[2];
        view.getLocationOnScreen(r02);
        hashMap.put("android:visibility:screenLocation", r02);
    }

    /* renamed from: K */
    public static float m2562K(C0975u c0975u, float f) {
        Float f2;
        return (c0975u == null || (f2 = (Float) c0975u.f4063a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p090i0.C0954G m2563L(p090i0.C0975u r8, p090i0.C0975u r9) {
        /*
            i0.G r0 = new i0.G
            r0.<init>()
            r1 = 0
            r0.f3985a = r1
            r0.f3986b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f4063a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f3987c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3989e = r6
            goto L33
        L2f:
            r0.f3987c = r3
            r0.f3989e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f4063a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f3988d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3990f = r2
            goto L56
        L52:
            r0.f3988d = r3
            r0.f3990f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f3987c
            int r9 = r0.f3988d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f3989e
            android.view.ViewGroup r4 = r0.f3990f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f3986b = r1
            r0.f3985a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f3986b = r2
            r0.f3985a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f3990f
            if (r8 != 0) goto L81
            r0.f3986b = r1
            r0.f3985a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f3989e
            if (r8 != 0) goto L9f
            r0.f3986b = r2
            r0.f3985a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f3988d
            if (r8 != 0) goto L95
            r0.f3986b = r2
            r0.f3985a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f3987c
            if (r8 != 0) goto L9f
            r0.f3986b = r1
            r0.f3985a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p090i0.C0962h.m2563L(i0.u, i0.u):i0.G");
    }

    /* renamed from: J */
    public final ObjectAnimator m2564J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC0977w.f4066a.mo1089A(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC0977w.f4067b, f2);
        C0961g c0961g = new C0961g(view);
        ofFloat.addListener(c0961g);
        m2577o().m2571a(c0961g);
        return ofFloat;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: d */
    public final void mo2549d(C0975u c0975u) {
        m2561I(c0975u);
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: g */
    public final void mo2551g(C0975u c0975u) {
        m2561I(c0975u);
        View view = c0975u.f4064b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(AbstractC0977w.f4066a.mo1092r(view)) : Float.valueOf(0.0f);
        }
        c0975u.f4063a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (m2563L(m2576n(r3, false), m2578r(r3, false)).f3985a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    @Override // p090i0.AbstractC0967m
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo2559k(android.view.ViewGroup r21, p090i0.C0975u r22, p090i0.C0975u r23) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090i0.C0962h.mo2559k(android.view.ViewGroup, i0.u, i0.u):android.animation.Animator");
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: q */
    public final String[] mo2560q() {
        return f4014B;
    }

    @Override // p090i0.AbstractC0967m
    /* renamed from: s */
    public final boolean mo2565s(C0975u c0975u, C0975u c0975u2) {
        if (c0975u == null && c0975u2 == null) {
            return false;
        }
        if (c0975u != null && c0975u2 != null && c0975u2.f4063a.containsKey("android:visibility:visibility") != c0975u.f4063a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0954G m2563L = m2563L(c0975u, c0975u2);
        if (m2563L.f3985a) {
            return m2563L.f3987c == 0 || m2563L.f3988d == 0;
        }
        return false;
    }

    public C0962h() {
        this.f4015A = 3;
    }
}
