package p006C;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p003B.C0033g;
import p003B.C0034h;
import p019H.C0179i;
import p036M1.AbstractC0379e;

/* renamed from: C.m */
/* loaded from: classes.dex */
public final class C0061m extends AbstractC0379e {
    /* renamed from: F */
    public static Font m243F(FontFamily fontFamily, int r6) {
        FontStyle fontStyle = new FontStyle((r6 & 1) != 0 ? 700 : 400, (r6 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m244G = m244G(fontStyle, font.getStyle());
        for (int r2 = 1; r2 < fontFamily.getSize(); r2++) {
            Font font2 = fontFamily.getFont(r2);
            int m244G2 = m244G(fontStyle, font2.getStyle());
            if (m244G2 < m244G) {
                font = font2;
                m244G = m244G2;
            }
        }
        return font;
    }

    /* renamed from: G */
    public static int m244G(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: i */
    public final Typeface mo230i(Context context, C0033g c0033g, Resources resources, int r10) {
        try {
            FontFamily.Builder builder = null;
            for (C0034h c0034h : c0033g.f50a) {
                try {
                    Font build = new Font.Builder(resources, c0034h.f56f).setWeight(c0034h.f52b).setSlant(c0034h.f53c ? 1 : 0).setTtcIndex(c0034h.f55e).setFontVariationSettings(c0034h.f54d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m243F(build2, r10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: j */
    public final Typeface mo231j(Context context, C0179i[] c0179iArr, int r11) {
        int r2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0179iArr.length;
            FontFamily.Builder builder = null;
            while (r2 < length) {
                C0179i c0179i = c0179iArr[r2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0179i.f561a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    r2 = openFileDescriptor == null ? r2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0179i.f563c).setSlant(c0179i.f564d ? 1 : 0).setTtcIndex(c0179i.f562b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m243F(build2, r11).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: k */
    public final Typeface mo245k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: l */
    public final Typeface mo242l(Context context, Resources resources, int r3, String str, int r5) {
        try {
            Font build = new Font.Builder(resources, r3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p036M1.AbstractC0379e
    /* renamed from: m */
    public final C0179i mo246m(int r12, C0179i[] c0179iArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
