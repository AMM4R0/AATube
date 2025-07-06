package p104l;

import android.widget.TextView;

/* renamed from: l.Y */
/* loaded from: classes.dex */
public abstract class AbstractC2548Y {
    /* renamed from: a */
    public static int m4995a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m4996b(TextView textView, int r12, int r2, int r3, int r4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(r12, r2, r3, r4);
    }

    /* renamed from: c */
    public static void m4997c(TextView textView, int[] r12, int r2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(r12, r2);
    }

    /* renamed from: d */
    public static boolean m4998d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
