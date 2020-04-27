package sg.gov.tech.bluetrace.idmanager;

import android.content.Context;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import o.C0329;
import o.C0452;
import o.C0757;
import o.C3122;
import o.C3166;
import o.C3191;
import o.C3401fc;
import o.bW;
import o.dM;
import o.fM;
import o.lA;
import o.lR;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\bJ\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/idmanager/TempIDManager;", "", "TAG", "Ljava/lang/String;", "Landroid/content/Context;", "p0", "", "bmValid", "(Landroid/content/Context;)Z", "", "Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "Ljava/util/Queue;", "convertToQueue", "([Lsg/gov/tech/bluetrace/idmanager/TemporaryID;)Ljava/util/Queue;", "convertToTemporaryIDs", "(Ljava/lang/String;)[Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "Lo/ıӿ;", "p1", "Lo/ıə;", "Lo/ƚյ;", "getTemporaryIDs", "(Landroid/content/Context;Lo/ıӿ;)Lo/ıə;", "getValidOrLastTemporaryID", "(Landroid/content/Context;Ljava/util/Queue;)Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "needToRollNewTempID", "needToUpdate", "retrieveTemporaryID", "(Landroid/content/Context;)Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "", "storeTemporaryIDs", "(Landroid/content/Context;Ljava/lang/String;)V", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
public final class TempIDManager {
    public static final TempIDManager INSTANCE = new TempIDManager();
    private static final String TAG = "TempIDManager";

    private TempIDManager() {
    }

    public final void storeTemporaryIDs(Context context, String str) {
        fM.m2254(context, "");
        fM.m2254(str, "");
        lA.f2728.m3368(TAG, "[TempID] Storing temporary IDs into internal storage...");
        C3401fc.m2288$default(new File(context.getFilesDir(), "tempIDs"), str, (Charset) null, 2, (Object) null);
    }

    public final TemporaryID retrieveTemporaryID(Context context) {
        fM.m2254(context, "");
        File file = new File(context.getFilesDir(), "tempIDs");
        if (!file.exists()) {
            return null;
        }
        String r0 = C3401fc.m2291$default(file, (Charset) null, 1, (Object) null);
        lA.C0215 r1 = lA.f2728;
        r1.m3368(TAG, "[TempID] fetched broadcastmessage from file:  " + r0);
        return getValidOrLastTemporaryID(context, convertToQueue(convertToTemporaryIDs(r0)));
    }

    private final TemporaryID getValidOrLastTemporaryID(Context context, Queue<TemporaryID> queue) {
        lA.f2728.m3368(TAG, "[TempID] Retrieving Temporary ID");
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            if (queue.size() <= 1) {
                break;
            }
            TemporaryID peek = queue.peek();
            peek.print();
            if (peek.isValidForCurrentTime()) {
                lA.f2728.m3368(TAG, "[TempID] Breaking out of the loop");
                break;
            }
            queue.poll();
            i++;
        }
        TemporaryID peek2 = queue.peek();
        long j = (long) 1000;
        long startTime = peek2.getStartTime() * j;
        long expiryTime = peek2.getExpiryTime() * j;
        lA.C0215 r9 = lA.f2728;
        r9.m3368(TAG, "[TempID Total number of items in queue: " + queue.size());
        lA.C0215 r92 = lA.f2728;
        r92.m3368(TAG, "[TempID Number of items popped from queue: " + i);
        lA.C0215 r4 = lA.f2728;
        r4.m3368(TAG, "[TempID] Current time: " + currentTimeMillis);
        lA.C0215 r2 = lA.f2728;
        r2.m3368(TAG, "[TempID] Start time: " + startTime);
        lA.C0215 r22 = lA.f2728;
        r22.m3368(TAG, "[TempID] Expiry time: " + expiryTime);
        lA.f2728.m3368(TAG, "[TempID] Updating expiry time");
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        try {
            Object[] objArr = new Object[2];
            objArr[1] = Long.valueOf(expiryTime);
            objArr[0] = context;
            ((Class) C3166.m16013(4, 8, 0)).getMethod("ǃ", new Class[]{Context.class, Long.TYPE}).invoke(obj, objArr);
            fM.m2252((Object) peek2, "");
            return peek2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private final TemporaryID[] convertToTemporaryIDs(String str) {
        C3122 r0 = new bW().m1732().m1733();
        fM.m2252((Object) r0, "");
        TemporaryID[] temporaryIDArr = (TemporaryID[]) r0.m15829(str, TemporaryID[].class);
        lA.C0215 r02 = lA.f2728;
        r02.m3368(TAG, "[TempID] After GSON conversion: " + temporaryIDArr[0].getTempID() + ' ' + temporaryIDArr[0].getStartTime());
        fM.m2252((Object) temporaryIDArr, "");
        return temporaryIDArr;
    }

    private final Queue<TemporaryID> convertToQueue(TemporaryID[] temporaryIDArr) {
        lA.C0215 r0 = lA.f2728;
        StringBuilder sb = new StringBuilder();
        sb.append("[TempID] Before Sort: ");
        sb.append(temporaryIDArr[0]);
        r0.m3368(TAG, sb.toString());
        if (temporaryIDArr.length > 1) {
            dM.m2063(temporaryIDArr, new TempIDManager$convertToQueue$$inlined$sortBy$1());
        }
        lA.f2728.m3368(TAG, "[TempID] After Sort: " + temporaryIDArr[0]);
        Queue<TemporaryID> linkedList = new LinkedList<>();
        for (TemporaryID offer : temporaryIDArr) {
            linkedList.offer(offer);
        }
        lA.f2728.m3368(TAG, "[TempID] Retrieving from Queue: " + linkedList.peek());
        return linkedList;
    }

    public final C0329<C0757> getTemporaryIDs(Context context, C0452 r4) {
        fM.m2254(context, "");
        fM.m2254(r4, "");
        C0329<C0757> r3 = r4.m4773("getTempIDs").m15905().m4420(new TempIDManager$getTemporaryIDs$1(context)).m4414((C3191) TempIDManager$getTemporaryIDs$2.INSTANCE);
        fM.m2252((Object) r3, "");
        return r3;
    }

    public final boolean needToUpdate(Context context) {
        fM.m2254(context, "");
        boolean z = false;
        try {
            long longValue = ((Long) ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{context})).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= longValue) {
                z = true;
            }
            lA.C0215 r8 = lA.f2728;
            r8.m3369(TAG, "Need to update and fetch TemporaryIDs? " + longValue + " vs " + currentTimeMillis + ": " + z);
            return z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean needToRollNewTempID(Context context) {
        fM.m2254(context, "");
        boolean z = false;
        try {
            long longValue = ((Long) ((Class) C3166.m16013(4, 8, 0)).getMethod("ɹ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{context})).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= longValue) {
                z = true;
            }
            lA.C0215 r8 = lA.f2728;
            r8.m3368(TAG, "[TempID] Need to get new TempID? " + longValue + " vs " + currentTimeMillis + ": " + z);
            return z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean bmValid(Context context) {
        fM.m2254(context, "");
        boolean z = false;
        try {
            if (System.currentTimeMillis() < ((Long) ((Class) C3166.m16013(4, 8, 0)).getMethod("ɹ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{context})).longValue()) {
                z = true;
            }
            if (!lR.f2769.m3513()) {
                return true;
            }
            lA.f2728.m3372(TAG, "Temp ID is valid");
            return z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
