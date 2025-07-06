package p107m0;

import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.carwizard.p075li.youtube.MainActivity;
import com.carwizard.p075li.youtube.R;
import java.util.Iterator;
import java.util.List;
import p002A1.AbstractC0017j;
import p002A1.AbstractC0025r;
import p008C1.AbstractC0066A;
import p008C1.C0088t;
import p008C1.C0090v;
import p008C1.C0091w;
import p018G1.C0162m;
import p108m1.AbstractC2660j;

/* renamed from: m0.g */
/* loaded from: classes.dex */
public final class C2645g extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f8572a;

    public C2645g(MainActivity mainActivity) {
        this.f8572a = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String script;
        WebView webView2;
        super.onPageFinished(webView, str);
        MainActivity mainActivity = this.f8572a;
        ((ProgressBar) mainActivity.findViewById(R.id.progressBar)).setVisibility(8);
        if (!mainActivity.f2662C && (webView2 = mainActivity.f2666v) != null) {
            webView2.setVisibility(0);
        }
        if (webView != null) {
            script = mainActivity.getScript(new MainActivity());
            webView.evaluateJavascript(script, null);
        }
        MediaSession mediaSession = mainActivity.f2661B;
        if (mediaSession != null) {
            mediaSession.setActive(true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MainActivity mainActivity = this.f8572a;
        ((ProgressBar) mainActivity.findViewById(R.id.progressBar)).setVisibility(0);
        WebView webView2 = mainActivity.f2666v;
        if (webView2 != null) {
            webView2.setVisibility(8);
        }
        mainActivity.f2662C = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int r8, String str, String str2) {
        Log.e("WebView Error", "Error occurred: " + r8 + ", " + str + ", " + str2);
        MainActivity mainActivity = this.f8572a;
        mainActivity.f2662C = true;
        WebView webView2 = mainActivity.f2666v;
        if (webView2 != null) {
            webView2.setVisibility(8);
        }
        FrameLayout frameLayout = (FrameLayout) mainActivity.findViewById(R.id.errorLayout);
        frameLayout.setVisibility(0);
        ((Button) mainActivity.findViewById(R.id.reloadButton)).setOnClickListener(new ViewOnClickListenerC2644f(mainActivity, frameLayout, 0));
        super.onReceivedError(webView, r8, str, str2);
        WebView webView3 = mainActivity.f2666v;
        if (webView3 != null) {
            webView3.clearCache(true);
        }
        WebView webView4 = mainActivity.f2666v;
        if (webView4 != null) {
            webView4.stopLoading();
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (!AbstractC0025r.m156I(valueOf, "https://yt3.ggpht.com/", false)) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        String m154G = AbstractC0025r.m154G(valueOf, "https://yt3.ggpht.com/", "https://yt4.ggpht.com/");
        try {
            C0088t c0088t = new C0088t();
            C0090v c0090v = new C0090v();
            c0090v.m302m(m154G);
            AbstractC0066A abstractC0066A = new C0162m(c0088t, new C0091w(c0090v)).m510b().f321g;
            return new WebResourceResponse("image/jpeg", "UTF-8", abstractC0066A != null ? abstractC0066A.mo250h().mo1254f() : null);
        } catch (Exception e2) {
            Log.e("WebView", "Error intercepting request: " + e2);
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        List m5120X = AbstractC2660j.m5120X("intent", "vnd.youtube", "market", "play.google", "mailto", "tel", "sms");
        if (m5120X.isEmpty()) {
            return false;
        }
        Iterator it = m5120X.iterator();
        while (it.hasNext()) {
            if (AbstractC0017j.m133K(str, (String) it.next())) {
                if (webView == null) {
                    return true;
                }
                webView.loadUrl(str);
                return true;
            }
        }
        return false;
    }
}
