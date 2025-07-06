package io.appmetrica.analytics.internal.p098js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C2009m1;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a */
    private final C2009m1 f7579a;

    public AppMetricaJsInterface(C2009m1 c2009m1) {
        this.f7579a = c2009m1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f7579a.m4157d(str, str2);
    }
}
