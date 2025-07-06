package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.carwizard.p075li.youtube.R;
import p003B.AbstractC0028b;
import p071b0.AbstractC0720b;
import p071b0.InterfaceC0719a;
import p124s0.C2738i;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: h */
    public final CharSequence[] f2447h;

    /* renamed from: i */
    public final String f2448i;

    public ListPreference(Context context, AttributeSet attributeSet, int r7) {
        super(context, attributeSet, r7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0720b.f2582d, r7, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2447h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C2738i.f8990c == null) {
                C2738i.f8990c = new C2738i();
            }
            this.f2455g = C2738i.f8990c;
            mo1809b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0720b.f2584f, r7, 0);
        this.f2448i = AbstractC0028b.m163e(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final CharSequence mo1811a() {
        InterfaceC0719a interfaceC0719a = this.f2455g;
        if (interfaceC0719a != null) {
            return interfaceC0719a.mo1978c(this);
        }
        CharSequence mo1811a = super.mo1811a();
        String str = this.f2448i;
        if (str == null) {
            return mo1811a;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, mo1811a)) {
            return mo1811a;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final Object mo1810c(TypedArray typedArray, int r2) {
        return typedArray.getString(r2);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0028b.m160b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
