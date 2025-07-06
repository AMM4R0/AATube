package p104l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import p001A0.AbstractC0005b;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p028K.C0301e;
import p028K.C0305g;
import p028K.InterfaceC0299d;
import p028K.InterfaceC0329s;
import p046Q.C0443q;
import p046Q.InterfaceC0445s;

/* renamed from: l.v */
/* loaded from: classes.dex */
public class C2615v extends EditText implements InterfaceC0329s, InterfaceC0445s {

    /* renamed from: a */
    public final C2597p f8493a;

    /* renamed from: b */
    public final C2553a0 f8494b;

    /* renamed from: c */
    public final C2503B f8495c;

    /* renamed from: d */
    public final C0443q f8496d;

    /* renamed from: e */
    public final C2503B f8497e;

    /* renamed from: f */
    public C2612u f8498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2615v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC2581j1.m5035a(context);
        AbstractC2578i1.m5030a(this, getContext());
        C2597p c2597p = new C2597p(this);
        this.f8493a = c2597p;
        c2597p.m5058d(attributeSet, R.attr.editTextStyle);
        C2553a0 c2553a0 = new C2553a0(this);
        this.f8494b = c2553a0;
        c2553a0.m5006f(attributeSet, R.attr.editTextStyle);
        c2553a0.m5003b();
        C2503B c2503b = new C2503B();
        c2503b.f8189b = this;
        this.f8495c = c2503b;
        this.f8496d = new C0443q();
        C2503B c2503b2 = new C2503B(this);
        this.f8497e = c2503b2;
        c2503b2.mo4924b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener m4923a = c2503b2.m4923a(keyListener);
        if (m4923a == keyListener) {
            return;
        }
        super.setKeyListener(m4923a);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C2612u getSuperCaller() {
        if (this.f8498f == null) {
            this.f8498f = new C2612u(this);
        }
        return this.f8498f;
    }

    @Override // p028K.InterfaceC0329s
    /* renamed from: a */
    public final C0305g mo963a(C0305g c0305g) {
        return this.f8496d.m1198a(this, c0305g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C2553a0 c2553a0 = this.f8494b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0005b.m53S(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8494b.m5004d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8494b.m5005e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2503B c2503b;
        if (Build.VERSION.SDK_INT >= 28 || (c2503b = this.f8495c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2503b.f8190c;
        return textClassifier == null ? AbstractC2538T.m4987a((TextView) c2503b.f8189b) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            l.a0 r1 = r7.f8494b
            r1.getClass()
            p104l.C2553a0.m5001h(r8, r0, r7)
            p036M1.AbstractC0387m.m1104G(r8, r0, r7)
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L76
            java.lang.String[] r2 = p028K.AbstractC0283P.m773f(r7)
            if (r2 == 0) goto L76
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            p043P.AbstractC0409a.m1150a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            P.d r2 = new P.d
            r2.<init>(r7)
            if (r1 < r5) goto L4c
            P.e r1 = new P.e
            r1.<init>(r0, r2)
        L4a:
            r0 = r1
            goto L76
        L4c:
            java.lang.String[] r6 = p043P.AbstractC0411c.f1073a
            if (r1 < r5) goto L58
            java.lang.String[] r1 = p043P.AbstractC0409a.m1151b(r8)
            if (r1 == 0) goto L6c
        L56:
            r6 = r1
            goto L6c
        L58:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5d
            goto L6c
        L5d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L69
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L69:
            if (r1 == 0) goto L6c
            goto L56
        L6c:
            int r1 = r6.length
            if (r1 != 0) goto L70
            goto L76
        L70:
            P.f r1 = new P.f
            r1.<init>(r0, r2)
            goto L4a
        L76:
            l.B r1 = r7.f8497e
            V.b r8 = r1.m4925c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.C2615v.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int r02 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (r02 < 31 && r02 >= 24 && dragEvent.getLocalState() == null && AbstractC0283P.m773f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = AbstractC2509E.m4933a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
        InterfaceC0299d interfaceC0299d;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 31 || AbstractC0283P.m773f(this) == null || !(r7 == 16908322 || r7 == 16908337)) {
            return super.onTextContextMenuItem(r7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (r02 >= 31) {
                interfaceC0299d = new C0055g(primaryClip, 1);
            } else {
                C0301e c0301e = new C0301e();
                c0301e.f869b = primaryClip;
                c0301e.f870c = 1;
                interfaceC0299d = c0301e;
            }
            interfaceC0299d.mo217p(r7 == 16908322 ? 0 : 1);
            AbstractC0283P.m775h(this, interfaceC0299d.mo206d());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8494b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2553a0 c2553a0 = this.f8494b;
        if (c2553a0 != null) {
            c2553a0.m5003b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0005b.m54T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f8497e.m4926d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8497e.m4923a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8493a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2553a0 c2553a0 = this.f8494b;
        c2553a0.m5011l(colorStateList);
        c2553a0.m5003b();
    }

    @Override // p046Q.InterfaceC0445s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2553a0 c2553a0 = this.f8494b;
        c2553a0.m5012m(mode);
        c2553a0.m5003b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C2553a0 c2553a0 = this.f8494b;
        if (c2553a0 != null) {
            c2553a0.m5007g(context, r3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2503B c2503b;
        if (Build.VERSION.SDK_INT >= 28 || (c2503b = this.f8495c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2503b.f8190c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
