package p015F0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0131b {

    /* renamed from: a */
    public static final /* synthetic */ int f379a = 0;

    static {
        AbstractC0131b.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m425a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
