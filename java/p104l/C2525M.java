package p104l;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: l.M */
/* loaded from: classes.dex */
public final class C2525M implements ListAdapter, SpinnerAdapter {

    /* renamed from: a */
    public SpinnerAdapter f8259a;

    /* renamed from: b */
    public ListAdapter f8260b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f8260b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int r2, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(r2, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(r2);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(r3);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int r12) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int r12, View view, ViewGroup viewGroup) {
        return getDropDownView(r12, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int r2) {
        ListAdapter listAdapter = this.f8260b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(r2);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f8259a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
