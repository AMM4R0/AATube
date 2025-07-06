package p046Q;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: Q.o */
/* loaded from: classes.dex */
public abstract class AbstractC0441o {
    /* renamed from: b */
    public static String[] m1195b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static PrecomputedText.Params m1196c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: d */
    public static void m1197d(TextView textView, int r12) {
        textView.setFirstBaselineToTopHeight(r12);
    }

    /* renamed from: a */
    public static CharSequence m1194a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
