package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.carwizard.p075li.youtube.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: j */
    public final ArrayAdapter f2446j;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f2446j = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f2447h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: b */
    public final void mo1809b() {
        ArrayAdapter arrayAdapter = this.f2446j;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
