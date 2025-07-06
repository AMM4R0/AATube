package p112o;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: o.f */
/* loaded from: classes.dex */
public class C2686f {

    /* renamed from: a */
    public final LinkedHashMap f8660a;

    /* renamed from: b */
    public int f8661b;

    /* renamed from: c */
    public final int f8662c;

    /* renamed from: d */
    public int f8663d;

    /* renamed from: e */
    public int f8664e;

    public C2686f(int r4) {
        if (r4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f8662c = r4;
        this.f8660a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Object m5169a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f8660a.get(obj);
                if (obj2 != null) {
                    this.f8663d++;
                    return obj2;
                }
                this.f8664e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Object m5170b(Object obj, Object obj2) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f8661b++;
                put = this.f8660a.put(obj, obj2);
                if (put != null) {
                    this.f8661b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m5171c(this.f8662c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5171c(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f8661b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L47
            java.util.LinkedHashMap r0 = r2.f8660a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.f8661b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L47
            goto L14
        L12:
            r3 = move-exception
            goto L66
        L14:
            int r0 = r2.f8661b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L45
            java.util.LinkedHashMap r0 = r2.f8660a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L45
        L21:
            java.util.LinkedHashMap r0 = r2.f8660a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r0 = r2.f8660a     // Catch: java.lang.Throwable -> L12
            r0.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r2.f8661b     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + (-1)
            r2.f8661b = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p112o.C2686f.m5171c(int):void");
    }

    public final synchronized String toString() {
        int r12;
        int r2;
        int r4;
        try {
            r12 = this.f8663d;
            r2 = this.f8664e;
            int r3 = r12 + r2;
            r4 = r3 != 0 ? (r12 * 100) / r3 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f8662c + ",hits=" + r12 + ",misses=" + r2 + ",hitRate=" + r4 + "%]";
    }
}
