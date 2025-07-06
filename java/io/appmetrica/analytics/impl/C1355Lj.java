package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.p097io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Lj */
/* loaded from: classes.dex */
public final class C1355Lj {

    /* renamed from: a */
    public final C1359Ln f5011a;

    /* renamed from: b */
    public final String f5012b = "startup_state";

    /* renamed from: c */
    public final AESEncrypter f5013c;

    public C1355Lj(C1359Ln c1359Ln) {
        this.f5011a = c1359Ln;
        C1707a c1707a = new C1707a(C2018ma.m4192h().m4199e());
        this.f5013c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c1707a.m3580b(), c1707a.m3579a());
    }

    /* renamed from: a */
    public final void m3061a(Context context) {
        SQLiteDatabase readableDatabase = C1765c7.m3695a(context).m3706h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                C2244vb m3060a = m3060a(readableDatabase);
                C1132Cl c1132Cl = new C1132Cl(new C1190F4(new C1140D4()));
                if (m3060a != null) {
                    m3059a(this.f5011a, c1132Cl, m3060a);
                    c1132Cl.f4603p = m3060a.f7293c;
                    c1132Cl.f4605r = m3060a.f7292b;
                }
                C1157Dl c1157Dl = new C1157Dl(c1132Cl);
                AbstractC2030mm m4116a = C2005lm.m4116a(C1157Dl.class);
                m4116a.mo3837a(context, m4116a.mo3839d(context)).save(c1157Dl);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m3059a(C1359Ln c1359Ln, C1132Cl c1132Cl, C2244vb c2244vb) {
        String optStringOrNull;
        synchronized (c1359Ln) {
            optStringOrNull = JsonUtils.optStringOrNull(c1359Ln.f5018a.m3193a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(c2244vb.f7294d)) {
                c1359Ln.m3069a(c2244vb.f7294d);
            }
            if (!TextUtils.isEmpty(c2244vb.f7295e)) {
                c1359Ln.m3071b(c2244vb.f7295e);
            }
            if (TextUtils.isEmpty(c2244vb.f7291a)) {
                return;
            }
            c1132Cl.f4588a = c2244vb.f7291a;
        }
    }

    /* renamed from: a */
    public final C2244vb m3060a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f5012b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        C2244vb c2244vb = (C2244vb) MessageNano.mergeFrom(new C2244vb(), this.f5013c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return c2244vb;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtilsKt.closeSafely(cursor);
        return null;
    }
}
