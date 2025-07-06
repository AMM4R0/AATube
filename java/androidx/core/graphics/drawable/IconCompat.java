package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p009D.AbstractC0097c;
import p009D.AbstractC0099e;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f2016k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f2018b;

    /* renamed from: j */
    public String f2026j;

    /* renamed from: a */
    public int f2017a = -1;

    /* renamed from: c */
    public byte[] f2019c = null;

    /* renamed from: d */
    public Parcelable f2020d = null;

    /* renamed from: e */
    public int f2021e = 0;

    /* renamed from: f */
    public int f2022f = 0;

    /* renamed from: g */
    public ColorStateList f2023g = null;

    /* renamed from: h */
    public PorterDuff.Mode f2024h = f2016k;

    /* renamed from: i */
    public String f2025i = null;

    /* renamed from: a */
    public static Bitmap m1586a(Bitmap bitmap, boolean z2) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z2) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m1587b(int r3) {
        if (r3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2019c = null;
        iconCompat.f2020d = null;
        iconCompat.f2022f = 0;
        iconCompat.f2023g = null;
        iconCompat.f2024h = f2016k;
        iconCompat.f2025i = null;
        iconCompat.f2017a = 2;
        iconCompat.f2021e = r3;
        iconCompat.f2018b = "";
        iconCompat.f2026j = "";
        return iconCompat;
    }

    /* renamed from: c */
    public final int m1588c() {
        int r02 = this.f2017a;
        if (r02 != -1) {
            if (r02 == 2) {
                return this.f2021e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int r03 = Build.VERSION.SDK_INT;
        Object obj = this.f2018b;
        if (r03 >= 28) {
            return AbstractC0099e.m328a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    /* renamed from: d */
    public final Uri m1589d() {
        int r02 = this.f2017a;
        if (r02 == -1) {
            return AbstractC0097c.m323a(this.f2018b);
        }
        if (r02 == 4 || r02 == 6) {
            return Uri.parse((String) this.f2018b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2017a == -1) {
            return String.valueOf(this.f2018b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2017a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2017a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2018b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2018b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2026j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1588c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2021e);
                if (this.f2022f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2022f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2018b);
                break;
        }
        if (this.f2023g != null) {
            sb.append(" tint=");
            sb.append(this.f2023g);
        }
        if (this.f2024h != f2016k) {
            sb.append(" mode=");
            sb.append(this.f2024h);
        }
        sb.append(")");
        return sb.toString();
    }
}
