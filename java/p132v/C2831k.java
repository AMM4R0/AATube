package p132v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p120r.AbstractC2717a;

/* renamed from: v.k */
/* loaded from: classes.dex */
public final class C2831k {

    /* renamed from: j */
    public static final SparseIntArray f9335j;

    /* renamed from: a */
    public int f9336a;

    /* renamed from: b */
    public int f9337b;

    /* renamed from: c */
    public int f9338c;

    /* renamed from: d */
    public float f9339d;

    /* renamed from: e */
    public float f9340e;

    /* renamed from: f */
    public float f9341f;

    /* renamed from: g */
    public int f9342g;

    /* renamed from: h */
    public String f9343h;

    /* renamed from: i */
    public int f9344i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9335j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: a */
    public final void m5444a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2838r.f9375f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int r12 = 0; r12 < indexCount; r12++) {
            int index = obtainStyledAttributes.getIndex(r12);
            switch (f9335j.get(index)) {
                case 1:
                    this.f9340e = obtainStyledAttributes.getFloat(index, this.f9340e);
                    break;
                case 2:
                    this.f9338c = obtainStyledAttributes.getInt(index, this.f9338c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC2717a.f8779a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f9336a = C2834n.m5449f(obtainStyledAttributes, index, this.f9336a);
                    break;
                case 6:
                    this.f9337b = obtainStyledAttributes.getInteger(index, this.f9337b);
                    break;
                case 7:
                    this.f9339d = obtainStyledAttributes.getFloat(index, this.f9339d);
                    break;
                case 8:
                    this.f9342g = obtainStyledAttributes.getInteger(index, this.f9342g);
                    break;
                case 9:
                    this.f9341f = obtainStyledAttributes.getFloat(index, this.f9341f);
                    break;
                case 10:
                    int r3 = obtainStyledAttributes.peekValue(index).type;
                    if (r3 == 1) {
                        this.f9344i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (r3 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f9343h = string;
                        if (string.indexOf("/") > 0) {
                            this.f9344i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f9344i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
