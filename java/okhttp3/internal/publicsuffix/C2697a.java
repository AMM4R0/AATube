package okhttp3.internal.publicsuffix;

import android.support.v4.media.session.AbstractC0580g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0008a;
import p002A1.AbstractC0017j;
import p036M1.C0389o;
import p051R1.AbstractC0482l;
import p051R1.C0485o;
import p051R1.C0492v;
import p051R1.C0494x;
import p054S1.C0507f;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2659i;
import p108m1.C2666p;
import p108m1.C2668r;
import p124s0.C2738i;
import p145z1.C2919b;
import p145z1.InterfaceC2920c;

/* renamed from: okhttp3.internal.publicsuffix.a */
/* loaded from: classes.dex */
public final class C2697a {

    /* renamed from: g */
    public static final C0492v f8693g;

    /* renamed from: h */
    public static final byte[] f8694h;

    /* renamed from: i */
    public static final List f8695i;

    /* renamed from: j */
    public static final C2697a f8696j;

    /* renamed from: a */
    public final C0492v f8697a;

    /* renamed from: b */
    public final AbstractC0482l f8698b;

    /* renamed from: c */
    public final AtomicBoolean f8699c;

    /* renamed from: d */
    public final CountDownLatch f8700d;

    /* renamed from: e */
    public byte[] f8701e;

    /* renamed from: f */
    public byte[] f8702f;

    static {
        String str = C0492v.f1244b;
        f8693g = C2738i.m5333f("/okhttp3/internal/publicsuffix/" + C2697a.class.getSimpleName() + ".gz", false);
        f8694h = new byte[]{42};
        f8695i = AbstractC2480a.m4863D("*");
        f8696j = new C2697a();
    }

    public C2697a() {
        C0507f fileSystem = AbstractC0482l.f1226b;
        C0492v path = f8693g;
        AbstractC2492i.m4915e(path, "path");
        AbstractC2492i.m4915e(fileSystem, "fileSystem");
        this.f8697a = path;
        this.f8698b = fileSystem;
        this.f8699c = new AtomicBoolean(false);
        this.f8700d = new CountDownLatch(1);
    }

    /* renamed from: c */
    public static List m5187c(String str) {
        List m144V = AbstractC0017j.m144V(str, new char[]{'.'});
        if (m144V.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!AbstractC2492i.m4911a(m144V.get(m144V.size() - 1), "")) {
            return m144V;
        }
        int size = m144V.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m13h("Requested element count ", size, " is less than zero.").toString());
        }
        C2668r c2668r = C2668r.f8607a;
        if (size == 0) {
            return c2668r;
        }
        if (size >= m144V.size()) {
            return AbstractC2659i.m5118h0(m144V);
        }
        if (size == 1) {
            if (m144V.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC2480a.m4863D(m144V.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = m144V.iterator();
        int r5 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            r5++;
            if (r5 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : AbstractC2480a.m4863D(arrayList.get(0)) : c2668r;
    }

    /* renamed from: a */
    public final String m5188a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        int r02 = 0;
        String unicode = IDN.toUnicode(str);
        AbstractC2492i.m4912b(unicode);
        List m5187c = m5187c(unicode);
        if (this.f8699c.get() || !this.f8699c.compareAndSet(false, true)) {
            try {
                this.f8700d.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        m5189b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e2) {
                        C0389o c0389o = C0389o.f1050a;
                        C0389o.f1050a.getClass();
                        C0389o.m1140i("Failed to read public suffix list", 5, e2);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f8701e == null) {
            throw new IllegalStateException(("Unable to load " + f8693g + " resource from the classpath.").toString());
        }
        int size3 = m5187c.size();
        byte[][] bArr = new byte[size3][];
        for (int r5 = 0; r5 < size3; r5++) {
            byte[] bytes = ((String) m5187c.get(r5)).getBytes(AbstractC0008a.f6a);
            AbstractC2492i.m4914d(bytes, "getBytes(...)");
            bArr[r5] = bytes;
        }
        int r52 = 0;
        while (true) {
            if (r52 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f8701e;
            if (bArr2 == null) {
                AbstractC2492i.m4918h("publicSuffixListBytes");
                throw null;
            }
            str2 = C2738i.m5330a(bArr2, bArr, r52);
            if (str2 != null) {
                break;
            }
            r52++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int r10 = 0; r10 < length; r10++) {
                bArr3[r10] = f8694h;
                byte[] bArr4 = this.f8701e;
                if (bArr4 == null) {
                    AbstractC2492i.m4918h("publicSuffixListBytes");
                    throw null;
                }
                str3 = C2738i.m5330a(bArr4, bArr3, r10);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int r3 = size3 - 1;
            for (int r53 = 0; r53 < r3; r53++) {
                byte[] bArr5 = this.f8702f;
                if (bArr5 == null) {
                    AbstractC2492i.m4918h("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = C2738i.m5330a(bArr5, bArr, r53);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = AbstractC0017j.m144V("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f8695i;
        } else {
            List list2 = C2668r.f8607a;
            List m144V = str2 != null ? AbstractC0017j.m144V(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = AbstractC0017j.m144V(str3, new char[]{'.'});
            }
            list = m144V.size() > list2.size() ? m144V : list2;
        }
        if (m5187c.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = m5187c.size();
            size2 = list.size();
        } else {
            size = m5187c.size();
            size2 = list.size() + 1;
        }
        int r2 = size - size2;
        InterfaceC2920c c2666p = new C2666p(0, m5187c(str));
        if (r2 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m13h("Requested element count ", r2, " is less than zero.").toString());
        }
        if (r2 != 0) {
            c2666p = new C2919b(c2666p, r2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c2666p) {
            r02++;
            if (r02 > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC0580g.m1441e(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: b */
    public final void m5189b() {
        try {
            C0494x c0494x = new C0494x(new C0485o(this.f8698b.mo1242b(this.f8697a)));
            try {
                long m1294j = c0494x.m1294j();
                c0494x.m1302r(m1294j);
                byte[] m1260l = c0494x.f1250b.m1260l(m1294j);
                long m1294j2 = c0494x.m1294j();
                c0494x.m1302r(m1294j2);
                byte[] m1260l2 = c0494x.f1250b.m1260l(m1294j2);
                c0494x.close();
                synchronized (this) {
                    this.f8701e = m1260l;
                    this.f8702f = m1260l2;
                }
            } finally {
            }
        } finally {
            this.f8700d.countDown();
        }
    }
}
