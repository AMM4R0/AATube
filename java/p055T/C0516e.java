package p055T;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Arrays;
import java.util.WeakHashMap;
import p001A0.AbstractC0005b;
import p010D0.RunnableC0107e;
import p028K.AbstractC0283P;

/* renamed from: T.e */
/* loaded from: classes.dex */
public final class C0516e {

    /* renamed from: v */
    public static final InterpolatorC0515d f1346v = new InterpolatorC0515d(0);

    /* renamed from: a */
    public int f1347a;

    /* renamed from: b */
    public final int f1348b;

    /* renamed from: d */
    public float[] f1350d;

    /* renamed from: e */
    public float[] f1351e;

    /* renamed from: f */
    public float[] f1352f;

    /* renamed from: g */
    public float[] f1353g;

    /* renamed from: h */
    public int[] f1354h;

    /* renamed from: i */
    public int[] f1355i;

    /* renamed from: j */
    public int[] f1356j;

    /* renamed from: k */
    public int f1357k;

    /* renamed from: l */
    public VelocityTracker f1358l;

    /* renamed from: m */
    public final float f1359m;

    /* renamed from: n */
    public final float f1360n;

    /* renamed from: o */
    public final int f1361o;

    /* renamed from: p */
    public final OverScroller f1362p;

    /* renamed from: q */
    public final AbstractC0005b f1363q;

    /* renamed from: r */
    public View f1364r;

    /* renamed from: s */
    public boolean f1365s;

    /* renamed from: t */
    public final CoordinatorLayout f1366t;

    /* renamed from: c */
    public int f1349c = -1;

    /* renamed from: u */
    public final RunnableC0107e f1367u = new RunnableC0107e(5, this);

    public C0516e(Context context, CoordinatorLayout coordinatorLayout, AbstractC0005b abstractC0005b) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0005b == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1366t = coordinatorLayout;
        this.f1363q = abstractC0005b;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1361o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1348b = viewConfiguration.getScaledTouchSlop();
        this.f1359m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1360n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1362p = new OverScroller(context, f1346v);
    }

    /* renamed from: a */
    public final void m1332a() {
        this.f1349c = -1;
        float[] fArr = this.f1350d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1351e, 0.0f);
            Arrays.fill(this.f1352f, 0.0f);
            Arrays.fill(this.f1353g, 0.0f);
            Arrays.fill(this.f1354h, 0);
            Arrays.fill(this.f1355i, 0);
            Arrays.fill(this.f1356j, 0);
            this.f1357k = 0;
        }
        VelocityTracker velocityTracker = this.f1358l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1358l = null;
        }
    }

    /* renamed from: b */
    public final void m1333b(View view, int r4) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f1366t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f1364r = view;
        this.f1349c = r4;
        this.f1363q.mo77A(view, r4);
        m1345n(1);
    }

    /* renamed from: c */
    public final boolean m1334c(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        AbstractC0005b abstractC0005b = this.f1363q;
        boolean z2 = abstractC0005b.mo91w(view) > 0;
        boolean z3 = abstractC0005b.mo92x() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f) > ((float) this.f1348b) : z3 && Math.abs(f2) > ((float) this.f1348b);
        }
        float f3 = (f2 * f2) + (f * f);
        int r4 = this.f1348b;
        return f3 > ((float) (r4 * r4));
    }

    /* renamed from: d */
    public final void m1335d(int r5) {
        float[] fArr = this.f1350d;
        if (fArr != null) {
            int r12 = this.f1357k;
            int r2 = 1 << r5;
            if ((r12 & r2) != 0) {
                fArr[r5] = 0.0f;
                this.f1351e[r5] = 0.0f;
                this.f1352f[r5] = 0.0f;
                this.f1353g[r5] = 0.0f;
                this.f1354h[r5] = 0;
                this.f1355i[r5] = 0;
                this.f1356j[r5] = 0;
                this.f1357k = (~r2) & r12;
            }
        }
    }

    /* renamed from: e */
    public final int m1336e(int r5, int r6, int r7) {
        if (r5 == 0) {
            return 0;
        }
        float width = this.f1366t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(r5) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(r6);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(r5) / r7) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: f */
    public final boolean m1337f() {
        if (this.f1347a == 2) {
            OverScroller overScroller = this.f1362p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1364r.getLeft();
            int top = currY - this.f1364r.getTop();
            if (left != 0) {
                View view = this.f1364r;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1364r;
                WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1363q.mo79C(this.f1364r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f1366t.post(this.f1367u);
            }
        }
        return this.f1347a == 2;
    }

    /* renamed from: g */
    public final View m1338g(int r5, int r6) {
        CoordinatorLayout coordinatorLayout = this.f1366t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1363q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (r5 >= childAt.getLeft() && r5 < childAt.getRight() && r6 >= childAt.getTop() && r6 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1339h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f1364r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f1364r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f1362p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.m1345n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f1364r
            float r0 = r10.f1360n
            int r0 = (int) r0
            float r6 = r10.f1359m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            A0.b r6 = r10.f1363q
            int r12 = r6.mo91w(r12)
            int r12 = r10.m1336e(r4, r13, r12)
            int r13 = r6.mo92x()
            int r13 = r10.m1336e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.m1345n(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p055T.C0516e.m1339h(int, int, int, int):boolean");
    }

    /* renamed from: i */
    public final boolean m1340i(int r4) {
        if ((this.f1357k & (1 << r4)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + r4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: j */
    public final void m1341j(MotionEvent motionEvent) {
        int r10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1332a();
        }
        if (this.f1358l == null) {
            this.f1358l = VelocityTracker.obtain();
        }
        this.f1358l.addMovement(motionEvent);
        int r3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m1338g = m1338g((int) x2, (int) y2);
            m1343l(x2, y2, pointerId);
            m1348q(m1338g, pointerId);
            int r102 = this.f1354h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f1347a == 1) {
                m1342k();
            }
            m1332a();
            return;
        }
        AbstractC0005b abstractC0005b = this.f1363q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f1347a == 1) {
                    this.f1365s = true;
                    abstractC0005b.mo80D(this.f1364r, 0.0f, 0.0f);
                    this.f1365s = false;
                    if (this.f1347a == 1) {
                        m1345n(0);
                    }
                }
                m1332a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m1343l(x3, y3, pointerId2);
                if (this.f1347a == 0) {
                    m1348q(m1338g((int) x3, (int) y3), pointerId2);
                    int r103 = this.f1354h[pointerId2];
                    return;
                }
                int r2 = (int) x3;
                int r104 = (int) y3;
                View view = this.f1364r;
                if (view != null) {
                    r3 = (r2 < view.getLeft() || r2 >= view.getRight() || r104 < view.getTop() || r104 >= view.getBottom()) ? 0 : 1;
                }
                if (r3 != 0) {
                    m1348q(this.f1364r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1347a == 1 && pointerId3 == this.f1349c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (r3 >= pointerCount) {
                        r10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r3);
                    if (pointerId4 != this.f1349c) {
                        View m1338g2 = m1338g((int) motionEvent.getX(r3), (int) motionEvent.getY(r3));
                        View view2 = this.f1364r;
                        if (m1338g2 == view2 && m1348q(view2, pointerId4)) {
                            r10 = this.f1349c;
                            break;
                        }
                    }
                    r3++;
                }
                if (r10 == -1) {
                    m1342k();
                }
            }
            m1335d(pointerId3);
            return;
        }
        if (this.f1347a == 1) {
            if (m1340i(this.f1349c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1349c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f1352f;
                int r32 = this.f1349c;
                int r12 = (int) (x4 - fArr[r32]);
                int r02 = (int) (y4 - this.f1353g[r32]);
                int left = this.f1364r.getLeft() + r12;
                int top = this.f1364r.getTop() + r02;
                int left2 = this.f1364r.getLeft();
                int top2 = this.f1364r.getTop();
                if (r12 != 0) {
                    left = abstractC0005b.mo89j(this.f1364r, left);
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    this.f1364r.offsetLeftAndRight(left - left2);
                }
                if (r02 != 0) {
                    top = abstractC0005b.mo90k(this.f1364r, top);
                    WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                    this.f1364r.offsetTopAndBottom(top - top2);
                }
                if (r12 != 0 || r02 != 0) {
                    abstractC0005b.mo79C(this.f1364r, left, top);
                }
                m1344m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (r3 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(r3);
            if (m1340i(pointerId5)) {
                float x5 = motionEvent.getX(r3);
                float y5 = motionEvent.getY(r3);
                float f = x5 - this.f1350d[pointerId5];
                float f2 = y5 - this.f1351e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int r8 = this.f1354h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int r82 = this.f1354h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int r83 = this.f1354h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int r84 = this.f1354h[pointerId5];
                if (this.f1347a != 1) {
                    View m1338g3 = m1338g((int) x5, (int) y5);
                    if (m1334c(m1338g3, f, f2) && m1348q(m1338g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            r3++;
        }
        m1344m(motionEvent);
    }

    /* renamed from: k */
    public final void m1342k() {
        VelocityTracker velocityTracker = this.f1358l;
        float f = this.f1359m;
        velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, f);
        float xVelocity = this.f1358l.getXVelocity(this.f1349c);
        float f2 = this.f1360n;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f1358l.getYVelocity(this.f1349c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f2) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f1365s = true;
        this.f1363q.mo80D(this.f1364r, xVelocity, f3);
        this.f1365s = false;
        if (this.f1347a == 1) {
            m1345n(0);
        }
    }

    /* renamed from: l */
    public final void m1343l(float f, float f2, int r13) {
        float[] fArr = this.f1350d;
        if (fArr == null || fArr.length <= r13) {
            int r2 = r13 + 1;
            float[] fArr2 = new float[r2];
            float[] fArr3 = new float[r2];
            float[] fArr4 = new float[r2];
            float[] fArr5 = new float[r2];
            int[] r7 = new int[r2];
            int[] r8 = new int[r2];
            int[] r22 = new int[r2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1351e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1352f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1353g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] r02 = this.f1354h;
                System.arraycopy(r02, 0, r7, 0, r02.length);
                int[] r03 = this.f1355i;
                System.arraycopy(r03, 0, r8, 0, r03.length);
                int[] r04 = this.f1356j;
                System.arraycopy(r04, 0, r22, 0, r04.length);
            }
            this.f1350d = fArr2;
            this.f1351e = fArr3;
            this.f1352f = fArr4;
            this.f1353g = fArr5;
            this.f1354h = r7;
            this.f1355i = r8;
            this.f1356j = r22;
        }
        float[] fArr9 = this.f1350d;
        this.f1352f[r13] = f;
        fArr9[r13] = f;
        float[] fArr10 = this.f1351e;
        this.f1353g[r13] = f2;
        fArr10[r13] = f2;
        int[] r05 = this.f1354h;
        int r11 = (int) f;
        int r12 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f1366t;
        int left = coordinatorLayout.getLeft();
        int r4 = this.f1361o;
        int r14 = r11 < left + r4 ? 1 : 0;
        if (r12 < coordinatorLayout.getTop() + r4) {
            r14 |= 4;
        }
        if (r11 > coordinatorLayout.getRight() - r4) {
            r14 |= 2;
        }
        if (r12 > coordinatorLayout.getBottom() - r4) {
            r14 |= 8;
        }
        r05[r13] = r14;
        this.f1357k |= 1 << r13;
    }

    /* renamed from: m */
    public final void m1344m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int r12 = 0; r12 < pointerCount; r12++) {
            int pointerId = motionEvent.getPointerId(r12);
            if (m1340i(pointerId)) {
                float x2 = motionEvent.getX(r12);
                float y2 = motionEvent.getY(r12);
                this.f1352f[pointerId] = x2;
                this.f1353g[pointerId] = y2;
            }
        }
    }

    /* renamed from: n */
    public final void m1345n(int r3) {
        this.f1366t.removeCallbacks(this.f1367u);
        if (this.f1347a != r3) {
            this.f1347a = r3;
            this.f1363q.mo78B(r3);
            if (this.f1347a == 0) {
                this.f1364r = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean m1346o(int r4, int r5) {
        if (this.f1365s) {
            return m1339h(r4, r5, (int) this.f1358l.getXVelocity(this.f1349c), (int) this.f1358l.getYVelocity(this.f1349c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1347p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p055T.C0516e.m1347p(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public final boolean m1348q(View view, int r4) {
        if (view == this.f1364r && this.f1349c == r4) {
            return true;
        }
        if (view == null || !this.f1363q.mo87R(view, r4)) {
            return false;
        }
        this.f1349c = r4;
        m1333b(view, r4);
        return true;
    }
}
