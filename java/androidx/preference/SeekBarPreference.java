package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.carwizard.p075li.youtube.R;
import p071b0.AbstractC0720b;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: h */
    public final int f2456h;

    /* renamed from: i */
    public final int f2457i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0720b.f2587i, R.attr.seekBarPreferenceStyle, 0);
        int r6 = obtainStyledAttributes.getInt(3, 0);
        int r12 = obtainStyledAttributes.getInt(1, 100);
        r12 = r12 < r6 ? r6 : r12;
        if (r12 != this.f2456h) {
            this.f2456h = r12;
        }
        int r13 = obtainStyledAttributes.getInt(4, 0);
        if (r13 != this.f2457i) {
            this.f2457i = Math.min(this.f2456h - r6, Math.abs(r13));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final Object mo1810c(TypedArray typedArray, int r3) {
        return Integer.valueOf(typedArray.getInt(r3, 0));
    }
}
