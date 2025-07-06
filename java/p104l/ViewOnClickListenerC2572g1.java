package p104l;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.carwizard.p075li.youtube.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p049R.AbstractC0455c;
import p049R.C0453a;
import p049R.C0454b;

/* renamed from: l.g1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2572g1 extends AbstractC0455c implements View.OnClickListener {

    /* renamed from: x */
    public static final /* synthetic */ int f8354x = 0;

    /* renamed from: h */
    public final int f8355h;

    /* renamed from: i */
    public final int f8356i;

    /* renamed from: j */
    public final LayoutInflater f8357j;

    /* renamed from: k */
    public final SearchView f8358k;

    /* renamed from: l */
    public final SearchableInfo f8359l;

    /* renamed from: m */
    public final Context f8360m;

    /* renamed from: n */
    public final WeakHashMap f8361n;

    /* renamed from: o */
    public final int f8362o;

    /* renamed from: p */
    public int f8363p;

    /* renamed from: q */
    public ColorStateList f8364q;

    /* renamed from: r */
    public int f8365r;

    /* renamed from: s */
    public int f8366s;

    /* renamed from: t */
    public int f8367t;

    /* renamed from: u */
    public int f8368u;

    /* renamed from: v */
    public int f8369v;

    /* renamed from: w */
    public int f8370w;

    public ViewOnClickListenerC2572g1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1169b = true;
        this.f1170c = null;
        this.f1168a = false;
        this.f1171d = -1;
        this.f1172e = new C0453a(this);
        this.f1173f = new C0454b(0, this);
        this.f8356i = suggestionRowLayout;
        this.f8355h = suggestionRowLayout;
        this.f8357j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8363p = 1;
        this.f8365r = -1;
        this.f8366s = -1;
        this.f8367t = -1;
        this.f8368u = -1;
        this.f8369v = -1;
        this.f8370w = -1;
        this.f8358k = searchView;
        this.f8359l = searchableInfo;
        this.f8362o = searchView.getSuggestionCommitIconResId();
        this.f8360m = context;
        this.f8361n = weakHashMap;
    }

    /* renamed from: h */
    public static String m5023h(Cursor cursor, int r3) {
        if (r3 == -1) {
            return null;
        }
        try {
            return cursor.getString(r3);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    @Override // p049R.AbstractC0455c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1208a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.ViewOnClickListenerC2572g1.mo1208a(android.view.View, android.database.Cursor):void");
    }

    @Override // p049R.AbstractC0455c
    /* renamed from: b */
    public final void mo1209b(Cursor cursor) {
        try {
            super.mo1209b(cursor);
            if (cursor != null) {
                this.f8365r = cursor.getColumnIndex("suggest_text_1");
                this.f8366s = cursor.getColumnIndex("suggest_text_2");
                this.f8367t = cursor.getColumnIndex("suggest_text_2_url");
                this.f8368u = cursor.getColumnIndex("suggest_icon_1");
                this.f8369v = cursor.getColumnIndex("suggest_icon_2");
                this.f8370w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // p049R.AbstractC0455c
    /* renamed from: c */
    public final String mo1210c(Cursor cursor) {
        String m5023h;
        String m5023h2;
        if (cursor == null) {
            return null;
        }
        String m5023h3 = m5023h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m5023h3 != null) {
            return m5023h3;
        }
        SearchableInfo searchableInfo = this.f8359l;
        if (searchableInfo.shouldRewriteQueryFromData() && (m5023h2 = m5023h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m5023h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (m5023h = m5023h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m5023h;
    }

    @Override // p049R.AbstractC0455c
    /* renamed from: d */
    public final View mo1211d(ViewGroup viewGroup) {
        View inflate = this.f8357j.inflate(this.f8355h, viewGroup, false);
        inflate.setTag(new C2569f1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f8362o);
        return inflate;
    }

    /* renamed from: e */
    public final Drawable m5024e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8360m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m5025f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.ViewOnClickListenerC2572g1.m5025f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public final Cursor m5026g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f8360m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p049R.AbstractC0455c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int r3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(r3, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f8357j.inflate(this.f8356i, viewGroup, false);
            if (inflate != null) {
                ((C2569f1) inflate.getTag()).f8348a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // p049R.AbstractC0455c, android.widget.Adapter
    public final View getView(int r2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(r2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View mo1211d = mo1211d(viewGroup);
            ((C2569f1) mo1211d.getTag()).f8348a.setText(e2.toString());
            return mo1211d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1170c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1170c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8358k.m1523r((CharSequence) tag);
        }
    }
}
