package p138x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p135w.AbstractC2876a;

/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C2882d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC2879a f9490a;

    /* renamed from: b */
    public boolean f9491b;

    /* renamed from: c */
    public final int f9492c;

    /* renamed from: d */
    public final int f9493d;

    /* renamed from: e */
    public final int f9494e;

    /* renamed from: f */
    public final int f9495f;

    /* renamed from: g */
    public final int f9496g;

    /* renamed from: h */
    public int f9497h;

    /* renamed from: i */
    public int f9498i;

    /* renamed from: j */
    public int f9499j;

    /* renamed from: k */
    public View f9500k;

    /* renamed from: l */
    public View f9501l;

    /* renamed from: m */
    public boolean f9502m;

    /* renamed from: n */
    public boolean f9503n;

    /* renamed from: o */
    public final Rect f9504o;

    public C2882d() {
        super(-2, -2);
        this.f9491b = false;
        this.f9492c = 0;
        this.f9493d = 0;
        this.f9494e = -1;
        this.f9495f = -1;
        this.f9496g = 0;
        this.f9497h = 0;
        this.f9504o = new Rect();
    }

    /* renamed from: a */
    public final boolean m5479a(int r2) {
        if (r2 == 0) {
            return this.f9502m;
        }
        if (r2 != 1) {
            return false;
        }
        return this.f9503n;
    }

    public C2882d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2879a abstractC2879a;
        this.f9491b = false;
        this.f9492c = 0;
        this.f9493d = 0;
        this.f9494e = -1;
        this.f9495f = -1;
        this.f9496g = 0;
        this.f9497h = 0;
        this.f9504o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2876a.f9488b);
        this.f9492c = obtainStyledAttributes.getInteger(0, 0);
        this.f9495f = obtainStyledAttributes.getResourceId(1, -1);
        this.f9493d = obtainStyledAttributes.getInteger(2, 0);
        this.f9494e = obtainStyledAttributes.getInteger(6, -1);
        this.f9496g = obtainStyledAttributes.getInt(5, 0);
        this.f9497h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f9491b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1986t;
            if (TextUtils.isEmpty(string)) {
                abstractC2879a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1986t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1988v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1987u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC2879a = (AbstractC2879a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f9490a = abstractC2879a;
        }
        obtainStyledAttributes.recycle();
        AbstractC2879a abstractC2879a2 = this.f9490a;
        if (abstractC2879a2 != null) {
            abstractC2879a2.mo2068c(this);
        }
    }

    public C2882d(C2882d c2882d) {
        super((ViewGroup.MarginLayoutParams) c2882d);
        this.f9491b = false;
        this.f9492c = 0;
        this.f9493d = 0;
        this.f9494e = -1;
        this.f9495f = -1;
        this.f9496g = 0;
        this.f9497h = 0;
        this.f9504o = new Rect();
    }

    public C2882d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9491b = false;
        this.f9492c = 0;
        this.f9493d = 0;
        this.f9494e = -1;
        this.f9495f = -1;
        this.f9496g = 0;
        this.f9497h = 0;
        this.f9504o = new Rect();
    }

    public C2882d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9491b = false;
        this.f9492c = 0;
        this.f9493d = 0;
        this.f9494e = -1;
        this.f9495f = -1;
        this.f9496g = 0;
        this.f9497h = 0;
        this.f9504o = new Rect();
    }
}
