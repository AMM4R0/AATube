package io.appmetrica.analytics.coreutils.internal.p096db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.p097io.CloseableUtilsKt;

/* loaded from: classes.dex */
public class DBUtils {
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            enhancedCursorRowToContentValues(cursor, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int r2 = 0; r2 < length; r2++) {
            int type = cursor.getType(r2);
            if (type == 0) {
                contentValues.put(columnNames[r2], cursor.getString(r2));
            } else if (type == 1) {
                contentValues.put(columnNames[r2], Long.valueOf(cursor.getLong(r2)));
            } else if (type == 2) {
                contentValues.put(columnNames[r2], Double.valueOf(cursor.getDouble(r2)));
            } else if (type == 3) {
                contentValues.put(columnNames[r2], cursor.getString(r2));
            } else if (type != 4) {
                contentValues.put(columnNames[r2], cursor.getString(r2));
            } else {
                contentValues.put(columnNames[r2], cursor.getBlob(r2));
            }
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0L;
        } finally {
            CloseableUtilsKt.closeSafely(cursor);
        }
    }
}
