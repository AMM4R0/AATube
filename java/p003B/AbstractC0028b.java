package p003B;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006C.AbstractC0049a;
import p008C1.C0090v;
import p141y.AbstractC2894a;

/* renamed from: B.b */
/* loaded from: classes.dex */
public abstract class AbstractC0028b {

    /* renamed from: a */
    public static final float[][] f38a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f39b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f40c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f41d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e */
    public static final Object f42e = new Object();

    /* renamed from: f */
    public static Method f43f;

    /* renamed from: g */
    public static boolean f44g;

    /* renamed from: b */
    public static int m160b(Context context, int r3, int r4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(r3, typedValue, true);
        return typedValue.resourceId != 0 ? r3 : r4;
    }

    /* renamed from: c */
    public static C0030d m161c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int r7) {
        C0030d c0030d;
        if (m164f(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(r7, typedValue);
            int r12 = typedValue.type;
            if (r12 >= 28 && r12 <= 31) {
                return new C0030d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0030d = C0030d.m178b(typedArray.getResources(), typedArray.getResourceId(r7, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                c0030d = null;
            }
            if (c0030d != null) {
                return c0030d;
            }
        }
        return new C0030d((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: d */
    public static String m162d(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int r3) {
        if (m164f(xmlResourceParser, str)) {
            return typedArray.getString(r3);
        }
        return null;
    }

    /* renamed from: e */
    public static String m163e(TypedArray typedArray, int r12, int r2) {
        String string = typedArray.getString(r12);
        return string == null ? typedArray.getString(r2) : string;
    }

    /* renamed from: f */
    public static boolean m164f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: g */
    public static int m165g(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z2 = f4 > 0.008856452f;
        float f5 = z2 ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f40c;
        return AbstractC0049a.m191a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* renamed from: h */
    public static float m166h(int r6) {
        float f = r6 / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: i */
    public static TypedArray m167i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] r3) {
        return theme == null ? resources.obtainAttributes(attributeSet, r3) : theme.obtainStyledAttributes(attributeSet, r3, 0, 0);
    }

    /* renamed from: l */
    public static InterfaceC0032f m168l(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2894a.f9524b);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m171o(xmlResourceParser);
                }
                return new C0035i(new C0090v(string, string2, string3, m169m(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2894a.f9525c);
                        int r17 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int r8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int r18 = obtainAttributes2.getInt(r8, 0);
                        int r82 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(r82, 0);
                        String string6 = obtainAttributes2.getString(r82);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m171o(xmlResourceParser);
                        }
                        arrayList.add(new C0034h(r17, r18, resourceId2, string6, string5, z2));
                    } else {
                        m171o(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0033g((C0034h[]) arrayList.toArray(new C0034h[0]));
            }
        } else {
            m171o(xmlResourceParser);
        }
        return null;
    }

    /* renamed from: m */
    public static List m169m(Resources resources, int r9) {
        if (r9 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(r9);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0031e.m182a(obtainTypedArray, 0) == 1) {
                for (int r92 = 0; r92 < obtainTypedArray.length(); r92++) {
                    int resourceId = obtainTypedArray.getResourceId(r92, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(r9);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: n */
    public static void m170n(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0042p.m187a(theme);
            return;
        }
        synchronized (f42e) {
            if (!f44g) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f43f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                }
                f44g = true;
            }
            Method method = f43f;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                    f43f = null;
                }
            }
        }
    }

    /* renamed from: o */
    public static void m171o(XmlResourceParser xmlResourceParser) {
        int r02 = 1;
        while (r02 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                r02++;
            } else if (next == 3) {
                r02--;
            }
        }
    }

    /* renamed from: p */
    public static float m172p() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* renamed from: a */
    public void m173a(int r4) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0041o(r4, 0, this));
    }

    /* renamed from: j */
    public abstract void mo174j(int r12);

    /* renamed from: k */
    public abstract void mo175k(Typeface typeface);
}
