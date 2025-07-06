package p010D0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import p026J0.C0224e;
import p026J0.C0232m;
import p116p0.C2706a;
import p116p0.C2707b;
import p127t0.C2767d;

/* renamed from: D0.i */
/* loaded from: classes.dex */
public final class BinderC0111i extends Binder implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f341a = 1;

    /* renamed from: c */
    public final Object f342c;

    public BinderC0111i(C0224e c0224e) {
        this.f342c = c0224e;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int r02 = this.f341a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        switch (this.f341a) {
            case 0:
                if (r4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(r4, parcel, parcel2, r7)) {
                    return true;
                }
                if (r4 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int r6 = AbstractC0103a.f329a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                C2707b createFromParcel2 = parcel.readInt() == 0 ? null : C2707b.CREATOR.createFromParcel(parcel);
                C2706a c2706a = createFromParcel2 != null ? new C2706a(createFromParcel2.f8725a, createFromParcel2.f8726b) : null;
                int r5 = createFromParcel.f2694b;
                C0232m c0232m = ((C0224e) this.f342c).f652a;
                if (r5 <= 0) {
                    c0232m.m626f(c2706a);
                    return true;
                }
                c0232m.m625e(new C2767d(createFromParcel));
                return true;
            default:
                if (r4 >= 1 && r4 <= 16777215) {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                }
                if (r4 == 1598968902) {
                    parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                    return true;
                }
                switch (r4) {
                    case 1:
                        parcel.readString();
                        if (((WeakReference) this.f342c).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 2:
                        throw new AssertionError();
                    case 3:
                        if (((WeakReference) this.f342c).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 4:
                        throw new AssertionError();
                    case 5:
                        parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                        throw new AssertionError();
                    case 6:
                        throw new AssertionError();
                    case 7:
                        throw new AssertionError();
                    case 8:
                        throw new AssertionError();
                    case 9:
                        parcel.readInt();
                        if (((WeakReference) this.f342c).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 10:
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.readInt();
                        if (((WeakReference) this.f342c).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 12:
                        parcel.readInt();
                        if (((WeakReference) this.f342c).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 13:
                        if (((WeakReference) this.f342c).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    default:
                        return super.onTransact(r4, parcel, parcel2, r7);
                }
        }
    }

    public BinderC0111i() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f342c = new WeakReference(null);
    }
}
