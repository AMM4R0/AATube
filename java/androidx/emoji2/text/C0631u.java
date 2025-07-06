package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p008C1.C0080l;
import p036M1.AbstractC0379e;
import p057U.C0523a;

/* renamed from: androidx.emoji2.text.u */
/* loaded from: classes.dex */
public final class C0631u extends ReplacementSpan {

    /* renamed from: b */
    public final C0624n f2110b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f2109a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public float f2111c = 1.0f;

    public C0631u(C0624n c0624n) {
        AbstractC0379e.m1073d(c0624n, "metadata cannot be null");
        this.f2110b = c0624n;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int r13, int r14, float f, int r16, int r17, int r18, Paint paint) {
        C0620j.m1629a().getClass();
        C0624n c0624n = this.f2110b;
        C0080l c0080l = c0624n.f2086b;
        Typeface typeface = (Typeface) c0080l.f222d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0080l.f220b, c0624n.f2085a * 2, 2, f, r17, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int r7, int r8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f2109a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0624n c0624n = this.f2110b;
        this.f2111c = abs / (c0624n.m1637c().m689a(14) != 0 ? ((ByteBuffer) r8.f833d).getShort(r1 + r8.f830a) : (short) 0);
        C0523a m1637c = c0624n.m1637c();
        int m689a = m1637c.m689a(14);
        if (m689a != 0) {
            ((ByteBuffer) m1637c.f833d).getShort(m689a + m1637c.f830a);
        }
        short s2 = (short) ((c0624n.m1637c().m689a(12) != 0 ? ((ByteBuffer) r5.f833d).getShort(r7 + r5.f830a) : (short) 0) * this.f2111c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
