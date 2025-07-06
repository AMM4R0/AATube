package p104l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p003B.AbstractC0028b;
import p028K.AbstractC0283P;
import p044P0.RunnableC0417a;

/* renamed from: l.U */
/* loaded from: classes.dex */
public final class C2540U extends AbstractC0028b {

    /* renamed from: h */
    public final /* synthetic */ int f8295h;

    /* renamed from: i */
    public final /* synthetic */ int f8296i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f8297j;

    /* renamed from: k */
    public final /* synthetic */ C2553a0 f8298k;

    public C2540U(C2553a0 c2553a0, int r2, int r3, WeakReference weakReference) {
        this.f8298k = c2553a0;
        this.f8295h = r2;
        this.f8296i = r3;
        this.f8297j = weakReference;
    }

    @Override // p003B.AbstractC0028b
    /* renamed from: k */
    public final void mo175k(Typeface typeface) {
        int r12;
        if (Build.VERSION.SDK_INT >= 28 && (r12 = this.f8295h) != -1) {
            typeface = AbstractC2550Z.m4999a(typeface, r12, (this.f8296i & 2) != 0);
        }
        C2553a0 c2553a0 = this.f8298k;
        if (c2553a0.f8327m) {
            c2553a0.f8326l = typeface;
            TextView textView = (TextView) this.f8297j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0417a(textView, typeface, c2553a0.f8324j));
                } else {
                    textView.setTypeface(typeface, c2553a0.f8324j);
                }
            }
        }
    }

    @Override // p003B.AbstractC0028b
    /* renamed from: j */
    public final void mo174j(int r12) {
    }
}
