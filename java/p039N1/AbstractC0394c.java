package p039N1;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p008C1.C0088t;
import p016F1.C0136d;
import p027J1.AbstractC0248h;
import p108m1.AbstractC2671u;

/* renamed from: N1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0394c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f1057a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f1058b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C0088t.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C0088t.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC0248h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C0136d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f1058b = AbstractC2671u.m5130g0(linkedHashMap);
    }

    /* renamed from: a */
    public static void m1146a(String str, int r7, String str2, Throwable th) {
        int min;
        String str3 = (String) f1058b.get(str);
        if (str3 == null) {
            str3 = AbstractC0017j.m147Y(23, str);
        }
        if (Log.isLoggable(str3, r7)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int r2 = 0;
            while (r2 < length) {
                int m136N = AbstractC0017j.m136N(str2, '\n', r2, false, 4);
                if (m136N == -1) {
                    m136N = length;
                }
                while (true) {
                    min = Math.min(m136N, r2 + 4000);
                    String substring = str2.substring(r2, min);
                    AbstractC2492i.m4914d(substring, "substring(...)");
                    Log.println(r7, str3, substring);
                    if (min >= m136N) {
                        break;
                    } else {
                        r2 = min;
                    }
                }
                r2 = min + 1;
            }
        }
    }
}
