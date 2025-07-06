package p104l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p001A0.AbstractC0005b;
import p006C.AbstractC0049a;
import p076d.AbstractC0780a;

/* renamed from: l.i1 */
/* loaded from: classes.dex */
public abstract class AbstractC2578i1 {

    /* renamed from: a */
    public static final ThreadLocal f8374a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f8375b = {-16842910};

    /* renamed from: c */
    public static final int[] f8376c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f8377d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f8378e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f8379f = new int[0];

    /* renamed from: g */
    public static final int[] f8380g = new int[1];

    /* renamed from: a */
    public static void m5030a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0780a.f3123j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m5031b(Context context, int r5) {
        ColorStateList m5033d = m5033d(context, r5);
        if (m5033d != null && m5033d.isStateful()) {
            return m5033d.getColorForState(f8375b, m5033d.getDefaultColor());
        }
        ThreadLocal threadLocal = f8374a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0049a.m194d(m5032c(context, r5), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: c */
    public static int m5032c(Context context, int r3) {
        int[] r02 = f8380g;
        r02[0] = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, r02);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m5033d(Context context, int r3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] r02 = f8380g;
        r02[0] = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, r02);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0005b.m75u(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
