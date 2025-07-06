package p104l;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: l.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC2565e0 {
    /* renamed from: a */
    public static StaticLayout m5019a(CharSequence charSequence, Layout.Alignment alignment, int r10, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, r10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* renamed from: b */
    public static int m5020b(TextView textView) {
        return textView.getMaxLines();
    }
}
