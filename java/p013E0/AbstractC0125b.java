package p013E0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: E0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0125b {

    /* renamed from: a */
    public static final /* synthetic */ int f373a = 0;

    static {
        AbstractC0125b.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m423a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
