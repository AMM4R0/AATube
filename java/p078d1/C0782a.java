package p078d1;

import android.graphics.Paint;
import android.graphics.Path;
import p006C.AbstractC0049a;

/* renamed from: d1.a */
/* loaded from: classes.dex */
public final class C0782a {

    /* renamed from: i */
    public static final int[] f3141i = new int[3];

    /* renamed from: j */
    public static final float[] f3142j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f3143k = new int[4];

    /* renamed from: l */
    public static final float[] f3144l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f3145a;

    /* renamed from: b */
    public final Paint f3146b;

    /* renamed from: c */
    public final Paint f3147c;

    /* renamed from: d */
    public final int f3148d;

    /* renamed from: e */
    public final int f3149e;

    /* renamed from: f */
    public final int f3150f;

    /* renamed from: g */
    public final Path f3151g = new Path();

    /* renamed from: h */
    public final Paint f3152h;

    public C0782a() {
        Paint paint = new Paint();
        this.f3152h = paint;
        Paint paint2 = new Paint();
        this.f3145a = paint2;
        this.f3148d = AbstractC0049a.m194d(-16777216, 68);
        this.f3149e = AbstractC0049a.m194d(-16777216, 20);
        this.f3150f = AbstractC0049a.m194d(-16777216, 0);
        paint2.setColor(this.f3148d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f3146b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f3147c = new Paint(paint3);
    }
}
