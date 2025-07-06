package p073c0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: c0.l */
/* loaded from: classes.dex */
public final class C0736l {

    /* renamed from: a */
    public final int f2646a;

    /* renamed from: b */
    public final int f2647b;

    /* renamed from: c */
    public final long f2648c;

    /* renamed from: d */
    public final long f2649d;

    public C0736l(int r12, int r2, long j2, long j3) {
        this.f2646a = r12;
        this.f2647b = r2;
        this.f2648c = j2;
        this.f2649d = j3;
    }

    /* renamed from: a */
    public static C0736l m2012a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0736l c0736l = new C0736l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0736l;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2013b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2646a);
            dataOutputStream.writeInt(this.f2647b);
            dataOutputStream.writeLong(this.f2648c);
            dataOutputStream.writeLong(this.f2649d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0736l)) {
            return false;
        }
        C0736l c0736l = (C0736l) obj;
        return this.f2647b == c0736l.f2647b && this.f2648c == c0736l.f2648c && this.f2646a == c0736l.f2646a && this.f2649d == c0736l.f2649d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2647b), Long.valueOf(this.f2648c), Integer.valueOf(this.f2646a), Long.valueOf(this.f2649d));
    }
}
