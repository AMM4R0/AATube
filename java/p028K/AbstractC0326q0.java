package p028K;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p006C.C0051c;
import p103k0.AbstractC2480a;

/* renamed from: K.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC0326q0 extends C0336v0 {

    /* renamed from: h */
    public static boolean f917h = false;

    /* renamed from: i */
    public static Method f918i;

    /* renamed from: j */
    public static Class f919j;

    /* renamed from: k */
    public static Field f920k;

    /* renamed from: l */
    public static Field f921l;

    /* renamed from: c */
    public final WindowInsets f922c;

    /* renamed from: d */
    public C0051c[] f923d;

    /* renamed from: e */
    public C0051c f924e;

    /* renamed from: f */
    public C0340x0 f925f;

    /* renamed from: g */
    public C0051c f926g;

    public AbstractC0326q0(C0340x0 c0340x0, WindowInsets windowInsets) {
        super(c0340x0);
        this.f924e = null;
        this.f922c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: r */
    private C0051c m945r(int r4, boolean z2) {
        C0051c c0051c = C0051c.f97e;
        for (int r12 = 1; r12 <= 256; r12 <<= 1) {
            if ((r4 & r12) != 0) {
                c0051c = C0051c.m196a(c0051c, m956s(r12, z2));
            }
        }
        return c0051c;
    }

    /* renamed from: t */
    private C0051c m946t() {
        C0340x0 c0340x0 = this.f925f;
        return c0340x0 != null ? c0340x0.f944a.mo960h() : C0051c.f97e;
    }

    /* renamed from: u */
    private C0051c m947u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f917h) {
            m948v();
        }
        Method method = f918i;
        if (method != null && f919j != null && f920k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f920k.get(f921l.get(invoke));
                if (rect != null) {
                    return C0051c.m197b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: v */
    private static void m948v() {
        try {
            f918i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f919j = cls;
            f920k = cls.getDeclaredField("mVisibleInsets");
            f921l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f920k.setAccessible(true);
            f921l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f917h = true;
    }

    @Override // p028K.C0336v0
    /* renamed from: d */
    public void mo949d(View view) {
        C0051c m947u = m947u(view);
        if (m947u == null) {
            m947u = C0051c.f97e;
        }
        m957w(m947u);
    }

    @Override // p028K.C0336v0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f926g, ((AbstractC0326q0) obj).f926g);
        }
        return false;
    }

    @Override // p028K.C0336v0
    /* renamed from: f */
    public C0051c mo950f(int r2) {
        return m945r(r2, false);
    }

    @Override // p028K.C0336v0
    /* renamed from: j */
    public final C0051c mo951j() {
        if (this.f924e == null) {
            WindowInsets windowInsets = this.f922c;
            this.f924e = C0051c.m197b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f924e;
    }

    @Override // p028K.C0336v0
    /* renamed from: l */
    public C0340x0 mo952l(int r4, int r5, int r6, int r7) {
        C0340x0 m975g = C0340x0.m975g(null, this.f922c);
        int r12 = Build.VERSION.SDK_INT;
        AbstractC0324p0 c0322o0 = r12 >= 30 ? new C0322o0(m975g) : r12 >= 29 ? new C0320n0(m975g) : new C0316l0(m975g);
        c0322o0.mo894g(C0340x0.m974e(mo951j(), r4, r5, r6, r7));
        c0322o0.mo893e(C0340x0.m974e(mo960h(), r4, r5, r6, r7));
        return c0322o0.mo892b();
    }

    @Override // p028K.C0336v0
    /* renamed from: n */
    public boolean mo953n() {
        return this.f922c.isRound();
    }

    @Override // p028K.C0336v0
    /* renamed from: o */
    public void mo954o(C0051c[] c0051cArr) {
        this.f923d = c0051cArr;
    }

    @Override // p028K.C0336v0
    /* renamed from: p */
    public void mo955p(C0340x0 c0340x0) {
        this.f925f = c0340x0;
    }

    /* renamed from: s */
    public C0051c m956s(int r6, boolean z2) {
        C0051c mo960h;
        int r62;
        if (r6 == 1) {
            return z2 ? C0051c.m197b(0, Math.max(m946t().f99b, mo951j().f99b), 0, 0) : C0051c.m197b(0, mo951j().f99b, 0, 0);
        }
        if (r6 == 2) {
            if (z2) {
                C0051c m946t = m946t();
                C0051c mo960h2 = mo960h();
                return C0051c.m197b(Math.max(m946t.f98a, mo960h2.f98a), 0, Math.max(m946t.f100c, mo960h2.f100c), Math.max(m946t.f101d, mo960h2.f101d));
            }
            C0051c mo951j = mo951j();
            C0340x0 c0340x0 = this.f925f;
            mo960h = c0340x0 != null ? c0340x0.f944a.mo960h() : null;
            int r7 = mo951j.f101d;
            if (mo960h != null) {
                r7 = Math.min(r7, mo960h.f101d);
            }
            return C0051c.m197b(mo951j.f98a, 0, mo951j.f100c, r7);
        }
        C0051c c0051c = C0051c.f97e;
        if (r6 == 8) {
            C0051c[] c0051cArr = this.f923d;
            mo960h = c0051cArr != null ? c0051cArr[AbstractC2480a.m4895x(8)] : null;
            if (mo960h != null) {
                return mo960h;
            }
            C0051c mo951j2 = mo951j();
            C0051c m946t2 = m946t();
            int r63 = mo951j2.f101d;
            if (r63 > m946t2.f101d) {
                return C0051c.m197b(0, 0, 0, r63);
            }
            C0051c c0051c2 = this.f926g;
            return (c0051c2 == null || c0051c2.equals(c0051c) || (r62 = this.f926g.f101d) <= m946t2.f101d) ? c0051c : C0051c.m197b(0, 0, 0, r62);
        }
        if (r6 == 16) {
            return mo968i();
        }
        if (r6 == 32) {
            return mo967g();
        }
        if (r6 == 64) {
            return mo969k();
        }
        if (r6 != 128) {
            return c0051c;
        }
        C0340x0 c0340x02 = this.f925f;
        C0311j mo965e = c0340x02 != null ? c0340x02.f944a.mo965e() : mo965e();
        if (mo965e == null) {
            return c0051c;
        }
        int r72 = Build.VERSION.SDK_INT;
        return C0051c.m197b(r72 >= 28 ? AbstractC0309i.m874d(mo965e.f895a) : 0, r72 >= 28 ? AbstractC0309i.m876f(mo965e.f895a) : 0, r72 >= 28 ? AbstractC0309i.m875e(mo965e.f895a) : 0, r72 >= 28 ? AbstractC0309i.m873c(mo965e.f895a) : 0);
    }

    /* renamed from: w */
    public void m957w(C0051c c0051c) {
        this.f926g = c0051c;
    }
}
