package p104l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p018G1.C0169t;
import p079e.C0793b;
import p079e.DialogC0797f;

/* renamed from: l.L */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2523L implements InterfaceC2533Q, DialogInterface.OnClickListener {

    /* renamed from: a */
    public DialogC0797f f8255a;

    /* renamed from: b */
    public C2525M f8256b;

    /* renamed from: c */
    public CharSequence f8257c;

    /* renamed from: d */
    public final /* synthetic */ C2536S f8258d;

    public DialogInterfaceOnClickListenerC2523L(C2536S c2536s) {
        this.f8258d = c2536s;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: a */
    public final void mo4955a(int r2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: b */
    public final boolean mo4956b() {
        DialogC0797f dialogC0797f = this.f8255a;
        if (dialogC0797f != null) {
            return dialogC0797f.isShowing();
        }
        return false;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: d */
    public final int mo4957d() {
        return 0;
    }

    @Override // p104l.InterfaceC2533Q
    public final void dismiss() {
        DialogC0797f dialogC0797f = this.f8255a;
        if (dialogC0797f != null) {
            dialogC0797f.dismiss();
            this.f8255a = null;
        }
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: e */
    public final void mo4958e(int r5, int r6) {
        if (this.f8256b == null) {
            return;
        }
        C2536S c2536s = this.f8258d;
        C0169t c0169t = new C0169t(c2536s.getPopupContext());
        CharSequence charSequence = this.f8257c;
        C0793b c0793b = (C0793b) c0169t.f533b;
        if (charSequence != null) {
            c0793b.f3206d = charSequence;
        }
        C2525M c2525m = this.f8256b;
        int selectedItemPosition = c2536s.getSelectedItemPosition();
        c0793b.f3209g = c2525m;
        c0793b.f3210h = this;
        c0793b.f3212j = selectedItemPosition;
        c0793b.f3211i = true;
        DialogC0797f m533a = c0169t.m533a();
        this.f8255a = m533a;
        AlertController$RecycleListView alertController$RecycleListView = m533a.f3242f.f3218e;
        AbstractC2519J.m4944d(alertController$RecycleListView, r5);
        AbstractC2519J.m4943c(alertController$RecycleListView, r6);
        this.f8255a.show();
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: g */
    public final int mo4959g() {
        return 0;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: h */
    public final Drawable mo4960h() {
        return null;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: i */
    public final CharSequence mo4961i() {
        return this.f8257c;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: k */
    public final void mo4962k(CharSequence charSequence) {
        this.f8257c = charSequence;
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: l */
    public final void mo4963l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: m */
    public final void mo4964m(int r2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: n */
    public final void mo4951n(ListAdapter listAdapter) {
        this.f8256b = (C2525M) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r5) {
        C2536S c2536s = this.f8258d;
        c2536s.setSelection(r5);
        if (c2536s.getOnItemClickListener() != null) {
            c2536s.performItemClick(null, r5, this.f8256b.getItemId(r5));
        }
        dismiss();
    }

    @Override // p104l.InterfaceC2533Q
    /* renamed from: p */
    public final void mo4965p(int r2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
