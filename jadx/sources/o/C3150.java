package o;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.յɪ  reason: contains not printable characters */
final class C3150 implements C3043, C3061 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<Class<?>, C3119<?>> f14355;

    /* renamed from: ɩ  reason: contains not printable characters */
    final JsonWriter f14356;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<Class<?>, C2856<?>> f14357;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f14358 = true;

    C3150(Writer writer, Map<Class<?>, C2856<?>> map, Map<Class<?>, C3119<?>> map2) {
        this.f14356 = new JsonWriter(writer);
        this.f14357 = map;
        this.f14355 = map2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C3150 m15938(Object obj) {
        if (obj == null) {
            this.f14356.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f14356.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (this.f14358) {
                        this.f14356.value(Base64.encodeToString(bArr, 2));
                        return this;
                    }
                    throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                }
                this.f14356.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f14356.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j = jArr[i];
                        if (this.f14358) {
                            this.f14356.value(j);
                            i++;
                        } else {
                            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f14356.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f14356.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        m15938(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        m15938(objArr[i]);
                        i++;
                    }
                }
                this.f14356.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f14356.beginArray();
                for (Object r0 : (Collection) obj) {
                    m15938(r0);
                }
                this.f14356.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f14356.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m15940((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new C3021(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.f14356.endObject();
                return this;
            } else {
                C2856 r02 = this.f14357.get(obj.getClass());
                if (r02 != null) {
                    this.f14356.beginObject();
                    r02.m15438(obj, this);
                    this.f14356.endObject();
                    return this;
                }
                C3119 r03 = this.f14355.get(obj.getClass());
                if (r03 != null) {
                    r03.m15438(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    if (this.f14358) {
                        this.f14356.value(name);
                        return this;
                    }
                    throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                } else {
                    StringBuilder sb = new StringBuilder("Couldn't find encoder for type ");
                    sb.append(obj.getClass().getCanonicalName());
                    throw new C3021(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public C3150 m15940(String str, Object obj) {
        if (this.f14358) {
            this.f14356.name(str);
            if (obj != null) {
                return m15938(obj);
            }
            this.f14356.nullValue();
            return this;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ C3043 m15939(String str, long j) {
        if (this.f14358) {
            this.f14356.name(str);
            if (this.f14358) {
                this.f14356.value(j);
                return this;
            }
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ C3043 m15942(String str, int i) {
        if (this.f14358) {
            this.f14356.name(str);
            if (this.f14358) {
                this.f14356.value((long) i);
                return this;
            }
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ C3061 m15941(boolean z) {
        if (this.f14358) {
            this.f14356.value(z);
            return this;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ C3061 m15943(String str) {
        if (this.f14358) {
            this.f14356.value(str);
            return this;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
