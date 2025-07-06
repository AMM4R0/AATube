package p099j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0005b;
import p076d.AbstractC0780a;
import p102k.ActionProviderVisibilityListenerC2469p;
import p102k.MenuC2466m;
import p104l.AbstractC2604r0;

/* renamed from: j.i */
/* loaded from: classes.dex */
public final class C2424i extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f7869e;

    /* renamed from: f */
    public static final Class[] f7870f;

    /* renamed from: a */
    public final Object[] f7871a;

    /* renamed from: b */
    public final Object[] f7872b;

    /* renamed from: c */
    public final Context f7873c;

    /* renamed from: d */
    public Object f7874d;

    static {
        Class[] clsArr = {Context.class};
        f7869e = clsArr;
        f7870f = clsArr;
    }

    public C2424i(Context context) {
        super(context);
        this.f7873c = context;
        Object[] objArr = {context};
        this.f7871a = objArr;
        this.f7872b = objArr;
    }

    /* renamed from: a */
    public static Object m4780a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? m4780a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* renamed from: b */
    public final void m4781b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int r6;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C2423h c2423h = new C2423h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            r6 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != r6) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        r6 = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c2423h.f7844b = 0;
                        c2423h.f7845c = 0;
                        c2423h.f7846d = 0;
                        c2423h.f7847e = 0;
                        c2423h.f7848f = r4;
                        c2423h.f7849g = r4;
                    } else if (name2.equals("item")) {
                        if (!c2423h.f7850h) {
                            ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p = c2423h.f7868z;
                            if (actionProviderVisibilityListenerC2469p == null || !actionProviderVisibilityListenerC2469p.f8121a.hasSubMenu()) {
                                c2423h.f7850h = r4;
                                c2423h.m4779b(c2423h.f7843a.add(c2423h.f7844b, c2423h.f7851i, c2423h.f7852j, c2423h.f7853k));
                            } else {
                                c2423h.f7850h = r4;
                                c2423h.m4779b(c2423h.f7843a.addSubMenu(c2423h.f7844b, c2423h.f7851i, c2423h.f7852j, c2423h.f7853k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r4;
                        z3 = z2;
                    }
                }
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C2424i c2424i = c2423h.f7842E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c2424i.f7873c.obtainStyledAttributes(attributeSet, AbstractC0780a.f3129p);
                        c2423h.f7844b = obtainStyledAttributes.getResourceId(r4, 0);
                        c2423h.f7845c = obtainStyledAttributes.getInt(3, 0);
                        c2423h.f7846d = obtainStyledAttributes.getInt(4, 0);
                        c2423h.f7847e = obtainStyledAttributes.getInt(5, 0);
                        c2423h.f7848f = obtainStyledAttributes.getBoolean(2, r4);
                        c2423h.f7849g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c2424i.f7873c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3130q);
                            c2423h.f7851i = obtainStyledAttributes2.getResourceId(2, 0);
                            c2423h.f7852j = (obtainStyledAttributes2.getInt(5, c2423h.f7845c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c2423h.f7846d) & 65535);
                            c2423h.f7853k = obtainStyledAttributes2.getText(7);
                            c2423h.f7854l = obtainStyledAttributes2.getText(8);
                            c2423h.f7855m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c2423h.f7856n = string == null ? (char) 0 : string.charAt(0);
                            c2423h.f7857o = obtainStyledAttributes2.getInt(16, Base64Utils.IO_BUFFER_SIZE);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c2423h.f7858p = string2 == null ? (char) 0 : string2.charAt(0);
                            c2423h.f7859q = obtainStyledAttributes2.getInt(20, Base64Utils.IO_BUFFER_SIZE);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c2423h.f7860r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c2423h.f7860r = c2423h.f7847e;
                            }
                            c2423h.f7861s = obtainStyledAttributes2.getBoolean(3, false);
                            c2423h.f7862t = obtainStyledAttributes2.getBoolean(4, c2423h.f7848f);
                            c2423h.f7863u = obtainStyledAttributes2.getBoolean(1, c2423h.f7849g);
                            c2423h.f7864v = obtainStyledAttributes2.getInt(21, -1);
                            c2423h.f7867y = obtainStyledAttributes2.getString(12);
                            c2423h.f7865w = obtainStyledAttributes2.getResourceId(13, 0);
                            c2423h.f7866x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c2423h.f7865w == 0 && c2423h.f7866x == null) {
                                c2423h.f7868z = (ActionProviderVisibilityListenerC2469p) c2423h.m4778a(string3, f7870f, c2424i.f7872b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c2423h.f7868z = null;
                            }
                            c2423h.f7838A = obtainStyledAttributes2.getText(17);
                            c2423h.f7839B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c2423h.f7841D = AbstractC2604r0.m5067c(obtainStyledAttributes2.getInt(19, -1), c2423h.f7841D);
                            } else {
                                c2423h.f7841D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0005b.m75u(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c2423h.f7840C = colorStateList;
                            } else {
                                c2423h.f7840C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c2423h.f7850h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c2423h.f7850h = true;
                            SubMenu addSubMenu = c2423h.f7843a.addSubMenu(c2423h.f7844b, c2423h.f7851i, c2423h.f7852j, c2423h.f7853k);
                            c2423h.m4779b(addSubMenu.getItem());
                            m4781b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        r6 = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            r6 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r4, Menu menu) {
        if (!(menu instanceof MenuC2466m)) {
            super.inflate(r4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f7873c.getResources().getLayout(r4);
                    m4781b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
