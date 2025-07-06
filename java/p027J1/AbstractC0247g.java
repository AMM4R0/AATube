package p027J1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.C0480j;

/* renamed from: J1.g */
/* loaded from: classes.dex */
public abstract class AbstractC0247g {

    /* renamed from: a */
    public static final C0244d[] f740a;

    /* renamed from: b */
    public static final Map f741b;

    static {
        C0244d c0244d = new C0244d(C0244d.f720i, "");
        C0480j c0480j = C0244d.f717f;
        C0244d c0244d2 = new C0244d(c0480j, "GET");
        C0244d c0244d3 = new C0244d(c0480j, "POST");
        C0480j c0480j2 = C0244d.f718g;
        C0244d c0244d4 = new C0244d(c0480j2, "/");
        C0244d c0244d5 = new C0244d(c0480j2, "/index.html");
        C0480j c0480j3 = C0244d.f719h;
        C0244d c0244d6 = new C0244d(c0480j3, "http");
        C0244d c0244d7 = new C0244d(c0480j3, "https");
        C0480j c0480j4 = C0244d.f716e;
        C0244d[] c0244dArr = {c0244d, c0244d2, c0244d3, c0244d4, c0244d5, c0244d6, c0244d7, new C0244d(c0480j4, "200"), new C0244d(c0480j4, "204"), new C0244d(c0480j4, "206"), new C0244d(c0480j4, "304"), new C0244d(c0480j4, "400"), new C0244d(c0480j4, "404"), new C0244d(c0480j4, "500"), new C0244d("accept-charset", ""), new C0244d("accept-encoding", "gzip, deflate"), new C0244d("accept-language", ""), new C0244d("accept-ranges", ""), new C0244d("accept", ""), new C0244d("access-control-allow-origin", ""), new C0244d("age", ""), new C0244d("allow", ""), new C0244d("authorization", ""), new C0244d("cache-control", ""), new C0244d("content-disposition", ""), new C0244d("content-encoding", ""), new C0244d("content-language", ""), new C0244d("content-length", ""), new C0244d("content-location", ""), new C0244d("content-range", ""), new C0244d("content-type", ""), new C0244d("cookie", ""), new C0244d("date", ""), new C0244d("etag", ""), new C0244d("expect", ""), new C0244d("expires", ""), new C0244d("from", ""), new C0244d("host", ""), new C0244d("if-match", ""), new C0244d("if-modified-since", ""), new C0244d("if-none-match", ""), new C0244d("if-range", ""), new C0244d("if-unmodified-since", ""), new C0244d("last-modified", ""), new C0244d("link", ""), new C0244d("location", ""), new C0244d("max-forwards", ""), new C0244d("proxy-authenticate", ""), new C0244d("proxy-authorization", ""), new C0244d("range", ""), new C0244d("referer", ""), new C0244d("refresh", ""), new C0244d("retry-after", ""), new C0244d("server", ""), new C0244d("set-cookie", ""), new C0244d("strict-transport-security", ""), new C0244d("transfer-encoding", ""), new C0244d("user-agent", ""), new C0244d("vary", ""), new C0244d("via", ""), new C0244d("www-authenticate", "")};
        f740a = c0244dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int r2 = 0; r2 < 61; r2++) {
            if (!linkedHashMap.containsKey(c0244dArr[r2].f721a)) {
                linkedHashMap.put(c0244dArr[r2].f721a, Integer.valueOf(r2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC2492i.m4914d(unmodifiableMap, "unmodifiableMap(...)");
        f741b = unmodifiableMap;
    }

    /* renamed from: a */
    public static void m664a(C0480j name) {
        AbstractC2492i.m4915e(name, "name");
        int mo1220b = name.mo1220b();
        for (int r12 = 0; r12 < mo1220b; r12++) {
            byte mo1224g = name.mo1224g(r12);
            if (65 <= mo1224g && mo1224g < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.m1279o()));
            }
        }
    }
}
