package p124s0;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p004B0.BinderC0045a;
import p015F0.AbstractBinderC0130a;
import p015F0.AbstractC0131b;
import p133v0.InterfaceC2845E;

/* renamed from: s0.m */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2742m extends AbstractBinderC0130a implements InterfaceC2845E {

    /* renamed from: c */
    public final int f8999c;

    public AbstractBinderC2742m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f8999c = Arrays.hashCode(bArr);
    }

    /* renamed from: e */
    public static byte[] m5338e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p015F0.AbstractBinderC0130a
    /* renamed from: d */
    public final boolean mo424d(int r2, Parcel parcel, Parcel parcel2) {
        if (r2 == 1) {
            BinderC0045a binderC0045a = new BinderC0045a(mo5337f());
            parcel2.writeNoException();
            int r22 = AbstractC0131b.f379a;
            parcel2.writeStrongBinder(binderC0045a);
        } else {
            if (r2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f8999c);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC2845E)) {
            try {
                InterfaceC2845E interfaceC2845E = (InterfaceC2845E) obj;
                if (((AbstractBinderC2742m) interfaceC2845E).f8999c != this.f8999c) {
                    return false;
                }
                return Arrays.equals(mo5337f(), new BinderC0045a(((AbstractBinderC2742m) interfaceC2845E).mo5337f()).f86c);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract byte[] mo5337f();

    public final int hashCode() {
        return this.f8999c;
    }
}
