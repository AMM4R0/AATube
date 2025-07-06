package p079e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: e.a */
/* loaded from: classes.dex */
public final class C0792a implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0796e f3201a;

    /* renamed from: b */
    public final /* synthetic */ C0793b f3202b;

    public C0792a(C0793b c0793b, C0796e c0796e) {
        this.f3202b = c0793b;
        this.f3201a = c0796e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j2) {
        C0793b c0793b = this.f3202b;
        DialogInterface.OnClickListener onClickListener = c0793b.f3210h;
        C0796e c0796e = this.f3201a;
        onClickListener.onClick(c0796e.f3215b, r3);
        if (c0793b.f3211i) {
            return;
        }
        c0796e.f3215b.dismiss();
    }
}
