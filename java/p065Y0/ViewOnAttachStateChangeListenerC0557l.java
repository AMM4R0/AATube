package p065Y0;

import android.view.View;
import java.util.WeakHashMap;
import p028K.AbstractC0270C;
import p028K.AbstractC0283P;

/* renamed from: Y0.l */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0557l implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0270C.m696c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
