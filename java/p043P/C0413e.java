package p043P;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p006C.C0055g;

/* renamed from: P.e */
/* loaded from: classes.dex */
public final class C0413e extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0412d f1075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0413e(InputConnection inputConnection, C0412d c0412d) {
        super(inputConnection, false);
        this.f1075a = c0412d;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int r5, Bundle bundle) {
        C0055g c0055g = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0055g = new C0055g(11, new C0415g(inputContentInfo));
        }
        if (this.f1075a.m1154a(c0055g, r5, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, r5, bundle);
    }
}
