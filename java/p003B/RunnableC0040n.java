package p003B;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.carwizard.p075li.youtube.MainActivity;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Random;
import kotlin.jvm.internal.AbstractC2492i;
import p073c0.AbstractC0734j;
import p073c0.RunnableC0731g;
import p079e.ExecutorC0786D;

/* renamed from: B.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0040n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f66a;

    /* renamed from: b */
    public final /* synthetic */ Object f67b;

    /* renamed from: c */
    public final /* synthetic */ Object f68c;

    public /* synthetic */ RunnableC0040n(Object obj, int r2, Object obj2) {
        this.f66a = r2;
        this.f67b = obj;
        this.f68c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66a) {
            case 0:
                ((AbstractC0028b) this.f67b).mo175k((Typeface) this.f68c);
                return;
            case 1:
                ((ProfileInstallerInitializer) this.f67b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0734j.m2010a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0731g((Context) this.f68c, 0), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f68c;
                ExecutorC0786D executorC0786D = (ExecutorC0786D) this.f67b;
                executorC0786D.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0786D.m2168a();
                }
            default:
                MainActivity this$0 = (MainActivity) this.f67b;
                AbstractC2492i.m4915e(this$0, "this$0");
                String css = (String) this.f68c;
                AbstractC2492i.m4915e(css, "$css");
                WebView webView = this$0.f2666v;
                if (webView != null) {
                    webView.evaluateJavascript("(function() { var parent = document.getElementsByTagName('head').item(0); var style = document.createElement('style'); style.type = 'text/css'; style.innerHTML = '" + css + "'; parent.appendChild(style); })();", null);
                    return;
                }
                return;
        }
    }
}
