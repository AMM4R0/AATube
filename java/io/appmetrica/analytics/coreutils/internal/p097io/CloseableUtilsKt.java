package io.appmetrica.analytics.coreutils.internal.p097io;

import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class CloseableUtilsKt {
    public static final void closeSafely(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void closeSafely(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
