package p053S0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.carwizard.p075li.youtube.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p009D.AbstractC0095a;
import p028K.C0290X;
import p036M1.AbstractC0379e;
import p046Q.AbstractC0428b;
import p046Q.AbstractC0429c;
import p065Y0.AbstractC0556k;
import p100j0.C2431b;
import p100j0.C2432c;
import p100j0.C2434e;
import p104l.C2603r;

/* renamed from: S0.c */
/* loaded from: classes.dex */
public final class C0501c extends C2603r {

    /* renamed from: e */
    public final LinkedHashSet f1271e;

    /* renamed from: f */
    public final LinkedHashSet f1272f;

    /* renamed from: g */
    public ColorStateList f1273g;

    /* renamed from: h */
    public boolean f1274h;

    /* renamed from: i */
    public boolean f1275i;

    /* renamed from: j */
    public boolean f1276j;

    /* renamed from: k */
    public CharSequence f1277k;

    /* renamed from: l */
    public Drawable f1278l;

    /* renamed from: m */
    public Drawable f1279m;

    /* renamed from: n */
    public boolean f1280n;

    /* renamed from: o */
    public ColorStateList f1281o;

    /* renamed from: p */
    public ColorStateList f1282p;

    /* renamed from: q */
    public PorterDuff.Mode f1283q;

    /* renamed from: r */
    public int f1284r;

    /* renamed from: s */
    public int[] f1285s;

    /* renamed from: t */
    public boolean f1286t;

    /* renamed from: u */
    public CharSequence f1287u;

    /* renamed from: v */
    public CompoundButton.OnCheckedChangeListener f1288v;

    /* renamed from: w */
    public final C2434e f1289w;

    /* renamed from: x */
    public final C0499a f1290x;

    /* renamed from: y */
    public static final int[] f1269y = {R.attr.state_indeterminate};

    /* renamed from: z */
    public static final int[] f1270z = {R.attr.state_error};

    /* renamed from: A */
    public static final int[][] f1267A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B */
    public static final int f1268B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", ConstantDeviceInfo.APP_PLATFORM);

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0501c(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p053S0.C0501c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int r02 = this.f1284r;
        return r02 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : r02 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1273g == null) {
            int m1080p = AbstractC0379e.m1080p(this, R.attr.colorControlActivated);
            int m1080p2 = AbstractC0379e.m1080p(this, R.attr.colorError);
            int m1080p3 = AbstractC0379e.m1080p(this, R.attr.colorSurface);
            int m1080p4 = AbstractC0379e.m1080p(this, R.attr.colorOnSurface);
            this.f1273g = new ColorStateList(f1267A, new int[]{AbstractC0379e.m1085w(m1080p3, m1080p2, 1.0f), AbstractC0379e.m1085w(m1080p3, m1080p, 1.0f), AbstractC0379e.m1085w(m1080p3, m1080p4, 0.54f), AbstractC0379e.m1085w(m1080p3, m1080p4, 0.38f), AbstractC0379e.m1085w(m1080p3, m1080p4, 0.38f)});
        }
        return this.f1273g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f1281o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: a */
    public final void m1310a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0290X c0290x;
        Drawable drawable = this.f1278l;
        ColorStateList colorStateList3 = this.f1281o;
        PorterDuff.Mode m1163b = AbstractC0428b.m1163b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (m1163b != null) {
                AbstractC0095a.m320i(drawable, m1163b);
            }
        }
        this.f1278l = drawable;
        Drawable drawable2 = this.f1279m;
        ColorStateList colorStateList4 = this.f1282p;
        PorterDuff.Mode mode = this.f1283q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                AbstractC0095a.m320i(drawable2, mode);
            }
        }
        this.f1279m = drawable2;
        if (this.f1280n) {
            C2434e c2434e = this.f1289w;
            if (c2434e != null) {
                Drawable drawable3 = c2434e.f7910a;
                C0499a c0499a = this.f1290x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0499a.f1264a == null) {
                        c0499a.f1264a = new C2431b(c0499a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0499a.f1264a);
                }
                ArrayList arrayList = c2434e.f7906e;
                C2432c c2432c = c2434e.f7903b;
                if (arrayList != null && c0499a != null) {
                    arrayList.remove(c0499a);
                    if (c2434e.f7906e.size() == 0 && (c0290x = c2434e.f7905d) != null) {
                        c2432c.f7898b.removeListener(c0290x);
                        c2434e.f7905d = null;
                    }
                }
                Drawable drawable4 = c2434e.f7910a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0499a.f1264a == null) {
                        c0499a.f1264a = new C2431b(c0499a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0499a.f1264a);
                } else if (c0499a != null) {
                    if (c2434e.f7906e == null) {
                        c2434e.f7906e = new ArrayList();
                    }
                    if (!c2434e.f7906e.contains(c0499a)) {
                        c2434e.f7906e.add(c0499a);
                        if (c2434e.f7905d == null) {
                            c2434e.f7905d = new C0290X(4, c2434e);
                        }
                        c2432c.f7898b.addListener(c2434e.f7905d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.f1278l;
                if ((drawable5 instanceof AnimatedStateListDrawable) && c2434e != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c2434e, false);
                    ((AnimatedStateListDrawable) this.f1278l).addTransition(R.id.indeterminate, R.id.unchecked, c2434e, false);
                }
            }
        }
        Drawable drawable6 = this.f1278l;
        if (drawable6 != null && (colorStateList2 = this.f1281o) != null) {
            AbstractC0095a.m319h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f1279m;
        if (drawable7 != null && (colorStateList = this.f1282p) != null) {
            AbstractC0095a.m319h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f1278l;
        Drawable drawable9 = this.f1279m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f1278l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f1279m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f1282p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f1283q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f1281o;
    }

    public int getCheckedState() {
        return this.f1284r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f1277k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f1284r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1274h && this.f1281o == null && this.f1282p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r4) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(r4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f1269y);
        }
        if (this.f1276j) {
            View.mergeDrawableStates(onCreateDrawableState, f1270z);
        }
        int r02 = 0;
        while (true) {
            if (r02 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int r12 = onCreateDrawableState[r02];
            if (r12 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (r12 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[r02] = 16842912;
                break;
            }
            r02++;
        }
        this.f1285s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable m1166a;
        if (!this.f1275i || !TextUtils.isEmpty(getText()) || (m1166a = AbstractC0429c.m1166a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - m1166a.getIntrinsicWidth()) / 2) * (AbstractC0556k.m1411e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = m1166a.getBounds();
            AbstractC0095a.m317f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f1276j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f1277k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0500b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0500b c0500b = (C0500b) parcelable;
        super.onRestoreInstanceState(c0500b.getSuperState());
        setCheckedState(c0500b.f1266a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0500b c0500b = new C0500b(super.onSaveInstanceState());
        c0500b.f1266a = getCheckedState();
        return c0500b;
    }

    @Override // p104l.C2603r, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f1279m = drawable;
        m1310a();
    }

    public void setButtonIconDrawableResource(int r2) {
        setButtonIconDrawable(AbstractC0580g.m1449n(getContext(), r2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f1282p == colorStateList) {
            return;
        }
        this.f1282p = colorStateList;
        m1310a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f1283q == mode) {
            return;
        }
        this.f1283q = mode;
        m1310a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f1281o == colorStateList) {
            return;
        }
        this.f1281o = colorStateList;
        m1310a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m1310a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f1275i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int r4) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f1284r != r4) {
            this.f1284r = r4;
            super.setChecked(r4 == 1);
            refreshDrawableState();
            int r42 = Build.VERSION.SDK_INT;
            if (r42 >= 30 && this.f1287u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f1286t) {
                return;
            }
            this.f1286t = true;
            LinkedHashSet linkedHashSet = this.f1272f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC0002c.m10e(it);
                }
            }
            if (this.f1284r != 2 && (onCheckedChangeListener = this.f1288v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (r42 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f1286t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f1277k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int r2) {
        setErrorAccessibilityLabel(r2 != 0 ? getResources().getText(r2) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f1276j == z2) {
            return;
        }
        this.f1276j = z2;
        refreshDrawableState();
        Iterator it = this.f1271e.iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1288v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f1287u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f1274h = z2;
        if (z2) {
            AbstractC0428b.m1164c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0428b.m1164c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p104l.C2603r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f1278l = drawable;
        this.f1280n = false;
        m1310a();
    }
}
