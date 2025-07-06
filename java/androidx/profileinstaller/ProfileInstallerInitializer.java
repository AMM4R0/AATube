package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p003B.RunnableC0040n;
import p073c0.AbstractC0733i;
import p081e1.C0879e;
import p085g0.InterfaceC0912b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0912b {
    @Override // p085g0.InterfaceC0912b
    /* renamed from: a */
    public final List mo1607a() {
        return Collections.emptyList();
    }

    @Override // p085g0.InterfaceC0912b
    /* renamed from: b */
    public final Object mo1608b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0879e();
        }
        AbstractC0733i.m2009a(new RunnableC0040n(this, 1, context.getApplicationContext()));
        return new C0879e();
    }
}
