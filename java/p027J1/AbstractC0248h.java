package p027J1;

import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p002A1.AbstractC0025r;
import p011D1.AbstractC0122i;
import p051R1.C0480j;
import p081e1.C0879e;

/* renamed from: J1.h */
/* loaded from: classes.dex */
public abstract class AbstractC0248h {

    /* renamed from: a */
    public static final C0480j f742a;

    /* renamed from: b */
    public static final String[] f743b;

    /* renamed from: c */
    public static final String[] f744c;

    /* renamed from: d */
    public static final String[] f745d;

    static {
        C0480j c0480j = C0480j.f1218d;
        f742a = C0879e.m2396i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f743b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f744c = new String[64];
        String[] strArr = new String[256];
        for (int r5 = 0; r5 < 256; r5++) {
            String binaryString = Integer.toBinaryString(r5);
            AbstractC2492i.m4914d(binaryString, "toBinaryString(...)");
            String replace = AbstractC0122i.m414d("%8s", binaryString).replace(' ', '0');
            AbstractC2492i.m4914d(replace, "replace(...)");
            strArr[r5] = replace;
        }
        f745d = strArr;
        String[] strArr2 = f744c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] r4 = {1};
        strArr2[8] = "PADDED";
        int r52 = r4[0];
        strArr2[r52 | 8] = AbstractC0002c.m17l(new StringBuilder(), strArr2[r52], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] r3 = {4, 32, 36};
        for (int r53 = 0; r53 < 3; r53++) {
            int r6 = r3[r53];
            int r7 = r4[0];
            String[] strArr3 = f744c;
            int r10 = r7 | r6;
            strArr3[r10] = strArr3[r7] + '|' + strArr3[r6];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[r7]);
            sb.append('|');
            strArr3[r10 | 8] = AbstractC0002c.m17l(sb, strArr3[r6], "|PADDED");
        }
        int length = f744c.length;
        for (int r12 = 0; r12 < length; r12++) {
            String[] strArr4 = f744c;
            if (strArr4[r12] == null) {
                strArr4[r12] = f745d[r12];
            }
        }
    }

    /* renamed from: a */
    public static String m665a(int r2) {
        String[] strArr = f743b;
        return r2 < strArr.length ? strArr[r2] : AbstractC0122i.m414d("0x%02x", Integer.valueOf(r2));
    }

    /* renamed from: b */
    public static String m666b(boolean z2, int r10, int r11, int r12, int r13) {
        String str;
        String str2;
        String m665a = m665a(r12);
        if (r13 == 0) {
            str = "";
        } else {
            String[] strArr = f745d;
            if (r12 != 2 && r12 != 3) {
                if (r12 == 4 || r12 == 6) {
                    str = r13 == 1 ? "ACK" : strArr[r13];
                } else if (r12 != 7 && r12 != 8) {
                    String[] strArr2 = f744c;
                    if (r13 < strArr2.length) {
                        str2 = strArr2[r13];
                        AbstractC2492i.m4912b(str2);
                    } else {
                        str2 = strArr[r13];
                    }
                    str = (r12 != 5 || (r13 & 4) == 0) ? (r12 != 0 || (r13 & 32) == 0) ? str2 : AbstractC0025r.m154G(str2, "PRIORITY", "COMPRESSED") : AbstractC0025r.m154G(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[r13];
        }
        return AbstractC0122i.m414d("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(r10), Integer.valueOf(r11), m665a, str);
    }

    /* renamed from: c */
    public static String m667c(long j2, int r4, int r5, boolean z2) {
        return AbstractC0122i.m414d("%s 0x%08x %5d %-13s %d", z2 ? "<<" : ">>", Integer.valueOf(r4), Integer.valueOf(r5), m665a(8), Long.valueOf(j2));
    }
}
