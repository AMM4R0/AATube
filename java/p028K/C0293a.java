package p028K;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p006C.C0055g;
import p031L.AbstractC0352f;
import p031L.C0351e;
import p031L.C0356j;

/* renamed from: K.a */
/* loaded from: classes.dex */
public final class C0293a extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final C0295b f854a;

    public C0293a(C0295b c0295b) {
        this.f854a = c0295b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f854a.mo804a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0055g mo805b = this.f854a.mo805b(view);
        if (mo805b != null) {
            return (AccessibilityNodeProvider) mo805b.f107b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f854a.mo806c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int r13;
        int r2 = 1;
        C0356j c0356j = new C0356j(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(AbstractC0276I.m746d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int r8 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        int r9 = Build.VERSION.SDK_INT;
        if (r9 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            c0356j.m1031h(1, z2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(AbstractC0276I.m745c(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z3 = bool2 != null && bool2.booleanValue();
        if (r9 >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            c0356j.m1031h(2, z3);
        }
        CharSequence m771d = AbstractC0283P.m771d(view);
        if (r9 >= 28) {
            accessibilityNodeInfo.setPaneTitle(m771d);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m771d);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            tag3 = AbstractC0278K.m760b(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (r9 >= 30) {
            AbstractC0352f.m1000c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f854a.mo807d(view, c0356j);
        CharSequence text = accessibilityNodeInfo.getText();
        if (r9 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int r15 = 0; r15 < sparseArray.size(); r15++) {
                    if (((WeakReference) sparseArray.valueAt(r15)).get() == null) {
                        arrayList.add(Integer.valueOf(r15));
                    }
                }
                for (int r7 = 0; r7 < arrayList.size(); r7++) {
                    sparseArray.remove(((Integer) arrayList.get(r7)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int r6 = 0;
                while (r6 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[r6];
                    int r14 = r8;
                    while (true) {
                        if (r14 >= sparseArray2.size()) {
                            r13 = C0356j.f997c;
                            C0356j.f997c = r13 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(r14)).get())) {
                                r13 = sparseArray2.keyAt(r14);
                                break;
                            }
                            r14 += r2;
                        }
                    }
                    sparseArray2.put(r13, new WeakReference(clickableSpanArr[r6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[r6];
                    Spanned spanned = (Spanned) text;
                    c0356j.m1027c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c0356j.m1027c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c0356j.m1027c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c0356j.m1027c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(r13));
                    r2 = 1;
                    r6++;
                    r8 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int r82 = 0; r82 < list.size(); r82++) {
            c0356j.m1026b((C0351e) list.get(r82));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f854a.mo808e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f854a.mo809f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int r3, Bundle bundle) {
        return this.f854a.mo810g(view, r3, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int r3) {
        this.f854a.mo811h(view, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f854a.mo812i(view, accessibilityEvent);
    }
}
