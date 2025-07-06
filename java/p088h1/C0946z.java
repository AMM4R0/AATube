package p088h1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p044P0.C0420d;
import p052S.AbstractC0498b;

/* renamed from: h1.z */
/* loaded from: classes.dex */
public final class C0946z extends AbstractC0498b {
    public static final Parcelable.Creator<C0946z> CREATOR = new C0420d(6);

    /* renamed from: c */
    public CharSequence f3967c;

    /* renamed from: d */
    public boolean f3968d;

    public C0946z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3967c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3968d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3967c) + "}";
    }

    @Override // p052S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        super.writeToParcel(parcel, r3);
        TextUtils.writeToParcel(this.f3967c, parcel, r3);
        parcel.writeInt(this.f3968d ? 1 : 0);
    }
}
