package p107m0;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.carwizard.p075li.youtube.MainActivity;
import com.carwizard.p075li.youtube.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: m0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2644f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f8569a;

    /* renamed from: b */
    public final /* synthetic */ Object f8570b;

    /* renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f8571c;

    public /* synthetic */ ViewOnClickListenerC2644f(Object obj, KeyEvent.Callback callback, int r3) {
        this.f8569a = r3;
        this.f8570b = obj;
        this.f8571c = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8569a) {
            case 0:
                MainActivity this$0 = (MainActivity) this.f8570b;
                AbstractC2492i.m4915e(this$0, "this$0");
                ((ProgressBar) this$0.findViewById(R.id.progressBar)).setVisibility(0);
                ((FrameLayout) this.f8571c).setVisibility(8);
                WebView webView = this$0.f2666v;
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                AtomicBoolean clicked = (AtomicBoolean) this.f8570b;
                AbstractC2492i.m4915e(clicked, "$clicked");
                Activity activity = (Activity) this.f8571c;
                AbstractC2492i.m4915e(activity, "$activity");
                if (!clicked.get()) {
                    activity.onBackPressed();
                    clicked.set(true);
                    break;
                }
                break;
        }
    }
}
