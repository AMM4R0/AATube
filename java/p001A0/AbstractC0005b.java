package p001A0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0617g;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p006C.C0054f;
import p008C1.AbstractC0066A;
import p008C1.C0079k;
import p008C1.C0093y;
import p008C1.C0094z;
import p011D1.AbstractC0122i;
import p011D1.C0114a;
import p022I.C0198g;
import p036M1.AbstractC0379e;
import p046Q.AbstractC0439m;
import p046Q.AbstractC0440n;
import p046Q.AbstractC0441o;
import p046Q.ActionModeCallbackC0442p;
import p080e0.AbstractC0824G;
import p080e0.C0835S;
import p090i0.AbstractC0976v;
import p104l.C2562d0;
import p117p1.AbstractC2709a;
import p119q1.AbstractC2716a;

/* renamed from: A0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0005b {

    /* renamed from: a */
    public static Context f0a = null;

    /* renamed from: b */
    public static Boolean f1b = null;

    /* renamed from: c */
    public static boolean f2c = true;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p003B.C0030d m46E(java.lang.String r9) {
        /*
            java.lang.String r0 = "statusLine"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r9, r0)
            java.lang.String r0 = "HTTP/1."
            r1 = 0
            boolean r0 = p002A1.AbstractC0025r.m156I(r9, r0, r1)
            C1.u r2 = p008C1.EnumC0089u.HTTP_1_0
            C1.u r3 = p008C1.EnumC0089u.HTTP_1_1
            r4 = 4
            r5 = 32
            java.lang.String r6 = "Unexpected status line: "
            if (r0 == 0) goto L48
            int r0 = r9.length()
            r1 = 9
            if (r0 < r1) goto L3e
            r0 = 8
            char r0 = r9.charAt(r0)
            if (r0 != r5) goto L3e
            r0 = 7
            char r0 = r9.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 == 0) goto L5d
            r2 = 1
            if (r0 != r2) goto L34
            goto L5c
        L34:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r6.concat(r9)
            r0.<init>(r9)
            throw r0
        L3e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r6.concat(r9)
            r0.<init>(r9)
            throw r0
        L48:
            java.lang.String r0 = "ICY "
            boolean r0 = p002A1.AbstractC0025r.m156I(r9, r0, r1)
            if (r0 == 0) goto L52
            r1 = r4
            goto L5d
        L52:
            java.lang.String r0 = "SOURCETABLE "
            boolean r0 = p002A1.AbstractC0025r.m156I(r9, r0, r1)
            if (r0 == 0) goto Lb3
            r1 = 12
        L5c:
            r2 = r3
        L5d:
            int r0 = r9.length()
            int r3 = r1 + 3
            if (r0 < r3) goto La9
            java.lang.String r0 = r9.substring(r1, r3)
            java.lang.String r7 = "substring(...)"
            kotlin.jvm.internal.AbstractC2492i.m4914d(r0, r7)
            java.lang.Integer r0 = p002A1.AbstractC0024q.m150C(r0)
            if (r0 == 0) goto L9f
            int r0 = r0.intValue()
            int r8 = r9.length()
            if (r8 <= r3) goto L97
            char r3 = r9.charAt(r3)
            if (r3 != r5) goto L8d
            int r1 = r1 + r4
            java.lang.String r9 = r9.substring(r1)
            kotlin.jvm.internal.AbstractC2492i.m4914d(r9, r7)
            goto L99
        L8d:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r6.concat(r9)
            r0.<init>(r9)
            throw r0
        L97:
            java.lang.String r9 = ""
        L99:
            B.d r1 = new B.d
            r1.<init>(r2, r0, r9)
            return r1
        L9f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r6.concat(r9)
            r0.<init>(r9)
            throw r0
        La9:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r6.concat(r9)
            r0.<init>(r9)
            throw r0
        Lb3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r9 = r6.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A0.AbstractC0005b.m46E(java.lang.String):B.d");
    }

    /* renamed from: F */
    public static long m47F(int r14, String str) {
        int m73s = m73s(str, 0, r14, false);
        Matcher matcher = C0079k.f208n.matcher(str);
        int r4 = -1;
        int r5 = -1;
        int r6 = -1;
        int r7 = -1;
        int r8 = -1;
        int r9 = -1;
        while (m73s < r14) {
            int m73s2 = m73s(str, m73s + 1, r14, true);
            matcher.region(m73s, m73s2);
            if (r5 == -1 && matcher.usePattern(C0079k.f208n).matches()) {
                String group = matcher.group(1);
                AbstractC2492i.m4914d(group, "group(...)");
                r5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                AbstractC2492i.m4914d(group2, "group(...)");
                r8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                AbstractC2492i.m4914d(group3, "group(...)");
                r9 = Integer.parseInt(group3);
            } else if (r6 == -1 && matcher.usePattern(C0079k.f207m).matches()) {
                String group4 = matcher.group(1);
                AbstractC2492i.m4914d(group4, "group(...)");
                r6 = Integer.parseInt(group4);
            } else {
                if (r7 == -1) {
                    Pattern pattern = C0079k.f206l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        AbstractC2492i.m4914d(group5, "group(...)");
                        Locale US = Locale.US;
                        AbstractC2492i.m4914d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        AbstractC2492i.m4914d(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        AbstractC2492i.m4914d(pattern2, "pattern(...)");
                        r7 = AbstractC0017j.m137O(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (r4 == -1 && matcher.usePattern(C0079k.f205k).matches()) {
                    String group6 = matcher.group(1);
                    AbstractC2492i.m4914d(group6, "group(...)");
                    r4 = Integer.parseInt(group6);
                }
            }
            m73s = m73s(str, m73s2 + 1, r14, false);
        }
        if (70 <= r4 && r4 < 100) {
            r4 += 1900;
        }
        if (r4 >= 0 && r4 < 70) {
            r4 += 2000;
        }
        if (r4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (r7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > r6 || r6 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (r5 < 0 || r5 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (r8 < 0 || r8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (r9 < 0 || r9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC0122i.f369b);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, r4);
        gregorianCalendar.set(2, r7 - 1);
        gregorianCalendar.set(5, r6);
        gregorianCalendar.set(11, r5);
        gregorianCalendar.set(12, r8);
        gregorianCalendar.set(13, r9);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: K */
    public static void m48K(TextView textView, int r4) {
        AbstractC0379e.m1072c(r4);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0441o.m1197d(textView, r4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int r02 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (r4 > Math.abs(r02)) {
            textView.setPadding(textView.getPaddingLeft(), r4 + r02, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: L */
    public static void m49L(TextView textView, int r4) {
        AbstractC0379e.m1072c(r4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int r02 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (r4 > Math.abs(r02)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), r4 - r02);
        }
    }

    /* renamed from: M */
    public static String m50M(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        AbstractC2492i.m4914d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* renamed from: P */
    public static final C0094z m51P(C0094z c0094z) {
        AbstractC2492i.m4915e(c0094z, "<this>");
        C0093y m311b = c0094z.m311b();
        AbstractC0066A abstractC0066A = c0094z.f321g;
        m311b.f307g = new C0114a(abstractC0066A.mo249g(), abstractC0066A.mo248b());
        return m311b.m310a();
    }

    /* renamed from: Q */
    public static void m52Q(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0976v.m2585b(viewGroup, z2);
        } else if (f2c) {
            try {
                AbstractC0976v.m2585b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2c = false;
            }
        }
    }

    /* renamed from: S */
    public static ActionMode.Callback m53S(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0442p) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0442p) callback).f1129a;
    }

    /* renamed from: T */
    public static ActionMode.Callback m54T(ActionMode.Callback callback, TextView textView) {
        int r02 = Build.VERSION.SDK_INT;
        return (r02 < 26 || r02 > 27 || (callback instanceof ActionModeCallbackC0442p) || callback == null) ? callback : new ActionModeCallbackC0442p(callback, textView);
    }

    /* renamed from: U */
    public static void m55U(Parcel parcel, int r12, Parcelable parcelable, int r3) {
        if (parcelable == null) {
            return;
        }
        int m59Y = m59Y(parcel, r12);
        parcelable.writeToParcel(parcel, r3);
        m60Z(parcel, m59Y);
    }

    /* renamed from: V */
    public static void m56V(Parcel parcel, int r12, String str) {
        if (str == null) {
            return;
        }
        int m59Y = m59Y(parcel, r12);
        parcel.writeString(str);
        m60Z(parcel, m59Y);
    }

    /* renamed from: W */
    public static void m57W(Parcel parcel, int r7, Parcelable[] parcelableArr, int r9) {
        if (parcelableArr == null) {
            return;
        }
        int m59Y = m59Y(parcel, r7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, r9);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        m60Z(parcel, m59Y);
    }

    /* renamed from: X */
    public static void m58X(Parcel parcel, int r7, List list) {
        if (list == null) {
            return;
        }
        int m59Y = m59Y(parcel, r7);
        int size = list.size();
        parcel.writeInt(size);
        for (int r2 = 0; r2 < size; r2++) {
            Parcelable parcelable = (Parcelable) list.get(r2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        m60Z(parcel, m59Y);
    }

    /* renamed from: Y */
    public static int m59Y(Parcel parcel, int r2) {
        parcel.writeInt(r2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: Z */
    public static void m60Z(Parcel parcel, int r3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(r3 - 4);
        parcel.writeInt(dataPosition - r3);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a0 */
    public static void m61a0(Parcel parcel, int r12, int r2) {
        parcel.writeInt(r12 | (r2 << 16));
    }

    /* renamed from: c */
    public static Object m62c(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: f */
    public static void m63f(Throwable th, Throwable exception) {
        AbstractC2492i.m4915e(th, "<this>");
        AbstractC2492i.m4915e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC2716a.f8778a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC2709a.f8729a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    /* renamed from: g */
    public static boolean m64g(C0054f[] c0054fArr, C0054f[] c0054fArr2) {
        if (c0054fArr == null || c0054fArr2 == null || c0054fArr.length != c0054fArr2.length) {
            return false;
        }
        for (int r12 = 0; r12 < c0054fArr.length; r12++) {
            C0054f c0054f = c0054fArr[r12];
            char c = c0054f.f103a;
            C0054f c0054f2 = c0054fArr2[r12];
            if (c != c0054f2.f103a || c0054f.f104b.length != c0054f2.f104b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static final void m65i(String str, C0094z c0094z) {
        if (c0094z != null) {
            if (c0094z.f322h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c0094z.f323i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c0094z.f324j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: l */
    public static final void m66l(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            m63f(th, th2);
        }
    }

    /* renamed from: m */
    public static int m67m(C0835S c0835s, AbstractC0617g abstractC0617g, View view, View view2, AbstractC0824G abstractC0824G, boolean z2) {
        if (abstractC0824G.m2304v() == 0 || c0835s.m2321b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0824G.m2276H(view) - AbstractC0824G.m2276H(view2)) + 1;
        }
        return Math.min(abstractC0617g.mo1624l(), abstractC0617g.mo1614b(view2) - abstractC0617g.mo1617e(view));
    }

    /* renamed from: n */
    public static int m68n(C0835S c0835s, AbstractC0617g abstractC0617g, View view, View view2, AbstractC0824G abstractC0824G, boolean z2, boolean z3) {
        if (abstractC0824G.m2304v() == 0 || c0835s.m2321b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (c0835s.m2321b() - Math.max(AbstractC0824G.m2276H(view), AbstractC0824G.m2276H(view2))) - 1) : Math.max(0, Math.min(AbstractC0824G.m2276H(view), AbstractC0824G.m2276H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(abstractC0617g.mo1614b(view2) - abstractC0617g.mo1617e(view)) / (Math.abs(AbstractC0824G.m2276H(view) - AbstractC0824G.m2276H(view2)) + 1))) + (abstractC0617g.mo1623k() - abstractC0617g.mo1617e(view)));
        }
        return max;
    }

    /* renamed from: o */
    public static int m69o(C0835S c0835s, AbstractC0617g abstractC0617g, View view, View view2, AbstractC0824G abstractC0824G, boolean z2) {
        if (abstractC0824G.m2304v() == 0 || c0835s.m2321b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0835s.m2321b();
        }
        return (int) (((abstractC0617g.mo1614b(view2) - abstractC0617g.mo1617e(view)) / (Math.abs(AbstractC0824G.m2276H(view) - AbstractC0824G.m2276H(view2)) + 1)) * c0835s.m2321b());
    }

    /* renamed from: p */
    public static float[] m70p(float[] fArr, int r3) {
        if (r3 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(r3, length);
        float[] fArr2 = new float[r3];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p006C.C0054f[] m71q(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A0.AbstractC0005b.m71q(java.lang.String):C.f[]");
    }

    /* renamed from: r */
    public static Path m72r(String str) {
        Path path = new Path();
        try {
            C0054f.m202b(m71q(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    /* renamed from: s */
    public static int m73s(String str, int r5, int r6, boolean z2) {
        while (r5 < r6) {
            char charAt = str.charAt(r5);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return r5;
            }
            r5++;
        }
        return r6;
    }

    /* renamed from: t */
    public static C0054f[] m74t(C0054f[] c0054fArr) {
        C0054f[] c0054fArr2 = new C0054f[c0054fArr.length];
        for (int r12 = 0; r12 < c0054fArr.length; r12++) {
            c0054fArr2[r12] = new C0054f(c0054fArr[r12]);
        }
        return c0054fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.f63c == r8.hashCode()) goto L21;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m75u(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            B.m r1 = new B.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = p003B.AbstractC0043q.f74c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p003B.AbstractC0043q.f73b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            B.l r5 = (p003B.C0038l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f62b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f63c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L92
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f63c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f61a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L91
        L54:
            java.lang.ThreadLocal r2 = p003B.AbstractC0043q.f72a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p003B.AbstractC0029c.m176a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8d
            p003B.AbstractC0043q.m188a(r1, r9, r4, r8)
            r3 = r4
            goto L91
        L8d:
            android.content.res.ColorStateList r3 = p003B.AbstractC0037k.m186b(r0, r9, r8)
        L91:
            return r3
        L92:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A0.AbstractC0005b.m75u(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: v */
    public static C0198g m76v(C2562d0 c2562d0) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 28) {
            return new C0198g(AbstractC0441o.m1196c(c2562d0));
        }
        TextPaint textPaint = new TextPaint(c2562d0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int m1185a = AbstractC0439m.m1185a(c2562d0);
        int m1188d = AbstractC0439m.m1188d(c2562d0);
        if (c2562d0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (r02 < 28 || (c2562d0.getInputType() & 15) != 3) {
                boolean z2 = c2562d0.getLayoutDirection() == 1;
                switch (c2562d0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0441o.m1195b(AbstractC0440n.m1193a(c2562d0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0198g(textPaint, textDirectionHeuristic, m1185a, m1188d);
    }

    /* renamed from: B */
    public abstract void mo78B(int r12);

    /* renamed from: C */
    public abstract void mo79C(View view, int r2, int r3);

    /* renamed from: D */
    public abstract void mo80D(View view, float f, float f2);

    /* renamed from: G */
    public abstract Object mo81G(int r12, Intent intent);

    /* renamed from: J */
    public abstract void mo84J(boolean z2);

    /* renamed from: N */
    public abstract void mo85N();

    /* renamed from: O */
    public abstract void mo86O();

    /* renamed from: R */
    public abstract boolean mo87R(View view, int r2);

    /* renamed from: h */
    public boolean mo88h() {
        return false;
    }

    /* renamed from: j */
    public abstract int mo89j(View view, int r2);

    /* renamed from: k */
    public abstract int mo90k(View view, int r2);

    /* renamed from: w */
    public int mo91w(View view) {
        return 0;
    }

    /* renamed from: x */
    public int mo92x() {
        return 0;
    }

    /* renamed from: y */
    public abstract View mo93y(int r12);

    /* renamed from: z */
    public abstract boolean mo94z();

    /* renamed from: H */
    public void mo82H() {
    }

    /* renamed from: I */
    public void mo83I(boolean z2) {
    }

    /* renamed from: A */
    public void mo77A(View view, int r2) {
    }
}
