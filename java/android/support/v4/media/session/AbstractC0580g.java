package android.support.v4.media.session;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.InterfaceC2487d;
import org.xmlpull.v1.XmlSerializer;
import p009D.AbstractC0095a;
import p016F1.AbstractC0133a;
import p016F1.C0135c;
import p028K.AbstractC0283P;
import p028K.AbstractC0318m0;
import p028K.InterfaceC0292Z;
import p051R1.C0477g;
import p051R1.C0480j;
import p057U.C0524b;
import p104l.AbstractC2614u1;
import p104l.C2537S0;
import p104l.ViewOnLongClickListenerC2620w1;
import p131u1.InterfaceC2810l;
import p143y1.InterfaceC2898c;

/* renamed from: android.support.v4.media.session.g */
/* loaded from: classes.dex */
public abstract class AbstractC0580g implements InterfaceC0292Z {

    /* renamed from: a */
    public static Boolean f1638a;

    /* renamed from: b */
    public static Boolean f1639b;

    /* renamed from: c */
    public static Boolean f1640c;

    /* renamed from: d */
    public static Boolean f1641d;

    /* renamed from: A */
    public static Bundle m1439A(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m1446k(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: d */
    public static final void m1440d(Logger logger, AbstractC0133a abstractC0133a, C0135c c0135c, String str) {
        logger.fine(c0135c.f388b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC0133a.f381a);
    }

    /* renamed from: e */
    public static void m1441e(StringBuilder sb, Object obj, InterfaceC2810l interfaceC2810l) {
        if (interfaceC2810l != null) {
            sb.append((CharSequence) interfaceC2810l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m1442f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0095a.m319h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                AbstractC0095a.m319h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0095a.m320i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: g */
    public static void m1443g(long j2, C0477g c0477g, int r22, ArrayList arrayList, int r24, int r25, ArrayList arrayList2) {
        int r6;
        int r2;
        int r8;
        int r18;
        C0477g c0477g2;
        int r12 = r22;
        if (r24 >= r25) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int r4 = r24; r4 < r25; r4++) {
            if (((C0480j) arrayList.get(r4)).mo1220b() < r12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0480j c0480j = (C0480j) arrayList.get(r24);
        C0480j c0480j2 = (C0480j) arrayList.get(r25 - 1);
        int r13 = -1;
        if (r12 == c0480j.mo1220b()) {
            int intValue = ((Number) arrayList2.get(r24)).intValue();
            int r23 = r24 + 1;
            C0480j c0480j3 = (C0480j) arrayList.get(r23);
            r6 = r23;
            r2 = intValue;
            c0480j = c0480j3;
        } else {
            r6 = r24;
            r2 = -1;
        }
        if (c0480j.mo1224g(r12) == c0480j2.mo1224g(r12)) {
            int min = Math.min(c0480j.mo1220b(), c0480j2.mo1220b());
            int r7 = 0;
            for (int r132 = r12; r132 < min && c0480j.mo1224g(r132) == c0480j2.mo1224g(r132); r132++) {
                r7++;
            }
            long j3 = 4;
            long j4 = (c0477g.f1217b / j3) + j2 + 2 + r7 + 1;
            c0477g.m1248C(-r7);
            c0477g.m1248C(r2);
            int r72 = r7 + r12;
            while (r12 < r72) {
                c0477g.m1248C(c0480j.mo1224g(r12) & KotlinVersion.MAX_COMPONENT_VALUE);
                r12++;
            }
            if (r6 + 1 == r25) {
                if (r72 != ((C0480j) arrayList.get(r6)).mo1220b()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0477g.m1248C(((Number) arrayList2.get(r6)).intValue());
                return;
            } else {
                C0477g c0477g3 = new C0477g();
                c0477g.m1248C(((int) ((c0477g3.f1217b / j3) + j4)) * (-1));
                m1443g(j4, c0477g3, r72, arrayList, r6, r25, arrayList2);
                c0477g.m1273y(c0477g3);
                return;
            }
        }
        int r42 = 1;
        for (int r3 = r6 + 1; r3 < r25; r3++) {
            if (((C0480j) arrayList.get(r3 - 1)).mo1224g(r12) != ((C0480j) arrayList.get(r3)).mo1224g(r12)) {
                r42++;
            }
        }
        long j5 = 4;
        long j6 = (c0477g.f1217b / j5) + j2 + 2 + (r42 * 2);
        c0477g.m1248C(r42);
        c0477g.m1248C(r2);
        for (int r26 = r6; r26 < r25; r26++) {
            int mo1224g = ((C0480j) arrayList.get(r26)).mo1224g(r12);
            if (r26 == r6 || mo1224g != ((C0480j) arrayList.get(r26 - 1)).mo1224g(r12)) {
                c0477g.m1248C(mo1224g & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        C0477g c0477g4 = new C0477g();
        int r73 = r6;
        while (r73 < r25) {
            byte mo1224g2 = ((C0480j) arrayList.get(r73)).mo1224g(r12);
            int r32 = r73 + 1;
            int r43 = r32;
            while (true) {
                if (r43 >= r25) {
                    r8 = r25;
                    break;
                } else {
                    if (mo1224g2 != ((C0480j) arrayList.get(r43)).mo1224g(r12)) {
                        r8 = r43;
                        break;
                    }
                    r43++;
                }
            }
            if (r32 == r8 && r12 + 1 == ((C0480j) arrayList.get(r73)).mo1220b()) {
                c0477g.m1248C(((Number) arrayList2.get(r73)).intValue());
                r18 = r8;
                c0477g2 = c0477g4;
            } else {
                c0477g.m1248C(((int) ((c0477g4.f1217b / j5) + j6)) * r13);
                r18 = r8;
                c0477g2 = c0477g4;
                m1443g(j6, c0477g4, r12 + 1, arrayList, r73, r8, arrayList2);
            }
            c0477g4 = c0477g2;
            r73 = r18;
            r13 = -1;
        }
        c0477g.m1273y(c0477g4);
    }

    /* renamed from: i */
    public static ImageView.ScaleType m1444i(int r12) {
        return r12 != 0 ? r12 != 1 ? r12 != 2 ? r12 != 3 ? r12 != 5 ? r12 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: j */
    public static final void m1445j(int r3, int r4) {
        if (r3 <= r4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + r3 + ") is greater than size (" + r4 + ").");
    }

    /* renamed from: k */
    public static void m1446k(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(AbstractC0580g.class.getClassLoader());
        }
    }

    /* renamed from: l */
    public static final String m1447l(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* renamed from: m */
    public static ColorStateList m1448m(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0318m0.m926t(drawable)) {
            return null;
        }
        colorStateList = AbstractC0318m0.m910d(drawable).getColorStateList();
        return colorStateList;
    }

    /* renamed from: n */
    public static Drawable m1449n(Context context, int r2) {
        return C2537S0.m4973d().m4980f(context, r2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: o */
    public static final Class m1450o(InterfaceC2898c interfaceC2898c) {
        AbstractC2492i.m4915e(interfaceC2898c, "<this>");
        Class mo4909a = ((InterfaceC2487d) interfaceC2898c).mo4909a();
        if (!mo4909a.isPrimitive()) {
            return mo4909a;
        }
        String name = mo4909a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return mo4909a;
    }

    /* renamed from: p */
    public static final int m1451p(int r12, int r2, int r3) {
        if (r3 > 0) {
            if (r12 >= r2) {
                return r2;
            }
            int r02 = r2 % r3;
            if (r02 < 0) {
                r02 += r3;
            }
            int r13 = r12 % r3;
            if (r13 < 0) {
                r13 += r3;
            }
            int r03 = (r02 - r13) % r3;
            if (r03 < 0) {
                r03 += r3;
            }
            return r2 - r03;
        }
        if (r3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (r12 <= r2) {
            return r2;
        }
        int r32 = -r3;
        int r14 = r12 % r32;
        if (r14 < 0) {
            r14 += r32;
        }
        int r04 = r2 % r32;
        if (r04 < 0) {
            r04 += r32;
        }
        int r15 = (r14 - r04) % r32;
        if (r15 < 0) {
            r15 += r32;
        }
        return r2 + r15;
    }

    /* renamed from: q */
    public static boolean m1452q(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1638a == null) {
            f1638a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f1638a.booleanValue()) {
            return false;
        }
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 24) {
            return true;
        }
        if (f1639b == null) {
            f1639b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f1639b.booleanValue() && r02 < 26;
    }

    /* renamed from: t */
    public static void m1453t(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    /* renamed from: u */
    public static C0524b m1454u(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int r02 = duplicate.getShort() & 65535;
        if (r02 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int r3 = 0;
        while (true) {
            if (r3 >= r02) {
                j2 = -1;
                break;
            }
            int r8 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == r8) {
                break;
            }
            r3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int r12 = 0; r12 < j3; r12++) {
                int r03 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == r03 || 1701669481 == r03) {
                    duplicate.position((int) (j4 + j2));
                    C0524b c0524b = new C0524b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0524b.f833d = duplicate;
                    c0524b.f830a = position;
                    int r2 = position - duplicate.getInt(position);
                    c0524b.f831b = r2;
                    c0524b.f832c = ((ByteBuffer) c0524b.f833d).getShort(r2);
                    return c0524b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m1455v(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.AbstractC0580g.m1455v(android.content.Context):java.lang.String");
    }

    /* renamed from: w */
    public static void m1456w(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        AbstractC0095a.m319h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: x */
    public static void m1457x(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* renamed from: y */
    public static void m1458y(Drawable drawable, int r12) {
        AbstractC0095a.m318g(drawable, r12);
    }

    /* renamed from: z */
    public static void m1459z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2614u1.m5079a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC2620w1 viewOnLongClickListenerC2620w1 = ViewOnLongClickListenerC2620w1.f8506k;
        if (viewOnLongClickListenerC2620w1 != null && viewOnLongClickListenerC2620w1.f8508a == view) {
            ViewOnLongClickListenerC2620w1.m5088b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC2620w1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC2620w1 viewOnLongClickListenerC2620w12 = ViewOnLongClickListenerC2620w1.f8507l;
        if (viewOnLongClickListenerC2620w12 != null && viewOnLongClickListenerC2620w12.f8508a == view) {
            viewOnLongClickListenerC2620w12.m5089a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: h */
    public abstract List mo1145h(List list, String str);

    /* renamed from: r */
    public abstract void mo1350r(int r12);

    /* renamed from: s */
    public abstract void mo1351s(Typeface typeface, boolean z2);

    @Override // p028K.InterfaceC0292Z
    /* renamed from: b */
    public void mo801b() {
    }

    @Override // p028K.InterfaceC0292Z
    /* renamed from: c */
    public void mo802c() {
    }
}
