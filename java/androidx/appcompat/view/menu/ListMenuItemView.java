package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p028K.AbstractC0283P;
import p076d.AbstractC0780a;
import p102k.C2468o;
import p102k.InterfaceC2448A;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC2448A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public C2468o f1730a;

    /* renamed from: b */
    public ImageView f1731b;

    /* renamed from: c */
    public RadioButton f1732c;

    /* renamed from: d */
    public TextView f1733d;

    /* renamed from: e */
    public CheckBox f1734e;

    /* renamed from: f */
    public TextView f1735f;

    /* renamed from: g */
    public ImageView f1736g;

    /* renamed from: h */
    public ImageView f1737h;

    /* renamed from: i */
    public LinearLayout f1738i;

    /* renamed from: j */
    public final Drawable f1739j;

    /* renamed from: k */
    public final int f1740k;

    /* renamed from: l */
    public final Context f1741l;

    /* renamed from: m */
    public boolean f1742m;

    /* renamed from: n */
    public final Drawable f1743n;

    /* renamed from: o */
    public final boolean f1744o;

    /* renamed from: p */
    public LayoutInflater f1745p;

    /* renamed from: q */
    public boolean f1746q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0015h m100A = C0015h.m100A(getContext(), attributeSet, AbstractC0780a.f3131r, R.attr.listMenuViewStyle);
        this.f1739j = m100A.m121p(5);
        TypedArray typedArray = (TypedArray) m100A.f26c;
        this.f1740k = typedArray.getResourceId(1, -1);
        this.f1742m = typedArray.getBoolean(7, false);
        this.f1741l = context;
        this.f1743n = m100A.m121p(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1744o = obtainStyledAttributes.hasValue(0);
        m100A.m102C();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1745p == null) {
            this.f1745p = LayoutInflater.from(getContext());
        }
        return this.f1745p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1736g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1737h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1737h.getLayoutParams();
        rect.top = this.f1737h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // p102k.InterfaceC2448A
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1488c(p102k.C2468o r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo1488c(k.o):void");
    }

    @Override // p102k.InterfaceC2448A
    public C2468o getItemData() {
        return this.f1730a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setBackground(this.f1739j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1733d = textView;
        int r2 = this.f1740k;
        if (r2 != -1) {
            textView.setTextAppearance(this.f1741l, r2);
        }
        this.f1735f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1736g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1743n);
        }
        this.f1737h = (ImageView) findViewById(R.id.group_divider);
        this.f1738i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
        if (this.f1731b != null && this.f1742m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1731b.getLayoutParams();
            int r02 = layoutParams.height;
            if (r02 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = r02;
            }
        }
        super.onMeasure(r4, r5);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1732c == null && this.f1734e == null) {
            return;
        }
        if ((this.f1730a.f8118x & 4) != 0) {
            if (this.f1732c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1732c = radioButton;
                LinearLayout linearLayout = this.f1738i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1732c;
            view = this.f1734e;
        } else {
            if (this.f1734e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1734e = checkBox;
                LinearLayout linearLayout2 = this.f1738i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1734e;
            view = this.f1732c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1730a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1734e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1732c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1730a.f8118x & 4) != 0) {
            if (this.f1732c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1732c = radioButton;
                LinearLayout linearLayout = this.f1738i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1732c;
        } else {
            if (this.f1734e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1734e = checkBox;
                LinearLayout linearLayout2 = this.f1738i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1734e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1746q = z2;
        this.f1742m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1737h;
        if (imageView != null) {
            imageView.setVisibility((this.f1744o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1730a.f8108n.getClass();
        boolean z2 = this.f1746q;
        if (z2 || this.f1742m) {
            ImageView imageView = this.f1731b;
            if (imageView == null && drawable == null && !this.f1742m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1731b = imageView2;
                LinearLayout linearLayout = this.f1738i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1742m) {
                this.f1731b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1731b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1731b.getVisibility() != 0) {
                this.f1731b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1733d.getVisibility() != 8) {
                this.f1733d.setVisibility(8);
            }
        } else {
            this.f1733d.setText(charSequence);
            if (this.f1733d.getVisibility() != 0) {
                this.f1733d.setVisibility(0);
            }
        }
    }
}
