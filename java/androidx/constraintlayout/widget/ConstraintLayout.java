package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C1842f9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p010D0.C0113k;
import p027J1.C0236D;
import p118q.C2712c;
import p123s.C2723d;
import p123s.C2724e;
import p123s.C2727h;
import p132v.AbstractC2823c;
import p132v.AbstractC2824d;
import p132v.AbstractC2835o;
import p132v.AbstractC2838r;
import p132v.C2825e;
import p132v.C2826f;
import p132v.C2827g;
import p132v.C2834n;
import p132v.C2836p;
import p132v.C2839s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r */
    public static C2839s f1968r;

    /* renamed from: a */
    public final SparseArray f1969a;

    /* renamed from: b */
    public final ArrayList f1970b;

    /* renamed from: c */
    public final C2724e f1971c;

    /* renamed from: d */
    public int f1972d;

    /* renamed from: e */
    public int f1973e;

    /* renamed from: f */
    public int f1974f;

    /* renamed from: g */
    public int f1975g;

    /* renamed from: h */
    public boolean f1976h;

    /* renamed from: i */
    public int f1977i;

    /* renamed from: j */
    public C2834n f1978j;

    /* renamed from: k */
    public C0113k f1979k;

    /* renamed from: l */
    public int f1980l;

    /* renamed from: m */
    public HashMap f1981m;

    /* renamed from: n */
    public final SparseArray f1982n;

    /* renamed from: o */
    public final C2826f f1983o;

    /* renamed from: p */
    public int f1984p;

    /* renamed from: q */
    public int f1985q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1969a = new SparseArray();
        this.f1970b = new ArrayList(4);
        this.f1971c = new C2724e();
        this.f1972d = 0;
        this.f1973e = 0;
        this.f1974f = Integer.MAX_VALUE;
        this.f1975g = Integer.MAX_VALUE;
        this.f1976h = true;
        this.f1977i = 257;
        this.f1978j = null;
        this.f1979k = null;
        this.f1980l = -1;
        this.f1981m = new HashMap();
        this.f1982n = new SparseArray();
        this.f1983o = new C2826f(this, this);
        this.f1984p = 0;
        this.f1985q = 0;
        m1565i(attributeSet, 0);
    }

    /* renamed from: g */
    public static C2825e m1563g() {
        C2825e c2825e = new C2825e(-2, -2);
        c2825e.f9194a = -1;
        c2825e.f9196b = -1;
        c2825e.f9198c = -1.0f;
        c2825e.f9200d = true;
        c2825e.f9202e = -1;
        c2825e.f9204f = -1;
        c2825e.f9206g = -1;
        c2825e.f9208h = -1;
        c2825e.f9210i = -1;
        c2825e.f9212j = -1;
        c2825e.f9214k = -1;
        c2825e.f9216l = -1;
        c2825e.f9218m = -1;
        c2825e.f9220n = -1;
        c2825e.f9222o = -1;
        c2825e.f9224p = -1;
        c2825e.f9226q = 0;
        c2825e.f9227r = 0.0f;
        c2825e.f9228s = -1;
        c2825e.f9229t = -1;
        c2825e.f9230u = -1;
        c2825e.f9231v = -1;
        c2825e.f9232w = Integer.MIN_VALUE;
        c2825e.f9233x = Integer.MIN_VALUE;
        c2825e.f9234y = Integer.MIN_VALUE;
        c2825e.f9235z = Integer.MIN_VALUE;
        c2825e.f9168A = Integer.MIN_VALUE;
        c2825e.f9169B = Integer.MIN_VALUE;
        c2825e.f9170C = Integer.MIN_VALUE;
        c2825e.f9171D = 0;
        c2825e.f9172E = 0.5f;
        c2825e.f9173F = 0.5f;
        c2825e.f9174G = null;
        c2825e.f9175H = -1.0f;
        c2825e.f9176I = -1.0f;
        c2825e.f9177J = 0;
        c2825e.f9178K = 0;
        c2825e.f9179L = 0;
        c2825e.f9180M = 0;
        c2825e.f9181N = 0;
        c2825e.f9182O = 0;
        c2825e.f9183P = 0;
        c2825e.f9184Q = 0;
        c2825e.f9185R = 1.0f;
        c2825e.f9186S = 1.0f;
        c2825e.f9187T = -1;
        c2825e.f9188U = -1;
        c2825e.f9189V = -1;
        c2825e.f9190W = false;
        c2825e.f9191X = false;
        c2825e.f9192Y = null;
        c2825e.f9193Z = 0;
        c2825e.f9195a0 = true;
        c2825e.f9197b0 = true;
        c2825e.f9199c0 = false;
        c2825e.f9201d0 = false;
        c2825e.f9203e0 = false;
        c2825e.f9205f0 = -1;
        c2825e.f9207g0 = -1;
        c2825e.f9209h0 = -1;
        c2825e.f9211i0 = -1;
        c2825e.f9213j0 = Integer.MIN_VALUE;
        c2825e.f9215k0 = Integer.MIN_VALUE;
        c2825e.f9217l0 = 0.5f;
        c2825e.f9225p0 = new C2723d();
        return c2825e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C2839s getSharedValues() {
        if (f1968r == null) {
            C2839s c2839s = new C2839s();
            new SparseIntArray();
            new HashMap();
            f1968r = c2839s;
        }
        return f1968r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2825e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1970b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int r4 = 0; r4 < size; r4++) {
                ((AbstractC2823c) arrayList.get(r4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int r5 = 0; r5 < childCount; r5++) {
                View childAt = getChildAt(r5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(StringUtils.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int r7 = (int) ((parseInt / 1080.0f) * width);
                        int r8 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = r7;
                        float f2 = r8;
                        float f3 = r7 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = r8 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1976h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1563g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C2825e c2825e = new C2825e(context, attributeSet);
        c2825e.f9194a = -1;
        c2825e.f9196b = -1;
        c2825e.f9198c = -1.0f;
        c2825e.f9200d = true;
        c2825e.f9202e = -1;
        c2825e.f9204f = -1;
        c2825e.f9206g = -1;
        c2825e.f9208h = -1;
        c2825e.f9210i = -1;
        c2825e.f9212j = -1;
        c2825e.f9214k = -1;
        c2825e.f9216l = -1;
        c2825e.f9218m = -1;
        c2825e.f9220n = -1;
        c2825e.f9222o = -1;
        c2825e.f9224p = -1;
        c2825e.f9226q = 0;
        c2825e.f9227r = 0.0f;
        c2825e.f9228s = -1;
        c2825e.f9229t = -1;
        c2825e.f9230u = -1;
        c2825e.f9231v = -1;
        c2825e.f9232w = Integer.MIN_VALUE;
        c2825e.f9233x = Integer.MIN_VALUE;
        c2825e.f9234y = Integer.MIN_VALUE;
        c2825e.f9235z = Integer.MIN_VALUE;
        c2825e.f9168A = Integer.MIN_VALUE;
        c2825e.f9169B = Integer.MIN_VALUE;
        c2825e.f9170C = Integer.MIN_VALUE;
        c2825e.f9171D = 0;
        c2825e.f9172E = 0.5f;
        c2825e.f9173F = 0.5f;
        c2825e.f9174G = null;
        c2825e.f9175H = -1.0f;
        c2825e.f9176I = -1.0f;
        c2825e.f9177J = 0;
        c2825e.f9178K = 0;
        c2825e.f9179L = 0;
        c2825e.f9180M = 0;
        c2825e.f9181N = 0;
        c2825e.f9182O = 0;
        c2825e.f9183P = 0;
        c2825e.f9184Q = 0;
        c2825e.f9185R = 1.0f;
        c2825e.f9186S = 1.0f;
        c2825e.f9187T = -1;
        c2825e.f9188U = -1;
        c2825e.f9189V = -1;
        c2825e.f9190W = false;
        c2825e.f9191X = false;
        c2825e.f9192Y = null;
        c2825e.f9193Z = 0;
        c2825e.f9195a0 = true;
        c2825e.f9197b0 = true;
        c2825e.f9199c0 = false;
        c2825e.f9201d0 = false;
        c2825e.f9203e0 = false;
        c2825e.f9205f0 = -1;
        c2825e.f9207g0 = -1;
        c2825e.f9209h0 = -1;
        c2825e.f9211i0 = -1;
        c2825e.f9213j0 = Integer.MIN_VALUE;
        c2825e.f9215k0 = Integer.MIN_VALUE;
        c2825e.f9217l0 = 0.5f;
        c2825e.f9225p0 = new C2723d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2838r.f9371b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int r3 = 0; r3 < indexCount; r3++) {
            int index = obtainStyledAttributes.getIndex(r3);
            int r8 = AbstractC2824d.f9167a.get(index);
            switch (r8) {
                case 1:
                    c2825e.f9189V = obtainStyledAttributes.getInt(index, c2825e.f9189V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c2825e.f9224p);
                    c2825e.f9224p = resourceId;
                    if (resourceId == -1) {
                        c2825e.f9224p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c2825e.f9226q = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9226q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, c2825e.f9227r) % 360.0f;
                    c2825e.f9227r = f;
                    if (f < 0.0f) {
                        c2825e.f9227r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c2825e.f9194a = obtainStyledAttributes.getDimensionPixelOffset(index, c2825e.f9194a);
                    break;
                case 6:
                    c2825e.f9196b = obtainStyledAttributes.getDimensionPixelOffset(index, c2825e.f9196b);
                    break;
                case 7:
                    c2825e.f9198c = obtainStyledAttributes.getFloat(index, c2825e.f9198c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c2825e.f9202e);
                    c2825e.f9202e = resourceId2;
                    if (resourceId2 == -1) {
                        c2825e.f9202e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c2825e.f9204f);
                    c2825e.f9204f = resourceId3;
                    if (resourceId3 == -1) {
                        c2825e.f9204f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c2825e.f9206g);
                    c2825e.f9206g = resourceId4;
                    if (resourceId4 == -1) {
                        c2825e.f9206g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c2825e.f9208h);
                    c2825e.f9208h = resourceId5;
                    if (resourceId5 == -1) {
                        c2825e.f9208h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c2825e.f9210i);
                    c2825e.f9210i = resourceId6;
                    if (resourceId6 == -1) {
                        c2825e.f9210i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c2825e.f9212j);
                    c2825e.f9212j = resourceId7;
                    if (resourceId7 == -1) {
                        c2825e.f9212j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c2825e.f9214k);
                    c2825e.f9214k = resourceId8;
                    if (resourceId8 == -1) {
                        c2825e.f9214k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c2825e.f9216l);
                    c2825e.f9216l = resourceId9;
                    if (resourceId9 == -1) {
                        c2825e.f9216l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c2825e.f9218m);
                    c2825e.f9218m = resourceId10;
                    if (resourceId10 == -1) {
                        c2825e.f9218m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c2825e.f9228s);
                    c2825e.f9228s = resourceId11;
                    if (resourceId11 == -1) {
                        c2825e.f9228s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c2825e.f9229t);
                    c2825e.f9229t = resourceId12;
                    if (resourceId12 == -1) {
                        c2825e.f9229t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case C1842f9.f6208E /* 19 */:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c2825e.f9230u);
                    c2825e.f9230u = resourceId13;
                    if (resourceId13 == -1) {
                        c2825e.f9230u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case C1842f9.f6209F /* 20 */:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c2825e.f9231v);
                    c2825e.f9231v = resourceId14;
                    if (resourceId14 == -1) {
                        c2825e.f9231v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case C1842f9.f6210G /* 21 */:
                    c2825e.f9232w = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9232w);
                    break;
                case 22:
                    c2825e.f9233x = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9233x);
                    break;
                case 23:
                    c2825e.f9234y = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9234y);
                    break;
                case 24:
                    c2825e.f9235z = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9235z);
                    break;
                case C1842f9.f6211H /* 25 */:
                    c2825e.f9168A = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9168A);
                    break;
                case C1842f9.f6212I /* 26 */:
                    c2825e.f9169B = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9169B);
                    break;
                case C1842f9.f6213J /* 27 */:
                    c2825e.f9190W = obtainStyledAttributes.getBoolean(index, c2825e.f9190W);
                    break;
                case 28:
                    c2825e.f9191X = obtainStyledAttributes.getBoolean(index, c2825e.f9191X);
                    break;
                case C1842f9.f6214K /* 29 */:
                    c2825e.f9172E = obtainStyledAttributes.getFloat(index, c2825e.f9172E);
                    break;
                case 30:
                    c2825e.f9173F = obtainStyledAttributes.getFloat(index, c2825e.f9173F);
                    break;
                case 31:
                    int r7 = obtainStyledAttributes.getInt(index, 0);
                    c2825e.f9179L = r7;
                    if (r7 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int r72 = obtainStyledAttributes.getInt(index, 0);
                    c2825e.f9180M = r72;
                    if (r72 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c2825e.f9181N = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9181N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c2825e.f9181N) == -2) {
                            c2825e.f9181N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c2825e.f9183P = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9183P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c2825e.f9183P) == -2) {
                            c2825e.f9183P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case C1842f9.f6215L /* 35 */:
                    c2825e.f9185R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c2825e.f9185R));
                    c2825e.f9179L = 2;
                    break;
                case 36:
                    try {
                        c2825e.f9182O = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9182O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c2825e.f9182O) == -2) {
                            c2825e.f9182O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c2825e.f9184Q = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9184Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c2825e.f9184Q) == -2) {
                            c2825e.f9184Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case C1842f9.f6216M /* 38 */:
                    c2825e.f9186S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c2825e.f9186S));
                    c2825e.f9180M = 2;
                    break;
                default:
                    switch (r8) {
                        case 44:
                            C2834n.m5451h(c2825e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c2825e.f9175H = obtainStyledAttributes.getFloat(index, c2825e.f9175H);
                            break;
                        case 46:
                            c2825e.f9176I = obtainStyledAttributes.getFloat(index, c2825e.f9176I);
                            break;
                        case 47:
                            c2825e.f9177J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c2825e.f9178K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c2825e.f9187T = obtainStyledAttributes.getDimensionPixelOffset(index, c2825e.f9187T);
                            break;
                        case 50:
                            c2825e.f9188U = obtainStyledAttributes.getDimensionPixelOffset(index, c2825e.f9188U);
                            break;
                        case 51:
                            c2825e.f9192Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c2825e.f9220n);
                            c2825e.f9220n = resourceId15;
                            if (resourceId15 == -1) {
                                c2825e.f9220n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c2825e.f9222o);
                            c2825e.f9222o = resourceId16;
                            if (resourceId16 == -1) {
                                c2825e.f9222o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c2825e.f9171D = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9171D);
                            break;
                        case 55:
                            c2825e.f9170C = obtainStyledAttributes.getDimensionPixelSize(index, c2825e.f9170C);
                            break;
                        default:
                            switch (r8) {
                                case 64:
                                    C2834n.m5450g(c2825e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C2834n.m5450g(c2825e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c2825e.f9193Z = obtainStyledAttributes.getInt(index, c2825e.f9193Z);
                                    break;
                                case 67:
                                    c2825e.f9200d = obtainStyledAttributes.getBoolean(index, c2825e.f9200d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c2825e.m5435a();
        return c2825e;
    }

    public int getMaxHeight() {
        return this.f1975g;
    }

    public int getMaxWidth() {
        return this.f1974f;
    }

    public int getMinHeight() {
        return this.f1973e;
    }

    public int getMinWidth() {
        return this.f1972d;
    }

    public int getOptimizationLevel() {
        return this.f1971c.f8886D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C2724e c2724e = this.f1971c;
        if (c2724e.f8859j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c2724e.f8859j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c2724e.f8859j = "parent";
            }
        }
        if (c2724e.f8856h0 == null) {
            c2724e.f8856h0 = c2724e.f8859j;
            Log.v("ConstraintLayout", " setDebugName " + c2724e.f8856h0);
        }
        Iterator it = c2724e.f8895q0.iterator();
        while (it.hasNext()) {
            C2723d c2723d = (C2723d) it.next();
            View view = c2723d.f8852f0;
            if (view != null) {
                if (c2723d.f8859j == null && (id = view.getId()) != -1) {
                    c2723d.f8859j = getContext().getResources().getResourceEntryName(id);
                }
                if (c2723d.f8856h0 == null) {
                    c2723d.f8856h0 = c2723d.f8859j;
                    Log.v("ConstraintLayout", " setDebugName " + c2723d.f8856h0);
                }
            }
        }
        c2724e.mo5287n(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final C2723d m1564h(View view) {
        if (view == this) {
            return this.f1971c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C2825e) {
            return ((C2825e) view.getLayoutParams()).f9225p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C2825e) {
            return ((C2825e) view.getLayoutParams()).f9225p0;
        }
        return null;
    }

    /* renamed from: i */
    public final void m1565i(AttributeSet attributeSet, int r9) {
        C2724e c2724e = this.f1971c;
        c2724e.f8852f0 = this;
        C2826f c2826f = this.f1983o;
        c2724e.f8899u0 = c2826f;
        c2724e.f8897s0.f9022f = c2826f;
        this.f1969a.put(getId(), this);
        this.f1978j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2838r.f9371b, r9, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int r2 = 0; r2 < indexCount; r2++) {
                int index = obtainStyledAttributes.getIndex(r2);
                if (index == 16) {
                    this.f1972d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1972d);
                } else if (index == 17) {
                    this.f1973e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1973e);
                } else if (index == 14) {
                    this.f1974f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1974f);
                } else if (index == 15) {
                    this.f1975g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1975g);
                } else if (index == 113) {
                    this.f1977i = obtainStyledAttributes.getInt(index, this.f1977i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1566j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1979k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C2834n c2834n = new C2834n();
                        this.f1978j = c2834n;
                        c2834n.m5454e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1978j = null;
                    }
                    this.f1980l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c2724e.f8886D0 = this.f1977i;
        C2712c.f8745p = c2724e.m5303W(512);
    }

    /* renamed from: j */
    public final void m1566j(int r10) {
        int eventType;
        C0236D c0236d;
        Context context = getContext();
        C0113k c0113k = new C0113k(13, false);
        c0113k.f347b = new SparseArray();
        c0113k.f348c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(r10);
        try {
            eventType = xml.getEventType();
            c0236d = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c = 1;
            if (eventType == 1) {
                this.f1979k = c0113k;
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 2) {
                    c0236d = new C0236D(context, xml);
                    ((SparseArray) c0113k.f347b).put(c0236d.f695a, c0236d);
                } else if (c == 3) {
                    C2827g c2827g = new C2827g(context, xml);
                    if (c0236d != null) {
                        ((ArrayList) c0236d.f697c).add(c2827g);
                    }
                } else if (c == 4) {
                    c0113k.m385i(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1567k(p123s.C2724e r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1567k(s.e, int, int, int):void");
    }

    /* renamed from: l */
    public final void m1568l(C2723d c2723d, C2825e c2825e, SparseArray sparseArray, int r6, int r7) {
        View view = (View) this.f1969a.get(r6);
        C2723d c2723d2 = (C2723d) sparseArray.get(r6);
        if (c2723d2 == null || view == null || !(view.getLayoutParams() instanceof C2825e)) {
            return;
        }
        c2825e.f9199c0 = true;
        if (r7 == 6) {
            C2825e c2825e2 = (C2825e) view.getLayoutParams();
            c2825e2.f9199c0 = true;
            c2825e2.f9225p0.f8819E = true;
        }
        c2723d.mo5282i(6).m5248b(c2723d2.mo5282i(r7), c2825e.f9171D, c2825e.f9170C, true);
        c2723d.f8819E = true;
        c2723d.mo5282i(3).m5256j();
        c2723d.mo5282i(5).m5256j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int r6, int r7, int r8, int r9) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int r82 = 0; r82 < childCount; r82++) {
            View childAt = getChildAt(r82);
            C2825e c2825e = (C2825e) childAt.getLayoutParams();
            C2723d c2723d = c2825e.f9225p0;
            if (childAt.getVisibility() != 8 || c2825e.f9201d0 || c2825e.f9203e0 || isInEditMode) {
                int m5289r = c2723d.m5289r();
                int m5290s = c2723d.m5290s();
                childAt.layout(m5289r, m5290s, c2723d.m5288q() + m5289r, c2723d.m5284k() + m5290s);
            }
        }
        ArrayList arrayList = this.f1970b;
        int size = arrayList.size();
        if (size > 0) {
            for (int r72 = 0; r72 < size; r72++) {
                ((AbstractC2823c) arrayList.get(r72)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0312  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C2723d m1564h = m1564h(view);
        if ((view instanceof C2836p) && !(m1564h instanceof C2727h)) {
            C2825e c2825e = (C2825e) view.getLayoutParams();
            C2727h c2727h = new C2727h();
            c2825e.f9225p0 = c2727h;
            c2825e.f9201d0 = true;
            c2727h.m5315S(c2825e.f9189V);
        }
        if (view instanceof AbstractC2823c) {
            AbstractC2823c abstractC2823c = (AbstractC2823c) view;
            abstractC2823c.m5434i();
            ((C2825e) view.getLayoutParams()).f9203e0 = true;
            ArrayList arrayList = this.f1970b;
            if (!arrayList.contains(abstractC2823c)) {
                arrayList.add(abstractC2823c);
            }
        }
        this.f1969a.put(view.getId(), view);
        this.f1976h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1969a.remove(view.getId());
        C2723d m1564h = m1564h(view);
        this.f1971c.f8895q0.remove(m1564h);
        m1564h.mo5263C();
        this.f1970b.remove(view);
        this.f1976h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1976h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C2834n c2834n) {
        this.f1978j = c2834n;
    }

    @Override // android.view.View
    public void setId(int r3) {
        int id = getId();
        SparseArray sparseArray = this.f1969a;
        sparseArray.remove(id);
        super.setId(r3);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int r2) {
        if (r2 == this.f1975g) {
            return;
        }
        this.f1975g = r2;
        requestLayout();
    }

    public void setMaxWidth(int r2) {
        if (r2 == this.f1974f) {
            return;
        }
        this.f1974f = r2;
        requestLayout();
    }

    public void setMinHeight(int r2) {
        if (r2 == this.f1973e) {
            return;
        }
        this.f1973e = r2;
        requestLayout();
    }

    public void setMinWidth(int r2) {
        if (r2 == this.f1972d) {
            return;
        }
        this.f1972d = r2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2835o abstractC2835o) {
        C0113k c0113k = this.f1979k;
        if (c0113k != null) {
            c0113k.getClass();
        }
    }

    public void setOptimizationLevel(int r2) {
        this.f1977i = r2;
        C2724e c2724e = this.f1971c;
        c2724e.f8886D0 = r2;
        C2712c.f8745p = c2724e.m5303W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4);
        this.f1969a = new SparseArray();
        this.f1970b = new ArrayList(4);
        this.f1971c = new C2724e();
        this.f1972d = 0;
        this.f1973e = 0;
        this.f1974f = Integer.MAX_VALUE;
        this.f1975g = Integer.MAX_VALUE;
        this.f1976h = true;
        this.f1977i = 257;
        this.f1978j = null;
        this.f1979k = null;
        this.f1980l = -1;
        this.f1981m = new HashMap();
        this.f1982n = new SparseArray();
        this.f1983o = new C2826f(this, this);
        this.f1984p = 0;
        this.f1985q = 0;
        m1565i(attributeSet, r4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C2825e c2825e = new C2825e(layoutParams);
        c2825e.f9194a = -1;
        c2825e.f9196b = -1;
        c2825e.f9198c = -1.0f;
        c2825e.f9200d = true;
        c2825e.f9202e = -1;
        c2825e.f9204f = -1;
        c2825e.f9206g = -1;
        c2825e.f9208h = -1;
        c2825e.f9210i = -1;
        c2825e.f9212j = -1;
        c2825e.f9214k = -1;
        c2825e.f9216l = -1;
        c2825e.f9218m = -1;
        c2825e.f9220n = -1;
        c2825e.f9222o = -1;
        c2825e.f9224p = -1;
        c2825e.f9226q = 0;
        c2825e.f9227r = 0.0f;
        c2825e.f9228s = -1;
        c2825e.f9229t = -1;
        c2825e.f9230u = -1;
        c2825e.f9231v = -1;
        c2825e.f9232w = Integer.MIN_VALUE;
        c2825e.f9233x = Integer.MIN_VALUE;
        c2825e.f9234y = Integer.MIN_VALUE;
        c2825e.f9235z = Integer.MIN_VALUE;
        c2825e.f9168A = Integer.MIN_VALUE;
        c2825e.f9169B = Integer.MIN_VALUE;
        c2825e.f9170C = Integer.MIN_VALUE;
        c2825e.f9171D = 0;
        c2825e.f9172E = 0.5f;
        c2825e.f9173F = 0.5f;
        c2825e.f9174G = null;
        c2825e.f9175H = -1.0f;
        c2825e.f9176I = -1.0f;
        c2825e.f9177J = 0;
        c2825e.f9178K = 0;
        c2825e.f9179L = 0;
        c2825e.f9180M = 0;
        c2825e.f9181N = 0;
        c2825e.f9182O = 0;
        c2825e.f9183P = 0;
        c2825e.f9184Q = 0;
        c2825e.f9185R = 1.0f;
        c2825e.f9186S = 1.0f;
        c2825e.f9187T = -1;
        c2825e.f9188U = -1;
        c2825e.f9189V = -1;
        c2825e.f9190W = false;
        c2825e.f9191X = false;
        c2825e.f9192Y = null;
        c2825e.f9193Z = 0;
        c2825e.f9195a0 = true;
        c2825e.f9197b0 = true;
        c2825e.f9199c0 = false;
        c2825e.f9201d0 = false;
        c2825e.f9203e0 = false;
        c2825e.f9205f0 = -1;
        c2825e.f9207g0 = -1;
        c2825e.f9209h0 = -1;
        c2825e.f9211i0 = -1;
        c2825e.f9213j0 = Integer.MIN_VALUE;
        c2825e.f9215k0 = Integer.MIN_VALUE;
        c2825e.f9217l0 = 0.5f;
        c2825e.f9225p0 = new C2723d();
        return c2825e;
    }
}
