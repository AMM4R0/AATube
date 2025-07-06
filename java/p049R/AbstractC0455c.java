package p049R;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000A.AbstractC0002c;
import p104l.ViewOnClickListenerC2572g1;

/* renamed from: R.c */
/* loaded from: classes.dex */
public abstract class AbstractC0455c extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public boolean f1168a;

    /* renamed from: b */
    public boolean f1169b;

    /* renamed from: c */
    public Cursor f1170c;

    /* renamed from: d */
    public int f1171d;

    /* renamed from: e */
    public C0453a f1172e;

    /* renamed from: f */
    public C0454b f1173f;

    /* renamed from: g */
    public C0456d f1174g;

    /* renamed from: a */
    public abstract void mo1208a(View view, Cursor cursor);

    /* renamed from: b */
    public void mo1209b(Cursor cursor) {
        Cursor cursor2 = this.f1170c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0453a c0453a = this.f1172e;
                if (c0453a != null) {
                    cursor2.unregisterContentObserver(c0453a);
                }
                C0454b c0454b = this.f1173f;
                if (c0454b != null) {
                    cursor2.unregisterDataSetObserver(c0454b);
                }
            }
            this.f1170c = cursor;
            if (cursor != null) {
                C0453a c0453a2 = this.f1172e;
                if (c0453a2 != null) {
                    cursor.registerContentObserver(c0453a2);
                }
                C0454b c0454b2 = this.f1173f;
                if (c0454b2 != null) {
                    cursor.registerDataSetObserver(c0454b2);
                }
                this.f1171d = cursor.getColumnIndexOrThrow("_id");
                this.f1168a = true;
                notifyDataSetChanged();
            } else {
                this.f1171d = -1;
                this.f1168a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract String mo1210c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo1211d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1168a || (cursor = this.f1170c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r2, View view, ViewGroup viewGroup) {
        if (!this.f1168a) {
            return null;
        }
        this.f1170c.moveToPosition(r2);
        if (view == null) {
            ViewOnClickListenerC2572g1 viewOnClickListenerC2572g1 = (ViewOnClickListenerC2572g1) this;
            view = viewOnClickListenerC2572g1.f8357j.inflate(viewOnClickListenerC2572g1.f8356i, viewGroup, false);
        }
        mo1208a(view, this.f1170c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1174g == null) {
            C0456d c0456d = new C0456d();
            c0456d.f1175a = this;
            this.f1174g = c0456d;
        }
        return this.f1174g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        Cursor cursor;
        if (!this.f1168a || (cursor = this.f1170c) == null) {
            return null;
        }
        cursor.moveToPosition(r2);
        return this.f1170c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
        Cursor cursor;
        if (this.f1168a && (cursor = this.f1170c) != null && cursor.moveToPosition(r4)) {
            return this.f1170c.getLong(this.f1171d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int r2, View view, ViewGroup viewGroup) {
        if (!this.f1168a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1170c.moveToPosition(r2)) {
            throw new IllegalStateException(AbstractC0002c.m11f(r2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = mo1211d(viewGroup);
        }
        mo1208a(view, this.f1170c);
        return view;
    }
}
