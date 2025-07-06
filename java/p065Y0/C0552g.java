package p065Y0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: Y0.g */
/* loaded from: classes.dex */
public final class C0552g {

    /* renamed from: a */
    public CharSequence f1543a;

    /* renamed from: b */
    public final TextPaint f1544b;

    /* renamed from: c */
    public final int f1545c;

    /* renamed from: d */
    public int f1546d;

    /* renamed from: j */
    public boolean f1552j;

    /* renamed from: e */
    public Layout.Alignment f1547e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f1548f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f1549g = 1.0f;

    /* renamed from: h */
    public int f1550h = 1;

    /* renamed from: i */
    public boolean f1551i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f1553k = null;

    public C0552g(CharSequence charSequence, TextPaint textPaint, int r3) {
        this.f1543a = charSequence;
        this.f1544b = textPaint;
        this.f1545c = r3;
        this.f1546d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m1405a() {
        if (this.f1543a == null) {
            this.f1543a = "";
        }
        int max = Math.max(0, this.f1545c);
        CharSequence charSequence = this.f1543a;
        int r3 = this.f1548f;
        TextPaint textPaint = this.f1544b;
        if (r3 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f1553k);
        }
        int min = Math.min(charSequence.length(), this.f1546d);
        this.f1546d = min;
        if (this.f1552j && this.f1548f == 1) {
            this.f1547e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f1547e);
        obtain.setIncludePad(this.f1551i);
        obtain.setTextDirection(this.f1552j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f1553k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f1548f);
        float f = this.f1549g;
        if (f != 1.0f) {
            obtain.setLineSpacing(0.0f, f);
        }
        if (this.f1548f > 1) {
            obtain.setHyphenationFrequency(this.f1550h);
        }
        return obtain.build();
    }
}
