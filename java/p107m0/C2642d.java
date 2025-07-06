package p107m0;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.carwizard.p075li.youtube.MainActivity;
import kotlin.jvm.internal.AbstractC2492i;
import p003B.RunnableC0040n;
import p050R0.RunnableC0458b;

/* renamed from: m0.d */
/* loaded from: classes.dex */
public final class C2642d {

    /* renamed from: a */
    public final MainActivity f8566a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f8567b;

    public C2642d(MainActivity mainActivity, MainActivity activity) {
        AbstractC2492i.m4915e(activity, "activity");
        this.f8567b = mainActivity;
        this.f8566a = activity;
    }

    @JavascriptInterface
    public final void hasVideoTag(final boolean z2, final long j2, final long j3) {
        this.f8567b.runOnUiThread(new Runnable() { // from class: m0.c
            @Override // java.lang.Runnable
            public final void run() {
                C2642d this$0 = C2642d.this;
                AbstractC2492i.m4915e(this$0, "this$0");
                int r02 = MainActivity.f2659G;
                this$0.f8566a.m2023w(z2, j2, j3);
            }
        });
    }

    @JavascriptInterface
    public final void injectCSS(String css) {
        AbstractC2492i.m4915e(css, "css");
        MainActivity mainActivity = this.f8567b;
        WebView webView = mainActivity.f2666v;
        if (webView != null) {
            webView.post(new RunnableC0040n(mainActivity, 3, css));
        }
    }

    @JavascriptInterface
    public final void noVideoTag() {
        this.f8567b.runOnUiThread(new RunnableC0458b(12, this));
    }
}
