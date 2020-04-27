package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.Ɩι  reason: contains not printable characters */
public final class C0656 implements Iterable<Intent> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f4699;

    /* renamed from: Ι  reason: contains not printable characters */
    private final ArrayList<Intent> f4700 = new ArrayList<>();

    /* renamed from: o.Ɩι$If */
    public interface If {
        Intent getSupportParentActivityIntent();
    }

    private C0656(Context context) {
        this.f4699 = context;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0656 m5471(Context context) {
        return new C0656(context);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0656 m5473(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f4699.getPackageManager());
        }
        if (component != null) {
            m5470(component);
        }
        this.f4700.add(intent);
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0656 m5472(Activity activity) {
        Intent supportParentActivityIntent = ((If) activity).getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0336.m4436(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f4699.getPackageManager());
            }
            m5470(component);
            this.f4700.add(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C0656 m5470(ComponentName componentName) {
        int size = this.f4700.size();
        try {
            Intent r3 = C0336.m4441(this.f4699, componentName);
            while (r3 != null) {
                this.f4700.add(size, r3);
                r3 = C0336.m4441(this.f4699, r3.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f4700.iterator();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5474() {
        if (!this.f4700.isEmpty()) {
            ArrayList<Intent> arrayList = this.f4700;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0651.m5456(this.f4699, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f4699.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
