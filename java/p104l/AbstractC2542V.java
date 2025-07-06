package p104l;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: l.V */
/* loaded from: classes.dex */
public abstract class AbstractC2542V {
    /* renamed from: a */
    public static Drawable[] m4989a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: b */
    public static void m4990b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: c */
    public static void m4991c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
