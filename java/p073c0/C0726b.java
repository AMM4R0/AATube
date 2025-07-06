package p073c0;

import android.content.res.AssetManager;
import android.os.Build;
import io.appmetrica.analytics.impl.C1842f9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: c0.b */
/* loaded from: classes.dex */
public final class C0726b {

    /* renamed from: a */
    public final Executor f2616a;

    /* renamed from: b */
    public final InterfaceC0729e f2617b;

    /* renamed from: c */
    public final byte[] f2618c;

    /* renamed from: d */
    public final File f2619d;

    /* renamed from: e */
    public final String f2620e;

    /* renamed from: f */
    public boolean f2621f = false;

    /* renamed from: g */
    public C0727c[] f2622g;

    /* renamed from: h */
    public byte[] f2623h;

    public C0726b(AssetManager assetManager, Executor executor, InterfaceC0729e interfaceC0729e, String str, File file) {
        this.f2616a = executor;
        this.f2617b = interfaceC0729e;
        this.f2620e = str;
        this.f2619d = file;
        int r12 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (r12 >= 24 && r12 <= 33) {
            switch (r12) {
                case 24:
                case C1842f9.f6211H /* 25 */:
                    bArr = AbstractC0730f.f2640h;
                    break;
                case C1842f9.f6212I /* 26 */:
                    bArr = AbstractC0730f.f2639g;
                    break;
                case C1842f9.f6213J /* 27 */:
                    bArr = AbstractC0730f.f2638f;
                    break;
                case 28:
                case C1842f9.f6214K /* 29 */:
                case 30:
                    bArr = AbstractC0730f.f2637e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = AbstractC0730f.f2636d;
                    break;
            }
        }
        this.f2618c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m1986a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2617b.mo209g();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m1987b(final int r2, final Serializable serializable) {
        this.f2616a.execute(new Runnable() { // from class: c0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0726b.this.f2617b.mo207e(r2, serializable);
            }
        });
    }
}
