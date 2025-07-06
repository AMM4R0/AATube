package p044P0;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: P0.a */
/* loaded from: classes.dex */
public final class RunnableC0417a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1078a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f1079b;

    /* renamed from: c */
    public final /* synthetic */ View f1080c;

    /* renamed from: d */
    public final /* synthetic */ Object f1081d;

    public RunnableC0417a(TextView textView, Typeface typeface, int r4) {
        this.f1080c = textView;
        this.f1081d = typeface;
        this.f1079b = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1078a) {
            case 0:
                ((BottomSheetBehavior) this.f1081d).m2063E(this.f1080c, this.f1079b, false);
                break;
            default:
                ((TextView) this.f1080c).setTypeface((Typeface) this.f1081d, this.f1079b);
                break;
        }
    }

    public RunnableC0417a(BottomSheetBehavior bottomSheetBehavior, View view, int r4) {
        this.f1081d = bottomSheetBehavior;
        this.f1080c = view;
        this.f1079b = r4;
    }
}
