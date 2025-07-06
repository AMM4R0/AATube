package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;
import p008C1.C0091w;
import p100j0.C2446q;
import p112o.AbstractC2684d;
import p112o.C2685e;
import p112o.C2691k;
import p112o.C2692l;

/* renamed from: l.S0 */
/* loaded from: classes.dex */
public final class C2537S0 {

    /* renamed from: i */
    public static C2537S0 f8286i;

    /* renamed from: a */
    public WeakHashMap f8288a;

    /* renamed from: b */
    public C2691k f8289b;

    /* renamed from: c */
    public C2692l f8290c;

    /* renamed from: d */
    public final WeakHashMap f8291d = new WeakHashMap(0);

    /* renamed from: e */
    public TypedValue f8292e;

    /* renamed from: f */
    public boolean f8293f;

    /* renamed from: g */
    public C0091w f8294g;

    /* renamed from: h */
    public static final PorterDuff.Mode f8285h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C2534Q0 f8287j = new C2534Q0(6);

    /* renamed from: d */
    public static synchronized C2537S0 m4973d() {
        C2537S0 c2537s0;
        synchronized (C2537S0.class) {
            try {
                if (f8286i == null) {
                    C2537S0 c2537s02 = new C2537S0();
                    f8286i = c2537s02;
                    m4975j(c2537s02);
                }
                c2537s0 = f8286i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2537s0;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m4974h(int r4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C2537S0.class) {
            C2534Q0 c2534q0 = f8287j;
            c2534q0.getClass();
            int r3 = (31 + r4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c2534q0.m5169a(Integer.valueOf(mode.hashCode() + r3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(r4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: j */
    public static void m4975j(C2537S0 c2537s0) {
        if (Build.VERSION.SDK_INT < 24) {
            c2537s0.m4976a("vector", new C2535R0(3));
            c2537s0.m4976a("animated-vector", new C2535R0(2));
            c2537s0.m4976a("animated-selector", new C2535R0(1));
            c2537s0.m4976a("drawable", new C2535R0(0));
        }
    }

    /* renamed from: a */
    public final void m4976a(String str, C2535R0 c2535r0) {
        if (this.f8289b == null) {
            this.f8289b = new C2691k();
        }
        this.f8289b.put(str, c2535r0);
    }

    /* renamed from: b */
    public final synchronized void m4977b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C2685e c2685e = (C2685e) this.f8291d.get(context);
                if (c2685e == null) {
                    c2685e = new C2685e();
                    this.f8291d.put(context, c2685e);
                }
                c2685e.m5166f(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final Drawable m4978c(Context context, int r10) {
        if (this.f8292e == null) {
            this.f8292e = new TypedValue();
        }
        TypedValue typedValue = this.f8292e;
        context.getResources().getValue(r10, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m4979e = m4979e(context, j2);
        if (m4979e != null) {
            return m4979e;
        }
        LayerDrawable layerDrawable = null;
        if (this.f8294g != null) {
            if (r10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{m4980f(context, R.drawable.abc_cab_background_internal_bg), m4980f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (r10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0091w.m305d(this, context, R.dimen.abc_star_big);
            } else if (r10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0091w.m305d(this, context, R.dimen.abc_star_medium);
            } else if (r10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0091w.m305d(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            m4977b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    /* renamed from: e */
    public final synchronized Drawable m4979e(Context context, long j2) {
        C2685e c2685e = (C2685e) this.f8291d.get(context);
        if (c2685e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2685e.m5165e(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m5160b = AbstractC2684d.m5160b(c2685e.f8657b, c2685e.f8659d, j2);
            if (m5160b >= 0) {
                Object[] objArr = c2685e.f8658c;
                Object obj = objArr[m5160b];
                Object obj2 = C2685e.f8655e;
                if (obj != obj2) {
                    objArr[m5160b] = obj2;
                    c2685e.f8656a = true;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized Drawable m4980f(Context context, int r3) {
        return m4981g(context, r3, false);
    }

    /* renamed from: g */
    public final synchronized Drawable m4981g(Context context, int r4, boolean z2) {
        Drawable m4983k;
        try {
            if (!this.f8293f) {
                this.f8293f = true;
                Drawable m4980f = m4980f(context, R.drawable.abc_vector_test);
                if (m4980f == null || (!(m4980f instanceof C2446q) && !"android.graphics.drawable.VectorDrawable".equals(m4980f.getClass().getName()))) {
                    this.f8293f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            m4983k = m4983k(context, r4);
            if (m4983k == null) {
                m4983k = m4978c(context, r4);
            }
            if (m4983k == null) {
                m4983k = AbstractC0000a.m1b(context, r4);
            }
            if (m4983k != null) {
                m4983k = m4986n(context, r4, z2, m4983k);
            }
            if (m4983k != null) {
                AbstractC2604r0.m5065a(m4983k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m4983k;
    }

    /* renamed from: i */
    public final synchronized ColorStateList m4982i(Context context, int r5) {
        ColorStateList colorStateList;
        C2692l c2692l;
        WeakHashMap weakHashMap = this.f8288a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c2692l = (C2692l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2692l.m5184c(r5, null);
        if (colorStateList == null) {
            C0091w c0091w = this.f8294g;
            if (c0091w != null) {
                colorStateList2 = c0091w.m308e(context, r5);
            }
            if (colorStateList2 != null) {
                if (this.f8288a == null) {
                    this.f8288a = new WeakHashMap();
                }
                C2692l c2692l2 = (C2692l) this.f8288a.get(context);
                if (c2692l2 == null) {
                    c2692l2 = new C2692l();
                    this.f8288a.put(context, c2692l2);
                }
                c2692l2.m5182a(r5, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* renamed from: k */
    public final Drawable m4983k(Context context, int r13) {
        int next;
        C2691k c2691k = this.f8289b;
        if (c2691k == null || c2691k.isEmpty()) {
            return null;
        }
        C2692l c2692l = this.f8290c;
        if (c2692l != null) {
            String str = (String) c2692l.m5184c(r13, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f8289b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f8290c = new C2692l();
        }
        if (this.f8292e == null) {
            this.f8292e = new TypedValue();
        }
        TypedValue typedValue = this.f8292e;
        Resources resources = context.getResources();
        resources.getValue(r13, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m4979e = m4979e(context, j2);
        if (m4979e != null) {
            return m4979e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(r13);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f8290c.m5182a(r13, name);
                C2535R0 c2535r0 = (C2535R0) this.f8289b.getOrDefault(name, null);
                if (c2535r0 != null) {
                    m4979e = c2535r0.m4971a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m4979e != null) {
                    m4979e.setChangingConfigurations(typedValue.changingConfigurations);
                    m4977b(context, j2, m4979e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (m4979e == null) {
            this.f8290c.m5182a(r13, "appcompat_skip_skip");
        }
        return m4979e;
    }

    /* renamed from: l */
    public final synchronized void m4984l(Context context) {
        C2685e c2685e = (C2685e) this.f8291d.get(context);
        if (c2685e != null) {
            c2685e.m5162b();
        }
    }

    /* renamed from: m */
    public final synchronized void m4985m(C0091w c0091w) {
        this.f8294g = c0091w;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m4986n(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.C2537S0.m4986n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
