package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import p008C1.C0077i;
import p008C1.C0091w;

/* renamed from: l.t */
/* loaded from: classes.dex */
public final class C2609t {

    /* renamed from: b */
    public static final PorterDuff.Mode f8470b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C2609t f8471c;

    /* renamed from: a */
    public C2537S0 f8472a;

    /* renamed from: a */
    public static synchronized C2609t m5069a() {
        C2609t c2609t;
        synchronized (C2609t.class) {
            try {
                if (f8471c == null) {
                    m5071d();
                }
                c2609t = f8471c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2609t;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m5070c(int r12, PorterDuff.Mode mode) {
        PorterDuffColorFilter m4974h;
        synchronized (C2609t.class) {
            m4974h = C2537S0.m4974h(r12, mode);
        }
        return m4974h;
    }

    /* renamed from: d */
    public static synchronized void m5071d() {
        synchronized (C2609t.class) {
            if (f8471c == null) {
                C2609t c2609t = new C2609t();
                f8471c = c2609t;
                c2609t.f8472a = C2537S0.m4973d();
                f8471c.f8472a.m4985m(new C0091w());
            }
        }
    }

    /* renamed from: e */
    public static void m5072e(Drawable drawable, C0077i c0077i, int[] r6) {
        PorterDuff.Mode mode = C2537S0.f8285h;
        int[] state = drawable.getState();
        int[] r12 = AbstractC2604r0.f8459a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0077i.f196b;
        if (z2 || c0077i.f195a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z2 ? (ColorStateList) c0077i.f197c : null;
            PorterDuff.Mode mode2 = c0077i.f195a ? (PorterDuff.Mode) c0077i.f198d : C2537S0.f8285h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = C2537S0.m4974h(colorStateList.getColorForState(r6, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: b */
    public final synchronized Drawable m5073b(Context context, int r3) {
        return this.f8472a.m4980f(context, r3);
    }
}
