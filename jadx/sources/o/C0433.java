package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C0712;
import o.C0736;

@C0712.Cif(m5830 = "activity")
/* renamed from: o.ıј  reason: contains not printable characters */
public final class C0433 extends C0712<C0434> {

    /* renamed from: ı  reason: contains not printable characters */
    private Context f4017;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Activity f4018;

    /* renamed from: o.ıј$ɩ  reason: contains not printable characters */
    public static final class C0435 implements C0712.C0713 {

        /* renamed from: ɩ  reason: contains not printable characters */
        final int f4021;

        /* renamed from: ι  reason: contains not printable characters */
        final C2818 f4022;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C0593 m4734(C0593 r7, Bundle bundle, C0665 r9, C0712.C0713 r10) {
        Intent intent;
        int intExtra;
        C0434 r72 = (C0434) r7;
        if (r72.f4019 != null) {
            Intent intent2 = new Intent(r72.f4019);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = r72.f4020;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            StringBuilder sb = new StringBuilder("Could not find ");
                            sb.append(group);
                            sb.append(" in ");
                            sb.append(bundle);
                            sb.append(" to fill data pattern ");
                            sb.append(str);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = r10 instanceof C0435;
            if (z) {
                intent2.addFlags(((C0435) r10).f4021);
            }
            if (!(this.f4017 instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (r9 != null && r9.f4743) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f4018;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", r72.f4522);
            if (r9 != null) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", r9.f4740);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", r9.f4745);
            }
            if (z) {
                C2818 r73 = ((C0435) r10).f4022;
                if (r73 != null) {
                    C2944.m5455(this.f4017, intent2, r73.m14742());
                } else {
                    this.f4017.startActivity(intent2);
                }
            } else {
                this.f4017.startActivity(intent2);
            }
            if (r9 == null || this.f4018 == null) {
                return null;
            }
            int i = r9.f4741;
            int i2 = r9.f4739;
            if (i == -1 && i2 == -1) {
                return null;
            }
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            this.f4018.overridePendingTransition(i, i2);
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Destination ");
        sb2.append(r72.f4522);
        sb2.append(" does not have an Intent set.");
        throw new IllegalStateException(sb2.toString());
    }

    public C0433(Context context) {
        this.f4017 = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f4018 = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m4735() {
        Activity activity = this.f4018;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: o.ıј$ǃ  reason: contains not printable characters */
    public static class C0434 extends C0593 {

        /* renamed from: ɩ  reason: contains not printable characters */
        Intent f4019;

        /* renamed from: ι  reason: contains not printable characters */
        String f4020;

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m4737() {
            return false;
        }

        public C0434(C0712<? extends C0434> r1) {
            super((C0712<? extends C0593>) r1);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4736(Context context, AttributeSet attributeSet) {
            super.m5242(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0736.C0737.f4990);
            String string = obtainAttributes.getString(C0736.C0737.f4993);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.f4019 == null) {
                this.f4019 = new Intent();
            }
            this.f4019.setPackage(string);
            String string2 = obtainAttributes.getString(C0736.C0737.f4982);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string2);
                    string2 = sb.toString();
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f4019 == null) {
                    this.f4019 = new Intent();
                }
                this.f4019.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(C0736.C0737.f4978);
            if (this.f4019 == null) {
                this.f4019 = new Intent();
            }
            this.f4019.setAction(string3);
            String string4 = obtainAttributes.getString(C0736.C0737.f4971);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f4019 == null) {
                    this.f4019 = new Intent();
                }
                this.f4019.setData(parse);
            }
            this.f4020 = obtainAttributes.getString(C0736.C0737.f4989);
            obtainAttributes.recycle();
        }

        public final String toString() {
            ComponentName componentName;
            Intent intent = this.f4019;
            String str = null;
            if (intent == null) {
                componentName = null;
            } else {
                componentName = intent.getComponent();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentName != null) {
                sb.append(" class=");
                sb.append(componentName.getClassName());
            } else {
                Intent intent2 = this.f4019;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ C0593 m4733() {
        return new C0434(this);
    }
}
