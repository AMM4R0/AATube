package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p023I0.C0205c;
import p136w0.AbstractC2877a;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC2877a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0205c(24);

    /* renamed from: a */
    public final int f2676a;

    /* renamed from: b */
    public final String f2677b;

    /* renamed from: c */
    public final String f2678c;

    /* renamed from: d */
    public final String f2679d;

    /* renamed from: e */
    public final String f2680e;

    /* renamed from: f */
    public final Uri f2681f;

    /* renamed from: g */
    public String f2682g;

    /* renamed from: h */
    public final long f2683h;

    /* renamed from: i */
    public final String f2684i;

    /* renamed from: j */
    public final ArrayList f2685j;

    /* renamed from: k */
    public final String f2686k;

    /* renamed from: l */
    public final String f2687l;

    /* renamed from: m */
    public final HashSet f2688m = new HashSet();

    public GoogleSignInAccount(int r2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2676a = r2;
        this.f2677b = str;
        this.f2678c = str2;
        this.f2679d = str3;
        this.f2680e = str4;
        this.f2681f = uri;
        this.f2682g = str5;
        this.f2683h = j2;
        this.f2684i = str6;
        this.f2685j = arrayList;
        this.f2686k = str7;
        this.f2687l = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m2025a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int r5 = 0; r5 < length; r5++) {
            hashSet.add(new Scope(1, jSONArray.getString(r5)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f2682g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f2684i.equals(this.f2684i)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f2685j);
            hashSet.addAll(googleSignInAccount.f2688m);
            HashSet hashSet2 = new HashSet(this.f2685j);
            hashSet2.addAll(this.f2688m);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m9d = AbstractC0002c.m9d(this.f2684i, 527, 31);
        HashSet hashSet = new HashSet(this.f2685j);
        hashSet.addAll(this.f2688m);
        return hashSet.hashCode() + m9d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int m59Y = AbstractC0005b.m59Y(parcel, 20293);
        AbstractC0005b.m61a0(parcel, 1, 4);
        parcel.writeInt(this.f2676a);
        AbstractC0005b.m56V(parcel, 2, this.f2677b);
        AbstractC0005b.m56V(parcel, 3, this.f2678c);
        AbstractC0005b.m56V(parcel, 4, this.f2679d);
        AbstractC0005b.m56V(parcel, 5, this.f2680e);
        AbstractC0005b.m55U(parcel, 6, this.f2681f, r6);
        AbstractC0005b.m56V(parcel, 7, this.f2682g);
        AbstractC0005b.m61a0(parcel, 8, 8);
        parcel.writeLong(this.f2683h);
        AbstractC0005b.m56V(parcel, 9, this.f2684i);
        AbstractC0005b.m58X(parcel, 10, this.f2685j);
        AbstractC0005b.m56V(parcel, 11, this.f2686k);
        AbstractC0005b.m56V(parcel, 12, this.f2687l);
        AbstractC0005b.m60Z(parcel, m59Y);
    }
}
