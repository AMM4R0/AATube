package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC2492i;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2659i;
import p108m1.AbstractC2661k;
import p108m1.AbstractC2671u;
import p108m1.C2668r;

/* loaded from: classes.dex */
public final class CollectionUtils {
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    public static final boolean areCollectionsEqual(Collection<? extends Object> collection, Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <T> List<T> arrayListCopyOfNullableCollection(Collection<? extends T> collection) {
        if (collection != null) {
            return AbstractC2659i.m5118h0(collection);
        }
        return null;
    }

    public static final Map<String, byte[]> bundleToMap(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    hashMap.put(str, byteArray);
                }
            }
        }
        return hashMap;
    }

    public static final <T> Map<String, T> convertMapKeysToLowerCase(Map<String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2671u.m5125b0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            linkedHashMap.put(str != null ? str.toLowerCase(Locale.getDefault()) : null, entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public static final List<String> createSortedListWithoutRepetitions(String... strArr) {
        String[] strArr2 = strArr;
        AbstractC2492i.m4915e(strArr2, "<this>");
        TreeSet treeSet = new TreeSet();
        AbstractC2658h.m5111I(strArr2, treeSet);
        return unmodifiableListCopy(treeSet);
    }

    public static final <T> T getFirstOrNull(List<? extends T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T getFromMapIgnoreCase(Map<String, ? extends T> map, String str) {
        T t2;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            Map.Entry entry = (Map.Entry) t2;
            CharSequence charSequence = (CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0) {
                String str2 = (String) entry.getKey();
                if (str2 == null ? str == null : str2.equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        Map.Entry entry2 = (Map.Entry) t2;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> getMapFromList(List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        int m5125b0 = AbstractC2671u.m5125b0(AbstractC2661k.m5122Z(list));
        if (m5125b0 < 16) {
            m5125b0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5125b0);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> V getOrDefault(Map<K, ? extends V> map, K k2, V v2) {
        V v3 = map.get(k2);
        return v3 == null ? v2 : v3;
    }

    public static final Set<Integer> hashSetFromIntArray(int[] r4) {
        AbstractC2492i.m4915e(r4, "<this>");
        HashSet hashSet = new HashSet(AbstractC2671u.m5125b0(r4.length));
        for (int r02 : r4) {
            hashSet.add(Integer.valueOf(r02));
        }
        return hashSet;
    }

    public static final boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final <K, V> Map<K, V> mapCopyOfNullableMap(Map<K, ? extends V> map) {
        if (map != null) {
            return AbstractC2671u.m5130g0(map);
        }
        return null;
    }

    public static final Bundle mapToBundle(Map<String, byte[]> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> nullIfEmptyList(List<? extends T> list) {
        if (list == 0 || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final <K, V> void putOpt(Map<K, V> map, K k2, V v2) {
        if (k2 == null || v2 == null) {
            return;
        }
        map.put(k2, v2);
    }

    public static final List<Integer> toIntList(int[] r4) {
        AbstractC2492i.m4915e(r4, "<this>");
        int length = r4.length;
        if (length == 0) {
            return C2668r.f8607a;
        }
        if (length == 1) {
            return AbstractC2480a.m4863D(Integer.valueOf(r4[0]));
        }
        ArrayList arrayList = new ArrayList(r4.length);
        for (int r02 : r4) {
            arrayList.add(Integer.valueOf(r02));
        }
        return arrayList;
    }

    public static final <T> List<T> unmodifiableListCopy(Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static final <K, V> Map<K, V> unmodifiableMapCopy(Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final <T> Set<T> unmodifiableSetOf(T... tArr) {
        AbstractC2492i.m4915e(tArr, "<this>");
        HashSet hashSet = new HashSet(AbstractC2671u.m5125b0(tArr.length));
        AbstractC2658h.m5111I(tArr, hashSet);
        return Collections.unmodifiableSet(hashSet);
    }
}
