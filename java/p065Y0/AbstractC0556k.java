package p065Y0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p054S1.C0509h;

/* renamed from: Y0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0556k {

    /* renamed from: a */
    public static final int[] f1560a = {R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f1561b = {R.attr.colorPrimaryVariant};

    /* renamed from: c */
    public static final C0509h f1562c = new C0509h(1);

    /* renamed from: a */
    public static void m1407a(Context context, AttributeSet attributeSet, int r3, int r4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f948B, r3, r4);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m1409c(context, f1561b, "Theme.MaterialComponents");
            }
        }
        m1409c(context, f1560a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1408b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = p029K0.AbstractC0345a.f948B
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p065Y0.AbstractC0556k.m1408b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m1409c(Context context, int[] r3, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r3);
        for (int r02 = 0; r02 < r3.length; r02++) {
            if (!obtainStyledAttributes.hasValue(r02)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC0002c.m16k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public static ArrayList m1410d(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int r12 = 0; r12 < materialToolbar.getChildCount(); r12++) {
            View childAt = materialToolbar.getChildAt(r12);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static boolean m1411e(View view) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: f */
    public static TypedArray m1412f(Context context, AttributeSet attributeSet, int[] r2, int r3, int r4, int... r5) {
        m1407a(context, attributeSet, r3, r4);
        m1408b(context, attributeSet, r2, r3, r4, r5);
        return context.obtainStyledAttributes(attributeSet, r2, r3, r4);
    }

    /* renamed from: g */
    public static PorterDuff.Mode m1413g(int r12, PorterDuff.Mode mode) {
        if (r12 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (r12 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (r12 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (r12) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
