package p091i1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.carwizard.p075li.youtube.R;
import p029K0.AbstractC0345a;
import p036M1.AbstractC0379e;
import p104l.C2562d0;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class C0981a extends C2562d0 {
    /* renamed from: g */
    public static int m2606g(Context context, TypedArray typedArray, int... r9) {
        int r3 = -1;
        for (int r2 = 0; r2 < r9.length && r3 < 0; r2++) {
            int r32 = r9[r2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(r32, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                r3 = dimensionPixelSize;
            } else {
                r3 = typedArray.getDimensionPixelSize(r32, -1);
            }
        }
        return r3;
    }

    @Override // p104l.C2562d0, android.widget.TextView
    public final void setTextAppearance(Context context, int r4) {
        super.setTextAppearance(context, r4);
        if (AbstractC0379e.m1087y(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(r4, AbstractC0345a.f965q);
            int m2606g = m2606g(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m2606g >= 0) {
                setLineHeight(m2606g);
            }
        }
    }
}
