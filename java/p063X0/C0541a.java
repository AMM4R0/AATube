package p063X0;

import android.content.Context;
import com.carwizard.p075li.youtube.R;
import p036M1.AbstractC0379e;

/* renamed from: X0.a */
/* loaded from: classes.dex */
public final class C0541a {

    /* renamed from: f */
    public static final int f1467f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f1468a;

    /* renamed from: b */
    public final int f1469b;

    /* renamed from: c */
    public final int f1470c;

    /* renamed from: d */
    public final int f1471d;

    /* renamed from: e */
    public final float f1472e;

    public C0541a(Context context) {
        boolean m1087y = AbstractC0379e.m1087y(context, R.attr.elevationOverlayEnabled, false);
        int m1079o = AbstractC0379e.m1079o(context, R.attr.elevationOverlayColor, 0);
        int m1079o2 = AbstractC0379e.m1079o(context, R.attr.elevationOverlayAccentColor, 0);
        int m1079o3 = AbstractC0379e.m1079o(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1468a = m1087y;
        this.f1469b = m1079o;
        this.f1470c = m1079o2;
        this.f1471d = m1079o3;
        this.f1472e = f;
    }
}
