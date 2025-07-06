package p132v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: v.m */
/* loaded from: classes.dex */
public final class C2833m {

    /* renamed from: n */
    public static final SparseIntArray f9349n;

    /* renamed from: a */
    public float f9350a;

    /* renamed from: b */
    public float f9351b;

    /* renamed from: c */
    public float f9352c;

    /* renamed from: d */
    public float f9353d;

    /* renamed from: e */
    public float f9354e;

    /* renamed from: f */
    public float f9355f;

    /* renamed from: g */
    public float f9356g;

    /* renamed from: h */
    public int f9357h;

    /* renamed from: i */
    public float f9358i;

    /* renamed from: j */
    public float f9359j;

    /* renamed from: k */
    public float f9360k;

    /* renamed from: l */
    public boolean f9361l;

    /* renamed from: m */
    public float f9362m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9349n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: a */
    public final void m5446a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2838r.f9378i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int r02 = 0; r02 < indexCount; r02++) {
            int index = obtainStyledAttributes.getIndex(r02);
            switch (f9349n.get(index)) {
                case 1:
                    this.f9350a = obtainStyledAttributes.getFloat(index, this.f9350a);
                    break;
                case 2:
                    this.f9351b = obtainStyledAttributes.getFloat(index, this.f9351b);
                    break;
                case 3:
                    this.f9352c = obtainStyledAttributes.getFloat(index, this.f9352c);
                    break;
                case 4:
                    this.f9353d = obtainStyledAttributes.getFloat(index, this.f9353d);
                    break;
                case 5:
                    this.f9354e = obtainStyledAttributes.getFloat(index, this.f9354e);
                    break;
                case 6:
                    this.f9355f = obtainStyledAttributes.getDimension(index, this.f9355f);
                    break;
                case 7:
                    this.f9356g = obtainStyledAttributes.getDimension(index, this.f9356g);
                    break;
                case 8:
                    this.f9358i = obtainStyledAttributes.getDimension(index, this.f9358i);
                    break;
                case 9:
                    this.f9359j = obtainStyledAttributes.getDimension(index, this.f9359j);
                    break;
                case 10:
                    this.f9360k = obtainStyledAttributes.getDimension(index, this.f9360k);
                    break;
                case 11:
                    this.f9361l = true;
                    this.f9362m = obtainStyledAttributes.getDimension(index, this.f9362m);
                    break;
                case 12:
                    this.f9357h = C2834n.m5449f(obtainStyledAttributes, index, this.f9357h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
