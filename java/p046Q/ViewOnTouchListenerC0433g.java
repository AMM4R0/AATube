package p046Q;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p010D0.RunnableC0107e;
import p104l.C2622x0;

/* renamed from: Q.g */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0433g implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f1109r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C0427a f1110a;

    /* renamed from: b */
    public final AccelerateInterpolator f1111b;

    /* renamed from: c */
    public final ListView f1112c;

    /* renamed from: d */
    public RunnableC0107e f1113d;

    /* renamed from: e */
    public final float[] f1114e;

    /* renamed from: f */
    public final float[] f1115f;

    /* renamed from: g */
    public final int f1116g;

    /* renamed from: h */
    public final int f1117h;

    /* renamed from: i */
    public final float[] f1118i;

    /* renamed from: j */
    public final float[] f1119j;

    /* renamed from: k */
    public final float[] f1120k;

    /* renamed from: l */
    public boolean f1121l;

    /* renamed from: m */
    public boolean f1122m;

    /* renamed from: n */
    public boolean f1123n;

    /* renamed from: o */
    public boolean f1124o;

    /* renamed from: p */
    public boolean f1125p;

    /* renamed from: q */
    public final C2622x0 f1126q;

    public ViewOnTouchListenerC0433g(C2622x0 c2622x0) {
        C0427a c0427a = new C0427a();
        c0427a.f1104e = Long.MIN_VALUE;
        c0427a.f1106g = -1L;
        c0427a.f1105f = 0L;
        this.f1110a = c0427a;
        this.f1111b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1114e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1115f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1118i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1119j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1120k = fArr5;
        this.f1112c = c2622x0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1116g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1117h = f1109r;
        c0427a.f1100a = 500;
        c0427a.f1101b = 500;
        this.f1126q = c2622x0;
    }

    /* renamed from: b */
    public static float m1175b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m1176a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1114e
            r0 = r0[r4]
            float[] r1 = r3.f1115f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m1175b(r0, r2, r1)
            float r1 = r3.m1177c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m1177c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1111b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m1175b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f1118i
            r0 = r0[r4]
            float[] r1 = r3.f1119j
            r1 = r1[r4]
            float[] r2 = r3.f1120k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = m1175b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m1175b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p046Q.ViewOnTouchListenerC0433g.m1176a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float m1177c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int r12 = this.f1116g;
        if (r12 == 0 || r12 == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f1124o && r12 == 1) {
                    return 1.0f;
                }
            }
        } else if (r12 == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m1178d() {
        int r12 = 0;
        if (this.f1122m) {
            this.f1124o = false;
            return;
        }
        C0427a c0427a = this.f1110a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int r4 = (int) (currentAnimationTimeMillis - c0427a.f1104e);
        int r5 = c0427a.f1101b;
        if (r4 > r5) {
            r12 = r5;
        } else if (r4 >= 0) {
            r12 = r4;
        }
        c0427a.f1108i = r12;
        c0427a.f1107h = c0427a.m1161a(currentAnimationTimeMillis);
        c0427a.f1106g = currentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m1179e() {
        C2622x0 c2622x0;
        int count;
        C0427a c0427a = this.f1110a;
        float f = c0427a.f1103d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c0427a.f1102c);
        if (abs == 0 || (count = (c2622x0 = this.f1126q).getCount()) == 0) {
            return false;
        }
        int childCount = c2622x0.getChildCount();
        int firstVisiblePosition = c2622x0.getFirstVisiblePosition();
        int r6 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (r6 >= count && c2622x0.getChildAt(childCount - 1).getBottom() <= c2622x0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c2622x0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f1125p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.m1178d()
            goto L7c
        L1a:
            r7.f1123n = r2
            r7.f1121l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f1112c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m1176a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m1176a(r2, r9, r8, r3)
            Q.a r9 = r7.f1110a
            r9.f1102c = r0
            r9.f1103d = r8
            boolean r8 = r7.f1124o
            if (r8 != 0) goto L7c
            boolean r8 = r7.m1179e()
            if (r8 == 0) goto L7c
            D0.e r8 = r7.f1113d
            if (r8 != 0) goto L60
            D0.e r8 = new D0.e
            r9 = 4
            r8.<init>(r9, r7)
            r7.f1113d = r8
        L60:
            r7.f1124o = r2
            r7.f1122m = r2
            boolean r8 = r7.f1121l
            if (r8 != 0) goto L75
            int r8 = r7.f1117h
            if (r8 <= 0) goto L75
            D0.e r9 = r7.f1113d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p028K.AbstractC0283P.f842a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            D0.e r8 = r7.f1113d
            r8.run()
        L7a:
            r7.f1121l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046Q.ViewOnTouchListenerC0433g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
