package p107m0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.session.MediaSession;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.carwizard.p075li.youtube.MainActivity;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: m0.h */
/* loaded from: classes.dex */
public final class C2646h extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f8573a;

    public C2646h(MainActivity mainActivity) {
        this.f8573a = mainActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        try {
            InputStream open = this.f8573a.getAssets().open("images/youtube-logo.png");
            AbstractC2492i.m4914d(open, "open(...)");
            return BitmapFactory.decodeStream(open);
        } catch (IOException e2) {
            Log.e("WebView", "Error loading default video poster: " + e2);
            return super.getDefaultVideoPoster();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        MainActivity mainActivity = this.f8573a;
        FrameLayout frameLayout = mainActivity.f2667w;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WebView webView = mainActivity.f2666v;
        if (webView != null) {
            webView.setVisibility(0);
        }
        mainActivity.f2668x = false;
        WebChromeClient.CustomViewCallback customViewCallback = mainActivity.f2669y;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        mainActivity.f2669y = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int widthDpFromConfiguration;
        if (view == null || customViewCallback == null) {
            return;
        }
        MainActivity mainActivity = this.f8573a;
        if (mainActivity.f2668x) {
            return;
        }
        widthDpFromConfiguration = mainActivity.getWidthDpFromConfiguration(mainActivity);
        mainActivity.runOnUiThread(new RunnableC2647i(mainActivity.f2667w, mainActivity, view, widthDpFromConfiguration));
        FrameLayout frameLayout = mainActivity.f2667w;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
        WebView webView = mainActivity.f2666v;
        if (webView != null) {
            webView.setVisibility(8);
        }
        mainActivity.f2668x = true;
        mainActivity.f2669y = customViewCallback;
        MediaSession mediaSession = mainActivity.f2661B;
        if (mediaSession != null) {
            mediaSession.setActive(true);
        }
    }
}
