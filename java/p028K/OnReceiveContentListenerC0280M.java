package p028K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p006C.C0055g;
import p046Q.C0443q;

/* renamed from: K.M */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC0280M implements OnReceiveContentListener {

    /* renamed from: a */
    public final InterfaceC0327r f837a;

    public OnReceiveContentListenerC0280M(InterfaceC0327r interfaceC0327r) {
        this.f837a = interfaceC0327r;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0305g c0305g = new C0305g(new C0055g(contentInfo));
        C0305g m1198a = ((C0443q) this.f837a).m1198a(view, c0305g);
        if (m1198a == null) {
            return null;
        }
        if (m1198a == c0305g) {
            return contentInfo;
        }
        ContentInfo mo211i = m1198a.f877a.mo211i();
        Objects.requireNonNull(mo211i);
        return AbstractC0297c.m820h(mo211i);
    }
}
