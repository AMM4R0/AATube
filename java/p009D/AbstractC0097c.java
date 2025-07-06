package p009D;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: D.c */
/* loaded from: classes.dex */
public abstract class AbstractC0097c {
    /* renamed from: a */
    public static Uri m323a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0099e.m331d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    /* renamed from: b */
    public static Drawable m324b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* renamed from: c */
    public static Icon m325c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int r02 = iconCompat.f2017a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (r02) {
            case -1:
                return (Icon) iconCompat.f2018b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2018b);
                break;
            case 2:
                if (r02 == -1) {
                    int r8 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f2018b;
                    if (r8 >= 28) {
                        str = AbstractC0099e.m329b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        }
                    }
                } else {
                    if (r02 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.f2026j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f2018b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.f2026j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f2021e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2018b, iconCompat.f2021e, iconCompat.f2022f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2018b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.m1586a((Bitmap) iconCompat.f2018b, false));
                    break;
                } else {
                    createWithBitmap = AbstractC0098d.m327b((Bitmap) iconCompat.f2018b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = AbstractC0100f.m332a(iconCompat.m1589d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m1589d());
                    }
                    Uri m1589d = iconCompat.m1589d();
                    String scheme = m1589d.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(m1589d);
                        } catch (Exception e5) {
                            Log.w("IconCompat", "Unable to load image from URI: " + m1589d, e5);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f2018b));
                        } catch (FileNotFoundException e6) {
                            Log.w("IconCompat", "Unable to load image from path: " + m1589d, e6);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m1589d());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m1586a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = AbstractC0098d.m327b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.f2023g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f2024h;
        if (mode != IconCompat.f2016k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
