package p058V;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.AbstractC0618h;
import java.lang.ref.WeakReference;

/* renamed from: V.h */
/* loaded from: classes.dex */
public final class C0532h extends AbstractC0618h {

    /* renamed from: a */
    public final /* synthetic */ int f1450a = 0;

    /* renamed from: b */
    public final WeakReference f1451b;

    public C0532h(EditText editText) {
        this.f1451b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0618h
    /* renamed from: a */
    public void mo1387a() {
        switch (this.f1450a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f1451b.get();
                if (switchCompat != null) {
                    switchCompat.m1534c();
                    break;
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0618h
    /* renamed from: b */
    public final void mo1386b() {
        switch (this.f1450a) {
            case 0:
                C0533i.m1388a((EditText) this.f1451b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f1451b.get();
                if (switchCompat != null) {
                    switchCompat.m1534c();
                    break;
                }
                break;
        }
    }

    public C0532h(SwitchCompat switchCompat) {
        this.f1451b = new WeakReference(switchCompat);
    }
}
