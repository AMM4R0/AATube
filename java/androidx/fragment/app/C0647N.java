package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.N */
/* loaded from: classes.dex */
public final class C0647N extends Writer {

    /* renamed from: b */
    public final StringBuilder f2203b = new StringBuilder(128);

    /* renamed from: a */
    public final String f2202a = "FragmentManager";

    /* renamed from: b */
    public final void m1726b() {
        StringBuilder sb = this.f2203b;
        if (sb.length() > 0) {
            Log.d(this.f2202a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1726b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1726b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int r5, int r6) {
        for (int r02 = 0; r02 < r6; r02++) {
            char c = cArr[r5 + r02];
            if (c == '\n') {
                m1726b();
            } else {
                this.f2203b.append(c);
            }
        }
    }
}
