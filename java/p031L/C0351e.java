package p031L;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;

/* renamed from: L.e */
/* loaded from: classes.dex */
public final class C0351e {

    /* renamed from: e */
    public static final C0351e f984e;

    /* renamed from: f */
    public static final C0351e f985f;

    /* renamed from: g */
    public static final C0351e f986g;

    /* renamed from: h */
    public static final C0351e f987h;

    /* renamed from: i */
    public static final C0351e f988i;

    /* renamed from: j */
    public static final C0351e f989j;

    /* renamed from: k */
    public static final C0351e f990k;

    /* renamed from: l */
    public static final C0351e f991l;

    /* renamed from: a */
    public final Object f992a;

    /* renamed from: b */
    public final int f993b;

    /* renamed from: c */
    public final Class f994c;

    /* renamed from: d */
    public final InterfaceC0366t f995d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        new C0351e(1);
        new C0351e(2);
        new C0351e(4);
        new C0351e(8);
        f984e = new C0351e(16);
        new C0351e(32);
        new C0351e(64);
        new C0351e(128);
        new C0351e(256, AbstractC0359m.class);
        new C0351e(512, AbstractC0359m.class);
        new C0351e(1024, AbstractC0360n.class);
        new C0351e(2048, AbstractC0360n.class);
        f985f = new C0351e(Base64Utils.IO_BUFFER_SIZE);
        f986g = new C0351e(8192);
        new C0351e(16384);
        new C0351e(32768);
        new C0351e(65536);
        new C0351e(131072, AbstractC0364r.class);
        f987h = new C0351e(262144);
        f988i = new C0351e(524288);
        f989j = new C0351e(1048576);
        new C0351e(2097152, AbstractC0365s.class);
        int r02 = Build.VERSION.SDK_INT;
        new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0362p.class);
        f990k = new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f991l = new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0351e(r02 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (r02 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new C0351e(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new C0351e(r02 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (r02 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new C0351e(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new C0351e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        if (r02 >= 24) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new C0351e(accessibilityAction3, R.id.accessibilityActionSetProgress, null, null, AbstractC0363q.class);
        new C0351e(r02 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC0361o.class);
        if (r02 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new C0351e(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (r02 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new C0351e(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0351e(r02 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (r02 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new C0351e(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new C0351e(r02 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (r02 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new C0351e(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (r02 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new C0351e(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (r02 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new C0351e(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0351e(r02 >= 34 ? AbstractC0354h.m1011a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0351e(int r7) {
        this(null, r7, null, null, null);
    }

    /* renamed from: a */
    public final int m997a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f992a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0351e)) {
            return false;
        }
        Object obj2 = ((C0351e) obj).f992a;
        Object obj3 = this.f992a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f992a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String m1024d = C0356j.m1024d(this.f993b);
        if (m1024d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f992a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                m1024d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(m1024d);
        return sb.toString();
    }

    public C0351e(int r7, Class cls) {
        this(null, r7, null, null, cls);
    }

    public C0351e(Object obj, int r2, String str, InterfaceC0366t interfaceC0366t, Class cls) {
        this.f993b = r2;
        this.f995d = interfaceC0366t;
        if (obj == null) {
            this.f992a = new AccessibilityNodeInfo.AccessibilityAction(r2, str);
        } else {
            this.f992a = obj;
        }
        this.f994c = cls;
    }
}
