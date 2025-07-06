package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.Y9 */
/* loaded from: classes.dex */
public final class C1669Y9 {

    /* renamed from: a */
    public final File f5725a;

    /* renamed from: b */
    public FileLock f5726b;

    /* renamed from: c */
    public RandomAccessFile f5727c;

    /* renamed from: d */
    public FileChannel f5728d;

    /* renamed from: e */
    public int f5729e;

    public C1669Y9(Context context, String str) {
        this(m3535a(context, str));
    }

    /* renamed from: a */
    public final synchronized void m3536a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f5725a, "rw");
            this.f5727c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f5728d = channel;
            if (this.f5729e == 0) {
                this.f5726b = channel.lock();
            }
            this.f5729e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void m3537b() {
        try {
            this.f5725a.getAbsolutePath();
            int r02 = this.f5729e - 1;
            this.f5729e = r02;
            if (r02 == 0) {
                AbstractC1271Ia.m2957a(this.f5726b);
            }
            AbstractC2356zn.m4699a((Closeable) this.f5727c);
            AbstractC2356zn.m4699a((Closeable) this.f5728d);
            this.f5727c = null;
            this.f5726b = null;
            this.f5728d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1669Y9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C1669Y9(File file) {
        this.f5729e = 0;
        this.f5725a = file;
    }

    /* renamed from: a */
    public static File m3535a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
