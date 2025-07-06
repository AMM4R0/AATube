package p028K;

import android.text.TextUtils;
import android.view.View;

/* renamed from: K.z */
/* loaded from: classes.dex */
public final class C0343z extends AbstractC0269B {

    /* renamed from: e */
    public final /* synthetic */ int f946e;

    public C0343z(int r12, Class cls, int r3, int r4, int r5) {
        this.f946e = r5;
        this.f830a = r12;
        this.f833d = cls;
        this.f832c = r3;
        this.f831b = r4;
    }

    @Override // p028K.AbstractC0269B
    /* renamed from: b */
    public final Object mo690b(View view) {
        switch (this.f946e) {
            case 0:
                return Boolean.valueOf(AbstractC0276I.m746d(view));
            case 1:
                return AbstractC0276I.m744b(view);
            case 2:
                return AbstractC0278K.m760b(view);
            default:
                return Boolean.valueOf(AbstractC0276I.m745c(view));
        }
    }

    @Override // p028K.AbstractC0269B
    /* renamed from: c */
    public final void mo691c(View view, Object obj) {
        switch (this.f946e) {
            case 0:
                AbstractC0276I.m752j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0276I.m750h(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC0278K.m763e(view, (CharSequence) obj);
                break;
            default:
                AbstractC0276I.m749g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p028K.AbstractC0269B
    /* renamed from: e */
    public final boolean mo693e(Object obj, Object obj2) {
        switch (this.f946e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
