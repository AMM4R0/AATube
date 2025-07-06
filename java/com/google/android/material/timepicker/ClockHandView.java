package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p032L0.AbstractC0367a;
import p103k0.AbstractC2480a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: a */
    public final ValueAnimator f3087a;

    /* renamed from: b */
    public boolean f3088b;

    /* renamed from: c */
    public final ArrayList f3089c;

    /* renamed from: d */
    public final int f3090d;

    /* renamed from: e */
    public final float f3091e;

    /* renamed from: f */
    public final Paint f3092f;

    /* renamed from: g */
    public final RectF f3093g;

    /* renamed from: h */
    public final int f3094h;

    /* renamed from: i */
    public float f3095i;

    /* renamed from: j */
    public boolean f3096j;

    /* renamed from: k */
    public double f3097k;

    /* renamed from: l */
    public int f3098l;

    /* renamed from: m */
    public int f3099m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f3087a = new ValueAnimator();
        this.f3089c = new ArrayList();
        Paint paint = new Paint();
        this.f3092f = paint;
        this.f3093g = new RectF();
        this.f3099m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f953e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC2480a.m4876Q(context, R.attr.motionDurationLong2, 200);
        AbstractC2480a.m4877R(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0367a.f1002b);
        this.f3098l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3090d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f3094h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3091e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m2164b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m2163a(int r2) {
        return r2 == 2 ? Math.round(this.f3098l * 0.66f) : this.f3098l;
    }

    /* renamed from: b */
    public final void m2164b(float f) {
        ValueAnimator valueAnimator = this.f3087a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f3095i = f2;
        this.f3097k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m2163a = m2163a(this.f3099m);
        float cos = (((float) Math.cos(this.f3097k)) * m2163a) + width;
        float sin = (m2163a * ((float) Math.sin(this.f3097k))) + height;
        float f3 = this.f3090d;
        this.f3093g.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f3089c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0774d) it.next());
            if (Math.abs(clockFaceView.f3080I - f2) > 0.001f) {
                clockFaceView.f3080I = f2;
                clockFaceView.m2162n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float m2163a = m2163a(this.f3099m);
        float cos = (((float) Math.cos(this.f3097k)) * m2163a) + f;
        float f2 = height;
        float sin = (m2163a * ((float) Math.sin(this.f3097k))) + f2;
        Paint paint = this.f3092f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f3090d, paint);
        double sin2 = Math.sin(this.f3097k);
        paint.setStrokeWidth(this.f3094h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f3097k) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f, f2, this.f3091e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        if (this.f3087a.isRunning()) {
            return;
        }
        m2164b(this.f3095i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f3096j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f3096j;
            if (this.f3088b) {
                this.f3099m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) m2163a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f3096j;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int r12 = degrees + 90;
        if (r12 < 0) {
            r12 = degrees + 450;
        }
        float f = r12;
        boolean z6 = this.f3095i != f;
        if (!z2 || !z6) {
            if (z6 || z3) {
                m2164b(f);
            }
            this.f3096j = z5 | z4;
            return true;
        }
        z4 = true;
        this.f3096j = z5 | z4;
        return true;
    }
}
