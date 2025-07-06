package p058V;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p010D0.C0109g;
import p124s0.C2738i;

/* renamed from: V.e */
/* loaded from: classes.dex */
public final class C0529e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f1444a;

    /* renamed from: b */
    public final C2738i f1445b;

    public C0529e(KeyListener keyListener) {
        C2738i c2738i = new C2738i();
        this.f1444a = keyListener;
        this.f1445b = c2738i;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int r4) {
        this.f1444a.clearMetaKeyState(view, editable, r4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1444a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int r6, KeyEvent keyEvent) {
        boolean z2;
        this.f1445b.getClass();
        if (r6 != 67 ? r6 != 112 ? false : C0109g.m344h(editable, keyEvent, true) : C0109g.m344h(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1444a.onKeyDown(view, editable, r6, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1444a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int r4, KeyEvent keyEvent) {
        return this.f1444a.onKeyUp(view, editable, r4, keyEvent);
    }
}
