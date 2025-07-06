package p054S1;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0081m;
import p051R1.AbstractC0482l;
import p051R1.AbstractC0490t;
import p051R1.C0469F;
import p051R1.C0474d;
import p051R1.C0477g;
import p051R1.C0487q;
import p051R1.C0488r;
import p051R1.C0492v;
import p051R1.InterfaceC0467D;
import p081e1.C0879e;
import p105l1.C2632c;
import p105l1.C2634e;
import p124s0.C2738i;

/* renamed from: S1.f */
/* loaded from: classes.dex */
public final class C0507f extends AbstractC0482l {

    /* renamed from: f */
    public static final C0492v f1303f;

    /* renamed from: c */
    public final ClassLoader f1304c;

    /* renamed from: d */
    public final AbstractC0482l f1305d;

    /* renamed from: e */
    public final C2634e f1306e;

    static {
        String str = C0492v.f1244b;
        f1303f = C2738i.m5333f("/", false);
    }

    public C0507f(ClassLoader classLoader) {
        C0488r systemFileSystem = AbstractC0482l.f1225a;
        AbstractC2492i.m4915e(systemFileSystem, "systemFileSystem");
        this.f1304c = classLoader;
        this.f1305d = systemFileSystem;
        this.f1306e = new C2634e(new C0081m(5, this));
    }

    @Override // p051R1.AbstractC0482l
    /* renamed from: a */
    public final C0487q mo1241a(C0492v c0492v) {
        if (!C0879e.m2393d(c0492v)) {
            throw new FileNotFoundException("file not found: " + c0492v);
        }
        C0492v c0492v2 = f1303f;
        c0492v2.getClass();
        String m1279o = AbstractC0504c.m1319b(c0492v2, c0492v, true).m1285b(c0492v2).f1245a.m1279o();
        for (C2632c c2632c : (List) this.f1306e.m5093a()) {
            AbstractC0482l abstractC0482l = (AbstractC0482l) c2632c.f8550a;
            C0492v c0492v3 = (C0492v) c2632c.f8551b;
            try {
                c0492v3.getClass();
                C0477g c0477g = new C0477g();
                c0477g.m1249D(m1279o);
                return abstractC0482l.mo1241a(AbstractC0504c.m1319b(c0492v3, AbstractC0504c.m1321d(c0477g, false), false));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c0492v);
    }

    @Override // p051R1.AbstractC0482l
    /* renamed from: b */
    public final InterfaceC0467D mo1242b(C0492v file) {
        AbstractC2492i.m4915e(file, "file");
        if (!C0879e.m2393d(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        C0492v c0492v = f1303f;
        c0492v.getClass();
        URL resource = this.f1304c.getResource(AbstractC0504c.m1319b(c0492v, file, false).m1285b(c0492v).f1245a.m1279o());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        AbstractC2492i.m4914d(inputStream, "getInputStream(...)");
        Logger logger = AbstractC0490t.f1242a;
        return new C0474d(inputStream, 1, new C0469F());
    }
}
