package androidx.emoji2.text;

import android.os.Trace;
import p017G.AbstractC0149m;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class RunnableC0623m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int r12 = AbstractC0149m.f416a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0620j.f2070j != null) {
                C0620j.m1629a().m1631c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int r13 = AbstractC0149m.f416a;
            Trace.endSection();
            throw th;
        }
    }
}
