package o;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: o.ɼı  reason: contains not printable characters */
public final class C1488 {

    /* renamed from: ı  reason: contains not printable characters */
    public final Map<String, If> f7951;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f7952;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Set<C1490> f7953;

    /* renamed from: ι  reason: contains not printable characters */
    public final Set<C1489> f7954;

    public C1488(String str, Map<String, If> map, Set<C1490> set, Set<C1489> set2) {
        Set<C1489> set3;
        this.f7952 = str;
        this.f7951 = Collections.unmodifiableMap(map);
        this.f7953 = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f7954 = set3;
    }

    public final boolean equals(Object obj) {
        Set<C1489> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1488 r5 = (C1488) obj;
        String str = this.f7952;
        if (str == null ? r5.f7952 != null : !str.equals(r5.f7952)) {
            return false;
        }
        Map<String, If> map = this.f7951;
        if (map == null ? r5.f7951 != null : !map.equals(r5.f7951)) {
            return false;
        }
        Set<C1490> set2 = this.f7953;
        if (set2 == null ? r5.f7953 != null : !set2.equals(r5.f7953)) {
            return false;
        }
        Set<C1489> set3 = this.f7954;
        if (set3 == null || (set = r5.f7954) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.f7952;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, If> map = this.f7951;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C1490> set = this.f7953;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.f7952);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.f7951);
        sb.append(", foreignKeys=");
        sb.append(this.f7953);
        sb.append(", indices=");
        sb.append(this.f7954);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Set<C1490> m8880(C1558 r18, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor r1 = r18.m9171(sb.toString());
        try {
            int columnIndex = r1.getColumnIndex("id");
            int columnIndex2 = r1.getColumnIndex("seq");
            int columnIndex3 = r1.getColumnIndex("table");
            int columnIndex4 = r1.getColumnIndex("on_delete");
            int columnIndex5 = r1.getColumnIndex("on_update");
            List<C1491> r7 = m8884(r1);
            int count = r1.getCount();
            for (int i = 0; i < count; i++) {
                r1.moveToPosition(i);
                if (r1.getInt(columnIndex2) == 0) {
                    int i2 = r1.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C1491 next : r7) {
                        if (next.f7972 == i2) {
                            arrayList.add(next.f7973);
                            arrayList2.add(next.f7971);
                        }
                    }
                    hashSet.add(new C1490(r1.getString(columnIndex3), r1.getString(columnIndex4), r1.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            r1.close();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static List<C1491> m8884(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C1491(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Map<String, If> m8881(C1558 r14, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor r142 = r14.m9171(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (r142.getColumnCount() > 0) {
                int columnIndex = r142.getColumnIndex("name");
                int columnIndex2 = r142.getColumnIndex("type");
                int columnIndex3 = r142.getColumnIndex("notnull");
                int columnIndex4 = r142.getColumnIndex("pk");
                int columnIndex5 = r142.getColumnIndex("dflt_value");
                while (r142.moveToNext()) {
                    String string = r142.getString(columnIndex);
                    hashMap.put(string, new If(string, r142.getString(columnIndex2), r142.getInt(columnIndex3) != 0, r142.getInt(columnIndex4), r142.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            r142.close();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Set<C1489> m8882(C1558 r8, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor r9 = r8.m9171(sb.toString());
        try {
            int columnIndex = r9.getColumnIndex("name");
            int columnIndex2 = r9.getColumnIndex("origin");
            int columnIndex3 = r9.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (r9.moveToNext()) {
                        if ("c".equals(r9.getString(columnIndex2))) {
                            String string = r9.getString(columnIndex);
                            boolean z = true;
                            if (r9.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C1489 r5 = m8883(r8, string, z);
                            if (r5 == null) {
                                r9.close();
                                return null;
                            }
                            hashSet.add(r5);
                        }
                    }
                    r9.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            r9.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ɩ  reason: contains not printable characters */
    private static C1489 m8883(C1558 r6, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor r62 = r6.m9171(sb.toString());
        try {
            int columnIndex = r62.getColumnIndex("seqno");
            int columnIndex2 = r62.getColumnIndex("cid");
            int columnIndex3 = r62.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (r62.moveToNext()) {
                        if (r62.getInt(columnIndex2) >= 0) {
                            int i = r62.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), r62.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C1489 r1 = new C1489(str, z, arrayList);
                    r62.close();
                    return r1;
                }
            }
            r62.close();
            return null;
        } catch (Throwable th) {
            r62.close();
            throw th;
        }
    }

    /* renamed from: o.ɼı$If */
    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean f7955;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final int f7956;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String f7957;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int f7958;

        /* renamed from: Ι  reason: contains not printable characters */
        public final String f7959;

        /* renamed from: ι  reason: contains not printable characters */
        public final int f7960;

        /* renamed from: і  reason: contains not printable characters */
        public final String f7961;

        public If(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f7957 = str;
            this.f7959 = str2;
            this.f7955 = z;
            this.f7958 = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f7960 = i3;
            this.f7961 = str3;
            this.f7956 = i2;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                If ifR = (If) obj;
                if (Build.VERSION.SDK_INT < 20) {
                    if ((this.f7958 > 0) != (ifR.f7958 > 0)) {
                        return false;
                    }
                } else if (this.f7958 != ifR.f7958) {
                    return false;
                }
                if (!this.f7957.equals(ifR.f7957) || this.f7955 != ifR.f7955) {
                    return false;
                }
                if (this.f7956 == 1 && ifR.f7956 == 2 && (str3 = this.f7961) != null && !str3.equals(ifR.f7961)) {
                    return false;
                }
                if (this.f7956 == 2 && ifR.f7956 == 1 && (str2 = ifR.f7961) != null && !str2.equals(this.f7961)) {
                    return false;
                }
                int i = this.f7956;
                if ((i == 0 || i != ifR.f7956 || ((str = this.f7961) == null ? ifR.f7961 == null : str.equals(ifR.f7961))) && this.f7960 == ifR.f7960) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f7957.hashCode() * 31) + this.f7960) * 31) + (this.f7955 ? 1231 : 1237)) * 31) + this.f7958;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f7957);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.f7959);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.f7960);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.f7955);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f7958);
            sb.append(", defaultValue='");
            sb.append(this.f7961);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: o.ɼı$ǃ  reason: contains not printable characters */
    public static class C1490 {

        /* renamed from: ı  reason: contains not printable characters */
        public final String f7965;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String f7966;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<String> f7967;

        /* renamed from: Ι  reason: contains not printable characters */
        public final List<String> f7968;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f7969;

        public C1490(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f7965 = str;
            this.f7966 = str2;
            this.f7969 = str3;
            this.f7967 = Collections.unmodifiableList(list);
            this.f7968 = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1490 r4 = (C1490) obj;
            if (this.f7965.equals(r4.f7965) && this.f7966.equals(r4.f7966) && this.f7969.equals(r4.f7969) && this.f7967.equals(r4.f7967)) {
                return this.f7968.equals(r4.f7968);
            }
            return false;
        }

        public final int hashCode() {
            return (((((((this.f7965.hashCode() * 31) + this.f7966.hashCode()) * 31) + this.f7969.hashCode()) * 31) + this.f7967.hashCode()) * 31) + this.f7968.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.f7965);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.f7966);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.f7969);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.f7967);
            sb.append(", referenceColumnNames=");
            sb.append(this.f7968);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: o.ɼı$ɩ  reason: contains not printable characters */
    static class C1491 implements Comparable<C1491> {

        /* renamed from: ı  reason: contains not printable characters */
        final int f7970;

        /* renamed from: ǃ  reason: contains not printable characters */
        final String f7971;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f7972;

        /* renamed from: ι  reason: contains not printable characters */
        final String f7973;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            C1491 r3 = (C1491) obj;
            int i = this.f7972 - r3.f7972;
            return i == 0 ? this.f7970 - r3.f7970 : i;
        }

        C1491(int i, int i2, String str, String str2) {
            this.f7972 = i;
            this.f7970 = i2;
            this.f7973 = str;
            this.f7971 = str2;
        }
    }

    /* renamed from: o.ɼı$ı  reason: contains not printable characters */
    public static class C1489 {

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean f7962;

        /* renamed from: Ι  reason: contains not printable characters */
        public final String f7963;

        /* renamed from: ι  reason: contains not printable characters */
        public final List<String> f7964;

        public C1489(String str, boolean z, List<String> list) {
            this.f7963 = str;
            this.f7962 = z;
            this.f7964 = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1489 r4 = (C1489) obj;
            if (this.f7962 != r4.f7962 || !this.f7964.equals(r4.f7964)) {
                return false;
            }
            if (this.f7963.startsWith("index_")) {
                return r4.f7963.startsWith("index_");
            }
            return this.f7963.equals(r4.f7963);
        }

        public final int hashCode() {
            int i;
            if (this.f7963.startsWith("index_")) {
                i = "index_".hashCode();
            } else {
                i = this.f7963.hashCode();
            }
            return (((i * 31) + (this.f7962 ? 1 : 0)) * 31) + this.f7964.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.f7963);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.f7962);
            sb.append(", columns=");
            sb.append(this.f7964);
            sb.append('}');
            return sb.toString();
        }
    }
}
