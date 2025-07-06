package p107m0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: m0.k */
/* loaded from: classes.dex */
public final class C2649k extends Drawable {

    /* renamed from: a */
    public final int f8581a = 200;

    /* renamed from: b */
    public final Paint f8582b;

    /* renamed from: c */
    public final Paint f8583c;

    public C2649k() {
        Paint paint = new Paint();
        this.f8582b = paint;
        paint.setColor(-16777216);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        int r2 = (int) (KotlinVersion.MAX_COMPONENT_VALUE * 0.3f);
        paint.setAlpha(r2);
        Paint paint2 = new Paint();
        this.f8583c = paint2;
        paint2.setColor(-1);
        paint2.setAlpha(r2);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2492i.m4915e(canvas, "canvas");
        float f = this.f8581a;
        float f2 = f / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.f8582b);
        Path path = new Path();
        float f3 = 0.5f * f;
        float f4 = 0.1f * f;
        path.moveTo(f3, f4);
        path.lineTo(f4, f3);
        float f5 = 0.9f * f;
        path.lineTo(f3, f5);
        float f6 = 0.7f * f;
        path.lineTo(f3, f6);
        path.lineTo(f5, f6);
        float f7 = f * 0.3f;
        path.lineTo(f5, f7);
        path.lineTo(f3, f7);
        path.close();
        canvas.drawPath(path, this.f8583c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f8581a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f8581a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
