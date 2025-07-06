package p081e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;

/* renamed from: e1.k */
/* loaded from: classes.dex */
public final class C0885k {

    /* renamed from: a */
    public AbstractC0379e f3694a = new C0883i();

    /* renamed from: b */
    public AbstractC0379e f3695b = new C0883i();

    /* renamed from: c */
    public AbstractC0379e f3696c = new C0883i();

    /* renamed from: d */
    public AbstractC0379e f3697d = new C0883i();

    /* renamed from: e */
    public InterfaceC0877c f3698e = new C0875a(0.0f);

    /* renamed from: f */
    public InterfaceC0877c f3699f = new C0875a(0.0f);

    /* renamed from: g */
    public InterfaceC0877c f3700g = new C0875a(0.0f);

    /* renamed from: h */
    public InterfaceC0877c f3701h = new C0875a(0.0f);

    /* renamed from: i */
    public C0879e f3702i = new C0879e();

    /* renamed from: j */
    public C0879e f3703j = new C0879e();

    /* renamed from: k */
    public C0879e f3704k = new C0879e();

    /* renamed from: l */
    public C0879e f3705l = new C0879e();

    /* renamed from: a */
    public static C0884j m2413a(Context context, int r7, int r8, C0875a c0875a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, r7);
        if (r8 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, r8);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0345a.f970v);
        try {
            int r72 = obtainStyledAttributes.getInt(0, 0);
            int r82 = obtainStyledAttributes.getInt(3, r72);
            int r02 = obtainStyledAttributes.getInt(4, r72);
            int r12 = obtainStyledAttributes.getInt(2, r72);
            int r73 = obtainStyledAttributes.getInt(1, r72);
            InterfaceC0877c m2415c = m2415c(obtainStyledAttributes, 5, c0875a);
            InterfaceC0877c m2415c2 = m2415c(obtainStyledAttributes, 8, m2415c);
            InterfaceC0877c m2415c3 = m2415c(obtainStyledAttributes, 9, m2415c);
            InterfaceC0877c m2415c4 = m2415c(obtainStyledAttributes, 7, m2415c);
            InterfaceC0877c m2415c5 = m2415c(obtainStyledAttributes, 6, m2415c);
            C0884j c0884j = new C0884j();
            AbstractC0379e m1116n = AbstractC0387m.m1116n(r82);
            c0884j.f3682a = m1116n;
            C0884j.m2411b(m1116n);
            c0884j.f3686e = m2415c2;
            AbstractC0379e m1116n2 = AbstractC0387m.m1116n(r02);
            c0884j.f3683b = m1116n2;
            C0884j.m2411b(m1116n2);
            c0884j.f3687f = m2415c3;
            AbstractC0379e m1116n3 = AbstractC0387m.m1116n(r12);
            c0884j.f3684c = m1116n3;
            C0884j.m2411b(m1116n3);
            c0884j.f3688g = m2415c4;
            AbstractC0379e m1116n4 = AbstractC0387m.m1116n(r73);
            c0884j.f3685d = m1116n4;
            C0884j.m2411b(m1116n4);
            c0884j.f3689h = m2415c5;
            return c0884j;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C0884j m2414b(Context context, AttributeSet attributeSet, int r5, int r6) {
        C0875a c0875a = new C0875a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f964p, r5, r6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m2413a(context, resourceId, resourceId2, c0875a);
    }

    /* renamed from: c */
    public static InterfaceC0877c m2415c(TypedArray typedArray, int r3, InterfaceC0877c interfaceC0877c) {
        TypedValue peekValue = typedArray.peekValue(r3);
        if (peekValue == null) {
            return interfaceC0877c;
        }
        int r02 = peekValue.type;
        return r02 == 5 ? new C0875a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : r02 == 6 ? new C0882h(peekValue.getFraction(1.0f, 1.0f)) : interfaceC0877c;
    }

    /* renamed from: d */
    public final boolean m2416d(RectF rectF) {
        boolean z2 = this.f3705l.getClass().equals(C0879e.class) && this.f3703j.getClass().equals(C0879e.class) && this.f3702i.getClass().equals(C0879e.class) && this.f3704k.getClass().equals(C0879e.class);
        float mo2392a = this.f3698e.mo2392a(rectF);
        return z2 && ((this.f3699f.mo2392a(rectF) > mo2392a ? 1 : (this.f3699f.mo2392a(rectF) == mo2392a ? 0 : -1)) == 0 && (this.f3701h.mo2392a(rectF) > mo2392a ? 1 : (this.f3701h.mo2392a(rectF) == mo2392a ? 0 : -1)) == 0 && (this.f3700g.mo2392a(rectF) > mo2392a ? 1 : (this.f3700g.mo2392a(rectF) == mo2392a ? 0 : -1)) == 0) && ((this.f3695b instanceof C0883i) && (this.f3694a instanceof C0883i) && (this.f3696c instanceof C0883i) && (this.f3697d instanceof C0883i));
    }

    /* renamed from: e */
    public final C0884j m2417e() {
        C0884j c0884j = new C0884j();
        c0884j.f3682a = this.f3694a;
        c0884j.f3683b = this.f3695b;
        c0884j.f3684c = this.f3696c;
        c0884j.f3685d = this.f3697d;
        c0884j.f3686e = this.f3698e;
        c0884j.f3687f = this.f3699f;
        c0884j.f3688g = this.f3700g;
        c0884j.f3689h = this.f3701h;
        c0884j.f3690i = this.f3702i;
        c0884j.f3691j = this.f3703j;
        c0884j.f3692k = this.f3704k;
        c0884j.f3693l = this.f3705l;
        return c0884j;
    }
}
