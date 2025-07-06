package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p124s0.C2738i;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C0613c extends C2738i {
    @Override // p124s0.C2738i
    /* renamed from: k */
    public final Signature[] mo1612k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
