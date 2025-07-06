package p102k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;

/* renamed from: k.x */
/* loaded from: classes.dex */
public class C2477x {

    /* renamed from: a */
    public final Context f8133a;

    /* renamed from: b */
    public final MenuC2466m f8134b;

    /* renamed from: c */
    public final boolean f8135c;

    /* renamed from: d */
    public final int f8136d;

    /* renamed from: e */
    public View f8137e;

    /* renamed from: g */
    public boolean f8139g;

    /* renamed from: h */
    public InterfaceC2478y f8140h;

    /* renamed from: i */
    public AbstractC2474u f8141i;

    /* renamed from: j */
    public C2475v f8142j;

    /* renamed from: f */
    public int f8138f = 8388611;

    /* renamed from: k */
    public final C2475v f8143k = new C2475v(this);

    public C2477x(int r2, Context context, View view, MenuC2466m menuC2466m, boolean z2) {
        this.f8133a = context;
        this.f8134b = menuC2466m;
        this.f8137e = view;
        this.f8135c = z2;
        this.f8136d = r2;
    }

    /* renamed from: a */
    public final AbstractC2474u m4858a() {
        AbstractC2474u viewOnKeyListenerC2452E;
        if (this.f8141i == null) {
            Context context = this.f8133a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC2476w.m4857a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC2452E = new ViewOnKeyListenerC2460g(context, this.f8137e, this.f8136d, this.f8135c);
            } else {
                View view = this.f8137e;
                Context context2 = this.f8133a;
                boolean z2 = this.f8135c;
                viewOnKeyListenerC2452E = new ViewOnKeyListenerC2452E(this.f8136d, context2, view, this.f8134b, z2);
            }
            viewOnKeyListenerC2452E.mo4806l(this.f8134b);
            viewOnKeyListenerC2452E.mo4811r(this.f8143k);
            viewOnKeyListenerC2452E.mo4807n(this.f8137e);
            viewOnKeyListenerC2452E.mo4805k(this.f8140h);
            viewOnKeyListenerC2452E.mo4808o(this.f8139g);
            viewOnKeyListenerC2452E.mo4809p(this.f8138f);
            this.f8141i = viewOnKeyListenerC2452E;
        }
        return this.f8141i;
    }

    /* renamed from: b */
    public final boolean m4859b() {
        AbstractC2474u abstractC2474u = this.f8141i;
        return abstractC2474u != null && abstractC2474u.mo4798b();
    }

    /* renamed from: c */
    public void mo4860c() {
        this.f8141i = null;
        C2475v c2475v = this.f8142j;
        if (c2475v != null) {
            c2475v.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m4861d(int r4, int r5, boolean z2, boolean z3) {
        AbstractC2474u m4858a = m4858a();
        m4858a.mo4812s(z3);
        if (z2) {
            int r6 = this.f8138f;
            View view = this.f8137e;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if ((Gravity.getAbsoluteGravity(r6, view.getLayoutDirection()) & 7) == 5) {
                r4 -= this.f8137e.getWidth();
            }
            m4858a.mo4810q(r4);
            m4858a.mo4813t(r5);
            int r62 = (int) ((this.f8133a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m4858a.f8131a = new Rect(r4 - r62, r5 - r62, r4 + r62, r5 + r62);
        }
        m4858a.mo4799f();
    }
}
