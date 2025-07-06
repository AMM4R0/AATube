package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import p103k0.AbstractC2481b;
import p103k0.C2482c;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC2481b abstractC2481b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2017a = abstractC2481b.m4902f(iconCompat.f2017a, 1);
        byte[] bArr = iconCompat.f2019c;
        if (abstractC2481b.mo4901e(2)) {
            Parcel parcel = ((C2482c) abstractC2481b).f8156e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2019c = bArr;
        iconCompat.f2020d = abstractC2481b.m4903g(iconCompat.f2020d, 3);
        iconCompat.f2021e = abstractC2481b.m4902f(iconCompat.f2021e, 4);
        iconCompat.f2022f = abstractC2481b.m4902f(iconCompat.f2022f, 5);
        iconCompat.f2023g = (ColorStateList) abstractC2481b.m4903g(iconCompat.f2023g, 6);
        String str = iconCompat.f2025i;
        if (abstractC2481b.mo4901e(7)) {
            str = ((C2482c) abstractC2481b).f8156e.readString();
        }
        iconCompat.f2025i = str;
        String str2 = iconCompat.f2026j;
        if (abstractC2481b.mo4901e(8)) {
            str2 = ((C2482c) abstractC2481b).f8156e.readString();
        }
        iconCompat.f2026j = str2;
        iconCompat.f2024h = PorterDuff.Mode.valueOf(iconCompat.f2025i);
        switch (iconCompat.f2017a) {
            case -1:
                Parcelable parcelable = iconCompat.f2020d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2018b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2020d;
                if (parcelable2 != null) {
                    iconCompat.f2018b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f2019c;
                    iconCompat.f2018b = bArr3;
                    iconCompat.f2017a = 3;
                    iconCompat.f2021e = 0;
                    iconCompat.f2022f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2019c, Charset.forName("UTF-16"));
                iconCompat.f2018b = str3;
                if (iconCompat.f2017a == 2 && iconCompat.f2026j == null) {
                    iconCompat.f2026j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2018b = iconCompat.f2019c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC2481b abstractC2481b) {
        abstractC2481b.getClass();
        iconCompat.f2025i = iconCompat.f2024h.name();
        switch (iconCompat.f2017a) {
            case -1:
                iconCompat.f2020d = (Parcelable) iconCompat.f2018b;
                break;
            case 1:
            case 5:
                iconCompat.f2020d = (Parcelable) iconCompat.f2018b;
                break;
            case 2:
                iconCompat.f2019c = ((String) iconCompat.f2018b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2019c = (byte[]) iconCompat.f2018b;
                break;
            case 4:
            case 6:
                iconCompat.f2019c = iconCompat.f2018b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int r02 = iconCompat.f2017a;
        if (-1 != r02) {
            abstractC2481b.m4906j(r02, 1);
        }
        byte[] bArr = iconCompat.f2019c;
        if (bArr != null) {
            abstractC2481b.mo4905i(2);
            int length = bArr.length;
            Parcel parcel = ((C2482c) abstractC2481b).f8156e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2020d;
        if (parcelable != null) {
            abstractC2481b.m4907k(parcelable, 3);
        }
        int r03 = iconCompat.f2021e;
        if (r03 != 0) {
            abstractC2481b.m4906j(r03, 4);
        }
        int r04 = iconCompat.f2022f;
        if (r04 != 0) {
            abstractC2481b.m4906j(r04, 5);
        }
        ColorStateList colorStateList = iconCompat.f2023g;
        if (colorStateList != null) {
            abstractC2481b.m4907k(colorStateList, 6);
        }
        String str = iconCompat.f2025i;
        if (str != null) {
            abstractC2481b.mo4905i(7);
            ((C2482c) abstractC2481b).f8156e.writeString(str);
        }
        String str2 = iconCompat.f2026j;
        if (str2 != null) {
            abstractC2481b.mo4905i(8);
            ((C2482c) abstractC2481b).f8156e.writeString(str2);
        }
    }
}
