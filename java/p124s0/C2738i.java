package p124s0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.carwizard.p075li.youtube.R;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2492i;
import okhttp3.internal.publicsuffix.C2697a;
import p001A0.AbstractC0005b;
import p002A1.AbstractC0008a;
import p010D0.AbstractC0103a;
import p010D0.BinderC0111i;
import p010D0.C0104b;
import p010D0.C0105c;
import p011D1.AbstractC0119f;
import p026J0.C0224e;
import p028K.C0333u;
import p051R1.C0472b;
import p051R1.C0475e;
import p051R1.C0477g;
import p051R1.C0480j;
import p051R1.C0492v;
import p054S1.AbstractC0504c;
import p071b0.InterfaceC0719a;
import p073c0.InterfaceC0729e;
import p081e1.C0879e;
import p130u0.InterfaceC2784h;
import p133v0.AbstractC2863r;

/* renamed from: s0.i */
/* loaded from: classes.dex */
public class C2738i implements InterfaceC2784h, InterfaceC0719a, InterfaceC0729e {

    /* renamed from: a */
    public static C2738i f8988a;

    /* renamed from: b */
    public static C2738i f8989b;

    /* renamed from: c */
    public static C2738i f8990c;

    public /* synthetic */ C2738i(Object obj) {
    }

    /* renamed from: a */
    public static final String m5330a(byte[] bArr, byte[][] bArr2, int r20) {
        int r11;
        boolean z2;
        int r10;
        int r102;
        int r2 = -1;
        C0492v c0492v = C2697a.f8693g;
        int length = bArr.length;
        int r6 = 0;
        while (r6 < length) {
            int r7 = (r6 + length) / 2;
            while (r7 > r2 && bArr[r7] != 10) {
                r7 += r2;
            }
            int r9 = r7 + 1;
            int r103 = 1;
            while (true) {
                r11 = r9 + r103;
                if (bArr[r11] == 10) {
                    break;
                }
                r103++;
            }
            int r8 = r11 - r9;
            int r12 = r20;
            boolean z3 = false;
            int r13 = 0;
            int r14 = 0;
            while (true) {
                if (z3) {
                    r10 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[r12][r13];
                    byte[] bArr3 = AbstractC0119f.f362a;
                    int r15 = b2 & 255;
                    z2 = z3;
                    r10 = r15;
                }
                byte b3 = bArr[r9 + r14];
                byte[] bArr4 = AbstractC0119f.f362a;
                r102 = r10 - (b3 & 255);
                if (r102 != 0) {
                    break;
                }
                r14++;
                r13++;
                if (r14 == r8) {
                    break;
                }
                if (bArr2[r12].length != r13) {
                    z3 = z2;
                } else {
                    if (r12 == bArr2.length - 1) {
                        break;
                    }
                    r12++;
                    z3 = true;
                    r13 = -1;
                }
            }
            if (r102 >= 0) {
                if (r102 <= 0) {
                    int r22 = r8 - r14;
                    int length2 = bArr2[r12].length - r13;
                    int length3 = bArr2.length;
                    for (int r122 = r12 + 1; r122 < length3; r122++) {
                        length2 += bArr2[r122].length;
                    }
                    if (length2 >= r22) {
                        if (length2 <= r22) {
                            return new String(bArr, r9, r8, AbstractC0008a.f6a);
                        }
                    }
                }
                r6 = r11 + 1;
                r2 = -1;
            }
            length = r7;
            r2 = -1;
        }
        return null;
    }

    /* renamed from: b */
    public static final void m5331b(C0475e c0475e, long j2, boolean z2) {
        C0475e c0475e2;
        ReentrantLock reentrantLock = C0475e.f1206h;
        if (C0475e.f1210l == null) {
            C0475e.f1210l = new C0475e();
            C0472b c0472b = new C0472b("Okio Watchdog");
            c0472b.setDaemon(true);
            c0472b.start();
        }
        long nanoTime = System.nanoTime();
        if (j2 != 0 && z2) {
            c0475e.f1213g = Math.min(j2, c0475e.mo1239c() - nanoTime) + nanoTime;
        } else if (j2 != 0) {
            c0475e.f1213g = j2 + nanoTime;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            c0475e.f1213g = c0475e.mo1239c();
        }
        long j3 = c0475e.f1213g - nanoTime;
        C0475e c0475e3 = C0475e.f1210l;
        AbstractC2492i.m4912b(c0475e3);
        while (true) {
            c0475e2 = c0475e3.f1212f;
            if (c0475e2 == null || j3 < c0475e2.f1213g - nanoTime) {
                break;
            }
            AbstractC2492i.m4912b(c0475e2);
            c0475e3 = c0475e2;
        }
        c0475e.f1212f = c0475e2;
        c0475e3.f1212f = c0475e;
        if (c0475e3 == C0475e.f1210l) {
            C0475e.f1207i.signal();
        }
    }

    /* renamed from: d */
    public static C0475e m5332d() {
        C0475e c0475e = C0475e.f1210l;
        AbstractC2492i.m4912b(c0475e);
        C0475e c0475e2 = c0475e.f1212f;
        if (c0475e2 == null) {
            long nanoTime = System.nanoTime();
            C0475e.f1207i.await(C0475e.f1208j, TimeUnit.MILLISECONDS);
            C0475e c0475e3 = C0475e.f1210l;
            AbstractC2492i.m4912b(c0475e3);
            if (c0475e3.f1212f != null || System.nanoTime() - nanoTime < C0475e.f1209k) {
                return null;
            }
            return C0475e.f1210l;
        }
        long nanoTime2 = c0475e2.f1213g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0475e.f1207i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0475e c0475e4 = C0475e.f1210l;
        AbstractC2492i.m4912b(c0475e4);
        c0475e4.f1212f = c0475e2.f1212f;
        c0475e2.f1212f = null;
        c0475e2.f1211e = 2;
        return c0475e2;
    }

    /* renamed from: f */
    public static C0492v m5333f(String str, boolean z2) {
        AbstractC2492i.m4915e(str, "<this>");
        C0480j c0480j = AbstractC0504c.f1293a;
        C0477g c0477g = new C0477g();
        c0477g.m1249D(str);
        return AbstractC0504c.m1321d(c0477g, z2);
    }

    /* renamed from: i */
    public static void m5334i(Context context) {
        AbstractC2863r.m5474c(context);
        synchronized (C2738i.class) {
            try {
                if (f8988a == null) {
                    AbstractC2745p.m5339a(context);
                    C2738i c2738i = new C2738i();
                    context.getApplicationContext();
                    f8988a = c2738i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public static Path m5335j(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* renamed from: l */
    public static final boolean m5336l(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.signatures == null) {
            return false;
        }
        AbstractBinderC2742m[] abstractBinderC2742mArr = AbstractC2744o.f9001a;
        Signature[] signatureArr = packageInfo.signatures;
        AbstractBinderC2742m abstractBinderC2742m = null;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            } else {
                int r3 = 0;
                BinderC2743n binderC2743n = new BinderC2743n(packageInfo.signatures[0].toByteArray());
                while (true) {
                    if (r3 >= abstractBinderC2742mArr.length) {
                        break;
                    }
                    if (abstractBinderC2742mArr[r3].equals(binderC2743n)) {
                        abstractBinderC2742m = abstractBinderC2742mArr[r3];
                        break;
                    }
                    r3++;
                }
            }
        }
        return abstractBinderC2742m != null;
    }

    @Override // p071b0.InterfaceC0719a
    /* renamed from: c */
    public CharSequence mo1978c(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f2449a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p073c0.InterfaceC0729e
    /* renamed from: e */
    public void mo207e(int r4, Serializable serializable) {
        String str;
        switch (r4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (r4 == 6 || r4 == 7 || r4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p073c0.InterfaceC0729e
    /* renamed from: g */
    public void mo209g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p130u0.InterfaceC2784h
    /* renamed from: h */
    public void mo5034h(Object obj, Object obj2) {
        C0105c c0105c = (C0105c) ((C0104b) obj).m2040q();
        BinderC0111i binderC0111i = new BinderC0111i((C0224e) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int r12 = AbstractC0103a.f329a;
        obtain.writeInt(1);
        AbstractC0005b.m60Z(obtain, AbstractC0005b.m59Y(obtain, 20293));
        obtain.writeStrongBinder(binderC0111i);
        Parcel obtain2 = Parcel.obtain();
        try {
            c0105c.f330a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* renamed from: k */
    public Signature[] mo1612k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public C2738i(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new C0333u(view);
        } else {
            new C0879e(view);
        }
    }
}
