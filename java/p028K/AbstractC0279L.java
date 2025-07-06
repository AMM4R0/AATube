package p028K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p006C.C0055g;

/* renamed from: K.L */
/* loaded from: classes.dex */
public abstract class AbstractC0279L {
    /* renamed from: a */
    public static String[] m764a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0305g m765b(View view, C0305g c0305g) {
        ContentInfo mo211i = c0305g.f877a.mo211i();
        Objects.requireNonNull(mo211i);
        ContentInfo m820h = AbstractC0297c.m820h(mo211i);
        ContentInfo performReceiveContent = view.performReceiveContent(m820h);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m820h ? c0305g : new C0305g(new C0055g(performReceiveContent));
    }

    /* renamed from: c */
    public static void m766c(View view, String[] strArr, InterfaceC0327r interfaceC0327r) {
        if (interfaceC0327r == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0280M(interfaceC0327r));
        }
    }
}
