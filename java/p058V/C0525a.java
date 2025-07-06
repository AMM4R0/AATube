package p058V;

import android.text.Editable;
import androidx.emoji2.text.C0630t;

/* renamed from: V.a */
/* loaded from: classes.dex */
public final class C0525a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f1435a = new Object();

    /* renamed from: b */
    public static volatile C0525a f1436b;

    /* renamed from: c */
    public static Class f1437c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1437c;
        return cls != null ? new C0630t(cls, charSequence) : super.newEditable(charSequence);
    }
}
