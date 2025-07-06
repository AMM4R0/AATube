package p079e;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0604t;
import androidx.activity.InterfaceC0605u;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.InterfaceC0708r;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754j;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;
import p026J0.C0229j;
import p028K.AbstractC0273F;
import p028K.AbstractC0283P;
import p036M1.AbstractC0387m;
import p082f0.C0900d;
import p082f0.InterfaceC0901e;
import p099j.C2426k;

/* renamed from: e.f */
/* loaded from: classes.dex */
public final class DialogC0797f extends Dialog implements DialogInterface, InterfaceC0799h, InterfaceC0708r, InterfaceC0605u, InterfaceC0901e {

    /* renamed from: a */
    public C0710t f3237a;

    /* renamed from: b */
    public final C0229j f3238b;

    /* renamed from: c */
    public final C0604t f3239c;

    /* renamed from: d */
    public LayoutInflaterFactory2C0815x f3240d;

    /* renamed from: e */
    public final C0816y f3241e;

    /* renamed from: f */
    public final C0796e f3242f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v4, types: [e.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0797f(android.view.ContextThemeWrapper r6, int r7) {
        /*
            r5 = this;
            int r7 = m2194i(r6, r7)
            r0 = 1
            r1 = 2130903436(0x7f03018c, float:1.741369E38)
            if (r7 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r7
        L1a:
            r5.<init>(r6, r2)
            J0.j r2 = new J0.j
            r2.<init>(r5)
            r5.f3238b = r2
            androidx.activity.t r2 = new androidx.activity.t
            R0.b r3 = new R0.b
            r4 = 4
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r5.f3239c = r2
            e.y r2 = new e.y
            r2.<init>()
            r5.f3241e = r2
            e.k r2 = r5.m2195c()
            if (r7 != 0) goto L4c
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r6.resolveAttribute(r1, r7, r0)
            int r7 = r7.resourceId
        L4c:
            r6 = r2
            e.x r6 = (p079e.LayoutInflaterFactory2C0815x) r6
            r6.f3313T = r7
            r2.mo2219e()
            e.e r6 = new e.e
            android.content.Context r7 = r5.getContext()
            android.view.Window r0 = r5.getWindow()
            r6.<init>(r7, r5, r0)
            r5.f3242f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.DialogC0797f.<init>(android.view.ContextThemeWrapper, int):void");
    }

    /* renamed from: a */
    public static void m2193a(DialogC0797f this$0) {
        AbstractC2492i.m4915e(this$0, "this$0");
        super.onBackPressed();
    }

    /* renamed from: i */
    public static int m2194i(Context context, int r3) {
        if (((r3 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return r3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2195c();
        layoutInflaterFactory2C0815x.m2262w();
        ((ViewGroup) layoutInflaterFactory2C0815x.f3294A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0815x.f3330m.m2238a(layoutInflaterFactory2C0815x.f3329l.getCallback());
    }

    @Override // p082f0.InterfaceC0901e
    /* renamed from: b */
    public final C0900d mo1473b() {
        return (C0900d) this.f3238b.f665c;
    }

    /* renamed from: c */
    public final AbstractC0802k m2195c() {
        if (this.f3240d == null) {
            ExecutorC0786D executorC0786D = AbstractC0802k.f3249a;
            this.f3240d = new LayoutInflaterFactory2C0815x(getContext(), getWindow(), this, this);
        }
        return this.f3240d;
    }

    /* renamed from: d */
    public final C0710t m2196d() {
        C0710t c0710t = this.f3237a;
        if (c0710t != null) {
            return c0710t;
        }
        C0710t c0710t2 = new C0710t(this);
        this.f3237a = c0710t2;
        return c0710t2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2195c().mo2220f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0387m.m1118p(this.f3241e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.lifecycle.InterfaceC0708r
    /* renamed from: e */
    public final C0710t mo1475e() {
        return m2196d();
    }

    /* renamed from: f */
    public final void m2197f(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC2492i.m4914d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0604t c0604t = this.f3239c;
            c0604t.getClass();
            c0604t.f1712e = onBackInvokedDispatcher;
            c0604t.m1484c(c0604t.f1714g);
        }
        this.f3238b.m617b(bundle);
        m2196d().m1794d(EnumC0702l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final View findViewById(int r2) {
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2195c();
        layoutInflaterFactory2C0815x.m2262w();
        return layoutInflaterFactory2C0815x.f3329l.findViewById(r2);
    }

    /* renamed from: g */
    public final void m2198g(Bundle bundle) {
        m2195c().mo2217a();
        m2197f(bundle);
        m2195c().mo2219e();
    }

    /* renamed from: h */
    public final void m2199h() {
        m2196d().m1794d(EnumC0702l.ON_DESTROY);
        this.f3237a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m2195c().mo2218b();
    }

    /* renamed from: j */
    public final void m2200j(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2195c().mo2225m(charSequence);
    }

    /* renamed from: k */
    public final boolean m2201k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3239c.m1483b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int r14;
        ListAdapter listAdapter;
        View findViewById;
        m2198g(bundle);
        C0796e c0796e = this.f3242f;
        c0796e.f3215b.setContentView(c0796e.f3230q);
        Window window = c0796e.f3216c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m2192a = C0796e.m2192a(findViewById6, findViewById3);
        ViewGroup m2192a2 = C0796e.m2192a(findViewById7, findViewById4);
        ViewGroup m2192a3 = C0796e.m2192a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0796e.f3222i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0796e.f3222i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) m2192a2.findViewById(android.R.id.message);
        c0796e.f3226m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0796e.f3222i.removeView(c0796e.f3226m);
            if (c0796e.f3218e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0796e.f3222i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0796e.f3222i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0796e.f3218e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                m2192a2.setVisibility(8);
            }
        }
        Button button = (Button) m2192a3.findViewById(android.R.id.button1);
        c0796e.f3219f = button;
        ViewOnClickListenerC0754j viewOnClickListenerC0754j = c0796e.f3236w;
        button.setOnClickListener(viewOnClickListenerC0754j);
        if (TextUtils.isEmpty(null)) {
            c0796e.f3219f.setVisibility(8);
            r14 = 0;
        } else {
            c0796e.f3219f.setText((CharSequence) null);
            c0796e.f3219f.setVisibility(0);
            r14 = 1;
        }
        Button button2 = (Button) m2192a3.findViewById(android.R.id.button2);
        c0796e.f3220g = button2;
        button2.setOnClickListener(viewOnClickListenerC0754j);
        if (TextUtils.isEmpty(null)) {
            c0796e.f3220g.setVisibility(8);
        } else {
            c0796e.f3220g.setText((CharSequence) null);
            c0796e.f3220g.setVisibility(0);
            r14 |= 2;
        }
        Button button3 = (Button) m2192a3.findViewById(android.R.id.button3);
        c0796e.f3221h = button3;
        button3.setOnClickListener(viewOnClickListenerC0754j);
        if (TextUtils.isEmpty(null)) {
            c0796e.f3221h.setVisibility(8);
        } else {
            c0796e.f3221h.setText((CharSequence) null);
            c0796e.f3221h.setVisibility(0);
            r14 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0796e.f3214a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (r14 == 1) {
                Button button4 = c0796e.f3219f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (r14 == 2) {
                Button button5 = c0796e.f3220g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (r14 == 4) {
                Button button6 = c0796e.f3221h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (r14 == 0) {
            m2192a3.setVisibility(8);
        }
        if (c0796e.f3227n != null) {
            m2192a.addView(c0796e.f3227n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0796e.f3224k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0796e.f3217d) || !c0796e.f3234u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0796e.f3224k.setVisibility(8);
                m2192a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0796e.f3225l = textView2;
                textView2.setText(c0796e.f3217d);
                Drawable drawable = c0796e.f3223j;
                if (drawable != null) {
                    c0796e.f3224k.setImageDrawable(drawable);
                } else {
                    c0796e.f3225l.setPadding(c0796e.f3224k.getPaddingLeft(), c0796e.f3224k.getPaddingTop(), c0796e.f3224k.getPaddingRight(), c0796e.f3224k.getPaddingBottom());
                    c0796e.f3224k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int r5 = (m2192a == null || m2192a.getVisibility() == 8) ? 0 : 1;
        boolean z3 = m2192a3.getVisibility() != 8;
        if (!z3 && (findViewById = m2192a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (r5 != 0) {
            NestedScrollView nestedScrollView2 = c0796e.f3222i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0796e.f3218e != null ? m2192a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = m2192a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0796e.f3218e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || r5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), r5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1715a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1716b);
            }
        }
        if (!z2) {
            View view = c0796e.f3218e;
            if (view == null) {
                view = c0796e.f3222i;
            }
            if (view != null) {
                int r12 = (z3 ? 2 : 0) | r5;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                AbstractC0273F.m726d(view, r12, 3);
                if (findViewById11 != null) {
                    m2192a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    m2192a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0796e.f3218e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0796e.f3228o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int r13 = c0796e.f3229p;
        if (r13 > -1) {
            alertController$RecycleListView2.setItemChecked(r13, true);
            alertController$RecycleListView2.setSelection(r13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3242f.f3222i;
        if (nestedScrollView == null || !nestedScrollView.m1593i(keyEvent)) {
            return super.onKeyDown(r2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3242f.f3222i;
        if (nestedScrollView == null || !nestedScrollView.m1593i(keyEvent)) {
            return super.onKeyUp(r2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC2492i.m4914d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f3238b.m618c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m2196d().m1794d(EnumC0702l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m2199h();
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2195c();
        layoutInflaterFactory2C0815x.m2246B();
        C0791I r02 = layoutInflaterFactory2C0815x.f3332o;
        if (r02 != null) {
            r02.f3199y = false;
            C2426k c2426k = r02.f3198x;
            if (c2426k != null) {
                c2426k.m4782a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int r2) {
        m2195c().mo2222j(r2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int r3) {
        super.setTitle(r3);
        m2195c().mo2225m(getContext().getString(r3));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m2195c().mo2223k(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2195c().mo2224l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m2200j(charSequence);
        C0796e c0796e = this.f3242f;
        c0796e.f3217d = charSequence;
        TextView textView = c0796e.f3225l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
