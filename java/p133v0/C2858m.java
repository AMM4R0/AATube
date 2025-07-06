package p133v0;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import p001A0.AbstractC0005b;
import p103k0.AbstractC2480a;
import p124s0.C2731b;
import p124s0.C2733d;

/* renamed from: v0.m */
/* loaded from: classes.dex */
public final class C2858m implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f9440a;

    public /* synthetic */ C2858m(int r12) {
        this.f9440a = r12;
    }

    /* renamed from: a */
    public static void m5466a(C2849d c2849d, Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        int r12 = c2849d.f9401a;
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(r12);
        AbstractC0005b.m61a0(parcel, 2, 4);
        parcel.writeInt(c2849d.f9402b);
        AbstractC0005b.m61a0(parcel, 3, 4);
        parcel.writeInt(c2849d.f9403c);
        AbstractC0005b.m56V(parcel, 4, c2849d.f9404d);
        IBinder iBinder = c2849d.f9405e;
        if (iBinder != null) {
            int m59Y2 = AbstractC0005b.m59Y(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC0005b.m60Z(parcel, m59Y2);
        }
        AbstractC0005b.m57W(parcel, 6, c2849d.f9406f, r6);
        Bundle bundle = c2849d.f9407g;
        if (bundle != null) {
            int m59Y3 = AbstractC0005b.m59Y(parcel, 7);
            parcel.writeBundle(bundle);
            AbstractC0005b.m60Z(parcel, m59Y3);
        }
        AbstractC0005b.m55U(parcel, 8, c2849d.f9408h, r6);
        AbstractC0005b.m57W(parcel, 10, c2849d.f9409i, r6);
        AbstractC0005b.m57W(parcel, 11, c2849d.f9410j, r6);
        AbstractC0005b.m61a0(parcel, 12, 4);
        parcel.writeInt(c2849d.f9411k ? 1 : 0);
        AbstractC0005b.m61a0(parcel, 13, 4);
        parcel.writeInt(c2849d.f9412l);
        boolean z2 = c2849d.f9413m;
        AbstractC0005b.m61a0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC0005b.m56V(parcel, 15, c2849d.f9414n);
        AbstractC0005b.m60Z(parcel, m59Y);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9440a) {
            case 0:
                int m4879V = AbstractC2480a.m4879V(parcel);
                int r9 = 0;
                int r10 = 0;
                int r11 = 0;
                int r18 = 0;
                long j2 = 0;
                long j3 = 0;
                String str = null;
                String str2 = null;
                int r19 = -1;
                while (parcel.dataPosition() < m4879V) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            r9 = AbstractC2480a.m4874O(parcel, readInt);
                            break;
                        case 2:
                            r10 = AbstractC2480a.m4874O(parcel, readInt);
                            break;
                        case 3:
                            r11 = AbstractC2480a.m4874O(parcel, readInt);
                            break;
                        case 4:
                            AbstractC2480a.m4880W(parcel, readInt, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            AbstractC2480a.m4880W(parcel, readInt, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            str = AbstractC2480a.m4887i(parcel, readInt);
                            break;
                        case 7:
                            str2 = AbstractC2480a.m4887i(parcel, readInt);
                            break;
                        case '\b':
                            r18 = AbstractC2480a.m4874O(parcel, readInt);
                            break;
                        case '\t':
                            r19 = AbstractC2480a.m4874O(parcel, readInt);
                            break;
                        default:
                            AbstractC2480a.m4878T(parcel, readInt);
                            break;
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V);
                return new C2851f(r9, r10, r11, j2, j3, str, str2, r18, r19);
            case 1:
                int m4879V2 = AbstractC2480a.m4879V(parcel);
                int r3 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int r4 = 0;
                while (parcel.dataPosition() < m4879V2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        r3 = AbstractC2480a.m4874O(parcel, readInt2);
                    } else if (c == 2) {
                        account = (Account) AbstractC2480a.m4886h(parcel, readInt2, Account.CREATOR);
                    } else if (c == 3) {
                        r4 = AbstractC2480a.m4874O(parcel, readInt2);
                    } else if (c != 4) {
                        AbstractC2480a.m4878T(parcel, readInt2);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC2480a.m4886h(parcel, readInt2, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V2);
                return new C2859n(r3, account, r4, googleSignInAccount);
            case 2:
                int m4879V3 = AbstractC2480a.m4879V(parcel);
                int r6 = 0;
                boolean z2 = false;
                boolean z3 = false;
                IBinder iBinder = null;
                C2731b c2731b = null;
                while (parcel.dataPosition() < m4879V3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        r6 = AbstractC2480a.m4874O(parcel, readInt3);
                    } else if (c2 == 2) {
                        int m4875P = AbstractC2480a.m4875P(parcel, readInt3);
                        int dataPosition = parcel.dataPosition();
                        if (m4875P == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition + m4875P);
                        }
                    } else if (c2 == 3) {
                        c2731b = (C2731b) AbstractC2480a.m4886h(parcel, readInt3, C2731b.CREATOR);
                    } else if (c2 == 4) {
                        z2 = AbstractC2480a.m4872M(parcel, readInt3);
                    } else if (c2 != 5) {
                        AbstractC2480a.m4878T(parcel, readInt3);
                    } else {
                        z3 = AbstractC2480a.m4872M(parcel, readInt3);
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V3);
                return new C2860o(r6, iBinder, c2731b, z2, z3);
            case 3:
                int m4879V4 = AbstractC2480a.m4879V(parcel);
                int r5 = 0;
                boolean z4 = false;
                boolean z5 = false;
                int r8 = 0;
                int r92 = 0;
                while (parcel.dataPosition() < m4879V4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        r5 = AbstractC2480a.m4874O(parcel, readInt4);
                    } else if (c3 == 2) {
                        z4 = AbstractC2480a.m4872M(parcel, readInt4);
                    } else if (c3 == 3) {
                        z5 = AbstractC2480a.m4872M(parcel, readInt4);
                    } else if (c3 == 4) {
                        r8 = AbstractC2480a.m4874O(parcel, readInt4);
                    } else if (c3 != 5) {
                        AbstractC2480a.m4878T(parcel, readInt4);
                    } else {
                        r92 = AbstractC2480a.m4874O(parcel, readInt4);
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V4);
                return new C2853h(r5, z4, z5, r8, r92);
            case 4:
                int m4879V5 = AbstractC2480a.m4879V(parcel);
                int r42 = 0;
                Bundle bundle = null;
                C2733d[] c2733dArr = null;
                C2848c c2848c = null;
                while (parcel.dataPosition() < m4879V5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        int m4875P2 = AbstractC2480a.m4875P(parcel, readInt5);
                        int dataPosition2 = parcel.dataPosition();
                        if (m4875P2 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition2 + m4875P2);
                            bundle = readBundle;
                        }
                    } else if (c4 == 2) {
                        c2733dArr = (C2733d[]) AbstractC2480a.m4888j(parcel, readInt5, C2733d.CREATOR);
                    } else if (c4 == 3) {
                        r42 = AbstractC2480a.m4874O(parcel, readInt5);
                    } else if (c4 != 4) {
                        AbstractC2480a.m4878T(parcel, readInt5);
                    } else {
                        c2848c = (C2848c) AbstractC2480a.m4886h(parcel, readInt5, C2848c.CREATOR);
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V5);
                C2869x c2869x = new C2869x();
                c2869x.f9468a = bundle;
                c2869x.f9469b = c2733dArr;
                c2869x.f9470c = r42;
                c2869x.f9471d = c2848c;
                return c2869x;
            case 5:
                int m4879V6 = AbstractC2480a.m4879V(parcel);
                C2853h c2853h = null;
                int[] r93 = null;
                int[] r112 = null;
                boolean z6 = false;
                boolean z7 = false;
                int r102 = 0;
                while (parcel.dataPosition() < m4879V6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            c2853h = (C2853h) AbstractC2480a.m4886h(parcel, readInt6, C2853h.CREATOR);
                            break;
                        case 2:
                            z6 = AbstractC2480a.m4872M(parcel, readInt6);
                            break;
                        case 3:
                            z7 = AbstractC2480a.m4872M(parcel, readInt6);
                            break;
                        case 4:
                            int m4875P3 = AbstractC2480a.m4875P(parcel, readInt6);
                            int dataPosition3 = parcel.dataPosition();
                            if (m4875P3 != 0) {
                                r93 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + m4875P3);
                                break;
                            } else {
                                r93 = null;
                                break;
                            }
                        case 5:
                            r102 = AbstractC2480a.m4874O(parcel, readInt6);
                            break;
                        case 6:
                            int m4875P4 = AbstractC2480a.m4875P(parcel, readInt6);
                            int dataPosition4 = parcel.dataPosition();
                            if (m4875P4 != 0) {
                                r112 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + m4875P4);
                                break;
                            } else {
                                r112 = null;
                                break;
                            }
                        default:
                            AbstractC2480a.m4878T(parcel, readInt6);
                            break;
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V6);
                return new C2848c(c2853h, z6, z7, r93, r102, r112);
            default:
                int m4879V7 = AbstractC2480a.m4879V(parcel);
                int r62 = 0;
                int r7 = 0;
                int r82 = 0;
                boolean z8 = false;
                int r17 = 0;
                boolean z9 = false;
                String str3 = null;
                IBinder iBinder2 = null;
                Scope[] scopeArr = null;
                Bundle bundle2 = null;
                Account account2 = null;
                C2733d[] c2733dArr2 = null;
                C2733d[] c2733dArr3 = null;
                String str4 = null;
                while (parcel.dataPosition() < m4879V7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            r62 = AbstractC2480a.m4874O(parcel, readInt7);
                            break;
                        case 2:
                            r7 = AbstractC2480a.m4874O(parcel, readInt7);
                            break;
                        case 3:
                            r82 = AbstractC2480a.m4874O(parcel, readInt7);
                            break;
                        case 4:
                            str3 = AbstractC2480a.m4887i(parcel, readInt7);
                            break;
                        case 5:
                            int m4875P5 = AbstractC2480a.m4875P(parcel, readInt7);
                            int dataPosition5 = parcel.dataPosition();
                            if (m4875P5 != 0) {
                                iBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition5 + m4875P5);
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) AbstractC2480a.m4888j(parcel, readInt7, Scope.CREATOR);
                            break;
                        case 7:
                            int m4875P6 = AbstractC2480a.m4875P(parcel, readInt7);
                            int dataPosition6 = parcel.dataPosition();
                            if (m4875P6 != 0) {
                                bundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition6 + m4875P6);
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) AbstractC2480a.m4886h(parcel, readInt7, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC2480a.m4878T(parcel, readInt7);
                            break;
                        case '\n':
                            c2733dArr2 = (C2733d[]) AbstractC2480a.m4888j(parcel, readInt7, C2733d.CREATOR);
                            break;
                        case 11:
                            c2733dArr3 = (C2733d[]) AbstractC2480a.m4888j(parcel, readInt7, C2733d.CREATOR);
                            break;
                        case '\f':
                            z8 = AbstractC2480a.m4872M(parcel, readInt7);
                            break;
                        case '\r':
                            r17 = AbstractC2480a.m4874O(parcel, readInt7);
                            break;
                        case 14:
                            z9 = AbstractC2480a.m4872M(parcel, readInt7);
                            break;
                        case 15:
                            str4 = AbstractC2480a.m4887i(parcel, readInt7);
                            break;
                    }
                }
                AbstractC2480a.m4889k(parcel, m4879V7);
                return new C2849d(r62, r7, r82, str3, iBinder2, scopeArr, bundle2, account2, c2733dArr2, c2733dArr3, z8, r17, z9, str4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r2) {
        switch (this.f9440a) {
            case 0:
                return new C2851f[r2];
            case 1:
                return new C2859n[r2];
            case 2:
                return new C2860o[r2];
            case 3:
                return new C2853h[r2];
            case 4:
                return new C2869x[r2];
            case 5:
                return new C2848c[r2];
            default:
                return new C2849d[r2];
        }
    }
}
