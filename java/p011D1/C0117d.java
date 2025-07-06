package p011D1;

import android.content.res.TypedArray;
import android.util.SparseArray;
import p002A1.C0015h;
import p008C1.C0087s;
import p088h1.C0933m;

/* renamed from: D1.d */
/* loaded from: classes.dex */
public final class C0117d {

    /* renamed from: a */
    public final int f354a;

    /* renamed from: b */
    public final int f355b;

    /* renamed from: c */
    public final Object f356c;

    /* renamed from: d */
    public final Object f357d;

    public C0117d(C0087s c0087s, int r2, byte[] bArr, int r4) {
        this.f356c = c0087s;
        this.f354a = r2;
        this.f357d = bArr;
        this.f355b = r4;
    }

    public C0117d(C0933m c0933m, C0015h c0015h) {
        this.f356c = new SparseArray();
        this.f357d = c0933m;
        TypedArray typedArray = (TypedArray) c0015h.f26c;
        this.f354a = typedArray.getResourceId(28, 0);
        this.f355b = typedArray.getResourceId(52, 0);
    }
}
