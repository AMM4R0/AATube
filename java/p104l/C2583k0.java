package p104l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.k0 */
/* loaded from: classes.dex */
public final class C2583k0 {

    /* renamed from: l */
    public static final RectF f8406l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f8407m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f8408a = 0;

    /* renamed from: b */
    public boolean f8409b = false;

    /* renamed from: c */
    public float f8410c = -1.0f;

    /* renamed from: d */
    public float f8411d = -1.0f;

    /* renamed from: e */
    public float f8412e = -1.0f;

    /* renamed from: f */
    public int[] f8413f = new int[0];

    /* renamed from: g */
    public boolean f8414g = false;

    /* renamed from: h */
    public TextPaint f8415h;

    /* renamed from: i */
    public final TextView f8416i;

    /* renamed from: j */
    public final Context f8417j;

    /* renamed from: k */
    public final C2574h0 f8418k;

    static {
        new ConcurrentHashMap();
    }

    public C2583k0(TextView textView) {
        this.f8416i = textView;
        this.f8417j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8418k = new C2577i0();
        } else {
            this.f8418k = new C2574h0();
        }
    }

    /* renamed from: b */
    public static int[] m5040b(int[] r6) {
        int length = r6.length;
        if (length == 0) {
            return r6;
        }
        Arrays.sort(r6);
        ArrayList arrayList = new ArrayList();
        for (int r4 : r6) {
            if (r4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(r4)) < 0) {
                arrayList.add(Integer.valueOf(r4));
            }
        }
        if (length == arrayList.size()) {
            return r6;
        }
        int size = arrayList.size();
        int[] r02 = new int[size];
        for (int r2 = 0; r2 < size; r2++) {
            r02[r2] = ((Integer) arrayList.get(r2)).intValue();
        }
        return r02;
    }

    /* renamed from: d */
    public static Method m5041d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f8407m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* renamed from: e */
    public static Object m5042e(Object obj, String str, Object obj2) {
        try {
            return m5041d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m5043a() {
        if (m5045f()) {
            if (this.f8409b) {
                if (this.f8416i.getMeasuredHeight() <= 0 || this.f8416i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f8418k.mo5029b(this.f8416i) ? 1048576 : (this.f8416i.getMeasuredWidth() - this.f8416i.getTotalPaddingLeft()) - this.f8416i.getTotalPaddingRight();
                int height = (this.f8416i.getHeight() - this.f8416i.getCompoundPaddingBottom()) - this.f8416i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8406l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m5044c = m5044c(rectF);
                        if (m5044c != this.f8416i.getTextSize()) {
                            m5046g(0, m5044c);
                        }
                    } finally {
                    }
                }
            }
            this.f8409b = true;
        }
    }

    /* renamed from: c */
    public final int m5044c(RectF rectF) {
        CharSequence transformation;
        int length = this.f8413f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int r2 = length - 1;
        int r5 = 0;
        int r4 = 1;
        while (r4 <= r2) {
            int r52 = (r4 + r2) / 2;
            int r6 = this.f8413f[r52];
            TextView textView = this.f8416i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int m5020b = AbstractC2565e0.m5020b(textView);
            TextPaint textPaint = this.f8415h;
            if (textPaint == null) {
                this.f8415h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f8415h.set(textView.getPaint());
            this.f8415h.setTextSize(r6);
            StaticLayout m5022a = AbstractC2571g0.m5022a(text, (Layout.Alignment) m5042e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m5020b, this.f8416i, this.f8415h, this.f8418k);
            if ((m5020b == -1 || (m5022a.getLineCount() <= m5020b && m5022a.getLineEnd(m5022a.getLineCount() - 1) == text.length())) && m5022a.getHeight() <= rectF.bottom) {
                int r53 = r52 + 1;
                r5 = r4;
                r4 = r53;
            } else {
                r5 = r52 - 1;
                r2 = r5;
            }
        }
        return this.f8413f[r5];
    }

    /* renamed from: f */
    public final boolean m5045f() {
        return m5049j() && this.f8408a != 0;
    }

    /* renamed from: g */
    public final void m5046g(int r4, float f) {
        Context context = this.f8417j;
        float applyDimension = TypedValue.applyDimension(r4, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f8416i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean m5021a = AbstractC2568f0.m5021a(textView);
            if (textView.getLayout() != null) {
                this.f8409b = false;
                try {
                    Method m5041d = m5041d("nullLayouts");
                    if (m5041d != null) {
                        m5041d.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (m5021a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m5047h() {
        if (m5049j() && this.f8408a == 1) {
            if (!this.f8414g || this.f8413f.length == 0) {
                int floor = ((int) Math.floor((this.f8412e - this.f8411d) / this.f8410c)) + 1;
                int[] r3 = new int[floor];
                for (int r12 = 0; r12 < floor; r12++) {
                    r3[r12] = Math.round((r12 * this.f8410c) + this.f8411d);
                }
                this.f8413f = m5040b(r3);
            }
            this.f8409b = true;
        } else {
            this.f8409b = false;
        }
        return this.f8409b;
    }

    /* renamed from: i */
    public final boolean m5048i() {
        boolean z2 = this.f8413f.length > 0;
        this.f8414g = z2;
        if (z2) {
            this.f8408a = 1;
            this.f8411d = r0[0];
            this.f8412e = r0[r1 - 1];
            this.f8410c = -1.0f;
        }
        return z2;
    }

    /* renamed from: j */
    public final boolean m5049j() {
        return !(this.f8416i instanceof C2615v);
    }

    /* renamed from: k */
    public final void m5050k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f8408a = 1;
        this.f8411d = f;
        this.f8412e = f2;
        this.f8410c = f3;
        this.f8414g = false;
    }
}
