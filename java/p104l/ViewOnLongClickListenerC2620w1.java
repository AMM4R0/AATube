package p104l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.carwizard.p075li.youtube.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p028K.AbstractC0285S;
import p028K.AbstractC0287U;

/* renamed from: l.w1 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC2620w1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC2620w1 f8506k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC2620w1 f8507l;

    /* renamed from: a */
    public final View f8508a;

    /* renamed from: b */
    public final CharSequence f8509b;

    /* renamed from: c */
    public final int f8510c;

    /* renamed from: d */
    public final RunnableC2617v1 f8511d;

    /* renamed from: e */
    public final RunnableC2617v1 f8512e;

    /* renamed from: f */
    public int f8513f;

    /* renamed from: g */
    public int f8514g;

    /* renamed from: h */
    public C2623x1 f8515h;

    /* renamed from: i */
    public boolean f8516i;

    /* renamed from: j */
    public boolean f8517j;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.v1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.v1] */
    public ViewOnLongClickListenerC2620w1(View view, CharSequence charSequence) {
        final int r12 = 0;
        this.f8511d = new Runnable(this) { // from class: l.v1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC2620w1 f8502b;

            {
                this.f8502b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r12) {
                    case 0:
                        this.f8502b.m5090c(false);
                        break;
                    default:
                        this.f8502b.m5089a();
                        break;
                }
            }
        };
        final int r13 = 1;
        this.f8512e = new Runnable(this) { // from class: l.v1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC2620w1 f8502b;

            {
                this.f8502b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r13) {
                    case 0:
                        this.f8502b.m5090c(false);
                        break;
                    default:
                        this.f8502b.m5089a();
                        break;
                }
            }
        };
        this.f8508a = view;
        this.f8509b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0287U.f848a;
        this.f8510c = Build.VERSION.SDK_INT >= 28 ? AbstractC0285S.m783a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f8517j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m5088b(ViewOnLongClickListenerC2620w1 viewOnLongClickListenerC2620w1) {
        ViewOnLongClickListenerC2620w1 viewOnLongClickListenerC2620w12 = f8506k;
        if (viewOnLongClickListenerC2620w12 != null) {
            viewOnLongClickListenerC2620w12.f8508a.removeCallbacks(viewOnLongClickListenerC2620w12.f8511d);
        }
        f8506k = viewOnLongClickListenerC2620w1;
        if (viewOnLongClickListenerC2620w1 != null) {
            viewOnLongClickListenerC2620w1.f8508a.postDelayed(viewOnLongClickListenerC2620w1.f8511d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m5089a() {
        ViewOnLongClickListenerC2620w1 viewOnLongClickListenerC2620w1 = f8507l;
        View view = this.f8508a;
        if (viewOnLongClickListenerC2620w1 == this) {
            f8507l = null;
            C2623x1 c2623x1 = this.f8515h;
            if (c2623x1 != null) {
                View view2 = c2623x1.f8534b;
                if (view2.getParent() != null) {
                    ((WindowManager) c2623x1.f8533a.getSystemService("window")).removeView(view2);
                }
                this.f8515h = null;
                this.f8517j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8506k == this) {
            m5088b(null);
        }
        view.removeCallbacks(this.f8512e);
    }

    /* renamed from: c */
    public final void m5090c(boolean z2) {
        int height;
        int r4;
        String str;
        int r13;
        String str2;
        long longPressTimeout;
        long j2;
        long j3;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        View view = this.f8508a;
        if (view.isAttachedToWindow()) {
            m5088b(null);
            ViewOnLongClickListenerC2620w1 viewOnLongClickListenerC2620w1 = f8507l;
            if (viewOnLongClickListenerC2620w1 != null) {
                viewOnLongClickListenerC2620w1.m5089a();
            }
            f8507l = this;
            this.f8516i = z2;
            C2623x1 c2623x1 = new C2623x1(view.getContext());
            this.f8515h = c2623x1;
            int r3 = this.f8513f;
            int r42 = this.f8514g;
            boolean z3 = this.f8516i;
            View view2 = c2623x1.f8534b;
            ViewParent parent = view2.getParent();
            Context context = c2623x1.f8533a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            c2623x1.f8535c.setText(this.f8509b);
            WindowManager.LayoutParams layoutParams = c2623x1.f8536d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                r3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = r42 + dimensionPixelOffset2;
                r4 = r42 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                r4 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = c2623x1.f8537e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    r13 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    r13 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] r02 = c2623x1.f8539g;
                rootView.getLocationOnScreen(r02);
                int[] r2 = c2623x1.f8538f;
                view.getLocationOnScreen(r2);
                int r8 = r2[r13] - r02[r13];
                r2[r13] = r8;
                r2[1] = r2[1] - r02[1];
                layoutParams.x = (r8 + r3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r13, r13);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int r22 = r2[1];
                int r43 = ((r4 + r22) - dimensionPixelOffset3) - measuredHeight;
                int r23 = r22 + height + dimensionPixelOffset3;
                if (z3) {
                    if (r43 >= 0) {
                        layoutParams.y = r43;
                    } else {
                        layoutParams.y = r23;
                    }
                } else if (measuredHeight + r23 <= rect.height()) {
                    layoutParams.y = r23;
                } else {
                    layoutParams.y = r43;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f8516i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            RunnableC2617v1 runnableC2617v1 = this.f8512e;
            view.removeCallbacks(runnableC2617v1);
            view.postDelayed(runnableC2617v1, j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f8514g) <= r2) goto L29;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            l.x1 r4 = r3.f8515h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f8516i
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f8508a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f8517j = r4
            r3.m5089a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            l.x1 r4 = r3.f8515h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f8517j
            if (r1 != 0) goto L66
            int r1 = r3.f8513f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f8510c
            if (r1 > r2) goto L66
            int r1 = r3.f8514g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f8513f = r4
            r3.f8514g = r5
            r3.f8517j = r0
            m5088b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.ViewOnLongClickListenerC2620w1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f8513f = view.getWidth() / 2;
        this.f8514g = view.getHeight() / 2;
        m5090c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m5089a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
