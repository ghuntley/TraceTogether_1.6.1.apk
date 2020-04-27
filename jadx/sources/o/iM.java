package o;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0011"}, d2 = {"Lo/iM;", "", "p0", "Ljava/lang/ClassLoader;", "p1", "Ljava/lang/Class;", "p2", "S", "Ι", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "", "ɩ", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "ǃ", "Ljava/net/URL;", "(Ljava/net/URL;)Ljava/util/List;", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)Ljava/util/List;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
public final class iM {

    /* renamed from: ι  reason: contains not printable characters */
    public static final iM f2335 = new iM();

    private iM() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <S> List<S> m2611(Class<S> cls, ClassLoader classLoader) {
        fM.m2254(cls, "");
        fM.m2254(classLoader, "");
        try {
            return m2610(cls, classLoader);
        } catch (Throwable unused) {
            ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
            fM.m2252((Object) load, "");
            return dN.m2188(load);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <S> List<S> m2610(Class<S> cls, ClassLoader classLoader) {
        fM.m2254(cls, "");
        fM.m2254(classLoader, "");
        Enumeration<URL> resources = classLoader.getResources("META-INF/services/" + cls.getName());
        fM.m2252((Object) resources, "");
        ArrayList<T> list = Collections.list(resources);
        fM.m2252((Object) list, "");
        Collection arrayList = new ArrayList();
        for (T t : list) {
            iM iMVar = f2335;
            fM.m2252((Object) t, "");
            dN.m2081(arrayList, iMVar.m2607(t));
        }
        Set r0 = dN.m2197((List) arrayList);
        if (!r0.isEmpty()) {
            Iterable<String> iterable = r0;
            Collection arrayList2 = new ArrayList(dN.m2074(iterable, 10));
            for (String r2 : iterable) {
                arrayList2.add(f2335.m2609(r2, classLoader, cls));
            }
            return (List) arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final <S> S m2609(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        o.eY.m2182(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        o.C3354df.m2096(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        o.eY.m2182(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        throw r1;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m2607(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = ""
            o.fM.m2252((java.lang.Object) r0, (java.lang.String) r1)
            r1 = 0
            r2 = 2
            r3 = 0
            java.lang.String r4 = "jar"
            boolean r4 = o.gK.m2345$default(r0, r4, r1, r2, r3)
            if (r4 == 0) goto L_0x006e
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = o.gK.m2364$default(r0, r6, r3, r2, r3)
            r4 = 33
            java.lang.String r6 = o.gK.m2374$default((java.lang.String) r6, (char) r4, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            java.lang.String r4 = "!/"
            java.lang.String r0 = o.gK.m2364$default(r0, r4, r3, r2, r3)
            java.util.jar.JarFile r2 = new java.util.jar.JarFile
            r2.<init>(r6, r1)
            r6 = r3
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0062 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0062 }
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0062 }
            r4.<init>(r0)     // Catch:{ all -> 0x0062 }
            java.io.InputStream r0 = r2.getInputStream(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0062 }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ all -> 0x0062 }
            r6.<init>(r1)     // Catch:{ all -> 0x0062 }
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ all -> 0x0062 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0062 }
            r0 = r6
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x005b }
            o.iM r1 = f2335     // Catch:{ all -> 0x005b }
            java.util.List r0 = r1.m2608(r0)     // Catch:{ all -> 0x005b }
            o.eY.m2182(r6, r3)     // Catch:{ all -> 0x0062 }
            r2.close()     // Catch:{ all -> 0x0059 }
            return r0
        L_0x0059:
            r6 = move-exception
            throw r6
        L_0x005b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            o.eY.m2182(r6, r0)     // Catch:{ all -> 0x0062 }
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0069 }
            throw r0
        L_0x0069:
            r0 = move-exception
            o.C3354df.m2096(r6, r0)
            throw r6
        L_0x006e:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r6 = r0
            java.io.BufferedReader r6 = (java.io.BufferedReader) r6     // Catch:{ all -> 0x008f }
            o.iM r1 = f2335     // Catch:{ all -> 0x008f }
            java.util.List r6 = r1.m2608(r6)     // Catch:{ all -> 0x008f }
            o.eY.m2182(r0, r3)
            return r6
        L_0x008f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            o.eY.m2182(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iM.m2607(java.net.URL):java.util.List");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final List<String> m2608(BufferedReader bufferedReader) {
        boolean z;
        Set linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return dN.m2188(linkedHashSet);
            }
            String r1 = gK.m2375$default(readLine, "#", (String) null, 2, (Object) null);
            if (r1 != null) {
                String obj = gK.m2377(r1).toString();
                CharSequence charSequence = obj;
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i >= charSequence.length()) {
                        z = true;
                        break;
                    }
                    char charAt = charSequence.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (charSequence.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                throw new dA("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }
}
