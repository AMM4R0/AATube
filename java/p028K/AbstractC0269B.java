package p028K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p124s0.C2738i;

/* renamed from: K.B */
/* loaded from: classes.dex */
public abstract class AbstractC0269B {

    /* renamed from: a */
    public int f830a;

    /* renamed from: b */
    public int f831b;

    /* renamed from: c */
    public int f832c;

    /* renamed from: d */
    public Object f833d;

    public AbstractC0269B() {
        if (C2738i.f8989b == null) {
            C2738i.f8989b = new C2738i();
        }
    }

    /* renamed from: a */
    public int m689a(int r3) {
        if (r3 < this.f832c) {
            return ((ByteBuffer) this.f833d).getShort(this.f831b + r3);
        }
        return 0;
    }

    /* renamed from: b */
    public abstract Object mo690b(View view);

    /* renamed from: c */
    public abstract void mo691c(View view, Object obj);

    /* renamed from: d */
    public void m692d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f831b) {
            mo691c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f831b) {
            tag = mo690b(view);
        } else {
            tag = view.getTag(this.f830a);
            if (!((Class) this.f833d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo693e(tag, obj)) {
            View.AccessibilityDelegate m770c = AbstractC0283P.m770c(view);
            C0295b c0295b = m770c == null ? null : m770c instanceof C0293a ? ((C0293a) m770c).f854a : new C0295b(m770c);
            if (c0295b == null) {
                c0295b = new C0295b();
            }
            AbstractC0283P.m779l(view, c0295b);
            view.setTag(this.f830a, obj);
            AbstractC0283P.m774g(view, this.f832c);
        }
    }

    /* renamed from: e */
    public abstract boolean mo693e(Object obj, Object obj2);
}
