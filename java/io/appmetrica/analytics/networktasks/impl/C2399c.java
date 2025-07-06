package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;

/* renamed from: io.appmetrica.analytics.networktasks.impl.c */
/* loaded from: classes.dex */
public final class C2399c {

    /* renamed from: a */
    public final String f7706a;

    public C2399c(String str) {
        this.f7706a = m4756a(str);
    }

    /* renamed from: a */
    public static String m4756a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }
}
