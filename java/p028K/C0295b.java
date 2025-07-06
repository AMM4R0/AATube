package p028K;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p006C.C0055g;
import p031L.C0351e;
import p031L.C0356j;
import p031L.InterfaceC0366t;

/* renamed from: K.b */
/* loaded from: classes.dex */
public class C0295b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f855c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f856a;

    /* renamed from: b */
    public final C0293a f857b;

    public C0295b() {
        this(f855c);
    }

    /* renamed from: a */
    public boolean mo804a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f856a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0055g mo805b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f856a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0055g(9, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo806c(View view, AccessibilityEvent accessibilityEvent) {
        this.f856a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo807d(View view, C0356j c0356j) {
        this.f856a.onInitializeAccessibilityNodeInfo(view, c0356j.f998a);
    }

    /* renamed from: e */
    public void mo808e(View view, AccessibilityEvent accessibilityEvent) {
        this.f856a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo809f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f856a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo810g(View view, int r8, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int r2 = 0;
        while (true) {
            if (r2 >= list.size()) {
                break;
            }
            C0351e c0351e = (C0351e) list.get(r2);
            if (c0351e.m997a() == r8) {
                InterfaceC0366t interfaceC0366t = c0351e.f995d;
                if (interfaceC0366t != null) {
                    Class cls = c0351e.f994c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z2 = interfaceC0366t.mo204b(view);
                }
            } else {
                r2++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f856a.performAccessibilityAction(view, r8, bundle);
        }
        if (z2 || r8 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z2;
        }
        int r82 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(r82)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int r9 = 0;
            while (true) {
                if (clickableSpanArr == null || r9 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[r9])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                r9++;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public void mo811h(View view, int r3) {
        this.f856a.sendAccessibilityEvent(view, r3);
    }

    /* renamed from: i */
    public void mo812i(View view, AccessibilityEvent accessibilityEvent) {
        this.f856a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0295b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f856a = accessibilityDelegate;
        this.f857b = new C0293a(this);
    }
}
