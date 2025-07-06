package p132v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: v.l */
/* loaded from: classes.dex */
public final class C2832l {

    /* renamed from: a */
    public int f9345a;

    /* renamed from: b */
    public int f9346b;

    /* renamed from: c */
    public float f9347c;

    /* renamed from: d */
    public float f9348d;

    /* renamed from: a */
    public final void m5445a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2838r.f9376g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int r02 = 0; r02 < indexCount; r02++) {
            int index = obtainStyledAttributes.getIndex(r02);
            if (index == 1) {
                this.f9347c = obtainStyledAttributes.getFloat(index, this.f9347c);
            } else if (index == 0) {
                int r12 = obtainStyledAttributes.getInt(index, this.f9345a);
                this.f9345a = r12;
                this.f9345a = C2834n.f9363d[r12];
            } else if (index == 4) {
                this.f9346b = obtainStyledAttributes.getInt(index, this.f9346b);
            } else if (index == 3) {
                this.f9348d = obtainStyledAttributes.getFloat(index, this.f9348d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
