package p051R1;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0008a;
import p036M1.AbstractC0379e;
import p054S1.AbstractC0503b;
import p108m1.AbstractC2658h;

/* renamed from: R1.j */
/* loaded from: classes.dex */
public class C0480j implements Serializable, Comparable {

    /* renamed from: d */
    public static final C0480j f1218d = new C0480j(new byte[0]);

    /* renamed from: a */
    public final byte[] f1219a;

    /* renamed from: b */
    public transient int f1220b;

    /* renamed from: c */
    public transient String f1221c;

    public C0480j(byte[] data) {
        AbstractC2492i.m4915e(data, "data");
        this.f1219a = data;
    }

    /* renamed from: e */
    public static int m1275e(C0480j c0480j, C0480j other) {
        c0480j.getClass();
        AbstractC2492i.m4915e(other, "other");
        return c0480j.mo1222d(0, other.f1219a);
    }

    /* renamed from: i */
    public static int m1276i(C0480j c0480j, C0480j other) {
        c0480j.getClass();
        AbstractC2492i.m4915e(other, "other");
        return c0480j.mo1225h(-1234567890, other.f1219a);
    }

    /* renamed from: m */
    public static /* synthetic */ C0480j m1277m(C0480j c0480j, int r2, int r3, int r4) {
        if ((r4 & 1) != 0) {
            r2 = 0;
        }
        if ((r4 & 2) != 0) {
            r3 = -1234567890;
        }
        return c0480j.mo1228l(r2, r3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(p051R1.C0480j r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r10, r0)
            int r0 = r9.mo1220b()
            int r1 = r10.mo1220b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.mo1224g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo1224g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p051R1.C0480j.compareTo(R1.j):int");
    }

    /* renamed from: b */
    public int mo1220b() {
        return this.f1219a.length;
    }

    /* renamed from: c */
    public String mo1221c() {
        byte[] bArr = this.f1219a;
        char[] cArr = new char[bArr.length * 2];
        int r4 = 0;
        for (byte b2 : bArr) {
            int r6 = r4 + 1;
            char[] cArr2 = AbstractC0503b.f1292a;
            cArr[r4] = cArr2[(b2 >> 4) & 15];
            r4 += 2;
            cArr[r6] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public int mo1222d(int r5, byte[] other) {
        AbstractC2492i.m4915e(other, "other");
        byte[] bArr = this.f1219a;
        int length = bArr.length - other.length;
        int max = Math.max(r5, 0);
        if (max <= length) {
            while (!AbstractC0379e.m1070a(max, 0, other.length, bArr, other)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0480j) {
            C0480j c0480j = (C0480j) obj;
            int mo1220b = c0480j.mo1220b();
            byte[] bArr = this.f1219a;
            if (mo1220b == bArr.length && c0480j.mo1227k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo1223f() {
        return this.f1219a;
    }

    /* renamed from: g */
    public byte mo1224g(int r2) {
        return this.f1219a[r2];
    }

    /* renamed from: h */
    public int mo1225h(int r4, byte[] other) {
        AbstractC2492i.m4915e(other, "other");
        if (r4 == -1234567890) {
            r4 = mo1220b();
        }
        byte[] bArr = this.f1219a;
        for (int min = Math.min(r4, bArr.length - other.length); -1 < min; min--) {
            if (AbstractC0379e.m1070a(min, 0, other.length, bArr, other)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int r02 = this.f1220b;
        if (r02 != 0) {
            return r02;
        }
        int hashCode = Arrays.hashCode(this.f1219a);
        this.f1220b = hashCode;
        return hashCode;
    }

    /* renamed from: j */
    public boolean mo1226j(int r3, C0480j other, int r5) {
        AbstractC2492i.m4915e(other, "other");
        return other.mo1227k(0, this.f1219a, r3, r5);
    }

    /* renamed from: k */
    public boolean mo1227k(int r3, byte[] other, int r5, int r6) {
        AbstractC2492i.m4915e(other, "other");
        if (r3 >= 0) {
            byte[] bArr = this.f1219a;
            if (r3 <= bArr.length - r6 && r5 >= 0 && r5 <= other.length - r6 && AbstractC0379e.m1070a(r3, r5, r6, bArr, other)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public C0480j mo1228l(int r3, int r4) {
        if (r4 == -1234567890) {
            r4 = mo1220b();
        }
        if (r3 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1219a;
        if (r4 <= bArr.length) {
            if (r4 - r3 >= 0) {
                return (r3 == 0 && r4 == bArr.length) ? this : new C0480j(AbstractC2658h.m5107E(bArr, r3, r4));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    /* renamed from: n */
    public C0480j mo1229n() {
        int r02 = 0;
        while (true) {
            byte[] bArr = this.f1219a;
            if (r02 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[r02];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC2492i.m4914d(copyOf, "copyOf(...)");
                copyOf[r02] = (byte) (b2 + 32);
                for (int r5 = r02 + 1; r5 < copyOf.length; r5++) {
                    byte b3 = copyOf[r5];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[r5] = (byte) (b3 + 32);
                    }
                }
                return new C0480j(copyOf);
            }
            r02++;
        }
    }

    /* renamed from: o */
    public final String m1279o() {
        String str = this.f1221c;
        if (str != null) {
            return str;
        }
        byte[] mo1223f = mo1223f();
        AbstractC2492i.m4915e(mo1223f, "<this>");
        String str2 = new String(mo1223f, AbstractC0008a.f6a);
        this.f1221c = str2;
        return str2;
    }

    /* renamed from: p */
    public void mo1230p(C0477g buffer, int r4) {
        AbstractC2492i.m4915e(buffer, "buffer");
        buffer.m1272x(this.f1219a, 0, r4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051R1.C0480j.toString():java.lang.String");
    }
}
