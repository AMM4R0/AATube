package p041O0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import p104l.AbstractC2502A1;

/* renamed from: O0.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0407a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f1070a;

    /* renamed from: b */
    public final /* synthetic */ Object f1071b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0407a(int r12, Object obj) {
        this.f1070a = r12;
        this.f1071b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        switch (this.f1070a) {
            case 0:
                ((BottomAppBar$Behavior) this.f1071b).getClass();
                throw null;
            default:
                SearchView searchView = (SearchView) this.f1071b;
                View view2 = searchView.f1865x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f1859r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean m4922a = AbstractC2502A1.m4922a(searchView);
                    int dimensionPixelSize = searchView.f1840M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f1857p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(m4922a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
