package p036M1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.session.AbstractC0580g;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p002A1.AbstractC0017j;
import p002A1.C0015h;
import p008C1.C0080l;
import p008C1.C0083o;
import p008C1.C0091w;
import p008C1.EnumC0089u;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0282O;
import p046Q.InterfaceC0436j;
import p051R1.AbstractC0490t;
import p051R1.C0466C;
import p051R1.C0473c;
import p051R1.C0474d;
import p051R1.C0477g;
import p063X0.C0541a;
import p079e.AbstractActivityC0798g;
import p081e1.C0878d;
import p081e1.C0880f;
import p081e1.C0881g;
import p081e1.C0883i;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2661k;
import p115p.AbstractFutureC2704g;
import p115p.C2700c;
import p115p.C2703f;
import p127t0.InterfaceC2766c;
import p127t0.InterfaceC2770g;
import p127t0.InterfaceC2771h;
import p130u0.C2787k;
import p140x1.C2893e;

/* renamed from: M1.m */
/* loaded from: classes.dex */
public abstract class AbstractC0387m implements InterfaceC0436j {

    /* renamed from: a */
    public static boolean f1044a = false;

    /* renamed from: b */
    public static Method f1045b = null;

    /* renamed from: c */
    public static boolean f1046c = false;

    /* renamed from: d */
    public static Field f1047d;

    /* renamed from: A */
    public static final boolean m1099A(AssertionError assertionError) {
        Logger logger = AbstractC0490t.f1242a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC0017j.m133K(message, "getsockname failed") : false;
    }

    /* renamed from: B */
    public static boolean m1100B(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* renamed from: D */
    public static boolean m1101D(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: E */
    public static MappedByteBuffer m1102E(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: F */
    public static C0083o m1103F(String... strArr) {
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC2492i.m4915e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr2.length;
        int r3 = 0;
        for (int r4 = 0; r4 < length; r4++) {
            if (strArr2[r4] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[r4] = AbstractC0017j.m148Z(inputNamesAndValues[r4]).toString();
        }
        int m1451p = AbstractC0580g.m1451p(0, strArr2.length - 1, 2);
        if (m1451p >= 0) {
            while (true) {
                String str = strArr2[r3];
                String str2 = strArr2[r3 + 1];
                AbstractC2480a.m4893v(str);
                AbstractC2480a.m4894w(str2, str);
                if (r3 == m1451p) {
                    break;
                }
                r3 += 2;
            }
        }
        return new C0083o(strArr2);
    }

    /* renamed from: G */
    public static void m1104G(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: N */
    public static void m1105N(View view, C0881g c0881g) {
        C0541a c0541a = c0881g.f3659a.f3643b;
        if (c0541a == null || !c0541a.f1468a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            f += AbstractC0272E.m705i((View) parent);
        }
        C0880f c0880f = c0881g.f3659a;
        if (c0880f.f3653l != f) {
            c0880f.f3653l = f;
            c0881g.m2410m();
        }
    }

    /* renamed from: O */
    public static final C0473c m1106O(Socket socket) {
        Logger logger = AbstractC0490t.f1242a;
        C0466C c0466c = new C0466C(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC2492i.m4914d(outputStream, "getOutputStream(...)");
        return new C0473c(c0466c, new C0473c(outputStream, c0466c));
    }

    /* renamed from: P */
    public static final C0474d m1107P(Socket socket) {
        Logger logger = AbstractC0490t.f1242a;
        C0466C c0466c = new C0466C(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC2492i.m4914d(inputStream, "getInputStream(...)");
        return new C0474d(c0466c, 0, new C0474d(inputStream, 1, c0466c));
    }

    /* renamed from: a */
    public static ArrayList m1108a(List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((EnumC0089u) obj) != EnumC0089u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2661k.m5122Z(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0089u) it.next()).f286a);
        }
        return arrayList2;
    }

    /* renamed from: g */
    public static void m1109g(int r6) {
        if (new C2893e(2, 36, 1).m5483b(r6)) {
            return;
        }
        throw new IllegalArgumentException("radix " + r6 + " was not in valid range " + new C2893e(2, 36, 1));
    }

    /* renamed from: h */
    public static void m1110h(int r3, int r4, int r5) {
        if (r3 >= 0 && r4 <= r5) {
            if (r3 > r4) {
                throw new IllegalArgumentException(AbstractC0002c.m12g("fromIndex: ", r3, r4, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + r3 + ", toIndex: " + r4 + ", size: " + r5);
    }

    /* renamed from: i */
    public static int m1111i(int r02, int r12, int r2) {
        return r02 < r12 ? r12 : r02 > r2 ? r2 : r02;
    }

    /* renamed from: j */
    public static void m1112j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: k */
    public static byte[] m1113k(List protocols) {
        AbstractC2492i.m4915e(protocols, "protocols");
        C0477g c0477g = new C0477g();
        Iterator it = m1108a(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0477g.m1274z(str.length());
            c0477g.m1249D(str);
        }
        return c0477g.m1260l(c0477g.f1217b);
    }

    /* renamed from: l */
    public static boolean m1114l(File file, Resources resources, int r2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(r2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m1115m = m1115m(file, inputStream);
            m1112j(inputStream);
            return m1115m;
        } catch (Throwable th2) {
            th = th2;
            m1112j(inputStream);
            throw th;
        }
    }

    /* renamed from: m */
    public static boolean m1115m(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m1112j(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m1112j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m1112j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* renamed from: n */
    public static AbstractC0379e m1116n(int r12) {
        return r12 != 0 ? r12 != 1 ? new C0883i() : new C0878d() : new C0883i();
    }

    /* renamed from: o */
    public static boolean m1117o(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0282O.f838d;
        C0282O c0282o = (C0282O) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0282o == null) {
            c0282o = new C0282O();
            c0282o.f839a = null;
            c0282o.f840b = null;
            c0282o.f841c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0282o);
        }
        WeakReference weakReference2 = c0282o.f841c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0282o.f841c = new WeakReference(keyEvent);
        if (c0282o.f840b == null) {
            c0282o.f840b = new SparseArray();
        }
        SparseArray sparseArray = c0282o.f840b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1118p(p028K.InterfaceC0313k r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L5
            return r1
        L5:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L10
            boolean r7 = r7.mo877c(r10)
            return r7
        L10:
            boolean r2 = r9 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r2 = r10.getKeyCode()
            r4 = 82
            if (r2 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r2 = p036M1.AbstractC0387m.f1044a
            if (r2 != 0) goto L4c
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            p036M1.AbstractC0387m.f1045b = r2     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            p036M1.AbstractC0387m.f1044a = r0
        L4c:
            java.lang.reflect.Method r2 = p036M1.AbstractC0387m.f1045b
            if (r2 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L61
            r4[r1] = r10     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L61
            boolean r1 = r8.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r1 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p028K.AbstractC0283P.m769b(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L7c:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L80:
            return r0
        L81:
            boolean r2 = r9 instanceof android.app.Dialog
            if (r2 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = p036M1.AbstractC0387m.f1046c
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            p036M1.AbstractC0387m.f1047d = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            p036M1.AbstractC0387m.f1046c = r0
        L9a:
            java.lang.reflect.Field r7 = p036M1.AbstractC0387m.f1047d
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r3
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p028K.AbstractC0283P.m769b(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        Lcf:
            boolean r0 = r10.dispatch(r9, r3, r9)
        Ld3:
            return r0
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = p028K.AbstractC0283P.m769b(r8, r10)
            if (r8 != 0) goto Le4
        Ldc:
            boolean r7 = r7.mo877c(r10)
            if (r7 == 0) goto Le3
            goto Le4
        Le3:
            r0 = r1
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036M1.AbstractC0387m.m1118p(K.k, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    /* renamed from: q */
    public static final boolean m1119q(char c, char c2, boolean z2) {
        if (c == c2) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: r */
    public static ColorStateList m1120r(Context context, C0015h c0015h, int r4) {
        int resourceId;
        ColorStateList m75u;
        TypedArray typedArray = (TypedArray) c0015h.f26c;
        return (!typedArray.hasValue(r4) || (resourceId = typedArray.getResourceId(r4, 0)) == 0 || (m75u = AbstractC0005b.m75u(context, resourceId)) == null) ? c0015h.m120o(r4) : m75u;
    }

    /* renamed from: s */
    public static ColorStateList m1121s(Context context, TypedArray typedArray, int r3) {
        int resourceId;
        ColorStateList m75u;
        return (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0 || (m75u = AbstractC0005b.m75u(context, resourceId)) == null) ? typedArray.getColorStateList(r3) : m75u;
    }

    /* renamed from: t */
    public static Drawable m1122t(Context context, TypedArray typedArray, int r3) {
        int resourceId;
        Drawable m1449n;
        return (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0 || (m1449n = AbstractC0580g.m1449n(context, resourceId)) == null) ? typedArray.getDrawable(r3) : m1449n;
    }

    /* renamed from: v */
    public static Intent m1123v(AbstractActivityC0798g abstractActivityC0798g) {
        Intent parentActivityIntent = abstractActivityC0798g.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String m1125x = m1125x(abstractActivityC0798g, abstractActivityC0798g.getComponentName());
            if (m1125x == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0798g, m1125x);
            try {
                return m1125x(abstractActivityC0798g, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m1125x + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: w */
    public static Intent m1124w(AbstractActivityC0798g abstractActivityC0798g, ComponentName componentName) {
        String m1125x = m1125x(abstractActivityC0798g, componentName);
        if (m1125x == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m1125x);
        return m1125x(abstractActivityC0798g, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: x */
    public static String m1125x(Activity activity, ComponentName componentName) {
        String string;
        PackageManager packageManager = activity.getPackageManager();
        int r12 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, r12 >= 29 ? 269222528 : r12 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* renamed from: y */
    public static File m1126y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int r2 = 0; r2 < 100; r2++) {
            File file = new File(cacheDir, str + r2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: z */
    public static boolean m1127z() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: C */
    public abstract boolean mo1128C();

    /* renamed from: H */
    public abstract void mo1129H(Throwable th);

    /* renamed from: I */
    public abstract void mo1130I(C0080l c0080l);

    /* renamed from: J */
    public abstract void mo1131J(C2703f c2703f, C2703f c2703f2);

    /* renamed from: K */
    public abstract void mo1132K(C2703f c2703f, Thread thread);

    /* renamed from: L */
    public abstract void mo1133L(boolean z2);

    /* renamed from: M */
    public abstract void mo1134M(boolean z2);

    /* renamed from: Q */
    public abstract TransformationMethod mo1135Q(TransformationMethod transformationMethod);

    /* renamed from: b */
    public InterfaceC2766c mo375b(Context context, Looper looper, C0091w c0091w, Object obj, InterfaceC2770g interfaceC2770g, InterfaceC2771h interfaceC2771h) {
        return mo376c(context, looper, c0091w, obj, (C2787k) interfaceC2770g, (C2787k) interfaceC2771h);
    }

    /* renamed from: c */
    public InterfaceC2766c mo376c(Context context, Looper looper, C0091w c0091w, Object obj, C2787k c2787k, C2787k c2787k2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* renamed from: d */
    public abstract boolean mo1136d(AbstractFutureC2704g abstractFutureC2704g, C2700c c2700c);

    /* renamed from: e */
    public abstract boolean mo1137e(AbstractFutureC2704g abstractFutureC2704g, Object obj, Object obj2);

    /* renamed from: f */
    public abstract boolean mo1138f(AbstractFutureC2704g abstractFutureC2704g, C2703f c2703f, C2703f c2703f2);

    /* renamed from: u */
    public abstract InputFilter[] mo1139u(InputFilter[] inputFilterArr);
}
