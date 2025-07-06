package io.appmetrica.analytics.internal.p098js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C2009m1;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    private final C2009m1 f7578a;

    public AppMetricaInitializerJsInterface(C2009m1 c2009m1) {
        this.f7578a = c2009m1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f7578a.m4153c(str);
    }
}
