package p103k0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p000A.AbstractC0002c;
import p112o.C2682b;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C2482c extends AbstractC2481b {

    /* renamed from: d */
    public final SparseIntArray f8155d;

    /* renamed from: e */
    public final Parcel f8156e;

    /* renamed from: f */
    public final int f8157f;

    /* renamed from: g */
    public final int f8158g;

    /* renamed from: h */
    public final String f8159h;

    /* renamed from: i */
    public int f8160i;

    /* renamed from: j */
    public int f8161j;

    /* renamed from: k */
    public int f8162k;

    public C2482c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2682b(), new C2682b(), new C2682b());
    }

    @Override // p103k0.AbstractC2481b
    /* renamed from: a */
    public final C2482c mo4897a() {
        Parcel parcel = this.f8156e;
        int dataPosition = parcel.dataPosition();
        int r02 = this.f8161j;
        if (r02 == this.f8157f) {
            r02 = this.f8158g;
        }
        return new C2482c(parcel, dataPosition, r02, AbstractC0002c.m17l(new StringBuilder(), this.f8159h, "  "), this.f8152a, this.f8153b, this.f8154c);
    }

    @Override // p103k0.AbstractC2481b
    /* renamed from: e */
    public final boolean mo4901e(int r5) {
        while (this.f8161j < this.f8158g) {
            int r02 = this.f8162k;
            if (r02 == r5) {
                return true;
            }
            if (String.valueOf(r02).compareTo(String.valueOf(r5)) > 0) {
                return false;
            }
            int r03 = this.f8161j;
            Parcel parcel = this.f8156e;
            parcel.setDataPosition(r03);
            int readInt = parcel.readInt();
            this.f8162k = parcel.readInt();
            this.f8161j += readInt;
        }
        return this.f8162k == r5;
    }

    @Override // p103k0.AbstractC2481b
    /* renamed from: i */
    public final void mo4905i(int r6) {
        int r02 = this.f8160i;
        SparseIntArray sparseIntArray = this.f8155d;
        Parcel parcel = this.f8156e;
        if (r02 >= 0) {
            int r03 = sparseIntArray.get(r02);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(r03);
            parcel.writeInt(dataPosition - r03);
            parcel.setDataPosition(dataPosition);
        }
        this.f8160i = r6;
        sparseIntArray.put(r6, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(r6);
    }

    public C2482c(Parcel parcel, int r2, int r3, String str, C2682b c2682b, C2682b c2682b2, C2682b c2682b3) {
        super(c2682b, c2682b2, c2682b3);
        this.f8155d = new SparseIntArray();
        this.f8160i = -1;
        this.f8162k = -1;
        this.f8156e = parcel;
        this.f8157f = r2;
        this.f8158g = r3;
        this.f8161j = r2;
        this.f8159h = str;
    }
}
