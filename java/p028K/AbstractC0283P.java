package p028K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p031L.C0351e;
import p031L.InterfaceC0366t;
import p046Q.C0443q;
import p104l.C2615v;

/* renamed from: K.P */
/* loaded from: classes.dex */
public abstract class AbstractC0283P {

    /* renamed from: a */
    public static WeakHashMap f842a = null;

    /* renamed from: b */
    public static Field f843b = null;

    /* renamed from: c */
    public static boolean f844c = false;

    /* renamed from: d */
    public static final int[] f845d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C0341y f846e = new C0341y();

    /* renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0267A f847f = new ViewTreeObserverOnGlobalLayoutListenerC0267A();

    /* renamed from: a */
    public static C0291Y m768a(View view) {
        if (f842a == null) {
            f842a = new WeakHashMap();
        }
        C0291Y c0291y = (C0291Y) f842a.get(view);
        if (c0291y != null) {
            return c0291y;
        }
        C0291Y c0291y2 = new C0291Y(view);
        f842a.put(view, c0291y2);
        return c0291y2;
    }

    /* renamed from: b */
    public static boolean m769b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0282O.f838d;
        C0282O c0282o = (C0282O) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0282o == null) {
            c0282o = new C0282O();
            c0282o.f839a = null;
            c0282o.f840b = null;
            c0282o.f841c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0282o);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0282o.f839a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0282O.f838d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0282o.f839a == null) {
                            c0282o.f839a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0282O.f838d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0282o.f839a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0282o.f839a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View m767a = c0282o.m767a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m767a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0282o.f840b == null) {
                    c0282o.f840b = new SparseArray();
                }
                c0282o.f840b.put(keyCode, new WeakReference(m767a));
            }
        }
        return m767a != null;
    }

    /* renamed from: c */
    public static View.AccessibilityDelegate m770c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0277J.m753a(view);
        }
        if (f844c) {
            return null;
        }
        if (f843b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f843b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f844c = true;
                return null;
            }
        }
        try {
            Object obj = f843b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f844c = true;
            return null;
        }
    }

    /* renamed from: d */
    public static CharSequence m771d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0276I.m744b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: e */
    public static ArrayList m772e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: f */
    public static String[] m773f(C2615v c2615v) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0279L.m764a(c2615v) : (String[]) c2615v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: g */
    public static void m774g(View view, int r6) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m771d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(r6);
                if (z2) {
                    obtain.getText().add(m771d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (r6 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, r6);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(r6);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(m771d(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static C0305g m775h(View view, C0305g c0305g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0305g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0279L.m765b(view, c0305g);
        }
        InterfaceC0327r interfaceC0327r = (InterfaceC0327r) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0329s interfaceC0329s = f846e;
        if (interfaceC0327r == null) {
            if (view instanceof InterfaceC0329s) {
                interfaceC0329s = (InterfaceC0329s) view;
            }
            return interfaceC0329s.mo963a(c0305g);
        }
        C0305g m1198a = ((C0443q) interfaceC0327r).m1198a(view, c0305g);
        if (m1198a == null) {
            return null;
        }
        if (view instanceof InterfaceC0329s) {
            interfaceC0329s = (InterfaceC0329s) view;
        }
        return interfaceC0329s.mo963a(m1198a);
    }

    /* renamed from: i */
    public static void m776i(View view, int r3) {
        ArrayList m772e = m772e(view);
        for (int r02 = 0; r02 < m772e.size(); r02++) {
            if (((C0351e) m772e.get(r02)).m997a() == r3) {
                m772e.remove(r02);
                return;
            }
        }
    }

    /* renamed from: j */
    public static void m777j(View view, C0351e c0351e, InterfaceC0366t interfaceC0366t) {
        C0351e c0351e2 = new C0351e(null, c0351e.f993b, null, interfaceC0366t, c0351e.f994c);
        View.AccessibilityDelegate m770c = m770c(view);
        C0295b c0295b = m770c == null ? null : m770c instanceof C0293a ? ((C0293a) m770c).f854a : new C0295b(m770c);
        if (c0295b == null) {
            c0295b = new C0295b();
        }
        m779l(view, c0295b);
        m776i(view, c0351e2.m997a());
        m772e(view).add(c0351e2);
        m774g(view, 0);
    }

    /* renamed from: k */
    public static void m778k(View view, Context context, int[] r11, AttributeSet attributeSet, TypedArray typedArray, int r14) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0277J.m756d(view, context, r11, attributeSet, typedArray, r14, 0);
        }
    }

    /* renamed from: l */
    public static void m779l(View view, C0295b c0295b) {
        if (c0295b == null && (m770c(view) instanceof C0293a)) {
            c0295b = new C0295b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0295b == null ? null : c0295b.f857b);
    }

    /* renamed from: m */
    public static void m780m(View view, CharSequence charSequence) {
        new C0343z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m692d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0267A viewTreeObserverOnGlobalLayoutListenerC0267A = f847f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0267A.f827a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0267A);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0267A);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0267A.f827a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0267A);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0267A);
            }
        }
    }
}
