package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.l6 */
/* loaded from: classes.dex */
public final class FileObserverC1989l6 extends FileObserver {

    /* renamed from: a */
    public final Consumer f6622a;

    /* renamed from: b */
    public final File f6623b;

    /* renamed from: c */
    public final C1718aa f6624c;

    public FileObserverC1989l6(File file, C1162E1 c1162e1, C1718aa c1718aa) {
        super(file.getAbsolutePath(), 4095);
        this.f6622a = c1162e1;
        this.f6623b = file;
        this.f6624c = c1718aa;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int r3, String str) {
        if (r3 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f6622a;
        C1718aa c1718aa = this.f6624c;
        File file = this.f6623b;
        c1718aa.getClass();
        consumer.consume(new File(file, str));
    }
}
