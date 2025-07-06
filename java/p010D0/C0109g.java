package p010D0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.emoji2.text.C0614d;
import androidx.emoji2.text.C0624n;
import androidx.emoji2.text.C0631u;
import androidx.fragment.app.AbstractComponentCallbacksC0666p;
import androidx.fragment.app.C0638E;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.AbstractC0052d;
import p006C.AbstractC0053e;
import p006C.C0055g;
import p008C1.C0067B;
import p008C1.C0070b;
import p008C1.C0080l;
import p008C1.C0083o;
import p011D1.AbstractC0122i;
import p018G1.C0152c;
import p018G1.C0160k;
import p018G1.C0162m;
import p018G1.C0163n;
import p021H1.C0191g;
import p022I.C0201j;
import p026J0.C0224e;
import p026J0.InterfaceC0221b;
import p028K.InterfaceC0325q;
import p057U.C0523a;
import p058V.C0525a;
import p058V.C0533i;
import p065Y0.C0558m;
import p079e.AbstractActivityC0798g;
import p080e0.C0822E;
import p080e0.C0852e0;
import p081e1.C0879e;
import p118q.C2713d;
import p118q.C2715f;

/* renamed from: D0.g */
/* loaded from: classes.dex */
public final class C0109g implements InterfaceC0325q, InterfaceC0221b {

    /* renamed from: d */
    public static C0109g f336d;

    /* renamed from: a */
    public final /* synthetic */ int f337a;

    /* renamed from: b */
    public Object f338b;

    /* renamed from: c */
    public Object f339c;

    public /* synthetic */ C0109g(int r12) {
        this.f337a = r12;
    }

    /* renamed from: F */
    public static final SharedPreferences m342F(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: G */
    public static final void m343G(Context context) {
        if (m342F(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new C0108f("Failed to store the app set ID last used time.");
    }

    /* renamed from: h */
    public static boolean m344h(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0631u[] c0631uArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0631uArr = (C0631u[]) editable.getSpans(selectionStart, selectionEnd, C0631u.class)) != null && c0631uArr.length > 0) {
            for (C0631u c0631u : c0631uArr) {
                int spanStart = editable.getSpanStart(c0631u);
                int spanEnd = editable.getSpanEnd(c0631u);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: y */
    public static int m345y(int r5, int r6) {
        int r2 = 0;
        int r3 = 0;
        for (int r12 = 0; r12 < r5; r12++) {
            r2++;
            if (r2 == r6) {
                r3++;
                r2 = 0;
            } else if (r2 > r6) {
                r3++;
                r2 = 1;
            }
        }
        return r2 + 1 > r6 ? r3 + 1 : r3;
    }

    /* renamed from: A */
    public void m346A() {
        ((SparseIntArray) this.f338b).clear();
    }

    /* renamed from: B */
    public boolean m347B(View view) {
        C0822E c0822e = (C0822E) this.f338b;
        int m2274d = c0822e.m2274d();
        int m2273c = c0822e.m2273c();
        int m2272b = c0822e.m2272b(view);
        int m2271a = c0822e.m2271a(view);
        C0852e0 c0852e0 = (C0852e0) this.f339c;
        c0852e0.f3499b = m2274d;
        c0852e0.f3500c = m2273c;
        c0852e0.f3501d = m2272b;
        c0852e0.f3502e = m2271a;
        c0852e0.f3498a = 24579;
        return c0852e0.m2350a();
    }

    /* renamed from: C */
    public void m348C(C0152c connectPlan) {
        AbstractC2492i.m4915e(connectPlan, "connectPlan");
        ((C0162m) this.f338b).f484o.remove(connectPlan);
    }

    /* renamed from: D */
    public void m349D(int r2, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = r2;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        ((Messenger) this.f338b).send(obtain);
    }

    /* renamed from: E */
    public void m350E(C0067B route) {
        AbstractC2492i.m4915e(route, "route");
        C0055g c0055g = ((C0162m) this.f338b).f470a.f275y;
        synchronized (c0055g) {
            ((LinkedHashSet) c0055g.f107b).remove(route);
        }
    }

    /* renamed from: a */
    public void m351a(C0163n connection) {
        AbstractC2492i.m4915e(connection, "connection");
        C0162m c0162m = (C0162m) this.f338b;
        c0162m.getClass();
        C0083o c0083o = AbstractC0122i.f368a;
        if (c0162m.f477h != null) {
            throw new IllegalStateException("Check failed.");
        }
        c0162m.f477h = connection;
        connection.f503t.add(new C0160k(c0162m, c0162m.f475f));
    }

    /* renamed from: b */
    public void m352b(Object obj, String str) {
        ArrayList arrayList = (ArrayList) this.f338b;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        arrayList.add(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // p028K.InterfaceC0325q
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p028K.C0340x0 mo353c(android.view.View r17, p028K.C0340x0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f339c
            Y0.m r3 = (p065Y0.C0558m) r3
            int r4 = r3.f1563a
            java.lang.Object r5 = r0.f338b
            I.j r5 = (p022I.C0201j) r5
            K.v0 r6 = r2.f944a
            r7 = 7
            C.c r7 = r6.mo950f(r7)
            r8 = 32
            C.c r6 = r6.mo950f(r8)
            int r8 = r7.f99b
            java.lang.Object r9 = r5.f603b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            r9.f2801w = r8
            boolean r8 = p065Y0.AbstractC0556k.m1411e(r17)
            int r10 = r17.getPaddingBottom()
            int r11 = r17.getPaddingLeft()
            int r12 = r17.getPaddingRight()
            boolean r13 = r9.f2793o
            if (r13 == 0) goto L42
            int r10 = r18.m976a()
            r9.f2800v = r10
            int r14 = r3.f1565c
            int r10 = r10 + r14
        L42:
            int r3 = r3.f1564b
            boolean r14 = r9.f2794p
            int r15 = r7.f98a
            if (r14 == 0) goto L50
            if (r8 == 0) goto L4e
            r11 = r3
            goto L4f
        L4e:
            r11 = r4
        L4f:
            int r11 = r11 + r15
        L50:
            boolean r14 = r9.f2795q
            int r0 = r7.f100c
            if (r14 == 0) goto L5c
            if (r8 == 0) goto L59
            goto L5a
        L59:
            r4 = r3
        L5a:
            int r12 = r4 + r0
        L5c:
            android.view.ViewGroup$LayoutParams r3 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.f2797s
            r8 = 1
            if (r4 == 0) goto L6f
            int r4 = r3.leftMargin
            if (r4 == r15) goto L6f
            r3.leftMargin = r15
            r4 = r8
            goto L70
        L6f:
            r4 = 0
        L70:
            boolean r14 = r9.f2798t
            if (r14 == 0) goto L7b
            int r14 = r3.rightMargin
            if (r14 == r0) goto L7b
            r3.rightMargin = r0
            r4 = r8
        L7b:
            boolean r0 = r9.f2799u
            if (r0 == 0) goto L88
            int r0 = r3.topMargin
            int r7 = r7.f99b
            if (r0 == r7) goto L88
            r3.topMargin = r7
            goto L89
        L88:
            r8 = r4
        L89:
            if (r8 == 0) goto L8e
            r1.setLayoutParams(r3)
        L8e:
            int r0 = r17.getPaddingTop()
            r1.setPadding(r11, r0, r12, r10)
            boolean r0 = r5.f602a
            if (r0 == 0) goto L9d
            int r1 = r6.f101d
            r9.f2791m = r1
        L9d:
            if (r13 != 0) goto La1
            if (r0 == 0) goto La4
        La1:
            r9.m2067I()
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D0.C0109g.mo353c(android.view.View, K.x0):K.x0");
    }

    /* renamed from: d */
    public void m354d(C0152c connectPlan) {
        AbstractC2492i.m4915e(connectPlan, "connectPlan");
        ((C0162m) this.f338b).f484o.add(connectPlan);
    }

    /* renamed from: e */
    public void m355e(C0067B route, IOException iOException) {
        AbstractC2492i.m4915e(route, "route");
        ((C0162m) this.f338b).getClass();
        InetSocketAddress inetSocketAddress = route.f131c;
        AbstractC2492i.m4915e(inetSocketAddress, "inetSocketAddress");
    }

    /* renamed from: f */
    public void m356f(C0163n connection) {
        AbstractC2492i.m4915e(connection, "connection");
        ((C0162m) this.f338b).getClass();
    }

    /* renamed from: g */
    public void m357g(C0163n connection) {
        AbstractC2492i.m4915e(connection, "connection");
        connection.f495l.getClass();
        C0162m call = (C0162m) this.f338b;
        AbstractC2492i.m4915e(call, "call");
    }

    /* renamed from: i */
    public void m358i(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m358i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public void m359j(boolean z2) {
        C0638E c0638e = (C0638E) this.f339c;
        AbstractActivityC0798g abstractActivityC0798g = c0638e.f2139n.f2343e;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0638e.f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m359j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public void m360k(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m360k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: l */
    public void m361l(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m361l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: m */
    public void m362m(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m362m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: n */
    public void m363n(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m363n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: o */
    public void m364o(boolean z2) {
        C0638E c0638e = (C0638E) this.f339c;
        AbstractActivityC0798g abstractActivityC0798g = c0638e.f2139n.f2343e;
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0638e.f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m364o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p026J0.InterfaceC0221b
    public void onComplete(Task task) {
        ((Map) ((C0113k) this.f339c).f348c).remove((C0224e) this.f338b);
    }

    /* renamed from: p */
    public void m365p(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m365p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public void m366q(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m366q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: r */
    public void m367r(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m367r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: s */
    public void m368s(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m368s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: t */
    public void m369t(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m369t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f337a) {
            case 10:
                String str = "[ ";
                if (((C2715f) this.f338b) != null) {
                    for (int r02 = 0; r02 < 9; r02++) {
                        str = str + ((C2715f) this.f338b).f8773h[r02] + " ";
                    }
                }
                return str + "] " + ((C2715f) this.f338b);
            case 13:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f339c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f338b;
                int size = arrayList.size();
                for (int r3 = 0; r3 < size; r3++) {
                    sb.append((String) arrayList.get(r3));
                    if (r3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m370u(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m370u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: v */
    public void m371v(boolean z2) {
        AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = ((C0638E) this.f339c).f2141p;
        if (abstractComponentCallbacksC0666p != null) {
            abstractComponentCallbacksC0666p.m1767j().f2136k.m371v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f338b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: w */
    public boolean m372w() {
        return !AbstractC2492i.m4911a((String) ((C0191g) this.f339c).f581e.f295c, "GET");
    }

    /* renamed from: x */
    public View m373x(int r10, int r11, int r12, int r13) {
        View m2302u;
        C0822E c0822e = (C0822E) this.f338b;
        int m2274d = c0822e.m2274d();
        int m2273c = c0822e.m2273c();
        int r3 = r11 > r10 ? 1 : -1;
        View view = null;
        while (r10 != r11) {
            switch (c0822e.f3355a) {
                case 0:
                    m2302u = c0822e.f3356b.m2302u(r10);
                    break;
                default:
                    m2302u = c0822e.f3356b.m2302u(r10);
                    break;
            }
            int m2272b = c0822e.m2272b(m2302u);
            int m2271a = c0822e.m2271a(m2302u);
            C0852e0 c0852e0 = (C0852e0) this.f339c;
            c0852e0.f3499b = m2274d;
            c0852e0.f3500c = m2273c;
            c0852e0.f3501d = m2272b;
            c0852e0.f3502e = m2271a;
            if (r12 != 0) {
                c0852e0.f3498a = r12;
                if (c0852e0.m2350a()) {
                    return m2302u;
                }
            }
            if (r13 != 0) {
                c0852e0.f3498a = r13;
                if (c0852e0.m2350a()) {
                    view = m2302u;
                }
            }
            r10 += r3;
        }
        return view;
    }

    /* renamed from: z */
    public boolean m374z(CharSequence charSequence, int r9, int r10, C0624n c0624n) {
        if (c0624n.f2087c == 0) {
            C0614d c0614d = (C0614d) this.f339c;
            C0523a m1637c = c0624n.m1637c();
            int m689a = m1637c.m689a(8);
            if (m689a != 0) {
                ((ByteBuffer) m1637c.f833d).getShort(m689a + m1637c.f830a);
            }
            c0614d.getClass();
            ThreadLocal threadLocal = C0614d.f2060b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (r9 < r10) {
                sb.append(charSequence.charAt(r9));
                r9++;
            }
            TextPaint textPaint = c0614d.f2061a;
            String sb2 = sb.toString();
            int r102 = AbstractC0053e.f102a;
            c0624n.f2087c = AbstractC0052d.m200a(textPaint, sb2) ? 2 : 1;
        }
        return c0624n.f2087c == 2;
    }

    public /* synthetic */ C0109g(Object obj, int r2, Object obj2) {
        this.f337a = r2;
        this.f339c = obj;
        this.f338b = obj2;
    }

    public C0109g(Context context) {
        this.f337a = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f339c = Executors.newSingleThreadExecutor();
        this.f338b = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC0107e(0, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public /* synthetic */ C0109g(Object obj) {
        this.f337a = 13;
        this.f339c = obj;
        this.f338b = new ArrayList();
    }

    public C0109g(C0162m call, C0070b c0070b, C0191g c0191g) {
        this.f337a = 2;
        AbstractC2492i.m4915e(call, "call");
        this.f338b = call;
        this.f339c = c0191g;
    }

    public C0109g(C2713d c2713d) {
        this.f337a = 10;
        this.f339c = c2713d;
    }

    public C0109g(C0638E c0638e) {
        this.f337a = 7;
        this.f338b = new CopyOnWriteArrayList();
        this.f339c = c0638e;
    }

    public C0109g(Runnable runnable) {
        this.f337a = 3;
        this.f339c = new CopyOnWriteArrayList();
        new HashMap();
        this.f338b = runnable;
    }

    public C0109g(C0080l c0080l, C0879e c0879e, C0614d c0614d) {
        this.f337a = 6;
        this.f338b = c0080l;
        this.f339c = c0614d;
    }

    public C0109g(C0822E c0822e) {
        this.f337a = 9;
        this.f338b = c0822e;
        C0852e0 c0852e0 = new C0852e0();
        c0852e0.f3498a = 0;
        this.f339c = c0852e0;
    }

    public C0109g(EditText editText) {
        this.f337a = 1;
        this.f338b = editText;
        C0533i c0533i = new C0533i(editText);
        this.f339c = c0533i;
        editText.addTextChangedListener(c0533i);
        if (C0525a.f1436b == null) {
            synchronized (C0525a.f1435a) {
                try {
                    if (C0525a.f1436b == null) {
                        C0525a c0525a = new C0525a();
                        try {
                            C0525a.f1437c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0525a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0525a.f1436b = c0525a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0525a.f1436b);
    }

    public C0109g(C0201j c0201j, C0558m c0558m) {
        this.f337a = 4;
        this.f338b = c0201j;
        this.f339c = c0558m;
    }

    public C0109g() {
        this.f337a = 8;
        this.f338b = new SparseIntArray();
        this.f339c = new SparseIntArray();
    }
}
