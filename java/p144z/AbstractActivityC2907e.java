package p144z;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0679C;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.FragmentC0681E;
import androidx.lifecycle.InterfaceC0708r;
import kotlin.jvm.internal.AbstractC2492i;
import p028K.InterfaceC0313k;
import p036M1.AbstractC0387m;

/* renamed from: z.e */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2907e extends Activity implements InterfaceC0708r, InterfaceC0313k {

    /* renamed from: a */
    public final C0710t f9545a = new C0710t(this);

    @Override // p028K.InterfaceC0313k
    /* renamed from: c */
    public final boolean mo877c(KeyEvent event) {
        AbstractC2492i.m4915e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC2492i.m4915e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC2492i.m4914d(decorView, "window.decorView");
        if (AbstractC0387m.m1117o(decorView, event)) {
            return true;
        }
        return AbstractC0387m.m1118p(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC2492i.m4915e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC2492i.m4914d(decorView, "window.decorView");
        if (AbstractC0387m.m1117o(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int r12 = FragmentC0681E.f2376b;
        AbstractC0679C.m1780b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC2492i.m4915e(outState, "outState");
        this.f9545a.m1797g();
        super.onSaveInstanceState(outState);
    }
}
