package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2660j;

/* renamed from: io.appmetrica.analytics.impl.d7 */
/* loaded from: classes.dex */
public final class C1790d7 {

    /* renamed from: a */
    public final InterfaceC1367M6 f6077a;

    /* renamed from: b */
    public final List f6078b;

    /* renamed from: c */
    public final boolean f6079c;

    public C1790d7(InterfaceC1367M6 interfaceC1367M6, ArrayList arrayList, boolean z2) {
        this.f6077a = interfaceC1367M6;
        this.f6078b = arrayList;
        this.f6079c = z2;
    }

    /* renamed from: a */
    public final String m3730a(Context context, InterfaceC1715a7 interfaceC1715a7) {
        File parentFile;
        try {
            File mo3081a = this.f6077a.mo3081a(context, interfaceC1715a7.mo2851b());
            if (!mo3081a.exists() && (parentFile = mo3081a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                m3731a(context, interfaceC1715a7.mo2850a(), mo3081a);
            }
            return mo3081a.getPath();
        } catch (Throwable unused) {
            return interfaceC1715a7.mo2851b();
        }
    }

    /* renamed from: a */
    public final void m3731a(Context context, String str, File file) {
        List list = this.f6078b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File mo3081a = ((InterfaceC1367M6) it.next()).mo3081a(context, str);
            if (mo3081a.exists()) {
                try {
                    if (this.f6079c) {
                        FileUtils.copyToNullable(mo3081a, file);
                    } else {
                        FileUtils.move(mo3081a, file);
                    }
                    String path = mo3081a.getPath();
                    String path2 = file.getPath();
                    for (String str2 : AbstractC2660j.m5120X("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f6079c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
