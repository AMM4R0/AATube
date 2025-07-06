package p051R1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p054S1.AbstractC0503b;
import p054S1.AbstractC0504c;
import p054S1.C0506e;
import p054S1.C0508g;
import p124s0.C2738i;

/* renamed from: R1.G */
/* loaded from: classes.dex */
public final class C0470G extends AbstractC0482l {

    /* renamed from: f */
    public static final C0492v f1195f;

    /* renamed from: c */
    public final C0492v f1196c;

    /* renamed from: d */
    public final AbstractC0482l f1197d;

    /* renamed from: e */
    public final LinkedHashMap f1198e;

    static {
        String str = C0492v.f1244b;
        f1195f = C2738i.m5333f("/", false);
    }

    public C0470G(C0492v c0492v, AbstractC0482l abstractC0482l, LinkedHashMap linkedHashMap) {
        this.f1196c = c0492v;
        this.f1197d = abstractC0482l;
        this.f1198e = linkedHashMap;
    }

    @Override // p051R1.AbstractC0482l
    /* renamed from: a */
    public final C0487q mo1241a(C0492v c0492v) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // p051R1.AbstractC0482l
    /* renamed from: b */
    public final InterfaceC0467D mo1242b(C0492v file) {
        AbstractC2492i.m4915e(file, "file");
        C0492v c0492v = f1195f;
        c0492v.getClass();
        C0508g c0508g = (C0508g) this.f1198e.get(AbstractC0504c.m1319b(c0492v, file, true));
        if (c0508g == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        C0487q mo1241a = this.f1197d.mo1241a(this.f1196c);
        C0494x th = null;
        try {
            C0494x c0494x = new C0494x(mo1241a.m1283g(c0508g.f1311e));
            try {
                mo1241a.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = c0494x;
        } catch (Throwable th3) {
            th = th3;
            if (mo1241a != null) {
                try {
                    mo1241a.close();
                } catch (Throwable th4) {
                    AbstractC0005b.m63f(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        AbstractC2492i.m4915e(th, "<this>");
        int m1295k = th.m1295k();
        if (m1295k != 67324752) {
            throw new IOException("bad zip: expected " + AbstractC0503b.m1314c(67324752) + " but was " + AbstractC0503b.m1314c(m1295k));
        }
        th.m1303s(2L);
        short m1298n = th.m1298n();
        int r4 = m1298n & 65535;
        if ((m1298n & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + AbstractC0503b.m1314c(r4));
        }
        th.m1303s(18L);
        int m1298n2 = th.m1298n() & 65535;
        th.m1303s(th.m1298n() & 65535);
        th.m1303s(m1298n2);
        int r9 = c0508g.f1310d;
        long j2 = c0508g.f1309c;
        if (r9 == 0) {
            return new C0506e(th, j2, true);
        }
        return new C0506e(new C0486p(new C0494x(new C0506e(th, c0508g.f1308b, true)), new Inflater(true)), j2, false);
    }
}
