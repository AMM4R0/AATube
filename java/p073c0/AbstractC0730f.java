package p073c0;

import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import p000A.AbstractC0002c;
import p081e1.C0879e;

/* renamed from: c0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0730f {

    /* renamed from: a */
    public static final C0879e f2633a = new C0879e();

    /* renamed from: b */
    public static final byte[] f2634b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f2635c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f2636d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f2637e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f2638f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f2639g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f2640h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f2641i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f2642j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m1988a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m1989b(C0727c[] c0727cArr, byte[] bArr) {
        int r3 = 0;
        for (C0727c c0727c : c0727cArr) {
            r3 += ((((c0727c.f2630g * 2) + 7) & (-8)) / 8) + (c0727c.f2628e * 2) + m1991d(bArr, c0727c.f2624a, c0727c.f2625b).getBytes(StandardCharsets.UTF_8).length + 16 + c0727c.f2629f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(r3);
        if (Arrays.equals(bArr, f2638f)) {
            for (C0727c c0727c2 : c0727cArr) {
                m2003p(byteArrayOutputStream, c0727c2, m1991d(bArr, c0727c2.f2624a, c0727c2.f2625b));
                m2005r(byteArrayOutputStream, c0727c2);
                int[] r6 = c0727c2.f2631h;
                int length = r6.length;
                int r8 = 0;
                int r9 = 0;
                while (r8 < length) {
                    int r10 = r6[r8];
                    m2008u(byteArrayOutputStream, r10 - r9);
                    r8++;
                    r9 = r10;
                }
                m2004q(byteArrayOutputStream, c0727c2);
            }
        } else {
            for (C0727c c0727c3 : c0727cArr) {
                m2003p(byteArrayOutputStream, c0727c3, m1991d(bArr, c0727c3.f2624a, c0727c3.f2625b));
            }
            for (C0727c c0727c4 : c0727cArr) {
                m2005r(byteArrayOutputStream, c0727c4);
                int[] r5 = c0727c4.f2631h;
                int length2 = r5.length;
                int r7 = 0;
                int r82 = 0;
                while (r7 < length2) {
                    int r92 = r5[r7];
                    m2008u(byteArrayOutputStream, r92 - r82);
                    r7++;
                    r82 = r92;
                }
                m2004q(byteArrayOutputStream, c0727c4);
            }
        }
        if (byteArrayOutputStream.size() == r3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + r3);
    }

    /* renamed from: c */
    public static boolean m1990c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = m1990c(file2) && z2;
        }
        return z2;
    }

    /* renamed from: d */
    public static String m1991d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f2640h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2639g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return AbstractC0002c.m17l(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
    }

    /* renamed from: e */
    public static void m1992e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m1993f(InputStream inputStream, int r4) {
        byte[] bArr = new byte[r4];
        int r12 = 0;
        while (r12 < r4) {
            int read = inputStream.read(bArr, r12, r4 - r12);
            if (read < 0) {
                throw new IllegalStateException(AbstractC0002c.m11f(r4, "Not enough bytes to read: "));
            }
            r12 += read;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m1994g(ByteArrayInputStream byteArrayInputStream, int r6) {
        int[] r02 = new int[r6];
        int r2 = 0;
        for (int r12 = 0; r12 < r6; r12++) {
            r2 += (int) m2000m(byteArrayInputStream, 2);
            r02[r12] = r2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m1995h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p073c0.AbstractC0730f.m1995h(java.io.FileInputStream, int, int):byte[]");
    }

    /* renamed from: i */
    public static C0727c[] m1996i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0727c[] c0727cArr) {
        byte[] bArr3 = f2641i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2642j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2000m = (int) m2000m(fileInputStream, 2);
            byte[] m1995h = m1995h(fileInputStream, (int) m2000m(fileInputStream, 4), (int) m2000m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m1995h);
            try {
                C0727c[] m1998k = m1998k(byteArrayInputStream, bArr2, m2000m, c0727cArr);
                byteArrayInputStream.close();
                return m1998k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f2636d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m2000m2 = (int) m2000m(fileInputStream, 1);
        byte[] m1995h2 = m1995h(fileInputStream, (int) m2000m(fileInputStream, 4), (int) m2000m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m1995h2);
        try {
            C0727c[] m1997j = m1997j(byteArrayInputStream2, m2000m2, c0727cArr);
            byteArrayInputStream2.close();
            return m1997j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static C0727c[] m1997j(ByteArrayInputStream byteArrayInputStream, int r9, C0727c[] c0727cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0727c[0];
        }
        if (r9 != c0727cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[r9];
        int[] r2 = new int[r9];
        for (int r3 = 0; r3 < r9; r3++) {
            int m2000m = (int) m2000m(byteArrayInputStream, 2);
            r2[r3] = (int) m2000m(byteArrayInputStream, 2);
            strArr[r3] = new String(m1993f(byteArrayInputStream, m2000m), StandardCharsets.UTF_8);
        }
        for (int r12 = 0; r12 < r9; r12++) {
            C0727c c0727c = c0727cArr[r12];
            if (!c0727c.f2625b.equals(strArr[r12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int r4 = r2[r12];
            c0727c.f2628e = r4;
            c0727c.f2631h = m1994g(byteArrayInputStream, r4);
        }
        return c0727cArr;
    }

    /* renamed from: k */
    public static C0727c[] m1998k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int r12, C0727c[] c0727cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0727c[0];
        }
        if (r12 != c0727cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int r02 = 0; r02 < r12; r02++) {
            m2000m(byteArrayInputStream, 2);
            String str = new String(m1993f(byteArrayInputStream, (int) m2000m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2000m = m2000m(byteArrayInputStream, 4);
            int m2000m2 = (int) m2000m(byteArrayInputStream, 2);
            C0727c c0727c = null;
            if (c0727cArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int r8 = 0;
                while (true) {
                    if (r8 >= c0727cArr.length) {
                        break;
                    }
                    if (c0727cArr[r8].f2625b.equals(substring)) {
                        c0727c = c0727cArr[r8];
                        break;
                    }
                    r8++;
                }
            }
            if (c0727c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0727c.f2627d = m2000m;
            int[] m1994g = m1994g(byteArrayInputStream, m2000m2);
            if (Arrays.equals(bArr, f2640h)) {
                c0727c.f2628e = m2000m2;
                c0727c.f2631h = m1994g;
            }
        }
        return c0727cArr;
    }

    /* renamed from: l */
    public static C0727c[] m1999l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f2637e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2000m = (int) m2000m(fileInputStream, 1);
        byte[] m1995h = m1995h(fileInputStream, (int) m2000m(fileInputStream, 4), (int) m2000m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m1995h);
        try {
            C0727c[] m2001n = m2001n(byteArrayInputStream, str, m2000m);
            byteArrayInputStream.close();
            return m2001n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m2000m(InputStream inputStream, int r7) {
        byte[] m1993f = m1993f(inputStream, r7);
        long j2 = 0;
        for (int r2 = 0; r2 < r7; r2++) {
            j2 += (m1993f[r2] & 255) << (r2 * 8);
        }
        return j2;
    }

    /* renamed from: n */
    public static C0727c[] m2001n(ByteArrayInputStream byteArrayInputStream, String str, int r21) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0727c[0];
        }
        C0727c[] c0727cArr = new C0727c[r21];
        for (int r4 = 0; r4 < r21; r4++) {
            int m2000m = (int) m2000m(byteArrayInputStream, 2);
            int m2000m2 = (int) m2000m(byteArrayInputStream, 2);
            c0727cArr[r4] = new C0727c(str, new String(m1993f(byteArrayInputStream, m2000m), StandardCharsets.UTF_8), m2000m(byteArrayInputStream, 4), m2000m2, (int) m2000m(byteArrayInputStream, 4), (int) m2000m(byteArrayInputStream, 4), new int[m2000m2], new TreeMap());
        }
        for (int r42 = 0; r42 < r21; r42++) {
            C0727c c0727c = c0727cArr[r42];
            int available = byteArrayInputStream.available() - c0727c.f2629f;
            int r8 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0727c.f2632i;
                if (available2 <= available) {
                    break;
                }
                r8 += (int) m2000m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(r8), 1);
                for (int m2000m3 = (int) m2000m(byteArrayInputStream, 2); m2000m3 > 0; m2000m3--) {
                    m2000m(byteArrayInputStream, 2);
                    int m2000m4 = (int) m2000m(byteArrayInputStream, 1);
                    if (m2000m4 != 6 && m2000m4 != 7) {
                        while (m2000m4 > 0) {
                            m2000m(byteArrayInputStream, 1);
                            for (int m2000m5 = (int) m2000m(byteArrayInputStream, 1); m2000m5 > 0; m2000m5--) {
                                m2000m(byteArrayInputStream, 2);
                            }
                            m2000m4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0727c.f2631h = m1994g(byteArrayInputStream, c0727c.f2628e);
            int r6 = c0727c.f2630g;
            BitSet valueOf = BitSet.valueOf(m1993f(byteArrayInputStream, (((r6 * 2) + 7) & (-8)) / 8));
            for (int r82 = 0; r82 < r6; r82++) {
                int r9 = valueOf.get(r82) ? 2 : 0;
                if (valueOf.get(r82 + r6)) {
                    r9 |= 4;
                }
                if (r9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(r82));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(r82), Integer.valueOf(r9 | num.intValue()));
                }
            }
        }
        return c0727cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m2002o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0727c[] c0727cArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2636d;
        int r6 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2637e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] m1989b = m1989b(c0727cArr, bArr3);
                m2007t(byteArrayOutputStream, c0727cArr.length, 1);
                m2007t(byteArrayOutputStream, m1989b.length, 4);
                byte[] m1988a = m1988a(m1989b);
                m2007t(byteArrayOutputStream, m1988a.length, 4);
                byteArrayOutputStream.write(m1988a);
                return true;
            }
            byte[] bArr4 = f2639g;
            if (Arrays.equals(bArr, bArr4)) {
                m2007t(byteArrayOutputStream, c0727cArr.length, 1);
                for (C0727c c0727c : c0727cArr) {
                    int size = c0727c.f2632i.size() * 4;
                    String m1991d = m1991d(bArr4, c0727c.f2624a, c0727c.f2625b);
                    Charset charset = StandardCharsets.UTF_8;
                    m2008u(byteArrayOutputStream, m1991d.getBytes(charset).length);
                    m2008u(byteArrayOutputStream, c0727c.f2631h.length);
                    m2007t(byteArrayOutputStream, size, 4);
                    m2007t(byteArrayOutputStream, c0727c.f2626c, 4);
                    byteArrayOutputStream.write(m1991d.getBytes(charset));
                    Iterator it = c0727c.f2632i.keySet().iterator();
                    while (it.hasNext()) {
                        m2008u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m2008u(byteArrayOutputStream, 0);
                    }
                    for (int r02 : c0727c.f2631h) {
                        m2008u(byteArrayOutputStream, r02);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2638f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] m1989b2 = m1989b(c0727cArr, bArr5);
                m2007t(byteArrayOutputStream, c0727cArr.length, 1);
                m2007t(byteArrayOutputStream, m1989b2.length, 4);
                byte[] m1988a2 = m1988a(m1989b2);
                m2007t(byteArrayOutputStream, m1988a2.length, 4);
                byteArrayOutputStream.write(m1988a2);
                return true;
            }
            byte[] bArr6 = f2640h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m2008u(byteArrayOutputStream, c0727cArr.length);
            for (C0727c c0727c2 : c0727cArr) {
                String m1991d2 = m1991d(bArr6, c0727c2.f2624a, c0727c2.f2625b);
                Charset charset2 = StandardCharsets.UTF_8;
                m2008u(byteArrayOutputStream, m1991d2.getBytes(charset2).length);
                TreeMap treeMap = c0727c2.f2632i;
                m2008u(byteArrayOutputStream, treeMap.size());
                m2008u(byteArrayOutputStream, c0727c2.f2631h.length);
                m2007t(byteArrayOutputStream, c0727c2.f2626c, 4);
                byteArrayOutputStream.write(m1991d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m2008u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int r03 : c0727c2.f2631h) {
                    m2008u(byteArrayOutputStream, r03);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m2008u(byteArrayOutputStream2, c0727cArr.length);
            int r10 = 2;
            int r12 = 2;
            for (C0727c c0727c3 : c0727cArr) {
                m2007t(byteArrayOutputStream2, c0727c3.f2626c, 4);
                m2007t(byteArrayOutputStream2, c0727c3.f2627d, 4);
                m2007t(byteArrayOutputStream2, c0727c3.f2630g, 4);
                String m1991d3 = m1991d(bArr2, c0727c3.f2624a, c0727c3.f2625b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = m1991d3.getBytes(charset3).length;
                m2008u(byteArrayOutputStream2, length2);
                r12 = r12 + 14 + length2;
                byteArrayOutputStream2.write(m1991d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (r12 != byteArray.length) {
                throw new IllegalStateException("Expected size " + r12 + ", does not match actual size " + byteArray.length);
            }
            C0738n c0738n = new C0738n(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0738n);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int r9 = 0;
            int r11 = 0;
            while (r9 < c0727cArr.length) {
                try {
                    C0727c c0727c4 = c0727cArr[r9];
                    m2008u(byteArrayOutputStream3, r9);
                    m2008u(byteArrayOutputStream3, c0727c4.f2628e);
                    r11 = r11 + 4 + (c0727c4.f2628e * 2);
                    int[] r122 = c0727c4.f2631h;
                    int length3 = r122.length;
                    int r16 = r6;
                    while (r6 < length3) {
                        int r17 = r122[r6];
                        m2008u(byteArrayOutputStream3, r17 - r16);
                        r6++;
                        r16 = r17;
                    }
                    r9++;
                    r6 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (r11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + r11 + ", does not match actual size " + byteArray2.length);
            }
            C0738n c0738n2 = new C0738n(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0738n2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int r4 = 0;
            int r5 = 0;
            while (r4 < c0727cArr.length) {
                try {
                    C0727c c0727c5 = c0727cArr[r4];
                    Iterator it3 = c0727c5.f2632i.entrySet().iterator();
                    int r112 = 0;
                    while (it3.hasNext()) {
                        r112 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m2004q(byteArrayOutputStream4, c0727c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2005r(byteArrayOutputStream4, c0727c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m2008u(byteArrayOutputStream3, r4);
                            int length4 = byteArray3.length + r10 + byteArray4.length;
                            int r52 = r5 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m2007t(byteArrayOutputStream3, length4, 4);
                            m2008u(byteArrayOutputStream3, r112);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            r5 = r52 + length4;
                            r4++;
                            arrayList3 = arrayList4;
                            r10 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (r5 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + r5 + ", does not match actual size " + byteArray5.length);
            }
            C0738n c0738n3 = new C0738n(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0738n3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            m2007t(byteArrayOutputStream, arrayList2.size(), 4);
            int r42 = 0;
            while (r42 < arrayList2.size()) {
                C0738n c0738n4 = (C0738n) arrayList2.get(r42);
                int r62 = c0738n4.f2653a;
                if (r62 == 1) {
                    j2 = 0;
                } else if (r62 == 2) {
                    j2 = 1;
                } else if (r62 == 3) {
                    j2 = 2;
                } else if (r62 == 4) {
                    j2 = 3;
                } else {
                    if (r62 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m2007t(byteArrayOutputStream, j2, 4);
                m2007t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0738n4.f2654b;
                if (c0738n4.f2655c) {
                    long length5 = bArr7.length;
                    byte[] m1988a3 = m1988a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(m1988a3);
                    m2007t(byteArrayOutputStream, m1988a3.length, 4);
                    m2007t(byteArrayOutputStream, length5, 4);
                    length = m1988a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m2007t(byteArrayOutputStream, bArr7.length, 4);
                    m2007t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                r42++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int r63 = 0; r63 < arrayList6.size(); r63++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(r63));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m2003p(ByteArrayOutputStream byteArrayOutputStream, C0727c c0727c, String str) {
        Charset charset = StandardCharsets.UTF_8;
        m2008u(byteArrayOutputStream, str.getBytes(charset).length);
        m2008u(byteArrayOutputStream, c0727c.f2628e);
        m2007t(byteArrayOutputStream, c0727c.f2629f, 4);
        m2007t(byteArrayOutputStream, c0727c.f2626c, 4);
        m2007t(byteArrayOutputStream, c0727c.f2630g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: q */
    public static void m2004q(ByteArrayOutputStream byteArrayOutputStream, C0727c c0727c) {
        byte[] bArr = new byte[(((c0727c.f2630g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0727c.f2632i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int r4 = intValue / 8;
                bArr[r4] = (byte) (bArr[r4] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int r3 = intValue + c0727c.f2630g;
                int r2 = r3 / 8;
                bArr[r2] = (byte) ((1 << (r3 % 8)) | bArr[r2]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: r */
    public static void m2005r(ByteArrayOutputStream byteArrayOutputStream, C0727c c0727c) {
        int r12 = 0;
        for (Map.Entry entry : c0727c.f2632i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m2008u(byteArrayOutputStream, intValue - r12);
                m2008u(byteArrayOutputStream, 0);
                r12 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
    
        if (r5 == null) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2006s(android.content.Context r19, java.util.concurrent.Executor r20, p073c0.InterfaceC0729e r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p073c0.AbstractC0730f.m2006s(android.content.Context, java.util.concurrent.Executor, c0.e, boolean):void");
    }

    /* renamed from: t */
    public static void m2007t(ByteArrayOutputStream byteArrayOutputStream, long j2, int r9) {
        byte[] bArr = new byte[r9];
        for (int r12 = 0; r12 < r9; r12++) {
            bArr[r12] = (byte) ((j2 >> (r12 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: u */
    public static void m2008u(ByteArrayOutputStream byteArrayOutputStream, int r3) {
        m2007t(byteArrayOutputStream, r3, 2);
    }
}
