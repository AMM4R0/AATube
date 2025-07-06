package p104l;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p028K.C0301e;
import p028K.InterfaceC0299d;

/* renamed from: l.E */
/* loaded from: classes.dex */
public abstract class AbstractC2509E {
    /* renamed from: a */
    public static boolean m4933a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0299d interfaceC0299d;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0299d = new C0055g(clipData, 3);
            } else {
                C0301e c0301e = new C0301e();
                c0301e.f869b = clipData;
                c0301e.f870c = 3;
                interfaceC0299d = c0301e;
            }
            AbstractC0283P.m775h(textView, interfaceC0299d.mo206d());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m4934b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0299d interfaceC0299d;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0299d = new C0055g(clipData, 3);
        } else {
            C0301e c0301e = new C0301e();
            c0301e.f869b = clipData;
            c0301e.f870c = 3;
            interfaceC0299d = c0301e;
        }
        AbstractC0283P.m775h(view, interfaceC0299d.mo206d());
        return true;
    }
}
