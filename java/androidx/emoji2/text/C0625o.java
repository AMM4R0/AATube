package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p057U.C0523a;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C0625o {

    /* renamed from: a */
    public int f2088a = 1;

    /* renamed from: b */
    public final C0628r f2089b;

    /* renamed from: c */
    public C0628r f2090c;

    /* renamed from: d */
    public C0628r f2091d;

    /* renamed from: e */
    public int f2092e;

    /* renamed from: f */
    public int f2093f;

    public C0625o(C0628r c0628r) {
        this.f2089b = c0628r;
        this.f2090c = c0628r;
    }

    /* renamed from: a */
    public final int m1638a(int r5) {
        SparseArray sparseArray = this.f2090c.f2103a;
        C0628r c0628r = sparseArray == null ? null : (C0628r) sparseArray.get(r5);
        int r2 = 1;
        int r3 = 2;
        if (this.f2088a == 2) {
            if (c0628r != null) {
                this.f2090c = c0628r;
                this.f2093f++;
            } else if (r5 == 65038) {
                m1639b();
            } else if (r5 != 65039) {
                C0628r c0628r2 = this.f2090c;
                if (c0628r2.f2104b != null) {
                    r3 = 3;
                    if (this.f2093f != 1) {
                        this.f2091d = c0628r2;
                        m1639b();
                    } else if (m1640c()) {
                        this.f2091d = this.f2090c;
                        m1639b();
                    } else {
                        m1639b();
                    }
                } else {
                    m1639b();
                }
            }
            r2 = r3;
        } else if (c0628r == null) {
            m1639b();
        } else {
            this.f2088a = 2;
            this.f2090c = c0628r;
            this.f2093f = 1;
            r2 = r3;
        }
        this.f2092e = r5;
        return r2;
    }

    /* renamed from: b */
    public final void m1639b() {
        this.f2088a = 1;
        this.f2090c = this.f2089b;
        this.f2093f = 0;
    }

    /* renamed from: c */
    public final boolean m1640c() {
        C0523a m1637c = this.f2090c.f2104b.m1637c();
        int m689a = m1637c.m689a(6);
        return !(m689a == 0 || ((ByteBuffer) m1637c.f833d).get(m689a + m1637c.f830a) == 0) || this.f2092e == 65039;
    }
}
