package p132v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p118q.AbstractC2714e;

/* renamed from: v.b */
/* loaded from: classes.dex */
public final class C2822b {

    /* renamed from: a */
    public boolean f9153a = false;

    /* renamed from: b */
    public int f9154b;

    /* renamed from: c */
    public int f9155c;

    /* renamed from: d */
    public float f9156d;

    /* renamed from: e */
    public String f9157e;

    /* renamed from: f */
    public boolean f9158f;

    /* renamed from: g */
    public int f9159g;

    public C2822b(C2822b c2822b, Object obj) {
        c2822b.getClass();
        this.f9154b = c2822b.f9154b;
        m5426b(obj);
    }

    /* renamed from: a */
    public static void m5425a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2838r.f9373d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int r7 = 0;
        boolean z2 = false;
        Object obj = null;
        for (int r6 = 0; r6 < indexCount; r6++) {
            int index = obtainStyledAttributes.getIndex(r6);
            int r10 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                r7 = 6;
            } else {
                int r12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    r12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            r12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                r7 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    r10 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                r7 = r10;
                            }
                        }
                        r7 = 7;
                    }
                }
                r7 = r12;
            }
        }
        if (str != null && obj != null) {
            C2822b c2822b = new C2822b();
            c2822b.f9154b = r7;
            c2822b.f9153a = z2;
            c2822b.m5426b(obj);
            hashMap.put(str, c2822b);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m5426b(Object obj) {
        switch (AbstractC2714e.m5234a(this.f9154b)) {
            case 0:
            case 7:
                this.f9155c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f9156d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f9159g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f9157e = (String) obj;
                break;
            case 5:
                this.f9158f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f9156d = ((Float) obj).floatValue();
                break;
        }
    }
}
