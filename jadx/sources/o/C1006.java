package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.core.CrashlyticsCore;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o.C0867;
import o.C1047;
import o.C1163;
import o.C1368;
import o.C3286ax;
import o.aD;
import o.bH;
import org.json.JSONObject;

/* renamed from: o.ɂı  reason: contains not printable characters */
public class C1006 {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f6067 = "SessionEvent";

    /* renamed from: ŀ  reason: contains not printable characters */
    static final FileFilter f6068 = new FileFilter() {
        public final boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };

    /* renamed from: ł  reason: contains not printable characters */
    static final Comparator<File> f6069 = new Comparator<File>() {
        /* renamed from: ı  reason: contains not printable characters */
        public final int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };

    /* renamed from: ſ  reason: contains not printable characters */
    static final int f6070 = 4;

    /* renamed from: Ɩ  reason: contains not printable characters */
    static final String f6071 = ".json";

    /* renamed from: Ɨ  reason: contains not printable characters */
    static final String f6072 = "fatal-sessions";

    /* renamed from: ƚ  reason: contains not printable characters */
    static final int f6073 = 10;
    /* access modifiers changed from: private */

    /* renamed from: ǀ  reason: contains not printable characters */
    public static final Pattern f6074 = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: ǃ  reason: contains not printable characters */
    static final String f6075 = "SessionOS";

    /* renamed from: ȷ  reason: contains not printable characters */
    static final String f6076 = "clx";

    /* renamed from: ɍ  reason: contains not printable characters */
    static final int f6077 = 1024;

    /* renamed from: ɔ  reason: contains not printable characters */
    private static final String f6078 = "com.crashlytics.ApiEndpoint";

    /* renamed from: ɟ  reason: contains not printable characters */
    private static final boolean f6079 = false;

    /* renamed from: ɨ  reason: contains not printable characters */
    static final String f6080 = "timestamp";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f6081 = "SessionCrash";

    /* renamed from: ɪ  reason: contains not printable characters */
    static final FilenameFilter f6082 = new C3636If(f6084) {
        public final boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(C0864.f5630);
        }
    };

    /* renamed from: ɭ  reason: contains not printable characters */
    private static final String f6083 = "com.crashlytics.CollectCustomKeys";

    /* renamed from: ɹ  reason: contains not printable characters */
    static final String f6084 = "BeginSession";

    /* renamed from: ɺ  reason: contains not printable characters */
    static final String f6085 = "invalidClsFiles";

    /* renamed from: ɼ  reason: contains not printable characters */
    static final int f6086 = 1;

    /* renamed from: ɾ  reason: contains not printable characters */
    static final String f6087 = "_ae";

    /* renamed from: ɿ  reason: contains not printable characters */
    static final FilenameFilter f6088 = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(C0864.f5630);
        }
    };

    /* renamed from: ʅ  reason: contains not printable characters */
    static final String f6089 = "nonfatal-sessions";

    /* renamed from: ʟ  reason: contains not printable characters */
    static final int f6090 = 8;

    /* renamed from: ͻ  reason: contains not printable characters */
    private static final String f6091 = "crash";

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f6092 = "SessionApp";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f6093 = "SessionUser";

    /* renamed from: ϲ  reason: contains not printable characters */
    private static final Map<String, String> f6094 = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* renamed from: ϳ  reason: contains not printable characters */
    private static final int f6095 = 64;

    /* renamed from: І  reason: contains not printable characters */
    static final String f6096 = "SessionDevice";

    /* renamed from: Ј  reason: contains not printable characters */
    private static final String f6097 = "Crashlytics Android SDK/%s";

    /* renamed from: г  reason: contains not printable characters */
    static final Comparator<File> f6098 = new Comparator<File>() {
        /* renamed from: ı  reason: contains not printable characters */
        public final int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };

    /* renamed from: с  reason: contains not printable characters */
    private static final String f6099 = "error";

    /* renamed from: т  reason: contains not printable characters */
    private static final int f6100 = 1;

    /* renamed from: х  reason: contains not printable characters */
    private static final String[] f6101 = {f6093, f6092, f6075, f6096};

    /* renamed from: і  reason: contains not printable characters */
    static final String f6102 = "SessionMissingBinaryImages";

    /* renamed from: ґ  reason: contains not printable characters */
    private static final int f6103 = 35;

    /* renamed from: Ӏ  reason: contains not printable characters */
    static final String f6104 = "fatal";

    /* renamed from: ӏ  reason: contains not printable characters */
    static final String f6105 = "_r";

    /* renamed from: ıı  reason: contains not printable characters */
    private final C1010 f6106;

    /* renamed from: ıǃ  reason: contains not printable characters */
    private final C1085 f6107;
    /* access modifiers changed from: private */

    /* renamed from: ǃı  reason: contains not printable characters */
    public final String f6108;

    /* renamed from: ǃǃ  reason: contains not printable characters */
    private final C0739 f6109;

    /* renamed from: ɂ  reason: contains not printable characters */
    private final C1368.C1369 f6110;

    /* renamed from: Ɉ  reason: contains not printable characters */
    private final C1504 f6111;

    /* renamed from: ɉ  reason: contains not printable characters */
    private C1047 f6112;

    /* renamed from: ɻ  reason: contains not printable characters */
    private final C0964 f6113;

    /* renamed from: ʏ  reason: contains not printable characters */
    private final C1343 f6114;

    /* renamed from: ʔ  reason: contains not printable characters */
    private final aD f6115;

    /* renamed from: ʕ  reason: contains not printable characters */
    private final C3301bl f6116;
    /* access modifiers changed from: private */

    /* renamed from: ʖ  reason: contains not printable characters */
    public final CrashlyticsCore f6117;

    /* renamed from: ͼ  reason: contains not printable characters */
    private final C2903 f6118;
    /* access modifiers changed from: private */

    /* renamed from: Γ  reason: contains not printable characters */
    public final C0708 f6119;
    /* access modifiers changed from: private */

    /* renamed from: τ  reason: contains not printable characters */
    public final C1163 f6120;

    /* renamed from: Г  reason: contains not printable characters */
    private final C1368.Cif f6121;

    /* renamed from: ј  reason: contains not printable characters */
    private final AtomicInteger f6122 = new AtomicInteger(0);

    /* renamed from: ӷ  reason: contains not printable characters */
    private final C3303bn f6123;

    /* renamed from: o.ɂı$ǃ  reason: contains not printable characters */
    interface C1008 {
        /* renamed from: Ι  reason: contains not printable characters */
        void m7235(FileOutputStream fileOutputStream);
    }

    /* renamed from: o.ɂı$ɩ  reason: contains not printable characters */
    interface C1009 {
        /* renamed from: ι  reason: contains not printable characters */
        void m7236(C0872 r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private File[] m7129(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: o.ɂı$If  reason: case insensitive filesystem */
    static class C3636If implements FilenameFilter {

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f6198;

        public C3636If(String str) {
            this.f6198 = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f6198) && !str.endsWith(C0864.f5632);
        }
    }

    /* renamed from: o.ɂı$І  reason: contains not printable characters */
    static class C1012 implements FilenameFilter {

        /* renamed from: ı  reason: contains not printable characters */
        private final String f6209;

        public C1012(String str) {
            this.f6209 = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6209);
            sb.append(C0864.f5630);
            if (!str.equals(sb.toString()) && str.contains(this.f6209) && !str.endsWith(C0864.f5632)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.ɂı$if  reason: invalid class name */
    static class Cif implements FilenameFilter {
        private Cif() {
        }

        public boolean accept(File file, String str) {
            return !C1006.f6088.accept(file, str) && C1006.f6074.matcher(str).matches();
        }
    }

    /* renamed from: o.ɂı$IF */
    static class IF implements FilenameFilter {
        IF() {
        }

        public boolean accept(File file, String str) {
            return C0864.f5631.accept(file, str) || str.contains(C1006.f6102);
        }
    }

    public C1006(CrashlyticsCore crashlyticsCore, C0964 r4, C3301bl blVar, aD aDVar, C1343 r7, C3303bn bnVar, C0708 r9, C1481 r10, C0739 r11, C2903 r12) {
        this.f6117 = crashlyticsCore;
        this.f6113 = r4;
        this.f6116 = blVar;
        this.f6115 = aDVar;
        this.f6114 = r7;
        this.f6123 = bnVar;
        this.f6119 = r9;
        this.f6108 = r10.m8860();
        this.f6109 = r11;
        this.f6118 = r12;
        Context r3 = crashlyticsCore.m1589();
        this.f6106 = new C1010(bnVar);
        this.f6120 = new C1163(r3, this.f6106);
        this.f6121 = new C1011();
        this.f6110 = new aux();
        this.f6107 = new C1085(r3);
        this.f6111 = new C1115(f6077, new C1478(10));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7193(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        m7198();
        this.f6112 = new C1047(new C1047.If() {
            /* renamed from: Ι  reason: contains not printable characters */
            public void m7222(C1047.Cif ifVar, Thread thread, Throwable th, boolean z) {
                C1006.this.m7203(ifVar, thread, th, z);
            }
        }, new C1007(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.f6112);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public synchronized void m7203(C1047.Cif ifVar, Thread thread, Throwable th, boolean z) {
        C3263ac.m1563();
        this.f6107.m7446();
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final C1047.Cif ifVar2 = ifVar;
        final boolean z2 = z;
        this.f6113.m6881(new Callable<Void>() {
            /* renamed from: Ι  reason: contains not printable characters */
            public Void call() {
                bD bDVar;
                bI bIVar;
                C1006.this.f6117.m691();
                C1006.this.m7138(date, thread2, th2);
                bM r0 = ifVar2.m7301();
                if (r0 != null) {
                    bIVar = r0.f1616;
                    bDVar = r0.f1618;
                } else {
                    bIVar = null;
                    bDVar = null;
                }
                boolean z = false;
                if ((bDVar == null || bDVar.f1583) || z2) {
                    C1006.this.m7148(date.getTime());
                }
                C1006.this.m7202(bIVar);
                C1006.this.m7165();
                if (bIVar != null) {
                    C1006.this.m7199(bIVar.f1603);
                }
                if (C3281au.m1627(C1006.this.f6117.m1589()).m1628() && !C1006.this.m7143(r0)) {
                    z = true;
                }
                if (z) {
                    C1006.this.m7171(r0);
                }
                return null;
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7205(float f, bM bMVar) {
        if (bMVar == null) {
            C3263ac.m1563();
            return;
        }
        new C1368(this.f6119.f4908, m7134(bMVar.f1619.f1579, bMVar.f1619.f1576), this.f6121, this.f6110).m8490(f, m7143(bMVar) ? new C3637iF(this.f6117, this.f6114, bMVar.f1617) : new C1368.C1371());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7206(final long j, final String str) {
        this.f6113.m6880(new Callable<Void>() {
            /* renamed from: Ι  reason: contains not printable characters */
            public Void call() {
                if (C1006.this.m7209()) {
                    return null;
                }
                C1006.this.f6120.m7651(j, str);
                return null;
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7194(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.f6113.m6879((Runnable) new Runnable() {
            public void run() {
                if (!C1006.this.m7209()) {
                    C1006.this.m7151(date, thread, th);
                }
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7192(final String str, final String str2, final String str3) {
        this.f6113.m6880(new Callable<Void>() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public Void call() {
                new C1161(C1006.this.m7210()).m7639(C1006.this.m7160(), new C1546(str, str2, str3));
                return null;
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m7186(final Map<String, String> map) {
        this.f6113.m6880(new Callable<Void>() {
            /* renamed from: ι  reason: contains not printable characters */
            public Void call() {
                new C1161(C1006.this.m7210()).m7640(C1006.this.m7160(), (Map<String, String>) map);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7198() {
        this.f6113.m6880(new Callable<Void>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public Void call() {
                C1006.this.m7165();
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: ɪ  reason: contains not printable characters */
    public String m7160() {
        File[] r0 = m7164();
        if (r0.length > 0) {
            return m7132(r0[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɾ  reason: contains not printable characters */
    public String m7163() {
        File[] r0 = m7164();
        if (r0.length > 1) {
            return m7132(r0[1]);
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m7132(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m7195() {
        return m7204().length > 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m7188(final bI bIVar) {
        return ((Boolean) this.f6113.m6881(new Callable<Boolean>() {
            /* renamed from: ı  reason: contains not printable characters */
            public Boolean call() {
                if (C1006.this.m7209()) {
                    C3263ac.m1563();
                    return Boolean.FALSE;
                }
                C3263ac.m1563();
                C1006.this.m7139(bIVar, true);
                C3263ac.m1563();
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: ʟ  reason: contains not printable characters */
    public void m7165() {
        Date date = new Date();
        String obj = new C0813(this.f6115).toString();
        C3263ac.m1563();
        m7170(obj, date);
        m7149(obj);
        m7120(obj);
        m7177(obj);
        this.f6120.m7655(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m7202(bI bIVar) {
        m7139(bIVar, false);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7139(o.bI r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r4 + 8
            r2.m7135((int) r0)
            java.io.File[] r0 = r2.m7164()
            int r1 = r0.length
            if (r1 > r4) goto L_0x0010
            o.C3263ac.m1563()
            return
        L_0x0010:
            r1 = r0[r4]
            java.lang.String r1 = m7132((java.io.File) r1)
            r2.m7131(r1)
            if (r3 != 0) goto L_0x001f
            o.C3263ac.m1563()
            return
        L_0x001f:
            int r3 = r3.f1604
            r2.m7127((java.io.File[]) r0, (int) r4, (int) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1006.m7139(o.bI, boolean):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7127(File[] fileArr, int i, int i2) {
        C3263ac.m1563();
        while (i < fileArr.length) {
            File file = fileArr[i];
            String r1 = m7132(file);
            C3263ac.m1563();
            m7119(file, r1, i2);
            i++;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7140(C0864 r1) {
        if (r1 != null) {
            try {
                r1.m6427();
            } catch (IOException unused) {
                C3263ac.m1563();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m7179(Set<File> set) {
        for (File r0 : set) {
            m7175(r0);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m7175(File file) {
        if (file.isDirectory()) {
            for (File r3 : file.listFiles()) {
                m7175(r3);
            }
        }
        file.delete();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m7168(String str) {
        for (File delete : m7146(str)) {
            delete.delete();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private File[] m7146(String str) {
        return m7145((FilenameFilter) new C1012(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public File[] m7190() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, m7158(m7191(), f6088));
        Collections.addAll(linkedList, m7158(m7208(), f6088));
        Collections.addAll(linkedList, m7158(m7210(), f6088));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public File[] m7207() {
        return m7128(f6068);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public File[] m7204() {
        return m7145(f6082);
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    private File[] m7164() {
        File[] r0 = m7204();
        Arrays.sort(r0, f6069);
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private File[] m7128(FileFilter fileFilter) {
        return m7129(m7210().listFiles(fileFilter));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public File[] m7145(FilenameFilter filenameFilter) {
        return m7158(m7210(), filenameFilter);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private File[] m7158(File file, FilenameFilter filenameFilter) {
        return m7129(file.listFiles(filenameFilter));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private File[] m7157(File file) {
        return m7129(file.listFiles());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7137(String str, int i) {
        File r0 = m7210();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f6067);
        C1563.m9195(r0, new C3636If(sb.toString()), i, f6098);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7199(int i) {
        int r4 = i - C1563.m9196(m7191(), i, f6098);
        C1563.m9195(m7210(), f6088, r4 - C1563.m9196(m7208(), r4, f6098), f6098);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7135(int i) {
        HashSet hashSet = new HashSet();
        File[] r1 = m7164();
        int min = Math.min(i, r1.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(m7132(r1[i2]));
        }
        this.f6120.m7650((Set<String>) hashSet);
        m7142(m7145((FilenameFilter) new Cif()), (Set<String>) hashSet);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7142(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            Matcher matcher = f6074.matcher(file.getName());
            if (!matcher.matches()) {
                C3263ac.m1563();
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                C3263ac.m1563();
                file.delete();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private File[] m7159(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C3263ac.m1563();
        new Object[1][0] = Integer.valueOf(i);
        m7137(str, i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f6067);
        return m7145((FilenameFilter) new C3636If(sb.toString()));
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m7201() {
        this.f6113.m6879((Runnable) new Runnable() {
            public void run() {
                C1006 r0 = C1006.this;
                r0.m7200(r0.m7145((FilenameFilter) new IF()));
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7200(File[] fileArr) {
        final HashSet hashSet = new HashSet();
        for (File r4 : fileArr) {
            C3263ac.m1563();
            hashSet.add(m7132(r4));
        }
        if (!hashSet.isEmpty()) {
            File r7 = m7196();
            if (!r7.exists()) {
                r7.mkdir();
            }
            for (File file : m7145((FilenameFilter) new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                C3263ac.m1563();
                if (!file.renameTo(new File(r7, file.getName()))) {
                    C3263ac.m1563();
                    file.delete();
                }
            }
            m7183();
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m7183() {
        File r0 = m7196();
        if (r0.exists()) {
            File[] r1 = m7158(r0, (FilenameFilter) new IF());
            Arrays.sort(r1, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < r1.length && hashSet.size() < 4; i++) {
                hashSet.add(m7132(r1[i]));
            }
            m7142(m7157(r0), (Set<String>) hashSet);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m7167(Context context, File file, String str) {
        byte[] r0 = C1206.m7832(file);
        byte[] r1 = C1206.m7834(file);
        byte[] r11 = C1206.m7836(file, context);
        if (r0 == null || r0.length == 0) {
            C3263ac.m1563();
            return;
        }
        m7178(str, "<native-crash: minidump>");
        byte[] r12 = m7156(str, "BeginSession.json");
        byte[] r2 = m7156(str, "SessionApp.json");
        byte[] r3 = m7156(str, "SessionDevice.json");
        byte[] r4 = m7156(str, "SessionOS.json");
        byte[] r5 = C1206.m7827(new C1161(m7210()).m7637(str));
        C1163 r6 = new C1163(this.f6117.m1589(), this.f6106, str);
        byte[] r7 = r6.m7652();
        r6.m7653();
        byte[] r62 = C1206.m7827(new C1161(m7210()).m7642(str));
        File file2 = new File(this.f6123.m1823(), str);
        if (!file2.mkdir()) {
            C3263ac.m1563();
            return;
        }
        m7155(r0, new File(file2, "minidump"));
        m7155(r1, new File(file2, "metadata"));
        m7155(r11, new File(file2, "binaryImages"));
        m7155(r12, new File(file2, "session"));
        m7155(r2, new File(file2, "app"));
        m7155(r3, new File(file2, "device"));
        m7155(r4, new File(file2, "os"));
        m7155(r5, new File(file2, "user"));
        m7155(r7, new File(file2, "logs"));
        m7155(r62, new File(file2, "keys"));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m7189(final C0996 r3) {
        if (r3 == null) {
            return true;
        }
        return ((Boolean) this.f6113.m6881(new Callable<Boolean>() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public Boolean call() {
                File first;
                TreeSet<File> treeSet = r3.f6063;
                String r1 = C1006.this.m7163();
                if (!(r1 == null || treeSet.isEmpty() || (first = treeSet.first()) == null)) {
                    C1006 r3 = C1006.this;
                    r3.m7167(r3.f6117.m1589(), first, r1);
                }
                C1006.this.m7179((Set<File>) treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7155(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            m7126(bArr, file);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7126(byte[] bArr, File file) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                C3285aw.m1684((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C3285aw.m1684((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C3285aw.m1684((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        o.C3285aw.m1677((java.io.Flushable) r0);
        o.C3285aw.m1667((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r12 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7138(java.util.Date r12, java.lang.Thread r13, java.lang.Throwable r14) {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = r11.m7160()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            if (r1 != 0) goto L_0x0011
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            o.C3285aw.m1677((java.io.Flushable) r0)
            o.C3285aw.m1667((java.io.Closeable) r0)
            return
        L_0x0011:
            java.lang.Class r2 = r14.getClass()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            m7178((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            o.ǀΙ r2 = new o.ǀΙ     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            java.io.File r3 = r11.m7210()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            r4.<init>()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            r4.append(r1)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            java.lang.String r1 = "SessionCrash"
            r4.append(r1)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            r2.<init>((java.io.File) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            o.ǀӀ r0 = o.C0872.m6479((java.io.OutputStream) r2)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r9 = "crash"
            r10 = 1
            r4 = r11
            r5 = r0
            r6 = r12
            r7 = r13
            r8 = r14
            r4.m7152(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0050 }
            o.C3285aw.m1677((java.io.Flushable) r0)
            o.C3285aw.m1667((java.io.Closeable) r2)
            return
        L_0x004c:
            r12 = move-exception
            r2 = r0
            goto L_0x005b
        L_0x004f:
            r2 = r0
        L_0x0050:
            o.C3263ac.m1563()     // Catch:{ all -> 0x005a }
            o.C3285aw.m1677((java.io.Flushable) r0)
            o.C3285aw.m1667((java.io.Closeable) r2)
            return
        L_0x005a:
            r12 = move-exception
        L_0x005b:
            o.C3285aw.m1677((java.io.Flushable) r0)
            o.C3285aw.m1667((java.io.Closeable) r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1006.m7138(java.util.Date, java.lang.Thread, java.lang.Throwable):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:4|5|6|7|8|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        r13 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0054 */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7151(java.util.Date r13, java.lang.Thread r14, java.lang.Throwable r15) {
        /*
            r12 = this;
            java.lang.String r0 = r12.m7160()
            if (r0 != 0) goto L_0x000a
            o.C3263ac.m1563()
            return
        L_0x000a:
            java.lang.Class r1 = r15.getClass()
            java.lang.String r1 = r1.getName()
            m7169((java.lang.String) r0, (java.lang.String) r1)
            r1 = 0
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f6122     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            int r2 = r2.getAndIncrement()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.lang.String r2 = o.C3285aw.m1659((int) r2)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r3.<init>()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r3.append(r0)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "SessionEvent"
            r3.append(r4)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r3.append(r2)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            o.ǀΙ r3 = new o.ǀΙ     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            java.io.File r4 = r12.m7210()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r3.<init>((java.io.File) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            o.ǀӀ r1 = o.C0872.m6479((java.io.OutputStream) r3)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r10 = "error"
            r11 = 0
            r5 = r12
            r6 = r1
            r7 = r13
            r8 = r14
            r9 = r15
            r5.m7152(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0057
        L_0x0050:
            r13 = move-exception
            r3 = r1
            goto L_0x0068
        L_0x0053:
            r3 = r1
        L_0x0054:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0067 }
        L_0x0057:
            o.C3285aw.m1677((java.io.Flushable) r1)
            o.C3285aw.m1667((java.io.Closeable) r3)
            r13 = 64
            r12.m7137((java.lang.String) r0, (int) r13)     // Catch:{ Exception -> 0x0063 }
            return
        L_0x0063:
            o.C3263ac.m1563()
            return
        L_0x0067:
            r13 = move-exception
        L_0x0068:
            o.C3285aw.m1677((java.io.Flushable) r1)
            o.C3285aw.m1667((java.io.Closeable) r3)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1006.m7151(java.util.Date, java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7150(String str, String str2, C1009 r7) {
        C0864 r1;
        C0872 r0 = null;
        try {
            File r2 = m7210();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            r1 = new C0864(r2, sb.toString());
            try {
                r0 = C0872.m6479((OutputStream) r1);
                r7.m7236(r0);
                C3285aw.m1677((Flushable) r0);
                C3285aw.m1667((Closeable) r1);
            } catch (Throwable th) {
                th = th;
                C3285aw.m1677((Flushable) r0);
                C3285aw.m1667((Closeable) r1);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = null;
            C3285aw.m1677((Flushable) r0);
            C3285aw.m1667((Closeable) r1);
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7121(String str, String str2, C1008 r8) {
        FileOutputStream fileOutputStream = null;
        try {
            File r3 = m7210();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(r3, sb.toString()));
            try {
                r8.m7235(fileOutputStream2);
                C3285aw.m1667((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C3285aw.m1667((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C3285aw.m1667((Closeable) fileOutputStream);
            throw th;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private byte[] m7156(String str, String str2) {
        File r1 = m7210();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return C1206.m7827(new File(r1, sb.toString()));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m7170(String str, Date date) {
        final String str2 = str;
        final String format = String.format(Locale.US, f6097, new Object[]{this.f6117.m1597()});
        final long time = date.getTime() / 1000;
        m7150(str, f6084, (C1009) new C1009() {
            /* renamed from: ι  reason: contains not printable characters */
            public void m7212(C0872 r5) {
                C1464.m8788(r5, str2, format, time);
            }
        });
        m7121(str, "BeginSession.json", (C1008) new C1008() {
            /* renamed from: Ι  reason: contains not printable characters */
            public void m7229(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("session_id", str2);
                        put("generator", format);
                        put("started_at_seconds", Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        });
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7149(String str) {
        String str2 = this.f6115.f1399;
        String str3 = this.f6119.f4912;
        String str4 = this.f6119.f4909;
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = str4;
        final String r6 = this.f6115.m1459();
        final int i = C3287ay.m1698(this.f6119.f4911).f1575;
        m7150(str, f6092, (C1009) new C1009() {
            /* renamed from: ι  reason: contains not printable characters */
            public void m7214(C0872 r9) {
                C1464.m8773(r9, str5, C1006.this.f6119.f4908, str6, str7, r6, i, C1006.this.f6108);
            }
        });
        m7121(str, "SessionApp.json", (C1008) new C1008() {
            /* renamed from: Ι  reason: contains not printable characters */
            public void m7213(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("app_identifier", str5);
                        put("api_key", C1006.this.f6119.f4908);
                        put("version_code", str6);
                        put("version_name", str7);
                        put("install_uuid", r6);
                        put("delivery_mechanism", Integer.valueOf(i));
                        put("unity_version", TextUtils.isEmpty(C1006.this.f6108) ? "" : C1006.this.f6108);
                    }
                }).toString().getBytes());
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7120(String str) {
        final boolean r0 = C3285aw.m1693(this.f6117.m1589());
        m7150(str, f6075, (C1009) new C1009() {
            /* renamed from: ι  reason: contains not printable characters */
            public void m7215(C0872 r4) {
                C1464.m8774(r4, Build.VERSION.RELEASE, Build.VERSION.CODENAME, r0);
            }
        });
        m7121(str, "SessionOS.json", (C1008) new C1008() {
            /* renamed from: Ι  reason: contains not printable characters */
            public void m7216(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("version", Build.VERSION.RELEASE);
                        put("build_version", Build.VERSION.CODENAME);
                        put("is_rooted", Boolean.valueOf(r0));
                    }
                }).toString().getBytes());
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m7177(String str) {
        String str2 = str;
        Context r0 = this.f6117.m1589();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int r13 = C3285aw.m1671();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long r15 = C3285aw.m1664();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean r19 = C3285aw.m1695(r0);
        final int i = r13;
        final int i2 = availableProcessors;
        final long j = r15;
        final long j2 = blockCount;
        final boolean z = r19;
        final Map<aD.C0107, String> r9 = this.f6115.m1461();
        long j3 = r15;
        AnonymousClass16 r152 = r0;
        final int r10 = C3285aw.m1694(r0);
        AnonymousClass16 r02 = new C1009() {
            /* renamed from: ι  reason: contains not printable characters */
            public void m7217(C0872 r14) {
                C1464.m8771(r14, i, Build.MODEL, i2, j, j2, z, r9, r10, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        m7150(str2, f6096, (C1009) r152);
        final long j4 = j3;
        m7121(str2, "SessionDevice.json", (C1008) new C1008() {
            /* renamed from: Ι  reason: contains not printable characters */
            public void m7218(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("arch", Integer.valueOf(i));
                        put("build_model", Build.MODEL);
                        put("available_processors", Integer.valueOf(i2));
                        put("total_ram", Long.valueOf(j4));
                        put("disk_space", Long.valueOf(j2));
                        put("is_emulator", Boolean.valueOf(z));
                        put("ids", r9);
                        put("state", Integer.valueOf(r10));
                        put("build_manufacturer", Build.MANUFACTURER);
                        put("build_product", Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        });
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m7131(String str) {
        final C1546 r0 = m7162(str);
        m7150(str, f6093, (C1009) new C1009() {
            /* renamed from: ι  reason: contains not printable characters */
            public void m7219(C0872 r4) {
                C1464.m8772(r4, r0.f8225, r0.f8227, r0.f8226);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7152(o.C0872 r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        /*
            r24 = this;
            r0 = r24
            o.ɼΙ r5 = new o.ɼΙ
            o.ɼІ r1 = r0.f6111
            r2 = r28
            r5.<init>(r2, r1)
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.f6117
            android.content.Context r1 = r1.m1589()
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = o.C3285aw.m1673((android.content.Context) r1)
            o.ɍӏ r4 = r0.f6107
            boolean r4 = r4.m7447()
            int r17 = o.C3285aw.m1656((android.content.Context) r1, (boolean) r4)
            boolean r18 = o.C3285aw.m1686((android.content.Context) r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = o.C3285aw.m1664()
            long r8 = o.C3285aw.m1665((android.content.Context) r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = o.C3285aw.m1681((java.lang.String) r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = o.C3285aw.m1657((java.lang.String) r4, (android.content.Context) r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.f8005
            o.Ɨӏ r4 = r0.f6119
            java.lang.String r15 = r4.f4910
            o.aD r4 = r0.f6115
            java.lang.String r14 = r4.f1399
            r4 = 0
            if (r30 == 0) goto L_0x009f
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0076:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x009c
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            o.ɼІ r6 = r0.f6111
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.m8921(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0076
        L_0x009c:
            r6 = 1
            r8 = r10
            goto L_0x00a3
        L_0x009f:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x00a3:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = o.C3285aw.m1692(r1, r4, r6)
            if (r1 != 0) goto L_0x00b1
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c6
        L_0x00b1:
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.f6117
            java.util.Map r1 = r1.m704()
            if (r1 == 0) goto L_0x00c6
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00c6
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x00c7
        L_0x00c6:
            r10 = r1
        L_0x00c7:
            o.ɟі r11 = r0.f6120
            r1 = r25
            r4 = r29
            r6 = r27
            o.C1464.m8784(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1006.m7152(o.ǀӀ, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7119(File file, String str, int i) {
        C3263ac.m1563();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f6081);
        File[] r0 = m7145((FilenameFilter) new C3636If(sb.toString()));
        boolean z = r0 != null && r0.length > 0;
        C3263ac.m1563();
        Object[] objArr = {str, Boolean.valueOf(z)};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f6067);
        File[] r5 = m7145((FilenameFilter) new C3636If(sb2.toString()));
        boolean z2 = r5 != null && r5.length > 0;
        C3263ac.m1563();
        Object[] objArr2 = {str, Boolean.valueOf(z2)};
        if (z || z2) {
            m7136(file, str, m7159(str, r5, i), z ? r0[0] : null);
        } else {
            C3263ac.m1563();
        }
        C3263ac.m1563();
        m7168(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        o.C3285aw.m1677((java.io.Flushable) null);
        m7140(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r10 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005f */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7136(java.io.File r10, java.lang.String r11, java.io.File[] r12, java.io.File r13) {
        /*
            r9 = this;
            r0 = 1
            if (r13 == 0) goto L_0x0005
            r1 = 1
            goto L_0x0006
        L_0x0005:
            r1 = 0
        L_0x0006:
            if (r1 == 0) goto L_0x000d
            java.io.File r2 = r9.m7191()
            goto L_0x0011
        L_0x000d:
            java.io.File r2 = r9.m7208()
        L_0x0011:
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x001a
            r2.mkdirs()
        L_0x001a:
            r3 = 0
            o.ǀΙ r4 = new o.ǀΙ     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r4.<init>((java.io.File) r2, (java.lang.String) r11)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            o.ǀӀ r3 = o.C0872.m6479((java.io.OutputStream) r4)     // Catch:{ Exception -> 0x005f }
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x005f }
            m7122((o.C0872) r3, (java.io.File) r10)     // Catch:{ Exception -> 0x005f }
            r10 = 4
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x005f }
            r2.<init>()     // Catch:{ Exception -> 0x005f }
            long r5 = r2.getTime()     // Catch:{ Exception -> 0x005f }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r3.m6495((int) r10, (long) r5)     // Catch:{ Exception -> 0x005f }
            r10 = 5
            r3.m6513((int) r10, (boolean) r1)     // Catch:{ Exception -> 0x005f }
            r10 = 11
            r3.m6494((int) r10, (int) r0)     // Catch:{ Exception -> 0x005f }
            r10 = 12
            r0 = 3
            r3.m6529((int) r10, (int) r0)     // Catch:{ Exception -> 0x005f }
            r9.m7123((o.C0872) r3, (java.lang.String) r11)     // Catch:{ Exception -> 0x005f }
            m7172((o.C0872) r3, (java.io.File[]) r12, (java.lang.String) r11)     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            m7122((o.C0872) r3, (java.io.File) r13)     // Catch:{ Exception -> 0x005f }
        L_0x0054:
            o.C3285aw.m1677((java.io.Flushable) r3)
            o.C3285aw.m1667((java.io.Closeable) r4)
            return
        L_0x005b:
            r10 = move-exception
            r4 = r3
            goto L_0x006a
        L_0x005e:
            r4 = r3
        L_0x005f:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0069 }
            o.C3285aw.m1677((java.io.Flushable) r3)
            r9.m7140((o.C0864) r4)
            return
        L_0x0069:
            r10 = move-exception
        L_0x006a:
            o.C3285aw.m1677((java.io.Flushable) r3)
            o.C3285aw.m1667((java.io.Closeable) r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1006.m7136(java.io.File, java.lang.String, java.io.File[], java.io.File):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m7172(C0872 r7, File[] fileArr, String str) {
        Arrays.sort(fileArr, C3285aw.f1552);
        for (File file : fileArr) {
            try {
                C3263ac.m1563();
                Object[] objArr = {str, file.getName()};
                m7122(r7, file);
            } catch (Exception unused) {
                C3263ac.m1563();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7123(C0872 r8, String str) {
        for (String append : f6101) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(append);
            sb.append(C0864.f5630);
            File[] r4 = m7145((FilenameFilter) new C3636If(sb.toString()));
            if (r4.length == 0) {
                C3263ac.m1563();
            } else {
                C3263ac.m1563();
                m7122(r8, r4[0]);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m7122(C0872 r4, File file) {
        if (!file.exists()) {
            C3263ac.m1563();
            file.getName();
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                m7176(fileInputStream2, r4, (int) file.length());
                C3285aw.m1667((Closeable) fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C3285aw.m1667((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C3285aw.m1667((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m7176(InputStream inputStream, C0872 r4, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        r4.m6533(bArr);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1546 m7162(String str) {
        if (m7209()) {
            return new C1546(this.f6117.m703(), this.f6117.m698(), this.f6117.m699());
        }
        return new C1161(m7210()).m7641(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public boolean m7209() {
        C1047 r0 = this.f6112;
        return r0 != null && r0.m7299();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public File m7210() {
        return this.f6123.m1823();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public File m7191() {
        return new File(m7210(), f6072);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public File m7208() {
        return new File(m7210(), f6089);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ȷ  reason: contains not printable characters */
    public File m7196() {
        return new File(m7210(), f6085);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m7187(bM bMVar) {
        if (bMVar.f1618.f1583) {
            this.f6109.m5917();
            C3263ac.m1563();
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public void m7197() {
        this.f6107.m7445();
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m7143(bM bMVar) {
        if (bMVar != null && bMVar.f1618.f1584 && !this.f6114.m8430()) {
            return true;
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private C1045 m7134(String str, String str2) {
        String r0 = C3285aw.m1660(this.f6117.m1589(), f6078);
        return new C0870(new C1112(this.f6117, r0, str, this.f6116), new C1167(this.f6117, r0, str2, this.f6116));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m7171(bM bMVar) {
        if (bMVar == null) {
            C3263ac.m1563();
            return;
        }
        Context r0 = this.f6117.m1589();
        C1368 r1 = new C1368(this.f6119.f4908, m7134(bMVar.f1619.f1579, bMVar.f1619.f1576), this.f6121, this.f6110);
        for (File r4 : m7190()) {
            this.f6113.m6879((Runnable) new C1013(r0, new C1480(r4, f6094), r1));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m7169(String str, String str2) {
        Answers answers = (Answers) C3263ac.m1559(Answers.class);
        if (answers == null) {
            C3263ac.m1563();
        } else {
            answers.m656(new C3286ax.Cif(str, str2));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m7178(String str, String str2) {
        Answers answers = (Answers) C3263ac.m1559(Answers.class);
        if (answers == null) {
            C3263ac.m1563();
        } else {
            answers.m671(new C3286ax.C0121(str, str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7148(long j) {
        if (m7130()) {
            C3263ac.m1563();
        } else if (this.f6118 != null) {
            C3263ac.m1563();
            Bundle bundle = new Bundle();
            bundle.putInt(f6105, 1);
            bundle.putInt(f6104, 1);
            bundle.putLong(f6080, j);
            this.f6118.m15057(f6076, f6087, bundle);
        } else {
            C3263ac.m1563();
        }
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean m7130() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: o.ɂı$aux */
    final class aux implements C1368.C1369 {
        private aux() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m7230() {
            return C1006.this.m7209();
        }
    }

    /* renamed from: o.ɂı$ι  reason: contains not printable characters */
    final class C1011 implements C1368.Cif {
        private C1011() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final File[] m7238() {
            return C1006.this.m7190();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final File[] m7239() {
            return C1006.this.m7196().listFiles();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final File[] m7240() {
            return C1006.this.m7207();
        }
    }

    /* renamed from: o.ɂı$iF  reason: case insensitive filesystem */
    static final class C3637iF implements C1368.If {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final bL f6200;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3269ai f6201;
        /* access modifiers changed from: private */

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1343 f6202;

        public C3637iF(C3269ai aiVar, C1343 r2, bL bLVar) {
            this.f6201 = aiVar;
            this.f6202 = r2;
            this.f6200 = bLVar;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m7232() {
            C3263ac r0 = this.f6201.m1588();
            Activity activity = r0.f1487 != null ? r0.f1487.get() : null;
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            final C0867 r1 = C0867.m6434(activity, this.f6200, new C0867.C0868() {
                /* renamed from: ı  reason: contains not printable characters */
                public void m7233(boolean z) {
                    C3637iF.this.f6202.m8429(z);
                }
            });
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    r1.m6439();
                }
            });
            C3263ac.m1563();
            r1.m6437();
            return r1.m6438();
        }
    }

    /* renamed from: o.ɂı$і  reason: contains not printable characters */
    static final class C1013 implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private final Context f6210;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C1368 f6211;

        /* renamed from: ι  reason: contains not printable characters */
        private final C1390 f6212;

        public C1013(Context context, C1390 r2, C1368 r3) {
            this.f6210 = context;
            this.f6212 = r2;
            this.f6211 = r3;
        }

        public final void run() {
            if (C3285aw.m1669(this.f6210)) {
                C3263ac.m1563();
                this.f6211.m8492(this.f6212);
            }
        }
    }

    /* renamed from: o.ɂı$Ι  reason: contains not printable characters */
    static final class C1010 implements C1163.C1165 {

        /* renamed from: ι  reason: contains not printable characters */
        private static final String f6206 = "log-files";

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3303bn f6207;

        public C1010(C3303bn bnVar) {
            this.f6207 = bnVar;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final File m7237() {
            File file = new File(this.f6207.m1823(), f6206);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: o.ɂı$ı  reason: contains not printable characters */
    static final class C1007 implements C1047.Cif {
        private C1007() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final bM m7234() {
            return bH.C0122.f1602.m1709();
        }
    }
}
