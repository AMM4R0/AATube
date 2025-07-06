package p027J1;

import p008C1.C0083o;
import p011D1.AbstractC0122i;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.InterfaceC0467D;

/* renamed from: J1.z */
/* loaded from: classes.dex */
public final class C0266z implements InterfaceC0467D {

    /* renamed from: a */
    public final long f820a;

    /* renamed from: b */
    public boolean f821b;

    /* renamed from: c */
    public final C0477g f822c = new C0477g();

    /* renamed from: d */
    public final C0477g f823d = new C0477g();

    /* renamed from: e */
    public C0083o f824e;

    /* renamed from: f */
    public boolean f825f;

    /* renamed from: g */
    public final /* synthetic */ C0234B f826g;

    public C0266z(C0234B c0234b, long j2, boolean z2) {
        this.f826g = c0234b;
        this.f820a = j2;
        this.f821b = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0014, B:8:0x0021, B:13:0x002b, B:33:0x00b2, B:60:0x00da, B:61:0x00df, B:15:0x0034, B:17:0x003a, B:19:0x003e, B:21:0x0042, B:22:0x0053, B:24:0x0057, B:26:0x0061, B:28:0x007e, B:30:0x008d, B:46:0x00a3, B:49:0x00a9, B:53:0x00d0, B:54:0x00d7), top: B:5:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:15:0x0034, B:17:0x003a, B:19:0x003e, B:21:0x0042, B:22:0x0053, B:24:0x0057, B:26:0x0061, B:28:0x007e, B:30:0x008d, B:46:0x00a3, B:49:0x00a9, B:53:0x00d0, B:54:0x00d7), top: B:14:0x0034, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0 A[SYNTHETIC] */
    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo390a(p051R1.C0477g r24, long r25) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0266z.mo390a(R1.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        C0234B c0234b = this.f826g;
        synchronized (c0234b) {
            this.f825f = true;
            C0477g c0477g = this.f823d;
            j2 = c0477g.f1217b;
            c0477g.m1268t(j2);
            c0234b.notifyAll();
        }
        if (j2 > 0) {
            C0083o c0083o = AbstractC0122i.f368a;
            this.f826g.f677b.m676l(j2);
        }
        this.f826g.m630a();
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f826g.f685j;
    }
}
