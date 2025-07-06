package p065Y0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p056T0.C0518b;
import p056T0.C0522f;
import p072b1.C0724d;

/* renamed from: Y0.i */
/* loaded from: classes.dex */
public final class C0554i {

    /* renamed from: c */
    public float f1556c;

    /* renamed from: e */
    public final WeakReference f1558e;

    /* renamed from: f */
    public C0724d f1559f;

    /* renamed from: a */
    public final TextPaint f1554a = new TextPaint(1);

    /* renamed from: b */
    public final C0518b f1555b = new C0518b(1, this);

    /* renamed from: d */
    public boolean f1557d = true;

    public C0554i(C0522f c0522f) {
        this.f1558e = new WeakReference(null);
        this.f1558e = new WeakReference(c0522f);
    }

    /* renamed from: a */
    public final float m1406a(String str) {
        if (!this.f1557d) {
            return this.f1556c;
        }
        TextPaint textPaint = this.f1554a;
        this.f1556c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f1557d = false;
        return this.f1556c;
    }
}
