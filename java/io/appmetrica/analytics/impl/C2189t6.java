package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.t6 */
/* loaded from: classes.dex */
public final class C2189t6 {

    /* renamed from: a */
    public final C1718aa f7147a;

    /* renamed from: b */
    public final C2014m6 f7148b;

    /* renamed from: c */
    public final Context f7149c;

    /* renamed from: d */
    public final C1693Z9 f7150d;

    public C2189t6(Context context) {
        this(context, new C1718aa(), new C2014m6(), C1693Z9.m3573a(context));
    }

    /* renamed from: a */
    public final void m4443a(C1775ch c1775ch) {
        boolean mkdir;
        C2267w9 m3574a;
        PrintWriter printWriter;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f7149c);
        this.f7148b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            try {
                if (crashesDirectory.exists()) {
                    if (!crashesDirectory.isDirectory()) {
                        if (!crashesDirectory.delete()) {
                            return;
                        } else {
                            mkdir = crashesDirectory.mkdir();
                        }
                    }
                    C1748bf c1748bf = c1775ch.f6054e.f6457a;
                    String str = c1748bf.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c1748bf.f5921a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    m3574a = this.f7150d.m3574a(str);
                    m3574a.f7343a.lock();
                    m3574a.f7344b.m3536a();
                    this.f7147a.getClass();
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter.write(new C1869gb(c1775ch.f6050a, c1775ch.f6054e, c1775ch.f6053d).m3880k());
                    AbstractC2356zn.m4699a((Closeable) printWriter);
                    m3574a.m4536c();
                    return;
                }
                mkdir = crashesDirectory.mkdir();
                printWriter.write(new C1869gb(c1775ch.f6050a, c1775ch.f6054e, c1775ch.f6053d).m3880k());
                AbstractC2356zn.m4699a((Closeable) printWriter);
                m3574a.m4536c();
                return;
            } catch (Throwable unused) {
                AbstractC2356zn.m4699a((Closeable) printWriter);
                m3574a.m4536c();
                return;
            }
            m3574a.f7343a.lock();
            m3574a.f7344b.m3536a();
            this.f7147a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
            printWriter = null;
        }
        if (!mkdir) {
            return;
        }
        C1748bf c1748bf2 = c1775ch.f6054e.f6457a;
        String str2 = c1748bf2.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c1748bf2.f5921a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        m3574a = this.f7150d.m3574a(str2);
    }

    public C2189t6(Context context, C1718aa c1718aa, C2014m6 c2014m6, C1693Z9 c1693z9) {
        this.f7149c = context;
        this.f7147a = c1718aa;
        this.f7148b = c2014m6;
        this.f7150d = c1693z9;
    }
}
