package o;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.ͷı  reason: contains not printable characters */
public final class C1734 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private static DateFormat f8958 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final String[] f8959 = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: ı  reason: contains not printable characters */
    final String f8960;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Date f8961;

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f8962;

    /* renamed from: Ι  reason: contains not printable characters */
    final long f8963;

    /* renamed from: ι  reason: contains not printable characters */
    final String f8964;

    /* renamed from: І  reason: contains not printable characters */
    final long f8965;

    private C1734(String str, String str2, String str3, Date date, long j, long j2) {
        this.f8964 = str;
        this.f8962 = str2;
        this.f8960 = str3;
        this.f8961 = date;
        this.f8963 = j;
        this.f8965 = j2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C1734 m9756(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f8959) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                return new C1734(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f8958.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
            } catch (ParseException e) {
                throw new C1794("Could not process experiment: parsing experiment start time failed.", e);
            } catch (NumberFormatException e2) {
                throw new C1794("Could not process experiment: one of the durations could not be converted into a long.", e2);
            }
        } else {
            throw new C1794(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }
}
