package p055T;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p028K.C0295b;
import p031L.C0356j;
import p056T0.C0520d;
import p081e1.C0879e;
import p124s0.C2738i;

/* renamed from: T.b */
/* loaded from: classes.dex */
public abstract class AbstractC0513b extends C0295b {

    /* renamed from: n */
    public static final Rect f1328n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C2738i f1329o = new C2738i();

    /* renamed from: p */
    public static final C0879e f1330p = new C0879e();

    /* renamed from: h */
    public final AccessibilityManager f1335h;

    /* renamed from: i */
    public final Chip f1336i;

    /* renamed from: j */
    public C0512a f1337j;

    /* renamed from: d */
    public final Rect f1331d = new Rect();

    /* renamed from: e */
    public final Rect f1332e = new Rect();

    /* renamed from: f */
    public final Rect f1333f = new Rect();

    /* renamed from: g */
    public final int[] f1334g = new int[2];

    /* renamed from: k */
    public int f1338k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f1339l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f1340m = Integer.MIN_VALUE;

    public AbstractC0513b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1336i = chip;
        this.f1335h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p028K.C0295b
    /* renamed from: b */
    public final C0055g mo805b(View view) {
        if (this.f1337j == null) {
            this.f1337j = new C0512a(this);
        }
        return this.f1337j;
    }

    @Override // p028K.C0295b
    /* renamed from: d */
    public final void mo807d(View view, C0356j c0356j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f856a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0356j.f998a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C0520d) this).f1372q;
        accessibilityNodeInfo.setCheckable(chip.m2097d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        c0356j.m1034k(chip.getText());
    }

    /* renamed from: j */
    public final boolean m1324j(int r4) {
        if (this.f1339l != r4) {
            return false;
        }
        this.f1339l = Integer.MIN_VALUE;
        C0520d c0520d = (C0520d) this;
        if (r4 == 1) {
            Chip chip = c0520d.f1372q;
            chip.f2846m = false;
            chip.refreshDrawableState();
        }
        m1331q(r4, 8);
        return true;
    }

    /* renamed from: k */
    public final C0356j m1325k(int r10) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C0356j c0356j = new C0356j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f1328n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f1336i;
        obtain.setParent(chip);
        mo1329o(r10, c0356j);
        if (c0356j.m1030g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1332e;
        c0356j.m1029f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        c0356j.f999b = r10;
        obtain.setSource(chip, r10);
        if (this.f1338k == r10) {
            obtain.setAccessibilityFocused(true);
            c0356j.m1025a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            c0356j.m1025a(64);
        }
        boolean z2 = this.f1339l == r10;
        if (z2) {
            c0356j.m1025a(2);
        } else if (obtain.isFocusable()) {
            c0356j.m1025a(1);
        }
        obtain.setFocused(z2);
        int[] r102 = this.f1334g;
        chip.getLocationOnScreen(r102);
        Rect rect3 = this.f1331d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0356j.m1029f(rect3);
            rect3.offset(r102[0] - chip.getScrollX(), r102[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1333f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(r102[0] - chip.getScrollX(), r102[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0356j;
    }

    /* renamed from: l */
    public abstract void mo1326l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1327m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p055T.AbstractC0513b.m1327m(int, android.graphics.Rect):boolean");
    }

    /* renamed from: n */
    public final C0356j m1328n(int r7) {
        if (r7 != -1) {
            return m1325k(r7);
        }
        Chip chip = this.f1336i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        C0356j c0356j = new C0356j(obtain);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo1326l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            c0356j.f998a.addChild(chip, ((Integer) arrayList.get(r3)).intValue());
        }
        return c0356j;
    }

    /* renamed from: o */
    public abstract void mo1329o(int r12, C0356j c0356j);

    /* renamed from: p */
    public final boolean m1330p(int r4) {
        int r02;
        Chip chip = this.f1336i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (r02 = this.f1339l) == r4) {
            return false;
        }
        if (r02 != Integer.MIN_VALUE) {
            m1324j(r02);
        }
        if (r4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1339l = r4;
        C0520d c0520d = (C0520d) this;
        if (r4 == 1) {
            Chip chip2 = c0520d.f1372q;
            chip2.f2846m = true;
            chip2.refreshDrawableState();
        }
        m1331q(r4, 8);
        return true;
    }

    /* renamed from: q */
    public final void m1331q(int r6, int r7) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (r6 == Integer.MIN_VALUE || !this.f1335h.isEnabled() || (parent = (view = this.f1336i).getParent()) == null) {
            return;
        }
        if (r6 != -1) {
            obtain = AccessibilityEvent.obtain(r7);
            C0356j m1328n = m1328n(r6);
            obtain.getText().add(m1328n.m1030g());
            AccessibilityNodeInfo accessibilityNodeInfo = m1328n.f998a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, r6);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(r7);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
