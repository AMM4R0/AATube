package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.carwizard.p075li.youtube.R;
import p003B.AbstractC0028b;
import p071b0.AbstractC0720b;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int r5) {
        super(context, attributeSet, r5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0720b.f2580b, r5, 0);
        AbstractC0028b.m163e(obtainStyledAttributes, 9, 0);
        AbstractC0028b.m163e(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        AbstractC0028b.m163e(obtainStyledAttributes, 11, 3);
        AbstractC0028b.m163e(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0028b.m160b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
