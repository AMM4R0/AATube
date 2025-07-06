package p104l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p046Q.AbstractC0438l;
import p049R.C0454b;
import p076d.AbstractC0780a;
import p102k.InterfaceC2451D;

/* renamed from: l.J0 */
/* loaded from: classes.dex */
public class C2520J0 implements InterfaceC2451D {

    /* renamed from: A */
    public static final Method f8226A;

    /* renamed from: B */
    public static final Method f8227B;

    /* renamed from: C */
    public static final Method f8228C;

    /* renamed from: a */
    public final Context f8229a;

    /* renamed from: b */
    public ListAdapter f8230b;

    /* renamed from: c */
    public C2622x0 f8231c;

    /* renamed from: f */
    public int f8234f;

    /* renamed from: g */
    public int f8235g;

    /* renamed from: i */
    public boolean f8237i;

    /* renamed from: j */
    public boolean f8238j;

    /* renamed from: k */
    public boolean f8239k;

    /* renamed from: n */
    public C0454b f8242n;

    /* renamed from: o */
    public View f8243o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f8244p;

    /* renamed from: q */
    public AdapterView.OnItemSelectedListener f8245q;

    /* renamed from: v */
    public final Handler f8250v;

    /* renamed from: x */
    public Rect f8252x;

    /* renamed from: y */
    public boolean f8253y;

    /* renamed from: z */
    public final C2500A f8254z;

    /* renamed from: d */
    public final int f8232d = -2;

    /* renamed from: e */
    public int f8233e = -2;

    /* renamed from: h */
    public final int f8236h = 1002;

    /* renamed from: l */
    public int f8240l = 0;

    /* renamed from: m */
    public final int f8241m = Integer.MAX_VALUE;

    /* renamed from: r */
    public final RunnableC2514G0 f8246r = new RunnableC2514G0(this, 1);

    /* renamed from: s */
    public final ViewOnTouchListenerC2518I0 f8247s = new ViewOnTouchListenerC2518I0(this);

    /* renamed from: t */
    public final C2516H0 f8248t = new C2516H0(this);

    /* renamed from: u */
    public final RunnableC2514G0 f8249u = new RunnableC2514G0(this, 0);

    /* renamed from: w */
    public final Rect f8251w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8226A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f8228C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f8227B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C2520J0(Context context, AttributeSet attributeSet, int r7) {
        int resourceId;
        this.f8229a = context;
        this.f8250v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3128o, r7, 0);
        this.f8234f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8235g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8237i = true;
        }
        obtainStyledAttributes.recycle();
        C2500A c2500a = new C2500A(context, attributeSet, r7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3132s, r7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC0438l.m1183c(c2500a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c2500a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0580g.m1449n(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f8254z = c2500a;
        c2500a.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final void m4945a(int r12) {
        this.f8234f = r12;
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: b */
    public final boolean mo4798b() {
        return this.f8254z.isShowing();
    }

    /* renamed from: d */
    public final int m4946d() {
        return this.f8234f;
    }

    @Override // p102k.InterfaceC2451D
    public final void dismiss() {
        C2500A c2500a = this.f8254z;
        c2500a.dismiss();
        c2500a.setContentView(null);
        this.f8231c = null;
        this.f8250v.removeCallbacks(this.f8246r);
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: f */
    public final void mo4799f() {
        int r7;
        int m4935a;
        int paddingBottom;
        C2622x0 c2622x0;
        C2622x0 c2622x02 = this.f8231c;
        C2500A c2500a = this.f8254z;
        Context context = this.f8229a;
        if (c2622x02 == null) {
            C2622x0 mo4952q = mo4952q(context, !this.f8253y);
            this.f8231c = mo4952q;
            mo4952q.setAdapter(this.f8230b);
            this.f8231c.setOnItemClickListener(this.f8244p);
            this.f8231c.setFocusable(true);
            this.f8231c.setFocusableInTouchMode(true);
            this.f8231c.setOnItemSelectedListener(new C2508D0(0, this));
            this.f8231c.setOnScrollListener(this.f8248t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8245q;
            if (onItemSelectedListener != null) {
                this.f8231c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2500a.setContentView(this.f8231c);
        }
        Drawable background = c2500a.getBackground();
        Rect rect = this.f8251w;
        if (background != null) {
            background.getPadding(rect);
            int r3 = rect.top;
            r7 = rect.bottom + r3;
            if (!this.f8237i) {
                this.f8235g = -r3;
            }
        } else {
            rect.setEmpty();
            r7 = 0;
        }
        boolean z2 = c2500a.getInputMethodMode() == 2;
        View view = this.f8243o;
        int r9 = this.f8235g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f8227B;
            if (method != null) {
                try {
                    m4935a = ((Integer) method.invoke(c2500a, view, Integer.valueOf(r9), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            m4935a = c2500a.getMaxAvailableHeight(view, r9);
        } else {
            m4935a = AbstractC2510E0.m4935a(c2500a, view, r9, z2);
        }
        int r8 = this.f8232d;
        if (r8 == -1) {
            paddingBottom = m4935a + r7;
        } else {
            int r11 = this.f8233e;
            int m5091a = this.f8231c.m5091a(r11 != -2 ? r11 != -1 ? View.MeasureSpec.makeMeasureSpec(r11, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), m4935a);
            paddingBottom = m5091a + (m5091a > 0 ? this.f8231c.getPaddingBottom() + this.f8231c.getPaddingTop() + r7 : 0);
        }
        boolean z3 = this.f8254z.getInputMethodMode() == 2;
        AbstractC0438l.m1184d(c2500a, this.f8236h);
        if (c2500a.isShowing()) {
            View view2 = this.f8243o;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if (view2.isAttachedToWindow()) {
                int r5 = this.f8233e;
                if (r5 == -1) {
                    r5 = -1;
                } else if (r5 == -2) {
                    r5 = this.f8243o.getWidth();
                }
                if (r8 == -1) {
                    r8 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c2500a.setWidth(this.f8233e == -1 ? -1 : 0);
                        c2500a.setHeight(0);
                    } else {
                        c2500a.setWidth(this.f8233e == -1 ? -1 : 0);
                        c2500a.setHeight(-1);
                    }
                } else if (r8 == -2) {
                    r8 = paddingBottom;
                }
                c2500a.setOutsideTouchable(true);
                c2500a.update(this.f8243o, this.f8234f, this.f8235g, r5 < 0 ? -1 : r5, r8 < 0 ? -1 : r8);
                return;
            }
            return;
        }
        int r02 = this.f8233e;
        if (r02 == -1) {
            r02 = -1;
        } else if (r02 == -2) {
            r02 = this.f8243o.getWidth();
        }
        if (r8 == -1) {
            r8 = -1;
        } else if (r8 == -2) {
            r8 = paddingBottom;
        }
        c2500a.setWidth(r02);
        c2500a.setHeight(r8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f8226A;
            if (method2 != null) {
                try {
                    method2.invoke(c2500a, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2512F0.m4937b(c2500a, true);
        }
        c2500a.setOutsideTouchable(true);
        c2500a.setTouchInterceptor(this.f8247s);
        if (this.f8239k) {
            AbstractC0438l.m1183c(c2500a, this.f8238j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f8228C;
            if (method3 != null) {
                try {
                    method3.invoke(c2500a, this.f8252x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC2512F0.m4936a(c2500a, this.f8252x);
        }
        c2500a.showAsDropDown(this.f8243o, this.f8234f, this.f8235g, this.f8240l);
        this.f8231c.setSelection(-1);
        if ((!this.f8253y || this.f8231c.isInTouchMode()) && (c2622x0 = this.f8231c) != null) {
            c2622x0.setListSelectionHidden(true);
            c2622x0.requestLayout();
        }
        if (this.f8253y) {
            return;
        }
        this.f8250v.post(this.f8249u);
    }

    /* renamed from: g */
    public final int m4947g() {
        if (this.f8237i) {
            return this.f8235g;
        }
        return 0;
    }

    /* renamed from: h */
    public final Drawable m4948h() {
        return this.f8254z.getBackground();
    }

    @Override // p102k.InterfaceC2451D
    /* renamed from: j */
    public final C2622x0 mo4800j() {
        return this.f8231c;
    }

    /* renamed from: l */
    public final void m4949l(Drawable drawable) {
        this.f8254z.setBackgroundDrawable(drawable);
    }

    /* renamed from: m */
    public final void m4950m(int r12) {
        this.f8235g = r12;
        this.f8237i = true;
    }

    /* renamed from: n */
    public void mo4951n(ListAdapter listAdapter) {
        C0454b c0454b = this.f8242n;
        if (c0454b == null) {
            this.f8242n = new C0454b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f8230b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0454b);
            }
        }
        this.f8230b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8242n);
        }
        C2622x0 c2622x0 = this.f8231c;
        if (c2622x0 != null) {
            c2622x0.setAdapter(this.f8230b);
        }
    }

    /* renamed from: q */
    public C2622x0 mo4952q(Context context, boolean z2) {
        return new C2622x0(context, z2);
    }

    /* renamed from: r */
    public final void m4953r(int r3) {
        Drawable background = this.f8254z.getBackground();
        if (background == null) {
            this.f8233e = r3;
            return;
        }
        Rect rect = this.f8251w;
        background.getPadding(rect);
        this.f8233e = rect.left + rect.right + r3;
    }
}
