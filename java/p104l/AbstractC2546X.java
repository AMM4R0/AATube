package p104l;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: l.X */
/* loaded from: classes.dex */
public abstract class AbstractC2546X {
    /* renamed from: a */
    public static LocaleList m4993a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m4994b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
