package com.carwizard.p075li.youtube;

import android.hardware.display.DisplayManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.carwizard.p075li.youtube.MainActivity;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0004a;
import p010D0.RunnableC0107e;
import p079e.AbstractActivityC0798g;
import p105l1.C2632c;
import p105l1.C2634e;
import p107m0.C2640b;
import p107m0.C2642d;
import p107m0.C2643e;
import p107m0.C2645g;
import p107m0.C2646h;
import p107m0.RunnableC2647i;
import p108m1.AbstractC2671u;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0798g {

    /* renamed from: G */
    public static final /* synthetic */ int f2659G = 0;

    /* renamed from: A */
    public final C2634e f2660A;

    /* renamed from: B */
    public MediaSession f2661B;

    /* renamed from: C */
    public boolean f2662C;

    /* renamed from: D */
    public AudioManager f2663D;

    /* renamed from: E */
    public final C2643e f2664E;

    /* renamed from: F */
    public final RunnableC0107e f2665F;

    /* renamed from: v */
    public WebView f2666v;

    /* renamed from: w */
    public FrameLayout f2667w;

    /* renamed from: x */
    public boolean f2668x;

    /* renamed from: y */
    public WebChromeClient.CustomViewCallback f2669y;

    /* renamed from: z */
    public final long f2670z;

    public MainActivity() {
        System.loadLibrary("ytaa");
        this.f2670z = -1L;
        this.f2660A = new C2634e(new C2640b());
        this.f2662C = true;
        this.f2664E = new C2643e(this);
        this.f2665F = new RunnableC0107e(17, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String getScript(MainActivity mainActivity);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int getWidthDpFromConfiguration(MainActivity mainActivity);

    private final native void makeFullscreen(MainActivity mainActivity);

    private final native String nSendMC(String str);

    private final native void onResunme(MainActivity mainActivity, boolean z2);

    /* renamed from: u */
    public static final void m2021u(MainActivity mainActivity, String str) {
        String nSendMC = mainActivity.nSendMC(str);
        WebView webView = mainActivity.f2666v;
        if (webView != null) {
            webView.evaluateJavascript(String.valueOf(nSendMC), null);
        }
    }

    private final native void updateMD(String str, long j2, MediaSession mediaSession);

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity
    public final void onBackPressed() {
        if (!this.f2668x) {
            WebView webView = this.f2666v;
            if (webView == null) {
                super.onBackPressed();
                return;
            } else if (webView.canGoBack()) {
                webView.goBack();
                return;
            } else {
                super.onBackPressed();
                return;
            }
        }
        FrameLayout frameLayout = this.f2667w;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WebView webView2 = this.f2666v;
        if (webView2 != null) {
            webView2.setVisibility(0);
        }
        this.f2668x = false;
        WebChromeClient.CustomViewCallback customViewCallback = this.f2669y;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.f2669y = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m0.a] */
    @Override // p079e.AbstractActivityC0798g, androidx.activity.AbstractActivityC0592k, p144z.AbstractActivityC2907e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder willPauseWhenDucked;
        WebSettings settings;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.f2666v = (WebView) findViewById(R.id.webView);
        this.f2667w = (FrameLayout) findViewById(R.id.webviewFullscreen);
        WebView webView = this.f2666v;
        if (webView != null) {
            webView.setWebViewClient(new C2645g(this));
        }
        WebView webView2 = this.f2666v;
        if (webView2 != null) {
            webView2.setWebChromeClient(new C2646h(this));
        }
        WebView webView3 = this.f2666v;
        FrameLayout frameLayout = null;
        if (webView3 != null && (settings = webView3.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setSupportMultipleWindows(true);
            WebSettings settings2 = webView3.getSettings();
            settings.setUserAgentString(settings2 != null ? settings2.getUserAgentString() : null);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setCacheMode(1);
            settings.setTextZoom(100);
            settings.setAllowFileAccess(true);
            settings.setAllowContentAccess(true);
        }
        if (webView3 != null) {
            webView3.setInitialScale(200);
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView3, true);
        String string = getString(R.string.mainURL);
        AbstractC2492i.m4914d(string, "getString(...)");
        WebView webView4 = this.f2666v;
        if (webView4 != null) {
            webView4.loadUrl(string);
        }
        WebView webView5 = this.f2666v;
        if (webView5 != null) {
            webView5.addJavascriptInterface(new C2642d(this, this), "ytAA");
        }
        int widthDpFromConfiguration = getWidthDpFromConfiguration(this);
        WebView webView6 = this.f2666v;
        AbstractC2492i.m4912b(webView6);
        runOnUiThread(new RunnableC2647i(frameLayout, this, webView6, widthDpFromConfiguration));
        m2023w(false, this.f2670z, 0L);
        Object systemService = getSystemService("audio");
        AbstractC2492i.m4913c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f2663D = (AudioManager) systemService;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        ?? r02 = new AudioManager.OnAudioFocusChangeListener() { // from class: m0.a
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int r11) {
                int r03 = MainActivity.f2659G;
                MainActivity this$0 = MainActivity.this;
                AbstractC2492i.m4915e(this$0, "this$0");
                if (r11 == -3) {
                    Log.i("YTubeAA", "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK - Lowering volume");
                    if (this$0.f2663D == null) {
                        AbstractC2492i.m4918h("audioManager");
                        throw null;
                    }
                    int streamVolume = (int) (r11.getStreamVolume(3) * 0.2d);
                    AudioManager audioManager = this$0.f2663D;
                    if (audioManager != null) {
                        audioManager.setStreamVolume(3, streamVolume, 0);
                        return;
                    } else {
                        AbstractC2492i.m4918h("audioManager");
                        throw null;
                    }
                }
                if (r11 == -2) {
                    Log.i("YTubeAA", "AUDIOFOCUS_LOSS_TRANSIENT - Ignoring transient loss");
                    return;
                }
                if (r11 == -1) {
                    Log.i("YTubeAA", "AUDIOFOCUS_LOSS - Ignoring permanent loss");
                    return;
                }
                if (r11 != 1) {
                    return;
                }
                Log.i("YTubeAA", "AUDIOFOCUS_GAIN - Resuming playback");
                AudioManager audioManager2 = this$0.f2663D;
                if (audioManager2 == null) {
                    AbstractC2492i.m4918h("audioManager");
                    throw null;
                }
                int streamMaxVolume = audioManager2.getStreamMaxVolume(3);
                AudioManager audioManager3 = this$0.f2663D;
                if (audioManager3 != null) {
                    audioManager3.setStreamVolume(3, streamMaxVolume, 0);
                } else {
                    AbstractC2492i.m4918h("audioManager");
                    throw null;
                }
            }
        };
        audioAttributes = AbstractC0004a.m27e().setAudioAttributes(build);
        acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
        onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(r02);
        willPauseWhenDucked = onAudioFocusChangeListener.setWillPauseWhenDucked(false);
        willPauseWhenDucked.build();
    }

    @Override // p079e.AbstractActivityC0798g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Handler m2022v = m2022v();
        if (m2022v != null) {
            m2022v.removeCallbacksAndMessages(null);
        }
        MediaSession mediaSession = this.f2661B;
        if (mediaSession != null) {
            mediaSession.release();
        }
        WebView webView = this.f2666v;
        if (webView != null) {
            webView.clearHistory();
        }
        WebView webView2 = this.f2666v;
        if (webView2 != null) {
            webView2.clearCache(true);
        }
        WebView webView3 = this.f2666v;
        if (webView3 != null) {
            webView3.removeAllViews();
        }
        WebView webView4 = this.f2666v;
        if (webView4 != null) {
            webView4.destroy();
        }
    }

    @Override // p079e.AbstractActivityC0798g, android.app.Activity
    public final void onPause() {
        super.onPause();
        Log.i("YTubeAA", "MediaSession deactivated while app is on Pause");
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        AbstractC2492i.m4915e(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        WebView webView = this.f2666v;
        if (webView != null) {
            webView.restoreState(savedInstanceState);
        }
    }

    @Override // p079e.AbstractActivityC0798g, android.app.Activity
    public final void onResume() {
        int displayId;
        Display display;
        boolean z2 = true;
        super.onResume();
        WebView webView = this.f2666v;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.f2666v;
        if (webView2 != null) {
            webView2.resumeTimers();
        }
        MediaSession mediaSession = this.f2661B;
        if (mediaSession == null) {
            m2023w(false, this.f2670z, 0L);
        } else {
            mediaSession.setActive(true);
            m2024x(false, this.f2670z);
            WebView webView3 = this.f2666v;
            updateMD(webView3 != null ? webView3.getTitle() : null, 0L, this.f2661B);
        }
        Log.i("YTubeAA", "MediaSession resumed");
        Map m5127d0 = AbstractC2671u.m5127d0(new C2632c(0, 0), new C2632c(1, 21473), new C2632c(4, 6174));
        Object systemService = getSystemService("display");
        AbstractC2492i.m4913c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        ((DisplayManager) systemService).getDisplays();
        if (Build.VERSION.SDK_INT >= 30) {
            display = getDisplay();
            displayId = display != null ? display.getDisplayId() : 0;
        } else {
            Object systemService2 = getSystemService("window");
            AbstractC2492i.m4913c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
            displayId = ((WindowManager) systemService2).getDefaultDisplay().getDisplayId();
        }
        Integer num = (Integer) m5127d0.get(Integer.valueOf(displayId));
        if ((num != null ? num.intValue() : 0) == 0) {
            Object systemService3 = getSystemService("display");
            AbstractC2492i.m4913c(systemService3, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            if (((DisplayManager) systemService3).getDisplays().length != 1) {
                z2 = false;
                onResunme(this, z2);
            }
        }
        makeFullscreen(this);
        Log.i("YTubeAA", "Fullscreen mode activated for secondary display");
        onResunme(this, z2);
    }

    @Override // androidx.activity.AbstractActivityC0592k, p144z.AbstractActivityC2907e, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC2492i.m4915e(outState, "outState");
        super.onSaveInstanceState(outState);
        WebView webView = this.f2666v;
        if (webView != null) {
            webView.saveState(outState);
        }
    }

    @Override // p079e.AbstractActivityC0798g, android.app.Activity
    public final void onStart() {
        super.onStart();
        Handler m2022v = m2022v();
        RunnableC0107e runnableC0107e = this.f2665F;
        m2022v.removeCallbacks(runnableC0107e);
        m2022v().postDelayed(runnableC0107e, 500L);
    }

    @Override // p079e.AbstractActivityC0798g, android.app.Activity
    public final void onStop() {
        super.onStop();
        Handler m2022v = m2022v();
        if (m2022v != null) {
            m2022v.removeCallbacksAndMessages(null);
        }
        Log.i("YTubeAA", "MediaSession deactivated while app is in background");
    }

    /* renamed from: v */
    public final Handler m2022v() {
        return (Handler) this.f2660A.m5093a();
    }

    /* renamed from: w */
    public final void m2023w(boolean z2, long j2, long j3) {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        if (this.f2661B == null) {
            MediaSession mediaSession = new MediaSession(this, "YTube AA MediaSession");
            mediaSession.setCallback(this.f2664E);
            mediaSession.setActive(true);
            mediaSession.setFlags(3);
            this.f2661B = mediaSession;
        }
        MediaSession mediaSession2 = this.f2661B;
        if (mediaSession2 != null) {
            mediaSession2.setActive(true);
        }
        m2024x(z2, j2);
        WebView webView = this.f2666v;
        updateMD(webView != null ? webView.getTitle() : null, j3, this.f2661B);
    }

    /* renamed from: x */
    public final void m2024x(boolean z2, long j2) {
        PlaybackState build = new PlaybackState.Builder().setState(z2 ? 3 : 2, j2, 1.0f).setActions(560L).build();
        AbstractC2492i.m4914d(build, "build(...)");
        MediaSession mediaSession = this.f2661B;
        if (mediaSession != null) {
            mediaSession.setPlaybackState(build);
        }
    }
}
