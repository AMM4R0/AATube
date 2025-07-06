package p031L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: L.a */
/* loaded from: classes.dex */
public final class C0347a extends ClickableSpan {

    /* renamed from: a */
    public final int f980a;

    /* renamed from: b */
    public final C0356j f981b;

    /* renamed from: c */
    public final int f982c;

    public C0347a(int r12, C0356j c0356j, int r3) {
        this.f980a = r12;
        this.f981b = c0356j;
        this.f982c = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f980a);
        this.f981b.f998a.performAction(this.f982c, bundle);
    }
}
