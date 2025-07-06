package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.en */
/* loaded from: classes.dex */
public final class C1831en {

    /* renamed from: a */
    public final C1582Um f6165a;

    /* renamed from: b */
    public final C1559U f6166b;

    /* renamed from: c */
    public final List f6167c;

    /* renamed from: d */
    public final String f6168d;

    /* renamed from: e */
    public final String f6169e;

    /* renamed from: f */
    public final Map f6170f;

    /* renamed from: g */
    public final String f6171g;

    /* renamed from: h */
    public final Boolean f6172h;

    public C1831en(C1582Um c1582Um, C1559U c1559u, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f6165a = c1582Um;
        this.f6166b = c1559u;
        this.f6167c = arrayList;
        this.f6168d = str;
        this.f6169e = str2;
        this.f6170f = map;
        this.f6171g = str3;
        this.f6172h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C1582Um c1582Um = this.f6165a;
        if (c1582Um != null) {
            for (C1630Wk c1630Wk : c1582Um.f5549c) {
                sb.append("at " + c1630Wk.f5655a + "." + c1630Wk.f5659e + "(" + c1630Wk.f5656b + StringUtils.PROCESS_POSTFIX_DELIMITER + c1630Wk.f5657c + StringUtils.PROCESS_POSTFIX_DELIMITER + c1630Wk.f5658d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f6165a + "\n" + sb.toString() + '}';
    }
}
