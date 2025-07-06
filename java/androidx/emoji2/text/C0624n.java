package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p008C1.C0080l;
import p057U.C0523a;
import p057U.C0524b;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C0624n {

    /* renamed from: d */
    public static final ThreadLocal f2084d = new ThreadLocal();

    /* renamed from: a */
    public final int f2085a;

    /* renamed from: b */
    public final C0080l f2086b;

    /* renamed from: c */
    public volatile int f2087c = 0;

    public C0624n(C0080l c0080l, int r3) {
        this.f2086b = c0080l;
        this.f2085a = r3;
    }

    /* renamed from: a */
    public final int m1635a(int r4) {
        C0523a m1637c = m1637c();
        int m689a = m1637c.m689a(16);
        if (m689a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) m1637c.f833d;
        int r12 = m689a + m1637c.f830a;
        return byteBuffer.getInt((r4 * 4) + byteBuffer.getInt(r12) + r12 + 4);
    }

    /* renamed from: b */
    public final int m1636b() {
        C0523a m1637c = m1637c();
        int m689a = m1637c.m689a(16);
        if (m689a == 0) {
            return 0;
        }
        int r12 = m689a + m1637c.f830a;
        return ((ByteBuffer) m1637c.f833d).getInt(((ByteBuffer) m1637c.f833d).getInt(r12) + r12);
    }

    /* renamed from: c */
    public final C0523a m1637c() {
        ThreadLocal threadLocal = f2084d;
        C0523a c0523a = (C0523a) threadLocal.get();
        if (c0523a == null) {
            c0523a = new C0523a();
            threadLocal.set(c0523a);
        }
        C0524b c0524b = (C0524b) this.f2086b.f219a;
        int m689a = c0524b.m689a(6);
        if (m689a != 0) {
            int r2 = m689a + c0524b.f830a;
            int r22 = (this.f2085a * 4) + ((ByteBuffer) c0524b.f833d).getInt(r2) + r2 + 4;
            int r3 = ((ByteBuffer) c0524b.f833d).getInt(r22) + r22;
            ByteBuffer byteBuffer = (ByteBuffer) c0524b.f833d;
            c0523a.f833d = byteBuffer;
            if (byteBuffer != null) {
                c0523a.f830a = r3;
                int r32 = r3 - byteBuffer.getInt(r3);
                c0523a.f831b = r32;
                c0523a.f832c = ((ByteBuffer) c0523a.f833d).getShort(r32);
            } else {
                c0523a.f830a = 0;
                c0523a.f831b = 0;
                c0523a.f832c = 0;
            }
        }
        return c0523a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0523a m1637c = m1637c();
        int m689a = m1637c.m689a(4);
        sb.append(Integer.toHexString(m689a != 0 ? ((ByteBuffer) m1637c.f833d).getInt(m689a + m1637c.f830a) : 0));
        sb.append(", codepoints:");
        int m1636b = m1636b();
        for (int r3 = 0; r3 < m1636b; r3++) {
            sb.append(Integer.toHexString(m1635a(r3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
