package p132v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C1842f9;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p118q.AbstractC2714e;
import p120r.AbstractC2717a;
import p123s.C2720a;
import p129u.AbstractC2776a;

/* renamed from: v.n */
/* loaded from: classes.dex */
public final class C2834n {

    /* renamed from: d */
    public static final int[] f9363d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f9364e;

    /* renamed from: f */
    public static final SparseIntArray f9365f;

    /* renamed from: a */
    public final HashMap f9366a = new HashMap();

    /* renamed from: b */
    public final boolean f9367b = true;

    /* renamed from: c */
    public final HashMap f9368c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9364e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f9365f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(BuildConfig.API_LEVEL, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: c */
    public static int[] m5447c(C2821a c2821a, String str) {
        int r7;
        HashMap hashMap;
        String[] split = str.split(StringUtils.COMMA);
        Context context = c2821a.getContext();
        int[] r12 = new int[split.length];
        int r3 = 0;
        int r4 = 0;
        while (r3 < split.length) {
            String trim = split[r3].trim();
            Object obj = null;
            try {
                r7 = AbstractC2837q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                r7 = 0;
            }
            if (r7 == 0) {
                r7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (r7 == 0 && c2821a.isInEditMode() && (c2821a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c2821a.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1981m) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1981m.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    r7 = ((Integer) obj).intValue();
                }
            }
            r12[r4] = r7;
            r3++;
            r4++;
        }
        return r4 != split.length ? Arrays.copyOf(r12, r4) : r12;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    /* renamed from: d */
    public static C2829i m5448d(Context context, AttributeSet attributeSet, boolean z2) {
        int r24;
        String str;
        String str2;
        String str3;
        int r02;
        String str4;
        int r10;
        C2829i c2829i = new C2829i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC2838r.f9372c : AbstractC2838r.f9370a);
        int[] r3 = f9363d;
        SparseIntArray sparseIntArray = f9364e;
        C2832l c2832l = c2829i.f9262b;
        String[] strArr = AbstractC2717a.f8779a;
        C2833m c2833m = c2829i.f9265e;
        C2831k c2831k = c2829i.f9263c;
        C2830j c2830j = c2829i.f9264d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C2828h c2828h = new C2828h();
            c2828h.f9249a = new int[10];
            c2828h.f9250b = new int[10];
            c2828h.f9251c = 0;
            c2828h.f9252d = new int[10];
            c2828h.f9253e = new float[10];
            c2828h.f9254f = 0;
            c2828h.f9255g = new int[5];
            c2828h.f9256h = new String[5];
            c2828h.f9257i = 0;
            c2828h.f9258j = new int[4];
            c2828h.f9259k = new boolean[4];
            c2828h.f9260l = 0;
            c2831k.getClass();
            c2830j.getClass();
            c2833m.getClass();
            int r6 = 0;
            while (r6 < indexCount) {
                int index = obtainStyledAttributes.getIndex(r6);
                int r19 = indexCount;
                switch (f9365f.get(index)) {
                    case 2:
                        str4 = str5;
                        c2828h.m5439b(2, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9276I));
                        r10 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case C1842f9.f6211H /* 25 */:
                    case C1842f9.f6212I /* 26 */:
                    case C1842f9.f6214K /* 29 */:
                    case 30:
                    case 32:
                    case 33:
                    case C1842f9.f6215L /* 35 */:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        r10 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c2828h.m5440c(5, obtainStyledAttributes.getString(index));
                        r10 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c2828h.m5439b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c2830j.f9270C));
                        r10 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c2828h.m5439b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c2830j.f9271D));
                        r10 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c2828h.m5439b(8, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9277J));
                        r10 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c2828h.m5439b(11, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9283P));
                        r10 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c2828h.m5439b(12, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9284Q));
                        r10 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c2828h.m5439b(13, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9280M));
                        r10 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c2828h.m5439b(14, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9282O));
                        r10 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c2828h.m5439b(15, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9285R));
                        r10 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c2828h.m5439b(16, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9281N));
                        r10 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c2828h.m5439b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c2830j.f9300d));
                        r10 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c2828h.m5439b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c2830j.f9302e));
                        r10 = 1;
                        break;
                    case C1842f9.f6208E /* 19 */:
                        str4 = str5;
                        c2828h.m5438a(19, obtainStyledAttributes.getFloat(index, c2830j.f9304f));
                        r10 = 1;
                        break;
                    case C1842f9.f6209F /* 20 */:
                        str4 = str5;
                        c2828h.m5438a(20, obtainStyledAttributes.getFloat(index, c2830j.f9331w));
                        r10 = 1;
                        break;
                    case C1842f9.f6210G /* 21 */:
                        str4 = str5;
                        c2828h.m5439b(21, obtainStyledAttributes.getLayoutDimension(index, c2830j.f9298c));
                        r10 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c2828h.m5439b(22, r3[obtainStyledAttributes.getInt(index, c2832l.f9345a)]);
                        r10 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c2828h.m5439b(23, obtainStyledAttributes.getLayoutDimension(index, c2830j.f9296b));
                        r10 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c2828h.m5439b(24, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9273F));
                        r10 = 1;
                        break;
                    case C1842f9.f6213J /* 27 */:
                        str4 = str5;
                        c2828h.m5439b(27, obtainStyledAttributes.getInt(index, c2830j.f9272E));
                        r10 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c2828h.m5439b(28, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9274G));
                        r10 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c2828h.m5439b(31, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9278K));
                        r10 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c2828h.m5439b(34, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9275H));
                        r10 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c2828h.m5438a(37, obtainStyledAttributes.getFloat(index, c2830j.f9332x));
                        r10 = 1;
                        break;
                    case C1842f9.f6216M /* 38 */:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c2829i.f9261a);
                        c2829i.f9261a = resourceId;
                        c2828h.m5439b(38, resourceId);
                        r10 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c2828h.m5438a(39, obtainStyledAttributes.getFloat(index, c2830j.f9288U));
                        r10 = 1;
                        break;
                    case C1842f9.f6217N /* 40 */:
                        str4 = str5;
                        c2828h.m5438a(40, obtainStyledAttributes.getFloat(index, c2830j.f9287T));
                        r10 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c2828h.m5439b(41, obtainStyledAttributes.getInt(index, c2830j.f9289V));
                        r10 = 1;
                        break;
                    case C1842f9.f6218O /* 42 */:
                        str4 = str5;
                        c2828h.m5439b(42, obtainStyledAttributes.getInt(index, c2830j.f9290W));
                        r10 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c2828h.m5438a(43, obtainStyledAttributes.getFloat(index, c2832l.f9347c));
                        r10 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c2828h.m5441d(44, true);
                        c2828h.m5438a(44, obtainStyledAttributes.getDimension(index, c2833m.f9362m));
                        r10 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c2828h.m5438a(45, obtainStyledAttributes.getFloat(index, c2833m.f9351b));
                        r10 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c2828h.m5438a(46, obtainStyledAttributes.getFloat(index, c2833m.f9352c));
                        r10 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c2828h.m5438a(47, obtainStyledAttributes.getFloat(index, c2833m.f9353d));
                        r10 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c2828h.m5438a(48, obtainStyledAttributes.getFloat(index, c2833m.f9354e));
                        r10 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c2828h.m5438a(49, obtainStyledAttributes.getDimension(index, c2833m.f9355f));
                        r10 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c2828h.m5438a(50, obtainStyledAttributes.getDimension(index, c2833m.f9356g));
                        r10 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c2828h.m5438a(51, obtainStyledAttributes.getDimension(index, c2833m.f9358i));
                        r10 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c2828h.m5438a(52, obtainStyledAttributes.getDimension(index, c2833m.f9359j));
                        r10 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c2828h.m5438a(53, obtainStyledAttributes.getDimension(index, c2833m.f9360k));
                        r10 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c2828h.m5439b(54, obtainStyledAttributes.getInt(index, c2830j.f9291X));
                        r10 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c2828h.m5439b(55, obtainStyledAttributes.getInt(index, c2830j.f9292Y));
                        r10 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c2828h.m5439b(56, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9293Z));
                        r10 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c2828h.m5439b(57, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9295a0));
                        r10 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c2828h.m5439b(58, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9297b0));
                        r10 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c2828h.m5439b(59, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9299c0));
                        r10 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c2828h.m5438a(60, obtainStyledAttributes.getFloat(index, c2833m.f9350a));
                        r10 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c2828h.m5439b(62, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9268A));
                        r10 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c2828h.m5438a(63, obtainStyledAttributes.getFloat(index, c2830j.f9269B));
                        r10 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c2828h.m5439b(64, m5449f(obtainStyledAttributes, index, c2831k.f9336a));
                        r10 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c2828h.m5440c(65, obtainStyledAttributes.getString(index));
                        } else {
                            c2828h.m5440c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        r10 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c2828h.m5439b(66, obtainStyledAttributes.getInt(index, 0));
                        r10 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c2828h.m5438a(67, obtainStyledAttributes.getFloat(index, c2831k.f9340e));
                        r10 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c2828h.m5438a(68, obtainStyledAttributes.getFloat(index, c2832l.f9348d));
                        r10 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c2828h.m5438a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        r10 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c2828h.m5438a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        r10 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        r10 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c2828h.m5439b(72, obtainStyledAttributes.getInt(index, c2830j.f9305f0));
                        r10 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c2828h.m5439b(73, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9307g0));
                        r10 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c2828h.m5440c(74, obtainStyledAttributes.getString(index));
                        r10 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c2828h.m5441d(75, obtainStyledAttributes.getBoolean(index, c2830j.f9321n0));
                        r10 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c2828h.m5439b(76, obtainStyledAttributes.getInt(index, c2831k.f9338c));
                        r10 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c2828h.m5440c(77, obtainStyledAttributes.getString(index));
                        r10 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c2828h.m5439b(78, obtainStyledAttributes.getInt(index, c2832l.f9346b));
                        r10 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c2828h.m5438a(79, obtainStyledAttributes.getFloat(index, c2831k.f9339d));
                        r10 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c2828h.m5441d(80, obtainStyledAttributes.getBoolean(index, c2830j.f9317l0));
                        r10 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c2828h.m5441d(81, obtainStyledAttributes.getBoolean(index, c2830j.f9319m0));
                        r10 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c2828h.m5439b(82, obtainStyledAttributes.getInteger(index, c2831k.f9337b));
                        r10 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c2828h.m5439b(83, m5449f(obtainStyledAttributes, index, c2833m.f9357h));
                        r10 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c2828h.m5439b(84, obtainStyledAttributes.getInteger(index, c2831k.f9342g));
                        r10 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c2828h.m5438a(85, obtainStyledAttributes.getFloat(index, c2831k.f9341f));
                        r10 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int r102 = obtainStyledAttributes.peekValue(index).type;
                        if (r102 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c2831k.f9344i = resourceId2;
                            c2828h.m5439b(89, resourceId2);
                            if (c2831k.f9344i != -1) {
                                c2828h.m5439b(88, -2);
                            }
                        } else if (r102 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            c2831k.f9343h = string;
                            c2828h.m5440c(90, string);
                            if (c2831k.f9343h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                c2831k.f9344i = resourceId3;
                                c2828h.m5439b(89, resourceId3);
                                c2828h.m5439b(88, -2);
                            } else {
                                c2828h.m5439b(88, -1);
                            }
                        } else {
                            c2828h.m5439b(88, obtainStyledAttributes.getInteger(index, c2831k.f9344i));
                        }
                        r10 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        r10 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        c2828h.m5439b(93, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9279L));
                        r10 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c2828h.m5439b(94, obtainStyledAttributes.getDimensionPixelSize(index, c2830j.f9286S));
                        r10 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        m5450g(c2828h, obtainStyledAttributes, index, 0);
                        r10 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        r10 = 1;
                        m5450g(c2828h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c2828h.m5439b(97, obtainStyledAttributes.getInt(index, c2830j.f9323o0));
                        r10 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int r103 = AbstractC2776a.f9073s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c2829i.f9261a = obtainStyledAttributes.getResourceId(index, c2829i.f9261a);
                        }
                        r10 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c2828h.m5441d(99, obtainStyledAttributes.getBoolean(index, c2830j.f9306g));
                        r10 = 1;
                        break;
                }
                r6 += r10;
                indexCount = r19;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int r104 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int r12 = 0;
            while (r12 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(r12);
                if (index2 != r104 && 23 != index2 && 24 != index2) {
                    c2831k.getClass();
                    c2830j.getClass();
                    c2833m.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9324p = m5449f(obtainStyledAttributes, index2, c2830j.f9324p);
                        r02 = 1;
                        break;
                    case 2:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9276I = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9276I);
                        r02 = 1;
                        break;
                    case 3:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9322o = m5449f(obtainStyledAttributes, index2, c2830j.f9322o);
                        r02 = 1;
                        break;
                    case 4:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9320n = m5449f(obtainStyledAttributes, index2, c2830j.f9320n);
                        r02 = 1;
                        break;
                    case 5:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9333y = obtainStyledAttributes.getString(index2);
                        r02 = 1;
                        break;
                    case 6:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9270C = obtainStyledAttributes.getDimensionPixelOffset(index2, c2830j.f9270C);
                        r02 = 1;
                        break;
                    case 7:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9271D = obtainStyledAttributes.getDimensionPixelOffset(index2, c2830j.f9271D);
                        r02 = 1;
                        break;
                    case 8:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9277J = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9277J);
                        r02 = 1;
                        break;
                    case 9:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9330v = m5449f(obtainStyledAttributes, index2, c2830j.f9330v);
                        r02 = 1;
                        break;
                    case 10:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9329u = m5449f(obtainStyledAttributes, index2, c2830j.f9329u);
                        r02 = 1;
                        break;
                    case 11:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9283P = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9283P);
                        r02 = 1;
                        break;
                    case 12:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9284Q = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9284Q);
                        r02 = 1;
                        break;
                    case 13:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9280M = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9280M);
                        r02 = 1;
                        break;
                    case 14:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9282O = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9282O);
                        r02 = 1;
                        break;
                    case 15:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9285R = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9285R);
                        r02 = 1;
                        break;
                    case 16:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9281N = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9281N);
                        r02 = 1;
                        break;
                    case 17:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9300d = obtainStyledAttributes.getDimensionPixelOffset(index2, c2830j.f9300d);
                        r02 = 1;
                        break;
                    case 18:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9302e = obtainStyledAttributes.getDimensionPixelOffset(index2, c2830j.f9302e);
                        r02 = 1;
                        break;
                    case C1842f9.f6208E /* 19 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9304f = obtainStyledAttributes.getFloat(index2, c2830j.f9304f);
                        r02 = 1;
                        break;
                    case C1842f9.f6209F /* 20 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9331w = obtainStyledAttributes.getFloat(index2, c2830j.f9331w);
                        r02 = 1;
                        break;
                    case C1842f9.f6210G /* 21 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9298c = obtainStyledAttributes.getLayoutDimension(index2, c2830j.f9298c);
                        r02 = 1;
                        break;
                    case 22:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int r03 = obtainStyledAttributes.getInt(index2, c2832l.f9345a);
                        c2832l.f9345a = r03;
                        c2832l.f9345a = r3[r03];
                        r02 = 1;
                        break;
                    case 23:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9296b = obtainStyledAttributes.getLayoutDimension(index2, c2830j.f9296b);
                        r02 = 1;
                        break;
                    case 24:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9273F = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9273F);
                        r02 = 1;
                        break;
                    case C1842f9.f6211H /* 25 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9308h = m5449f(obtainStyledAttributes, index2, c2830j.f9308h);
                        r02 = 1;
                        break;
                    case C1842f9.f6212I /* 26 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9310i = m5449f(obtainStyledAttributes, index2, c2830j.f9310i);
                        r02 = 1;
                        break;
                    case C1842f9.f6213J /* 27 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9272E = obtainStyledAttributes.getInt(index2, c2830j.f9272E);
                        r02 = 1;
                        break;
                    case 28:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9274G = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9274G);
                        r02 = 1;
                        break;
                    case C1842f9.f6214K /* 29 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9312j = m5449f(obtainStyledAttributes, index2, c2830j.f9312j);
                        r02 = 1;
                        break;
                    case 30:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9314k = m5449f(obtainStyledAttributes, index2, c2830j.f9314k);
                        r02 = 1;
                        break;
                    case 31:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9278K = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9278K);
                        r02 = 1;
                        break;
                    case 32:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9327s = m5449f(obtainStyledAttributes, index2, c2830j.f9327s);
                        r02 = 1;
                        break;
                    case 33:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9328t = m5449f(obtainStyledAttributes, index2, c2830j.f9328t);
                        r02 = 1;
                        break;
                    case 34:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9275H = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9275H);
                        r02 = 1;
                        break;
                    case C1842f9.f6215L /* 35 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9318m = m5449f(obtainStyledAttributes, index2, c2830j.f9318m);
                        r02 = 1;
                        break;
                    case 36:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9316l = m5449f(obtainStyledAttributes, index2, c2830j.f9316l);
                        r02 = 1;
                        break;
                    case 37:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9332x = obtainStyledAttributes.getFloat(index2, c2830j.f9332x);
                        r02 = 1;
                        break;
                    case C1842f9.f6216M /* 38 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2829i.f9261a = obtainStyledAttributes.getResourceId(index2, c2829i.f9261a);
                        r02 = 1;
                        break;
                    case 39:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9288U = obtainStyledAttributes.getFloat(index2, c2830j.f9288U);
                        r02 = 1;
                        break;
                    case C1842f9.f6217N /* 40 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9287T = obtainStyledAttributes.getFloat(index2, c2830j.f9287T);
                        r02 = 1;
                        break;
                    case 41:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9289V = obtainStyledAttributes.getInt(index2, c2830j.f9289V);
                        r02 = 1;
                        break;
                    case C1842f9.f6218O /* 42 */:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9290W = obtainStyledAttributes.getInt(index2, c2830j.f9290W);
                        r02 = 1;
                        break;
                    case 43:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2832l.f9347c = obtainStyledAttributes.getFloat(index2, c2832l.f9347c);
                        r02 = 1;
                        break;
                    case 44:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9361l = true;
                        c2833m.f9362m = obtainStyledAttributes.getDimension(index2, c2833m.f9362m);
                        r02 = 1;
                        break;
                    case 45:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9351b = obtainStyledAttributes.getFloat(index2, c2833m.f9351b);
                        r02 = 1;
                        break;
                    case 46:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9352c = obtainStyledAttributes.getFloat(index2, c2833m.f9352c);
                        r02 = 1;
                        break;
                    case 47:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9353d = obtainStyledAttributes.getFloat(index2, c2833m.f9353d);
                        r02 = 1;
                        break;
                    case 48:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9354e = obtainStyledAttributes.getFloat(index2, c2833m.f9354e);
                        r02 = 1;
                        break;
                    case 49:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9355f = obtainStyledAttributes.getDimension(index2, c2833m.f9355f);
                        r02 = 1;
                        break;
                    case 50:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9356g = obtainStyledAttributes.getDimension(index2, c2833m.f9356g);
                        r02 = 1;
                        break;
                    case 51:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9358i = obtainStyledAttributes.getDimension(index2, c2833m.f9358i);
                        r02 = 1;
                        break;
                    case 52:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9359j = obtainStyledAttributes.getDimension(index2, c2833m.f9359j);
                        r02 = 1;
                        break;
                    case 53:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9360k = obtainStyledAttributes.getDimension(index2, c2833m.f9360k);
                        r02 = 1;
                        break;
                    case 54:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9291X = obtainStyledAttributes.getInt(index2, c2830j.f9291X);
                        r02 = 1;
                        break;
                    case 55:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9292Y = obtainStyledAttributes.getInt(index2, c2830j.f9292Y);
                        r02 = 1;
                        break;
                    case 56:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9293Z = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9293Z);
                        r02 = 1;
                        break;
                    case 57:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9295a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9295a0);
                        r02 = 1;
                        break;
                    case 58:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9297b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9297b0);
                        r02 = 1;
                        break;
                    case 59:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9299c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9299c0);
                        r02 = 1;
                        break;
                    case 60:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2833m.f9350a = obtainStyledAttributes.getFloat(index2, c2833m.f9350a);
                        r02 = 1;
                        break;
                    case 61:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9334z = m5449f(obtainStyledAttributes, index2, c2830j.f9334z);
                        r02 = 1;
                        break;
                    case 62:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9268A = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9268A);
                        r02 = 1;
                        break;
                    case 63:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2830j.f9269B = obtainStyledAttributes.getFloat(index2, c2830j.f9269B);
                        r02 = 1;
                        break;
                    case 64:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c2831k.f9336a = m5449f(obtainStyledAttributes, index2, c2831k.f9336a);
                        r02 = 1;
                        break;
                    case 65:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            c2831k.getClass();
                            r02 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            c2831k.getClass();
                            r02 = 1;
                            break;
                        }
                    case 66:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        c2831k.getClass();
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 67:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        c2831k.f9340e = obtainStyledAttributes.getFloat(index2, c2831k.f9340e);
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 68:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        c2832l.f9348d = obtainStyledAttributes.getFloat(index2, c2832l.f9348d);
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 69:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        c2830j.f9301d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 70:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        c2830j.f9303e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 71:
                        r24 = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 72:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9305f0 = obtainStyledAttributes.getInt(index2, c2830j.f9305f0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 73:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9307g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9307g0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 74:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9313j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 75:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9321n0 = obtainStyledAttributes.getBoolean(index2, c2830j.f9321n0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 76:
                        r24 = indexCount2;
                        str2 = str8;
                        c2831k.f9338c = obtainStyledAttributes.getInt(index2, c2831k.f9338c);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 77:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9315k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 78:
                        r24 = indexCount2;
                        str2 = str8;
                        c2832l.f9346b = obtainStyledAttributes.getInt(index2, c2832l.f9346b);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 79:
                        r24 = indexCount2;
                        str2 = str8;
                        c2831k.f9339d = obtainStyledAttributes.getFloat(index2, c2831k.f9339d);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 80:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9317l0 = obtainStyledAttributes.getBoolean(index2, c2830j.f9317l0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 81:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9319m0 = obtainStyledAttributes.getBoolean(index2, c2830j.f9319m0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 82:
                        r24 = indexCount2;
                        str2 = str8;
                        c2831k.f9337b = obtainStyledAttributes.getInteger(index2, c2831k.f9337b);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 83:
                        r24 = indexCount2;
                        str2 = str8;
                        c2833m.f9357h = m5449f(obtainStyledAttributes, index2, c2833m.f9357h);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 84:
                        r24 = indexCount2;
                        str2 = str8;
                        c2831k.f9342g = obtainStyledAttributes.getInteger(index2, c2831k.f9342g);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 85:
                        r24 = indexCount2;
                        str2 = str8;
                        c2831k.f9341f = obtainStyledAttributes.getFloat(index2, c2831k.f9341f);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 86:
                        r24 = indexCount2;
                        str2 = str8;
                        int r32 = obtainStyledAttributes.peekValue(index2).type;
                        if (r32 == 1) {
                            c2831k.f9344i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (r32 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            c2831k.f9343h = string2;
                            if (string2.indexOf("/") > 0) {
                                c2831k.f9344i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, c2831k.f9344i);
                        }
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 87:
                        r24 = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 88:
                    case 89:
                    case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        r24 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 91:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9325q = m5449f(obtainStyledAttributes, index2, c2830j.f9325q);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 92:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9326r = m5449f(obtainStyledAttributes, index2, c2830j.f9326r);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 93:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9279L = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9279L);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 94:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9286S = obtainStyledAttributes.getDimensionPixelSize(index2, c2830j.f9286S);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 95:
                        r24 = indexCount2;
                        str2 = str8;
                        m5450g(c2830j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 96:
                        r24 = indexCount2;
                        str2 = str8;
                        m5450g(c2830j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                    case 97:
                        r24 = indexCount2;
                        str2 = str8;
                        c2830j.f9323o0 = obtainStyledAttributes.getInt(index2, c2830j.f9323o0);
                        str = str7;
                        str3 = str6;
                        r02 = 1;
                        break;
                }
                r12 += r02;
                indexCount2 = r24;
                str8 = str2;
                String str10 = str;
                r104 = r02;
                str6 = str3;
                str7 = str10;
            }
            if (c2830j.f9313j0 != null) {
                c2830j.f9311i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c2829i;
    }

    /* renamed from: f */
    public static int m5449f(TypedArray typedArray, int r2, int r3) {
        int resourceId = typedArray.getResourceId(r2, r3);
        return resourceId == -1 ? typedArray.getInt(r2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5450g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132v.C2834n.m5450g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: h */
    public static void m5451h(C2825e c2825e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int r4 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                r4 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (r4 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c2825e.f9174G = str;
    }

    /* renamed from: a */
    public final void m5452a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int r19;
        HashMap hashMap;
        int r12;
        HashMap hashMap2;
        String str;
        int r192;
        HashMap hashMap3;
        String str2;
        C2834n c2834n = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int r3 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap4 = c2834n.f9368c;
        HashSet hashSet = new HashSet(hashMap4.keySet());
        int r8 = 0;
        while (r8 < childCount) {
            View childAt = constraintLayout2.getChildAt(r8);
            int id = childAt.getId();
            if (!hashMap4.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c2834n.f9367b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap4.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C2829i c2829i = (C2829i) hashMap4.get(Integer.valueOf(id));
                        if (c2829i != null) {
                            if (childAt instanceof C2821a) {
                                C2830j c2830j = c2829i.f9264d;
                                c2830j.f9309h0 = r3;
                                C2821a c2821a = (C2821a) childAt;
                                c2821a.setId(id);
                                c2821a.setType(c2830j.f9305f0);
                                c2821a.setMargin(c2830j.f9307g0);
                                c2821a.setAllowsGoneWidget(c2830j.f9321n0);
                                int[] r02 = c2830j.f9311i0;
                                if (r02 != null) {
                                    c2821a.setReferencedIds(r02);
                                } else {
                                    String str3 = c2830j.f9313j0;
                                    if (str3 != null) {
                                        int[] m5447c = m5447c(c2821a, str3);
                                        c2830j.f9311i0 = m5447c;
                                        c2821a.setReferencedIds(m5447c);
                                    }
                                }
                            }
                            C2825e c2825e = (C2825e) childAt.getLayoutParams();
                            c2825e.m5435a();
                            c2829i.m5442a(c2825e);
                            HashMap hashMap5 = c2829i.f9266f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap5.keySet()) {
                                C2822b c2822b = (C2822b) hashMap5.get(str4);
                                if (c2822b.f9153a) {
                                    hashMap2 = hashMap5;
                                    str = str4;
                                } else {
                                    hashMap2 = hashMap5;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC2714e.m5234a(c2822b.f9154b)) {
                                        case 0:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c2822b.f9155c));
                                            break;
                                        case 1:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c2822b.f9156d));
                                            break;
                                        case 2:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c2822b.f9159g));
                                            break;
                                        case 3:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            Method method = cls.getMethod(str, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c2822b.f9159g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c2822b.f9157e);
                                            break;
                                        case 5:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c2822b.f9158f));
                                            break;
                                        case 6:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            try {
                                                cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c2822b.f9156d));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap5 = hashMap2;
                                                childCount = r192;
                                                hashMap4 = hashMap3;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap5 = hashMap2;
                                                childCount = r192;
                                                hashMap4 = hashMap3;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap5 = hashMap2;
                                                childCount = r192;
                                                hashMap4 = hashMap3;
                                            }
                                        case 7:
                                            r192 = childCount;
                                            try {
                                                cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c2822b.f9155c));
                                                hashMap3 = hashMap4;
                                            } catch (IllegalAccessException e5) {
                                                e = e5;
                                                hashMap3 = hashMap4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap5 = hashMap2;
                                                childCount = r192;
                                                hashMap4 = hashMap3;
                                            } catch (NoSuchMethodException e6) {
                                                e = e6;
                                                hashMap3 = hashMap4;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap5 = hashMap2;
                                                childCount = r192;
                                                hashMap4 = hashMap3;
                                            } catch (InvocationTargetException e7) {
                                                e = e7;
                                                hashMap3 = hashMap4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap5 = hashMap2;
                                                childCount = r192;
                                                hashMap4 = hashMap3;
                                            }
                                        default:
                                            r192 = childCount;
                                            hashMap3 = hashMap4;
                                            break;
                                    }
                                } catch (IllegalAccessException e8) {
                                    e = e8;
                                    r192 = childCount;
                                } catch (NoSuchMethodException e9) {
                                    e = e9;
                                    r192 = childCount;
                                } catch (InvocationTargetException e10) {
                                    e = e10;
                                    r192 = childCount;
                                }
                                hashMap5 = hashMap2;
                                childCount = r192;
                                hashMap4 = hashMap3;
                            }
                            r19 = childCount;
                            hashMap = hashMap4;
                            childAt.setLayoutParams(c2825e);
                            C2832l c2832l = c2829i.f9262b;
                            if (c2832l.f9346b == 0) {
                                childAt.setVisibility(c2832l.f9345a);
                            }
                            childAt.setAlpha(c2832l.f9347c);
                            C2833m c2833m = c2829i.f9265e;
                            childAt.setRotation(c2833m.f9350a);
                            childAt.setRotationX(c2833m.f9351b);
                            childAt.setRotationY(c2833m.f9352c);
                            childAt.setScaleX(c2833m.f9353d);
                            childAt.setScaleY(c2833m.f9354e);
                            if (c2833m.f9357h != -1) {
                                if (((View) childAt.getParent()).findViewById(c2833m.f9357h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c2833m.f9355f)) {
                                    childAt.setPivotX(c2833m.f9355f);
                                }
                                if (!Float.isNaN(c2833m.f9356g)) {
                                    childAt.setPivotY(c2833m.f9356g);
                                }
                            }
                            childAt.setTranslationX(c2833m.f9358i);
                            childAt.setTranslationY(c2833m.f9359j);
                            childAt.setTranslationZ(c2833m.f9360k);
                            if (c2833m.f9361l) {
                                childAt.setElevation(c2833m.f9362m);
                            }
                        }
                    } else {
                        r19 = childCount;
                        hashMap = hashMap4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    r12 = 1;
                    r8 += r12;
                    constraintLayout2 = constraintLayout;
                    r3 = r12;
                    childCount = r19;
                    hashMap4 = hashMap;
                    c2834n = this;
                }
            }
            r12 = r3;
            r19 = childCount;
            hashMap = hashMap4;
            r8 += r12;
            constraintLayout2 = constraintLayout;
            r3 = r12;
            childCount = r19;
            hashMap4 = hashMap;
            c2834n = this;
        }
        int r193 = childCount;
        HashMap hashMap6 = hashMap4;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            HashMap hashMap7 = hashMap6;
            C2829i c2829i2 = (C2829i) hashMap7.get(num);
            if (c2829i2 != null) {
                C2830j c2830j2 = c2829i2.f9264d;
                if (c2830j2.f9309h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C2821a c2821a2 = new C2821a(context);
                    c2821a2.f9160a = new int[32];
                    c2821a2.f9166g = new HashMap();
                    c2821a2.f9162c = context;
                    C2720a c2720a = new C2720a();
                    c2720a.f8785s0 = 0;
                    c2720a.f8786t0 = true;
                    c2720a.f8787u0 = 0;
                    c2720a.f8788v0 = false;
                    c2821a2.f9152j = c2720a;
                    c2821a2.f9163d = c2720a;
                    c2821a2.m5434i();
                    c2821a2.setVisibility(8);
                    c2821a2.setId(num.intValue());
                    int[] r6 = c2830j2.f9311i0;
                    if (r6 != null) {
                        c2821a2.setReferencedIds(r6);
                    } else {
                        String str5 = c2830j2.f9313j0;
                        if (str5 != null) {
                            int[] m5447c2 = m5447c(c2821a2, str5);
                            c2830j2.f9311i0 = m5447c2;
                            c2821a2.setReferencedIds(m5447c2);
                        }
                    }
                    c2821a2.setType(c2830j2.f9305f0);
                    c2821a2.setMargin(c2830j2.f9307g0);
                    C2825e m1563g = ConstraintLayout.m1563g();
                    c2821a2.m5434i();
                    c2829i2.m5442a(m1563g);
                    viewGroup = constraintLayout;
                    viewGroup.addView(c2821a2, m1563g);
                } else {
                    viewGroup = constraintLayout;
                }
                if (c2830j2.f9294a) {
                    C2836p c2836p = new C2836p(constraintLayout.getContext());
                    c2836p.setId(num.intValue());
                    C2825e m1563g2 = ConstraintLayout.m1563g();
                    c2829i2.m5442a(m1563g2);
                    viewGroup.addView(c2836p, m1563g2);
                }
            }
            hashMap6 = hashMap7;
        }
        for (int r7 = 0; r7 < r193; r7++) {
            View childAt2 = constraintLayout.getChildAt(r7);
            if (childAt2 instanceof AbstractC2823c) {
                ((AbstractC2823c) childAt2).mo5431e(constraintLayout);
            }
        }
    }

    /* renamed from: b */
    public final void m5453b(ConstraintLayout constraintLayout) {
        C2834n c2834n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c2834n.f9368c;
        hashMap.clear();
        int r4 = 0;
        while (r4 < childCount) {
            View childAt = constraintLayout.getChildAt(r4);
            C2825e c2825e = (C2825e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c2834n.f9367b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C2829i());
            }
            C2829i c2829i = (C2829i) hashMap.get(Integer.valueOf(id));
            if (c2829i != null) {
                HashMap hashMap2 = c2834n.f9366a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C2822b c2822b = (C2822b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C2822b(c2822b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C2822b(c2822b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c2829i.f9266f = hashMap3;
                c2829i.f9261a = id;
                int r02 = c2825e.f9202e;
                C2830j c2830j = c2829i.f9264d;
                c2830j.f9308h = r02;
                c2830j.f9310i = c2825e.f9204f;
                c2830j.f9312j = c2825e.f9206g;
                c2830j.f9314k = c2825e.f9208h;
                c2830j.f9316l = c2825e.f9210i;
                c2830j.f9318m = c2825e.f9212j;
                c2830j.f9320n = c2825e.f9214k;
                c2830j.f9322o = c2825e.f9216l;
                c2830j.f9324p = c2825e.f9218m;
                c2830j.f9325q = c2825e.f9220n;
                c2830j.f9326r = c2825e.f9222o;
                c2830j.f9327s = c2825e.f9228s;
                c2830j.f9328t = c2825e.f9229t;
                c2830j.f9329u = c2825e.f9230u;
                c2830j.f9330v = c2825e.f9231v;
                c2830j.f9331w = c2825e.f9172E;
                c2830j.f9332x = c2825e.f9173F;
                c2830j.f9333y = c2825e.f9174G;
                c2830j.f9334z = c2825e.f9224p;
                c2830j.f9268A = c2825e.f9226q;
                c2830j.f9269B = c2825e.f9227r;
                c2830j.f9270C = c2825e.f9187T;
                c2830j.f9271D = c2825e.f9188U;
                c2830j.f9272E = c2825e.f9189V;
                c2830j.f9304f = c2825e.f9198c;
                c2830j.f9300d = c2825e.f9194a;
                c2830j.f9302e = c2825e.f9196b;
                c2830j.f9296b = ((ViewGroup.MarginLayoutParams) c2825e).width;
                c2830j.f9298c = ((ViewGroup.MarginLayoutParams) c2825e).height;
                c2830j.f9273F = ((ViewGroup.MarginLayoutParams) c2825e).leftMargin;
                c2830j.f9274G = ((ViewGroup.MarginLayoutParams) c2825e).rightMargin;
                c2830j.f9275H = ((ViewGroup.MarginLayoutParams) c2825e).topMargin;
                c2830j.f9276I = ((ViewGroup.MarginLayoutParams) c2825e).bottomMargin;
                c2830j.f9279L = c2825e.f9171D;
                c2830j.f9287T = c2825e.f9176I;
                c2830j.f9288U = c2825e.f9175H;
                c2830j.f9290W = c2825e.f9178K;
                c2830j.f9289V = c2825e.f9177J;
                c2830j.f9317l0 = c2825e.f9190W;
                c2830j.f9319m0 = c2825e.f9191X;
                c2830j.f9291X = c2825e.f9179L;
                c2830j.f9292Y = c2825e.f9180M;
                c2830j.f9293Z = c2825e.f9183P;
                c2830j.f9295a0 = c2825e.f9184Q;
                c2830j.f9297b0 = c2825e.f9181N;
                c2830j.f9299c0 = c2825e.f9182O;
                c2830j.f9301d0 = c2825e.f9185R;
                c2830j.f9303e0 = c2825e.f9186S;
                c2830j.f9315k0 = c2825e.f9192Y;
                c2830j.f9281N = c2825e.f9233x;
                c2830j.f9283P = c2825e.f9235z;
                c2830j.f9280M = c2825e.f9232w;
                c2830j.f9282O = c2825e.f9234y;
                c2830j.f9285R = c2825e.f9168A;
                c2830j.f9284Q = c2825e.f9169B;
                c2830j.f9286S = c2825e.f9170C;
                c2830j.f9323o0 = c2825e.f9193Z;
                c2830j.f9277J = c2825e.getMarginEnd();
                c2830j.f9278K = c2825e.getMarginStart();
                int visibility = childAt.getVisibility();
                C2832l c2832l = c2829i.f9262b;
                c2832l.f9345a = visibility;
                c2832l.f9347c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C2833m c2833m = c2829i.f9265e;
                c2833m.f9350a = rotation;
                c2833m.f9351b = childAt.getRotationX();
                c2833m.f9352c = childAt.getRotationY();
                c2833m.f9353d = childAt.getScaleX();
                c2833m.f9354e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c2833m.f9355f = pivotX;
                    c2833m.f9356g = pivotY;
                }
                c2833m.f9358i = childAt.getTranslationX();
                c2833m.f9359j = childAt.getTranslationY();
                c2833m.f9360k = childAt.getTranslationZ();
                if (c2833m.f9361l) {
                    c2833m.f9362m = childAt.getElevation();
                }
                if (childAt instanceof C2821a) {
                    C2821a c2821a = (C2821a) childAt;
                    c2830j.f9321n0 = c2821a.getAllowsGoneWidget();
                    c2830j.f9311i0 = c2821a.getReferencedIds();
                    c2830j.f9305f0 = c2821a.getType();
                    c2830j.f9307g0 = c2821a.getMargin();
                }
            }
            r4++;
            c2834n = this;
        }
    }

    /* renamed from: e */
    public final void m5454e(Context context, int r6) {
        XmlResourceParser xml = context.getResources().getXml(r6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C2829i m5448d = m5448d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m5448d.f9264d.f9294a = true;
                    }
                    this.f9368c.put(Integer.valueOf(m5448d.f9261a), m5448d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
