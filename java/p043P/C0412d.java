package p043P;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p028K.C0301e;
import p028K.InterfaceC0299d;
import p104l.C2615v;

/* renamed from: P.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0412d {

    /* renamed from: a */
    public final /* synthetic */ Object f1074a;

    public /* synthetic */ C0412d(Object obj) {
        this.f1074a = obj;
    }

    /* renamed from: a */
    public boolean m1154a(C0055g c0055g, int r8, Bundle bundle) {
        InterfaceC0299d interfaceC0299d;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 25 && (r8 & 1) != 0) {
            try {
                ((InterfaceC0416h) c0055g.f107b).mo106a();
                Parcelable parcelable = (Parcelable) ((InterfaceC0416h) c0055g.f107b).mo108c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipDescription description = ((InterfaceC0416h) c0055g.f107b).getDescription();
        InterfaceC0416h interfaceC0416h = (InterfaceC0416h) c0055g.f107b;
        ClipData clipData = new ClipData(description, new ClipData.Item(interfaceC0416h.mo109d()));
        if (r02 >= 31) {
            interfaceC0299d = new C0055g(clipData, 2);
        } else {
            C0301e c0301e = new C0301e();
            c0301e.f869b = clipData;
            c0301e.f870c = 2;
            interfaceC0299d = c0301e;
        }
        interfaceC0299d.mo213k(interfaceC0416h.mo107b());
        interfaceC0299d.mo212j(bundle);
        return AbstractC0283P.m775h((C2615v) this.f1074a, interfaceC0299d.mo206d()) == null;
    }
}
