package p104l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: l.i0 */
/* loaded from: classes.dex */
public final class C2577i0 extends C2574h0 {
    @Override // p104l.C2574h0, p104l.AbstractC2580j0
    /* renamed from: a */
    public void mo5027a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // p104l.AbstractC2580j0
    /* renamed from: b */
    public boolean mo5029b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
