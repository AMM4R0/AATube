package p104l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: l.h0 */
/* loaded from: classes.dex */
public class C2574h0 extends AbstractC2580j0 {
    @Override // p104l.AbstractC2580j0
    /* renamed from: a */
    public void mo5027a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C2583k0.m5042e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
