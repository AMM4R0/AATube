package p104l;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* renamed from: l.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC2571g0 {
    /* renamed from: a */
    public static StaticLayout m5022a(CharSequence charSequence, Layout.Alignment alignment, int r4, int r5, TextView textView, TextPaint textPaint, AbstractC2580j0 abstractC2580j0) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, r4);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (r5 == -1) {
            r5 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(r5);
        try {
            abstractC2580j0.mo5027a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
