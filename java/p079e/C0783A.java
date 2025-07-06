package p079e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p104l.C2505C;
import p104l.C2562d0;
import p104l.C2594o;
import p104l.C2600q;
import p104l.C2603r;
import p112o.C2691k;

/* renamed from: e.A */
/* loaded from: classes.dex */
public class C0783A {

    /* renamed from: b */
    public static final Class[] f3153b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f3154c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f3155d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f3156e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f3157f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f3158g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C2691k f3159h = new C2691k();

    /* renamed from: a */
    public final Object[] f3160a = new Object[2];

    /* renamed from: a */
    public C2594o mo2155a(Context context, AttributeSet attributeSet) {
        return new C2594o(context, attributeSet);
    }

    /* renamed from: b */
    public C2600q mo2156b(Context context, AttributeSet attributeSet) {
        return new C2600q(context, attributeSet, com.carwizard.p075li.youtube.R.attr.buttonStyle);
    }

    /* renamed from: c */
    public C2603r mo2157c(Context context, AttributeSet attributeSet) {
        return new C2603r(context, attributeSet, com.carwizard.p075li.youtube.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C2505C mo2158d(Context context, AttributeSet attributeSet) {
        return new C2505C(context, attributeSet);
    }

    /* renamed from: e */
    public C2562d0 mo2159e(Context context, AttributeSet attributeSet) {
        return new C2562d0(context, attributeSet);
    }

    /* renamed from: f */
    public final View m2166f(Context context, String str, String str2) {
        String concat;
        C2691k c2691k = f3159h;
        Constructor constructor = (Constructor) c2691k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3153b);
            c2691k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3160a);
    }
}
