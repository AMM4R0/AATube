package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p108m1.C2669s;

/* renamed from: io.appmetrica.analytics.impl.B6 */
/* loaded from: classes.dex */
public final class C1092B6 {

    /* renamed from: a */
    public final C2029ml f4516a = new C2029ml();

    /* renamed from: b */
    public Map f4517b;

    /* renamed from: c */
    public Map f4518c;

    /* renamed from: d */
    public IdentifiersResult f4519d;

    public C1092B6() {
        C2669s c2669s = C2669s.f8608a;
        this.f4517b = c2669s;
        this.f4518c = c2669s;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #3 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:22:0x0059, B:23:0x006e, B:25:0x0074, B:27:0x009b, B:28:0x00b2, B:30:0x00b8, B:34:0x00da, B:36:0x00dc, B:43:0x00e0, B:45:0x0099, B:46:0x002a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m2747a(io.appmetrica.analytics.internal.IdentifiersResult r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r8.f4519d     // Catch: java.lang.Throwable -> L9
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.f7574id     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r9 = move-exception
            goto Le4
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L22
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L16
            goto L22
        L16:
            java.lang.String r0 = r9.f7574id     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Le2
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L22
            goto Le2
        L22:
            r8.f4519d = r9     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r9.f7574id     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L2a
            r2 = r1
            goto L57
        L2a:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L9
            r2.<init>()     // Catch: java.lang.Throwable -> L9
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r0 = r3.keys()     // Catch: java.lang.Throwable -> L57
        L38:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L57
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L57
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r3.optString(r4)     // Catch: java.lang.Throwable -> L38
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r5 = io.appmetrica.analytics.impl.AbstractC1794db.m3749a(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L38
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L38
            goto L38
        L57:
            if (r2 == 0) goto L99
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L9
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L9
            int r3 = p108m1.AbstractC2671u.m5125b0(r3)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L9
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9
        L6e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L9
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L9
            io.appmetrica.analytics.internal.IdentifiersResult r5 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L9
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L9
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L9
            org.json.JSONArray r3 = io.appmetrica.analytics.impl.AbstractC1794db.m3752a(r3)     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L9
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r6 = r9.status     // Catch: java.lang.Throwable -> L9
            java.lang.String r7 = r9.errorExplanation     // Catch: java.lang.Throwable -> L9
            r5.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L9
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L9
            goto L6e
        L99:
            m1.s r0 = p108m1.C2669s.f8608a     // Catch: java.lang.Throwable -> L9
        L9b:
            r8.f4518c = r0     // Catch: java.lang.Throwable -> L9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L9
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L9
            int r2 = p108m1.AbstractC2671u.m5125b0(r2)     // Catch: java.lang.Throwable -> L9
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L9
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9
        Lb2:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L9
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L9
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L9
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L9
            io.appmetrica.analytics.internal.IdentifiersResult r2 = (io.appmetrica.analytics.internal.IdentifiersResult) r2     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = r2.f7574id     // Catch: java.lang.Throwable -> L9
            if (r2 != 0) goto Lcd
            goto Ld7
        Lcd:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld7
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Ld7
            java.util.ArrayList r2 = io.appmetrica.analytics.impl.AbstractC1794db.m3749a(r4)     // Catch: java.lang.Throwable -> Ld7
            goto Ld8
        Ld7:
            r2 = r1
        Ld8:
            if (r2 != 0) goto Ldc
            m1.r r2 = p108m1.C2668r.f8607a     // Catch: java.lang.Throwable -> L9
        Ldc:
            r9.put(r3, r2)     // Catch: java.lang.Throwable -> L9
            goto Lb2
        Le0:
            r8.f4517b = r9     // Catch: java.lang.Throwable -> L9
        Le2:
            monitor-exit(r8)
            return
        Le4:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C1092B6.m2747a(io.appmetrica.analytics.internal.IdentifiersResult):void");
    }

    /* renamed from: a */
    public final synchronized void m2748a(List list, HashMap hashMap) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f4517b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            C2029ml c2029ml = this.f4516a;
            String m3748a = AbstractC1794db.m3748a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f4519d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", c2029ml.m4226a(new IdentifiersResult(m3748a, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
