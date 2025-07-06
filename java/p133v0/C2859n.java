package p133v0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p001A0.AbstractC0005b;
import p136w0.AbstractC2877a;

/* renamed from: v0.n */
/* loaded from: classes.dex */
public final class C2859n extends AbstractC2877a {
    public static final Parcelable.Creator<C2859n> CREATOR = new C2858m(1);

    /* renamed from: a */
    public final int f9441a;

    /* renamed from: b */
    public final Account f9442b;

    /* renamed from: c */
    public final int f9443c;

    /* renamed from: d */
    public final GoogleSignInAccount f9444d;

    public C2859n(int r12, Account account, int r3, GoogleSignInAccount googleSignInAccount) {
        this.f9441a = r12;
        this.f9442b = account;
        this.f9443c = r3;
        this.f9444d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f9441a);
        AbstractC0005b.m55U(parcel, 2, this.f9442b, r6);
        AbstractC0005b.m61a0(parcel, 3, 4);
        parcel.writeInt(this.f9443c);
        AbstractC0005b.m55U(parcel, 4, this.f9444d, r6);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
