package p018G1;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import p019H.C0179i;
import p031L.InterfaceC0366t;
import p079e.C0792a;
import p079e.C0793b;
import p079e.C0795d;
import p079e.C0796e;
import p079e.DialogC0797f;
import p102k.DialogInterfaceOnKeyListenerC2467n;
import p124s0.C2731b;
import p133v0.AbstractC2863r;

/* renamed from: G1.t */
/* loaded from: classes.dex */
public final class C0169t implements InterfaceC0366t {

    /* renamed from: a */
    public int f532a;

    /* renamed from: b */
    public final Object f533b;

    public C0169t(C2731b c2731b, int r2) {
        AbstractC2863r.m5474c(c2731b);
        this.f533b = c2731b;
        this.f532a = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* renamed from: a */
    public DialogC0797f m533a() {
        C0793b c0793b = (C0793b) this.f533b;
        DialogC0797f dialogC0797f = new DialogC0797f(c0793b.f3203a, this.f532a);
        View view = c0793b.f3207e;
        C0796e c0796e = dialogC0797f.f3242f;
        if (view != null) {
            c0796e.f3227n = view;
        } else {
            CharSequence charSequence = c0793b.f3206d;
            if (charSequence != null) {
                c0796e.f3217d = charSequence;
                TextView textView = c0796e.f3225l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0793b.f3205c;
            if (drawable != null) {
                c0796e.f3223j = drawable;
                ImageView imageView = c0796e.f3224k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0796e.f3224k.setImageDrawable(drawable);
                }
            }
        }
        if (c0793b.f3209g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0793b.f3204b.inflate(c0796e.f3231r, (ViewGroup) null);
            int r6 = c0793b.f3211i ? c0796e.f3232s : c0796e.f3233t;
            Object obj = c0793b.f3209g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0795d(c0793b.f3203a, r6, R.id.text1, null);
            }
            c0796e.f3228o = r7;
            c0796e.f3229p = c0793b.f3212j;
            if (c0793b.f3210h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0792a(c0793b, c0796e));
            }
            if (c0793b.f3211i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0796e.f3218e = alertController$RecycleListView;
        }
        dialogC0797f.setCancelable(true);
        dialogC0797f.setCanceledOnTouchOutside(true);
        dialogC0797f.setOnCancelListener(null);
        dialogC0797f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC2467n dialogInterfaceOnKeyListenerC2467n = c0793b.f3208f;
        if (dialogInterfaceOnKeyListenerC2467n != null) {
            dialogC0797f.setOnKeyListener(dialogInterfaceOnKeyListenerC2467n);
        }
        return dialogC0797f;
    }

    @Override // p031L.InterfaceC0366t
    /* renamed from: b */
    public boolean mo204b(View view) {
        ((BottomSheetBehavior) this.f533b).m2060B(this.f532a);
        return true;
    }

    public C0169t(ArrayList arrayList) {
        this.f533b = arrayList;
    }

    public C0169t(Context context) {
        int m2194i = DialogC0797f.m2194i(context, 0);
        this.f533b = new C0793b(new ContextThemeWrapper(context, DialogC0797f.m2194i(context, m2194i)));
        this.f532a = m2194i;
    }

    public C0169t(int r12, C0179i[] c0179iArr) {
        this.f532a = r12;
        this.f533b = c0179iArr;
    }

    public C0169t(BottomSheetBehavior bottomSheetBehavior, int r2) {
        this.f533b = bottomSheetBehavior;
        this.f532a = r2;
    }
}
