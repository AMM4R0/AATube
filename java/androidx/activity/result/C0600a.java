package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p023I0.C0205c;

/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0600a implements Parcelable {
    public static final Parcelable.Creator<C0600a> CREATOR = new C0205c(10);

    /* renamed from: a */
    public final int f1703a;

    /* renamed from: b */
    public final Intent f1704b;

    public C0600a(int r12, Intent intent) {
        this.f1703a = r12;
        this.f1704b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int r2 = this.f1703a;
        sb.append(r2 != -1 ? r2 != 0 ? String.valueOf(r2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1704b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        parcel.writeInt(this.f1703a);
        Intent intent = this.f1704b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, r4);
        }
    }

    public C0600a(Parcel parcel) {
        this.f1703a = parcel.readInt();
        this.f1704b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
