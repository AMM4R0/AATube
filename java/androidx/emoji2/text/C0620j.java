package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p019H.RunnableC0171a;
import p036M1.AbstractC0379e;
import p112o.C2683c;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public final class C0620j {

    /* renamed from: i */
    public static final Object f2069i = new Object();

    /* renamed from: j */
    public static volatile C0620j f2070j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f2071a;

    /* renamed from: b */
    public final C2683c f2072b;

    /* renamed from: c */
    public volatile int f2073c;

    /* renamed from: d */
    public final Handler f2074d;

    /* renamed from: e */
    public final C0616f f2075e;

    /* renamed from: f */
    public final InterfaceC0619i f2076f;

    /* renamed from: g */
    public final int f2077g;

    /* renamed from: h */
    public final C0614d f2078h;

    public C0620j(C0627q c0627q) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2071a = reentrantReadWriteLock;
        this.f2073c = 3;
        InterfaceC0619i interfaceC0619i = (InterfaceC0619i) c0627q.f2067b;
        this.f2076f = interfaceC0619i;
        int r2 = c0627q.f2066a;
        this.f2077g = r2;
        this.f2078h = (C0614d) c0627q.f2068c;
        this.f2074d = new Handler(Looper.getMainLooper());
        this.f2072b = new C2683c(0);
        C0616f c0616f = new C0616f(this);
        this.f2075e = c0616f;
        reentrantReadWriteLock.writeLock().lock();
        if (r2 == 0) {
            try {
                this.f2073c = 0;
            } catch (Throwable th) {
                this.f2071a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1630b() == 0) {
            try {
                interfaceC0619i.mo95a(new C0615e(c0616f));
            } catch (Throwable th2) {
                m1632d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0620j m1629a() {
        C0620j c0620j;
        synchronized (f2069i) {
            try {
                c0620j = f2070j;
                if (!(c0620j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0620j;
    }

    /* renamed from: b */
    public final int m1630b() {
        this.f2071a.readLock().lock();
        try {
            return this.f2073c;
        } finally {
            this.f2071a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m1631c() {
        if (!(this.f2077g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1630b() == 1) {
            return;
        }
        this.f2071a.writeLock().lock();
        try {
            if (this.f2073c == 0) {
                return;
            }
            this.f2073c = 0;
            this.f2071a.writeLock().unlock();
            C0616f c0616f = this.f2075e;
            C0620j c0620j = c0616f.f2063a;
            try {
                c0620j.f2076f.mo95a(new C0615e(c0616f));
            } catch (Throwable th) {
                c0620j.m1632d(th);
            }
        } finally {
            this.f2071a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m1632d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2071a.writeLock().lock();
        try {
            this.f2073c = 2;
            arrayList.addAll(this.f2072b);
            this.f2072b.clear();
            this.f2071a.writeLock().unlock();
            this.f2074d.post(new RunnableC0171a(arrayList, this.f2073c, th));
        } catch (Throwable th2) {
            this.f2071a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:119:0x005a, B:122:0x005f, B:124:0x0063, B:126:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x010c, B:66:0x0113, B:54:0x0118, B:56:0x0123, B:85:0x012a, B:87:0x012e, B:89:0x0134, B:91:0x0138, B:94:0x0140, B:97:0x014c, B:98:0x0151, B:100:0x015f, B:27:0x0079), top: B:118:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:119:0x005a, B:122:0x005f, B:124:0x0063, B:126:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x010c, B:66:0x0113, B:54:0x0118, B:56:0x0123, B:85:0x012a, B:87:0x012e, B:89:0x0134, B:91:0x0138, B:94:0x0140, B:97:0x014c, B:98:0x0151, B:100:0x015f, B:27:0x0079), top: B:118:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:119:0x005a, B:122:0x005f, B:124:0x0063, B:126:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x010c, B:66:0x0113, B:54:0x0118, B:56:0x0123, B:85:0x012a, B:87:0x012e, B:89:0x0134, B:91:0x0138, B:94:0x0140, B:97:0x014c, B:98:0x0151, B:100:0x015f, B:27:0x0079), top: B:118:0x005a }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence m1633e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0620j.m1633e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* renamed from: f */
    public final void m1634f(AbstractC0618h abstractC0618h) {
        AbstractC0379e.m1073d(abstractC0618h, "initCallback cannot be null");
        this.f2071a.writeLock().lock();
        try {
            if (this.f2073c != 1 && this.f2073c != 2) {
                this.f2072b.add(abstractC0618h);
                this.f2071a.writeLock().unlock();
            }
            this.f2074d.post(new RunnableC0171a(Arrays.asList(abstractC0618h), this.f2073c, (Throwable) null));
            this.f2071a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2071a.writeLock().unlock();
            throw th;
        }
    }
}
