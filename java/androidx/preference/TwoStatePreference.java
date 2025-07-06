package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final Object mo1810c(TypedArray typedArray, int r3) {
        return Boolean.valueOf(typedArray.getBoolean(r3, false));
    }
}
