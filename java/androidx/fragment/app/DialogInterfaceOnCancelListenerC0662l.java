package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0713w;
import androidx.lifecycle.C0714x;
import com.carwizard.p075li.youtube.R;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p006C.C0055g;
import p010D0.RunnableC0107e;
import p079e.AbstractActivityC0798g;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0662l extends AbstractComponentCallbacksC0666p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: R */
    public final DialogInterfaceOnCancelListenerC0659i f2269R;

    /* renamed from: S */
    public final DialogInterfaceOnDismissListenerC0660j f2270S;

    /* renamed from: T */
    public int f2271T;

    /* renamed from: U */
    public int f2272U;

    /* renamed from: V */
    public boolean f2273V;

    /* renamed from: W */
    public boolean f2274W;

    /* renamed from: X */
    public int f2275X;

    /* renamed from: Y */
    public boolean f2276Y;

    /* renamed from: Z */
    public final C0055g f2277Z;

    /* renamed from: a0 */
    public Dialog f2278a0;

    /* renamed from: b0 */
    public boolean f2279b0;

    /* renamed from: c0 */
    public boolean f2280c0;

    /* renamed from: d0 */
    public boolean f2281d0;

    /* renamed from: e0 */
    public boolean f2282e0;

    public DialogInterfaceOnCancelListenerC0662l() {
        new RunnableC0107e(8, this);
        this.f2269R = new DialogInterfaceOnCancelListenerC0659i(this);
        this.f2270S = new DialogInterfaceOnDismissListenerC0660j(this);
        this.f2271T = 0;
        this.f2272U = 0;
        this.f2273V = true;
        this.f2274W = true;
        this.f2275X = -1;
        this.f2277Z = new C0055g(18, this);
        this.f2282e0 = false;
    }

    /* renamed from: A */
    public Dialog mo1751A() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1770w(), this.f2272U);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: c */
    public final AbstractC0005b mo1752c() {
        return new C0661k(this, new C0663m(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: l */
    public final void mo1753l(AbstractActivityC0798g abstractActivityC0798g) {
        super.mo1753l(abstractActivityC0798g);
        this.f2309N.m1805d(this.f2277Z);
        if (this.f2281d0) {
            return;
        }
        this.f2280c0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: m */
    public void mo1754m(Bundle bundle) {
        super.mo1754m(bundle);
        new Handler();
        this.f2274W = this.f2334w == 0;
        if (bundle != null) {
            this.f2271T = bundle.getInt("android:style", 0);
            this.f2272U = bundle.getInt("android:theme", 0);
            this.f2273V = bundle.getBoolean("android:cancelable", true);
            this.f2274W = bundle.getBoolean("android:showsDialog", this.f2274W);
            this.f2275X = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: o */
    public final void mo1755o() {
        this.f2298C = true;
        Dialog dialog = this.f2278a0;
        if (dialog != null) {
            this.f2279b0 = true;
            dialog.setOnDismissListener(null);
            this.f2278a0.dismiss();
            if (!this.f2280c0) {
                onDismiss(this.f2278a0);
            }
            this.f2278a0 = null;
            this.f2282e0 = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2279b0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f2280c0) {
            return;
        }
        this.f2280c0 = true;
        this.f2281d0 = false;
        Dialog dialog = this.f2278a0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2278a0.dismiss();
        }
        this.f2279b0 = true;
        if (this.f2275X >= 0) {
            C0638E m1767j = m1767j();
            int r02 = this.f2275X;
            if (r02 < 0) {
                throw new IllegalArgumentException(AbstractC0002c.m11f(r02, "Bad id: "));
            }
            m1767j.m1695u(new C0637D(m1767j, r02), false);
            this.f2275X = -1;
            return;
        }
        C0651a c0651a = new C0651a(m1767j());
        C0638E c0638e = this.f2329r;
        if (c0638e == null || c0638e == c0651a.f2230p) {
            c0651a.m1731b(new C0645L(3, this));
            c0651a.m1733d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: p */
    public final void mo1756p() {
        this.f2298C = true;
        if (!this.f2281d0 && !this.f2280c0) {
            this.f2280c0 = true;
        }
        C0055g c0055g = this.f2277Z;
        C0714x c0714x = this.f2309N;
        c0714x.getClass();
        C0714x.m1802a("removeObserver");
        AbstractC0713w abstractC0713w = (AbstractC0713w) c0714x.f2430b.mo5132b(c0055g);
        if (abstractC0713w == null) {
            return;
        }
        abstractC0713w.mo1783d();
        abstractC0713w.m1801c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater mo1757q(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.mo1757q(r8)
            boolean r0 = r7.f2274W
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L9a
            boolean r3 = r7.f2276Y
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.f2282e0
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.f2276Y = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.mo1751A()     // Catch: java.lang.Throwable -> L4e
            r7.f2278a0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f2274W     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.f2271T     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r1) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.m1765h()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.f2278a0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.f2278a0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f2273V     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f2278a0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.i r5 = r7.f2269R     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f2278a0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.j r5 = r7.f2270S     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f2282e0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.f2278a0 = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f2276Y = r0
            goto L71
        L6e:
            r7.f2276Y = r0
            throw r8
        L71:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " from dialog context"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L8d:
            android.app.Dialog r0 = r7.f2278a0
            if (r0 == 0) goto L99
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L99:
            return r8
        L9a:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r1 = r7.f2274W
            if (r1 != 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto Ld5
        Lc4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l.mo1757q(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: r */
    public void mo1758r(Bundle bundle) {
        Dialog dialog = this.f2278a0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int r02 = this.f2271T;
        if (r02 != 0) {
            bundle.putInt("android:style", r02);
        }
        int r03 = this.f2272U;
        if (r03 != 0) {
            bundle.putInt("android:theme", r03);
        }
        boolean z2 = this.f2273V;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f2274W;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int r04 = this.f2275X;
        if (r04 != -1) {
            bundle.putInt("android:backStackId", r04);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: s */
    public void mo1759s() {
        this.f2298C = true;
        Dialog dialog = this.f2278a0;
        if (dialog != null) {
            this.f2279b0 = false;
            dialog.show();
            View decorView = this.f2278a0.getWindow().getDecorView();
            AbstractC2492i.m4915e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: t */
    public void mo1760t() {
        this.f2298C = true;
        Dialog dialog = this.f2278a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: u */
    public final void mo1761u(Bundle bundle) {
        Bundle bundle2;
        this.f2298C = true;
        if (this.f2278a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2278a0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0666p
    /* renamed from: v */
    public final void mo1762v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1762v(layoutInflater, viewGroup, bundle);
        if (this.f2300E != null || this.f2278a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2278a0.onRestoreInstanceState(bundle2);
    }
}
