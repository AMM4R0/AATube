package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p002A1.C0015h;
import p008C1.C0077i;
import p028K.AbstractC0283P;
import p036M1.AbstractC0379e;
import p043P.AbstractC0410b;
import p043P.AbstractC0411c;
import p046Q.AbstractC0439m;
import p046Q.InterfaceC0445s;
import p076d.AbstractC0780a;

/* renamed from: l.a0 */
/* loaded from: classes.dex */
public final class C2553a0 {

    /* renamed from: a */
    public final TextView f8315a;

    /* renamed from: b */
    public C0077i f8316b;

    /* renamed from: c */
    public C0077i f8317c;

    /* renamed from: d */
    public C0077i f8318d;

    /* renamed from: e */
    public C0077i f8319e;

    /* renamed from: f */
    public C0077i f8320f;

    /* renamed from: g */
    public C0077i f8321g;

    /* renamed from: h */
    public C0077i f8322h;

    /* renamed from: i */
    public final C2583k0 f8323i;

    /* renamed from: j */
    public int f8324j = 0;

    /* renamed from: k */
    public int f8325k = -1;

    /* renamed from: l */
    public Typeface f8326l;

    /* renamed from: m */
    public boolean f8327m;

    public C2553a0(TextView textView) {
        this.f8315a = textView;
        this.f8323i = new C2583k0(textView);
    }

    /* renamed from: c */
    public static C0077i m5000c(Context context, C2609t c2609t, int r3) {
        ColorStateList m4982i;
        synchronized (c2609t) {
            m4982i = c2609t.f8472a.m4982i(context, r3);
        }
        if (m4982i == null) {
            return null;
        }
        C0077i c0077i = new C0077i();
        c0077i.f196b = true;
        c0077i.f197c = m4982i;
        return c0077i;
    }

    /* renamed from: h */
    public static void m5001h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int r3 = Build.VERSION.SDK_INT;
        if (r3 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (r3 >= 30) {
            AbstractC0410b.m1152a(editorInfo, text);
            return;
        }
        text.getClass();
        if (r3 >= 30) {
            AbstractC0410b.m1152a(editorInfo, text);
            return;
        }
        int r13 = editorInfo.initialSelStart;
        int r32 = editorInfo.initialSelEnd;
        int r4 = r13 > r32 ? r32 : r13;
        if (r13 <= r32) {
            r13 = r32;
        }
        int length = text.length();
        if (r4 < 0 || r13 > length) {
            AbstractC0411c.m1153a(editorInfo, null, 0, 0);
            return;
        }
        int r6 = editorInfo.inputType & 4095;
        if (r6 == 129 || r6 == 225 || r6 == 18) {
            AbstractC0411c.m1153a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0411c.m1153a(editorInfo, text, r4, r13);
            return;
        }
        int r33 = r13 - r4;
        int r5 = r33 > 1024 ? 0 : r33;
        int r02 = 2048 - r5;
        int min = Math.min(text.length() - r13, r02 - Math.min(r4, (int) (r02 * 0.8d)));
        int min2 = Math.min(r4, r02 - min);
        int r42 = r4 - min2;
        if (Character.isLowSurrogate(text.charAt(r42))) {
            r42++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((r13 + min) - 1))) {
            min--;
        }
        int r7 = min2 + r5;
        AbstractC0411c.m1153a(editorInfo, r5 != r33 ? TextUtils.concat(text.subSequence(r42, r42 + min2), text.subSequence(r13, min + r13)) : text.subSequence(r42, r7 + min + r42), min2, r7);
    }

    /* renamed from: a */
    public final void m5002a(Drawable drawable, C0077i c0077i) {
        if (drawable == null || c0077i == null) {
            return;
        }
        C2609t.m5072e(drawable, c0077i, this.f8315a.getDrawableState());
    }

    /* renamed from: b */
    public final void m5003b() {
        C0077i c0077i = this.f8316b;
        TextView textView = this.f8315a;
        if (c0077i != null || this.f8317c != null || this.f8318d != null || this.f8319e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m5002a(compoundDrawables[0], this.f8316b);
            m5002a(compoundDrawables[1], this.f8317c);
            m5002a(compoundDrawables[2], this.f8318d);
            m5002a(compoundDrawables[3], this.f8319e);
        }
        if (this.f8320f == null && this.f8321g == null) {
            return;
        }
        Drawable[] m4989a = AbstractC2542V.m4989a(textView);
        m5002a(m4989a[0], this.f8320f);
        m5002a(m4989a[2], this.f8321g);
    }

    /* renamed from: d */
    public final ColorStateList m5004d() {
        C0077i c0077i = this.f8322h;
        if (c0077i != null) {
            return (ColorStateList) c0077i.f197c;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m5005e() {
        C0077i c0077i = this.f8322h;
        if (c0077i != null) {
            return (PorterDuff.Mode) c0077i.f198d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m5006f(AttributeSet attributeSet, int r26) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        ColorStateList colorStateList;
        int resourceId;
        int r8;
        int resourceId2;
        TextView textView = this.f8315a;
        Context context = textView.getContext();
        C2609t m5069a = C2609t.m5069a();
        int[] r3 = AbstractC0780a.f3121h;
        C0015h m100A = C0015h.m100A(context, attributeSet, r3, r26);
        AbstractC0283P.m778k(textView, textView.getContext(), r3, attributeSet, (TypedArray) m100A.f26c, r26);
        TypedArray typedArray = (TypedArray) m100A.f26c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f8316b = m5000c(context, m5069a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f8317c = m5000c(context, m5069a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f8318d = m5000c(context, m5069a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f8319e = m5000c(context, m5069a, typedArray.getResourceId(2, 0));
        }
        int r32 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f8320f = m5000c(context, m5069a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f8321g = m5000c(context, m5069a, typedArray.getResourceId(6, 0));
        }
        m100A.m102C();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] r12 = AbstractC0780a.f3137x;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, r12);
            C0015h c0015h = new C0015h(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            m5013n(context, c0015h);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (r32 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c0015h.m102C();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, r12, r26, 0);
        C0015h c0015h2 = new C0015h(context, obtainStyledAttributes2);
        if (z5 || !obtainStyledAttributes2.hasValue(14)) {
            z4 = z2;
        } else {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (r32 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (r32 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m5013n(context, c0015h2);
        c0015h2.m102C();
        if (!z5 && z3) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f8326l;
        if (typeface != null) {
            if (this.f8325k == -1) {
                textView.setTypeface(typeface, this.f8324j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC2548Y.m4998d(textView, str);
        }
        if (str3 != null) {
            if (r32 >= 24) {
                AbstractC2546X.m4994b(textView, AbstractC2546X.m4993a(str3));
            } else {
                AbstractC2542V.m4991c(textView, AbstractC2544W.m4992a(str3.split(StringUtils.COMMA)[0]));
            }
        }
        int[] r14 = AbstractC0780a.f3122i;
        C2583k0 c2583k0 = this.f8323i;
        Context context2 = c2583k0.f8417j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, r14, r26, 0);
        TextView textView2 = c2583k0.f8416i;
        AbstractC0283P.m778k(textView2, textView2.getContext(), r14, attributeSet, obtainStyledAttributes3, r26);
        if (obtainStyledAttributes3.hasValue(5)) {
            c2583k0.f8408a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] r13 = new int[length];
            if (length > 0) {
                for (int r33 = 0; r33 < length; r33++) {
                    r13[r33] = obtainTypedArray.getDimensionPixelSize(r33, -1);
                }
                c2583k0.f8413f = C2583k0.m5040b(r13);
                c2583k0.m5048i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c2583k0.m5049j()) {
            c2583k0.f8408a = 0;
        } else if (c2583k0.f8408a == 1) {
            if (!c2583k0.f8414g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    r8 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    r8 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(r8, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c2583k0.m5050k(dimension2, dimension3, dimension);
            }
            c2583k0.m5047h();
        }
        if (AbstractC2502A1.f8186b && c2583k0.f8408a != 0) {
            int[] r15 = c2583k0.f8413f;
            if (r15.length > 0) {
                if (AbstractC2548Y.m4995a(textView) != -1.0f) {
                    AbstractC2548Y.m4996b(textView, Math.round(c2583k0.f8411d), Math.round(c2583k0.f8412e), Math.round(c2583k0.f8410c), 0);
                } else {
                    AbstractC2548Y.m4997c(textView, r15, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, r14);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable m5073b = resourceId4 != -1 ? m5069a.m5073b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable m5073b2 = resourceId5 != -1 ? m5069a.m5073b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable m5073b3 = resourceId6 != -1 ? m5069a.m5073b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable m5073b4 = resourceId7 != -1 ? m5069a.m5073b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable m5073b5 = resourceId8 != -1 ? m5069a.m5073b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable m5073b6 = resourceId9 != -1 ? m5069a.m5073b(context, resourceId9) : null;
        if (m5073b5 != null || m5073b6 != null) {
            Drawable[] m4989a = AbstractC2542V.m4989a(textView);
            if (m5073b5 == null) {
                m5073b5 = m4989a[0];
            }
            if (m5073b2 == null) {
                m5073b2 = m4989a[1];
            }
            if (m5073b6 == null) {
                m5073b6 = m4989a[2];
            }
            if (m5073b4 == null) {
                m5073b4 = m4989a[3];
            }
            AbstractC2542V.m4990b(textView, m5073b5, m5073b2, m5073b6, m5073b4);
        } else if (m5073b != null || m5073b2 != null || m5073b3 != null || m5073b4 != null) {
            Drawable[] m4989a2 = AbstractC2542V.m4989a(textView);
            Drawable drawable = m4989a2[0];
            if (drawable == null && m4989a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (m5073b == null) {
                    m5073b = compoundDrawables[0];
                }
                if (m5073b2 == null) {
                    m5073b2 = compoundDrawables[1];
                }
                if (m5073b3 == null) {
                    m5073b3 = compoundDrawables[2];
                }
                if (m5073b4 == null) {
                    m5073b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(m5073b, m5073b2, m5073b3, m5073b4);
            } else {
                if (m5073b2 == null) {
                    m5073b2 = m4989a2[1];
                }
                Drawable drawable2 = m4989a2[2];
                if (m5073b4 == null) {
                    m5073b4 = m4989a2[3];
                }
                AbstractC2542V.m4990b(textView, drawable, m5073b2, drawable2, m5073b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0005b.m75u(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0439m.m1190f(textView, colorStateList);
            } else if (textView instanceof InterfaceC0445s) {
                ((InterfaceC0445s) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode m5067c = AbstractC2604r0.m5067c(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0439m.m1191g(textView, m5067c);
            } else if (textView instanceof InterfaceC0445s) {
                ((InterfaceC0445s) textView).setSupportCompoundDrawablesTintMode(m5067c);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0005b.m48K(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0005b.m49L(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC0379e.m1072c(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    /* renamed from: g */
    public final void m5007g(Context context, int r7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r7, AbstractC0780a.f3137x);
        C0015h c0015h = new C0015h(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f8315a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int r02 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m5013n(context, c0015h);
        if (r02 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC2548Y.m4998d(textView, string);
        }
        c0015h.m102C();
        Typeface typeface = this.f8326l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f8324j);
        }
    }

    /* renamed from: i */
    public final void m5008i(int r3, int r4, int r5, int r6) {
        C2583k0 c2583k0 = this.f8323i;
        if (c2583k0.m5049j()) {
            DisplayMetrics displayMetrics = c2583k0.f8417j.getResources().getDisplayMetrics();
            c2583k0.m5050k(TypedValue.applyDimension(r6, r3, displayMetrics), TypedValue.applyDimension(r6, r4, displayMetrics), TypedValue.applyDimension(r6, r5, displayMetrics));
            if (c2583k0.m5047h()) {
                c2583k0.m5043a();
            }
        }
    }

    /* renamed from: j */
    public final void m5009j(int[] r7, int r8) {
        C2583k0 c2583k0 = this.f8323i;
        if (c2583k0.m5049j()) {
            int length = r7.length;
            if (length > 0) {
                int[] r3 = new int[length];
                if (r8 == 0) {
                    r3 = Arrays.copyOf(r7, length);
                } else {
                    DisplayMetrics displayMetrics = c2583k0.f8417j.getResources().getDisplayMetrics();
                    for (int r2 = 0; r2 < length; r2++) {
                        r3[r2] = Math.round(TypedValue.applyDimension(r8, r7[r2], displayMetrics));
                    }
                }
                c2583k0.f8413f = C2583k0.m5040b(r3);
                if (!c2583k0.m5048i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(r7));
                }
            } else {
                c2583k0.f8414g = false;
            }
            if (c2583k0.m5047h()) {
                c2583k0.m5043a();
            }
        }
    }

    /* renamed from: k */
    public final void m5010k(int r5) {
        C2583k0 c2583k0 = this.f8323i;
        if (c2583k0.m5049j()) {
            if (r5 == 0) {
                c2583k0.f8408a = 0;
                c2583k0.f8411d = -1.0f;
                c2583k0.f8412e = -1.0f;
                c2583k0.f8410c = -1.0f;
                c2583k0.f8413f = new int[0];
                c2583k0.f8409b = false;
                return;
            }
            if (r5 != 1) {
                throw new IllegalArgumentException(AbstractC0002c.m11f(r5, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c2583k0.f8417j.getResources().getDisplayMetrics();
            c2583k0.m5050k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2583k0.m5047h()) {
                c2583k0.m5043a();
            }
        }
    }

    /* renamed from: l */
    public final void m5011l(ColorStateList colorStateList) {
        if (this.f8322h == null) {
            this.f8322h = new C0077i();
        }
        C0077i c0077i = this.f8322h;
        c0077i.f197c = colorStateList;
        c0077i.f196b = colorStateList != null;
        this.f8316b = c0077i;
        this.f8317c = c0077i;
        this.f8318d = c0077i;
        this.f8319e = c0077i;
        this.f8320f = c0077i;
        this.f8321g = c0077i;
    }

    /* renamed from: m */
    public final void m5012m(PorterDuff.Mode mode) {
        if (this.f8322h == null) {
            this.f8322h = new C0077i();
        }
        C0077i c0077i = this.f8322h;
        c0077i.f198d = mode;
        c0077i.f195a = mode != null;
        this.f8316b = c0077i;
        this.f8317c = c0077i;
        this.f8318d = c0077i;
        this.f8319e = c0077i;
        this.f8320f = c0077i;
        this.f8321g = c0077i;
    }

    /* renamed from: n */
    public final void m5013n(Context context, C0015h c0015h) {
        String string;
        int r02 = this.f8324j;
        TypedArray typedArray = (TypedArray) c0015h.f26c;
        this.f8324j = typedArray.getInt(2, r02);
        int r03 = Build.VERSION.SDK_INT;
        if (r03 >= 28) {
            int r5 = typedArray.getInt(11, -1);
            this.f8325k = r5;
            if (r5 != -1) {
                this.f8324j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f8327m = false;
                int r12 = typedArray.getInt(1, 1);
                if (r12 == 1) {
                    this.f8326l = Typeface.SANS_SERIF;
                    return;
                } else if (r12 == 2) {
                    this.f8326l = Typeface.SERIF;
                    return;
                } else {
                    if (r12 != 3) {
                        return;
                    }
                    this.f8326l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8326l = null;
        int r52 = typedArray.hasValue(12) ? 12 : 10;
        int r6 = this.f8325k;
        int r7 = this.f8324j;
        if (!context.isRestricted()) {
            try {
                Typeface m123r = c0015h.m123r(r52, this.f8324j, new C2540U(this, r6, r7, new WeakReference(this.f8315a)));
                if (m123r != null) {
                    if (r03 < 28 || this.f8325k == -1) {
                        this.f8326l = m123r;
                    } else {
                        this.f8326l = AbstractC2550Z.m4999a(Typeface.create(m123r, 0), this.f8325k, (this.f8324j & 2) != 0);
                    }
                }
                this.f8327m = this.f8326l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8326l != null || (string = typedArray.getString(r52)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f8325k == -1) {
            this.f8326l = Typeface.create(string, this.f8324j);
        } else {
            this.f8326l = AbstractC2550Z.m4999a(Typeface.create(string, 0), this.f8325k, (this.f8324j & 2) != 0);
        }
    }
}
